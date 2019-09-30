
public class Fraction {
    /**
     * declare attributes here
     */
    private int numerator;
    private int denominator;
    
    /**
     * declare getter, setter here
     */
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }

    /**
     * declare constructor here
     */
    Fraction(int numerator, int denominator) {
        this.numerator = 1;
        this.denominator = 1;

        this.numerator = numerator;
        if(denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * methods
     */
    //reduce
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
        // return;
    }

    public Fraction reduce() {
        if(numerator == 0 || denominator == 0) return this;
        int ucln = gcd(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
        return this;
    }

    // add
    public Fraction add(Fraction other) {

        Fraction sum = new Fraction(this.numerator * other.getDenominator() + 
            other.getNumerator() * this.denominator, this.denominator * other.getDenominator());
        return sum.reduce();
    }

    // subtract
    public Fraction subtract(Fraction other) {
        Fraction sub = new Fraction(this.numerator * other.getDenominator() - 
            other.getNumerator() * this.denominator, this.denominator * other.getDenominator());
        return sub.reduce();   
    }

    // multiple
    public Fraction multiply(Fraction other) {
        Fraction multy = new Fraction(this.numerator * other.getNumerator(), 
                                this.denominator * other.getDenominator());
        return multy.reduce(); 
    }

    // divide
    public Fraction divide(Fraction other) {
        if(other.getNumerator() == 0) return this;
        Fraction div = new Fraction(this.numerator * other.getDenominator(), 
                                    other.getNumerator() * this.denominator);
        return div.reduce();
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if(! (obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.numerator * other.getDenominator() == other.getNumerator() * this.denominator;
    }
}
