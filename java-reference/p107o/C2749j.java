package p107o;

import p027d1.C0465c;
import p027d1.C0466d;
import p027d1.C0467e;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0670o;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0660j;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p049g1.C1568b;
import p049g1.C1573g;
import p049g1.InterfaceC1570d;
import p140s2.EnumC3103m;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3522n;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C2749j extends AbstractC3809q implements InterfaceC3522n, InterfaceC3509i1 {

    /* renamed from: s */
    public long f14677s;

    /* renamed from: t */
    public AbstractC0670o f14678t;

    /* renamed from: u */
    public float f14679u;

    /* renamed from: v */
    public InterfaceC0667m0 f14680v;

    /* renamed from: w */
    public long f14681w;

    /* renamed from: x */
    public EnumC3103m f14682x;

    /* renamed from: y */
    public AbstractC0655g0 f14683y;

    /* renamed from: z */
    public InterfaceC0667m0 f14684z;

    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        this.f14681w = 9205357640488583168L;
        this.f14682x = null;
        this.f14683y = null;
        this.f14684z = null;
        AbstractC3498f.m5373m(this);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, u5.v] */
    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        C0660j c0660j;
        C1568b c1568b = c3508i0.f16933e;
        if (this.f14680v == AbstractC0659i0.f2147a) {
            if (!C0677s.m1454c(this.f14677s, C0677s.f2209g)) {
                InterfaceC1570d.m2535D(c3508i0, this.f14677s, 0L, 0L, 0.0f, 126);
            }
            AbstractC0670o abstractC0670o = this.f14678t;
            if (abstractC0670o != null) {
                InterfaceC1570d.m2538J(c3508i0, abstractC0670o, 0L, 0L, this.f14679u, null, 118);
            }
        } else {
            ?? obj = new Object();
            if (C0467e.m1023a(c1568b.mo2546c(), this.f14681w) && c3508i0.getLayoutDirection() == this.f14682x && AbstractC3367j.m5096a(this.f14684z, this.f14680v)) {
                AbstractC0655g0 abstractC0655g0 = this.f14683y;
                AbstractC3367j.m5097b(abstractC0655g0);
                obj.f16451e = abstractC0655g0;
            } else {
                AbstractC3498f.m5379s(this, new C2746i(obj, this, c3508i0, 0));
            }
            this.f14683y = (AbstractC0655g0) obj.f16451e;
            this.f14681w = c1568b.mo2546c();
            this.f14682x = c3508i0.getLayoutDirection();
            this.f14684z = this.f14680v;
            Object obj2 = obj.f16451e;
            AbstractC3367j.m5097b(obj2);
            AbstractC0655g0 abstractC0655g02 = (AbstractC0655g0) obj2;
            if (!C0677s.m1454c(this.f14677s, C0677s.f2209g)) {
                AbstractC0659i0.m1412l(c3508i0, abstractC0655g02, this.f14677s);
            }
            AbstractC0670o abstractC0670o2 = this.f14678t;
            if (abstractC0670o2 != null) {
                float f7 = this.f14679u;
                boolean z7 = abstractC0655g02 instanceof C0651e0;
                C1573g c1573g = C1573g.f10187a;
                if (z7) {
                    C0465c c0465c = ((C0651e0) abstractC0655g02).f2135a;
                    float f8 = c0465c.f1625a;
                    float f9 = c0465c.f1626b;
                    c3508i0.m5462e(abstractC0670o2, (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), AbstractC0659i0.m1421u(c0465c), f7, c1573g);
                } else {
                    if (abstractC0655g02 instanceof C0653f0) {
                        C0653f0 c0653f0 = (C0653f0) abstractC0655g02;
                        c0660j = c0653f0.f2143b;
                        if (c0660j == null) {
                            C0466d c0466d = c0653f0.f2142a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (c0466d.f1636h >> 32));
                            float f10 = c0466d.f1629a;
                            float f11 = c0466d.f1630b;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
                            float m1022b = c0466d.m1022b();
                            float m1021a = c0466d.m1021a();
                            c3508i0.m5463f(abstractC0670o2, floatToRawIntBits, (Float.floatToRawIntBits(m1022b) << 32) | (Float.floatToRawIntBits(m1021a) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f7, c1573g);
                        }
                    } else if (abstractC0655g02 instanceof C0649d0) {
                        c0660j = ((C0649d0) abstractC0655g02).f2132a;
                    } else {
                        throw new RuntimeException();
                    }
                    c3508i0.mo2523B(c0660j, abstractC0670o2, f7, c1573g, 3);
                }
            }
        }
        c3508i0.m5460a();
    }
}
