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
public class Car2 {
	private String made;
	private String model;
	private String color;
	private int speed;
	private int price;
	
	public Car2(String newMade, String newModel, String newColor, int newSpeed, int newPrice){
		made = newMade;
		model = newModel;
		color = newColor;
		speed = newSpeed;
		price = newPrice;
	}
	
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
	
	
//	public void setMade(String newMade){
//		made = newMade;
//	} 
//	public void setModel(String newModel){
//		model = newModel;
//	} 
//	public void setColor(String newColor){
//		color = newColor;
//	} 
//	public void setSpeed(int newSpeed){
//		speed = newSpeed;
//	} 
//	public void setPrice(int newPrice){
//		price = newPrice;
//	} 
	
	
	
}
