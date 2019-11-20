package innerClassDemo;

public class Son {
	/**
	 * 内部类继承father类
	 */
	class Father_1 extends Father{
		public int strong(){
			return super.strong()+1;
		}
	}
	
	/**
	 * 内部类继承Mother类
	 */
	class Mother_1 extends Mother{
		public int kind(){
			return super.kind() -2;
		}
	}
	
	public int getStong(){
		return new Father_1().strong();
	}
	
	public int getKind(){
		return new Mother_1().kind();
	}
}


