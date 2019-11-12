import java.util.Scanner;
class _47palin { 
      
    
    static boolean checkPalin(String word) 
    { 
        int n = word.length(); 
        word = word.toLowerCase(); 
        for (int i=0; i<n; i++,n--) 
           if (word.charAt(i) != word.charAt(n - 1)) 
              return false;        
        return true; 
    } 
      
    
    static int countPalin(String str) 
    {         
        // to check last word for palindrome 
        str = str + " "; 
          
        // to store each word 
        String word = ""; 
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
              
            // extracting each word 
            if (ch != ' ') 
                word = word + ch; 
            else { 
                if (checkPalin(word)) 
                    count++; 
                word = ""; 
            } 
        } 
          
        return count; 
    } 
      
    public static void main(String args[]) 
    { 
    	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String s = scanner.next();
        System.out.println(s);
        System.out.println(countPalin(s)); 
    } 
} 