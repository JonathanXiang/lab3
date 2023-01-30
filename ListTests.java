import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
    
    ArrayList<String> input1 = new ArrayList<>();
    ArrayList<String> input2 = new ArrayList<>();
    ArrayList<String> input3 = new ArrayList<>();
    @Before
    public void setUp(){
        
        input1.add("One");
        input1.add("Two");
        
        input2.add("Three");
        input2.add("Four");
        
        input3.add("One");
        input3.add("Two");
        input3.add("Three");
        input3.add("Four");
    }
    @Test
    public void testMerge(){
       
        assertEquals(input3.get(0), ListExamples.merge(input1, input2).get(0));
        assertEquals(input3.get(1), ListExamples.merge(input1, input2).get(1));
        assertEquals(input3.get(2), ListExamples.merge(input1, input2).get(2));
        assertEquals(input3.get(3), ListExamples.merge(input1, input2).get(3));
    }
    @Test
    public void testMerge1(){
        assertEquals(input3.get(2), ListExamples.merge(input1, input2).get(2));
    }
    @Test
    public void testMerge2(){
        assertEquals(input3.get(3), ListExamples.merge(input1, input2).get(3));
    }
    

}
