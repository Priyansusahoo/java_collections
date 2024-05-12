package runnabletest;

/**
 * @author Priyansu Sahoo
 * @created 12-05-2024 - 01:54 pm
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1;i<=5;i++){
            RunnableThing thing = new RunnableThing(i);
            /**
             * when we implement runnable interface we need to do this to use start();
             * start() creates new thread for each task, whereas run() doesn't
             */
            Thread mythread = new Thread(thing);
            mythread.start();
        }
    }
}
