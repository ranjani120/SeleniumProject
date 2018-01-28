package javaprogram;

class Ja1 {
	public int add(int a, int b) {
		int sum = a + b;
		// return sum;
		System.out.println("parent class" + sum);
		return sum;
	}
}

class Jb2 extends Ja1 {
	public int add(int a, int b) {
		int addi = a + b;
		
		System.out.println("child class" + addi);
		return addi;
	}

	public int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
}

public class javap2 {

	public static void main(String[] args) {

		Ja1 obj1 = new Ja1();
		Ja1 obj2 = new Jb2();
		Jb2 obj3 = new Jb2();

		obj1.add(1, 3);
		obj2.add(1, 2);
		obj3.add(3, 4, 5);

		System.out.println("sum of numbers1"+ obj1.add(1, 3));
		System.out.println("sum of numbers2" + obj2.add(1, 2));
		System.out.println("sum of 3 numbers" +obj3.add(3, 4, 5));
	}

}
