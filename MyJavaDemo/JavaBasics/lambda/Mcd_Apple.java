/**

*@description TODO
*@author Panda

 */
package lambda;

import java.util.function.Supplier;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月26日
 */
public class Mcd_Apple {

	private String name;
	private String color;
	private double weight;
	
	public Mcd_Apple(){
		
	}
	
	public Mcd_Apple(String name, String color, double weight){
		this.name = name;
        this.color = color;
        this.weight = weight;
	}
	
	//静态方法
	public static int compareByWeight(Mcd_Apple a1, Mcd_Apple a2){
		double diff = a1.getWeight() - a2.getWeight();
		 return new Double(diff).intValue();
	}
	
	//实例方法
	public int compareByWeight2(Mcd_Apple a1, Mcd_Apple a2){
		double diff = a1.getWeight() - a2.getWeight();
		return new Double(diff).intValue();
	}
	
	//类方法
	public int compareByWeight3(Mcd_Apple other){
		double diff = this.getWeight() - other.getWeight();
		return new Double(diff).intValue();
	}
	
	//构造方法
	public String getString(Supplier<String> supplier){
		return supplier.get();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


}
