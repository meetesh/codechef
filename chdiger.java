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
		ArrayList<Integer> list = new ArrayList<>();
		while(t-- > 0)
		{
			long n = scanner.nextLong();
			int d = scanner.nextInt();
			long temp = n;
			int smallest = 9;
			int smallestIndex = 0;
			int p;
			int count =  0;
			while(temp>0)
			{
				p = (int)((temp%10));
				if(p<=smallest) 
				{
					smallest = p;
					smallestIndex = count;
				}
				list.add(p);
				temp /= 10;
				count++;
			}
			if(d<=smallest)
			{
				for(int i =0;i<=list.size()-1;i++)
				{
					list.set(i,d);
				}				
			}
			else
			{
				//2 6 4 4 6 
				//3
				int i = smallestIndex;
				int j = list.size()-1;
				while(i>=0)
				{
					list.set(j,list.get(i));
					i--;
					j--;
				}
				p = -1;
				while(j>=0) list.set(j--,d);
				for(i = smallestIndex;i>=0;i--)
				{
					if(list.get(i) > d) {p = i;break;}
				}
				i = p;
				while(i>=0) list.set(i--,d);
				
			}
			temp = 0;
			long tt = 1;
			for(int i =0;i<list.size();i++)
			{
				temp +=  (list.get(i) * tt);
				tt *= 10;
			}
			System.out.println(temp);
			list.clear();
		}
	}
}
 