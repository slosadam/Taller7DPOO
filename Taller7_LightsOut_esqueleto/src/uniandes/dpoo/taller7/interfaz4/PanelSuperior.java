package uniandes.dpoo.taller7.interfaz4;
import javax.swing.*;
import java.awt.*;


public class PanelSuperior extends JPanel{
	
	private static JComboBox<String>comboBoxTamanio;
	///
	private JRadioButton RadioFacil;
    private JRadioButton RadioMedio;
    private JRadioButton RadioDificil;
///

	public PanelSuperior(){
		setLayout(new FlowLayout());
		setBackground(Color.PINK);

		JLabel lTamanio = new JLabel("Tamaño");
		JComboBox<String> comboBoxTamanio = new JComboBox<>(new String[]{"5x5"});
		comboBoxTamanio = new JComboBox<>(new String[]{"5x5", "6x6", "7x7", "8x8", "9x9", "10x10"});
		JLabel lDificultad = new JLabel("Dificultad");
        JRadioButton RadioFacil = new JRadioButton("Fácil");
        JRadioButton RadioMedio = new JRadioButton("Medio");
        JRadioButton RadioDificil = new JRadioButton("Difícil");

        ButtonGroup GNivel = new ButtonGroup();
        GNivel.add(RadioFacil);
        GNivel.add(RadioMedio);
        GNivel.add(RadioDificil);
       
        add(lTamanio);
        add(comboBoxTamanio);
        add(lDificultad);
        add(RadioFacil);
        add(RadioMedio);
        add(RadioDificil);
	}

	public JComboBox<String> getComboBoxTamanio() {
        return comboBoxTamanio;
      
	}
	///
	public String getDificultadSeleccionada() {
		if (RadioFacil.isSelected()) {
            return "Fácil";
        } else if (RadioMedio.isSelected()) {
            return "Medio";
        } else if (RadioDificil.isSelected()) {
            return "Difícil";
        }
        return "Fácil";
    }
}