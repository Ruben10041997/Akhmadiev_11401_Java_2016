package abramskiy.homework004.testing;

import abramskiy.homework004.BrokenEngine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.BrokenBarrierException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestBrokenEngine extends Assert {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void brokenEngineMustBeGainTraction() {
        BrokenEngine engine = new BrokenEngine();
        engine.gainTracrion();
        assertEquals("Повысить обороты", output.toString());
    }

    @Test
    public void brokenEngineMustBeReduceTraction() {
        BrokenEngine engine = new BrokenEngine();
        engine.reduceTracrion();
        assertEquals("Повысить обороты", output.toString());
    }

    @Test
    public void brokenEngineMustExposion() {
        BrokenEngine engine = new BrokenEngine();
        BrokenEngine engineBr = mock(BrokenEngine.class);
        when(engineBr.explode()).thenReturn(null);

        engine.explode();
        assertEquals(engine.explode(), engineBr.explode());
    }

}
