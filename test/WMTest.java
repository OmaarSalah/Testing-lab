import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;


public class WMTest {
    private WM watermelon;

    @Test
    public void Test0(){
        String data="18";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.Watermelon(),true);
    }
    @Test
    public void Test1(){
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.Watermelon(),false);
    }
    @Test
    public void Test2(){
        String data="100";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.Watermelon(),true);
    }
    @Test
    public void Test3(){
        String data="99";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.Watermelon(),false);
    }

}
