 package javaprogram;

public class javap3 {
	public static void sal()
	{ 
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++) 
			{
			System.out.print("*  ");
			
			//System.out.println(i);
			//System.out.println(j);
			}	
			System.out.println(i);
	     }
	}	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
			
         javap3 s=new javap3();
          s.sal();
	}}

