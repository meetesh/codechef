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
			HashMap<String,ArrayList<Integer>> map = new HashMap<>();
			int n = scanner.nextInt();
			String d[] = new String[n];
			String allVowels = "aeiou";
			int possibleWays = 0;
			for(int i =0;i<n;i++)
			{
				d[i] = scanner.next();
				String s = d[i];
				String missing = "";
				String present = "";
				for(int j = 0;j<5;j++)
				{
					if(s.indexOf(allVowels.charAt(j)) >= 0) present += ""+allVowels.charAt(j);
					else missing += ""+allVowels.charAt(j);
				}
				if(missing.length() == 0)
				{
					possibleWays += n-i-1;
				}
				else 
				{
					for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet())
					{
						if(entry.getKey().indexOf(missing)>=0)
						{
							ArrayList<Integer> list = entry.getValue();
							possibleWays = possibleWays+list.size();
						}
					}						
				}
				if(map.containsKey(present)) 
				{
					ArrayList<Integer> list = map.get(present);
					list.add(i);
				}
				else
				{
					ArrayList<Integer> list = new ArrayList<>();
					list.add(i);
					map.put(present,list);
				}
			}
			System.out.println(possibleWays);
			
		}
	}
}
 