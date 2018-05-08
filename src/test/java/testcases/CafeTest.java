package testcases;

import junit.model.Cafe;
import junit.model.Coffee;
import junit.model.CoffeeType;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CafeTest
{
    Map<String,String> map = new HashMap<>();
    public static final int EXPRESSO_BEANS = CoffeeType.Expresso.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    public static final CoffeeType EXPRESSO_BEAN = CoffeeType.Expresso;

    Cafe cafe = null;

    @Before
    public void before()
    {
        cafe = new Cafe();
    }
    @Test
    public void canBreqExpresso()
    {
        //given
        withBeans();

        //when
        Coffee coffee = cafe.brew(CoffeeType.Expresso);

        //then
        assertThat(coffee, Matchers.<Coffee>hasProperty("beans",Matchers.equalTo(EXPRESSO_BEANS)));
        assertEquals(EXPRESSO_BEAN, coffee.getType());
        assertEquals(NO_MILK,coffee.getMilk());
        //assertEquals(EXPRESSO_BEANS, coffee.getBeans());


    }

    private void withBeans() {
        cafe.restockBeans(EXPRESSO_BEANS);

    }

    @Test
    public void brewingExpressoConsumesBeans()
    {
        //given
        withBeans();

        //when
        Coffee coffee = cafe.brew(CoffeeType.Expresso);

        //then
        assertEquals(CafeTest.NO_BEANS, cafe.getBeansInStock());
    }

    @Test(expected = IllegalStateException.class)
    public void LattesRequireMilk()
    {
        withBeans();

        cafe.brew(CoffeeType.Latte);
    }
}
