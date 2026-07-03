package p091l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p039e5.C1279sl;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l6.c */
/* loaded from: classes.dex */
public final class C2472c extends C2477h implements InterfaceC2470a {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13762h = AtomicReferenceFieldUpdater.newUpdater(C2472c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C2472c() {
        super(1);
        this.owner$volatile = AbstractC2473d.f13763a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = r0.f13761f;
        p091l6.C2472c.f13762h.set(r2, null);
        r3 = r0.f13760e;
        r3.m1211E(r1, r3.f1892g, new p032d6.C0545k(0, new p015b6.C0310q(19, r2, r0)));
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4028d(AbstractC2583c abstractC2583c) {
        boolean m4029e = m4029e();
        C1694m c1694m = C1694m.f10482a;
        if (!m4029e) {
            C0548l m1136n = AbstractC0525d0.m1136n(AbstractC2064e.m3250x(abstractC2583c));
            try {
                C2471b c2471b = new C2471b(this, m1136n);
                while (true) {
                    int andDecrement = C2477h.f13770g.getAndDecrement(this);
                    if (andDecrement <= this.f13771a) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (m4032b(c2471b)) {
                            break;
                        }
                    }
                }
                Object m1221t = m1136n.m1221t();
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m1221t != enumC2465a) {
                    m1221t = c1694m;
                }
                if (m1221t == enumC2465a) {
                    return m1221t;
                }
            } catch (Throwable th) {
                m1136n.m1210D();
                throw th;
            }
        }
        return c1694m;
    }

    /* renamed from: e */
    public final boolean m4029e() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2477h.f13770g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = this.f13771a;
            if (i8 > i9) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > i9) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i9));
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f13762h.set(this, null);
                    return true;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m4030f(Object obj) {
        while (Math.max(C2477h.f13770g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13762h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1279sl c1279sl = AbstractC2473d.f13763a;
            if (obj2 != c1279sl) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1279sl)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                m4033c();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0525d0.m1134l(this));
        sb.append("[isLocked=");
        boolean z7 = false;
        if (Math.max(C2477h.f13770g.get(this), 0) == 0) {
            z7 = true;
        }
        sb.append(z7);
        sb.append(",owner=");
        sb.append(f13762h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
