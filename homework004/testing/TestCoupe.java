package abramskiy.homework004.testing;

import abramskiy.homework004.Coupe;
import org.junit.*;

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

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Ignore
    @Test
    public void constructorShoulBeReturnCorrectValues() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        Coupe coupe1 = mock(Coupe.class);
        when(coupe1.explode()).thenReturn(null);
        when(coupe1.equals(anyObject())).thenCallRealMethod();
        assertSame(coupe, coupe1);

    }

    @Test
    public void coupeShouldBeBrake() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toBrake();
        assertEquals("Притормозим", output.toString());

    }

    @Test
    public void coupeShouldBeUseHeadlights() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toUseHeadlights();
        assertEquals("Включим ксеноновые фары", output.toString());

    }

    @Test
    public void coupeShouldBeWindowRise() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toWindowRise();
        assertEquals("Поднимаем стекло", output.toString());

    }

    @Test
    public void coupeShouldBeCool() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toCool();
        assertEquals("Охладим", output.toString());

    }

    @Test
    public void coupeShouldBeWarm() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toWarm();
        assertEquals("Подогреем", output.toString());

    }

    @Test
    public void coupeShouldBeBlow() {
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.toBlow();
        assertEquals("Ветерок", output.toString());

    }

    @Test
    public void coupeShouldBeGainTraction() {
        int engineRpm = 1000;
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.gainTracrion();
        assertEquals("Текущие обороты = " + engineRpm, output.toString());
    }

    @Test
    public void coupeShouldBeDownTraction() {
        int engineRpm = -1000;
        Coupe coupe = new Coupe("Ferrari", "Enzo");
        coupe.reduceTracrion();
        assertEquals("Текущие обороты = " + engineRpm, output.toString());
    }





}
