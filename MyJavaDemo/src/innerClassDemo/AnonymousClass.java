package innerClassDemo;

public class AnonymousClass {
	public InnerClass getInnerClass(final int num,String str2){
		return new InnerClass(){
			int number = num + 3;
			public int getNumber(){
				return number;
			}
		};
	}
	
	public static void main(String[] args){
		AnonymousClass a = new AnonymousClass();
		InnerClass b = a.getInnerClass(2, "2");
		System.out.println(b.getNumber());
	}
}

interface InnerClass{
	int getNumber();
}