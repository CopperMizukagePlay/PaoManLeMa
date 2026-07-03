package p063i0;

import p027d1.C0464b;
import p027d1.C0467e;
import p035e1.C0677s;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i5 */
/* loaded from: classes.dex */
public final class C1920i5 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C2016u5 f11340f;

    /* renamed from: g */
    public final /* synthetic */ long f11341g;

    /* renamed from: h */
    public final /* synthetic */ long f11342h;

    /* renamed from: i */
    public final /* synthetic */ long f11343i;

    /* renamed from: j */
    public final /* synthetic */ long f11344j;

    /* renamed from: k */
    public final /* synthetic */ float f11345k;

    /* renamed from: l */
    public final /* synthetic */ float f11346l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3281e f11347m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3282f f11348n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1920i5(C2016u5 c2016u5, long j6, long j7, long j8, long j9, float f7, float f8, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f) {
        super(1);
        this.f11340f = c2016u5;
        this.f11341g = j6;
        this.f11342h = j7;
        this.f11343i = j8;
        this.f11344j = j9;
        this.f11345k = f7;
        this.f11346l = f8;
        this.f11347m = interfaceC3281e;
        this.f11348n = interfaceC3282f;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        float f8;
        float f9;
        InterfaceC3281e interfaceC3281e;
        long j6;
        long j7;
        InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
        C1936k5 c1936k5 = C1936k5.f11432a;
        C2016u5 c2016u5 = this.f11340f;
        float[] fArr = c2016u5.f11925i;
        float m3186c = c2016u5.m3186c();
        float mo4524v0 = interfaceC1570d.mo4524v0(c2016u5.f11928l.m3729g());
        float mo4522t0 = interfaceC1570d.mo4522t0(0);
        float mo4524v02 = interfaceC1570d.mo4524v0(c2016u5.f11929m.m3729g());
        long m5797a = AbstractC3784a.m5797a(0.0f, C0464b.m1009e(interfaceC1570d.mo2545Y()));
        long m5797a2 = AbstractC3784a.m5797a(C0467e.m1026d(interfaceC1570d.mo2546c()), C0464b.m1009e(interfaceC1570d.mo2545Y()));
        float mo4526y = interfaceC1570d.mo4526y(mo4524v0);
        long m5797a3 = AbstractC3784a.m5797a(((C0464b.m1008d(m5797a2) - C0464b.m1008d(m5797a)) * m3186c) + C0464b.m1008d(m5797a), C0464b.m1009e(interfaceC1570d.mo2545Y()));
        long m5797a4 = AbstractC3784a.m5797a(((C0464b.m1008d(m5797a2) - C0464b.m1008d(m5797a)) * 0.0f) + C0464b.m1008d(m5797a), C0464b.m1009e(interfaceC1570d.mo2545Y()));
        float f10 = 2;
        float f11 = mo4526y / f10;
        float mo4526y2 = interfaceC1570d.mo4526y(this.f11346l);
        float f12 = this.f11345k;
        if (Float.compare(f12, 0) > 0) {
            interfaceC1570d.mo4526y(mo4522t0);
            interfaceC1570d.mo4526y(f12);
            f7 = interfaceC1570d.mo4526y(f12) + (interfaceC1570d.mo4526y(mo4524v02) / f10);
        } else {
            f7 = 0.0f;
        }
        float m1008d = C0464b.m1008d(m5797a3);
        float m1008d2 = (C0464b.m1008d(m5797a2) - f7) - f11;
        InterfaceC3281e interfaceC3281e2 = this.f11347m;
        if (m1008d < m1008d2) {
            float m1008d3 = C0464b.m1008d(m5797a3) + f7;
            float m1008d4 = C0464b.m1008d(m5797a2);
            f8 = mo4526y;
            interfaceC3281e = interfaceC3281e2;
            f9 = 0.0f;
            C1936k5.m3135d(interfaceC1570d, AbstractC3784a.m5797a(m1008d3, 0.0f), AbstractC1793a0.m2975c(m1008d4 - m1008d3, mo4526y), this.f11341g, mo4526y2, f11);
            mo4526y2 = mo4526y2;
            f11 = f11;
            if (interfaceC3281e != null) {
                interfaceC3281e.mo22d(interfaceC1570d, new C0464b(AbstractC3784a.m5797a(m1008d4 - f11, C0464b.m1009e(interfaceC1570d.mo2545Y()))));
            }
        } else {
            f8 = mo4526y;
            f9 = 0.0f;
            interfaceC3281e = interfaceC3281e2;
        }
        float m1008d5 = (C0464b.m1008d(m5797a3) - f7) - f9;
        if (m1008d5 > f11) {
            float f13 = f9;
            C1936k5.m3135d(interfaceC1570d, AbstractC3784a.m5797a(f13, f13), AbstractC1793a0.m2975c(m1008d5, f8), this.f11342h, f11, mo4526y2);
        }
        long m5797a5 = AbstractC3784a.m5797a(C0464b.m1008d(m5797a) + f11, C0464b.m1009e(m5797a));
        long m5797a6 = AbstractC3784a.m5797a(C0464b.m1008d(m5797a2) - f11, C0464b.m1009e(m5797a2));
        C0464b.m1008d(m5797a4);
        C0464b.m1008d(m5797a4);
        float m1008d6 = C0464b.m1008d(m5797a3) - f7;
        float m1008d7 = C0464b.m1008d(m5797a3) + f7;
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            float f14 = fArr[i7];
            int i9 = i8 + 1;
            boolean z7 = true;
            float f15 = m1008d6;
            if (interfaceC3281e != null && i8 == fArr.length - 1) {
                j6 = m5797a5;
            } else {
                if (f14 <= m3186c && f14 >= 0.0f) {
                    z7 = false;
                }
                j6 = m5797a5;
                long m5797a7 = AbstractC3784a.m5797a(C0464b.m1008d(AbstractC3784a.m5816y(m5797a5, m5797a6, f14)), C0464b.m1009e(interfaceC1570d.mo2545Y()));
                float m1008d8 = C0464b.m1008d(m5797a7);
                if (m1008d8 < f15 || m1008d8 > m1008d7) {
                    C0464b c0464b = new C0464b(m5797a7);
                    if (z7) {
                        j7 = this.f11343i;
                    } else {
                        j7 = this.f11344j;
                    }
                    this.f11348n.mo24c(interfaceC1570d, c0464b, new C0677s(j7));
                }
            }
            i7++;
            i8 = i9;
            m1008d6 = f15;
            m5797a5 = j6;
        }
        return C1694m.f10482a;
    }
}
