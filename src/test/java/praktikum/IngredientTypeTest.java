package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Не знаю зачем его делать, так как он покрыт другими тестами, но в задании четко прописано сделать.
 */
public class IngredientTypeTest {
    @Test
    public void checkGetSauceTypeIsCorrectTest(){
        assertEquals(IngredientType.valueOf("SAUCE"),IngredientType.SAUCE);
    }

    @Test
    public void checkGetFillingTypeIsCorrectTest(){
        assertEquals(IngredientType.valueOf("FILLING"),IngredientType.FILLING);
    }
}
