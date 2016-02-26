package abramskiy.homework004.testing;

import abramskiy.homework004.AutomaticalGearbox;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestAutomaticalGearbox extends Assert {

    @Test
    public void TestGearboxShoulBeIncreaseGearAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        AutomaticalGearbox gearbox = mock(AutomaticalGearbox.class);
        when(gearbox.toIncreaseGear()).thenReturn("Автоматическое поышение передачи");
        when(gearbox.equals(anyObject())).thenCallRealMethod();
        assertEquals(gearboxA.toIncreaseGear(), gearbox.toIncreaseGear());
    }

    @Test
    public void TestGearboxShoulBeDescreaseGearAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        AutomaticalGearbox gearbox = mock(AutomaticalGearbox.class);
        when(gearbox.toIncreaseGear()).thenReturn("Автоматическое повышение передачи");
        when(gearbox.equals(anyObject())).thenCallRealMethod();
        assertEquals(gearboxA.toIncreaseGear(), gearbox.toIncreaseGear());
    }

    @Test
    public void TestGearboxShoulBeSetNeutralAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        AutomaticalGearbox gearbox = mock(AutomaticalGearbox.class);
        when(gearbox.toIncreaseGear()).thenReturn("Автоматический переход в нейтральный режим");
        when(gearbox.equals(anyObject())).thenCallRealMethod();
        assertEquals(gearboxA.toIncreaseGear(), gearbox.toIncreaseGear());
    }


}
