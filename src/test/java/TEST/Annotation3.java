package TEST;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Annotation3 {
       
	
	@Test
	public void Akshay() {
		System.out.println("Hello i am Akshay");
	}
	@Test
	public void Lalit() {
		System.out.println("Hello i am Lalit");
	}
	@Test
	@Parameters({"c"})
	public void Rahul(String c) {
		System.out.println(c);
	}
	@Test
	@Parameters({"a","b"})
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	
	
	
	
	
	
}
