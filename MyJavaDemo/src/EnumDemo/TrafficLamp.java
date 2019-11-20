package EnumDemo;

public enum TrafficLamp {
	RED(30){
		@Override
		public TrafficLamp getNextLamp(){
			return GREEN;
		}
	},GREEN(45) {
		@Override
		public TrafficLamp getNextLamp() {
			// TODO Auto-generated method stub
			return YELLOW;
		}
	},YELLOW(5) {
		@Override
		public TrafficLamp getNextLamp() {
			// TODO Auto-generated method stub
			return RED;
		}
	};
	
	private int time;
	
	TrafficLamp(int time){
		this.time = time;
	}
	
	public abstract TrafficLamp getNextLamp();
}
