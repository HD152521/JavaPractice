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
public class Car3 {
	private String made;
	private String model;
	private String color;
	private int speed;
	private int price;
	
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
	
	public Car3(String made,String model, String color, int speed,int price){
		this.model=model;
		this.made=made;
		this.color=color;
		this.speed=speed;
		this.price=price;
	}
	
	
	
	public Car3(String made,String model, String color, int speed){
		this(made, model, color, speed, 0);
	}
	
	public Car3(String made,String model, String color){
		this(made, model, color, 0, 0);
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
