package Chapter7;

import Chapter7.WildTrukey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTrukey turkey = new WildTrukey();
        Duck turkeyDuckAdapter = new TurkeyAdapter(turkey);
        
    }
}
