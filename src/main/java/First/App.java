package First;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("The result is:" +isPalindrome("mom")); 
        System.out.println("The result is:" +isPalindrome(null));
        System.out.println("The result is:" +isPalindrome("aa"));
        System.out.println("The result is:" +isPalindrome("aabc"));   
        System.out.println("The result is:" +isPalindrome("my gym"));
    }

private static boolean isPalindrome (String string){
    if(string==null){
        return true;
    }
    if(string.isEmpty()){
        return true;
    }
    String str = string.replace(" ","");
    System.out.println(str);
    for (int i=0;i<(str.length())/2 ; i++){
        
        if(str.charAt(i)!=str.charAt((str.length()-1)-i)){
            return false;
        }
    }
    return true;
}
}