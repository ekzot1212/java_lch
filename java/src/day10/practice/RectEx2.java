package day10.practice;

public class RectEx2 {

	public static void main(String[] args) {
		Rect3 rect = new Rect3(new Point2(0,0), new Point2(10,10) );
		rect.print();
		rect.move(10, 10);
		rect.print();
		rect.resize(0, 0, 30, 30);
		rect.print();
	}

}

class Rect3{
	
	private Point2 LUP,RDP;
	
	
	public Rect3(Point2 LUP, Point2 RDP) {
		this.LUP = LUP;
		this.RDP = RDP;
	}
	
	/**
	 * 사각형 정보를 출력하는 메서드 
	 * 매개변수 : 
	 * 반환타입 : 
	 * 메서드명 :
	 */
	
	public void print() {
		System.out.println("=================");
		LUP.print();
		RDP.print();
	}
	
	/**
	 * 사각형을 이동시키는 메서드 
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y 
	 * 리턴타입 : 
	 * 메서드명 : move
	 */
	
	public void move(int x, int y) {
		int xx = LUP.getX() + x;
		int yy = LUP.getY() + y;
		int xxx = RDP.getX() + x;
		int yyy = RDP.getY() + y;
		LUP.move(xx, yy);
		RDP.move(xxx, yyy);
	}
			
			
			
		/**사각형의 크기를 변경하는 메서드
		 * 매개변수 : 변경된 사각형의 왼쪽 위의 x,y 좌표와
		 * 			가로 , 세로가 주어지면 사각형의 크기를 변경하는 메서드.
		 * 			=> int x, int y, int w, int h
		 * 리턴타입 : 없음
		 * 메서드명 : resize
		 */
	public void resize(int x, int y, int w, int h) {
		LUP.move(x, y);
		RDP.move(x + w, y + h);
	}
	
}
	


