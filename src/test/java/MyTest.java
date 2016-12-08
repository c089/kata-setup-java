import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MyTest {
    @Test
    public void test1() {
        assertThat(true, is(true));
    }

}
