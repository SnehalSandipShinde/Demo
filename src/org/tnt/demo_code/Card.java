package org.tnt.demo_code;

import java.io.Serializable;

//@Entity
public class Card implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Card(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [number=" + number + "]";
	}
	
	

}
