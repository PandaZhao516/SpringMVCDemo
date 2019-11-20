package innerClassDemo;

public class AnonymousClassCopy {
	class InnerClassImpl implements InnerClass{
		int number;
		public InnerClassImpl(int num){
			number = num + 3;
		}
		public int getNumber(){
			return number;
		}
	}
	public InnerClass getInnerClass(final int num){
		return new InnerClassImpl(2);
	}
	
	public static void main(String[] args){
		AnonymousClassCopy  out = new AnonymousClassCopy();
		InnerClass inner = out.getInnerClass(2);
		System.out.println(inner.getNumber());
	}
}
