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
			String d[] = new String[n];
			ArrayList<HashMap<Character,Boolean>> missingVowels = new ArrayList<>();
			//HashMap<Integer,Boolean> master = new HashMap<Integer,Boolean>();
			String allVowels = "aeiou";
			int possibleWays = 0;
			for(int i =0;i<n;i++)
			{
				d[i] = scanner.next();
				HashMap<Character,Boolean> missingVowel = new HashMap<Character,Boolean>();
				for(int j = 0;j<allVowels.length();j++)
				{
					if(d[i].indexOf(allVowels.charAt(j))==-1) missingVowel.put(allVowels.charAt(j),true);
				}
				if(missingVowel.size()==0) possibleWays+=((n-1)-i);
				else missingVowels.add(missingVowel);
			}
			if(missingVowels.size()==1) possibleWays++;
			else
			{
				for(int i=0;i<missingVowels.size()-1;i++)
				{
					//if(missingVowels.get(i).size()==0) {possibleWays+=((n-1)-i);continue;}
					for(int j=i+1;j<missingVowels.size();j++)
					{
						boolean v = true;
						Object ichars[] = missingVowels.get(i).keySet().toArray();
						for(int k =0 ;k<ichars.length;k++)
						{
							if(missingVowels.get(j).containsKey((char)ichars[k])) 
							{
								v=false;
								break;
							}
						}
						if(v) possibleWays++;
					}
				}
			}
			
			System.out.println(possibleWays);
			
		}
	}
}
 