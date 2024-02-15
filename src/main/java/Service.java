public class Service {
    public static void throwThreadInfo(Thread thread) {
        System.out.println(thread.threadId());
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(thread.getPriority());
    }
}
