package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VendingMachineTest {

	VendingMachine v;

	@Before
	public void setUp() {
		v = new VendingMachine();

	}

	@Test

	public void testBalance() {
		String result = v.balance();
		assertEquals("Balance expected to be 0.00$", "0.00$", result);
	}

	@Test
	public void testDepositAndBalance() {
		v.depositCoins(7.63);

		String result = v.balance();
		assertEquals("Balance expected to be 7.63$", "7.63$", result);
	}

	@Test
	public void testProductNotEnoughBalance() {
		v.addProducts("snicker", 0.75);
		String result = v.chooseProduct("snicker");
		assertEquals("Balance not enough", result);
	}

	@Test
	public void testNonExistingProduct() {
		v.addProducts("snicker", 0.75);
		v.depositCoins(1000.00);
		String result = v.chooseProduct("twix");
		
		assertNull(result);
	}
	
	@Test
	public void testNonCaseSensitive() {
		v.addProducts("snickers", 0.75);
		v.depositCoins(1.00);
		String result = v.chooseProduct("SniCkerS");
		assertEquals("snickers", result);
	}

	@Test
	public void testEjectCoinsBack(){
		double result = v.ejectCoinsBack();;
		assertEquals(0.00, result, 0.00);		
	}

		
}
