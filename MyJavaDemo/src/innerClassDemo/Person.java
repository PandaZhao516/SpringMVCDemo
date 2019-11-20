package innerClassDemo;

import innerClassDemo.InnerClassUpgrade.Eat;
import innerClassDemo.InnerClassUpgrade.Run;

public class Person {
	//private
	private class PEat implements Eat{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("eat with mouth");
		}
	}
	//protected
	protected class PRun implements Run{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}		
	}
	
	public Eat howToEat(){
		//定义在方法中的类
		class EatWithMouth implements Eat{

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat with mouth2");
			}
			
		}
		return new EatWithMouth();//向上转型
	}
	
	public Run howtoRun(){
		return new PRun();//向上转型
	}
}

class TestPerson{
	public static void main(String[] args){
		Person p = new Person();
		Eat e = p.howToEat();
		Run r = p.howtoRun();
		
		e.eat();
		r.run();
		
		Person.PRun ppr = p.new PRun();
		//Person.PEat ppe = p.new PEat();//编译失败，因为PEat是private的
	}
}
