package work;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class BrokenEngine implements engine {
    int weight;
    String breakingName;
    int valves;
    int engineId;

    @Override
    public void gainTracrion() {

    }

    @Override
    public void reduceTracrion() {

    }

    @Override
    public BrokenEngine explode() {
        return null;
    }
}
