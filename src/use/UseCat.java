package use;
import animal.Cat; //논리상으로는 해당 코드가 맞지만 자바의 슬로건 상 OS중립성에 위배됨

class UseCat{ //현실의 사물을 반영하기위함이 아닌 프로그램의 시작점이 되기위한 클래스일뿐
	public static void main(String[] args){
		new Cat();
		System.out.println("고양이 탄생");
		//String name=new Cat().name;
		//System.out.println("고양이의 이름은"+name);
	}
}