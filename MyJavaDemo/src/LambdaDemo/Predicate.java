package LambdaDemo;
@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
