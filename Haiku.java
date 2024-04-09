public class Haiku extends Poem {
    private int syllables;

    public Haiku(){
        super(3);

    }


    public int getSyllables(int k){
        if(k == 1){
            return 7;
        }
        else{
            return 5;
        }
    }
    
    public void printRhythm(){
        
        super.rhythm(new int []{5, 7, 5});
    }

}
