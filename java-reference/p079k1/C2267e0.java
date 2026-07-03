package p079k1;

import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0053n;
import p027d1.C0467e;
import p035e1.C0666m;
import p049g1.C1568b;
import p072j1.AbstractC2163b;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p092m.AbstractC2487d;
import p140s2.EnumC3103m;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.e0 */
/* loaded from: classes.dex */
public final class C2267e0 extends AbstractC2163b {

    /* renamed from: e */
    public final C2361g1 f13141e = AbstractC2418w.m3980x(new C0467e(0));

    /* renamed from: f */
    public final C2361g1 f13142f = AbstractC2418w.m3980x(Boolean.FALSE);

    /* renamed from: g */
    public final C2289z f13143g;

    /* renamed from: h */
    public final C2349d1 f13144h;

    /* renamed from: i */
    public float f13145i;

    /* renamed from: j */
    public C0666m f13146j;

    /* renamed from: k */
    public int f13147k;

    public C2267e0(C2260b c2260b) {
        C2289z c2289z = new C2289z(c2260b);
        c2289z.f13213f = new C0053n(13, this);
        this.f13143g = c2289z;
        this.f13144h = new C2349d1(0);
        this.f13145i = 1.0f;
        this.f13147k = -1;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: a */
    public final void mo3502a(float f7) {
        this.f13145i = f7;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: b */
    public final void mo3503b(C0666m c0666m) {
        this.f13146j = c0666m;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: d */
    public final long mo3504d() {
        return ((C0467e) this.f13141e.getValue()).f1637a;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: e */
    public final void mo3505e(C3508i0 c3508i0) {
        C1568b c1568b = c3508i0.f16933e;
        C0666m c0666m = this.f13146j;
        C2289z c2289z = this.f13143g;
        if (c0666m == null) {
            c0666m = (C0666m) c2289z.f13214g.getValue();
        }
        if (((Boolean) this.f13142f.getValue()).booleanValue() && c3508i0.getLayoutDirection() == EnumC3103m.f15704f) {
            long mo2545Y = c1568b.mo2545Y();
            C0031h1 c0031h1 = c1568b.f10182f;
            long m109x = c0031h1.m109x();
            c0031h1.m106u().mo1341m();
            try {
                ((C0019e1) c0031h1.f152f).m48t(-1.0f, 1.0f, mo2545Y);
                c2289z.m3676e(c3508i0, this.f13145i, c0666m);
            } finally {
                AbstractC2487d.m4052p(c0031h1, m109x);
            }
        } else {
            c2289z.m3676e(c3508i0, this.f13145i, c0666m);
        }
        this.f13147k = this.f13144h.m3741g();
    }
}
