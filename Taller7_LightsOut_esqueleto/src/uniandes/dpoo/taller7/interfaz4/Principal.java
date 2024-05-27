package uniandes.dpoo.taller7.interfaz4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame{
	
	private Tablero tableroPanel;
    private PanelSuperior panelSuperior;
    //
    private PanelDerecha panelDerecha;
    

	public Principal() {
		setTitle("Juego de LightsOut");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
			
		PanelSuperior panelS = new PanelSuperior();
		PanelInferior panelI = new PanelInferior();
		PanelDerecha panelD =  new PanelDerecha(); 
		tableroPanel = new Tablero(5);
		
		add(panelS, BorderLayout.NORTH);
		add(panelI, BorderLayout.SOUTH);
		add(panelD, BorderLayout.EAST); 
		add(tableroPanel,BorderLayout.CENTER);
		
		//
		panelDerecha.getBotonNuevo().addActionListener(e -> nuevoJuego());
        panelDerecha.getBotonReiniciar().addActionListener(e -> reiniciarJuego());
        panelDerecha.getBotonTop10().addActionListener(e -> mostrarTop10());
        panelDerecha.getBotonCambiarJugador().addActionListener(e -> cambiarJugador());
		
		
	}
	
	///
	
	private void nuevoJuego() {
        String selectedSize = (String) panelSuperior.getComboBoxTamanio().getSelectedItem();
        int size = Integer.parseInt(selectedSize.split("x")[0]);
        String dificultad = panelSuperior.getDificultadSeleccionada();
        
        // Crear un nuevo tablero con el tamaño y la dificultad seleccionados
        tableroPanel = new Tablero(size);
        tableroPanel.setDificultad(dificultad);
        
        // Actualizar el tablero en el panel de juego
        getContentPane().remove(tableroPanel); // Eliminar el tablero anterior
        add(tableroPanel, BorderLayout.CENTER); // Agregar el nuevo tablero
        revalidate(); // Revalidar la interfaz para reflejar los cambios
        repaint(); // Volver a pintar la interfaz
    }
	
		
		
	
	
	
		public static void main(String[] args) {
	        // Crear una instancia de la ventana principal
	        Principal ventana = new Principal();

	        // Hacer visible la ventana
	        ventana.setVisible(true);
	    }	
	}	

	

