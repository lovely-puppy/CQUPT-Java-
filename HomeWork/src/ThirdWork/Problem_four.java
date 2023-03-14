package ThirdWork;
import java.util.Scanner;
public class Problem_four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
		int n = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= n; i ++ ) res += get(i);
		System.out.println("1+2!+3!+...+n!= " + res);
	}
	static int get(int x)
	{
		if (x == 1) return 1;
		return get(x-1)*x;
	}
}
