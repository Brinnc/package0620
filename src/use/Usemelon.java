package use; //������ �� ���� ��Ű���� �־��!
import fruit.Watermelon; //������ ��ġ�� �˷���� ����� �� ����
//classpath : �ڹ��� Ŭ����

class  Usemelon{
	public static void main(String[] args) 
	{
		Watermelon wm=new Watermelon();
		int price=wm.getPrice();
		System.out.println("���ڰ�����"+price);
	}
}
