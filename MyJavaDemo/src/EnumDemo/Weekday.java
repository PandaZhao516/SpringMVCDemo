package EnumDemo;

public class Weekday {
//	public final static int SUN = 0;
//	public final static int MON = 1;
//    public final static int TUE = 2;
//    public final static int WED = 3;
//    public final static int THU = 4;
//    public final static int FRI = 5;
//    public final static int SAT = 6;	
	
	public Weekday(){}
	
	public final static Weekday SUN = new Weekday();
    public final static Weekday MON = new Weekday();
    public final static Weekday TUE = new Weekday();
    public final static Weekday WED = new Weekday();
    public final static Weekday THU = new Weekday();
    public final static Weekday FRI = new Weekday();
    public final static Weekday SAT = new Weekday();
	
    //获取下一天
    public static Weekday getNextDay(Weekday nowDay){
    	if(nowDay == SUN) {
            return MON;
        }else if(nowDay == MON) {
            return TUE;
        }else if(nowDay == TUE) {
            return WED;
        }else if(nowDay == WED) {
            return THU;
        }else if(nowDay == THU) {
            return FRI;
        }else if(nowDay == FRI) {
            return SAT;
        }else {
            return SUN;
        }
    }

    //打印今天
    public static void printNowDay(Weekday nowDay){
    	if(nowDay == SUN)
            System.out.println("sunday");
        else if(nowDay == MON)
            System.out.println("monday");
        else if(nowDay == TUE)
            System.out.println("tuesday");
        else if(nowDay == WED)
            System.out.println("wednesday");
        else if(nowDay == THU)
            System.out.println("thursday");
        else if(nowDay == FRI)
            System.out.println("friday");
        else
            System.out.println("saturday");
    }
    
    public static int toInt(Weekday nowDay){
        if(nowDay == SUN)
            return 0;
        else if(nowDay == MON)
            return 1;
        else if(nowDay == TUE)
            return 2;
        else if(nowDay == WED)
            return 3;
        else if(nowDay == THU)
            return 4;
        else if(nowDay == FRI)
            return 5;
        else
           return 6;
    }
    	
}


