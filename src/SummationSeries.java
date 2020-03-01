public class SummationSeries implements ISubscriber
{
    @Override
    public void notifySubscriber(int input)
    {
        System.out.println(" Summation Series = " + (input*(input+1))/2 );
    }
}
