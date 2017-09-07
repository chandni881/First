package First;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(solve(20,56));   
    }
    
    public static int solve(int numOfHeads, int numOfLegs){
        int pigs,totLegs = 0;
        for(int chicken=0; chicken < numOfHeads; chicken++){
            pigs = numOfHeads - chicken;
            totLegs = 2 * chicken +  4 * pigs;
         if(totLegs == numOfLegs){
             return pigs;
         }
        }
        return 0;
    }
    
}