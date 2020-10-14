package behavioral.templateMethodPattern.simpleLambda;

public class User {
    private final String name;
    private final double money;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
