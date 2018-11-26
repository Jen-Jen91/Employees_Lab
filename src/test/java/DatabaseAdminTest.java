
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Roy", "RT112233D", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Roy", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("RT112233D", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(25500, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }

}
