package p107o;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p001a0.C0053n;
import p005a6.InterfaceC0114e;
import p019c1.EnumC0376t;
import p019c1.InterfaceC0361e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0474g;
import p028d2.C0477j;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p102n1.AbstractC2710c;
import p102n1.C2708a;
import p102n1.InterfaceC2711d;
import p117p1.AbstractC2847c0;
import p117p1.C2849d0;
import p117p1.C2857h0;
import p117p1.C2859j;
import p117p1.EnumC2860k;
import p117p1.InterfaceC2872w;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3081j;
import p137s.C3082k;
import p137s.C3083l;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3516l;
import p162v1.InterfaceC3539s1;
import p162v1.InterfaceC3551w1;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.e */
/* loaded from: classes.dex */
public abstract class AbstractC2734e extends AbstractC3519m implements InterfaceC3539s1, InterfaceC2711d, InterfaceC0361e, InterfaceC3551w1, InterfaceC3487b2 {

    /* renamed from: L */
    public static final C2730c1 f14626L = new Object();

    /* renamed from: B */
    public final C2735e0 f14628B;

    /* renamed from: C */
    public C2857h0 f14629C;

    /* renamed from: D */
    public InterfaceC3516l f14630D;

    /* renamed from: E */
    public C3083l f14631E;

    /* renamed from: F */
    public C3077f f14632F;

    /* renamed from: I */
    public C3081j f14635I;

    /* renamed from: J */
    public boolean f14636J;

    /* renamed from: K */
    public final C2730c1 f14637K;

    /* renamed from: u */
    public C3081j f14638u;

    /* renamed from: v */
    public InterfaceC2780u0 f14639v;

    /* renamed from: w */
    public String f14640w;

    /* renamed from: x */
    public C0474g f14641x;

    /* renamed from: y */
    public boolean f14642y;

    /* renamed from: z */
    public InterfaceC3277a f14643z;

    /* renamed from: A */
    public final C2729c0 f14627A = new AbstractC3809q();

    /* renamed from: G */
    public final LinkedHashMap f14633G = new LinkedHashMap();

    /* renamed from: H */
    public long f14634H = 0;

