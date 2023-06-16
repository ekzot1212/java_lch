package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		//버블 정렬 에제
		int arr[] = {1, 4, 7, 8, 2, 8, 3, 6};
		
		for(int i = 0; i<arr.length-1 ; i++) {		// i = 행
			for(int j = 0; j<arr.length-1-i ; j++) {		// j = 열
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr [j] = arr[j+1];
					arr [j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		Integer arr2[] = {1, 4, 7, 8, 2, 8, 3, 6};
		Arrays.sort(arr2);		//Integer 자료형으로 sort 메서드 사용가능
		Arrays.sort(arr2, Comparator.reverseOrder());		//내림차순
		for(Integer tmp : arr2) {
			System.out.print(tmp + " ");
		}
	}

}
