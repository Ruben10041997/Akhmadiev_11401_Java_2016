package homework006;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class AutomaticalWindowRaiser implements WindowRaiser {

    WindowRaiser automatic;
    int mWorkingTime = 3000;
    int mQuality;
    boolean isClosed = true;
    Timer mTimer = new Timer();
    TimerTask mTimerTask1 = new TimerTask() {
        @Override
        public void run() {
            System.out.print("Стекло поднято");
            mTimer.cancel();
        }
    };
    TimerTask mTimerTask2 = new TimerTask() {
        @Override
        public void run() {
            System.out.print("Стекло опущено");
            mTimer.cancel();
        }
    };


    @Override
    public void toUp() {
        if (!isClosed){
            System.out.print("Стекло поднимается");
        mTimer.schedule(mTimerTask1, mWorkingTime);}
        else System.out.print("Стекло уже поднято");
    }

    @Override
    public void toDown() {
        if (isClosed){
            System.out.print("Стекло опускается");
            mTimer.schedule(mTimerTask2, mWorkingTime);}
        else System.out.print("Стекло уже опущено");
    }

    @Override
    public void toBrake() {
        if (mQuality<=4)
        System.out.print("Упс, что-то пошло не так :(");
        else System.out.print("Стеклоподъемники надёжные, как швейарские часы!");
    }

}
