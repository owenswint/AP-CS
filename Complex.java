public class Complex{
    private double a; 
    private double b;

    public Complex(double a, double b){
        this.a = a; 
        this.b = b; 
    }


    public Complex(double a){
        this(a, 0.0); 
    }

    public String toString(){
        return a + " + " + b + "i";

    }

    public double abs(){
        double x = Math.sqrt((a*a) + (b*b));
        return x;
    }

    public Complex add(Complex other){
        Complex result = new Complex(this.a+other.a, this.b+other.b);
        return result; 
    }

    public Complex add(Double n){
        Complex result = new Complex(this.a+n, this.b);
        return result; 
    }

    public Complex multiply(Complex other){
        double sumA = 0; 
        double sumB = 0;
        sumA += this.a*other.a;
        sumA-= this.b*other.b;

        sumB += this.a*other.b;
        sumB+= this.b*other.a;

        Complex result = new Complex(sumA, sumB);
        return result;

    }

    public Complex multiply(Double n){
        double sumA = 0; 
        sumA += this.a*n;

        Complex result = new Complex(sumA,this.b);
        return result;

    }


    public static void main(String[] args) {
        Complex c1 = new Complex(1.0);
        Complex c2 = new Complex(0.0, 2.0);
        Complex c3 = new Complex(-4.4, 2.0);
        Complex c4 = new Complex(7.0, -3.6);
        Complex c5 = new Complex(-2.0, 4.0);
        Complex c6 = new Complex(1.5, -5.0);

        
        System.out.println(c1.add(c2));
        System.out.println(c3.add(c4));
        System.out.println(c5.add(c6));
        System.out.println(c1.add(5.0));
        System.out.println(c3.add(2.5));
        System.out.println(c5.add(7.0));
        System.out.println("\n");

        System.out.println(c1.multiply(c2));
        System.out.println(c3.multiply(c4));
        System.out.println(c5.multiply(c6));
        System.out.println(c1.multiply(2.0));
        System.out.println(c3.multiply(1.5));
        System.out.println(c5.multiply(6.0));
        System.out.println("\n");

        System.out.println(c1.abs());
        System.out.println(c3.abs());
        System.out.println(c5.abs());
        System.out.println("\n");







       
    }
}

    

    


