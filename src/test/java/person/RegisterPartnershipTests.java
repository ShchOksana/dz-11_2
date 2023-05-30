package person;

import com.rd.person.Man;
import com.rd.person.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class RegisterPartnershipTests {
    private Man men1, men2;
    private Woman women1, women2;

    @BeforeMethod
    public void createPersons() {
        men1 = new Man("Ivan", "Ivanov", 33);
        men2 = new Man("Oleh", "Poliakov", 65);
        women1 = new Woman("Anna", "Petrova", 25);
        women2 = new Woman("Olha", "Kovalenko", 60);
        women2.registerPartnership(men1); //First marriage
        //men2.registerPartnership(women1); //Second marriage
    }

    @Test
    public void testChangeWomenLastNameFirstMarriage(){
        Assert.assertEquals(women2.getLastName(), "Ivanov(a)", "Women's last name was not changed");
    }

    @Test
    public void testWomenSetPartnerFirstMarriage(){
        Assert.assertNotNull(women2.getPartner(),"Men doesn't set as a partner. Check partnership registration.");
        Assert.assertEquals(women2.getPartner().getLastName(), "Ivanov","Women's last name is incorrect");
    }

    @Test
    public void testMenSetPartnerFirstMarriage(){
        Assert.assertNotNull(men1.getPartner(),"Women doesn't set as a partner. Check partnership registration.");
        Assert.assertEquals(men1.getPartner().getLastName(), "Ivanov(a)","Women's last name is incorrect");
    }
    @Test
    public void testChangeWomenLastNameSecondMarriage(){
        Assert.assertEquals(women1.getLastName(), "Poliakov(a)", "Women's last name was not changed");
    }

    @Test
    public void testWomenSetPartnerSecondMarriage(){
        Assert.assertNotNull(women1.getPartner(),"Men doesn't set as a partner. Check partnership registration.");
        Assert.assertEquals(women1.getPartner().getLastName(), "Poliakov","Women's last name is incorrect");
    }

    @Test
    public void testMenSetPartnerSecondMarriage(){
        Assert.assertNotNull(men2.getPartner(),"Women doesn't set as a partner. Check partnership registration.");
        Assert.assertEquals(men2.getPartner().getLastName(), "Poliakov(a)","Women's last name is incorrect");
    }

}
