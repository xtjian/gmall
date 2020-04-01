package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.service.ProductService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {

	@Autowired
	public ProductService memberPriceService;
	@Test
	public void contextLoads() {
		System.out.println(memberPriceService.getById(1).toString());
	}

}
