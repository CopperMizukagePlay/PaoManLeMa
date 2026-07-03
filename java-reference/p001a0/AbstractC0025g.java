package p001a0;

import androidx.compose.foundation.layout.AbstractC0155c;
import p000a.AbstractC0000a;
import p028d2.AbstractC0479l;
import p034e0.InterfaceC0617m;
import p071j0.C2141n0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p144t.AbstractC3122c;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0025g {

    /* renamed from: a */
    public static final float f122a;

    /* renamed from: b */
    public static final float f123b;

    static {
        float f7 = 25;
        f122a = f7;
        f123b = (f7 * 2.0f) / 2.4142137f;
    }

    /* renamed from: a */
    public static final void m53a(InterfaceC0617m interfaceC0617m, InterfaceC3810r interfaceC3810r, long j6, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        boolean z7;
        c2395p.m3859a0(1776202187);
        if (c2395p.m3870g(interfaceC0617m)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i8 | i7;
        if (c2395p.m3870g(interfaceC3810r)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9 | 128;
        if ((i12 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i10 = i12 & (-897);
            } else {
                i10 = i12 & (-897);
                j6 = 9205357640488583168L;
            }
            c2395p.m3889s();
            int i13 = i10 & 14;
            if (i13 != 4) {
                z7 = false;
            } else {
                z7 = true;
            }
            Object m3847O = c2395p.m3847O();
            if (z7 || m3847O == C2375k.f13421a) {
                m3847O = new C0005b(0, interfaceC0617m);
                c2395p.m3877j0(m3847O);
            }
            AbstractC0000a.m1b(interfaceC0617m, C3795c.f17965f, AbstractC3178i.m4873d(-1653527038, new C2141n0(j6, AbstractC0479l.m1037a(interfaceC3810r, false, (InterfaceC3279c) m3847O), 2), c2395p), c2395p, i13 | 432);
        }
        long j7 = j6;
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0001a(interfaceC0617m, interfaceC3810r, j7, i7);
        }
    }

    /* renamed from: b */
    public static final void m54b(InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        c2395p.m3859a0(694251107);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i7;
        } else {
            i9 = i7;
        }
        if ((i9 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (i11 != 0) {
                interfaceC3810r = C3807o.f17991a;
            }
            AbstractC3122c.m4828a(c2395p, AbstractC3793a.m5821a(AbstractC0155c.m354m(interfaceC3810r, f123b, f122a), C0021f.f116f));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0009c(interfaceC3810r, i7, i8);
        }
    }
}
