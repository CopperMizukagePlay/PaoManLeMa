package p106n6;

import java.util.concurrent.ThreadFactory;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n6.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2720a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f14567a;

    /* renamed from: b */
    public final /* synthetic */ boolean f14568b;

    public /* synthetic */ ThreadFactoryC2720a(String str, boolean z7) {
        this.f14567a = str;
        this.f14568b = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f14567a;
        AbstractC3367j.m5100e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f14568b);
        return thread;
    }
}
