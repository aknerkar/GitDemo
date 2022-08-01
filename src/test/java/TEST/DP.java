package TEST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	 @DataProvider (name="dataname")
	 public Object[][] data(){
		 return new Object[][] {{"velocity"}};
	 }
     
		
		
		@BeforeMethod
		public void Bmethod() {
			System.out.println("before method");
		}
		@Test (dataProvider="dataname")
		public void test(String value) {
			System.out.println(value);
		}
		@Test
		public void Demo1() {
			System.out.println("Hello i am demo1");
		}
		@Test
		public void Demo2() {
			System.out.println("Hello i am demo2");
		}
		@AfterMethod
		public void Amethod() {
			System.out.println("After method");
		}
}
