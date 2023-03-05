import java.util.Scanner;

public class code_10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] input2 = new int[input.length];
		for(int i=0; i<input.length; i++) {
			input2[i] = Integer.parseInt(input[i]);
		}
		int A = input2[0];
		int B = input2[1];
		int C = input2[2];
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		
	}
}
