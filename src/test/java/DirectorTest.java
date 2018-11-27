import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Renholm", "NI112233C", 50000, "Head Management", 250000);
    }

    @Test
    public void hasName() {
        assertEquals("Renholm", director.getName());
    }

    @Test
    public void canChangeName() {
        director.setName("Steve");
        assertEquals("Steve", director.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName("");
        assertEquals("Renholm", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("NI112233C", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Head Management", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(250000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.1);
    }

    @Test
    public void cannotUseNegativeNumberInRaiseSalaryMethod() {
        director.raiseSalary(-50);
        assertEquals(50000, director.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(1000, director.payBonus(), 0.1);
    }

}
