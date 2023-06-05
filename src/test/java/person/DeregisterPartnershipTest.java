package person;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DeregisterPartnershipTest extends BeforeClassPerson{

    @BeforeClass
    public void init(){
        createPersons();
    }

    @Test
    public void testWomenLastNameShouldNotBeChangedAfterWomenDivorce(){
        Assert.assertEquals(women3.getLastName(), "Petrov(a)", "Women's last name is incorrect after divorce");
    }

    @Test
    public void testWomenPartnerShouldNotBeSetAfterWomenDivorce(){
        Assert.assertNull(women3.getPartner(),"Women still has a partner after divorce.");
    }

    @Test
    public void testMenPartnerShouldNotBeSetAfterWomenDivorce(){
        Assert.assertNull(men3.getPartner(),"Men still has a partner after divorce.");
    }

    @Test
    public void testWomenLastNameShouldBeChangedAfterMenDivorce(){
        Assert.assertEquals(women5.getLastName(), "Koroliuk", "Women's last name is incorrect after divorce");
    }

    @Test
    public void testWomenPartnerShouldNotBeSetAfterMenDivorce(){
        Assert.assertNull(women5.getPartner(),"Women still has a partner after divorce.");
    }

    @Test
    public void testMenPartnerShouldNotBeSetAfterMenDivorce(){
        Assert.assertNull(men5.getPartner(),"Men still has a partner after divorce.");
    }
}
