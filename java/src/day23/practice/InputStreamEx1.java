package day23.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("output1.txt")){
			
			int data;
			while ((data = fis.read()) != -1) {
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
				FileInputStream fis = new FileInputStream("output2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			System.out.println(ois.readLine());
			for(int i = 1; i<= 10 ; i++) {
				System.out.println(ois.readInt());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
