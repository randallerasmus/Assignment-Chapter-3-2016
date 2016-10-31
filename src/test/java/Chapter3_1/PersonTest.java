package Chapter3_1;

import java.awt.*;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/26
 */
public class PersonTest extends TestCase{
    private Person person1, person2, person3;
    private List people;
    private String name;
    private String surname;
    private int age;
    private String IDNumber;

    @Before
    public void setUp() throws Exception
    {
        name = "randall";
        surname = "erasmus";
        age = 23;
        IDNumber = "11111111111111";

        people = new ArrayList();

        person1 = new Person(name, surname, age, IDNumber);
        person2 = new Person("Sylvester", surname, age, "3333333333333");
        person3 = new Person("stallone", surname, age, "4545678976655");


        people.add(0, person1);
        people.add(1, person2);
        people.add(2, person3);
    }

    @After
    public void tearDown() throws Exception
    {
        person1 = person2 = person3 = null;
        people = null;
    }

    @Test
    public void testPerson() throws Exception
    {
        //test person1 (testing to see if hashcodes are equal)
        assertEquals(person1.hashCode(), people.get(0).hashCode());

        //test person2 (testing to see if hashcodes are equal)
        assertEquals(person2.hashCode(), people.get(1).hashCode());

        //test person3 (testing to see if hashcodes are equal)
        assertEquals(person3.hashCode(), people.get(2).hashCode());
    }
}

}