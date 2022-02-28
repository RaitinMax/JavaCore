
public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener1 = System.out::println;
        Worker.OnTaskDoneListener listener2 = System.out::println;
        var worker = new Worker(listener1,listener2);
        worker.start();
    }
}
