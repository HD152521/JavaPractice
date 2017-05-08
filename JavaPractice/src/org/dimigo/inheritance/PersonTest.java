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
public class PersonTest {
public static void main(String[] args) {
	Person p = new Person("Tom");
	System.out.println("저는 "+p);
	p.sayHello();
	p.sayBye();
	System.out.println("");
	
	Korean k = new Korean("홍길동");
	System.out.println(k);
	k.sayHello();
	k.sayBye();
	System.out.println("");

	
	Japanese j =new Japanese("다나카");
	System.out.println(j);
	j.sayHello();
	j.sayBye();
	System.out.println("");

	
	Chinese c = new Chinese("왕밍"); 
	System.out.println(c);
	c.sayHello();
	c.sayBye();
}
}
