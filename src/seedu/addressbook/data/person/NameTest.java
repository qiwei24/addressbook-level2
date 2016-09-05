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
}
