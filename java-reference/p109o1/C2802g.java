package p109o1;

import p001a0.C0053n;
import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p140s2.C3107q;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3487b2;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o1.g */
/* loaded from: classes.dex */
public final class C2802g extends AbstractC3809q implements InterfaceC3487b2, InterfaceC2796a {

    /* renamed from: s */
    public InterfaceC2796a f14824s;

    /* renamed from: t */
    public C2799d f14825t;

    /* renamed from: u */
    public C2802g f14826u;

    /* renamed from: v */
    public final String f14827v;

    public C2802g(InterfaceC2796a interfaceC2796a, C2799d c2799d) {
        this.f14824s = interfaceC2796a;
        this.f14825t = c2799d == null ? new C2799d() : c2799d;
        this.f14827v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        C2799d c2799d = this.f14825t;
        c2799d.f14811a = this;
        c2799d.f14812b = null;
        this.f14826u = null;
        c2799d.f14813c = new C0053n(22, this);
        c2799d.f14814d = m5830y0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u5.v] */
    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        ?? obj = new Object();
        AbstractC3498f.m5385y(this, new C2803h(obj, 0));
        C2802g c2802g = (C2802g) ((InterfaceC3487b2) obj.f16451e);
        this.f14826u = c2802g;
        C2799d c2799d = this.f14825t;
        c2799d.f14812b = c2802g;
        if (c2799d.f14811a == this) {
            c2799d.f14811a = null;
        }
    }

    /* renamed from: K0 */
    public final InterfaceC0516a0 m4434K0() {
        C2802g c2802g;
        InterfaceC0516a0 interfaceC0516a0 = null;
        if (this.f18005r) {
            c2802g = (C2802g) AbstractC3498f.m5371k(this);
        } else {
            c2802g = null;
        }
        if (c2802g != null) {
            interfaceC0516a0 = c2802g.m4434K0();
        }
        if (interfaceC0516a0 != null && AbstractC0525d0.m1139q(interfaceC0516a0)) {
            return interfaceC0516a0;
        }
        InterfaceC0516a0 interfaceC0516a02 = this.f14825t.f14814d;
        if (interfaceC0516a02 != null) {
            return interfaceC0516a02;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: N */
    public final long mo2743N(int i7, long j6, long j7) {
        long j8;
        long mo2743N = this.f14824s.mo2743N(i7, j6, j7);
        boolean z7 = this.f18005r;
        C2802g c2802g = null;
        if (z7 && z7) {
            c2802g = (C2802g) AbstractC3498f.m5371k(this);
        }
        C2802g c2802g2 = c2802g;
        if (c2802g2 != null) {
            j8 = c2802g2.mo2743N(i7, C0464b.m1011g(j6, mo2743N), C0464b.m1010f(j7, mo2743N));
        } else {
            j8 = 0;
        }
        return C0464b.m1011g(mo2743N, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p109o1.InterfaceC2796a
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4429S(long j6, InterfaceC2313c interfaceC2313c) {
        C2801f c2801f;
        int i7;
        long j7;
        long j8;
        if (interfaceC2313c instanceof C2801f) {
            c2801f = (C2801f) interfaceC2313c;
            int i8 = c2801f.f14823k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2801f.f14823k = i8 - Integer.MIN_VALUE;
                Object obj = c2801f.f14821i;
                i7 = c2801f.f14823k;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            j8 = c2801f.f14820h;
                            AbstractC1793a0.m2972L(obj);
                            return new C3107q(C3107q.m4804e(j8, ((C3107q) obj).f15711a));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = c2801f.f14820h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    boolean z7 = this.f18005r;
                    C2802g c2802g = null;
                    if (z7 && z7) {
                        c2802g = (C2802g) AbstractC3498f.m5371k(this);
                    }
                    if (c2802g != null) {
                        c2801f.f14820h = j6;
                        c2801f.f14823k = 1;
                        obj = c2802g.mo4429S(j6, c2801f);
                    } else {
                        j7 = 0;
                        long j9 = j7;
                        long j10 = j6;
                        j8 = j9;
                        InterfaceC2796a interfaceC2796a = this.f14824s;
                        long m4803d = C3107q.m4803d(j10, j8);
                        c2801f.f14820h = j8;
                        c2801f.f14823k = 2;
                        obj = interfaceC2796a.mo4429S(m4803d, c2801f);
                    }
                }
                j7 = ((C3107q) obj).f15711a;
                long j92 = j7;
                long j102 = j6;
                j8 = j92;
                InterfaceC2796a interfaceC2796a2 = this.f14824s;
                long m4803d2 = C3107q.m4803d(j102, j8);
                c2801f.f14820h = j8;
                c2801f.f14823k = 2;
                obj = interfaceC2796a2.mo4429S(m4803d2, c2801f);
            }
        }
        c2801f = new C2801f(this, (AbstractC2583c) interfaceC2313c);
        Object obj2 = c2801f.f14821i;
        i7 = c2801f.f14823k;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        j7 = ((C3107q) obj2).f15711a;
        long j922 = j7;
        long j1022 = j6;
        j8 = j922;
        InterfaceC2796a interfaceC2796a22 = this.f14824s;
        long m4803d22 = C3107q.m4803d(j1022, j8);
        c2801f.f14820h = j8;
        c2801f.f14823k = 2;
        obj2 = interfaceC2796a22.mo4429S(m4803d22, c2801f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // p109o1.InterfaceC2796a
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2745n(long j6, long j7, InterfaceC2313c interfaceC2313c) {
        C2800e c2800e;
        int i7;
        long j8;
        long j9;
        long j10;
        boolean z7;
        C2802g c2802g;
        long j11;
        long j12;
        if (interfaceC2313c instanceof C2800e) {
            c2800e = (C2800e) interfaceC2313c;
            int i8 = c2800e.f14819l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2800e.f14819l = i8 - Integer.MIN_VALUE;
                C2800e c2800e2 = c2800e;
                Object obj = c2800e2.f14817j;
                i7 = c2800e2.f14819l;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            j12 = c2800e2.f14815h;
                            AbstractC1793a0.m2972L(obj);
                            j11 = ((C3107q) obj).f15711a;
                            j10 = j12;
                            return new C3107q(C3107q.m4804e(j10, j11));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j9 = c2800e2.f14816i;
                    j8 = c2800e2.f14815h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC2796a interfaceC2796a = this.f14824s;
                    c2800e2.f14815h = j6;
                    c2800e2.f14816i = j7;
                    c2800e2.f14819l = 1;
                    obj = interfaceC2796a.mo2745n(j6, j7, c2800e2);
                    if (obj != enumC2465a) {
                        j8 = j6;
                        j9 = j7;
                    }
                    return enumC2465a;
                }
                j10 = ((C3107q) obj).f15711a;
                z7 = this.f18005r;
                if (!z7) {
                    c2802g = null;
                    if (z7 && z7) {
                        c2802g = (C2802g) AbstractC3498f.m5371k(this);
                    }
                } else {
                    c2802g = this.f14826u;
                }
                if (c2802g == null) {
                    long m4804e = C3107q.m4804e(j8, j10);
                    long m4803d = C3107q.m4803d(j9, j10);
                    c2800e2.f14815h = j10;
                    c2800e2.f14819l = 2;
                    obj = c2802g.mo2745n(m4804e, m4803d, c2800e2);
                    if (obj != enumC2465a) {
                        j12 = j10;
                        j11 = ((C3107q) obj).f15711a;
                        j10 = j12;
                        return new C3107q(C3107q.m4804e(j10, j11));
                    }
                    return enumC2465a;
                }
                j11 = 0;
                return new C3107q(C3107q.m4804e(j10, j11));
            }
        }
        c2800e = new C2800e(this, (AbstractC2583c) interfaceC2313c);
        C2800e c2800e22 = c2800e;
        Object obj2 = c2800e22.f14817j;
        i7 = c2800e22.f14819l;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        j10 = ((C3107q) obj2).f15711a;
        z7 = this.f18005r;
        if (!z7) {
        }
        if (c2802g == null) {
        }
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return this.f14827v;
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: o0 */
    public final long mo4430o0(int i7, long j6) {
        long j7;
        boolean z7 = this.f18005r;
        C2802g c2802g = null;
        if (z7 && z7) {
            c2802g = (C2802g) AbstractC3498f.m5371k(this);
        }
        if (c2802g != null) {
            j7 = c2802g.mo4430o0(i7, j6);
        } else {
            j7 = 0;
        }
        return C0464b.m1011g(j7, this.f14824s.mo4430o0(i7, C0464b.m1010f(j6, j7)));
    }
}
