package uniandes.dpoo.taller7.interfaz3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.*;

public class Tablero extends JPanel{
	private int Tamanio;
	public Tablero(int Tamanio) {
		this.Tamanio = Tamanio;
		
	}
	public void setTablero(int Tamanio) {
		this.Tamanio = Tamanio;
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		
		int Ancho = this.getWidth();
		int Alto = this.getHeight();
		int anchoCelda = Ancho / Tamanio;
		int altoCelda = Alto / Tamanio;
		
		Color color1 = Color.LIGHT_GRAY;
        Color color2 = Color.DARK_GRAY;

        for (int i = 0; i < Tamanio; i++) {
            for (int j = 0; j < Tamanio; j++) {
                if ((i + j) % 2 == 0) {
                    g2D.setColor(color1);
                } else {
                    g2D.setColor(color2);
                }
                g2D.fillRect(j * anchoCelda, i * altoCelda, anchoCelda, altoCelda);
                g2D.setColor((Color.BLACK));
                g2D.drawRect(j * anchoCelda, i * altoCelda, anchoCelda, altoCelda);
            }
        }
    }
	
}