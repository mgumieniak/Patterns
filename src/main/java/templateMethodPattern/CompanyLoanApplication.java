package templateMethodPattern;

public class CompanyLoanApplication extends LoanApplication {
    public CompanyLoanApplication(Company company) {
        super(company::checkIdentity, company::checkProfitAndLoss, company::checkHistoricalDebt);
    }
}
