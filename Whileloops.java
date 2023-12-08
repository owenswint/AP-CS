public class Whileloops{

    public int addOdds(int n){
        int cnt = 1;
        int sum = 0;
        while (cnt <= n){
            sum += cnt;
            cnt += 2;
            
        }
        return sum;
    }

     public int sumDigits(int n){
        int place = 10;
        int sum = 0;
        while (n>=1){
            sum += n%10;
            n/= 10;
        }
        return sum;
     }

     public int howManyYears(double startpop, double endpop){
        int years = 0;
        while (startpop <= endpop){
            startpop*=1.0113;
            years+=1;
        }
        return years;
     }

     public void printSum(int n){
        int sum = 0;
        int printValue = 1;
        while (n>= 1){
            sum+=n;
            n--;
            if (printValue != 1){
                System.out.print("+ ");
            }
            System.out.print(printValue + " ");
            printValue++;
            
        }
        System.out.println("= "+sum);
     }

     public boolean isPerfectSquare(int n){
        int sum = 0;
        int count = 1;

        while (sum < n){
        sum += count;
        count += 2;
        }

       return sum == n;

        
     }


  public static void main(String[] args)
  {
    Whileloops wl = new Whileloops();
    System.out.println(wl.addOdds(9));
    System.out.println(wl.addOdds(0));
    System.out.println(wl.addOdds(1));
    System.out.println(wl.addOdds(21));
    System.out.println(wl.addOdds(16));
    System.out.println();

    System.out.println(wl.sumDigits(183));
    System.out.println(wl.sumDigits(887651324));
    System.out.println(wl.sumDigits(3));
    System.out.println(wl.sumDigits(16));
    System.out.println(wl.sumDigits(675));
    System.out.println();

    System.out.println(wl.howManyYears(111.2, 120));
    System.out.println(wl.howManyYears(111.2, 150));
    System.out.println();

    wl.printSum(6);
    wl.printSum(8);
    wl.printSum(1);
    wl.printSum(15);
    System.out.println();
     
    System.out.println(wl.isPerfectSquare(25));
    System.out.println(wl.isPerfectSquare(49));
    System.out.println(wl.isPerfectSquare(43));
    System.out.println(wl.isPerfectSquare(17));
    System.out.println();

  }
}