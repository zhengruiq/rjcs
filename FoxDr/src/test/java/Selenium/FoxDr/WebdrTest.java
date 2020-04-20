package Selenium.FoxDr;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class WebdrTest {

	 @Test
	    public void wh() {
	        Webdr sc = new Webdr();
	        int expected=420;
	        int actual=sc.Fweb();
	        assertEquals(expected, actual);
			System.out.println("ok!");
	        
	    }

}
