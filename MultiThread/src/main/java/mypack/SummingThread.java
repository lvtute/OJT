package mypack;

public class SummingThread extends Thread {

    private int min;
    private int max;

    public SummingThread(String name, int min, int max) {
        super(name);
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "SummingThread{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    public void run() {
        System.out.println("Run: " + getName());
    }

}

class TestSummingThread {
    public static void main(String[] args) {
        demo(10, 11);

    }

    static void demo(int n, int numberOfThread) {
        SummingThread[] threads = new SummingThread[numberOfThread];
        for (int i = numberOfThread - 1; i >= 0; i--) {

            System.out.println(numberOfThread - i - 1);
            int max = n - n / (numberOfThread) * (numberOfThread - i - 1);

            int min = max - (n / numberOfThread) + 1;
            if (i == 0) {
                min = 0;
            }
            System.out.println("max " + max);
            System.out.println("min " + min);
        }
        System.out.println("step: " + n / numberOfThread);
    }

}
