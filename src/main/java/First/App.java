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
    }

private static boolean isPalindrome (String str){
    if(str==null){
        return true;
    }
    if(str.isEmpty()){
        return true;
    }
    for (int i=0;i<(str.length())/2 ; i++){
        if(str.charAt(i)!=str.charAt((str.length()-1)-i)){
            return false;
        }
    }
    return true;
}
}