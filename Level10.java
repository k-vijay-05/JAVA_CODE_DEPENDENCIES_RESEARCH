package tracer;

public class Level10 {
    public void trigger() {
        Level11 level11 = new Level11();
        level11.invoke();
    }

    public void useLevel21() {
        Level21 level21 = new Level21();
        level21.finish();
    }

    public void useLevel22() {
        Level22 level22 = new Level22();
        level22.complete();
    }

    public void useLevel23() {
        Level23 level23 = new Level23();
        level23.terminate();
    }
} 