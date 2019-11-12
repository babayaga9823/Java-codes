// 7. WAP that illustrates java thread joins.

class JoinThread extends Thread
{
    @Override
    public void run()
    {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

class T2_7 {
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        JoinThread t3 = new JoinThread();

        t1.start();
        try {
            System.out.println("Thread: " + Thread.currentThread().getName());
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        try {
            System.out.println("Thread: " + Thread.currentThread().getName());
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t3.start();
    }
}