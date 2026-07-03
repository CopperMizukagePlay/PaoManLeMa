package p001a0;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.lazy.layout.C0156a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p018c0.C0349s;
import p018c0.C0354x;
import p019c1.AbstractC0362f;
import p019c1.C0370n;
import p019c1.C0377u;
import p026d0.C0462g;
import p032d6.InterfaceC0516a0;
import p036e2.C0685a;
import p053g5.C1694m;
import p056h0.C1727a;
import p056h0.C1728b;
import p060h5.C1813u;
import p060h5.C1814v;
import p063i0.AbstractC1982q3;
import p063i0.C1956n1;
import p063i0.C2016u5;
import p077k.C2194h0;
import p079k1.C2267e0;
import p085l0.C2349d1;
import p085l0.C2415v;
import p087l2.C2462z;
import p100n.AbstractC2638e;
import p100n.C2692w;
import p101n0.C2702b;
import p101n0.C2705e;
import p107o.AbstractC2734e;
import p107o.C2735e0;
import p107o.C2785x;
import p109o1.C2799d;
import p109o1.C2802g;
import p115p.C2827g;
import p115p.C2830j;
import p122q.C2911h1;
import p122q.EnumC2931o0;
import p139s1.AbstractC3088a;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p146t1.C3184a0;
import p146t1.C3200f1;
import p146t1.C3205h0;
import p150t5.InterfaceC3277a;
import p153u0.InterfaceC3338e;
import p154u1.C3348d;
import p154u1.C3352h;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p160v.C3447y0;
import p160v.C3448z;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3488c;
import p162v1.C3502g0;
import p162v1.C3514k0;
import p162v1.C3541t0;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3663c2;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.n */
/* loaded from: classes.dex */
public final class C0053n extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f271f;

    /* renamed from: g */
    public final /* synthetic */ Object f272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0053n(int i7, Object obj) {
        super(0);
        this.f271f = i7;
        this.f272g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x01eb, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52a() {
        InterfaceC3277a interfaceC3277a;
        boolean z7;
        C2415v c2415v;
        switch (this.f271f) {
            case 0:
                ((C2830j) this.f272g).f14902a.setValue(C2827g.f14900a);
                return C1694m.f10482a;
            case 1:
                return ((C0043k1) this.f272g).m120d();
            case 2:
                return new C0048l2((EnumC2931o0) this.f272g, 0.0f);
            case 3:
                Object systemService = ((C0349s) this.f272g).f1170b.getContext().getSystemService("input_method");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 4:
                return new BaseInputConnection(((C0354x) this.f272g).f1194a, false);
            case AbstractC3122c.f15761f /* 5 */:
                ((C0377u) this.f272g).m846L0();
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                C0462g c0462g = (C0462g) this.f272g;
                c0462g.f1610C = null;
                AbstractC3498f.m5375o(c0462g);
                AbstractC3498f.m5374n(c0462g);
                AbstractC3498f.m5373m(c0462g);
                return Boolean.TRUE;
            case 7:
                C0685a c0685a = (C0685a) this.f272g;
                c0685a.f2223g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c0685a.m1466b();
                    Trace.endSection();
                    return C1694m.f10482a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 8:
                ((C1727a) this.f272g).f10580n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC3498f.m5373m((C1728b) this.f272g);
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                C1956n1 c1956n1 = (C1956n1) this.f272g;
                InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c1956n1.f11576b.getValue();
                if (interfaceC3093c != null) {
                    return Float.valueOf(interfaceC3093c.mo4526y(AbstractC1982q3.f11694a));
                }
                throw new IllegalArgumentException(("The density on DrawerState (" + c1956n1 + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
            case 11:
                ((C0034i0) this.f272g).mo52a();
                return Boolean.TRUE;
            case 12:
                C2016u5 c2016u5 = (C2016u5) this.f272g;
                if (!((Boolean) c2016u5.f11930n.getValue()).booleanValue() && (interfaceC3277a = c2016u5.f11921e) != null) {
                    interfaceC3277a.mo52a();
                }
                return C1694m.f10482a;
            case 13:
                C2267e0 c2267e0 = (C2267e0) this.f272g;
                int i7 = c2267e0.f13147k;
                C2349d1 c2349d1 = c2267e0.f13144h;
                if (i7 == c2349d1.m3741g()) {
                    c2349d1.m3742h(c2349d1.m3741g() + 1);
                }
                return C1694m.f10482a;
            case 14:
                Object systemService2 = ((View) ((C0031h1) this.f272g).f152f).getContext().getSystemService("input_method");
                AbstractC3367j.m5098c(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService2;
            case AbstractC3122c.f15762g /* 15 */:
                return new BaseInputConnection(((C2462z) this.f272g).f13733a, false);
            case 16:
                try {
                    return (List) ((AbstractC3368k) this.f272g).mo52a();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1813u.f10860e;
                }
            case 17:
                return Float.valueOf(AbstractC2638e.m4228n(((InterfaceC0516a0) this.f272g).mo1107i()));
            case 18:
                ((AbstractC2734e) this.f272g).f14643z.mo52a();
                return Boolean.TRUE;
            case 19:
                InterfaceC3277a interfaceC3277a2 = ((C2785x) this.f272g).f14790M;
                if (interfaceC3277a2 != null) {
                    interfaceC3277a2.mo52a();
                }
                return Boolean.TRUE;
            case 20:
                C2735e0 c2735e0 = (C2735e0) this.f272g;
                C0370n c0370n = C0370n.f1248i;
                AbstractC3809q abstractC3809q = c2735e0.f17992e;
                C2705e c2705e = null;
                while (true) {
                    z7 = false;
                    int i8 = 0;
                    if (abstractC3809q != null) {
                        if (abstractC3809q instanceof C0377u) {
                            C0377u c0377u = (C0377u) abstractC3809q;
                            if (c0377u.m846L0().f1250a) {
                                z7 = c0377u.m849O0(7);
                            } else {
                                z7 = AbstractC0362f.m811i(c0377u, 7, c0370n);
                            }
                        } else {
                            if ((abstractC3809q.f17994g & 1024) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                                for (AbstractC3809q abstractC3809q2 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
                                    if ((abstractC3809q2.f17994g & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC3809q = abstractC3809q2;
                                        } else {
                                            if (c2705e == null) {
                                                c2705e = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q != null) {
                                                c2705e.m4300b(abstractC3809q);
                                                abstractC3809q = null;
                                            }
                                            c2705e.m4300b(abstractC3809q2);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC3809q = AbstractC3498f.m5366f(c2705e);
                        }
                    } else {
                        if (!c2735e0.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitChildren called on an unattached node");
                        }
                        C2705e c2705e2 = new C2705e(new AbstractC3809q[16]);
                        AbstractC3809q abstractC3809q3 = c2735e0.f17992e;
                        AbstractC3809q abstractC3809q4 = abstractC3809q3.f17997j;
                        if (abstractC3809q4 == null) {
                            AbstractC3498f.m5362b(c2705e2, abstractC3809q3);
                        } else {
                            c2705e2.m4300b(abstractC3809q4);
                        }
                        while (true) {
                            int i9 = c2705e2.f14519g;
                            if (i9 != 0) {
                                AbstractC3809q abstractC3809q5 = (AbstractC3809q) c2705e2.m4309k(i9 - 1);
                                if ((abstractC3809q5.f17995h & 1024) == 0) {
                                    AbstractC3498f.m5362b(c2705e2, abstractC3809q5);
                                } else {
                                    while (true) {
                                        if (abstractC3809q5 == null) {
                                            break;
                                        }
                                        if ((abstractC3809q5.f17994g & 1024) != 0) {
                                            C2705e c2705e3 = null;
                                            while (abstractC3809q5 != null) {
                                                if (abstractC3809q5 instanceof C0377u) {
                                                    C0377u c0377u2 = (C0377u) abstractC3809q5;
                                                    if (c0377u2.m846L0().f1250a) {
                                                        z7 = c0377u2.m849O0(7);
                                                    } else {
                                                        z7 = AbstractC0362f.m811i(c0377u2, 7, c0370n);
                                                    }
                                                } else {
                                                    if ((abstractC3809q5.f17994g & 1024) != 0 && (abstractC3809q5 instanceof AbstractC3519m)) {
                                                        int i10 = 0;
                                                        for (AbstractC3809q abstractC3809q6 = ((AbstractC3519m) abstractC3809q5).f16962t; abstractC3809q6 != null; abstractC3809q6 = abstractC3809q6.f17997j) {
                                                            if ((abstractC3809q6.f17994g & 1024) != 0) {
                                                                i10++;
                                                                if (i10 == 1) {
                                                                    abstractC3809q5 = abstractC3809q6;
                                                                } else {
                                                                    if (c2705e3 == null) {
                                                                        c2705e3 = new C2705e(new AbstractC3809q[16]);
                                                                    }
                                                                    if (abstractC3809q5 != null) {
                                                                        c2705e3.m4300b(abstractC3809q5);
                                                                        abstractC3809q5 = null;
                                                                    }
                                                                    c2705e3.m4300b(abstractC3809q6);
                                                                }
                                                            }
                                                        }
                                                        if (i10 == 1) {
                                                        }
                                                    }
                                                    abstractC3809q5 = AbstractC3498f.m5366f(c2705e3);
                                                }
                                            }
                                        } else {
                                            abstractC3809q5 = abstractC3809q5.f17997j;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z7);
            case 21:
                return ((C2799d) this.f272g).f14814d;
            case 22:
                return ((C2802g) this.f272g).m4434K0();
            case 23:
                C2911h1 c2911h1 = (C2911h1) this.f272g;
                c2911h1.f15167G.f15212a = new C2692w(new C0019e1((InterfaceC3093c) AbstractC3498f.m5369i(c2911h1, AbstractC3674f1.f17517h)));
                return C1694m.f10482a;
            case 24:
                C3184a0 c3184a0 = (C3184a0) this.f272g;
                if (!((Boolean) c3184a0.f15913f.getValue()).booleanValue() && (c2415v = c3184a0.f15910c) != null) {
                    c2415v.m3937k();
                }
                return C1694m.f10482a;
            case 25:
                C3205h0 m4905a = ((C3200f1) this.f272g).m4905a();
                C3502g0 c3502g0 = m4905a.f15958e;
                if (m4905a.f15971r != ((C2702b) c3502g0.m5441o()).f14511e.f14519g) {
                    C2194h0 c2194h0 = m4905a.f15963j;
                    Object[] objArr = c2194h0.f12678c;
                    long[] jArr = c2194h0.f12676a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr[i11];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j6) < 128) {
                                        ((C3184a0) objArr[(i11 << 3) + i13]).f15911d = true;
                                    }
                                    j6 >>= 8;
                                }
                                if (i12 != 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                    if (c3502g0.f16890k != null) {
                        if (!c3502g0.f16873J.f16942e) {
                            C3502g0.m5395W(c3502g0, false, 7);
                        }
                    } else if (!c3502g0.m5443q()) {
                        C3502g0.m5396Y(c3502g0, false, 7);
                    }
                }
                return C1694m.f10482a;
            case 26:
                C3348d c3348d = (C3348d) this.f272g;
                C2705e c2705e4 = c3348d.f16411c;
                C2705e c2705e5 = c3348d.f16410b;
                C2705e c2705e6 = c3348d.f16413e;
                c3348d.f16414f = false;
                HashSet hashSet = new HashSet();
                C2705e c2705e7 = c3348d.f16412d;
                Object[] objArr2 = c2705e7.f14517e;
                int i14 = c2705e7.f14519g;
                for (int i15 = 0; i15 < i14; i15++) {
                    C3502g0 c3502g02 = (C3502g0) objArr2[i15];
                    C3352h c3352h = (C3352h) c2705e6.f14517e[i15];
                    AbstractC3809q abstractC3809q7 = c3502g02.f16872I.f16802f;
                    if (abstractC3809q7.f18005r) {
                        C3348d.m5082b(abstractC3809q7, c3352h, hashSet);
                    }
                }
                c2705e7.m4305g();
                c2705e6.m4305g();
                Object[] objArr3 = c2705e5.f14517e;
                int i16 = c2705e5.f14519g;
                for (int i17 = 0; i17 < i16; i17++) {
                    C3488c c3488c = (C3488c) objArr3[i17];
                    C3352h c3352h2 = (C3352h) c2705e4.f14517e[i17];
                    if (c3488c.f18005r) {
                        C3348d.m5082b(c3488c, c3352h2, hashSet);
                    }
                }
                c2705e5.m4305g();
                c2705e4.m4305g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C3488c) it.next()).m5299M0();
                }
                return C1694m.f10482a;
            case 27:
                C3448z c3448z = ((C0156a) this.f272g).f685j;
                if (c3448z != null) {
                    AbstractC3498f.m5373m(c3448z);
                }
                return C1694m.f10482a;
            case 28:
                return new C3447y0((InterfaceC3338e) this.f272g, C1814v.f10861e);
            default:
                C3514k0 c3514k0 = ((C3502g0) this.f272g).f16873J;
                c3514k0.f16953p.f17073E = true;
                C3541t0 c3541t0 = c3514k0.f16954q;
                if (c3541t0 != null) {
                    c3541t0.f17039y = true;
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053n(C0034i0 c0034i0, InterfaceC3663c2 interfaceC3663c2) {
        super(0);
        this.f271f = 11;
        this.f272g = c0034i0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0053n(InterfaceC3277a interfaceC3277a) {
        super(0);
        this.f271f = 16;
        this.f272g = (AbstractC3368k) interfaceC3277a;
    }
}
