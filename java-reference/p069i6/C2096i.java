package p069i6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.AbstractC0525d0;
import p063i0.C1990r3;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.i */
/* loaded from: classes.dex */
public class C2096i {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12364e = AtomicReferenceFieldUpdater.newUpdater(C2096i.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12365f = AtomicReferenceFieldUpdater.newUpdater(C2096i.class, Object.class, "_prev$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12366g = AtomicReferenceFieldUpdater.newUpdater(C2096i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: e */
    public final boolean m3447e(C2096i c2096i, int i7) {
        while (true) {
            C2096i m3448f = m3448f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365f;
            if (m3448f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    m3448f = (C2096i) obj;
                    if (!m3448f.mo1207i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(m3448f);
                }
            }
            if (m3448f instanceof C2095h) {
                if ((((C2095h) m3448f).f12363h & i7) == 0 && m3448f.m3447e(c2096i, i7)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(c2096i, m3448f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12364e;
            atomicReferenceFieldUpdater2.set(c2096i, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(m3448f, this, c2096i)) {
                if (atomicReferenceFieldUpdater2.get(m3448f) != this) {
                    break;
                }
            }
            c2096i.m3449g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((p069i6.C2101n) r6).f12377a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2096i m3448f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365f;
            C2096i c2096i = (C2096i) atomicReferenceFieldUpdater.get(this);
            C2096i c2096i2 = c2096i;
            while (true) {
                C2096i c2096i3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12364e;
                    Object obj = atomicReferenceFieldUpdater2.get(c2096i2);
                    if (obj == this) {
                        if (c2096i == c2096i2) {
                            return c2096i2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2096i, c2096i2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c2096i) {
                                break;
                            }
                        }
                        return c2096i2;
                    }
                    if (mo1207i()) {
                        return null;
                    }
                    if (obj instanceof C2101n) {
                        if (c2096i3 != null) {
                            break;
                        }
                        c2096i2 = (C2096i) atomicReferenceFieldUpdater.get(c2096i2);
                    } else {
                        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c2096i3 = c2096i2;
                        c2096i2 = (C2096i) obj;
                    }
                }
                c2096i2 = c2096i3;
            }
        }
    }

    /* renamed from: g */
    public final void m3449g(C2096i c2096i) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12365f;
            C2096i c2096i2 = (C2096i) atomicReferenceFieldUpdater.get(c2096i);
            if (f12364e.get(this) != c2096i) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2096i, c2096i2, this)) {
                if (atomicReferenceFieldUpdater.get(c2096i) != c2096i2) {
                    break;
                }
            }
            if (mo1207i()) {
                c2096i.m3448f();
                return;
            }
            return;
        }
    }

    /* renamed from: h */
    public final C2096i m3450h() {
        C2101n c2101n;
        C2096i c2096i;
        Object obj = f12364e.get(this);
        if (obj instanceof C2101n) {
            c2101n = (C2101n) obj;
        } else {
            c2101n = null;
        }
        if (c2101n != null && (c2096i = c2101n.f12377a) != null) {
            return c2096i;
        }
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C2096i) obj;
    }

    /* renamed from: i */
    public boolean mo1207i() {
        return f12364e.get(this) instanceof C2101n;
    }

    public String toString() {
        return new C1990r3(this, AbstractC0525d0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, 1) + '@' + AbstractC0525d0.m1134l(this);
    }
}
