package chap4;

public class IfExample {

	public static void main(String[] args) {
		// if��
		/*int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
			
		}
		if(score<90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		*/
		//ifelse��
		
		/*int score = 85;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}else { 
		System.out.println("������ 90���� �۽��ϴ�.");
		System.out.println("����� B�Դϴ�.");
		}*/
		//if else if else��
		int score = 75;
		if(score>=90){
			System.out.println("������ 100~90���Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		}else if(score>=80) {
			System.out.println("������ 80~90���Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}else if(score>=70) {
			System.out.println("������ 70~80���Դϴ�.");
			System.out.println("����� C�Դϴ�.");
			}else {
				System.out.println("������ 70���̸��Դϴ�.");
				System.out.println("����� D�Դϴ�.");
			}
			
		//�ֻ��� �̱�
		/*int num =(int)(Math.random() * 6) + 1;
			if(num == 1) {
				System.out.println("1���� ���Խ��ϴ�.");
	}else if(num==2) {
		System.out.println("2���� ���Խ��ϴ�.");
	}else if(num==3) {
		System.out.println("3���� ���Խ��ϴ�.");
}else if(num==4) {
	System.out.println("4���� ���Խ��ϴ�.");
}else if(num==5) {
	System.out.println("5���� ���Խ��ϴ�.");
}else {
	System.out.println("6���� ���Խ��ϴ�.");
}*/
	//switch��
		int num = (int) (Math.random() *6);
		switch(num){
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		default:
			System.out.println("6���� ���Խ��ϴ�.");
			break;
				}
		int time = (int) (Math.random() * 4) + 8;
			System.out.println("[���� �ð�:  "+ time + "��]");
				
			switch(time) {
			case 8:
				System.out.println("����� �մϴ�.");
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10:
				System.out.println("������ ���ϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
						}
			
			char grade = 'B';
			
			switch(grade) {
			case 'A':
			case 'a' :
			System.out.println("��� ȸ���Դϴ�.");
			break;
			case 'B' :
			case 'b' :
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			default:
				System.out.println("�մ��Դϴ�.");
				
			}
				String position = "����";
				
				switch(position) {
				case "����":
					System.out.println("700����");
					break;
				case "����":
					System.out.println("500����");
					break;
					default:
					System.out.println("300����");
				}
					
}
}

