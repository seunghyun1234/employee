package emplyeePay;

import java.util.Scanner;

/*
1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.

2. 사원번호, 이름을 입력

3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.

사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.

4. 관리자 - 직책과 임금을 입력

정규직 - 부서, 업무, 임금을 입력

임시직 - 부서, 월 근무시간수

5. 직무 유형에 따라 수당

관리자 : 20만원 정규직 : 10만원을 더해서 급여액을 더하여 출력한다.

임시직 : 시간당 3만원으로 정하고 시간 수에 월급여액을 구해서 출력한다.
 */

public class TestEmploye {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("입력 자료 수 : ");
		int n = in.nextInt();
		Employee[] emp = new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("사원번호,이름...");
			String no=in.next();
			String name=in.next();
			System.out.println("사원의 근무유형 : (1:CEO, 2:정규직, 3:임시직)");
			int num = in.nextInt();
			switch (num) {
			
			case 1: {
				System.out.println("직책, 월 임금...");
				String us= in.next();
				int mon = in.nextInt();
				Staff sa = new Staff(name,no,us,mon);
				emp[i]=sa;
				break;
			}
			case 2:{
				System.out.println("부서, 업무, 월 임금...");
				String us1= in.next();
				String uss1= in.next();
				int mon1 = in.nextInt();
				RegEmployee re = new RegEmployee(name,no,us1,uss1,mon1);
				emp[i]=re;
				break;
				
			}
			case 3:{
				System.out.println("부서, 월 근무시간 수...");
				String us2= in.next();
				int mon2 = in.nextInt();
				TempEmployee te =new TempEmployee(name,no,us2,mon2);
				emp[i]=te;
				break;
				
			}
			default: System.out.println("근무유형 오류 재입력 ...");
			i--;
				
			}
						
		}
		
		System.out.println("급여 보고서");
		for(int i =0;i<n;i++) {
			System.out.println(emp[i]);
		}
		
		
	
	}
	//필드선언시 클래스타입, 임시직, 정규직
			//필드선언시 기본타입변수, String no, name
			//main메서드 매개변수인 args를 배열선언한다. 
			//부모의 클래스를 입력하는 개수로 배열을 만든다.
			//1.입력 자료수 만큼 반복문for 변수 i
			//2.system.out,print("사원번호,이름..");
			//3.no,name에 사원번호와 이름을 넣는다.
			//4.System.out.println("사원의 근무유형 : (1:CEO,2:정규직,3:임시직)");
			//6.입력된 eno 1과 3사이에 있어야 된다. => if(eno<1||eno>3)
			//입력은 직책 title,급여 pay
			//Staff sa = title,급여pay
			//emp[i] = sa
			//9. case 2 : RegEmployee클래스 적용
			//10.case 3 : TempEmployee클래스 적용
			// default : }
			
			//급여보고서 
			//향상된 for(데이터타입 번수 : 배열 emp){
			// System.out.println(변수 + "급여액 : " + 변수.earningd()+"만원" )}

}
