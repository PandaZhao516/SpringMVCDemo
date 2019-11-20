package EnumDemo;

public enum Weekday2 {
//	SUN,MON,TUS,WED,THU,FRI,SAT
	 SUN(0),MON(1),TUS(2),WED(3),THU(4),FRI(5),SAT(6);
// MON(1,"mon"),TUS(2,"tus"),WED(3,"wed"),THU(4,"thu"),FRI(5,"fri"),SAT(6,"sat"),SUN(0,"sun");
//private int value;
//private String label;
//private Weekday2(int value,String label){
//	this.value = value; this.label = label;
//}
	
	private int value;
	
	private Weekday2(int value){
		this.value = value;
	}
	
	public static Weekday2 getNextDay(Weekday2 nowday){
		int nextDayValue = nowday.value;
		if(++nextDayValue == 7){
			nextDayValue = 0;
		}
		return getWeekdayByValue(nextDayValue);
	}

	private static Weekday2 getWeekdayByValue(int value) {
		// TODO Auto-generated method stub
		for(Weekday2 c : Weekday2.values()){
			if(c.value == value){
				return c;
			}
		}
		return null;
	}
}
