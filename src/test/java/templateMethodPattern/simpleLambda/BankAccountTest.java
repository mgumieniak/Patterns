package templateMethodPattern.simpleLambda;

import behavioral.templateMethodPattern.simpleLambda.BankAccount;
import behavioral.templateMethodPattern.simpleLambda.User;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

class BankAccountTest {

    @Test
    void drawMoney() {
        BankAccount bankAccount = new BankAccount("1");
        double money = bankAccount.drawMoney(getUser(),
                User::getMoney);
        System.out.println(money);
    }

    private Function<String, User> getUser() {
        return userId -> {
            System.out.println("Get user from service: " + userId);
            return new User("Maciej", 500.00);
        };
    }
}