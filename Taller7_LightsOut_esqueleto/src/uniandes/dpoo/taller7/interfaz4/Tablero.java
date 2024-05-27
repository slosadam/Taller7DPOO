package uniandes.dpoo.taller7.interfaz4;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tablero extends JPanel{
	private int Tamanio;
	private String dificultad;
	
	
	public Tablero(int Tamanio) {
		this.Tamanio = Tamanio;
		this.dificultad = "Facil";
		addMouseListener((MouseListener) this);
		
	}
	
	public void setTamanio(int Tamanio) {
		this.Tamanio = Tamanio;
		repaint();
	}
	
	public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		
		int Ancho = this.getWidth();
		int Alto = this.getHeight();
		int anchoCelda = Ancho / Tamanio;
		int altoCelda = Alto / Tamanio;
		
		Color color1 = Color.YELLOW;
        Color color2 = Color.pink;

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
	
	public void mouseClicked(MouseEvent e) {
        // Acciones al hacer clic en el tablero
    }

    public void mousePressed(MouseEvent e) {}

    
    public void mouseReleased(MouseEvent e) {}

   
    public void mouseEntered(MouseEvent e) {}

    
    public void mouseExited(MouseEvent e) {}
	
	
	
}