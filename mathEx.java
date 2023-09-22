public class mathEx{
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(306));
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));

    }
    public static int swap(int initial){
        int hundreds = initial/100*100;
        int tens = initial%100/10;
        int ones = initial%100%10*10;
        int answer = ones+tens+hundreds;
        return answer;
        
    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int minTotal = (depHour - curHour)*60;
        minTotal += depMin - curMin;
        int hour = minTotal/60;
        minTotal %= 60;
        System.out.println(hour+" hours and "+minTotal+" minutes");
    }
    public static int dayOfWeek(int day1, int date){
        int dayTotal = day1+date;
        int dayOfWeek = dayTotal/6;
        return dayOfWeek;
    }

  

   
    
}