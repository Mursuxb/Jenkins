import T1.FahrToCelc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrToCelcTest {
    @Test
    public void testFahrToCelc() {
        FahrToCelc ftc = new FahrToCelc();
        assertEquals(0.0, ftc.fahrToCelc(32.0), 0.0001);
        assertEquals(100.0, ftc.fahrToCelc(212.0), 0.0001);
        assertEquals(-40.0, ftc.fahrToCelc(-40.0), 0.0001);

        assertEquals(0.0, ftc.kelvintoCel(273.15), 0.0001);
        assertEquals(-273.15, ftc.kelvintoCel(0.0), 0.0001);
    }
}