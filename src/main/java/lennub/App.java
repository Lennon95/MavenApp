package lennub;

/**
 * Hello world!
 *
 */
public class App 
{
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums)
    {
        for(int n : nums) {
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;
        }
    }

    public int getSmallest ()
    {
        return smallest;
    }

    public int getLargest () { return largest; }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
