package emplyeePay;
/*
<Staff클래스>

1) Staff클래스는 Employee클래스의 name, sno 필드와 toString() 메소드를 상속 받는다.

2) 추가로 자신의 title와 staffpay변수를 갖으며 상속받는 2개의 변수와 자신의 변수를 초기화할 생성자를 갖는다.

3) 자식클래스의 생성자의 매개변수는 자신의 변수를 초기화하기 위한 2개의 매개변수뿐만 아니라 상속받는 2개의 변수를 초기화 하기 위한 매개변수도 나타내야 한다.

4) Employee 부모클래스의 name - > ename 매개변수의 값, sno - > esno 매개변수의 값을 가지고 온다.

5) 클래스의 각 변수의 값

출력할 형태로 연결된 문자열을 반환하는 toString()메소드

급여를 정하여 반환하는 earnings() 메소드
 */

public class Staff extends Employee {
	
	String title;
	int staffpay;
	
	public Staff(String name, String sno,String title ,int staffpay) {
		super(name, sno);
		this.title= title;
		this.staffpay=staffpay;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int earnings() {
		staffpay = staffpay +20;
		return staffpay;
	}

	@Override
	public String toString() {
		
		return super.toString()+"직책 : "+ title+ "급여액 : "+(staffpay+20)+"만원";
	}
	
	

	
}