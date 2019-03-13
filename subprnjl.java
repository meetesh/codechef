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
			Integer a;
			int l,r;
			for(int i =0;i<n;i++)
			{
				arr[i] = scanner.nextInt();
				a = map.put(arr[i],1);
				if(a!=null)
				{
					map.put(arr[i],a+1);
				}
			}
			int count = 0;
			for(int i =0;i<arr.length;i++)
			{
				for(int j = i;j<arr.length;j++)
				{
					l = i;
					r = j;
					
				}
			}
			for(Map.Entry<Integer,Integer> entry : map.entrySet())
			{
				int left = entry.getKey();
				int right = entry.getValue();
				if(map.containsKey(right))
				{
					count+=map.get(right);
				}
			}
			answer = count;
			System.out.println(answer);			
			map.clear();
		}
	}
}