package jtm.activity06;

public class Human implements Humanoid {
	private int weight;
	private boolean alive;
	private String[] backpack;

	public Human() {
		this(42);
	}

	public Human(int weight) {
		this.weight = weight;
		this.alive = true;
		this.backpack=new String[10];
	}

	@Override
	public int getWeight() {

		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public String killHimself() {
		if(this.alive==true){
			this.alive=false;
			return "Dead";
		}
		return null;
	}

	@Override
	public int getArmCount() {

		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {

		return this.backpack;
	}

	@Override
	public void addToBackpack(String item) {
		for(int i=0; i<backpack.length; i++){
			if(backpack[i]==null){
				backpack[i]=item;
				break;
			}
			
		}
	}

	@Override
	public String isAlive() {
		if (this.alive == true) {
			return "Alive";
		} else {
			return "Dead";
		}

	}

}
