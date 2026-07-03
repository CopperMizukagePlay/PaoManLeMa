package p032d6;

import p040e6.C1507c;
import p069i6.C2094g;
import p082k5.C2319i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.p1 */
/* loaded from: classes.dex */
public final class RunnableC0562p1 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f1910e;

    /* renamed from: f */
    public final Object f1911f;

    /* renamed from: g */
    public Object f1912g;

    public /* synthetic */ RunnableC0562p1(int i7, Object obj, Object obj2) {
        this.f1910e = i7;
        this.f1911f = obj;
        this.f1912g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1910e) {
            case 0:
                ((C0548l) this.f1911f).m1212F((C0576u0) this.f1912g);
                return;
            case 1:
                ((C0548l) this.f1911f).m1212F((C1507c) this.f1912g);
                return;
            default:
                C2094g c2094g = (C2094g) this.f1911f;
                AbstractC0581w abstractC0581w = c2094g.f12359h;
                int i7 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1912g).run();
                    } catch (Throwable th) {
                        AbstractC0525d0.m1137o(th, C2319i.f13273e);
                    }
                    Runnable m3446M = c2094g.m3446M();
                    if (m3446M != null) {
                        this.f1912g = m3446M;
                        i7++;
                        if (i7 >= 16 && abstractC0581w.mo1244K(c2094g)) {
                            abstractC0581w.mo1233J(c2094g, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    public RunnableC0562p1(C0576u0 c0576u0, C0548l c0548l) {
        this.f1910e = 0;
        this.f1912g = c0576u0;
        this.f1911f = c0548l;
    }
}
