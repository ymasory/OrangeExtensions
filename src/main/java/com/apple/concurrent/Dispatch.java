package com.apple.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class Dispatch
{
    static RuntimeException unimplemented()
    {
        return new RuntimeException("Unimplemented");
    }

    public static Dispatch getInstance() {
        throw unimplemented();
    }

    public Executor getAsyncExecutor(Priority paramPriority) {
        throw unimplemented();
    }

    public ExecutorService createSerialExecutor(String paramString) {
        throw unimplemented();
    }

    public Executor getNonBlockingMainQueueExecutor() {
        throw unimplemented();
    }

    public Executor getBlockingMainQueueExecutor() {
        throw unimplemented();
    }

    public static enum Priority
    {
        LOW(-2), NORMAL(0), HIGH(2);

        private Priority(int paramInt)
        {
        }
    }
}
