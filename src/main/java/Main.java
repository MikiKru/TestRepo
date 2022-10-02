
public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        this.wait(10000);
                        System.out.println("Thread in runnable state");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // mmmm
        myThread.start();
    }
}
