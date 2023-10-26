package max_array;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void test1()
	{
		Main m = new Main();
		Assert.assertEquals(9, m.max_array(new int[]{1,2,4,6,9}));
	}
	
	
	@Test
	public void test2()
	{
		Main m = new Main();
		Assert.assertEquals(-2, m.max_array(new int[]{-2,-7,-3}));
		
	}

}