/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 *     |_PiggyBank
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 4. 18.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class PiggyBank {
private static int balance;

public static void putMoney(FamilyMember member, int amount){
	System.out.println(member.getMembername()+" : "+amount+"원 넣음");
	balance += amount;
}
 
public static void printBalance(){
	System.out.println("돼지 저금통 총 금액 : "+balance+"원");
}

}
