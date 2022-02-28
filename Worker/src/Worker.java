public class Worker {
    private final OnTaskDoneListener callback1;
    private final OnTaskDoneListener callback2;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    public Worker(OnTaskDoneListener callback1,OnTaskDoneListener callback2) {
        this.callback1 = callback1;
        this.callback2 = callback2;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                System.out.println("Task is invalid");
            } else {
                callback1.onDone("Task " + i + " is done");
            }
        }
    }
}
