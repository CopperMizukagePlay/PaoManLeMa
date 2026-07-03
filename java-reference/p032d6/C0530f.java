package p032d6;

import java.util.concurrent.locks.LockSupport;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.f */
/* loaded from: classes.dex */
public final class C0530f extends AbstractC0515a {

    /* renamed from: h */
    public final Thread f1871h;

    /* renamed from: i */
    public final AbstractC0570s0 f1872i;

    public C0530f(InterfaceC2318h interfaceC2318h, Thread thread, AbstractC0570s0 abstractC0570s0) {
        super(interfaceC2318h, true);
        this.f1871h = thread;
        this.f1872i = abstractC0570s0;
    }

    @Override // p032d6.C0541i1
    /* renamed from: D */
    public final void mo1159D(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1871h;
        if (!AbstractC3367j.m5096a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
