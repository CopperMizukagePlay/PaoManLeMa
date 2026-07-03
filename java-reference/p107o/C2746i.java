package p107o;

import java.util.NoSuchElementException;
import p027d1.C0465c;
import p031d5.C0512l;
import p034e0.C0625q;
import p035e1.InterfaceC0667m0;
import p035e1.ViewOnAttachStateChangeListenerC0650e;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p073j2.AbstractC2168e;
import p085l0.C2352e0;
import p085l0.InterfaceC2425y0;
import p099m6.C2591a;
import p099m6.C2599e;
import p099m6.C2616q;
import p101n0.C2705e;
import p122q.C2891b;
import p122q.C2912i;
import p122q.C2915j;
import p140s2.C3102l;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p152u.C3320h;
import p152u.C3321i;
import p152u.C3330r;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3379v;
import p160v.C3419k0;
import p162v1.AbstractC3497e1;
import p162v1.C3508i0;
import p168w.C3634q;
import p170w1.AbstractC3652a;
import p176x.C3791f;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C2746i extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f14670f;

    /* renamed from: g */
    public final /* synthetic */ Object f14671g;

    /* renamed from: h */
    public final /* synthetic */ Object f14672h;

    /* renamed from: i */
    public final /* synthetic */ Object f14673i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2746i(Object obj, Object obj2, Object obj3, int i7) {
        super(0);
        this.f14670f = i7;
        this.f14671g = obj;
        this.f14672h = obj2;
        this.f14673i = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0113, code lost:
    
        if (r0.f15187z == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        r1 = r0.m4583L0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0122, code lost:
    
        if (r0.m4584M0(r1, r0.f15178A) != true) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        if (r5 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        r0.f15187z = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012a, code lost:
    
        ((p122q.C2890a2) r8.f14672h).f15098e = p122q.C2915j.m4582K0(r0, (p122q.InterfaceC2900e) r8.f14673i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0138, code lost:
    
        return r4;
     */
    /* JADX WARN: Type inference failed for: r2v21, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52a() {
        boolean m4584M0;
        switch (this.f14670f) {
            case 0:
                C3379v c3379v = (C3379v) this.f14671g;
                InterfaceC0667m0 interfaceC0667m0 = ((C2749j) this.f14672h).f14680v;
                C3508i0 c3508i0 = (C3508i0) this.f14673i;
                c3379v.f16451e = interfaceC0667m0.mo1393a(c3508i0.f16933e.mo2546c(), c3508i0.getLayoutDirection(), c3508i0);
                return C1694m.f10482a;
            case 1:
                C2915j c2915j = (C2915j) this.f14671g;
                C2891b c2891b = c2915j.f15184w;
                while (true) {
                    C2705e c2705e = c2891b.f15099a;
                    int i7 = c2705e.f14519g;
                    C1694m c1694m = C1694m.f10482a;
                    boolean z7 = true;
                    if (i7 == 0) {
                        break;
                    } else if (i7 != 0) {
                        C0465c c0465c = (C0465c) ((C2912i) c2705e.f14517e[i7 - 1]).f15174a.mo52a();
                        if (c0465c == null) {
                            m4584M0 = true;
                        } else {
                            m4584M0 = c2915j.m4584M0(c0465c, c2915j.f15178A);
                        }
                        if (!m4584M0) {
                            break;
                        } else {
                            ((C2912i) c2705e.m4309k(c2705e.f14519g - 1)).f15175b.mo663n(c1694m);
                        }
                    } else {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                }
            case 2:
                AbstractC2064e abstractC2064e = ((C2599e) this.f14671g).f14071b;
                AbstractC3367j.m5097b(abstractC2064e);
                return abstractC2064e.mo3260o(((C2591a) this.f14673i).f14015h.f14154d, ((C2616q) this.f14672h).m4163a());
            case 3:
                C3320h c3320h = (C3320h) ((C2352e0) this.f14671g).getValue();
                C3330r c3330r = (C3330r) this.f14672h;
                return new C3321i(c3330r, c3320h, (C3315c) this.f14673i, new C0512l((C3879d) ((C3419k0) c3330r.f16363d.f10654e).getValue(), c3320h));
            case 4:
                return new C3634q((InterfaceC3283g) ((InterfaceC2425y0) this.f14671g).getValue(), (InterfaceC3279c) ((InterfaceC2425y0) this.f14672h).getValue(), ((Number) ((InterfaceC3277a) this.f14673i).mo52a()).intValue());
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3652a abstractC3652a = (AbstractC3652a) this.f14671g;
                abstractC3652a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC0650e) this.f14672h);
                C0625q c0625q = (C0625q) this.f14673i;
                AbstractC3367j.m5100e(c0625q, "listener");
                AbstractC2168e.m3508B(abstractC3652a).f13747a.remove(c0625q);
                return C1694m.f10482a;
            default:
                C3791f c3791f = (C3791f) this.f14671g;
                C0465c m5820K0 = C3791f.m5820K0(c3791f, (AbstractC3497e1) this.f14672h, (AbstractC3368k) this.f14673i);
                if (m5820K0 != null) {
                    C2915j c2915j2 = c3791f.f17956s;
                    if (!C3102l.m4790a(c2915j2.f15178A, 0L)) {
                        return m5820K0.m1020g(c2915j2.m4586O0(m5820K0, c2915j2.f15178A) ^ (-9223372034707292160L));
                    }
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2746i(C3791f c3791f, AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a) {
        super(0);
        this.f14670f = 6;
        this.f14671g = c3791f;
        this.f14672h = abstractC3497e1;
        this.f14673i = (AbstractC3368k) interfaceC3277a;
    }
}
