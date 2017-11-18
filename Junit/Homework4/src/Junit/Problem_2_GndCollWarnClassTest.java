package Junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Problem_2_GndCollWarnClassTest {
	
	private Problem_2_GndCollWarnClass warning;
	private double altfeet;
	private int timer;
	private boolean gearUp,gndCollCaut,gndCollWarn,gndCollAlert,emerGrDown;
	
	@Before
	public void setUp() throws Exception {
		warning = new Problem_2_GndCollWarnClass();
	}
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
//				Parameters are: (1,2,3,4,5,6)
//		1=gearUp, 2=altfeet, 3=gndCollCaut, 4=gndCollWarn, 5=gndCollAlert,6=emerGrDown
//				Test case 1
	            {true,400.0,true,false,false,false}, 

//				Test case 2
	            {false,400.0,false,false,false,false}, 
	            
//				Test case 3
	            {true,400.1,false,false,false,false}, 

//				Test case 4
	            {true,200.0,false,true,false,false},
	            
//				Test case 5            
	            {true,50.0,false,false,true,true},
	            
//				Test case 6           
	            {true,50.1,false,false,true,false},          

//				Test case 7           
	            {true,50_000.0,false,false,false,false},

//				Test case 8            
	            {true,200.1,true,false,false,false},
	            
//				Test case 9           
	            {true,100.1,false,true,false,false},
	            
//				Test case 10           
	            {true,100.0,false,false,true,false},
	            
//				Test case 11           
	            {true,0.0,false,false,true,true}
	        
	        });
	    }

	    public Problem_2_GndCollWarnClassTest(boolean gearUp, double altfeet, boolean gndCollCaut, boolean gndCollWarn, boolean gndCollAlert, boolean emerGrDown) {
	    	this.gearUp=gearUp;
	    	this.altfeet=altfeet;
	    	this.gndCollCaut=gndCollCaut;
	    	this.gndCollWarn=gndCollWarn;
	    	this.gndCollAlert=gndCollAlert;
	    	this.emerGrDown=emerGrDown;
	    }        
		@Test
		public void test() {
			warning.setGndCollCaut(gndCollCaut);
	    	warning.setGndCollWarn(gndCollWarn);
	    	warning.setGndCollAlert(gndCollAlert);
	    	warning.setEmerGD(emerGrDown);
	    	warning.setTimer(timer);
			warning.gndCollWarning(gearUp, altfeet);
			assertEquals(gndCollCaut,warning.isGndCollCaut());
			assertEquals(gndCollWarn,warning.isGndCollWarn());
			assertEquals(gndCollAlert,warning.isGndCollAlert());
			assertEquals(emerGrDown,warning.isEmerGD());
			assertEquals(timer,warning.getTimer());
			
			}
	}

