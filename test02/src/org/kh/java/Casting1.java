package org.kh.java;
//형 변환1 (Auto Casting, Force Casting) = type conversion

public class Casting1 {
	public static void main(String[] args) {
		//Auto Casting (묵시적 형병환) : 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮겨지면서 타입이 자동으로 변환되는것 
		byte b = 20;  //1byte (정수형)
		short s = b;  //2byte (정수형)  byte => short 
		int i = s;	  //4byte (정수형)  short => int
		long l = i;	  //8byte (정수형)  int => long
		
		//Force Casting (명시적 형변환) :  큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 변환 
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
		
		
	}

}
