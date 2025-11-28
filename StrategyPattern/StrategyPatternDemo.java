package StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy[] strategies = {new AttackStrategy(), new DefendStrategy(), new RetreatStrategy()};
        int i = 0;

        while (true) {
            context.setStrategy(strategies[i % 3]);
            context.executeStrategy();
            i++;
        }
    }
}