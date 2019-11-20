package ConCurrency;

//每个同学比作一个线程对象
public class Person extends Thread{
	private int num = 50;
	public Person(String name){
		//调用父类方法给线程取名字
		super(name);
	}
	public void run(){
		for(int i = 0;i<50;i++){
			if(num>0){
				System.out.println(super.getName()+"吃了编号为："+num--+"的苹果");
			}
		}//end for
	}//end run
}
