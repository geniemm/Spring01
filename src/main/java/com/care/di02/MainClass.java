package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// classpath : resource폴더를 지정하는 문법
		// src/main/resources/applicationST.xml
		String path = "classpath:applicationST.xml";
		// 해당하는 경로의 파일을 실행시켜주는거 > 해당 bean값을 ioc컨테이너에 등록한다.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		STBean stb= ctx.getBean("stb",STBean.class); // bean을 가져올건데 stb(id값)를 가져올거고 자료형까지 가져와야함
		
		//stb.setName("홍길동2");
		//stb.setAge(30);
		
		stb.namePrint();
		stb.agePrint();
	}
}
