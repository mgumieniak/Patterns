package templateMethodPattern;

public class CompanyUK implements Company {
    @Override
    public void checkIdentity() {
        System.out.println("UK checkIdentity");
    }

    @Override
    public void checkProfitAndLoss() {
        System.out.println("UK checkProfitAndLoss");

    }

    @Override
    public void checkHistoricalDebt() {
        System.out.println("UK checkHistoricalDebt");
    }
}
