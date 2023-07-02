package day23.stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SerializableEx1 {

	public static void main(String[] args) {
		Student std1 = new Student(1, 1, 1, "Hong");
		Student std2 = new Student(1, 1, 2, "Lim");
		// 보조 스트림들은 매개변수로 기본 스트림이 필요함 ! (오브젝트아웃풋스트림 = 보조 스트림)
		try (FileOutputStream fos = new FileOutputStream("Student.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					oos.writeObject(std1);
					oos.writeObject(std2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Student> list = new ArrayList<>();
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream("Student.txt"))){
				while(true) {
					Student tmp = (Student)ois.readObject();
					list.add(tmp);
					
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("File Read Complete !");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
			
		System.out.println(list);

	}

}

@Data
@AllArgsConstructor
class Student implements Serializable{	
//버전이 같아야 직렬화, 역직렬화 가능함.
	private static final long serialVersionUID = -539401438627140246L;
	
	private int gradem, classNum, num;
	private String name;
	//private String registerId; 
	
	
}