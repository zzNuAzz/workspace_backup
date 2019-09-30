public class Main {
	public static void main(String args[]) {

		Fraction f1 = new Fraction(-1, 2);
		Fraction f2 = new Fraction(4, 0);
		System.out.println(f2.getNumerator() + "/" + f2.getDenominator());
		System.out.println(f1.add(f2).getNumerator() + "/" + f1.add(f2).getDenominator());
		System.out.println(f1.subtract(f2).getNumerator() + "/" + f1.subtract(f2).getDenominator());
		System.out.println(f1.multiple(f2).getNumerator() + "/" + f1.multiple(f2).getDenominator());
		System.out.println(f1.divide(f2).getNumerator() + "/" + f1.divide(f2).getDenominator());
		System.out.println(f1.equals(f2));
	}
}	