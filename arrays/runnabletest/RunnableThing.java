package runnabletest;

/**
 * @author Priyansu Sahoo
 * @created 12-05-2024 - 01:50 pm
 */
public class RunnableThing implements Runnable {

    private final int threadNumber;

    // constructor
    public RunnableThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i =1;i<=5;i++) {
            System.out.println(i + " the thread number is " + threadNumber);
            try {
                Thread.sleep(1000); // wait time before next iteration.
            } catch (InterruptedException _) {}
        }
    }
}
