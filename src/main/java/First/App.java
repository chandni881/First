package First;
import java.util.HashSet;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        System.out.println( "Hello World!" );
        System.out.println("The result is:" +isRotation("hello", "ohell")); 
        System.out.println("The result is:" +isRotation(null,null));
        System.out.println("The result is:" +isRotation(null,"chandni"));
        System.out.println("The result is:" +isRotation("Gaurang","Chandni"));        
        */
        System.out.println("The result is:" +isUniqueChar("Chandni"));
        System.out.println("The result is:" +isUniqueChar("Chand"));
        System.out.println("The result is:" +isUniqueChar("aaaa"));
        System.out.println("The result is:" +isUniqueChar(null));
        System.out.println("The result is:" +isUniqueChar(" "));
    }

/*private static boolean isRotation (String one, String two){
    if(one==null && two==null){
        return true;
    }
    if(one==null || two==null){ 
        return false;
    }
    if(one.length()!=two.length()){
        return false;
    }
    String result=one+one;
    return result.contains(two); 
}*/

/*private static boolean isUniqueChar(String str){
    
    if(str == null){
        return true;
    }
    if (str == " "){
        return true;
    }
     
    for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
 
        for (int j=i+1; j<str.length();j++){
            char cc = str.charAt(j);

                if (c == cc){
                return false;
                 }
            }
      }
    return true;
}
*/
    private static boolean isUniqueChar(String str){
        if(str==null){
            return true;
        }
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i=0; i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                return false;
            }
             hs.add(str.charAt(i));
        }
        //System.out.println(hs);
        return true;
    }

}
