public class StringsExercises {

    public String scroll(String word) {
        String f = new String();
        f += ((word.substring(1)) + (word.charAt(0)));
        return f;
    }

    public String convertName(String name){
        String f = new String();
        name  += (" ");
        int space = name.indexOf(" ");
        f += (name.substring(space+1) + name.substring(0, space-1));
        return f;

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

        

    }

}
