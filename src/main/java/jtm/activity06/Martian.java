package jtm.activity06;

public class Martian implements Alien, Cloneable, Humanoid {
	private int weight;
	
	public Martian(int weight){
		this.weight=42;
	}

	public Martian() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String killHimself() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addToBackpack(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

}
