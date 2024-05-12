package runnabletest;

/**
 * @author Priyansu Sahoo
 * @created 12-05-2024 - 01:50 pm
 */
public class RunnableThing extends Thread {

    int threadNumber;

    RunnableThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i =1;i<=5;i++) {
            System.out.println(i + " the thread number is " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
