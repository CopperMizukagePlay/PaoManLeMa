package p069i6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.j */
/* loaded from: classes.dex */
public class C2097j {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12367a = AtomicReferenceFieldUpdater.newUpdater(C2097j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2099l(8, false);

    /* renamed from: a */
    public final boolean m3451a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12367a;
            C2099l c2099l = (C2099l) atomicReferenceFieldUpdater.get(this);
            int m3455a = c2099l.m3455a(runnable);
            if (m3455a == 0) {
                return true;
            }
            if (m3455a != 1) {
                if (m3455a == 2) {
                    return false;
                }
            } else {
                C2099l m3457c = c2099l.m3457c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2099l, m3457c) && atomicReferenceFieldUpdater.get(this) == c2099l) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3452b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12367a;
            C2099l c2099l = (C2099l) atomicReferenceFieldUpdater.get(this);
            if (c2099l.m3456b()) {
                return;
            }
            C2099l m3457c = c2099l.m3457c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2099l, m3457c) && atomicReferenceFieldUpdater.get(this) == c2099l) {
            }
        }
    }

    /* renamed from: c */
    public final int m3453c() {
        C2099l c2099l = (C2099l) f12367a.get(this);
        c2099l.getClass();
        long j6 = C2099l.f12370f.get(c2099l);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    /* renamed from: d */
    public final Object m3454d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12367a;
            C2099l c2099l = (C2099l) atomicReferenceFieldUpdater.get(this);
            Object m3458d = c2099l.m3458d();
            if (m3458d != C2099l.f12371g) {
                return m3458d;
            }
            C2099l m3457c = c2099l.m3457c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2099l, m3457c) && atomicReferenceFieldUpdater.get(this) == c2099l) {
            }
        }
    }
}
