package day16.homework.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Beverage {private String name;
private int price;
private int amount;

public void store(int amount) {
	if(amount < 0) {
		return;
	}
	this.amount += amount;
}

/*
public Beverage(String name, int price, int amount){
	this.name = name;
	this.price = price;
	this.amount = amount;
}
*/
}