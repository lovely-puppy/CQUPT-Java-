package SecondWork;
import java.util.*;
public class Problem_three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int sum = x + y + z;
		double average = (double)sum / 3;
		System.out.println("sum=" + String.format("%.1f", (double)sum).toString());
		System.out.print("average=" + String.format("%.1f", average).toString());
	}
	
}
