/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *org.dimigo.inheritance
 *     |_PersonTest
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 5. 8.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class PersonTest2 {
public static void main(String[] args) {
	Person[] p = {
			new Person("Tom"),
			new Person("홍길동"),
			new Person("다나카"),
			new Person("왕밍")
	};
	for(int i=0;i<4;i++){
		greeting(p[i]);
	}
}
public static void greeting(Person p){
	System.out.println(p);
	p.sayHello();
	p.sayBye();
	System.out.println();
}
}
