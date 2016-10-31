package Chapter3_1;

import com.sun.javafx.collections.MappingChange;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by User on 2016/10/26
 */
public class RectangleTest {

    private Rectangle rectangle1, rectangle2, rectangle3;
    private MappingChange.Map shapes;

    @Before
    public void setUp() throws Exception{

        rectangle1 = new Rectangle(10.5, 45);
        rectangle2 = new Rectangle(9, 32.1);
        rectangle3 = new Rectangle(13, 20.2);

        shapes = new HashMap();
        shapes.put("1", rectangle1);
        shapes.put("2", rectangle2);
        shapes.put("3", rectangle3);
    }

    @After
    public void tearDown() throws Exception
    {
        rectangle1 = rectangle2 = rectangle3 = null;
        shapes = null;
    }

    @Test
    public void testRectangle() throws Exception
    {
        //testing rectangle1 to see if hash codes are equal
        assertEquals(rectangle1.hashCode(), shapes.get("1").hashCode());

        //testing rectangle2 to see if hash codes are equal
        assertEquals(rectangle2.hashCode(), shapes.get("2").hashCode());

        //testing rectangle3 to see if hash codes are equal
        assertEquals(rectangle3.hashCode(), shapes.get("3").hashCode());

    }
}

