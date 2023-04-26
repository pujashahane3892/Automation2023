package Logical_programs;

import java.util.HashMap;
import java.util.Set;

public class count_repeatative_char_in_string_using_hashmap {
	public static void main(String[] args) {
		String str = "aabbcdeff";
		
		//1. create hashmap<key,value>
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		//2. 
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);//{a=2, b=2, c=1, d=1, e=1, f=2}
		Set<Character> keys = map.keySet();
		
		for(Character key:keys)
		{
			System.out.println(key+":"+map.get(key));//key with count(mapping)
			//System.out.println(key);//unique key
		}

	}

}
