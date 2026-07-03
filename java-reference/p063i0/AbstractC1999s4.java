package p063i0;

import p035e1.C0677s;
import p056h0.AbstractC1741o;
import p056h0.C1731e;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p100n.C2661l1;
import p107o.InterfaceC2768p0;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s4 */
/* loaded from: classes.dex */
public abstract class AbstractC1999s4 {

    /* renamed from: a */
    public static final C2394o2 f11757a = new AbstractC2397p1(C2011u0.f11889n);

    /* renamed from: b */
    public static final C2336a0 f11758b = new C2336a0(C2011u0.f11888m);

    /* renamed from: c */
    public static final C2007t4 f11759c;

    /* renamed from: d */
    public static final C2007t4 f11760d;

    /* JADX WARN: Type inference failed for: r1v0, types: [l0.p1, l0.o2] */
    static {
        long j6 = C0677s.f2209g;
        f11759c = new C2007t4(true, Float.NaN, j6);
        f11760d = new C2007t4(false, Float.NaN, j6);
    }

    /* renamed from: a */
    public static final InterfaceC2768p0 m3176a(boolean z7, float f7, long j6, C2395p c2395p, int i7, int i8) {
        InterfaceC2768p0 c2007t4;
        C2007t4 c2007t42;
        boolean z8;
        boolean z9 = true;
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        if ((i8 & 2) != 0) {
            f7 = Float.NaN;
        }
        if ((i8 & 4) != 0) {
            j6 = C0677s.f2209g;
        }
        c2395p.m3857Z(-1280632857);
        if (((Boolean) c2395p.m3878k(f11757a)).booleanValue()) {
            C2661l1 c2661l1 = AbstractC1741o.f10629a;
            InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(new C0677s(j6), c2395p);
            if ((((i7 & 14) ^ 6) > 4 && c2395p.m3872h(z7)) || (i7 & 6) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((((i7 & 112) ^ 48) <= 32 || !c2395p.m3864d(f7)) && (i7 & 48) != 32) {
                z9 = false;
            }
            boolean z10 = z8 | z9;
            Object m3847O = c2395p.m3847O();
            if (z10 || m3847O == C2375k.f13421a) {
                m3847O = new C1731e(z7, f7, m3953A);
                c2395p.m3877j0(m3847O);
            }
            c2007t4 = (C1731e) m3847O;
        } else if (C3096f.m4776a(f7, Float.NaN) && C0677s.m1454c(j6, C0677s.f2209g)) {
            if (z7) {
                c2007t42 = f11759c;
            } else {
                c2007t42 = f11760d;
            }
            c2007t4 = c2007t42;
        } else {
            c2007t4 = new C2007t4(z7, f7, j6);
        }
        c2395p.m3888r(false);
        return c2007t4;
    }
}
