package domain;

public class Car extends Vehicle implements Startable {
	private final int gearShift;
	private boolean isStarted;
	
	public Car(Builder builder) {
		super(builder);
		this.gearShift = builder.gearShift;
		this.isStarted = false;
	}
	
	public static class Builder extends Vehicle.Builder<Builder> {
		private final int gearShift;
		private String color;

		public Builder(String name, String model, int gearShift) {
			super(name, model);
			this.gearShift = gearShift;
			this.color = "nepoznato";
		}
		
		public Builder color(String color) {
			this.color = color;
			return self();
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Car build() {
			return new Car(this);
		}

	}

	@Override
	public void start() {
		if(isStarted == false) {
			this.isStarted = true;
			System.out.println("Auto je upaljeno!");
		}
		else {
			System.out.println("Auto mora da bude ugaseno da bi ga upalili!");
		}
	}

	@Override
	public void stop() {
		if(isStarted == true) {
			this.isStarted = false;
			System.out.println("Auto je ugaseno!");
		}
		else {
			System.out.println("Auto mora da bude pokrenuto da bi ga ugasili!");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Car [gearShift=" + gearShift + ", isStarted=" + isStarted + "]";
	}
	
	

}
