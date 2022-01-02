package prashant;

import java.util.Scanner;

public class BatPattern {
	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in); 
	System.out.println("Please enter even number..!(use column and row same )");
	System.out.print("Enter Row = ");
	int r=sc.nextInt();
	System.out.print("Enter Column = ");
	int c=sc.nextInt();
	
	System.out.println("\n\n... And Butterfly( or Bat) is here.....");
	System.out.println();
	
		int k=1;
        int	mid=r/2;
		for(int i=1;i<=r;i++)
		{ 
			k=i>=mid+1?k-1:k+1;
			for(int j=1;j<c;j++)
			{
			   
			   if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
				{	
				    if(j>=k+1 && j<=c-k)
				    	System.out.print("  ");
				    else
					System.out.print(" *");
													
				}
			
				else
					System.out.print("  ");
			}
			System.out.println();
						
		}
		
	}

}
