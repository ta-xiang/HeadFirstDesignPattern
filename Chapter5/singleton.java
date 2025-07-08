package Chapter5;

public class singleton {
    private static singleton instance;

    private singleton() {
        // private constructor to prevent instantiation
    }   

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }   

}

 class Main {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();

        System.out.println(s1 == s2); // should print true, both references point to the same instance
    }
}