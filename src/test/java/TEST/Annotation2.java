package TEST;

import org.testng.annotations.Test;

public class Annotation2 {
       
	@Test(priority=2,invocationCount=3)
	public void testa() {
		System.out.println("testa is executed");
	}
   @Test(priority=1,dependsOnMethods= {"teste"})
   public void testb() {
		System.out.println("testb is executed");
	}
   @Test(priority=4,enabled= false)
   public void testc() {
		System.out.println("testc is executed");
	}
   @Test(priority=3,timeOut=3000)
   public void teste() throws InterruptedException {
	   Thread.sleep(4000);
		System.out.println("teste is executed"); 
	}
   @Test(priority=5)
   public void testd() {
		System.out.println("testd is executed");
	}
	
	
	
	
	
	
}
