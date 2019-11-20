package FunctionalProgram;
/**
 * 
 * @author Panda.Zhao
 *仅仅选出绿苹果
 */
public class AppleColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "green".equals(apple.getColor());
	}
	
}
