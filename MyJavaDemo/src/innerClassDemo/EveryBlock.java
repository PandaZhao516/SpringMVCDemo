package innerClassDemo;
/**
 * 
 * @author Panda.Zhao
 *
 *在任意的作用域中嵌入内部类
 */
public class EveryBlock {
	private String test(boolean b){
		if(b){
			class A{
				private String a = "a";
				String getString(){
					return a;		
				}
			}
			A a  = new A();
			String s = a.getString();
			return s;
		}
		//A a = new A(); //编译失败，超出作用域
		return null;
	}
	
	public static void main (String[] args){
		EveryBlock eb = new EveryBlock();
		System.out.println("false is"+eb.test(false));
		System.out.println("true is"+eb.test(true));
	}
}
