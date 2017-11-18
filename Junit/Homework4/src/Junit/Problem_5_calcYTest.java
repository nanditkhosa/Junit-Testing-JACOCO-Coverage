package Junit;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_5_calcYTest {

	private Problem_5_calcY calculate;
	
	@Before
	public void setUp () {
		calculate = new Problem_5_calcY();
	}
	@Test
	@FileParameters("src/Junit/problem_5_file_parameters.csv")
	public void test(int testcaseNumber, double x, double y,String bpNumber) {		
		
		assertEquals(y,calculate.calcY(x),0.01);
		
	}
}