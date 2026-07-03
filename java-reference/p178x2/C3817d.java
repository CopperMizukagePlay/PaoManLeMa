package p178x2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p065i2.AbstractC2064e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x2.d */
/* loaded from: classes.dex */
public final class C3817d extends AbstractC2064e {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f18014a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f18015b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f18016c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f18017d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f18018e;

    public C3817d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f18014a = atomicReferenceFieldUpdater;
        this.f18015b = atomicReferenceFieldUpdater2;
        this.f18016c = atomicReferenceFieldUpdater3;
        this.f18017d = atomicReferenceFieldUpdater4;
        this.f18018e = atomicReferenceFieldUpdater5;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: C */
    public final void mo3255C(C3819f c3819f, C3819f c3819f2) {
        this.f18015b.lazySet(c3819f, c3819f2);
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: D */
    public final void mo3256D(C3819f c3819f, Thread thread) {
        this.f18014a.lazySet(c3819f, thread);
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: i */
    public final boolean mo3257i(AbstractFutureC3820g abstractFutureC3820g, C3816c c3816c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18017d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC3820g, c3816c, C3816c.f18012b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC3820g) == c3816c);
        return false;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: j */
    public final boolean mo3258j(AbstractFutureC3820g abstractFutureC3820g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18018e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC3820g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC3820g) == obj);
        return false;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: k */
    public final boolean mo3259k(AbstractFutureC3820g abstractFutureC3820g, C3819f c3819f, C3819f c3819f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18016c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC3820g, c3819f, c3819f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC3820g) == c3819f);
        return false;
    }
}
