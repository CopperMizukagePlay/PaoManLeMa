package p019c1;

import p077k.AbstractC2212q0;
import p077k.C2184c0;
import p077k.C2196i0;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.h */
/* loaded from: classes.dex */
public final class C0364h {

    /* renamed from: a */
    public final C0368l f1230a;

    /* renamed from: b */
    public final C3728t f1231b;

    /* renamed from: c */
    public final C2196i0 f1232c;

    /* renamed from: d */
    public final C2196i0 f1233d;

    /* renamed from: e */
    public boolean f1234e;

    public C0364h(C0368l c0368l, C3728t c3728t) {
        this.f1230a = c0368l;
        this.f1231b = c3728t;
        int i7 = AbstractC2212q0.f12726a;
        this.f1232c = new C2196i0();
        this.f1233d = new C2196i0();
    }

    /* renamed from: a */
    public final void m829a() {
        if (!this.f1234e) {
            C0363g c0363g = new C0363g(0, this, C0364h.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 0);
            C2184c0 c2184c0 = this.f1231b.f17782z0;
            if (c2184c0.m3561f(c0363g) < 0) {
                c2184c0.m3556a(c0363g);
            }
            this.f1234e = true;
        }
    }
}
