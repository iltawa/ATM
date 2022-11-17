package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Business_logic.Euro;

public class TestEuro {
    Euro a = new Euro(22.10);
    Euro b = new Euro(25.15);
    @Test
    public void testGetValore() {
        assertEquals(2210, a.getValore());
    }

    @Test
    public void testMinoreDi() {
        assertTrue(a.minoreDi(b));
    }

    @Test
    public void testSomma() {
        Euro c = new Euro(10.10);
        Euro d = new Euro(11.11);
        c.somma(d);
        //assertEquals(21.21, c.getValore());
        assertEquals(2121, c.getValore(),0);
        //assertEquals(2121, c.somma(d));
    }

    @Test
    public void testSottrai() {
        b.sottrai(a);
        assertEquals(305, b.getValore(), 0);
    }

    @Test
    public void testStampa() {
        assertEquals("22.1 euro", a.stampa());
    }

    @Test
    public void testUgualeA() {
        Euro x = new Euro(12);
        Euro y = new Euro(12);
        assertTrue(x.ugualeA(y));
    }
}
