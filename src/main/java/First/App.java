package First;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("The result is:" +isAnagram("hello", "ohell")); 
        System.out.println("The result is:" +isAnagram(null,null));
        System.out.println("The result is:" +isAnagram(null,"chandni"));
        System.out.println("The result is:" +isAnagram("Gaurangii","Chandni"));        
        System.out.println("The result is:" +isAnagram("abcd","dacb"));
    }

private static boolean isAnagram (String one, String two){
    boolean ana = false;
    if(one==null && two==null){
       return true;
    }
    if(one==null || two==null){
        return false;
    }
    if(one.length()!=two.length()){
       ana = false;
    }
    else{
        char[] s1= one.toCharArray();
        char[] s2= two.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(s2);
            if (Arrays.equals(s1,s2)){
                 ana = true;
            }
 }

     return ana;
     
}
}