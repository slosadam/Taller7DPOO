package uniandes.dpoo.taller7.interfaz4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDerecha extends JPanel {
	
	private JButton BotonNuevo;
    private JButton botonReiniciar;
    private JButton botonTop10;
    private JButton botonCambiarJugador;
	
	public PanelDerecha() {
		setLayout(new GridLayout(4,1,5,5)); 
		setBackground(Color.DARK_GRAY);
		
		JButton BotonNuevo = new JButton ("Nuevo");
		JButton BotonReiniciar = new JButton("Reiniciar"); 
		JButton BotonTop = new JButton("Top 10");
		JButton BotonCambiar = new JButton("Cambiar Jugador");
		
		 add(BotonNuevo);
	     add(BotonReiniciar);
	     add(BotonTop);
	     add(BotonCambiar);
	     
	
///	
	BotonNuevo.addActionListener(new ActionListener() {
		 @Override
        public void actionPerformed(ActionEvent e) {
            // Acciones al hacer clic en el botón "Nuevo"
        }
    });

    BotonReiniciar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Acciones al hacer clic en el botón "Reiniciar"
        }
    });

    BotonTop.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Acciones al hacer clic en el botón "Top 10"
        }
    });

    BotonCambiar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Acciones al hacer clic en el botón "Cambiar Jugador"
        }
    });
}


///	
	
	     public JButton getBotonNuevo() {
	         return BotonNuevo;
	     }
	     
///
	     public JButton getBotonReiniciar() {
	         return botonReiniciar;
	     }

	     public JButton getBotonTop10() {
	         return botonTop10;
	     }

	     public JButton getBotonCambiarJugador() {
	         return botonCambiarJugador;
	     }
///	     
}

