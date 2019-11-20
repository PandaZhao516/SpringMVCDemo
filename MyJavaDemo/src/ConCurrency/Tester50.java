package ConCurrency;

//使用继承方式来实现
public class Tester50 {
	public static void main(String[] args) {
		//创建三个线程（同学），吃苹果
//		new Person("A").start();
//		new Person("B").start();
//		new Person("C").start();
		//使用实现runnable的方式来实现
		Apple a = new Apple();
		new Thread(a,"A").start();
		new Thread(a,"B").start();
		new Thread(a,"C").start();
	}

}
