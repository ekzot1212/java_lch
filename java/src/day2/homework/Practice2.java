/**
 * �� ������ �Է¹޾� �� ������ ��� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���. 
 * ��, 2��° ���ڴ� 0�� �ƴϿ��� ��.
 * 
 * ��: 
 * �� ������ �Է��ϼ���.
 * 1 2 [����] 
 * 1 + 2 = 3
 * 1 - 2 = -1
 * 1 * 2 = 2
 * 1 / 2 = 0.5
 */

package day2.homework;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է��ϼ���");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		sc.close();
		
	}

}
