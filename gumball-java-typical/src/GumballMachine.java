public class GumballMachine
{

    private static int num_gumballs;
    private static boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public static void insertQuarter(int coin)
    {
        if ( coin == 25 )
            has_quarter = true ;
        else
            has_quarter = false ;
    }

    public static void ejectQuarter()
    {
        if(has_quarter)
        {
            has_quarter = false;
            System.out.println("Your Quarter has been ejected");
        }
        else
            System.out.println("No Quarter to eject!!");

    }

    public static void turnCrank()
    {
        if ( has_quarter )
        {
            if ( num_gumballs > 0 )
            {
                num_gumballs-- ;
                has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a quarter" ) ;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Simple Gumball Machine Version 1");
        GumballMachine obj = new GumballMachine(10);
        insertQuarter(25);
        turnCrank();
        insertQuarter(25);
        turnCrank();
        insertQuarter(10);
        turnCrank();
        insertQuarter(25);
        ejectQuarter();

    }
}
