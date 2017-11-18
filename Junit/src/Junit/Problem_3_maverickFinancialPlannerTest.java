package Junit;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_3_maverickFinancialPlannerTest {
	
	private Problem_3_maverickFinancialPlanner balance;
	
	@SuppressWarnings("unused")
	
	private static final Object[] parametersForProblem_3_maverickFinancialPlannerTest () {
		return $(
//				Parameters are: (1,2);
//				1=number_of_shares, 2=portfolio_amount
//			    Test case 1
				$(50,7_009.50),
//				Test case 2
				$(299,42_375.11),
//				Test case 3
				$(750,107_100.00),
//				Test case 4
				$(999,143_356.50),
//				Test case 5
				$(2_000,287_700.00),
//				Test case 6
				$(2_001,289_944.90),
//				Test case 7
				$(0,-50.00),
//				Test case 8
				$(51,7_186.39),
//				Test case 9
				$(300,42_840.00),
//				Test case 10
				$(751,107_768.50),
//				Test case 11
				$(1_000,143_850.00),
//				Test case 12
				$(10_000,1_449_000.00)
		);
	}
	@Before
	public void setUp() throws Exception{
		balance = new Problem_3_maverickFinancialPlanner();
	}

	@Test
	@Parameters(method="parametersForProblem_3_maverickFinancialPlannerTest")
	public void test(int number_of_shares, double portfolio_amount)
	{
		double closing_price=140.00;
		balance.setPortfolio_amount(portfolio_amount);
		balance.calculate_balance(number_of_shares, closing_price);
		assertEquals(portfolio_amount,balance.getPortfolio_amount(),0.01);
	}

}
