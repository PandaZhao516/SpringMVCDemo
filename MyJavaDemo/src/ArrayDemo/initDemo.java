package ArrayDemo;

import java.sql.Date;
import java.util.Arrays;

import restartForJava.Person;

public class initDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = new Person[3];
		//未生成对象时，引用类型为空
		System.out.println("p[0]==>"+p[0]);
		
		//生成对象之后，引用指向对象
		p[0] = new Person(0);
		p[1] = new Person(1);
		p[2] = new Person(2);
		
		System.out.println(p.toString());
		System.out.println(Arrays.toString(p));
	}

}
