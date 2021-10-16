package smev.core;

public interface Executable extends Runnable {
  boolean isRun();

  void stop();

  void start();
}
