package p100n;

import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.d */
/* loaded from: classes.dex */
public final class C2635d {

    /* renamed from: a */
    public final C2664m1 f14257a;

    /* renamed from: b */
    public final Object f14258b;

    /* renamed from: c */
    public final C2659l f14259c;

    /* renamed from: d */
    public final C2361g1 f14260d;

    /* renamed from: e */
    public final C2361g1 f14261e;

    /* renamed from: f */
    public final C2663m0 f14262f;

    /* renamed from: g */
    public final AbstractC2674q f14263g;

    /* renamed from: h */
    public final AbstractC2674q f14264h;

    /* renamed from: i */
    public final AbstractC2674q f14265i;

    /* renamed from: j */
    public final AbstractC2674q f14266j;

    public C2635d(Object obj, C2664m1 c2664m1, Object obj2) {
        AbstractC2674q abstractC2674q;
        AbstractC2674q abstractC2674q2;
        this.f14257a = c2664m1;
        this.f14258b = obj2;
        C2659l c2659l = new C2659l(c2664m1, obj, null, 60);
        this.f14259c = c2659l;
        this.f14260d = AbstractC2418w.m3980x(Boolean.FALSE);
        this.f14261e = AbstractC2418w.m3980x(obj);
        this.f14262f = new C2663m0();
        new C2675q0(obj2);
        AbstractC2674q abstractC2674q3 = c2659l.f14350g;
        boolean z7 = abstractC2674q3 instanceof C2662m;
        if (z7) {
            abstractC2674q = AbstractC2638e.f14289e;
        } else if (abstractC2674q3 instanceof C2665n) {
            abstractC2674q = AbstractC2638e.f14290f;
        } else {
            abstractC2674q = abstractC2674q3 instanceof C2668o ? AbstractC2638e.f14291g : AbstractC2638e.f14292h;
        }
        this.f14263g = abstractC2674q;
        if (z7) {
            abstractC2674q2 = AbstractC2638e.f14285a;
        } else if (abstractC2674q3 instanceof C2665n) {
            abstractC2674q2 = AbstractC2638e.f14286b;
        } else {
            abstractC2674q2 = abstractC2674q3 instanceof C2668o ? AbstractC2638e.f14287c : AbstractC2638e.f14288d;
        }
        this.f14264h = abstractC2674q2;
        this.f14265i = abstractC2674q;
        this.f14266j = abstractC2674q2;
    }

    /* renamed from: a */
    public static final Object m4203a(C2635d c2635d, Object obj) {
        C2664m1 c2664m1 = c2635d.f14257a;
        AbstractC2674q abstractC2674q = c2635d.f14266j;
        AbstractC2674q abstractC2674q2 = c2635d.f14265i;
        if (!AbstractC3367j.m5096a(abstractC2674q2, c2635d.f14263g) || !AbstractC3367j.m5096a(abstractC2674q, c2635d.f14264h)) {
            AbstractC2674q abstractC2674q3 = (AbstractC2674q) c2664m1.f14361a.mo23f(obj);
            int mo4267b = abstractC2674q3.mo4267b();
            boolean z7 = false;
            for (int i7 = 0; i7 < mo4267b; i7++) {
                if (abstractC2674q3.mo4266a(i7) < abstractC2674q2.mo4266a(i7) || abstractC2674q3.mo4266a(i7) > abstractC2674q.mo4266a(i7)) {
                    abstractC2674q3.mo4270e(AbstractC2168e.m3529p(abstractC2674q3.mo4266a(i7), abstractC2674q2.mo4266a(i7), abstractC2674q.mo4266a(i7)), i7);
                    z7 = true;
                }
            }
            if (z7) {
                return c2664m1.f14362b.mo23f(abstractC2674q3);
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static final void m4204b(C2635d c2635d) {
        C2659l c2659l = c2635d.f14259c;
        c2659l.f14350g.mo4269d();
        c2659l.f14351h = Long.MIN_VALUE;
        c2635d.f14260d.setValue(Boolean.FALSE);
    }

    /* renamed from: c */
    public static Object m4205c(C2635d c2635d, Object obj, InterfaceC2656k interfaceC2656k, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c, int i7) {
        InterfaceC3279c interfaceC3279c2;
        Object mo23f = c2635d.f14257a.f14362b.mo23f(c2635d.f14259c.f14350g);
        if ((i7 & 8) != 0) {
            interfaceC3279c2 = null;
        } else {
            interfaceC3279c2 = interfaceC3279c;
        }
        Object m4206d = c2635d.m4206d();
        C2664m1 c2664m1 = c2635d.f14257a;
        return C2663m0.m4271a(c2635d.f14262f, new C2626a(c2635d, mo23f, new C2700z0(interfaceC2656k, c2664m1, m4206d, obj, (AbstractC2674q) c2664m1.f14361a.mo23f(mo23f)), c2635d.f14259c.f14351h, interfaceC3279c2, null), interfaceC2313c);
    }

    /* renamed from: d */
    public final Object m4206d() {
        return this.f14259c.f14349f.getValue();
    }

    /* renamed from: e */
    public final Object m4207e(Object obj, InterfaceC2313c interfaceC2313c) {
        Object m4271a = C2663m0.m4271a(this.f14262f, new C2629b(this, obj, null), interfaceC2313c);
        if (m4271a == EnumC2465a.f13750e) {
            return m4271a;
        }
        return C1694m.f10482a;
    }

    /* renamed from: f */
    public final Object m4208f(AbstractC2590j abstractC2590j) {
        Object m4271a = C2663m0.m4271a(this.f14262f, new C2632c(this, null), abstractC2590j);
        if (m4271a == EnumC2465a.f13750e) {
            return m4271a;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C2635d(Object obj, C2664m1 c2664m1, Object obj2, int i7) {
        this(obj, c2664m1, (i7 & 4) != 0 ? null : obj2);
    }
}
