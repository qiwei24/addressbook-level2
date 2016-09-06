package seedu.addressbook.data.person;

import static org.junit.Assert.*;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    
    @Test
    public void isSimilar_otherNameIsNull_returnFalse() throws IllegalValueException {
        Name nameTest = new Name("Qi Wei");
        assertEquals(false, nameTest.isSimilar(null));
    }
    
    @Test
    public void isSimilar_sameName_returnTrue() throws IllegalValueException{
        Name name1 = new Name("Qi Wei");
        Name name2 = new Name("Qi Wei");
        assertEquals(true, name1.isSimilar(name2));
    }
    
    @Test 
    public void isSimilar_sameNameDifferentCase_returnTrue() throws IllegalValueException{
        Name name1 = new Name("Qi Wei");
        Name name2 = new Name("Qi wei");
        assertEquals(true, name1.isSimilar(name2));
    }
    
    @Test
    public void isSimilar_sameNameDifferentOrder_returnTrue() throws IllegalValueException{
        Name name1 = new Name("Goh Qi Wei");
        Name name2 = new Name("Qi Wei Goh");
        assertEquals(true, name1.isSimilar(name2));
    }
}
