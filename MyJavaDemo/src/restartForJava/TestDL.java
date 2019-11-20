package restartForJava;

public class TestDL {
	private static TestDL dl;
	private TestDL(){
		
	}
	
	public static TestDL getInstance(){
		if(dl == null){
			dl = new TestDL();
		}
		return dl;
	}
}
