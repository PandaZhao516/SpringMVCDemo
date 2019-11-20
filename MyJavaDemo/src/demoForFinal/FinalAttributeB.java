package demoForFinal;

public class FinalAttributeB {
	private final String attribute_b;
	
	public FinalAttributeB(String b){
		this.attribute_b ="Panda";
	}
	
	public void test(){
		//The final field FinalAttributeB.attribute_b cannot be assigned
		//attribute_b ="s";
	}
	public void test(String b){
		//The final field FinalAttributeB.attribute_b cannot be assigned
		//this.attribute_b ="Panda";
	}
}
