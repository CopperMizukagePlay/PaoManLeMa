package p096m3;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2551a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f13917a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f13917a);
        thread.setPriority(10);
        return thread;
    }
}
