
public class CalendarLucru {

	private Zi[] zile = { new Zi("Luni", true), new Zi("Marti", true), new Zi("Miercuri", true), new Zi("Joi", true),
			new Zi("Vineri", true), new Zi("Sambata", false), new Zi("Duminica", false) };

	public CalendarLucru() {
	}
	
	public void setZile(Zi[] zile) {
		this.zile = zile;
	}

	public Zi[] getZile() {
		return this.zile;
	}

}