package org.example;

public class myTask {
    public void doTask(CallBack.callback callback) {
        System.out.println("task is completed");
        callback.onComplete();
    }
}
