package p168w;

import p001a0.C0068q2;
import p032d6.AbstractC0525d0;
import p034e0.C0631t;
import p073j2.AbstractC2168e;
import p082k5.C2319i;
import p085l0.C2375k;
import p085l0.C2395p;
import p122q.EnumC2931o0;
import p129r.C3022k;
import p150t5.InterfaceC3277a;
import p153u0.AbstractC3344k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC3618c0 {

    /* renamed from: a */
    public static final float f17274a = 56;

    /* renamed from: b */
    public static final C3637t f17275b;

    /* renamed from: c */
    public static final C3614a0 f17276c;

    /* JADX WARN: Type inference failed for: r0v3, types: [w.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, t1.m0] */
    static {
        ?? obj = new Object();
        AbstractC0525d0.m1123a(C2319i.f13273e);
        f17275b = new C3637t(0, 0, 0, 0, 0, 0, C3022k.f15577a, obj);
        f17276c = new Object();
    }

    /* renamed from: a */
    public static final long m5598a(C3637t c3637t, int i7) {
        long j6;
        long j7 = (i7 * (c3637t.f17359c + c3637t.f17358b)) + (-c3637t.f17362f) + c3637t.f17360d;
        EnumC2931o0 enumC2931o0 = c3637t.f17361e;
        EnumC2931o0 enumC2931o02 = EnumC2931o0.f15241f;
        long m5603f = c3637t.m5603f();
        if (enumC2931o0 == enumC2931o02) {
            j6 = m5603f >> 32;
        } else {
            j6 = m5603f & 4294967295L;
        }
        int i8 = (int) j6;
        c3637t.f17370n.getClass();
        long m3530q = j7 - (i8 - AbstractC2168e.m3530q(0, 0, i8));
        if (m3530q < 0) {
            return 0L;
        }
        return m3530q;
    }

    /* renamed from: b */
    public static final C3619d m5599b(int i7, C2395p c2395p, InterfaceC3277a interfaceC3277a) {
        Object[] objArr = new Object[0];
        C0068q2 c0068q2 = C3619d.f17277H;
        boolean m3866e = c2395p.m3866e(i7) | c2395p.m3864d(0.0f);
        Object m3847O = c2395p.m3847O();
        if (m3866e || m3847O == C2375k.f13421a) {
            m3847O = new C0631t(i7, interfaceC3277a);
            c2395p.m3877j0(m3847O);
        }
        C3619d c3619d = (C3619d) AbstractC3344k.m5081d(objArr, c0068q2, (InterfaceC3277a) m3847O, c2395p, 0, 4);
        c3619d.f17278G.setValue(interfaceC3277a);
        return c3619d;
    }
}
