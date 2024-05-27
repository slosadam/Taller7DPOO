package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;


public class PanelInferior extends JPanel{
	
	public PanelInferior() {
		setLayout(new FlowLayout());
		
		JLabel LJugadas = new JLabel("Jugadas:");
        JTextField TextoJugadas = new JTextField("0", 5);
        JLabel LJugador = new JLabel("Jugador:");
        JTextField TextoJugador = new JTextField(10);

        add(LJugadas);
        add(TextoJugadas);
        add(LJugador);
        add(TextoJugador);
   	
		
	}

}
