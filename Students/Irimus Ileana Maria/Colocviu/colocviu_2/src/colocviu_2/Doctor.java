package colocviu_2;

public class Doctor extends Angajat {

	public Doctor(String nume, int id, String dataAngajarii, double bonusSalariu) {
		super(nume, id, dataAngajarii, bonusSalariu);
	}

	public void consultatie(Pacient p) {
		if (p.getTip() == 0)
			System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " in varsta de " + p.getVarsta()
					+ ", de sex " + p.getSex() + " sufera de o boala cronica.");
		else
			System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " in varsta de " + p.getVarsta()
					+ ", de sex " + p.getSex() + " sufera de o boala acuta.");
	}

	@Override
	public void adaugaMedicament() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminaMedicament() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verificaStoc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificaVanzare() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modificaStoc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void proceseazaReteta() {
		// TODO Auto-generated method stub

	}

}