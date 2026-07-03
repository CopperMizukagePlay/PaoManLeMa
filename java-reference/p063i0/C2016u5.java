package p063i0;

import p001a0.C0053n;
import p001a0.C0062p0;
import p001a0.C0070r0;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p107o.C2727b1;
import p122q.C2904f0;
import p122q.InterfaceC2922l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u5 */
/* loaded from: classes.dex */
public final class C2016u5 implements InterfaceC2922l0 {

    /* renamed from: e */
    public InterfaceC3277a f11921e;

    /* renamed from: f */
    public final C3876a f11922f;

    /* renamed from: g */
    public final C2345c1 f11923g;

    /* renamed from: h */
    public InterfaceC3279c f11924h;

    /* renamed from: k */
    public boolean f11927k;

    /* renamed from: p */
    public final C2345c1 f11932p;

    /* renamed from: q */
    public final C2345c1 f11933q;

    /* renamed from: r */
    public final C2008t5 f11934r;

    /* renamed from: s */
    public final C2727b1 f11935s;

    /* renamed from: i */
    public final float[] f11925i = new float[0];

    /* renamed from: j */
    public final C2349d1 f11926j = new C2349d1(0);

    /* renamed from: l */
    public final C2345c1 f11928l = new C2345c1(0.0f);

    /* renamed from: m */
    public final C2345c1 f11929m = new C2345c1(0.0f);

    /* renamed from: n */
    public final C2361g1 f11930n = AbstractC2418w.m3980x(Boolean.FALSE);

    /* renamed from: o */
    public final C0053n f11931o = new C0053n(12, this);

    public C2016u5(float f7, InterfaceC3277a interfaceC3277a, C3876a c3876a) {
        float f8;
        this.f11921e = interfaceC3277a;
        this.f11922f = c3876a;
        this.f11923g = new C2345c1(f7);
        float f9 = c3876a.f18161a;
        float f10 = c3876a.f18162b - f9;
        if (f10 == 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = (f7 - f9) / f10;
        }
        this.f11932p = new C2345c1(AbstractC2080d.m3409v(0.0f, 0.0f, AbstractC2168e.m3529p(f8, 0.0f, 1.0f)));
        this.f11933q = new C2345c1(0.0f);
        this.f11934r = new C2008t5(0, this);
        this.f11935s = new C2727b1();
    }

    @Override // p122q.InterfaceC2922l0
    /* renamed from: a */
    public final Object mo140a(C0070r0 c0070r0, C2904f0 c2904f0) {
        Object m1130h = AbstractC0525d0.m1130h(new C0062p0(this, c0070r0, (InterfaceC2313c) null, 28), c2904f0);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }

    /* renamed from: b */
    public final void m3185b(float f7) {
        float f8;
        float m3741g = this.f11926j.m3741g();
        C2345c1 c2345c1 = this.f11929m;
        float f9 = 2;
        float max = Math.max(m3741g - (c2345c1.m3729g() / f9), 0.0f);
        float min = Math.min(c2345c1.m3729g() / f9, max);
        C2345c1 c2345c12 = this.f11932p;
        float m3729g = c2345c12.m3729g() + f7;
        C2345c1 c2345c13 = this.f11933q;
        c2345c12.m3730h(c2345c13.m3729g() + m3729g);
        c2345c13.m3730h(0.0f);
        float m3181e = AbstractC2000s5.m3181e(c2345c12.m3729g(), this.f11925i, min, max);
        C3876a c3876a = this.f11922f;
        float f10 = c3876a.f18161a;
        float f11 = c3876a.f18162b;
        float f12 = max - min;
        if (f12 == 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = (m3181e - min) / f12;
        }
        float m3409v = AbstractC2080d.m3409v(f10, f11, AbstractC2168e.m3529p(f8, 0.0f, 1.0f));
        if (m3409v == this.f11923g.m3729g()) {
            return;
        }
        InterfaceC3279c interfaceC3279c = this.f11924h;
        if (interfaceC3279c != null) {
            interfaceC3279c.mo23f(Float.valueOf(m3409v));
        } else {
            m3187d(m3409v);
        }
    }

    /* renamed from: c */
    public final float m3186c() {
        float f7;
        C3876a c3876a = this.f11922f;
        float f8 = c3876a.f18161a;
        float f9 = c3876a.f18162b;
        float m3529p = AbstractC2168e.m3529p(this.f11923g.m3729g(), f8, f9);
        float f10 = f9 - f8;
        if (f10 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (m3529p - f8) / f10;
        }
        return AbstractC2168e.m3529p(f7, 0.0f, 1.0f);
    }

    /* renamed from: d */
    public final void m3187d(float f7) {
        C3876a c3876a = this.f11922f;
        float f8 = c3876a.f18161a;
        float f9 = c3876a.f18162b;
        this.f11923g.m3730h(AbstractC2000s5.m3181e(AbstractC2168e.m3529p(f7, f8, f9), this.f11925i, f8, f9));
    }
}
