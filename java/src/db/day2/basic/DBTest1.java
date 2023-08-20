package db.day2.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection con = null;
		
		// url : jdbc:DMBS종류:// 주소/ DB명
		String url = "jdbc:mysql://localhost:3306/test";
		System.out.print("DB 계정 : ");
		String dbId = sc.next();
		System.out.print("DB 비번 : ");
		String dbPw = sc.next();
		
		try {
			con = DriverManager.getConnection(url, dbId, dbPw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공");
		
		
		
		/*
		String sql = "insert into member(me_id, me_pw) values(?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			//회원가입할 아이디와 비번을 입력
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			//쿼리에 있는 ? 대신 입력한 아이디와 비번을 넣어줌
			//setXXX(Index, value) : index는 ?의 위치로 1부터 시작, value는 ?대신 들어갈 값
			ps.setString(1,id);
			ps.setString(2, pw);
			
			//쿼리를 실행
			int resultCount = ps.executeUpdate();
			if(resultCount != 0) {
				System.out.println("회원가입 성공!");
			}else {
				System.out.println("회원가입 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		/*
		String sql = "update member set me_board_count = ? where me_id  = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			// ?에 들어갈 값을설정
			System.out.print("ID : ");
			String id = sc.next();
			ps.setString(2, id);
			
			System.out.print("정수 : ");
			int count = sc.nextInt();
			ps.setInt(1, count);
			//쿼리를 실행 
			// .executeUpdate() : insert, update, delete를 실행 했을때 실행이 적용된 갯수를 리턴함
			int resultCount = ps.executeUpdate();
			if(resultCount != 0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		String sql = "select me_id, me_pw, me_board_count from member";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			//?설정 => ?가 없어서 생략
			
			// 쿼리를 실행
			ResultSet resultSet = ps.executeQuery();
			//select문은 반복문을 통해서 값을 읽어옴
			while(resultSet.next()) {
				String id = resultSet.getString(1);
				String pw = resultSet.getString(2);
				int boardCount = resultSet.getInt(3);
				System.out.println(id + " : " + pw + " : " + boardCount);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// 커넥터가 널이 아니고, 닫혀있지 않으면 -> Connection 닫아주기
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
