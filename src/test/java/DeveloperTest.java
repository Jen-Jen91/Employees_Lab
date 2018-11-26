import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Moss", "MM112233B", 27000);
    }

    @Test
    public void hasName() {
        assertEquals("Moss", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setName("Steve");
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        developer.setName("");
        assertEquals("Moss", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("MM112233B", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(27000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(250);
        assertEquals(27250, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotUseNegativeNumberInRaiseSalaryMethod() {
        developer.raiseSalary(-50);
        assertEquals(27000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(270, developer.payBonus(), 0.01);
    }

}
