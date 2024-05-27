package uniandes.dpoo.taller7.interfaz3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Principal extends JFrame{
	
	private Tablero tableroPanel;
    private PanelSuperior panelSuperior;
    

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
		
		//PanelSuperior.getComboBoxTamanio().addActionListener(new ActionListener(){
		//@Override	
		//public void actionPerformed(ActionEvent e) {
		//	String selectedSize = panelSuperior.getComboBoxTamanio().getSelectedItem();
	}
	
	public static void main(String[] args){
		Principal ventana = new Principal();
		ventana.setVisible(true);
	}
}