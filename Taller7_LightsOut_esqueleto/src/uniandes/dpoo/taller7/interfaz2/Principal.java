package uniandes.dpoo.taller7.interfaz2;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Principal extends JFrame{


	public Principal() {
		setTitle("Juego de LightsOut");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		PanelSuperior panelS = new PanelSuperior();
		PanelInferior panelI = new PanelInferior();
		PanelDerecha panelD =  new PanelDerecha(); 
		
		add(panelS, BorderLayout.NORTH);
		add(panelI, BorderLayout.SOUTH);
		add(panelD, BorderLayout.EAST); 
	}
	
	
	public static void main(String args[]){
		Principal ventana = new Principal();
		ventana.setVisible(true);
		
	}
	
	
	
	
}
