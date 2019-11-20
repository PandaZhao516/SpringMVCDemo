package demoForFinal;

public class StaticPartAttr {
	public void test(){
		final int a;
		final int b = 2;
		
		a = 3;
		//a = 6; //会报错
		//b = 5; //会报错
	}
}
