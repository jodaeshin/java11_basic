package org.kh.object3;

import org.kh.object1.Member;

public class MemberEx3 {

	public static void main(String[] args) {
		Member s = new Member();
		s.setEmail("jds31135@naver.com");		 
		s.setId("jds2308"); 		 		        	
		s.setPw("eotls23089738@");  				
		s.setBirth(1999);     						
		s.setTel("01023089738");    
		System.out.println(s.toString());//= "01023089738";
		System.out.println("id : "+s.getId());
		System.out.println("pw : "+s.getPw());
		System.out.println("email : "+s.getEmail());
		System.out.println("birth : "+s.getBirth());
		System.out.println("Tel : "+s.getTel());
		
	}

}
