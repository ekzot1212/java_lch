package day18.homework;

import java.util.Scanner;

/*
 * 파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요.
 * 이미지 확장자 : jpg, bmp, png
 * input : dog.jpg
 * dog.jpg : Image
 * 
 * input : dog.exe
 * dog.exe : Not image
 * 
 */
public class ImgEx1 implements Program1 {
	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input File name : ");
		
		String imageName[] = { "jpg", "bmp", "png" };

		String str = sc.nextLine();
		String fileName[] = str.split("\\.");

		for (int i = 0; i < imageName.length; i++) {
			if (fileName[fileName.length - 1].equals(imageName[i])) {
				System.out.println(str + " : is Image.");
				break;
			}
			if (i == imageName.length - 1) {
				System.out.println(str + " : is  not Image.");
			}
		}

	}

	
	
}