    /* JADX WARN: Type inference failed for: r2v1, types: [x0.q, o.c0] */
    public AbstractC2734e(C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, boolean z7, String str, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        boolean z8;
        this.f14638u = c3081j;
        this.f14639v = interfaceC2780u0;
        this.f14640w = str;
        this.f14641x = c0474g;
        this.f14642y = z7;
        this.f14643z = interfaceC3277a;
        this.f14628B = new C2735e0(c3081j);
        C3081j c3081j2 = this.f14638u;
        this.f14635I = c3081j2;
        if (c3081j2 == null && this.f14639v != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f14636J = z8;
        this.f14637K = f14626L;
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        long j7 = ((j6 >> 33) << 32) | (((j6 << 32) >> 33) & 4294967295L);
        this.f14634H = AbstractC3784a.m5797a((int) (j7 >> 32), (int) (j7 & 4294967295L));
        m4399Q0();
        InterfaceC2313c interfaceC2313c = null;
        if (this.f14642y && enumC2860k == EnumC2860k.f14996f) {
            int i7 = c2859j.f14994d;
            if (i7 == 4) {
                AbstractC0525d0.m1141s(m5830y0(), null, new C2731d(this, interfaceC2313c, 0), 3);
            } else if (i7 == 5) {
                AbstractC0525d0.m1141s(m5830y0(), null, new C2731d(this, interfaceC2313c, 1), 3);
            }
        }
        if (this.f14629C == null) {
            C2722a c2722a = new C2722a(this, interfaceC2313c, 2);
            C2859j c2859j2 = AbstractC2847c0.f14941a;
            C2857h0 c2857h0 = new C2857h0(null, null, C2849d0.f14950a);
            c2857h0.f14983u = c2722a;
            m5483K0(c2857h0);
            this.f14629C = c2857h0;
        }
        C2857h0 c2857h02 = this.f14629C;
        if (c2857h02 != null) {
            c2857h02.mo545A(c2859j, enumC2860k, j6);
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        if (!this.f14636J) {
            m4399Q0();
        }
        if (this.f14642y) {
            m5483K0(this.f14627A);
            m5483K0(this.f14628B);
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        m4398P0();
        if (this.f14635I == null) {
            this.f14638u = null;
        }
        InterfaceC3516l interfaceC3516l = this.f14630D;
        if (interfaceC3516l != null) {
            m5484L0(interfaceC3516l);
        }
        this.f14630D = null;
    }

    /* renamed from: O0 */
    public abstract Object mo4397O0(InterfaceC2872w interfaceC2872w, C2722a c2722a);

    /* renamed from: P0 */
    public final void m4398P0() {
        C3081j c3081j = this.f14638u;
        LinkedHashMap linkedHashMap = this.f14633G;
        if (c3081j != null) {
            C3083l c3083l = this.f14631E;
            if (c3083l != null) {
                c3081j.m4748c(new C3082k(c3083l));
            }
            C3077f c3077f = this.f14632F;
            if (c3077f != null) {
                c3081j.m4748c(new C3078g(c3077f));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c3081j.m4748c(new C3082k((C3083l) it.next()));
            }
        }
        this.f14631E = null;
        this.f14632F = null;
        linkedHashMap.clear();
    }

    /* renamed from: Q0 */
    public final void m4399Q0() {
        InterfaceC2780u0 interfaceC2780u0;
        if (this.f14630D == null && (interfaceC2780u0 = this.f14639v) != null) {
            if (this.f14638u == null) {
                this.f14638u = new C3081j();
            }
            this.f14628B.m4401N0(this.f14638u);
            C3081j c3081j = this.f14638u;
            AbstractC3367j.m5097b(c3081j);
            InterfaceC3516l mo3182a = interfaceC2780u0.mo3182a(c3081j);
            m5483K0(mo3182a);
            this.f14630D = mo3182a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.f14630D == null) goto L39;
     */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4400R0(C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, boolean z7, String str, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        boolean z8;
        boolean z9;
        InterfaceC3516l interfaceC3516l;
        boolean z10 = true;
        boolean z11 = false;
        if (!AbstractC3367j.m5096a(this.f14635I, c3081j)) {
            m4398P0();
            this.f14635I = c3081j;
            this.f14638u = c3081j;
            z8 = true;
        } else {
            z8 = false;
        }
        if (!AbstractC3367j.m5096a(this.f14639v, interfaceC2780u0)) {
            this.f14639v = interfaceC2780u0;
            z8 = true;
        }
        boolean z12 = this.f14642y;
        C2735e0 c2735e0 = this.f14628B;
        if (z12 != z7) {
            InterfaceC3516l interfaceC3516l2 = this.f14627A;
            if (z7) {
                m5483K0(interfaceC3516l2);
                m5483K0(c2735e0);
            } else {
                m5484L0(interfaceC3516l2);
                m5484L0(c2735e0);
                m4398P0();
            }
            AbstractC3498f.m5375o(this);
            this.f14642y = z7;
        }
        if (!AbstractC3367j.m5096a(this.f14640w, str)) {
            this.f14640w = str;
            AbstractC3498f.m5375o(this);
        }
        if (!AbstractC3367j.m5096a(this.f14641x, c0474g)) {
            this.f14641x = c0474g;
            AbstractC3498f.m5375o(this);
        }
        this.f14643z = interfaceC3277a;
        boolean z13 = this.f14636J;
        C3081j c3081j2 = this.f14635I;
        if (c3081j2 == null && this.f14639v != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z13 != z9) {
            if (c3081j2 == null && this.f14639v != null) {
                z11 = true;
            }
            this.f14636J = z11;
            if (!z11) {
            }
        }
        z10 = z8;
        if (z10 && ((interfaceC3516l = this.f14630D) != null || !this.f14636J)) {
            if (interfaceC3516l != null) {
                m5484L0(interfaceC3516l);
            }
            this.f14630D = null;
            m4399Q0();
        }
        c2735e0.m4401N0(this.f14638u);
    }

    @Override // p102n1.InterfaceC2711d
    /* renamed from: V */
    public final boolean mo4353V(KeyEvent keyEvent) {
        int m4345s;
        m4399Q0();
        boolean z7 = this.f14642y;
        int i7 = 0;
        int i8 = 1;
        InterfaceC2313c interfaceC2313c = null;
        LinkedHashMap linkedHashMap = this.f14633G;
        if (z7) {
            int i9 = AbstractC2777t.f14769b;
            if (AbstractC2710c.m4320C(keyEvent) == 2 && ((m4345s = (int) (AbstractC2710c.m4345s(keyEvent) >> 32)) == 23 || m4345s == 66 || m4345s == 160)) {
                if (!linkedHashMap.containsKey(new C2708a(AbstractC2168e.m3517d(keyEvent.getKeyCode())))) {
                    C3083l c3083l = new C3083l(this.f14634H);
                    linkedHashMap.put(new C2708a(AbstractC2168e.m3517d(keyEvent.getKeyCode())), c3083l);
                    if (this.f14638u != null) {
                        AbstractC0525d0.m1141s(m5830y0(), null, new C2728c(this, c3083l, interfaceC2313c, i7), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.f14642y) {
            int i10 = AbstractC2777t.f14769b;
            if (AbstractC2710c.m4320C(keyEvent) == 1) {
                int m4345s2 = (int) (AbstractC2710c.m4345s(keyEvent) >> 32);
                if (m4345s2 != 23 && m4345s2 != 66 && m4345s2 != 160) {
                    return false;
                }
                C3083l c3083l2 = (C3083l) linkedHashMap.remove(new C2708a(AbstractC2168e.m3517d(keyEvent.getKeyCode())));
                if (c3083l2 != null && this.f14638u != null) {
                    AbstractC0525d0.m1141s(m5830y0(), null, new C2728c(this, c3083l2, interfaceC2313c, i8), 3);
                }
                this.f14643z.mo52a();
                return true;
            }
        }
        return false;
    }

    @Override // p019c1.InterfaceC0361e
    /* renamed from: h0 */
    public final void mo547h0(EnumC0376t enumC0376t) {
        if (enumC0376t.m844a()) {
            m4399Q0();
        }
        if (this.f14642y) {
            this.f14628B.mo547h0(enumC0376t);
        }
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        C3077f c3077f;
        C3081j c3081j = this.f14638u;
        if (c3081j != null && (c3077f = this.f14632F) != null) {
            c3081j.m4748c(new C3078g(c3077f));
        }
        this.f14632F = null;
        C2857h0 c2857h0 = this.f14629C;
        if (c2857h0 != null) {
            c2857h0.mo548i0();
        }
    }

    @Override // p102n1.InterfaceC2711d
    /* renamed from: j */
    public final boolean mo4354j(KeyEvent keyEvent) {
        return false;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: m0 */
    public final boolean mo1030m0() {
        return true;
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return this.f14637K;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        C0474g c0474g = this.f14641x;
        if (c0474g != null) {
            AbstractC0489v.m1065c(c0477j, c0474g.f1652a);
        }
        String str = this.f14640w;
        C0053n c0053n = new C0053n(18, this);
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        c0477j.m1036d(AbstractC0476i.f1658b, new C0468a(str, c0053n));
        if (this.f14642y) {
            this.f14628B.mo1002t(c0477j);
        } else {
            c0477j.m1036d(AbstractC0487t.f1748i, C1694m.f10482a);
        }
        mo4396N0(c0477j);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }

    /* renamed from: N0 */
    public void mo4396N0(C0477j c0477j) {
    }
}
