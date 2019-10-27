package problema;
import java.util.*;
public class tema3 {
private static Scanner input;
public static void main(String[] args)
{
	int n,m;
	input = new Scanner(System.in);
	n=4;
	m=4;
	int s=0;
	int p=1;
	int A[][]=new int [n][m];
	int i,j;
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
		{
			System.out.print("A["+i+"]["+j+"]=");
			A[i][j]=input.nextInt();
			if(i==j)
				s=s+A[i][j];
			if(i+j==n-1)
				p=p*A[i][j];
		}
	System.out.println("Matricea citita este:");
	for(i=0;i<n;i++)
	{for(j=0;j<m;j++)
			System.out.print(" "+A[i][j]);
			System.out.println();
		}
	
	//for(i=0;i<n;i++)
		//for(j=0;j<m;j++)
		//{if(i==j)
			//s=s+A[i][j];
		//if(i+j==n-1)
			//p=p*A[i][j];
	//	}
	System.out.print("suma este " +s);
	System.out.println();
	System.out.print("produsul este " +p);
	
}
}
