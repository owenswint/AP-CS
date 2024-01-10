public class StringsExercises {

    public String scroll(String word) {
        String f = new String();
        f += ((word.substring(1)) + (word.charAt(0)));
        return f;
    }

    public 




    public static void main(String[] args) {
        StringsExercises se = new StringsExercises();
        System.out.println(se.scroll("Hello World"));
        System.out.println(se.scroll("happy"));
        System.out.println(se.scroll("h"));
    }

}
