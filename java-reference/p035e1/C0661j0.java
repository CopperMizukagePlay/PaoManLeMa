package p035e1;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.j0 */
/* loaded from: classes.dex */
public final class C0661j0 implements InterfaceC3093c {

    /* renamed from: e */
    public int f2154e;

    /* renamed from: f */
    public float f2155f;

    /* renamed from: g */
    public float f2156g;

    /* renamed from: h */
    public float f2157h;

    /* renamed from: i */
    public float f2158i;

    /* renamed from: j */
    public float f2159j;

    /* renamed from: k */
    public float f2160k;

    /* renamed from: l */
    public long f2161l;

    /* renamed from: m */
    public long f2162m;

    /* renamed from: n */
    public float f2163n;

    /* renamed from: o */
    public float f2164o;

    /* renamed from: p */
    public long f2165p;

    /* renamed from: q */
    public InterfaceC0667m0 f2166q;

    /* renamed from: r */
    public boolean f2167r;

    /* renamed from: s */
    public long f2168s;

    /* renamed from: t */
    public InterfaceC3093c f2169t;

    /* renamed from: u */
    public EnumC3103m f2170u;

    /* renamed from: v */
    public int f2171v;

    /* renamed from: w */
    public AbstractC0655g0 f2172w;

    /* renamed from: a */
    public final void m1432a(float f7) {
        if (this.f2157h == f7) {
            return;
        }
        this.f2154e |= 4;
        this.f2157h = f7;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f2169t.mo559b();
    }

    /* renamed from: d */
    public final void m1433d(long j6) {
        if (!C0677s.m1454c(this.f2161l, j6)) {
            this.f2154e |= 64;
            this.f2161l = j6;
        }
    }

    /* renamed from: e */
    public final void m1434e(boolean z7) {
        if (this.f2167r != z7) {
            this.f2154e |= 16384;
            this.f2167r = z7;
        }
    }

    /* renamed from: f */
    public final void m1435f(float f7) {
        if (this.f2155f == f7) {
            return;
        }
        this.f2154e |= 1;
        this.f2155f = f7;
    }

    /* renamed from: g */
    public final void m1436g(float f7) {
        if (this.f2156g == f7) {
            return;
        }
        this.f2154e |= 2;
        this.f2156g = f7;
    }

    /* renamed from: h */
    public final void m1437h(float f7) {
        if (this.f2160k == f7) {
            return;
        }
        this.f2154e |= 32;
        this.f2160k = f7;
    }

    /* renamed from: j */
    public final void m1438j(InterfaceC0667m0 interfaceC0667m0) {
        if (!AbstractC3367j.m5096a(this.f2166q, interfaceC0667m0)) {
            this.f2154e |= 8192;
            this.f2166q = interfaceC0667m0;
        }
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f2169t.mo560l();
    }

    /* renamed from: n */
    public final void m1439n(long j6) {
        if (!C0677s.m1454c(this.f2162m, j6)) {
            this.f2154e |= 128;
            this.f2162m = j6;
        }
    }

    /* renamed from: o */
    public final void m1440o(long j6) {
        long j7 = this.f2165p;
        int i7 = C0675q0.f2201c;
        if (j7 == j6) {
            return;
        }
        this.f2154e |= 4096;
        this.f2165p = j6;
    }

    /* renamed from: p */
    public final void m1441p(float f7) {
        if (this.f2158i == f7) {
            return;
        }
        this.f2154e |= 8;
        this.f2158i = f7;
    }

    /* renamed from: q */
    public final void m1442q(float f7) {
        if (this.f2159j == f7) {
            return;
        }
        this.f2154e |= 16;
        this.f2159j = f7;
    }
}
