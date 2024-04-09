public class Poem {
    private int numLines;
    
    
    public Poem(int n){
        numLines = n;
    }

    public int getNumlines(){ return numLines;}
    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public void rhythm(int[] s){
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i]; j++){
                System.out.print("ta");
                if(j < s[i]-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
