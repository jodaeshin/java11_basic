package org.kh.app;
import java.util.Scanner;
// 조건문 if ~else if (~else~) 
public class Condition3 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.printf("점수 입력[0-100] :");
			int point = scan .nextInt();
			char result;
			/* 학점은(result) 점수가(point) 90~100이면 'A' , 80~89이면 , 'B'
			 	70~79이면 'C' , 60~60이면 'D' , 60미만이면 'F'
			*/
			if(point>=90) {
				result = 'A';
			}   else if (point>=80) {
				  result = 'B';
			}   else if (point>=70) {
				  result = 'C';
			}   else if (point>=60) {
				  result = 'D';
			}	  else {
				 result = 'F';
				
			}
			
		
			System.out.printf("\n당신의 점수는 %d점 입니다." ,point);
			System.out.printf("\n당신의 학점은" + result +"입니다 ");
			
	}	
	

}
