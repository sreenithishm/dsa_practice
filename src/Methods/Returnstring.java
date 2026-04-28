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
git remote remove origin
git remote add origin https://github.com/sreenithishm/dsa_practice.git
git push -u origin main