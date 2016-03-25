package homework010.testing;

import homework010.SpringConfig;
import homework010.classes.BrokenEngine;
import homework010.classes.Coupe;
import org.junit.*;
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
public class TestCoupe extends Assert {


    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();
    Coupe ferrari;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        ferrari = (Coupe) ac.getBean("ferrariEnzo");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void constructorShoulBeReturnCorrectValues() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        assertEquals(coupe.toString(),ferrari.toString());

    }

    @Test
    public void coupeShouldBeBrake() {
        ferrari.toBrake();
        assertEquals("Притормозим", output.toString());

    }

    @Test
    public void coupeShouldBeUseHeadlights() {
        ferrari.toUseHeadlights();
        assertEquals("Включим ксеноновые фары", output.toString());

    }

    @Test
    public void coupeShouldBeWindowRise() {
        ferrari.toWindowRise();
        assertEquals("Поднимаем стекло", output.toString());

    }

    @Test
    public void coupeShouldBeCool() {
        ferrari.toCool();
        assertEquals("Охладим", output.toString());

    }

    @Test
    public void coupeShouldBeWarm() {
        ferrari.toWarm();
        assertEquals("Подогреем", output.toString());

    }

    @Test
    public void coupeShouldBeBlow() {
        ferrari.toBlow();
        assertEquals("Ветерок", output.toString());

    }

    @Test
    public void coupeShouldBeGainTraction() {
        int engineRpm = 0;
        ferrari.gainTracrion();
        assertEquals("Текущие обороты = " + engineRpm, output.toString());
    }

    @Test
    public void coupeShouldBeDownTraction() {
        int engineRpm = -1000;
        ferrari.reduceTracrion();
        assertEquals("Текущие обороты = " + engineRpm, output.toString());
    }





}
