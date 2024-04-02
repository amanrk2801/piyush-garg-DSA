public class TimedBlock {
    private final Runnable block;
    private long timeTaken;

    public TimedBlock(Runnable block) {
        this.block = block;
    }

    public void run() {
        long startTime = System.nanoTime();
        block.run();
        long endTime = System.nanoTime();
        timeTaken = endTime - startTime;
    }

    public long getTimeTaken() {
        return timeTaken;
    }
}
