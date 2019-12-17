
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Double s1 = new Double(View.texta.getText());

		String a = (String) View.panel1.getSelectedItem();
		String b = (String) View.panel2.getSelectedItem();

		if (a.equals(b)) {
			String suma = View.texta.getText();
			View.textb.setText(suma);
		}

		if (a == "RON") {
			if (b == "EUR") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) / 4.7794;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			} else if (b == "USD") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) / 4.3124;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			}

		}

		if (a == "EUR") {
			if (b == "RON") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) * 4.7794;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			} else if (b == "USD") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) * 1.1089;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			}
		}

		if (a == "USD") {
			if (b == "RON") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) * 4.3124;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			} else if (b == "EUR") {
				String x = View.texta.getText();
				Double y = Double.valueOf(x) * 0.9;
				y = Double.parseDouble(String.format("%.4f", y));
				View.textb.setText(y.toString());
			}
		}
	}
}