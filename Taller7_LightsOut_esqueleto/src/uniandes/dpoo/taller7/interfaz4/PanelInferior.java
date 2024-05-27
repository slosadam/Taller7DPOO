package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;


public class PanelInferior extends JPanel{
	private JTextField campoJugadas;
	private JTextField campoJugador;
	
	public PanelInferior() {
		setLayout(new FlowLayout());
		setBackground(Color.PINK);

		JLabel LJugadas = new JLabel("Jugadas:");
        JTextField TextoJugadas = new JTextField("0", 5);
        JLabel LJugador = new JLabel("Jugador:");
        JTextField TextoJugador = new JTextField(10);
        
        //campoJugadas.setEditable(false);
        //campoJugador.setEditable(false);

        add(LJugadas);
        add(TextoJugadas);
        add(LJugador);
        add(TextoJugador);
   	
		
	}
	
}
