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
        System.out.println("The result is:" +reverseString("hello")); 
        System.out.println("The result is:" +reverseString(null));
        System.out.println("The result is:" +reverseString("chandni"));
        System.out.println("The result is:" +reverseString("Gaurang"));      
        System.out.println("The result is:" +reverseString(""));
        System.out.println("The result is:" +reverseString("a"));
        System.out.println("The result is:" +reverseString("Hello World"));
        
        System.out.println("The result is:" +reverseWithIndices("Chandni",2,5));
        System.out.println("The result is:" +reverseWithIndices("Chandni",100,103));
        System.out.println("The result is:" +reverseWithIndices("Chandni",104, 5));
        System.out.println("The result is:" +reverseWithIndices("Chandni",2,200));
        
        System.out.println("The result is:" +reverseTheWholeString("My name is Chandni"));
        
        System.out.println("The result is:" +reverseOnlyWords("Hello World"));
    }

private static String reverseString (String one){
    char[] array;
    char temp;
    if(one==null){
        return null;
    }
    array=one.toCharArray();
    for(int i=0,j=array.length-1;i<j;i++,j--){
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    return new String(array);
  }
 
  private static String reverseWithIndices(String str, int start, int end){
      char[] array;
      char temp;
      if(str==null){
          return null;
      }
      array=str.toCharArray();
      if(start>array.length || end>array.length){
          System.out.println("Indices are not within the range");
          return str;
      }
      if(start>end){
          System.out.println("Start Index is greater than end Index, can't reverse the string");
          return str;
      }
      for(int i=start,j=end;i<j;i++,j--){
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    return new String(array);
  }
 
  private static String reverseTheWholeString(String str){
      int counter=0;
      String retString = str;
      for(int i=0; i<str.length(); i++){
          if(str.charAt(i)==' '){
              retString=reverseWithIndices(retString, counter, i-1);
              counter=i+1;
          }
      }
      retString=reverseWithIndices(retString,counter,str.length()-1);
      return retString;
  }
  
  private static String reverseOnlyWords(String str){
      return reverseTheWholeString(reverseString(str));
  }
}