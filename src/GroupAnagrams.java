/**
 * Given an array of strings, group anagrams together.
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

import java.util.*;

public class GroupAnagrams
{
    public static void main(String[] args)
    {
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        List<List<String>> list = groupAnagrams(strs);
        for(List x : list) { System.out.println(x); }
    }
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> listOfLists = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap();
        for(int i = 0; i < strs.length; i++)
        {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);


            if(map.containsKey(sortedStr) == false)
            {
                List<String> strsList = new ArrayList<String>();
                strsList.add(strs[i]);
                map.put(sortedStr, strsList);
            }
            else
            {
                List<String> strsList = map.get(sortedStr);
                strsList.add(strs[i]);
                map.put(sortedStr, strsList);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet())
        {
            listOfLists.add(entry.getValue());
        }
        return listOfLists;
    }
}
