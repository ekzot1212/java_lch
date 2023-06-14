package day11.practice;

public class ArrayRandomEx1 {

	public static void main(String[] args) {
		int [] arr = new int [3];
		
		int min = 1, max = 9;
		
		for(int i = 0; i<3; i++) {
			int random = (int)(Math.random() * (max - min +1) + min);
			arr[i] = random;
			System.out.println(arr[i]);
		}
	}
}
