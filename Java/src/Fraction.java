public class Fraction {

    private int denomenator;
    private int numerator;

    public Fraction(int numerator,int denomenator)throws IllegalArgumentException{
        if(denomenator == 0){
            throw new IllegalArgumentException();
        }
        if(denomenator<0){
            denomenator = -(denomenator);
            numerator = -(numerator);
        }
        this.denomenator = denomenator;
        this.numerator = numerator;

    }

    public Fraction(int numerator){
        denomenator = 1;
        this.numerator = numerator;
    }

    public Fraction(){
        denomenator = 1;
        numerator = 0;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenomenator(){
        return denomenator;
    }

    public String toString(){
        return numerator+"/"+denomenator;
    }

    public double toDouble(){
        return numerator/denomenator;
    }

    public Fraction add(Fraction other){
        Fraction result = new Fraction();
        result.numerator =  this.numerator + other.numerator;
        result.denomenator = this.denomenator + other.denomenator;
        return result;
    }

    public Fraction subtract(Fraction other){
        Fraction result = new Fraction();
        result.numerator =  this.numerator - other.numerator;
        result.denomenator = this.denomenator - other.denomenator;
        return result;
    }

    public Fraction multiply(Fraction other){
        Fraction result = new Fraction();
        result.numerator =  this.numerator * other.numerator;
        result.denomenator = this.denomenator * other.denomenator;
        return result;
    }

    public Fraction division(Fraction other){
        Fraction result = new Fraction();
        result.numerator =  this.numerator/other.numerator;
        result.denomenator = this.denomenator/other.denomenator;
        return result;
    }

//    @Override
//
//public boolean equals(Object obj) {
//        Fraction fraction = new Fraction();
//        if(!obj.equals(fraction)){
//
//        }
//
//    }

    public void toLowestTerms(){
        int a = numerator,b = denomenator;
        while(a!=0 && b!=0){
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        numerator = numerator/a;
        denomenator=denomenator/a;
    }

    public static int gcd(int num,int den){
        int a = num,b = den;
        while(a!=0 && b!=0){
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        return a;

    }
}
















