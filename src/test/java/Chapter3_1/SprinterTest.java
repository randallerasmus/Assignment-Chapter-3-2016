package Chapter3_1;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/26
 */
public class SprinterTest {

    private Sprinter sprinter1, sprinter2, sprinter3;

    private Set athletes;



    @Before
    public void setUp() throws Exception{

        sprinter1 = new Sprinter("Randall","Erasmus", 5.7, 60.2, 8.5);
        sprinter2 = new Sprinter("josha","bailey", 5.8, 53.2, 11.25);
        sprinter3 = new Sprinter("halle","Berry", 5.2, 30.2, 20.2);

        athletes = new HashSet();

        athletes.add(sprinter1);
        athletes.add(sprinter2);
        athletes.add(sprinter3);
    }

    @After
    public void tearDown() throws Exception
    {
        sprinter1 = sprinter2 = sprinter3 = null;
        athletes = null;
    }

    @Test
    public void testSprinter() throws Exception{

        //multiple tests to ensure data is written to the set

        //test1: testContains
        assertTrue(athletes.contains(sprinter1));
        assertTrue(athletes.contains(sprinter2));
        assertTrue(athletes.contains(sprinter3));

        //test2: testIsEmpty
        assertFalse(athletes.isEmpty());

        //test3: testSize
        assertEquals(3, athletes.size());
    }
}


}