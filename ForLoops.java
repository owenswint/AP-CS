public class ForLoops {
    

    public int addEvens(int n){
        int sum = 0;
        
        for(int i = 0; i <= n; i+= 2){
            sum+=i;
        }
        return sum;
    }

    public void printSquaresBack(int n){
        for(int i = n; i > 0; i--){
            int squared = i*i;
            if (i>1){
                System.out.print(squared + ", ");
            }
            else{
                System.out.print(squared);
            }
        }
        System.out.println();
    }


    public void sillyNumbers(){
        
        for(int t = 1; t<= 3; t++){
            for(int i = 0; i <= 9; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(i);
            }
        }
        System.out.println();
        }
    }

    public void sillyNumbers2(){
        
        for(int t = 1; t<= 3; t++){
            for(int i = 9; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
        }
        System.out.println();
        }
    }


    public void dollarsAndStars(){
        int dollarnum = 7;
        int staredge = 0;
        int starmid = 14;

        for(int i = 1; i<= 7; i++){

            for(int a = 1; a <= staredge; a++){
                System.out.print("*");
            }
            for(int a = 1; a <= dollarnum; a++){
                System.out.print("$");
            }
            for(int a = 1; a <= starmid; a++){
                System.out.print("*");
            }
            for(int a = 1; a <= dollarnum; a++){
                System.out.print("$");
            }
            for(int a = 1; a <= staredge; a++){
                System.out.print("*");
            }
            
            dollarnum --;
            staredge += 2;
            starmid -= 2;
            System.out.println();
        } 
    }

    public static void main(String[] args){
        ForLoops f = new ForLoops();

        System.out.println(f.addEvens(8));
        System.out.println(f.addEvens(3));
        System.out.println(f.addEvens(12));
        System.out.println(f.addEvens(103));
        System.out.println();

        f.printSquaresBack(8);
        f.printSquaresBack(10);
        f.printSquaresBack(2);
        f.printSquaresBack(7);
        System.out.println();

        f.sillyNumbers();
        System.out.println();

        f.sillyNumbers2();
        System.out.println();

        f.dollarsAndStars();
        System.out.println();        


        
    }
}
