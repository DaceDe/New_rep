package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {

	protected int wheels;

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;

	}

	public String move(Road road) {

		if (road.getClass() == Road.class) {

			if (getFuelInTank() >= getConsumption() * road.getDistance() / 100) {
				this.setFuelInTank(getFuelInTank() - road.getDistance() * getConsumption() / 100);
				
				return getType() + " is driving on " + road.toString()+" with " + wheels + " wheels";
			} else {

				return "Cannot drive on " + road.toString();

			}}
			else{
				return "Cannot drive on " + road.toString();
			}

		}
	}
