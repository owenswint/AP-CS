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
        goalsScored += myScore;
        goalsScored += otherScore;
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
         


        // Tournament 1

        startTournament();
        Billerica.played(Chelmsford, 5, 2); 
        Billerica.played(Burlington, 2, 2); 
        Andover.played(Chelmsford, 1, 4); 
        Burlington.played(Andover, 2, 1); 

        System.out.println("Tournament 1");
        System.out.println("Billerica: " + Billerica.getPoints() + " points");
        System.out.println("Chelmsford: " + Chelmsford.getPoints() + " points");
        System.out.println("Burlington: " + Burlington.getPoints() + " points");
        System.out.println("Andover: " + Andover.getPoints() + " points");
        System.out.println("Total Games Played: "+ SoccerTeam.getTotalGamesPlayed());
        System.out.println("Total Goals Scored: "+ SoccerTeam.getTotalGoalsScored());
        System.out.println();

        Billerica.reset();
        Burlington.reset();
        Chelmsford.reset();
        Andover.reset();


        // Tournament 2

        startTournament();
        Andover.played(Chelmsford, 1, 6); 
        Billerica.played(Burlington, 5, 3); 
        Andover.played(Chelmsford, 1, 0); 
        Burlington.played(Billerica, 3, 3); 

        System.out.println("Tournament 2");
        System.out.println("Billerica: " + Billerica.getPoints() + " points");
        System.out.println("Chelmsford: " + Chelmsford.getPoints() + " points");
        System.out.println("Burlington: " + Burlington.getPoints() + " points");
        System.out.println("Andover: " + Andover.getPoints() + " points");
        System.out.println("Total Games Played: "+ SoccerTeam.getTotalGamesPlayed());
        System.out.println("Total Goals Scored: "+ SoccerTeam.getTotalGoalsScored());

        Billerica.reset();
        Burlington.reset();
        Chelmsford.reset();
        Andover.reset();

        
    }



}