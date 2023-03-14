package SecondWork;

import java.util.Scanner;

public class Problem_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n + " to " + m + " WanShu:");
		for (int i = n; i <= m; i ++ ) {
			if (get(i)) {
				System.out.print(i + ",");
			}
		}
	}
	
	static boolean get(int x) {
		int sum = 0;
		for (int i = 1; i < x; i ++ ) {
			if (x % i == 0) sum += i;
		}
		if (sum == x) return true;
		return false;
	}
}
