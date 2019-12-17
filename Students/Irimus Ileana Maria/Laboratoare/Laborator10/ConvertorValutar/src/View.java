import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

	public static JFrame mainFrame = new JFrame("Converter valutar");
	public static JPanel controlPanel = new JPanel();
	public static String[] valuta = { "RON", "EUR", "USD" };
	public static JComboBox panel1 = new JComboBox(valuta);
	public static JComboBox panel2 = new JComboBox(valuta);
	public static JButton button = new JButton("=");
	public static JTextField texta = new JTextField();
	public static JTextField textb = new JTextField();
	public static JLabel eticheta = new JLabel("suma:");

	public static void main(String[] args) {
		mainFrame.add(controlPanel);
		texta.setPreferredSize(new Dimension(50, 24));
		textb.setPreferredSize(new Dimension(50, 24));
		button.addActionListener(new Controller());

		mainFrame.setSize(600, 120);
		controlPanel.add(eticheta);
		controlPanel.add(texta);
		controlPanel.add(panel1);
		controlPanel.add(button);
		controlPanel.add(textb);
		controlPanel.add(panel2);
		mainFrame.setVisible(true);
	}
}