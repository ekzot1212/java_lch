package day23.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputStreamEx1 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			/*
			 * test,txt는 상대 경로. 기준은 프로젝트 폴더가 기준
			 */
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found !");
		}/* finally {
			// 프로그램 종료 전 사용했던 파일을 닫아줌.
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}*/
		
		Scanner sc = new Scanner(System.in);
		//파일을 쓰는 예제
		try(FileOutputStream fos = new FileOutputStream("test.txt")){
			for (int i = 0; i < 5; i++) {
				System.out.print("Input : ");
				char ch = sc.next().charAt(0);
				fos.write(ch);
			}
		} catch (FileNotFoundException e1) {
			System.out.println("File not found !");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//파일을 읽는 예제
		// 00000000 00000000 00000000 00110001
		// 트라이 리소스문 -> 파일을 자동으로 닫아줌 (위 코드와 아래 코드 결과는 같은거임)
		try (FileInputStream fis2 = new FileInputStream("test.txt")) {
			int data;
			while ((data = fis2.read()) != -1) {
				System.out.println((char)data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found !");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(1);
		System.out.println((int) '1');
	}

}
