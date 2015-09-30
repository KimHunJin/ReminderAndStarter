package example;

import java.awt.Container;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam4_14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		original();
		remake();
		

	}
	
	private static void original() {
		int answer = (int) (Math.random() * 100)  +1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if(input == answer) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				break;
			} else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} while(true);
				
	}
	
	private static void remake() {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		int min = 1;
		int max = 100;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(min + "�� " + max + "������ ���� �Է��ϼ��� : ");
			count++;
			input = s.nextInt();
			
			if(input == answer) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
				break;
			} else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
				min = input;
			} else {
				System.out.println("�� �������� �Է��ϼ���.");
				max = input;
			}
			
		}
	}
}
