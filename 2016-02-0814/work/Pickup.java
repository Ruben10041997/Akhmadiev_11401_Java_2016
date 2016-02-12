package work;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class Pickup implements car,multimediaSystem {


    String  mark;
    String model;
    int year;
    int power;



    @Override
    public void toEnableMusic() {

        System.out.println("Включить Арабские миксы");

    }

    @Override
    public climateControl toEnableCLimateControl() {

        return new climateControl() {
            @Override
            public void toCool() {
                System.out.println("Понизить температуру");
            }

            @Override
            public void toWarm() {
                System.out.println("Повысить температуру");
            }

            @Override
            public void toBlow() {
                System.out.println("Продуть");
            }
        };

    }

    @Override
    public String[] toSeeInfromation() {

    }

    @Override
    public void toDrive() {

    }

    @Override
    public void toBrake() {

    }

    @Override
    public void toUseHeadlights() {

    }

    @Override
    public windowRaiser toWindowRise() {
        return null;
    }
}
