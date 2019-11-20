package innerClassDemo;

import innerClassDemo.InnerClassUpgrade.Eat;

public class LocalInnerClass {
	public static void main(String[] args){
		Eat e = new Person().howToEat();
		e.eat();
	}
}
