public class Factorial {
     
    public long calcFactorial(int n){
        long product = 1;
        while (n > 1){
            product *= n;
            n-= 1;
        }
        return product;

    }

     public double calcE(){
        double e = 1;
        double olde = 0; 
        int count = 1;
        while(e-olde > .001){
            olde = e;
            e += 1.0/(calcFactorial(count));
            count++;
        }
        return e;
        
    }

    public double calcEX(int x){
        double ex = 1;
        double oldex = 0; 
        int count = 1;
        while(ex-oldex > .001){
            oldex = ex;
            ex += (Math.pow(x,count))/(calcFactorial(count));
            count++;
        }
        return ex;
    }

     



    public static void main(String[] args){
    Factorial f = new Factorial();
    for(int i = 1; i <= 20; i++){
        System.out.println(f.calcFactorial(i));
    }
    System.out.println();
    
    System.out.println("e is %2.3f \n", f.calcE());
    System.out.println();

    for(int i = 1; i<= 5; i++){
        System.out.println(f.calcEX(i));
    }
    
   
  }



}
