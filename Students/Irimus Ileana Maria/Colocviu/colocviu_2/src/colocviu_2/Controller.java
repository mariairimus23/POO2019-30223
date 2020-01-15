package colocviu_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Controller extends JFrame implements ActionListener {

	public Controller() {
		JButton button = new JButton("Afiseaza");
		setLayout(new FlowLayout());
		button.setBounds(200, 200, 200, 200);
		button.addActionListener(this);
		add(button);
	}

	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();
		controller.setSize(500, 500);
		controller.setVisible(true);

		Farmacia farmacia = new Farmacia("Catena", "Bd. Bucuresti 13A", "0362555679", "www.catena.ro");
		Doctor doctor = new Doctor("Pop Constantina", 1, "15.04.2015", 300.0);
		Pacient pacient1 = new Pacient("Vladau", "Marius", 150, "M", 7);
		Pacient pacient2 = new Pacient("Rad", "Andreea", 24, "F", 2);
		Pacient pacient3 = new Pacient("Vornici", "Anca", 17, "F", 1);
		Pacient pacient4 = new Pacient("Bruma", "Tiberiu", 56, "M", 10);

		Map<String, Integer> medicamente = new HashMap<String, Integer>();
		medicamente.put("Nurofen", new Integer(100));
		medicamente.put("Paracetamol", new Integer(200));
		medicamente.put("Ibuprofen", new Integer(300));

		Map<Angajat, Integer> angajat = new HashMap<Angajat, Integer>();

//		try
//		 {
//		 (pacient1).citireDate();
//		 }
//		 catch (IncompleteDataException e)
//		 {
//		//System.out.println("Exceptie: " + e.getMessage());
//			e.printStackTrace();
//		 }

		try {
			(pacient1).varstaIncorecta();
		} catch (WrongAgeFormatException e) {
			// System.out.println("Exceptie: " + e.getMessage());
			e.printStackTrace();
		}

		try {
			(pacient2).varstaIncorecta();
		} catch (WrongAgeFormatException e) {
			// System.out.println("Exceptie: " + e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}