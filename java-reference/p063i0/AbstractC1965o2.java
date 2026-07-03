package p063i0;

import androidx.compose.foundation.AbstractC0150f;
import p034e0.AbstractC0638w0;
import p034e0.C0636v0;
import p035e1.C0677s;
import p056h0.AbstractC1745s;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2401q1;
import p085l0.C2405r1;
import p085l0.C2410t0;
import p107o.InterfaceC2768p0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o2 */
/* loaded from: classes.dex */
public abstract class AbstractC1965o2 {
    static {
        new C2410t0(C2011u0.f11887l);
    }

    /* renamed from: a */
    public static final void m3148a(C2003t0 c2003t0, C1875d5 c1875d5, C1904g7 c1904g7, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        C1875d5 c1875d52;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-2127166334);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2003t0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= 16;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(c1904g7)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i8 |= i10;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i8 |= i9;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
            c1875d52 = c1875d5;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                c1875d52 = c1875d5;
            } else {
                c1875d52 = (C1875d5) c2395p.m3878k(AbstractC1884e5.f11149a);
            }
            c2395p.m3889s();
            InterfaceC2768p0 m3176a = AbstractC1999s4.m3176a(false, 0.0f, 0L, c2395p, 0, 7);
            long j6 = c2003t0.f11807a;
            boolean m3868f = c2395p.m3868f(j6);
            Object m3847O = c2395p.m3847O();
            if (m3868f || m3847O == C2375k.f13421a) {
                m3847O = new C0636v0(j6, C0677s.m1453b(0.4f, j6));
                c2395p.m3877j0(m3847O);
            }
            AbstractC2418w.m3960b(new C2401q1[]{AbstractC2019v0.f11943a.mo3716a(c2003t0), AbstractC0150f.f613a.mo3716a(m3176a), AbstractC1745s.f10641a.mo3716a(C2027w0.f12001a), AbstractC1884e5.f11149a.mo3716a(c1875d52), AbstractC0638w0.f2110a.mo3716a((C0636v0) m3847O), AbstractC1913h7.f11292a.mo3716a(c1904g7)}, AbstractC3178i.m4873d(-1066563262, new C1879e0(1, c1904g7, c3173d), c2395p), c2395p, 56);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1922j(c2003t0, c1875d52, c1904g7, c3173d, i7, 1);
        }
    }
}
