package three;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNull;

public class AssertNull {

    @Test
    public void whenAssertNullThenNull(){
        Map<String, String> map = new HashMap();
        map.put("Key1", "earth");
        map.put("Key2", "mercury");
        map.put("Key3", "mars");
        assertNull(map.get("Key5"));
    }
}
