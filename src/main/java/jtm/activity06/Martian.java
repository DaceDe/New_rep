package jtm.activity06;

public class Martian implements Alien, Cloneable, Humanoid {
	private int weight;
	private boolean alive;
	private String[] backpack;

	public Martian() {
		this(42);
	}

	public Martian(int weight) {
		
		this.weight = weight;
		this.alive = true;
		this.backpack=new String[10];
	}

	@Override
	public String killHimself() {

		return "I AM IMMORTAL!";

	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {

		return backpack;
	}

	@Override
	public void addToBackpack(String item) {
		for (int i = 0; i < backpack.length; i++) {
			if (backpack[i] == null) {
				backpack[i] = item;
				break;
			}
		}

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
	public void eatHuman(Humanoid humanoid) {
		if (humanoid.isAlive().equals("Alive")) {
			humanoid.killHimself();
			this.weight = weight + humanoid.getWeight();
			humanoid.killHimself();
		}

	}

	@Override
	public int getLegCount() {

		return LEG_COUNT;
	}

	@Override
	public String isAlive() {

		return "I AM IMMORTAL!";
	}

	protected Object clone() throws CloneNotSupportedException {
		Martian m = new Martian();
		m.setArmCount(this.getArmCount());
		m.setWeight(this.getWeight());
		m.setLegCount(this.getLegCount());

		return m;
	}

	private void setLegCount(int legCount) {
		legCount=7;
	}

	private void setArmCount(int armCount) {
		armCount=2;
	}

}
