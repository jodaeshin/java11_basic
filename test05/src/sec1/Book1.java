package sec1;

public class Book1 {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	public void print() {
		System.out.println("교재 정보");
	}
	public void print(String bname) {
		System.out.println("교재명 :" +bname);
	}
	public void print(int price) {
		System.out.println("교재 가격 :" +price);
	}public void print(String bname, int price) {
		System.out.println("교재 가격 :" +price);
		System.out.println("교재명 :" +bname);
	}public void print(String bname, int price, String author) {
		System.out.println("교재 가격 :" +price);
		System.out.println("교재명 :" +bname);
		System.out.println("저자 :" +author);
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Book1 [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ ", getBno()=" + getBno() + ", getBname()=" + getBname() + ", getPrice()=" + getPrice()
				+ ", getAuthor()=" + getAuthor() + ", getPub()=" + getPub() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
