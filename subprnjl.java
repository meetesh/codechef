import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static int[] countingSort(int[] ar,int l,int r, int minVal, int maxVal) 
	{
		int sz = maxVal - minVal + 1;
		int nArr[] = new int[r-l+1];
		int[] B = new int[sz];
		for (int i = l; i <= r; i++) B[ar[i] - minVal]++;
		for (int i = 0, k = 0; i < sz; i++)
		  while (B[i]-- > 0) nArr[k++] = i + minVal;
	    return nArr;
    }
	public static boolean exists(int arr[],int l,int r,int q)
	{
		for(int i = l;i<=r;i++)
		{
			if(arr[i] == q) return true;
		}
		return false;
	}
	public static int count(int arr[],int q)
	{
		int c = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == q) c++;
		}
		return c;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t = 0;
		if(scanner.hasNext()) t = scanner.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		int answer = 0;
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int arr[] = new int[n];
			int l,r;
			for(int i =0;i<n;i++)
			{
				arr[i] = scanner.nextInt();
			}
			int count = 0;
			int nArr[];
			for(int i =0;i<arr.length;i++)
			{
				for(int j = i;j<arr.length;j++)
				{
					l = i;
					r = j;
					nArr = countingSort(arr,l,r,0,2000);
					int s = r-l+1;
					int m = (int)Math.ceil(((double)k/(double)s));;
					int b = (int)Math.ceil(((double)k/(double)m));
					int Bk = nArr[b-1];
					int X = Bk;
					int occ = count(nArr,X);
					if(exists(nArr,0,nArr.length-1,occ))
					{
						count++;
					}
				}
			}
			answer = count;
			System.out.println(answer);			
			map.clear();
		}
	}
}