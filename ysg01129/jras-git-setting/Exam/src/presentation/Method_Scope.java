package presentation;

import java.awt.image.AreaAveragingScaleFilter;

public class Method_Scope {

	String areaScope = "1";
	static String staticScope = "2";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startMethod();
		parameterMethod(1);
		returnMethod();
		overloadingMethod(1);
		overloadingMethod("���ڿ�");
		firstMethod();
		fx(1);
		
		Method_Scope method = new Method_Scope();
		
		String localScope = "3";
		
		String instanceScope = new String();
				
		System.out.println("���� ���� : " + localScope);
		System.out.println("���� ���� : " + method.areaScope);
		System.out.println("����ƽ ���� : " + staticScope);
		System.out.println("�ν��Ͻ� ���� : " + instanceScope);
		
	}
	
	private static void startMethod() {
		System.out.println("�޼ҵ带 �����մϴ�.");
	}
	
	private static void parameterMethod(int i) {
		System.out.println("�Ű������� ���� �޼ҵ� �Դϴ�. "
				+ "�Ű������� " + i + "�Դϴ�.");
	}
	
	private static int returnMethod() {
		int i = 100;
		System.out.println("���� ��ȯ�ϴ� �޼ҵ� �Դϴ�. "
				+ "��ȯ ���� " + i + "�Դϴ�.");
		return i;
	}
	
	private static void overloadingMethod(int i) {
		System.out.println("�����ε� �ϴ� �޼ҵ� �Դϴ�. �Ű������� " + i + "�Դϴ�.");
	}
	
	private static void overloadingMethod(String i) {
		System.out.println("�����ε� �ϴ� �޼ҵ� �Դϴ�. �Ű������� " + i + "�Դϴ�.");
	}
	
	private static void firstMethod() {
		System.out.println("ù��° �޼ҵ� �Դϴ�. "
				+ "�ι�° �޼ҵ�� �̵��մϴ�.");
		secondMethod();
	}
	
	private static void secondMethod() {
		System.out.println("�ι�° �޼ҵ� �Դϴ�. ����° �޼ҵ�� �̵��մϴ�.");
		thirdMethod("Hello");
	}
	
	private static void thirdMethod(String text) {
		System.out.println("������ �޼ҵ� �Դϴ�. �Ű������� " + text + "�Դϴ�.");
	}
	
	private static void fx(int i) {
		int sum = i + 1;
		System.out.println("���� = " + sum + "�Դϴ�.");
	}

	
}
