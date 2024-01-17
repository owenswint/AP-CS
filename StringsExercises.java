public class StringsExercises {

    public String scroll(String word) {
        String f = "";
        f += ((word.substring(1)) + (word.charAt(0)));
        return f;
    }

    public String convertName(String name){
        String f = new String();
        name  += (" ");
        int space = name.indexOf(",");
        f += (name.substring(space+1).trim() + " "+ name.substring(0, space).trim());
        return f;

    }

    public String negative(String s){   
        String f = s;
        f = f.replace("1","*");
        f = f.replace("0","1");
        f = f.replace("*","0");

        return f;

    }

    public String dateString(String date){
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6);
        return (day + "-"+month+"-"+year);
    }

    public String dateString2(String date){
        int slash = date.indexOf("/");
        int secondSlash = date.lastIndexOf("/");
        String month = date.substring(0,slash);
        if (month.length() < 2){
            month = ("0" + month);
        }
        String day = date.substring(slash+1,secondSlash);
        if (day.length() < 2){
            day = ("0" + day);
        }
        String year = date.substring(secondSlash+1);

        return (day + "-" +month+ "-" + year);
    }

    public Boolean startsWith(String s, String prefix){
        int num = s.indexOf(prefix);
        if(num == 0){
            return true;
        }
        return false;

    }



    public static void main(String[] args) {
        StringsExercises se = new StringsExercises();
        System.out.println(se.scroll("Hello World"));
        System.out.println(se.scroll("happy"));
        System.out.println(se.scroll("h"));
        System.out.println();

        System.out.println(se.convertName(" Reubenstein, Lori Renee  	"));
        System.out.println(se.convertName("Biden,Joe"));
        System.out.println(se.convertName("the Clown, Bozo"));
        System.out.println();

        System.out.println(se.negative("0010111001"));
        System.out.println(se.negative("11111111"));

        System.out.println("04/20/2014 becomes " + se.dateString("04/20/2014"));
        System.out.println("04/20/2014 becomes " + se.dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + se.dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + se.dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + se.dateString2("4/2/2024"));
    

    }

}
