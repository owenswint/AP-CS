public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    //add code here
            result = (int) (Math.random()*(max-min)) + min;
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    // add code here   
        int player = spin(1,10);
        int computer = spin(2,8);
        if (player > computer){
            System.out.println("You win! " + (player - computer) + " points");
        }
        else if (computer > player){
            System.out.println("You lose. " + (player - computer) + " points");
        }
        else if (computer == player){
            player = spin(1,10);
            computer = spin(2,8);
            if (player > computer){
                System.out.println("You win! 1 points");
            }
            else if (computer > player){
                System.out.println("You lose. -1 points");
            }
            else if (computer == player){
                System.out.println("Tie. 0 points");
            }
        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();

     	      }
 	  }

 }

