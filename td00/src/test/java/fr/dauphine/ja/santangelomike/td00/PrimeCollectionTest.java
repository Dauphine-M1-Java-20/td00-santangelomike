package fr.dauphine.ja.santangelomike.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }
    
    public void test0IsPrime() {
    	assertTrue(!PrimeCollection.isPrime(0));
    }
    
    public void test2IsPrime() {
    	assertTrue(PrimeCollection.isPrime(2));
    }
    
    public void test9IsPrime() {
    	assertTrue(!PrimeCollection.isPrime(9));
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
}
