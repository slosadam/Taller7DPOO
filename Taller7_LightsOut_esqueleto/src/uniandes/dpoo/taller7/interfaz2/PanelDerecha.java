package uniandes.dpoo.taller7.interfaz2;
import javax.swing.*;
import java.awt.*;

public class PanelDerecha extends JPanel {
	public PanelDerecha() {
		setLayout(new GridLayout(4,1,5,5)); 
		JButton BotonNuevo = new JButton ("Nuevo");
		JButton BotonReiniciar = new JButton("Reiniciar"); 
		JButton BotonTop = new JButton("Top 10");
		JButton BotonCambiar = new JButton("Cambiar Jugador");
		
		 add(BotonNuevo);
	     add(BotonReiniciar);
	     add(BotonTop);
	     add(BotonCambiar);
	}

}
