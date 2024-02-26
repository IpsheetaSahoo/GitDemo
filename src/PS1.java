import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@BeforeMethod
	public void usePS() {
		doTask();
	}
	
	@Test
	public void childAction() {
		System.out.println("I am child");
	}

}
