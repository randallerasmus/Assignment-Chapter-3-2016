package Chapter3_2;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/26
 */
public class PersonTest {

    private PersonInterface employee, student;

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

        employee = student = null;
    }

    @Test
    public void testPerson() throws Exception{
        employee = new EmployeeServiceImpl("Will ", "Smith", "553455655", "permanent");
        student = new StudentServiceImpl("Randall", "Erasmus", "204527058", "Parttime");

        //testing employee
        assertEquals("Will",employee.getName());
        assertEquals("Smith", employee.getSurname());


        //testing student
        assertEquals("Randall", student.getName());
        assertEquals("Erasmus", student.getSurname());

    }


}