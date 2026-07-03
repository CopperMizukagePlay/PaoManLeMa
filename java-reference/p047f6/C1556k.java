package p047f6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p032d6.InterfaceC0589y1;
import p039e5.C1279sl;
import p069i6.AbstractC2104q;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.k */
/* loaded from: classes.dex */
public final class C1556k extends AbstractC2104q {

    /* renamed from: e */
    public final C1548c f10170e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f10171f;

    public C1556k(long j6, C1556k c1556k, C1548c c1548c, int i7) {
        super(j6, c1556k, i7);
        this.f10170e = c1548c;
        this.f10171f = new AtomicReferenceArray(AbstractC1550e.f10147b * 2);
    }

    @Override // p069i6.AbstractC2104q
    /* renamed from: g */
    public final int mo2511g() {
        return AbstractC1550e.f10147b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m2516n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        p158u5.AbstractC3367j.m5097b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // p069i6.AbstractC2104q
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2512h(int i7, InterfaceC2318h interfaceC2318h) {
        boolean z7;
        C1279sl c1279sl;
        int i8 = AbstractC1550e.f10147b;
        if (i7 >= i8) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i7 -= i8;
        }
        this.f10171f.get(i7 * 2);
        while (true) {
            Object m2514l = m2514l(i7);
            boolean z8 = m2514l instanceof InterfaceC0589y1;
            C1548c c1548c = this.f10170e;
            if (!z8 && !(m2514l instanceof C1564s)) {
                if (m2514l == AbstractC1550e.f10155j || m2514l == AbstractC1550e.f10156k) {
                    break;
                }
                if (m2514l != AbstractC1550e.f10152g && m2514l != AbstractC1550e.f10151f) {
                    if (m2514l != AbstractC1550e.f10154i && m2514l != AbstractC1550e.f10149d && m2514l != AbstractC1550e.f10157l) {
                        throw new IllegalStateException(("unexpected state: " + m2514l).toString());
                    }
                    return;
                }
            } else {
                if (z7) {
                    c1279sl = AbstractC1550e.f10155j;
                } else {
                    c1279sl = AbstractC1550e.f10156k;
                }
                if (m2513k(i7, m2514l, c1279sl)) {
                    m2516n(i7, null);
                    m2515m(i7, !z7);
                    if (z7) {
                        AbstractC3367j.m5097b(c1548c);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public final boolean m2513k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f10171f;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    /* renamed from: l */
    public final Object m2514l(int i7) {
        return this.f10171f.get((i7 * 2) + 1);
    }

    /* renamed from: m */
    public final void m2515m(int i7, boolean z7) {
        if (z7) {
            C1548c c1548c = this.f10170e;
            AbstractC3367j.m5097b(c1548c);
            c1548c.m2487F((this.f12380c * AbstractC1550e.f10147b) + i7);
        }
        m3463i();
    }

    /* renamed from: n */
    public final void m2516n(int i7, Object obj) {
        this.f10171f.set(i7 * 2, obj);
    }

    /* renamed from: o */
    public final void m2517o(int i7, Object obj) {
        this.f10171f.set((i7 * 2) + 1, obj);
    }
}
