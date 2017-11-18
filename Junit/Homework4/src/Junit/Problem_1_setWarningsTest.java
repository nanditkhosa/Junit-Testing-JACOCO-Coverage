package Junit;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_1_setWarningsTest {
	
	private Problem_1_setWarnings setwarning;
	
	
	@SuppressWarnings("unused")

	private static final Object[] parametersForProblem_1_setWarningsTest () {
		return $(
//				Parameters are: (1,2,3,4,5,6);
//				1=distance, 2=redLight, 3=yellowLight, 4=greenLight, 5=buzzer, 6=brakes
//			    Test case 1
				$(200.0,false,false,true,false,false),
//				Test case 2
				$(75.1,false,true,false,false,false),
//				Test case 3
				$(25.0,true,true,false,false,false),
//				Test case 4
				$(24.9,true,true,false,true,true),
//				Test case 5
				$(75.0,true,true,false,false,false),
//				Test case 6
				$(199.9,false,true,false,false,false),
//				Test case 7
				$(500.0,false,false,true,false,false),
//				Test case 8
				$(-0.1,true,true,false,true,true)
		);
	}
	
	@Before
	public void setUp() throws Exception{
		setwarning = new Problem_1_setWarnings();
	}
	
	@Test
	@Parameters(method="parametersForProblem_1_setWarningsTest")
	public void test(double distance, boolean redLight, boolean yellowLight, boolean greenLight, boolean buzzer, boolean brakes) {
		setwarning.setRedLight(redLight);
		setwarning.setYellowLight(yellowLight);
		setwarning.setGreenLight(greenLight);
		setwarning.setBuzzer(buzzer);
		setwarning.setBrakes(brakes);
		
		setwarning.setWarnings(distance);
		
		assertEquals(redLight,setwarning.isRedLight());
		assertEquals(yellowLight,setwarning.isYellowLight());
		assertEquals(greenLight,setwarning.isGreenLight());
		assertEquals(buzzer,setwarning.isBuzzer());
		assertEquals(brakes,setwarning.isBrakes());
			}

}
