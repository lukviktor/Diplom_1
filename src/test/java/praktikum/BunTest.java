package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static praktikum.config.PriceNameData.NAME;
import static praktikum.config.PriceNameData.PRICE;


@RunWith(MockitoJUnitRunner.class)
public class BunTest {
    @Mock
    Bun bun;

    @Before
    public void initBun() {
        System.out.println();
        bun = new Bun(NAME, PRICE);
    }

    @Test
    public void checkGetNameTest() {
        assertEquals(NAME, bun.getName());
        System.out.println(NAME);
    }

    @Test
    public void checkGetPrice() {
        assertEquals(PRICE, bun.getPrice(), 0);
        System.out.println(PRICE);
    }
}


