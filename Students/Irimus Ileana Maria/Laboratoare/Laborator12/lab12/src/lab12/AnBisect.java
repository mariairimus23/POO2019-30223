package lab12;

public class AnBisect {
	public boolean esteAnBisect(int x) {
		if (x % 100 == 0 && x % 400 != 0)
			return false;
		return x % 4 == 0;
	}
}