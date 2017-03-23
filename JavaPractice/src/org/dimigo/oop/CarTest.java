/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 *     |_CarTest
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 3. 23.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car = new Car();
		
		car1.setMade("기아자동차");
		car1.setModel("K7");
		car1.setColor("흰색");
		car1.setSpeed(246);
		car1.setPrice(40000000);
		
		car2.setMade("삼성자동차");
		car2.setModel("SM7");
		car2.setColor("회색");
		car2.setSpeed(200);
		car2.setPrice(38000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+car.getMade());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getSpeed()+"km");
		System.out.format("가격 : %,d원",car.getPrice());
		System.out.println("\n");
		System.out.println("제조사명 : "+car1.getMade());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColor());
		System.out.println("최대속도 : "+car1.getSpeed()+"km");
		System.out.format("가격 : %,d원",car1.getPrice());
		System.out.println("\n");
		System.out.println("제조사명 : "+car2.getMade());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getSpeed()+"km");
		System.out.format("가격 : %,d원",car2.getPrice());
	}

}
