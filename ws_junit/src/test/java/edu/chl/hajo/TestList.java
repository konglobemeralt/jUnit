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

    @Test
    public void testRemove(){
        List l = new List();
        l.add(1);
        l.remove();
        assertTrue(l.getLength() == 0);
    }


}
