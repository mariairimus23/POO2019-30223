
public class Controller {

	public static void main(String[] args) throws CloneNotSupportedException {

		Masina masina = new Masina("Ford", "negru");
		Student studentToBeCloned = new Student("Miron", "Anca", masina);

		Student shallowStudent = studentToBeCloned.shallowCopy();
		Student deepStudent = studentToBeCloned.deepCopy();

		System.out.println("Datele studentului copiat: " + studentToBeCloned.toString());
		System.out.println("Shallow copy: " + shallowStudent.toString());
		System.out.println("Deep copy: " + deepStudent.toString());

		shallowStudent.revopsesteMasina("magenta");
		deepStudent.revopsesteMasina("gri");

		System.out.println("Shallow copy dupa vopsirea masinii: " + shallowStudent.toString());
		System.out.println("Deep copy dupa vopsirea masinii: " + deepStudent.toString());
	}
}