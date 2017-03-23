/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 *     |_Car
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 3. 23.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class Car {
	private String made="현대 자동차";
	private String model="제네시스";
	private String color="검정색";
	private int speed=225;
	private int price=50000000;
	
	public String getMade(){
		return made;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getSpeed(){
		return speed;
	}
	public int getPrice(){
		return price;
	}
	
	
	public void setMade(String newMade){
		made = newMade;
	} 
	public void setModel(String newModel){
		model = newModel;
	} 
	public void setColor(String newColor){
		color = newColor;
	} 
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	} 
	public void setPrice(int newPrice){
		price = newPrice;
	} 
	
	
	
}
