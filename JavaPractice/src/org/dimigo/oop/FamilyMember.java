/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 *     |_FamilyMember
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 4. 18.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class FamilyMember {
private static int memberCnt;
private String membername;

public FamilyMember(String membername){
	this.membername = membername;
	memberCnt++;
}

public static void printMemberCnt(){
System.out.println("가족 총 인원수 : "+memberCnt+"명");
}

public String getMembername() {
	return membername;
}

}
