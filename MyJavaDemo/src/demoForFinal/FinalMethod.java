package demoForFinal;

public class FinalMethod {
	public final void test(){
		
	}
	
	//final方法对本类重载没有影响
	public void test(int i){
		
	}
}

class Test extends FinalMethod{
	
	/**
	 * Cannot override the final method from FinalMethod
	 * final方法不能重写
	 */
	//public void test(){}
	
	@Override
	public void test(int i){
		super.test(i);
	}
	
	//当然也可以写属于自己类的方法
	public void test(int i,int j){
		
	}
}
