package abramskiy.homework004.testing;

import abramskiy.homework004.AutomaticalWindowRaiser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestAutomaticalWindowRaiser extends Assert {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test(timeout = 3000)
    public void windowRaiserShouldBeRaiseCorrectly() {
        boolean isClosed = true;
        AutomaticalWindowRaiser windowRaiser = new AutomaticalWindowRaiser();
        windowRaiser.toUp();
        if (isClosed==true)
        assertEquals("Стекло уже поднято", output.toString());
        else
            assertEquals("Стекло поднимается", output.toString());
    }

    @Test(timeout = 3000)
    public void windowRaiserShouldBeDownCorrectly() {
        boolean isClosed = true;
        AutomaticalWindowRaiser windowRaiser = new AutomaticalWindowRaiser();
        windowRaiser.toDown();
        if (isClosed==false)
            assertEquals("Стекло уже опущено", output.toString());
        else
            assertEquals("Стекло опускается", output.toString());
    }

    @Test
    public void windowRaiserShouldBeNotBroke() {
        int mQuality=2;
        AutomaticalWindowRaiser windowRaiser = new AutomaticalWindowRaiser();
        windowRaiser.toBrake();
        if (mQuality<=4)
            assertEquals("Упс, что-то пошло не так :(", output.toString());
        else
            assertEquals("Стеклоподъемники надёжные, как швейарские часы!", output.toString());
    }

}
