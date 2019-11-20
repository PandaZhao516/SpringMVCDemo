package demoForFinal;

import java.sql.Date;

import restartForJava.Person;

public class FinalAttributeC {
	private final Person person = new Person(Date.valueOf("1992-05-16"));
	
	public void change(){
		person.setPersonBirth(Date.valueOf("1998-05-16"));
		System.out.println(person.getPersonBirth());
	}

	/**
	 * 会报错，引用类型person是不可以被修改的，引用本身是不可以改变得，但是引用指向的对象是可以改变的
	 * @param args
	 */
//	public void change(Person p){
//		this.person = p;
//	}
	
	public static void main(String[] args) {
        new FinalAttributeC().change();
    }
}
