public class ThreadRun {
    public static void method() {
        PrimeRun p = new PrimeRun(155);
        Thread thread = new Thread(p);
        thread.start();
        Service.throwThreadInfo(thread);
        Service.throwThreadInfo(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadRun.method();
    }
}
