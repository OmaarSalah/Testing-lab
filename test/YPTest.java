import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;

public class YPTest {
    private YP YoungPhysicist;

    @Test
    public void Test0(){
        String data="3\n"+"1 5 9\n"+"4 6 11\n"+"-5 -11 -20\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.YoungPhysicist(),true);
    }
    @Test
    public void Test1(){
        String data="3\n"+"6 7 1\n"+"1 1 10\n"+"-7 -8 -11\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.YoungPhysicist(),true);
    }
    @Test
    public void Test2(){
        String data="3\n"+"3 -1 -3\n"+"4 5 -4\n"+"7 -9 -3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.YoungPhysicist(),false);
    }

}