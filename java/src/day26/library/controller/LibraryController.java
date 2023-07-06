package day26.library.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.LoanBrowsing;

public class LibraryController {

	private Scanner sc = new Scanner(System.in);
	private List<Book> bookList = new ArrayList<>();
	private List<LoanBrowsing> loanlist = new ArrayList<>();
	
	private final static int EXIT = 4;
	
	public void run() {
		int menu;
		
		String fileName = "java/src/day26/library/book.txt";
		String loadFileName = "java/src/day26/library/loan.txt";
		loadBook(fileName);
		loadLoan(loadFileName);
		
		do {
			System.out.println("================");

			//메뉴 출력
			printMenu();
			//메뉴 선택(메뉴를 입력받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			
			System.out.println("================");
		}while(menu != EXIT);
		
		saveBook(fileName);
		saveLoan(loadFileName);
		sc.close();
	}
	
	
	private void saveLoan(String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (LoanBrowsing tmp : loanlist) {
				oos.writeObject(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadLoan(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while (true) {
				LoanBrowsing tmp = (LoanBrowsing)ois.readObject();
				loanlist.add(tmp);

			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {
			System.out.println("불러오기 완료 !");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("LoanBrowsing 클래스를 찾을 수 없습니다.");
		}
	}
	
	
	private void saveBook(String fileName) {
		// 학생 정보를 저장 -> 리스트 -> 하나씩 꺼내서 저장
		// 저장 -> OutputStream
		// 읽어오기 편하려고 객체 단위로 저장 -> ObjectOutputStream
		// FileOutputStream = 기반 스트림, ObjectOutputStream의 상위

		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Book tmp : bookList) {
				oos.writeObject(tmp); // 이거 쓸려면 Student클래스 Serializable 인터페이스 구현해야 함.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void loadBook(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while (true) {
				Book tmp = (Book)ois.readObject();
				bookList.add(tmp);

			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {
			System.out.println("불러오기 완료 !");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
//ObjectInputStream을 이용하여 객체단위로 읽어올 때 클래스가 Serializable 인터페이스를 구현하지 않으면 발생
			System.out.println("Book 클래스를 찾을 수 없습니다.");
		}
		System.out.println(bookList);
	}
	
	private void printMenu() {
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 대출");
		System.out.println("3. 도서 반납");
		System.out.println("4. 종료");
		System.out.println("메뉴 선택 : ");

	}
	
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			loanBook();
			break;
		case 3:
			returnBook();
			break;
		case 4:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴 선택 !");
		}
	}





	private void returnBook() {
		//엔터 처리
		sc.nextLine();
		//반납도서 번호를 입력
		System.out.println("도서 번호");
		String num = sc.nextLine();
		System.out.println(num);
		//대출한 도서가 아니면 반납을 X
		int index = bookList.indexOf(new Book(num, null, null, null));
		if(index == -1) {
			System.out.println("대출한 도서가 아닙니다.");
			return;
		}
		//맞으면 반납
		//반납한 도서의 상태를 대출 가능으로 수정
		Book returnBook = bookList.get(index);
		returnBook.returnBook();
		
		//대출열람 리스트에서 대출한 도서에 반납일을 오늘날짜로 수정
		//반납한 도서의 대출 열람을 찾아야 함.
		int lbIndex = loanlist.lastIndexOf(new LoanBrowsing(returnBook, null, 14));
		LoanBrowsing tmpLb = loanlist.get(lbIndex);
		tmpLb.setReturnDate(new Date());
		System.out.println("대출일 : " + tmpLb.getLoanDateStr());
		System.out.println("반납일 : " + tmpLb.getReturnDateStr());
		
		/*
		 * 내코드
		Book book = new Book(userNum, null, null, null);
		int bookIndex = bookList.indexOf(book);
		// 왜 대여리스트 객체 생성해서 비교하는대 비교가 안됨??????????????
		LoanBrowsing lb = new LoanBrowsing(bookList.get(bookIndex), null, 0);
		int loanIndex = loanlist.indexOf(lb);
		*/
	}




	private void loanBook() {
		// 대여 가능한 도서들을 조회 (대여중이 아닌 도서들)
		//Stream<Book> stream = bookList.stream(); // 기존 리스트를 이용하여 스트림을 생성
		bookList
		.stream()
		.filter(b -> !b.isLoan())	//대여 가능한 도서만 추출
		.forEach(b -> { 			//추출한 도서를 출력
			System.out.println("=================");
			System.out.println(b);
			System.out.println("=================");
		});
		
		/* 그냥 반복문으로 하기
		for (Book tmp : bookList) {
			if (!tmp.isLoan()) {
				System.out.println("=================");
				System.out.println(tmp);
				System.out.println("=================");
			}
		}
		*/

		// 도서 번호를 입력
		sc.nextLine();
		System.out.println("도서 번호 : ");
		String num = sc.nextLine();
		
		// 대여을 신청
			//도서 번호가 올바른지 확인
			//번호에 맞는 도서가 있는지 확인
		
			//도서가 없으면 올바르지 않음
		
			//도서가 있으면 대여중인지 확인
		boolean possible 
			= bookList
				.stream()
				.filter(b->!b.isLoan() && b.getNum().equals(num))
				.count() > 0;
				
			//올바르지 않으면(없는 도서번호이거나, 대여중인 도서인 경우)
			//대여할 수 없다고 출력
		if(!possible) {
			System.out.println("대출할 수 없습니다.");
			return;
		}
			//올바르면 대여를 진행
			//도서 대출 객체를 생성. 도서, 대여일, 대여기간
		int index = bookList.indexOf(new Book(num, null, null, null));
		LoanBrowsing lb 
		= new LoanBrowsing(bookList.get(index) , new Date(), 14);
		//대출 열람 리스트에 추가
		loanlist.add(lb);
		bookList.get(index).loanBook();		//도서에 대출했다고 수정. (boolean)
			//대여일을 출력
		System.out.println("대여일 : " + lb.getLoanDateStr());
			//반납예정일을 출력
		System.out.println("반납일 " + lb.getEstimatedDateStr());
	}
	
	private void insertBook() {
		sc.nextLine();
		//도서 정보 입력
		System.out.print("도서 번호 : ");
		String num = sc.nextLine();
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		System.out.print("ISBN : ");
		String isbn = sc.nextLine();
		
		//입력 정보를 이용하여 도서 객체를 생성
		Book book = new Book(num,title,author, isbn);
		//도서 리스트에 도서 객체를 추가
		if(bookList.contains(book)) {
			System.out.println("이미 등록된 도서 번호입니다.");
			return;
		}
		
		bookList.add(book);
	}

	
}

