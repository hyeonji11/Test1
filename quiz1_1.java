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
		System.out.print("3�̻� 9�̸��� ������ �Է��Ͻÿ� : ");
		int num = input.nextInt();
		int num1 = num;
		do {
			total -= num;
			num1--;
		} while(num1>0);
		System.out.println("1~50������ Ȧ���� �� : "+sum);
		System.out.println("2000���� ������ �� �� : "+total);

	}

}
