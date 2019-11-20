package restartForJava;

public class CodeDemo {
	private int a = 1;
	private int b;
	private int c;
	//静态代码块
	static {
		int a =4;
		System.out.println("我是静态代码块1");
	}
	//构造代码块
	{
		int a = 0;
		b = 2;
		System.out.println("我是构造代码块1");
	}
	
	public CodeDemo(){
		this.c = 3;
		System.out.println("构造函数");
	}
	
	public int add(){
		System.out.println("count a + b + c");
		return a+b+c;
	}
	//静态代码块
	static {
		System.out.println("我是静态代码块2,I do nothing");
	}
	//构造代码块
	{
		System.out.println("我是构造代码块2");
	}
}
