public class ForLoops {
    

    public int addEvens(int n){
        int sum = 0;
        
        for(int i = 0; i <= n; i+= 2){
            sum+=i;
        }
        return sum;
    }

    public void printSquresBlack(int n){
        for(int i = n; i >= 0; i--){
            int squared = i^2;
            System.out.println(squared + ", "));
        }
    }


    public static void main(String[] args){
        ForLoops f = new ForLoops();

        System.out.println(f.addEvens(8));
        System.out.println(f.addEvens(3));
        System.out.println(f.addEvens(12));
        System.out.println(f.addEvens(7));

        f.printSquaresBack(7);
        // fix squares method
    }
}
