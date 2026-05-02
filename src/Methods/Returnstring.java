package Methods;
class Returnstring{
    public static void main(String[] args) {
        String personalized = mygreet("Nithish");
        System.out.println(personalized);
    }

    static String mygreet(String name) {
        String str = "hello "+name;
        return str;

    }
}