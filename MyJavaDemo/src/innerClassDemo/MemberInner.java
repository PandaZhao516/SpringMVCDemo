package innerClassDemo;

public class MemberInner {
	private String a = "a";
	public int i =1;
	//内部类
	class Inner{
		private String b = "b";
		public String c = "c";
		
		public int getInt(){
			return i;//内部类可以访问外部类变量
		}
		
		private String getString(){
			return a + b + c;//内部类可以访问外部类的private变量
		}
	}
	
	public String getParam(){
		Inner inner = new Inner();
		inner.b = "bb";//外部类可以访问内部类的private变量
		inner.c = "cc";
		return inner.getInt() + inner.getString();
	}
}

class Test{
	
	public static void main(String[] args){
		MemberInner mi = new MemberInner();
		System.out.println(mi.getParam());
		
		MemberInner.Inner moi = mi.new Inner();
		moi.c = "ccc";
	//	moi.b = "bbb"; //b属性是不可见的
		System.out.println(moi.getInt());
	//	System.out.println(moi.getString());//方法不可见
		
	}
}
