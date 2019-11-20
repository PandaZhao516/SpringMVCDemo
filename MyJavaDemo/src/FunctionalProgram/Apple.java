package FunctionalProgram;

public class Apple {
	public static String color;
	public static int weight;
	
	public Apple() {
		// TODO Auto-generated constructor stub
		this.color = "green";
		this.weight = 150;
	}
	
	public Apple(String color,int weight){
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		// TODO Auto-generated method stub

		return this.color;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

}
