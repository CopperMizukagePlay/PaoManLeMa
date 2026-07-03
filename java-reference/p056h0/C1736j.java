package p056h0;

import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.C0541i1;
import p032d6.C0563q;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2638e;
import p100n.C2635d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.j */
/* loaded from: classes.dex */
public final class C1736j {

    /* renamed from: a */
    public C0464b f10605a;

    /* renamed from: b */
    public final float f10606b;

    /* renamed from: c */
    public final boolean f10607c;

    /* renamed from: d */
    public Float f10608d;

    /* renamed from: e */
    public C0464b f10609e;

    /* renamed from: f */
    public final C2635d f10610f = AbstractC2638e.m4215a(0.0f);

    /* renamed from: g */
    public final C2635d f10611g = AbstractC2638e.m4215a(0.0f);

    /* renamed from: h */
    public final C2635d f10612h = AbstractC2638e.m4215a(0.0f);

    /* renamed from: i */
    public final C0563q f10613i;

    /* renamed from: j */
    public final C2361g1 f10614j;

    /* renamed from: k */
    public final C2361g1 f10615k;

    /* JADX WARN: Type inference failed for: r1v3, types: [d6.q, d6.i1] */
    public C1736j(C0464b c0464b, float f7, boolean z7) {
        this.f10605a = c0464b;
        this.f10606b = f7;
        this.f10607c = z7;
        ?? c0541i1 = new C0541i1(true);
        c0541i1.m1183U(null);
        this.f10613i = c0541i1;
        Boolean bool = Boolean.FALSE;
        this.f10614j = AbstractC2418w.m3980x(bool);
        this.f10615k = AbstractC2418w.m3980x(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r9.m1172F(r0) != r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2789a(AbstractC2583c abstractC2583c) {
        C1733g c1733g;
        int i7;
        C1736j c1736j;
        if (abstractC2583c instanceof C1733g) {
            c1733g = (C1733g) abstractC2583c;
            int i8 = c1733g.f10598k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1733g.f10598k = i8 - Integer.MIN_VALUE;
                Object obj = c1733g.f10596i;
                i7 = c1733g.f10598k;
                C1694m c1694m = C1694m.f10482a;
                InterfaceC2313c interfaceC2313c = null;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                AbstractC1793a0.m2972L(obj);
                                return c1694m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1736j = c1733g.f10595h;
                        AbstractC1793a0.m2972L(obj);
                        c1733g.f10595h = null;
                        c1733g.f10598k = 3;
                        c1736j.getClass();
                        Object m1130h = AbstractC0525d0.m1130h(new C1735i(c1736j, interfaceC2313c, 1), c1733g);
                        if (m1130h != enumC2465a) {
                            m1130h = c1694m;
                        }
                        if (m1130h == enumC2465a) {
                            return enumC2465a;
                        }
                        return c1694m;
                    }
                    c1736j = c1733g.f10595h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c1733g.f10595h = this;
                    c1733g.f10598k = 1;
                    Object m1130h2 = AbstractC0525d0.m1130h(new C1735i(this, interfaceC2313c, 0), c1733g);
                    if (m1130h2 != enumC2465a) {
                        m1130h2 = c1694m;
                    }
                    if (m1130h2 != enumC2465a) {
                        c1736j = this;
                    }
                    return enumC2465a;
                }
                c1736j.f10614j.setValue(Boolean.TRUE);
                C0563q c0563q = c1736j.f10613i;
                c1733g.f10595h = c1736j;
                c1733g.f10598k = 2;
            }
        }
        c1733g = new C1733g(this, abstractC2583c);
        Object obj2 = c1733g.f10596i;
        i7 = c1733g.f10598k;
        C1694m c1694m2 = C1694m.f10482a;
        InterfaceC2313c interfaceC2313c2 = null;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        c1736j.f10614j.setValue(Boolean.TRUE);
        C0563q c0563q2 = c1736j.f10613i;
        c1733g.f10595h = c1736j;
        c1733g.f10598k = 2;
    }
}
