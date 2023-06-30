package day23.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("test.txt");		//기본에다가
			BufferedInputStream bis = new BufferedInputStream(fis);		//여러개 한번에 읽어와서 빨라지게 하고
			InputStreamReader isr = new InputStreamReader(bis)){		//문자열?
			char ch[] = new char[1024];
			while(isr.read(ch) != -1) {
				System.out.println(ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
