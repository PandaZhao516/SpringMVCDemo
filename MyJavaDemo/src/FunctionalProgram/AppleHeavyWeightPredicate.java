package FunctionalProgram;
/**
 * 
 * @author Panda.Zhao
 *仅仅选出贵的苹果
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight()>150;
	}
}
