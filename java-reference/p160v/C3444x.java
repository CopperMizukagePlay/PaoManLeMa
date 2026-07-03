package p160v;

import p001a0.C0016d2;
import p001a0.C0053n;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p035e1.InterfaceC0682x;
import p057h1.C1752b;
import p065i2.AbstractC2064e;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p100n.AbstractC2667n1;
import p100n.C2635d;
import p100n.InterfaceC2627a0;
import p140s2.C3100j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.x */
/* loaded from: classes.dex */
public final class C3444x {

    /* renamed from: s */
    public static final long f16636s = AbstractC2064e.m3234d(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: t */
    public static final /* synthetic */ int f16637t = 0;

    /* renamed from: a */
    public final InterfaceC0516a0 f16638a;

    /* renamed from: b */
    public final InterfaceC0682x f16639b;

    /* renamed from: c */
    public final C0053n f16640c;

    /* renamed from: d */
    public InterfaceC2627a0 f16641d;

    /* renamed from: e */
    public InterfaceC2627a0 f16642e;

    /* renamed from: f */
    public InterfaceC2627a0 f16643f;

    /* renamed from: g */
    public boolean f16644g;

    /* renamed from: h */
    public final C2361g1 f16645h;

    /* renamed from: i */
    public final C2361g1 f16646i;

    /* renamed from: j */
    public final C2361g1 f16647j;

    /* renamed from: k */
    public final C2361g1 f16648k;

    /* renamed from: l */
    public long f16649l;

    /* renamed from: m */
    public long f16650m;

    /* renamed from: n */
    public C1752b f16651n;

    /* renamed from: o */
    public final C2635d f16652o;

    /* renamed from: p */
    public final C2635d f16653p;

    /* renamed from: q */
    public final C2361g1 f16654q;

    /* renamed from: r */
    public long f16655r;

    public C3444x(InterfaceC0516a0 interfaceC0516a0, InterfaceC0682x interfaceC0682x, C0053n c0053n) {
        C1752b c1752b;
        this.f16638a = interfaceC0516a0;
        this.f16639b = interfaceC0682x;
        this.f16640c = c0053n;
        Boolean bool = Boolean.FALSE;
        this.f16645h = AbstractC2418w.m3980x(bool);
        this.f16646i = AbstractC2418w.m3980x(bool);
        this.f16647j = AbstractC2418w.m3980x(bool);
        this.f16648k = AbstractC2418w.m3980x(bool);
        long j6 = f16636s;
        this.f16649l = j6;
        this.f16650m = 0L;
        if (interfaceC0682x != null) {
            c1752b = interfaceC0682x.mo1360b();
        } else {
            c1752b = null;
        }
        this.f16651n = c1752b;
        this.f16652o = new C2635d(new C3100j(0L), AbstractC2667n1.f14371g, null, 12);
        this.f16653p = new C2635d(Float.valueOf(1.0f), AbstractC2667n1.f14365a, null, 12);
        this.f16654q = AbstractC2418w.m3980x(new C3100j(0L));
        this.f16655r = j6;
    }

    /* renamed from: a */
    public final void m5188a() {
        C1752b c1752b = this.f16651n;
        InterfaceC2627a0 interfaceC2627a0 = this.f16641d;
        boolean booleanValue = ((Boolean) this.f16646i.getValue()).booleanValue();
        InterfaceC0516a0 interfaceC0516a0 = this.f16638a;
        InterfaceC2313c interfaceC2313c = null;
        if (!booleanValue && interfaceC2627a0 != null && c1752b != null) {
            m5191d(true);
            boolean m5189b = m5189b();
            boolean z7 = !m5189b;
            if (!m5189b) {
                c1752b.m2810f(0.0f);
            }
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0016d2(z7, this, interfaceC2627a0, c1752b, null, 3), 3);
            return;
        }
        if (m5189b()) {
            if (c1752b != null) {
                c1752b.m2810f(1.0f);
            }
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C3440v(this, interfaceC2313c, 0), 3);
        }
    }

    /* renamed from: b */
    public final boolean m5189b() {
        return ((Boolean) this.f16647j.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final void m5190c() {
        InterfaceC0682x interfaceC0682x;
        boolean booleanValue = ((Boolean) this.f16645h.getValue()).booleanValue();
        InterfaceC0516a0 interfaceC0516a0 = this.f16638a;
        InterfaceC2313c interfaceC2313c = null;
        if (booleanValue) {
            m5193f(false);
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C3440v(this, interfaceC2313c, 2), 3);
        }
        if (((Boolean) this.f16646i.getValue()).booleanValue()) {
            m5191d(false);
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C3440v(this, interfaceC2313c, 3), 3);
        }
        if (m5189b()) {
            m5192e(false);
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C3440v(this, interfaceC2313c, 4), 3);
        }
        this.f16644g = false;
        m5194g(0L);
        this.f16649l = f16636s;
        C1752b c1752b = this.f16651n;
        if (c1752b != null && (interfaceC0682x = this.f16639b) != null) {
            interfaceC0682x.mo1359a(c1752b);
        }
        this.f16651n = null;
        this.f16641d = null;
        this.f16643f = null;
        this.f16642e = null;
    }

    /* renamed from: d */
    public final void m5191d(boolean z7) {
        this.f16646i.setValue(Boolean.valueOf(z7));
    }

    /* renamed from: e */
    public final void m5192e(boolean z7) {
        this.f16647j.setValue(Boolean.valueOf(z7));
    }

    /* renamed from: f */
    public final void m5193f(boolean z7) {
        this.f16645h.setValue(Boolean.valueOf(z7));
    }

    /* renamed from: g */
    public final void m5194g(long j6) {
        this.f16654q.setValue(new C3100j(j6));
    }
}
