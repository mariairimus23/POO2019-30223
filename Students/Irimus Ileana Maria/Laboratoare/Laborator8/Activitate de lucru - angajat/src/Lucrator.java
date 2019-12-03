
public class Lucrator {

	private String nume;
	private CalendarLucru calendarLucru;

	public Lucrator(String nume) {
		this.nume = nume;
		this.calendarLucru = new CalendarLucru();
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return this.nume;
	}

	public void setCalendarLucru(CalendarLucru calendarLucru) {
		this.calendarLucru = calendarLucru;
	}

	public CalendarLucru getCalendarLucru() {
		return this.calendarLucru;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {

		boolean ziValida = false;
		boolean ziLucratoare = false;

		for (int i = 0; i < 7; i++) {
			if (this.calendarLucru.getZile()[i].getNume().equals(zi)) {
				ziValida = true;
				if (this.calendarLucru.getZile()[i].esteLucratoare() == true) {
					System.out.println("Lucratorul " + this.getNume() + " lucreaza " + zi);
					ziLucratoare = true;
				}
			}

			if (ziValida == false) {
				System.out.println(zi + " nu este o zi a saptamanii");
			}

			if (ziLucratoare == false) {
				throw new ExceptieZiNelucratoare();
			}
		}
	}
}