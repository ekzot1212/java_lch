package day17.practice.vo;

import lombok.Data;

@Data
public class Product {
	// 멤버 변수 : 제품 판매와 관련된 정도
	private String name;	//	제품명
	private String modelname;	//	모델명
	private int price;		//	가격
	private int amount;		//	수량(판매 수량, 전체 재고량)
	private String category; 	//분류
	
	// 생성자
	public Product(String name, String modelname, int price, int amount, String category) {
		this.name = name;
		this.modelname = modelname;
		this.price = price;
		this.amount = amount;
		this.category = category;
	}
	
	///복사 생성자
	public Product(Product product) {
		this.name = product.name;
		this.modelname = product.modelname;
		this.price = product.price;
		this.amount = product.amount;
		this.category = product.category;
		}

	public Product(String search) {
		this.name =search;
	}


	// 메서드
	/** 제품 입고 기능 -> 현재 수량에 주어진 수량을 누적 */
	public void store(int amount) {
		//제품 수량은 음수로 입력할 수 없다.
		if(amount < 0) {
			return;
		}
		this.amount += amount;
	}
	/** 제품 출고 기능 -> 현재 수량에서 주어진 수량을 감소 */
	public void release(int amount) {
		if(amount <0) {
			return;
		}
		this.amount -= amount;
	}
	private void accumulate(int amount) {
		this.amount += amount;
	}



	public void print() {
		System.out.println("================");
		System.out.println("제품명 : " + name);
		System.out.println("모델명 : " + modelname);
		System.out.println("분류 : " + category);
		System.out.println("재고 : " + amount);
		System.out.println("가격 : " + price);
	}

	
	
	
}
