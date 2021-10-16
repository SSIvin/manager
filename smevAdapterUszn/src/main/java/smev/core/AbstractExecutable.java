package smev.core;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class AbstractExecutable
        implements Executable {
    private final AtomicBoolean run = new AtomicBoolean(false);


    private final Condition condition;


    private final Lock lock;


    protected AbstractExecutable() {

        this.lock = new ReentrantLock();

        this.condition = this.lock.newCondition();
    }


    public final boolean isRun() {

        return this.run.get();
    }


    public final void wait(long time, TimeUnit unit) {

        this.lock.lock();
        try {

            this.condition.await(time, unit);

        } catch (InterruptedException interruptedException) {

        } finally {

            this.lock.unlock();
        }
    }


    private void waitSignal() {
        /* 59 */
        this.lock.lock();
        try {
            /* 61 */
            this.condition.signalAll();
        } finally {
            /* 63 */
            this.lock.unlock();
        }
    }


    public void stop() {
        /* 69 */
        this.run.set(false);
        /* 70 */
        waitSignal();
    }


    public void start() {
        /* 75 */
        this.run.set(true);
    }
}
