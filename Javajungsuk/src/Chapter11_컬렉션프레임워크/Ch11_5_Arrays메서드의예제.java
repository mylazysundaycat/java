package Chapter11_컬렉션프레임워크;

import java.util.Arrays;

public class Ch11_5_Arrays메서드의예제 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("add2D="+Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr5 = Arrays.copyOfRange(arr, 0, arr.length);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		
		String[] arr6 = new String[5];
		Arrays.fill(arr6, "skill");
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.setAll(arr7,i -> (int)((Math.random()*6)+1));
		System.out.println("arr7="+Arrays.toString(arr7));
		
		
	}
}
