package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		 int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		 
		 boolean isPossible = false;
		 // ���� ���� ����
		 /* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		 /* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		 age = human.getAge();
		 if(age >= 16 && age <=69) {
			 isPossible = true;
		 }		
		 return isPossible;
		 }
		 
		 public String action(Human human) {
		 String result = ""; // ���� ��� ����
		 String name = "";
		 name = human.getName();
		 /* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		
		
		 /* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		 if(isPossible(human) == true ) {
			result = "������ �����մϴ�. "+ name +"�� �����մϴ�.";
		 
		 /* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		 }else {
			result = name +"�� ������ �Ұ��� �մϴ�.";
		 }
		 return result;
		 }
}
