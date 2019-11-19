
public class Demo {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();

		Client client1 = new Client(100, "27.09.2013", "29.09.2013");
		Client client2 = new Client(203, "25.11.2013", "29.11.2013");

		Angajat angajat1 = new Angajat(20, "3.05.2006");
		Angajat angajat2 = new Angajat(33, "5.07.2015");

		hotel.adaugaAngajati(angajat1);
		hotel.adaugaAngajati(angajat2);
		hotel.adaugaClienti(client1);
		hotel.adaugaClienti(client2);
	}
}
