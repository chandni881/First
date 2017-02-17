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
        System.out.println("The result is:" +isRotation("hello", "ohell")); 
        System.out.println("The result is:" +isRotation(null,null));
        System.out.println("The result is:" +isRotation(null,"chandni"));
        System.out.println("The result is:" +isRotation("Gaurang","Chandni"));        
    }

private static boolean isRotation (String one, String two){
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
}
}