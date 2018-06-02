import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistTest {

    @Test
    public void multiplicativo() {
        int resultado = Persist.persistence(39);
        assertEquals(3, resultado);
    }


}
