package com.mine.collect;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

public class app {
	
	
	public static void main(String[] args) {
		
		Product prod1 = new Product(1L, 1, new BigDecimal("15.5"), "���", "��ʳ");
		Product prod2 = new Product(2L, 2, new BigDecimal("20"), "����", "��ʳ");
		Product prod3 = new Product(3L, 3, new BigDecimal("30"), "�±�", "��ʳ");
		Product prod4 = new Product(4L, 3, new BigDecimal("10"), "�ൺơ��", "ơ��");
		Product prod5 = new Product(5L, 10, new BigDecimal("15"), "����ơ��", "ơ��");
		List<Product> prodList = Lists.newArrayList(prod1, prod2, prod3, prod4, prod5);
		
		Map<String, List<Product>> prodMap= 
				prodList.stream().collect(Collectors.groupingBy(e->e.getCategory()));
		
	}
}
