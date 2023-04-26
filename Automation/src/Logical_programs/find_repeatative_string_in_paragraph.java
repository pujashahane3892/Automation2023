package Logical_programs;

import java.util.HashMap;
import java.util.Set;



public class find_repeatative_string_in_paragraph {//(IMP)
	public static void main(String[] args) {
		String str = "abcd,xyz,pqrs,abcd,xyz,abb";
		//how to convert string into array
		String arr[] = str.split(" ");
		
		for(int i = 0; i <= arr.length - 1; i++)
		{
			System.out.println(arr[i]);
		}
		//2.create HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//3.
		for(int i=0; i<=arr.length-1; i++)
		{
			String s1 = arr[i];
			if(map.containsKey(s1))
			{map.put(s1, map.get(s1) + 1);
		}else
		{
			map.put(s1, 1);
		}
		
	}
System.out.println(map);
Set<String> keys = map.keySet();
for(String key : keys)
{
	System.out.println(key + ":" + map.get(key));
}
}
}
