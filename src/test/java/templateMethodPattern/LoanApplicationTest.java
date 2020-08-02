package templateMethodPattern;

import org.junit.jupiter.api.Test;

class LoanApplicationTest {

    @Test
    void name() {
        Company company = new CompanyUK();

        LoanApplication loanApplication = new CompanyLoanApplication(company);
        loanApplication.checkLoanApplication();
    }
}