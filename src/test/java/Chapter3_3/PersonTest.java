package Chapter3_3;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/26
 */
public class PersonTest {

    private PersonInterface student, employee;
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception{

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        student = (PersonInterface)ctx.getBean("student");
        employee = (PersonInterface)ctx.getBean("employee");
    }

    @After
    public void tearDOwn() throws Exception
    {
        student = employee = null;
        ctx = null;
    }

    @Test
    public void testPerson() throws Exception
    {

        //testing student
        assertEquals("Braedy", student.getName());
        assertEquals("Thebus", student.getSurname());

        //testing employee
        assertEquals("John", employee.getName());
        assertEquals("Wick", employee.getSurname());
    }

}