package lennub;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App nf = null;

    @Before
    public void setUp() {
        nf = new App();
    }

    @Test
    public void simpleTest() {
        nf.find(new int[]{10,8,2,14,7});

        int maior = nf.getLargest();
        int menor = nf.getSmallest();

        assertEquals(14, maior);
        assertEquals(2, menor);
    }
    @Test
    public void crescenteTest() {
        nf.find(new int[] {1, 2, 3, 4, 5});

        int maior = nf.getLargest();
        int menor = nf.getSmallest();

        assertEquals(5, maior);
        assertEquals(1, menor);
    }

    @Test
    public void decrescenteTest() {
        nf.find(new int[] {5, 4, 3, 2, 1});

        int maior = nf.getLargest();
        int menor = nf.getSmallest();

        assertEquals(5, maior);
        assertEquals(1, menor);
    }
}