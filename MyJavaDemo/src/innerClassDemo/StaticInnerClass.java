package innerClassDemo;

import innerClassDemo.InnerClassUpgrade.inter;

public class StaticInnerClass {
	private int i = 1;
	public static String str = "str";
	
	static class StaClass implements inter{
		private String s = "s";
		static int j = 2;
		
		static int getInt(){
			//return i+j;//静态内部类不能访问非静态的外部类变量
			return j;
		}
		
		private String getString(){
			return str+s;
		}

		@Override
		public void inter() {
			// TODO Auto-generated method stub
			System.out.println("inter");
		}
		
		static class InStaClass{
			int x = 6;
			static int y = 5;
			static int getInt(){
				//return x;//不能在静态方法中使用非静态变量
				return y;
			}
		}
		
	}
	public inter getInter(){
		return new StaClass();
	}
}
class Test2{
	public static void main (String[] args){
		int a = StaticInnerClass.StaClass.getInt();
		//StaticInnerClass.StaClass.getString();//非静态方法无法这样调用
		int b = StaticInnerClass.StaClass.InStaClass.getInt();
		System.out.println(a + "----" + b);
		//new StaticInnerClass().new StaClass();//编译失败，staClass是静态的
		new StaticInnerClass().getInter().inter();
	}
}
