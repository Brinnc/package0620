package use; //컴파일 시 유즈 패키지에 넣어라!
import fruit.Watermelon; //수박의 위치를 알려줘야 사용할 수 있음
//classpath : 자바의 클래스

class  Usemelon{
	public static void main(String[] args) 
	{
		Watermelon wm=new Watermelon();
		int price=wm.getPrice();
		System.out.println("수박가격은"+price);
	}
}
