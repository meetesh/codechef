import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t = 0;
		if(scanner.hasNext()) t = scanner.nextInt();
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int maxGroupSize = 0;
			int minGroupSize = 0;
			for(int i = 0;i<n;i++)
			{
				int num = scanner.nextInt();
				if(num<0) minGroupSize++;
				else maxGroupSize++;
			}
			if(minGroupSize == 0) minGroupSize = maxGroupSize;
			else if(maxGroupSize == 0) maxGroupSize = minGroupSize;
			System.out.println(maxGroupSize+" "+minGroupSize);
		}
	}
}
 