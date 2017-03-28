package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd(){
        List l = new List();
        l.add(1);
        assertTrue(l.getLength()==1);
    }

    @Test(expected=IllegalStateException.class)
    public void testRemoveOnEmpty() {
        List l = new List();
        l.remove();
    }

    @Test
    public void testRemoveOnNotEmpty(){
        List l = new List();
        l.add(1);
        l.remove();
        assertTrue(l.getLength() == 0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetValOutOfBounds() {
        List l = new List();
        l.add(1);
        l.get(Integer.MAX_VALUE);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.get(-1);
    }

    @Test
    public void testGetVal(){
        List l = new List();
        l.add(00);
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);

        int value = l.get(4);
        System.out.println(value);
        assertTrue(value == 33);
    }


    @Test
    public void testDeepCopyPointer(){
        List l1 = new List();
        List l2 = l1.copy();

        assertFalse(l1.equals(l2));
    }

    @Test
    public void testDeepCopyChangedList(){
        List l1 = new List();
        List l2 = l1.copy();

        //Add some random elements to one of the lists
        l1.add(2);
        l1.add(3);

        assertFalse(l1.getLength() == l2.getLength() );
    }

    /*

    @BeforeClass
    public static void beforeClass(){  //First of all
        //init env
    }
    //Runs at the end of tests
    @AfterClass
    public static void afterClass(){
        //cleanup
    }

    @Before
    public static void beforeClass(){
        //code
    }

    //Runs after each function
    @After
    public void printAfterOneTest(){
        //code
    }

    */

}
