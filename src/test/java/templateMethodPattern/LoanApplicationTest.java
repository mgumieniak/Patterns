package templateMethodPattern;

import behavioral.templateMethodPattern.Company;
import behavioral.templateMethodPattern.CompanyLoanApplication;
import behavioral.templateMethodPattern.CompanyUK;
import behavioral.templateMethodPattern.LoanApplication;
import org.junit.jupiter.api.Test;

class LoanApplicationTest {

    @Test
    void name() {
        Company company = new CompanyUK();

        LoanApplication loanApplication = new CompanyLoanApplication(company);
        loanApplication.checkLoanApplication();
    }
}