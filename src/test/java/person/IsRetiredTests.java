package person;

import com.rd.person.Man;
import com.rd.person.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsRetiredTests {
    private Man men1, men2;
    private Woman women1, women2;

    @BeforeMethod
    public void createPersons() {
        men1 = new Man("Ivan", "Ivanov", 33);
        men2 = new Man("Oleh", "Poliakov", 65);
        women1 = new Woman("Anna", "Petrova", 25);
        women2 = new Woman("Olha", "Kovalenko", 60);
    }
    @Test
    public void testIsRetiredMenFalse(){
        Assert.assertFalse(men1.isRetired(), "Men's age >= 65");
    }
    @Test
    public void testIsRetiredMenTrue(){
        Assert.assertTrue(men2.isRetired(),"Men's age < 65");
    }
    @Test
    public void testIsRetiredWomenFalse(){
        Assert.assertFalse(women1.isRetired(), "Women's age >= 60");
    }
    @Test
    public void testIsRetiredWomenTrue(){
        Assert.assertTrue(women2.isRetired(),"Women's age < 60");
    }
}
