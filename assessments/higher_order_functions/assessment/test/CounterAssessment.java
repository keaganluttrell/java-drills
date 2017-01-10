import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntSupplier;

public class CounterAssessment {
    @Test
    public void counterTest() {
        IntSupplier a = Counter.createCounter();
        IntSupplier b = Counter.createCounter();

        b.getAsInt();

        Assert.assertEquals(0, a.getAsInt());
        Assert.assertEquals(1, b.getAsInt());
        Assert.assertEquals(1, a.getAsInt());
        Assert.assertEquals(2, b.getAsInt());
    }
}
