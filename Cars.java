package UdemyPractice;

public class CarDemo {

	public static void main(String[] args) {
		Car bmw=new Car();
		Car benz=new Car();
		benz.setModel("benz");
		System.out.println(benz.getModel());
		bmw.setModel("X100");
		System.out.println(bmw.getModel());
		
		bmw.setColor("Black");
		System.out.println(bmw.getModel());
		

		bmw.setYear(2023);
		System.out.println(bmw.getYear());
	}

}