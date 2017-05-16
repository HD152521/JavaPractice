/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *org.dimigo.inheritance
 *     |_SmartPhoneTest
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 5. 12.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class SmartPhoneTest {
public static void main(String[] args) {
	SmartPhone[] g ={	new IPhone("iphone7","애플",900000),
	 new Galaxy("갤럭시 s8","삼성",800000)};
	for(int i=0;i<2;i++){
		System.out.println(g[i]);
		g[i].turnOn();
		g[i].pay();
		g[i].useSpecialFunction(g[i]);
		g[i].turnOff();
	}
}
}
