package day23.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		//쓰는건 아웃풋 , 읽어오는건 인풋
		try (FileOutputStream fos = new FileOutputStream("output1.txt")){
			for( int i = 1 ; i < 11 ; i++) {
				System.out.println("Input : " + i);
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try(
				FileOutputStream fos = new FileOutputStream("output2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeChars("Hello\n");
			for(int i = 1; i<=10 ; i ++) {
				oos.writeInt(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
