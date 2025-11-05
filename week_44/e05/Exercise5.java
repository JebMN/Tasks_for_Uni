public class Exercise5 {
    public static void main(final String[] args) {
        greetN("Sam");
        greetD("Good Evening", "Sam");
        
    }

    public static void greetN(String nname) {
        System.out.println("Hello " + nname + "!");  

    }

    public static void greetD(String dname, String nname) {
        System.out.println(dname + ", " + nname + "!");  

    }
}