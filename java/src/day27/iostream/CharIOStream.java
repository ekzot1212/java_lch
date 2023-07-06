package day27.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//스트링 파일 입출력 설명 안했다고 해서 추가로 예제 하심
public class CharIOStream {

	public static void main(String[] args) {
		//문자 단위로 읽어오는 예제
		try(FileReader fr = new FileReader("file.txt")){
			char buffer[] = new char[1024];
			while(fr.read(buffer) != -1) {
				System.out.print(buffer);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found !");
		} catch (IOException e) {
			System.out.println("Exception !");
		}
		
		//문자 단위로 쓰는 에제
		//FileWriter 생성자(파일명, 이어쓰기 여부)
		//FileWriter 생성자(파일명) : 이어쓰기 여부가 false로 생성됨
		try(FileWriter fw = new FileWriter("file.txt", true)){	//true 붙이면 계속 늘어남 (?)
			String str ="I'm hungry !\n";
			fw.write(str);
			String str2 ="Hello world! \n";
			fw.write(str2);
		} catch (IOException e) {
			System.out.println("Exception !");
			e.printStackTrace();
		}
	}

}
