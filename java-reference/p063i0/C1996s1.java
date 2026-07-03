package p063i0;

import p000a.AbstractC0000a;
import p060h5.AbstractC1793a0;
import p079k1.C2266e;
import p085l0.C2395p;
import p085l0.C2405r1;
import p144t.C3137j0;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s1 */
/* loaded from: classes.dex */
public final class C1996s1 {

    /* renamed from: a */
    public static final C1996s1 f11741a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i0.s1] */
    static {
        float f7 = AbstractC2052z1.f12199a;
        float f8 = 0;
        new C3137j0(f7, f8, f7, f8);
    }

    /* renamed from: a */
    public final void m3175a(boolean z7, InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7) {
        int i8;
        float f7;
        C2395p c2395p2;
        c2395p.m3859a0(-1987096744);
        if (c2395p.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7 | 48) & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            C2266e m2988p = AbstractC1793a0.m2988p();
            if (z7) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            C3807o c3807o = C3807o.f17991a;
            c2395p2 = c2395p;
            AbstractC1949m2.m3140b(m2988p, null, AbstractC0000a.m19t(c3807o, f7), 0L, c2395p2, 48, 8);
            interfaceC3810r = c3807o;
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1988r1(this, z7, interfaceC3810r, i7);
        }
    }
}
