/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *org.dimigo.oop
 *     |_Question
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 3. 31.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] question = {"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
		String[] answer = {"트와이스","박보영","체육"};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<3;i++){
		System.out.print(question[i]);
		Scanner scanner = new Scanner(System.in);
		String answer1 = scanner.nextLine();
		sb.append(question[i]+" "+answer[i]+"입니다."+"\n");
		System.out.println(answer[i].equals(answer1) ? "정답입니다!" : "틀렸습니다!");
	}
		System.out.println("<<결과 출력>>");
			System.out.println(sb);
		
	}
}