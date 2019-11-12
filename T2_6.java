// 6. WAP for java daemon threads.

class DaemonThread extends Thread
{
    public DaemonThread(String s)
    {
        super(s);
    }
    public void run()
    {
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon");
        } else {
            System.out.println(getName() + " is User Thread");
        }
    }
}

public class T2_6
{
    public static void main(String args[])
    {
        DaemonThread dt1 = new DaemonThread("a");
        DaemonThread dt2 = new DaemonThread("b");

        dt1.setDaemon(true);

        dt1.start();
        dt2.start();
    }
}