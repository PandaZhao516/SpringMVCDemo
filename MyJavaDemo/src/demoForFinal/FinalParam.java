package demoForFinal;

import java.sql.Date;

import restartForJava.Person;

public class FinalParam {
	public void test(final int a){
		/**
		 * 被final修饰的参数不可修改
		 */
		//a = 10;
	}
	
	public void test(final Person p){
		/**
		 * The final local variable p cannot be assigned.
			It must be blank and not using a compound assignment
			引用本身不可以被修改
		 */
		//p = new Person(Date.valueOf("1998-05-16"));
		
		//引用所指的对象可以被修改
		p.setPersonBirth(Date.valueOf("1998-05-16"));
	}
}
