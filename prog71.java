import java.util.*;
class prog71
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine();
        char[] charArray = str.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
            else
            {   
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : "+str);
        System.out.println("The longest substring : "+longestSubstring);
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    
    }
}