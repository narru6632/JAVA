package ex04controlstatement;

public class E03WhilP
{
	public static void main(String[] args)
	{
		int i = 1; 
		while(i<=9) {
			int j = 2; 
			while(j<=9){
				System.out.printf("%-2d*%-2d=%2d", j, i, (i*j));
				System.out.print("     ");
				j++;			
			}
			System.out.println();
			i++;					
			
		}
		
		System.out.println("=================================================================================");
		
		
		for(int a=2; a<=9; a++) {
			System.out.printf("%d 단 : ",a);
			for(int b=1; b<=9; b++) {
				System.out.printf("%-2d*%2d = %-2d    ",a,b,(a*b));
			}
			System.out.println();
		}
		
		
		
		
	}
}
