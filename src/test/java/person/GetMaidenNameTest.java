package person;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetMaidenNameTest extends BeforeClassPerson{
    @BeforeClass
    public void init(){
        createPersons();
    }

    @Test
    public void testMaidenNameAfterMarriage(){
        Assert.assertEquals(women2.getMaidenName(), "Kovalenko","Women's maiden name is incorrect after marriage");
    }
    @Test
    public void testMaidenNameNoMarriage(){
        Assert.assertEquals(women1.getMaidenName(), "Petrova", "Women's maiden name is incorrect");
    }

    @Test
    public void testMaidenNameAfterDivorce(){
        Assert.assertEquals(women3.getMaidenName(), "Kravchenko","Women's maiden name is incorrect after divorce");
    }

}
