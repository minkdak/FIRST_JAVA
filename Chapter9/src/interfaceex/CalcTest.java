package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인터페이스 타입으로 선언 가능.
//		Calc calc = new CompleteCalc();
//		Calculator calc = new CompleteCalc();
		CompleteCalc calc = new CompleteCalc();
		// 인터페이스는 구현코드가 없어서 타입상속이라고도한다.
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
//		calc.showInfo();
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
