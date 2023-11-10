package ex04controlstatement;

public class QuPryamid03
{
	public static void main(String[] args)
	{
//		산모양(밑 별9개) for문
		for(int i = 1; i<=5; i++)
		{
			for(int j=i; j<=4; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1 ;j++ )
			{
				System.out.print("*");
			}
			
			for(int j=i; j<=4; j++) 
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}
}
