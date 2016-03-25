package homework010.testing;

import homework010.SpringConfig;
import homework010.classes.AutomaticalGearbox;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestAutomaticalGearbox extends Assert {

    AutomaticalGearbox gearbox;

    @Before
    public void setUp() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        gearbox = ac.getBean(AutomaticalGearbox.class);

    }

    @Test
    public void TestGearboxShoulBeIncreaseGearAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        assertEquals(gearboxA.toIncreaseGear(), gearbox.toIncreaseGear());
    }

    @Test
    public void TestGearboxShoulBeDescreaseGearAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        assertEquals(gearboxA.toDescreaseGear(), gearbox.toDescreaseGear());
    }

    @Test
    public void TestGearboxShoulBeSetNeutralAutomatically() {
        AutomaticalGearbox gearboxA = new AutomaticalGearbox();
        assertEquals(gearboxA.toNeutral(), gearbox.toNeutral());
    }


}
