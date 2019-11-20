package restartForJava;

import java.sql.Date;

public class Person {
	private Date birthDate;
	private static Date sDate,eDate;
	
	public Person(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public Person(int i) {
		// TODO Auto-generated constructor stub
	}

	public void setPersonBirth(Date date){
		this.birthDate = date;
	}
	
	public Date getPersonBirth(){
		return this.birthDate;
	}
	
	/**判断一个人的生日是不是90后
	 * 但是每一次调用这个方法的时候都要生成startDate和endDate，很浪费资源
	 * @return
	 */
	boolean isBornBoomer(){
		Date startDate = Date.valueOf("1990");
		Date endDate = Date.valueOf("1999");
		return birthDate.compareTo(startDate)>0 && birthDate.compareTo(endDate)<0;
	}
	
	/*
	 * 改进一个方法
	 */
	
//	static{
//		sDate = Date.valueOf("1990");
//		eDate = Date.valueOf("1999");
//	}
	
	boolean isBornBoomer2(){
		return birthDate.compareTo(sDate)>0 && birthDate.compareTo(eDate)<0;
	}
}
