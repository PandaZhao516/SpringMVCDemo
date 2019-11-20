package EnumDemo;

public class TestDemo {
	public static void main (String[] args){
//		Weekday nowday = Weekday.SAT;
//		Weekday.printNowDay(nowday);
//		Weekday nextDay = Weekday.getNextDay(nowday);
//        System.out.print("nextday ====> ");
//        Weekday.printNowDay(nextDay);
//        
//        
//        Weekday2 sun = Weekday2.SUN;
//        System.out.println(sun); 
//        
//        
//        System.out.println("nowday ====> " + Weekday2.SAT);
//        System.out.println("nowday int ====> " + Weekday2.SAT.ordinal());
//        System.out.println("nextday ====> " + Weekday2.getNextDay(Weekday2.SAT)); // Êä³ö SUN
		System.out.println(Weekday2.valueOf("mon".toUpperCase()));
		for(Weekday2 W : Weekday2.values()){
			System.out.println(W + ".ordinal()  ====>" +W.ordinal());
		}
		
		System.out.println("Weekday.MON.compareTo(Weekday.FRI) ===> " + Weekday2.MON.compareTo(Weekday2.FRI));
	    System.out.println("Weekday.MON.compareTo(Weekday.MON) ===> " + Weekday2.MON.compareTo(Weekday2.MON));
	    System.out.println("Weekday.MON.compareTo(Weekday.SUM) ===> " + Weekday2.MON.compareTo(Weekday2.SUN));
	}
}
