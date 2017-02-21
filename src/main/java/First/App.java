package First;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //System.out.println( "Hello World!" );
       int series; int n= -1;
     //  int arrayValues[] = new int[n+1];
      // arrayValues[0]=0;
       //arrayValues[1]=1;
      
       series=fib(n);
      System.out.println(series);
        
    }

// Fibonaaci series using dynamic programming
// Run time of this method is O(n) compare to regular recursion which is exponential
/*private static int fib(int n, int[] arr){
   
    if(n ==0 )
    {
      return 0;
    }
    if(arr[n]>0){
        return arr[n];
    }
    arr[n] = fib(n-1, arr) + fib(n-2, arr);
    return arr[n];
}*/

    //Fibonacci series using iteration
    private static int fib(int n){
        int a=0, b=1, sum=0;
        if(n < 0){
            System.out.println("Please pass a positive number");
            return -1;
        }
        if(n ==0 )
          {
             return 0;
          }
        if(n ==1 ){
            return 1;
        }
        for(int i=0; i<n;i++){
            a = b;
            b = sum;
            sum = a + b ;
        }
        return sum;
    }

}
