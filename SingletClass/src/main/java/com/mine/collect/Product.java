package com.mine.collect;

import java.math.BigDecimal;

public class Product{

private Long id;
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Integer getNum() {
	return num;
}

public void setNum(Integer num) {
	this.num = num;
}

public BigDecimal getPrice() {
	return price;
}

public void setPrice(BigDecimal price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

private Integer num;
private BigDecimal price;
private String name;
private String category;
public Product() {
}
public Product(Long id, Integer num, BigDecimal price, String name, String category) {
	 this.id = id;
	 this.num = num;
	 this.price = price;
	 this.name = name;
	 this.category = category;
	}

@Override
public String toString() {
    return "Product{" +
            "id='" + id + '\'' +
            ", num='" + num + '\'' +
            ", price='" + price + '\'' +
                        ", name='" + name + '\'' +
                                    ", category='" + category + '\'' +

            '}';
}
}