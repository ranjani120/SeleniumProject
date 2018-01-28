package javaprogram;

class Add
{
 public int addi(int a, int b)
{
	int c=a+b;
	return c;
}
 
 public int addi(int a,int b ,int c)
 {
	 int d=a+b+c;
	 return d;
 }

}



public class javap1 {

	public static void main(String[] args) {
		
		Add a=new Add();
       a.addi(2,5);
       System.out.println("sum of two number"+a.addi(2,5));
	}

}
