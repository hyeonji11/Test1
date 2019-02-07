import java.util.Scanner;
public class quiz1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		int total = 2000;
		for(int i=1;i<=50;i++) {
			if(i%2==1)
				sum += i;
		}
		System.out.print("3이상 9미만의 정수를 입력하시오 : ");
		int num = input.nextInt();
		int num1 = num;
		do {
			total -= num;
			num1--;
		} while(num1>0);
		System.out.println("1~50사이의 홀수의 합 : "+sum);
		System.out.println("2000에서 정수를 뺀 값 : "+total);

	}

}
