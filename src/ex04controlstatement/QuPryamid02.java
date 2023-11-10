package ex04controlstatement;

public class QuPryamid02
{
	public static void main(String[] args)
	{
		//역계단 do while
		int i=1;
		do
		{ int j=1;
			do
			{
				System.out.print("* ");
				j++;
			} while (j<=6-i);//do while 2
		System.out.println("");
		i++;
		} while (i<=5);//do while 1
		
		
		
		
	}// main
}
