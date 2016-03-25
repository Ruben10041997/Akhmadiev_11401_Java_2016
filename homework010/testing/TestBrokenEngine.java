package homework010.testing;

import homework010.SpringConfig;
import homework010.classes.AutomaticalWindowRaiser;
import homework010.classes.BrokenEngine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestBrokenEngine extends Assert {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();
    BrokenEngine engine;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        engine = ac.getBean(BrokenEngine.class);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void brokenEngineMustBeGainTraction() {
        engine.gainTracrion();
        assertEquals("Повысить обороты", output.toString());
    }

    @Test
    public void brokenEngineMustBeReduceTraction() {
        engine.reduceTracrion();
        assertEquals("Понизить обороты", output.toString());
    }

    @Test
    public void brokenEngineMustExposion() {
        BrokenEngine engine = new BrokenEngine();
        assertEquals(engine.explode(), engine.explode());
    }

}
