package First;
import java.util.Arrays;
import java.util.HashMap;
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
        System.out.println("The result is:" +isAnagram(" "," "));
        
    }

/*private static boolean isAnagram (String one, String two){
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
     
}*/
private static boolean isAnagram (String one, String two){

    if(one==null && two==null){
       return true;
    }
    if(one==null || two==null){
        return false;
    }
    if(one.length()!=two.length()){
       return false;
    }
    
    HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
    
    hmap1=makeItAHashMap(one);
    hmap2=makeItAHashMap(two);
    
    if(hmap1.hashCode()==hmap2.hashCode()){
        return true;
    }
    return false;
   
   }

private static HashMap<Character, Integer> makeItAHashMap(String str){
     HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    for(int i=0; i<str.length();i++){
        if(!hmap.containsKey(str.charAt(i))){
            hmap.put(str.charAt(i), 0);
        }
        hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
    }
    return hmap;
}

}