package seedu.addressbook.common;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class UtilsTest {
    
    @Test
    public void isAnyNull_noArgs_returnFalse(){
        assertEquals(false, Utils.isAnyNull());
    }
    
    @Test 
    public void isAnyNull_noNull_returnFalse(){
        assertEquals(false, Utils.isAnyNull("hello", 1));
    }
    
    @Test 
    public void isAnyNull_someNull_returnTrue(){
        assertEquals(true, Utils.isAnyNull(null, "hello", 1));
    }
    
    @Test 
    public void isAnyNull_allNull_returnTrue(){
        assertEquals(true, Utils.isAnyNull(null, null, null));
    }
    
    @Test
    public void elementsAreUnique_noElement_returnTrue(){
        ArrayList<Integer> test = new ArrayList<Integer>();
        assertEquals(true, Utils.elementsAreUnique(test));
    }
    
    @Test
    public void elementsAreUnique_allUniqueElement_returnTrue(){
        ArrayList<Integer> test = new ArrayList<Integer>();
        for(int i=0 ; i<10; i++){
            test.add(i);
        }
        assertEquals(true, Utils.elementsAreUnique(test));
    }
    
    @Test
    public void elementsAreUnique_notUniqueElement_returnFalse(){
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(2);
        assertEquals(false, Utils.elementsAreUnique(test));
    }       
}
