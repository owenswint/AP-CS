public class AtBat{

    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return (aSmile == bSmile);
    }

    public boolean negPos(int p1, int p2, boolean negative){
        if (negative == false){
            return p1*p2 <= 0;
        }
        else{
            return (p1 < 0 && p2 < 0); 
        }

    }


    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        
        if (isAsleep == true) {
            return false;
        }
        
        if (isMom == true) {
            return true;
        }
        return isMorning != true;

    }

    public String setAlarm(int day, boolean onVacation){
        if (onVacation == true){
            if (day == 0 || day == 6){
                return "off";
            }
            else{
                return "10:00";
            }
        }
        else if (day > 0 && day < 6){
                return "7:00";
            }
            else{
                return "10:00";
            }
    
    }

    public boolean onesDigitSame(int n1, int n2, int n3){
        
    }






    public static void main(String[] args){
        AtBat ab = new AtBat();
        System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble(false, false));
        System.out.println(ab.chimpTrouble(true, false));
        System.out.println(ab.chimpTrouble(false, true));
        System.out.println();

        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos(-1, 1, false));
        System.out.println(ab.negPos(1, 1, false));
        System.out.println(ab.negPos(-1, -1, false));
        System.out.println(ab.negPos(-4, -5, true));
        System.out.println(ab.negPos(-4, 5, true));
        System.out.println(ab.negPos(4, 5, true));
        System.out.println(ab.negPos(4, -5, true));
        System.out.println();

        System.out.println(ab.pickUpPhone(false, false, true));
        System.out.println(ab.pickUpPhone(true, true, true));
        System.out.println(ab.pickUpPhone(true, true, false));
        System.out.println(ab.pickUpPhone(false, true, false));
        System.out.println(ab.pickUpPhone(true, false, false));
        System.out.println(ab.pickUpPhone(false, false, false));
        System.out.println();

        System.out.println(ab.setAlarm(1, false));
        System.out.println(ab.setAlarm(5, false));
        System.out.println(ab.setAlarm(0, false));
        System.out.println(ab.setAlarm(2, true));
        System.out.println(ab.setAlarm(4, true));
        System.out.println(ab.setAlarm(6, true));
        System.out.println();




    }


}

