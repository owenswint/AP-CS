public class Limerick extends Poem {
    private int syllables;

    public Limerick(){
        super(5);
    }

    public int getSyllables(int k){
        if(k == 2 || k == 3){
            return 6;
        }
        else{
            return 9;
        }
    }
    
    public void printRhythm(){
        super.rhythm(new int []{9, 9, 6, 6, 9});
    }
}
