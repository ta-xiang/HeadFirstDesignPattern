public class test{
    private test(){
        System.out.println("I'm private constructor");
    }

    public static test getInstance() {
        return new test();
    }
}

class Main {
    public static void main(String[] args) {
        test instance = test.getInstance();
        // System.out.println("Instance created: " + instance);
    }
}