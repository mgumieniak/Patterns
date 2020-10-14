package behavioral.templateMethodPattern.simpleLambda;

import java.util.function.Function;

public class BankAccount {
    private final String userId;

    public BankAccount(String userId) {
        this.userId = userId;
    }

    public Double drawMoney(Function<String, User> getUser, Function<User, Double> draw) {
        User user = getUser.apply(userId);
        return draw.apply(user);
    }
}
