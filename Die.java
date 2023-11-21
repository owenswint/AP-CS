public class Die {
   

    public void roll(){
        int result = (int) (Math.random()*(6) + 1);
        System.out.println(result);
    }

    int numDots;
    public int getNumDots(){
        return numDots;
    }

    public static void main(String[] args) {
         	Die die = new Die();
         	die.roll();
  	  	System.out.println(die.getNumDots());
  	}
}
