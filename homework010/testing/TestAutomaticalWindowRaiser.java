package homework010.testing;

import homework010.SpringConfig;
import homework010.classes.AutomaticalWindowRaiser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by rubenahmadiev on 26.02.16.
 */
public class TestAutomaticalWindowRaiser extends Assert {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();
    AutomaticalWindowRaiser windowRaiser;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        windowRaiser = ac.getBean(AutomaticalWindowRaiser.class);

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test(timeout = 3000)
    public void windowRaiserShouldBeRaiseCorrectly() {
        boolean isClosed = true;
        windowRaiser.toUp();
        if (isClosed==true)
        assertEquals("Стекло уже поднято", output.toString());
        else
            assertEquals("Стекло поднимается", output.toString());
    }

    @Test(timeout = 3000)
    public void windowRaiserShouldBeDownCorrectly() {
        boolean isClosed = true;
        windowRaiser.toDown();
        if (isClosed==false)
            assertEquals("Стекло уже опущено", output.toString());
        else
            assertEquals("Стекло опускается", output.toString());
    }

    @Test
    public void windowRaiserShouldBeNotBroke() {
        int mQuality=2;
        windowRaiser.toBrake();
        if (mQuality<=4)
            assertEquals("Упс, что-то пошло не так :(", output.toString());
        else
            assertEquals("Стеклоподъемники надёжные, как швейарские часы!", output.toString());
    }

}
