import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jen", "GH223344A", 35000, "HR");
    }

    @Test
    public void hasName() {
        assertEquals("Jen", manager.getName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Steve");
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName("");
        assertEquals("Jen", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("GH223344A", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.50);
        assertEquals(35500.50, manager.getSalary(), 0.1);
    }

    @Test
    public void cannotUseNegativeNumberInRaiseSalaryMethod() {
        manager.raiseSalary(-50);
        assertEquals(35000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(350, manager.payBonus(), 0.1);
    }

}
