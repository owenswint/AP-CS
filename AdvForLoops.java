public class AdvForLoops {
    
    public void eights(){
        for(int i = 8; i > 0; i-= 2){
            for(int j = (8-i)/2; j>0; j--){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(i);
            }
            for(int j = (8-i)/2; j>0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public void alternate(int h){

        for(int i = 1; i <= h; i++){
            if(i%2 == 0){
                for(int j = i; j> 0; j--){
                    System.out.print(j);
                }
            }
            else{
                for(int j = 1; j<=i; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void isosceles(int h){
        for(int i = 1; i <= h; i++){
            for(int j = h-i; j > 0; j--){
                System.out.print(" ");
            }
            int count = 1;
            for(;count < i; count++){
                System.out.print(count);
            }
            for(;count >= 1; count--){
                System.out.print(count);
            }
            for(int j = h-i; j > 0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void upSideDown(int start, int n){

    }



    public static void main(String[] args){
        AdvForLoops f = new AdvForLoops(); 
        
        f.eights();
        System.out.println();

        f.alternate(6);
        f.alternate(5);
        f.alternate(10);
        f.alternate(3);
        System.out.println();

        f.isosceles(5);
        f.isosceles(3);
        f.isosceles(2);
        f.isosceles(15);// triangle deforms past 10 because of two-digit numbers
        System.out.println();
        
    }
}
