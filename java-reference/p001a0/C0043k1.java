package p001a0;

import p023c5.C0427s;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p050g2.AbstractC1589h;
import p050g2.C1587g;
import p050g2.C1602n0;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2405r1;
import p087l2.C2437c0;
import p087l2.C2444h;
import p087l2.C2459w;
import p140s2.C3096f;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p170w1.InterfaceC3663c2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.k1 */
/* loaded from: classes.dex */
public final class C0043k1 {

    /* renamed from: a */
    public C0067q1 f211a;

    /* renamed from: b */
    public final C2405r1 f212b;

    /* renamed from: c */
    public final InterfaceC3663c2 f213c;

    /* renamed from: d */
    public final C0068q2 f214d;

    /* renamed from: e */
    public C2437c0 f215e;

    /* renamed from: f */
    public final C2361g1 f216f;

    /* renamed from: g */
    public final C2361g1 f217g;

    /* renamed from: h */
    public InterfaceC3238v f218h;

    /* renamed from: i */
    public final C2361g1 f219i;

    /* renamed from: j */
    public C1587g f220j;

    /* renamed from: k */
    public final C2361g1 f221k;

    /* renamed from: l */
    public final C2361g1 f222l;

    /* renamed from: m */
    public final C2361g1 f223m;

    /* renamed from: n */
    public final C2361g1 f224n;

    /* renamed from: o */
    public final C2361g1 f225o;

    /* renamed from: p */
    public boolean f226p;

    /* renamed from: q */
    public final C2361g1 f227q;

    /* renamed from: r */
    public final C0031h1 f228r;

    /* renamed from: s */
    public InterfaceC3279c f229s;

    /* renamed from: t */
    public final C0006b0 f230t;

    /* renamed from: u */
    public final C0006b0 f231u;

    /* renamed from: v */
    public final C0427s f232v;

    /* renamed from: w */
    public long f233w;

    /* renamed from: x */
    public final C2361g1 f234x;

    /* renamed from: y */
    public final C2361g1 f235y;

    public C0043k1(C0067q1 c0067q1, C2405r1 c2405r1, InterfaceC3663c2 interfaceC3663c2) {
        this.f211a = c0067q1;
        this.f212b = c2405r1;
        this.f213c = interfaceC3663c2;
        C0068q2 c0068q2 = new C0068q2(15, false);
        C1587g c1587g = AbstractC1589h.f10258a;
        long j6 = C1602n0.f10302b;
        C2459w c2459w = new C2459w(c1587g, j6, (C1602n0) null);
        c0068q2.f345g = c2459w;
        c0068q2.f344f = new C2444h(c1587g, c2459w.f13724b);
        this.f214d = c0068q2;
        Boolean bool = Boolean.FALSE;
        this.f216f = AbstractC2418w.m3980x(bool);
        this.f217g = AbstractC2418w.m3980x(new C3096f(0));
        this.f219i = AbstractC2418w.m3980x(null);
        this.f221k = AbstractC2418w.m3980x(EnumC0091x0.f416e);
        this.f222l = AbstractC2418w.m3980x(bool);
        this.f223m = AbstractC2418w.m3980x(bool);
        this.f224n = AbstractC2418w.m3980x(bool);
        this.f225o = AbstractC2418w.m3980x(bool);
        this.f226p = true;
        this.f227q = AbstractC2418w.m3980x(Boolean.TRUE);
        this.f228r = new C0031h1(interfaceC3663c2);
        this.f229s = C0029h.f137j;
        this.f230t = new C0006b0(this, 5);
        this.f231u = new C0006b0(this, 4);
        this.f232v = AbstractC0659i0.m1407g();
        this.f233w = C0677s.f2209g;
        this.f234x = AbstractC2418w.m3980x(new C1602n0(j6));
        this.f235y = AbstractC2418w.m3980x(new C1602n0(j6));
    }

    /* renamed from: a */
    public final EnumC0091x0 m117a() {
        return (EnumC0091x0) this.f221k.getValue();
    }

    /* renamed from: b */
    public final boolean m118b() {
        return ((Boolean) this.f216f.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final InterfaceC3238v m119c() {
        InterfaceC3238v interfaceC3238v = this.f218h;
        if (interfaceC3238v != null && interfaceC3238v.mo4923M()) {
            return interfaceC3238v;
        }
        return null;
    }

    /* renamed from: d */
    public final C0064p2 m120d() {
        return (C0064p2) this.f219i.getValue();
    }

    /* renamed from: e */
    public final void m121e(long j6) {
        this.f235y.setValue(new C1602n0(j6));
    }

    /* renamed from: f */
    public final void m122f(long j6) {
        this.f234x.setValue(new C1602n0(j6));
    }
}
