package domain;

public abstract class Vehicle {
	private final String name;
	private final String model;
	private final int hp;
	
	public Vehicle(Builder builder) {
		this.name = builder.name;
		this.model = builder.model;
		this.hp = builder.hp;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", hp=" + hp + "]";
	}



	public static abstract class Builder <T extends Builder<T>>{
		private final String name;
		private final String model;
		private int hp;
		
		
		public Builder(String name, String model) {
			this.name = name;
			this.model = model;
		}
		
		public T horsePower(int hp) {
			this.hp = hp;
			return self();
		}
		
		protected abstract T self();

		public abstract Vehicle build();
		
	}
	

}
