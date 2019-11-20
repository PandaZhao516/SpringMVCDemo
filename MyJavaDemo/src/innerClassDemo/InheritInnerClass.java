package innerClassDemo;

public class InheritInnerClass extends WithInner.Inner {
	//InheritInnerClass(); 无法通过编译，要加上形参或方法体
	InheritInnerClass(WithInner wi) {
		wi.super();
	}
}

class WithInner{
	class Inner{
		
	}
}