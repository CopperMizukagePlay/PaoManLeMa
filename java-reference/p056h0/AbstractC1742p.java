package p056h0;

import p001a0.C0062p0;
import p032d6.AbstractC0525d0;
import p063i0.C1880e1;
import p063i0.C1889f1;
import p067i4.AbstractC2072e;
import p077k.C2184c0;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3080i;
import p137s.InterfaceC3085n;
import p140s2.InterfaceC3093c;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3522n;
import p162v1.InterfaceC3546v;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.p */
/* loaded from: classes.dex */
public abstract class AbstractC1742p extends AbstractC3809q implements InterfaceC3513k, InterfaceC3522n, InterfaceC3546v {

    /* renamed from: A */
    public boolean f10630A;

    /* renamed from: s */
    public final InterfaceC3080i f10632s;

    /* renamed from: t */
    public final boolean f10633t;

    /* renamed from: u */
    public final float f10634u;

    /* renamed from: v */
    public final C1880e1 f10635v;

    /* renamed from: w */
    public final C1889f1 f10636w;

    /* renamed from: x */
    public C1748v f10637x;

    /* renamed from: y */
    public float f10638y;

    /* renamed from: z */
    public long f10639z = 0;

    /* renamed from: B */
    public final C2184c0 f10631B = new C2184c0();

    public AbstractC1742p(InterfaceC3080i interfaceC3080i, boolean z7, float f7, C1880e1 c1880e1, C1889f1 c1889f1) {
        this.f10632s = interfaceC3080i;
        this.f10633t = z7;
        this.f10634u = f7;
        this.f10635v = c1880e1;
        this.f10636w = c1889f1;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        AbstractC0525d0.m1141s(m5830y0(), null, new C0062p0(this, null, 18), 3);
    }

    /* renamed from: K0 */
    public abstract void mo2783K0(C3083l c3083l, long j6, float f7);

    /* renamed from: L0 */
    public abstract void mo2784L0(C3508i0 c3508i0);

    /* renamed from: M0 */
    public final void m2797M0(InterfaceC3085n interfaceC3085n) {
        if (interfaceC3085n instanceof C3083l) {
            mo2783K0((C3083l) interfaceC3085n, this.f10639z, this.f10638y);
        } else if (interfaceC3085n instanceof C3084m) {
            mo2785N0(((C3084m) interfaceC3085n).f15682a);
        } else if (interfaceC3085n instanceof C3082k) {
            mo2785N0(((C3082k) interfaceC3085n).f15680a);
        }
    }

    /* renamed from: N0 */
    public abstract void mo2785N0(C3083l c3083l);

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        c3508i0.m5460a();
        C1748v c1748v = this.f10637x;
        if (c1748v != null) {
            c1748v.m2800a(c3508i0, this.f10638y, this.f10635v.mo1461a());
        }
        mo2784L0(c3508i0);
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: r */
    public final void mo205r(long j6) {
        float mo4526y;
        this.f10630A = true;
        InterfaceC3093c interfaceC3093c = AbstractC3498f.m5382v(this).f16865B;
        this.f10639z = AbstractC2072e.m3347y(j6);
        float f7 = this.f10634u;
        if (Float.isNaN(f7)) {
            mo4526y = AbstractC1737k.m2790a(interfaceC3093c, this.f10633t, this.f10639z);
        } else {
            mo4526y = interfaceC3093c.mo4526y(f7);
        }
        this.f10638y = mo4526y;
        C2184c0 c2184c0 = this.f10631B;
        Object[] objArr = c2184c0.f12628a;
        int i7 = c2184c0.f12629b;
        for (int i8 = 0; i8 < i7; i8++) {
            m2797M0((InterfaceC3085n) objArr[i8]);
        }
        c2184c0.m3558c();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
