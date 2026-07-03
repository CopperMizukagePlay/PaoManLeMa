package p062i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1841b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f10909a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f10909a.getAndIncrement());
        return thread;
    }
}
