import java.util.Scanner; 
class _51CountVowel
{    
     public static void main(String[] args) 
        {    
                
             
            int c=0;    
            Scanner sc = new Scanner(System.in); 
            String str = sc.nextLine();  
            str = str.toLowerCase();    
                
            for(int i = 0; i < str.length(); i++) {    
                
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
                {    
                   c++;
                }    
                  
            }    
            System.out.println("Number of vowels: " + c);    
        }    
    }     
