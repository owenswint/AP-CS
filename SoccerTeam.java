public class SoccerTeam{
    private int wins;
    private int ties;
    private int losses;
    public static int gamesPlayed = 0;
    public static int goalsScored= 0;

    public SoccerTeam(int wins, int ties, int losses){
        this.wins = wins; 
        this.ties = ties;
        this.losses = losses; 
    }
     
    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesPlayed ++;
        if(myScore == otherScore){
            this.ties ++;
            other.ties ++;
        }
        if(myScore >= otherScore){
            this.wins++;
            other.losses++;
        }
        if(myScore <= otherScore){
            this.losses++;
            other.wins++;
        }
    }

    public static void startTournament(){
        gamesPlayed = 0;
        goalsScored = 0;
    }

    public static int getTotalGamesPlayed(){
        return gamesPlayed;
    }

    public static int getTotalGoalsScored(){
        return goalsScored;
    }

    public int getPoints(){
        return (this.wins*3) + this.ties;
    }

    public void reset(){
        this.wins = 0;
        this.ties = 0;
        this.losses = 0;
    }
    
    public static void main(String[] args) {
        SoccerTeam Billerica = new SoccerTeam(3, 2, 1);
        SoccerTeam Chelmsford = new SoccerTeam(0, 2, 5);
        SoccerTeam Burlington = new SoccerTeam(3, 0, 2);
        SoccerTeam Andover = new SoccerTeam(5, 2, 0);



}