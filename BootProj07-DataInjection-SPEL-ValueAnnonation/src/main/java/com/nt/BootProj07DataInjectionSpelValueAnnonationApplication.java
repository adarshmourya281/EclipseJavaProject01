package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.HotelInfo;
import com.nt.sbeans.HotelMenu;

@SpringBootApplication
public class BootProj07DataInjectionSpelValueAnnonationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj07DataInjectionSpelValueAnnonationApplication.class, args);
		HotelMenu menu=ctx.getBean("menu",HotelMenu.class);
		System.out.println(menu);
		HotelInfo hni=ctx.getBean("hInfo",HotelInfo.class);
		System.out.println(hni);
	}

}
