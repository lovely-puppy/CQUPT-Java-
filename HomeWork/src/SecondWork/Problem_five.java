package SecondWork;
import java.util.Scanner;
public class Problem_five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first number:");
		int x = sc.nextInt();
		System.out.println("Please input the second number:");
		int y  = sc.nextInt();
		System.out.println("Please input the third number:");
		int z = sc.nextInt();
		int tmax = Math.max(Math.max(x, y), z);
		System.out.println("The maximum number is:"+tmax);
	}
}
