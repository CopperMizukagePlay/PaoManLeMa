package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.selection.AbstractC0161b;
import androidx.compose.material3.MinimumInteractiveModifier;
import p001a0.C0078t0;
import p028d2.C0474g;
import p035e1.C0677s;
import p068i5.AbstractC2080d;
import p078k0.AbstractC2254w;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2484b0;
import p100n.AbstractC2638e;
import p100n.AbstractC2641f;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.p4 */
/* loaded from: classes.dex */
public abstract class AbstractC1975p4 {

    /* renamed from: a */
    public static final float f11660a;

    /* renamed from: b */
    public static final float f11661b = 12;

    /* renamed from: c */
    public static final float f11662c;

    static {
        float f7 = 2;
        f11660a = f7;
        f11662c = f7;
    }

    /* renamed from: a */
    public static final void m3149a(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z8, C1959n4 c1959n4, C2395p c2395p, int i7) {
        int i8;
        C1959n4 c1959n42;
        boolean z9;
        C1959n4 c1959n43;
        InterfaceC3810r interfaceC3810r2;
        float f7;
        InterfaceC2390n2 interfaceC2390n2;
        long j6;
        Object m3953A;
        InterfaceC2390n2 interfaceC2390n22;
        boolean z10;
        InterfaceC3810r interfaceC3810r3;
        InterfaceC3810r interfaceC3810r4;
        C1959n4 c1959n44;
        int i9;
        int i10;
        c2395p.m3859a0(408580840);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        int i11 = i8 | 3456;
        if ((i7 & 24576) == 0) {
            i11 = i8 | 11648;
        }
        if (((196608 | i11) & 74899) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r4 = interfaceC3810r;
            z10 = z8;
            c1959n44 = c1959n4;
        } else {
            c2395p.m3854W();
            int i12 = i7 & 1;
            InterfaceC3810r interfaceC3810r5 = C3807o.f17991a;
            if (i12 != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                z9 = z8;
                c1959n43 = c1959n4;
            } else {
                C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
                C1959n4 c1959n45 = c2003t0.f11803U;
                if (c1959n45 == null) {
                    float f8 = AbstractC2254w.f13074a;
                    c1959n42 = new C1959n4(AbstractC2019v0.m3195d(c2003t0, 26), AbstractC2019v0.m3195d(c2003t0, 19), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)));
                    c2003t0.f11803U = c1959n42;
                } else {
                    c1959n42 = c1959n45;
                }
                z9 = true;
                c1959n43 = c1959n42;
                interfaceC3810r2 = interfaceC3810r5;
            }
            c2395p.m3889s();
            if (z7) {
                f7 = f11661b / 2;
            } else {
                f7 = 0;
            }
            InterfaceC2390n2 m4234a = AbstractC2641f.m4234a(f7, AbstractC2638e.m4232r(100, 6, null), c2395p, 48);
            c1959n43.getClass();
            if (z9 && z7) {
                interfaceC2390n2 = m4234a;
                j6 = c1959n43.f11581a;
            } else {
                interfaceC2390n2 = m4234a;
                if (z9 && !z7) {
                    j6 = c1959n43.f11582b;
                } else if (!z9 && z7) {
                    j6 = c1959n43.f11583c;
                } else {
                    j6 = c1959n43.f11584d;
                }
            }
            if (z9) {
                c2395p.m3857Z(350067971);
                m3953A = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(100, 6, null), c2395p, 48);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(350170674);
                m3953A = AbstractC2418w.m3953A(new C0677s(j6), c2395p);
                c2395p.m3888r(false);
            }
            Object obj = m3953A;
            c2395p.m3857Z(1327106656);
            if (interfaceC3277a != null) {
                interfaceC2390n22 = interfaceC2390n2;
                z10 = z9;
                interfaceC3810r3 = AbstractC0161b.m371a(interfaceC3810r5, z7, null, AbstractC1999s4.m3176a(false, AbstractC2254w.f13075b / 2, 0L, c2395p, 54, 4), z10, new C0474g(3), interfaceC3277a);
            } else {
                interfaceC2390n22 = interfaceC2390n2;
                z10 = z9;
                interfaceC3810r3 = interfaceC3810r5;
            }
            c2395p.m3888r(false);
            if (interfaceC3277a != null) {
                C2394o2 c2394o2 = AbstractC1957n2.f11577a;
                interfaceC3810r5 = MinimumInteractiveModifier.f732a;
            }
            InterfaceC3810r m350i = AbstractC0155c.m350i(AbstractC0154b.m337h(AbstractC0155c.m360s(interfaceC3810r2.mo5829e(interfaceC3810r5).mo5829e(interfaceC3810r3), C3795c.f17968i), f11660a), AbstractC2254w.f13074a);
            InterfaceC2390n2 interfaceC2390n23 = interfaceC2390n22;
            boolean m3870g = c2395p.m3870g(obj) | c2395p.m3870g(interfaceC2390n23);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C0078t0(23, obj, interfaceC2390n23);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O, m350i);
            interfaceC3810r4 = interfaceC3810r2;
            c1959n44 = c1959n43;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1967o4(z7, interfaceC3277a, interfaceC3810r4, z10, c1959n44, i7, 0);
        }
    }
}
