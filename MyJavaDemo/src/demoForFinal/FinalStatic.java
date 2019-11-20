package demoForFinal;

public class FinalStatic {
	private final static double PI = 3.14;
	private final static double E;
//	private final static double C; 会报错
	
	static{
		E = 2.71;
	}
	
	public FinalStatic(double c){
		//C = c; 会报错
	}
}
