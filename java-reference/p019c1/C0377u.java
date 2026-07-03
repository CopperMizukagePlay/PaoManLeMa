package p019c1;

import android.os.Trace;
import p001a0.C0033i;
import p001a0.C0098z1;
import p094m1.C2547a;
import p094m1.C2549c;
import p094m1.InterfaceC2548b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p150t5.InterfaceC3279c;
import p154u1.InterfaceC3349e;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3513k;
import p170w1.AbstractC3674f1;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.u */
/* loaded from: classes.dex */
public final class C0377u extends AbstractC3809q implements InterfaceC3513k, InterfaceC3509i1, InterfaceC3349e {

    /* renamed from: s */
    public final InterfaceC3279c f1271s;

    /* renamed from: t */
    public boolean f1272t;

    /* renamed from: u */
    public boolean f1273u;

    /* renamed from: v */
    public final int f1274v;

    public C0377u(C0098z1 c0098z1, int i7) {
        int i8;
        if ((i7 & 1) != 0) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        this.f1271s = (i7 & 4) != 0 ? null : c0098z1;
        this.f1274v = i8;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        int ordinal = m847M0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C0368l c0368l = (C0368l) ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner();
        c0368l.m831b(8, true, false);
        c0368l.f1241d.m829a();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: E0 */
    public final void mo551E0() {
        if (m847M0().m844a()) {
            ((C0368l) ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner()).m831b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [n0.e] */
    /* renamed from: K0 */
    public final void m845K0(EnumC0376t enumC0376t, EnumC0376t enumC0376t2) {
        C3490c1 c3490c1;
        C0368l c0368l = (C0368l) ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner();
        C0377u c0377u = c0368l.f1245h;
        enumC0376t.equals(enumC0376t2);
        AbstractC3809q abstractC3809q = this.f17992e;
        if (!abstractC3809q.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = this.f17992e;
        C3502g0 m5382v = AbstractC3498f.m5382v(this);
        loop0: while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 5120) != 0) {
                while (abstractC3809q2 != null) {
                    int i7 = abstractC3809q2.f17994g;
                    if ((i7 & 5120) != 0) {
                        if (abstractC3809q2 != abstractC3809q && (i7 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i7 & 4096) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q2;
                            ?? r62 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC0361e) {
                                    InterfaceC0361e interfaceC0361e = (InterfaceC0361e) abstractC3519m;
                                    if (c0377u == c0368l.f1245h) {
                                        interfaceC0361e.mo547h0(enumC0376t2);
                                    }
                                } else if ((abstractC3519m.f17994g & 4096) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                    int i8 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r62 = r62;
                                    while (abstractC3809q3 != null) {
                                        if ((abstractC3809q3.f17994g & 4096) != 0) {
                                            i8++;
                                            r62 = r62;
                                            if (i8 == 1) {
                                                abstractC3519m = abstractC3809q3;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r62.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r62.m4300b(abstractC3809q3);
                                            }
                                        }
                                        abstractC3809q3 = abstractC3809q3.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r62 = r62;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r62);
                            }
                        }
                    }
                    abstractC3809q2 = abstractC3809q2.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q2 = c3490c1.f16801e;
            } else {
                abstractC3809q2 = null;
            }
        }
        InterfaceC3279c interfaceC3279c = this.f1271s;
        if (interfaceC3279c != null) {
            interfaceC3279c.mo23f(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c1.m, c1.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [c1.p] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [n0.e] */
    /* renamed from: L0 */
    public final C0371o m846L0() {
        boolean z7;
        boolean z8;
        C3490c1 c3490c1;
        ?? obj = new Object();
        obj.f1250a = true;
        C0373q c0373q = C0373q.f1261b;
        obj.f1251b = c0373q;
        obj.f1252c = c0373q;
        obj.f1253d = c0373q;
        obj.f1254e = c0373q;
        obj.f1255f = c0373q;
        obj.f1256g = c0373q;
        obj.f1257h = c0373q;
        obj.f1258i = c0373q;
        obj.f1259j = C0370n.f1246g;
        obj.f1260k = C0370n.f1247h;
        int i7 = this.f1274v;
        if (i7 == 1) {
            z7 = true;
        } else if (i7 == 0) {
            if (((C2547a) ((C2549c) ((InterfaceC2548b) AbstractC3498f.m5369i(this, AbstractC3674f1.f17522m))).f13916a.getValue()).f13915a == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            z7 = !z8;
        } else if (i7 == 2) {
            z7 = false;
        } else {
            throw new IllegalStateException("Unknown Focusability");
        }
        obj.f1250a = z7;
        AbstractC3809q abstractC3809q = this.f17992e;
        if (!abstractC3809q.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = this.f17992e;
        C3502g0 m5382v = AbstractC3498f.m5382v(this);
        loop0: while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 3072) != 0) {
                while (abstractC3809q2 != null) {
                    int i8 = abstractC3809q2.f17994g;
                    if ((i8 & 3072) != 0) {
                        if (abstractC3809q2 != abstractC3809q && (i8 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i8 & 2048) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q2;
                            ?? r8 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC0372p) {
                                    ((InterfaceC0372p) abstractC3519m).mo842w0(obj);
                                } else if ((abstractC3519m.f17994g & 2048) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                    int i9 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r8 = r8;
                                    while (abstractC3809q3 != null) {
                                        if ((abstractC3809q3.f17994g & 2048) != 0) {
                                            i9++;
                                            r8 = r8;
                                            if (i9 == 1) {
                                                abstractC3519m = abstractC3809q3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r8.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r8.m4300b(abstractC3809q3);
                                            }
                                        }
                                        abstractC3809q3 = abstractC3809q3.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r8 = r8;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r8);
                            }
                        }
                    }
                    abstractC3809q2 = abstractC3809q2.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q2 = c3490c1.f16801e;
            } else {
                abstractC3809q2 = null;
            }
        }
        return obj;
    }

    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        m848N0();
    }

    /* renamed from: M0 */
    public final EnumC0376t m847M0() {
        C3490c1 c3490c1;
        boolean z7 = this.f18005r;
        EnumC0376t enumC0376t = EnumC0376t.f1269h;
        if (!z7) {
            return enumC0376t;
        }
        C0368l c0368l = (C0368l) ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner();
        C0377u c0377u = c0368l.f1245h;
        if (c0377u == null) {
            return enumC0376t;
        }
        if (this == c0377u) {
            c0368l.getClass();
            return EnumC0376t.f1266e;
        }
        if (c0377u.f18005r) {
            if (!c0377u.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitAncestors called on an unattached node");
            }
            AbstractC3809q abstractC3809q = c0377u.f17992e.f17996i;
            C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
            while (m5382v != null) {
                if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                    while (abstractC3809q != null) {
                        if ((abstractC3809q.f17994g & 1024) != 0) {
                            AbstractC3809q abstractC3809q2 = abstractC3809q;
                            C2705e c2705e = null;
                            while (abstractC3809q2 != null) {
                                if (abstractC3809q2 instanceof C0377u) {
                                    if (this == ((C0377u) abstractC3809q2)) {
                                        return EnumC0376t.f1267f;
                                    }
                                } else if ((abstractC3809q2.f17994g & 1024) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                                    int i7 = 0;
                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC3809q2 = abstractC3809q3;
                                            } else {
                                                if (c2705e == null) {
                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q2 != null) {
                                                    c2705e.m4300b(abstractC3809q2);
                                                    abstractC3809q2 = null;
                                                }
                                                c2705e.m4300b(abstractC3809q3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC3809q2 = AbstractC3498f.m5366f(c2705e);
                            }
                        }
                        abstractC3809q = abstractC3809q.f17996i;
                    }
                }
                m5382v = m5382v.m5447u();
                if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                    abstractC3809q = c3490c1.f16801e;
                } else {
                    abstractC3809q = null;
                }
            }
        }
        return enumC0376t;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u5.v] */
    /* renamed from: N0 */
    public final void m848N0() {
        int ordinal = m847M0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        ?? obj = new Object();
        AbstractC3498f.m5379s(this, new C0033i(3, obj, this));
        Object obj2 = obj.f16451e;
        if (obj2 != null) {
            if (!((InterfaceC0369m) obj2).mo840c()) {
                ((C0368l) ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner()).m831b(8, true, true);
                return;
            }
            return;
        }
        AbstractC3367j.m5105j("focusProperties");
        throw null;
    }

    /* renamed from: O0 */
    public final boolean m849O0(int i7) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z7 = false;
            if (!m846L0().f1250a) {
                Trace.endSection();
                return false;
            }
            int ordinal = AbstractC0362f.m823u(this, i7).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new RuntimeException();
                        }
                    } else {
                        z7 = true;
                    }
                }
            } else {
                z7 = AbstractC0362f.m824v(this);
            }
            return z7;
        } finally {
            Trace.endSection();
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
