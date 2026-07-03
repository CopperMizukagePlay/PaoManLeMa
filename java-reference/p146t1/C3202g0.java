package p146t1;

import p077k.AbstractC2205n;
import p077k.C2222x;
import p101n0.C2702b;
import p101n0.C2705e;
import p109o1.C2803h;
import p139s1.AbstractC3088a;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3511j0;
import p162v1.AbstractC3519m;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.EnumC3483a2;
import p162v1.InterfaceC3487b2;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.g0 */
/* loaded from: classes.dex */
public final class C3202g0 implements InterfaceC3194d1 {

    /* renamed from: a */
    public final C2222x f15954a;

    /* renamed from: b */
    public final /* synthetic */ C3205h0 f15955b;

    /* renamed from: c */
    public final /* synthetic */ Object f15956c;

    public C3202g0(C3205h0 c3205h0, Object obj) {
        this.f15955b = c3205h0;
        this.f15956c = obj;
        int[] iArr = AbstractC2205n.f12714a;
        this.f15954a = new C2222x();
    }

    @Override // p146t1.InterfaceC3194d1
    /* renamed from: a */
    public final void mo4901a() {
        C3205h0 c3205h0 = this.f15955b;
        C3502g0 c3502g0 = c3205h0.f15958e;
        c3205h0.m4907d();
        C3502g0 c3502g02 = (C3502g0) c3205h0.f15967n.m3596k(this.f15956c);
        if (c3502g02 != null) {
            if (c3205h0.f15972s <= 0) {
                AbstractC3088a.m4750b("No pre-composed items to dispose");
            }
            int m4307i = ((C2702b) c3502g0.m5441o()).f14511e.m4307i(c3502g02);
            if (m4307i < ((C2702b) c3502g0.m5441o()).f14511e.f14519g - c3205h0.f15972s) {
                AbstractC3088a.m4750b("Item is not in pre-composed item range");
            }
            c3205h0.f15971r++;
            c3205h0.f15972s--;
            C3184a0 c3184a0 = (C3184a0) c3205h0.f15963j.m3592g(c3502g02);
            if (c3184a0 != null) {
                c3184a0.getClass();
            }
            int i7 = (((C2702b) c3502g0.m5441o()).f14511e.f14519g - c3205h0.f15972s) - c3205h0.f15971r;
            c3502g0.f16899t = true;
            c3502g0.m5411M(m4307i, i7, 1);
            c3502g0.f16899t = false;
            c3205h0.m4906c(i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [o1.h] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // p146t1.InterfaceC3194d1
    /* renamed from: b */
    public final void mo4902b(C2803h c2803h) {
        C3490c1 c3490c1;
        AbstractC3809q abstractC3809q;
        EnumC3483a2 enumC3483a2;
        C3502g0 c3502g0 = (C3502g0) this.f15955b.f15967n.m3592g(this.f15956c);
        if (c3502g0 != null && (c3490c1 = c3502g0.f16872I) != null && (abstractC3809q = c3490c1.f16802f) != null) {
            if (!abstractC3809q.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitSubtreeIf called on an unattached node");
            }
            C2705e c2705e = new C2705e(new AbstractC3809q[16]);
            AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e;
            AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j;
            if (abstractC3809q3 == null) {
                AbstractC3498f.m5362b(c2705e, abstractC3809q2);
            } else {
                c2705e.m4300b(abstractC3809q3);
            }
            while (true) {
                int i7 = c2705e.f14519g;
                if (i7 != 0) {
                    AbstractC3809q abstractC3809q4 = (AbstractC3809q) c2705e.m4309k(i7 - 1);
                    if ((abstractC3809q4.f17995h & 262144) != 0) {
                        for (AbstractC3809q abstractC3809q5 = abstractC3809q4; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                            if ((abstractC3809q5.f17994g & 262144) != 0) {
                                AbstractC3519m abstractC3519m = abstractC3809q5;
                                ?? r7 = 0;
                                while (abstractC3519m != 0) {
                                    if (abstractC3519m instanceof InterfaceC3487b2) {
                                        InterfaceC3487b2 interfaceC3487b2 = (InterfaceC3487b2) abstractC3519m;
                                        boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(interfaceC3487b2.mo204o());
                                        EnumC3483a2 enumC3483a22 = EnumC3483a2.f16783f;
                                        if (equals) {
                                            c2803h.mo23f(interfaceC3487b2);
                                            enumC3483a2 = enumC3483a22;
                                        } else {
                                            enumC3483a2 = EnumC3483a2.f16782e;
                                        }
                                        if (enumC3483a2 != EnumC3483a2.f16784g) {
                                            if (enumC3483a2 == enumC3483a22) {
                                                break;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if ((abstractC3519m.f17994g & 262144) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                        AbstractC3809q abstractC3809q6 = abstractC3519m.f16962t;
                                        int i8 = 0;
                                        abstractC3519m = abstractC3519m;
                                        r7 = r7;
                                        while (abstractC3809q6 != null) {
                                            if ((abstractC3809q6.f17994g & 262144) != 0) {
                                                i8++;
                                                r7 = r7;
                                                if (i8 == 1) {
                                                    abstractC3519m = abstractC3809q6;
                                                } else {
                                                    if (r7 == 0) {
                                                        r7 = new C2705e(new AbstractC3809q[16]);
                                                    }
                                                    if (abstractC3519m != 0) {
                                                        r7.m4300b(abstractC3519m);
                                                        abstractC3519m = 0;
                                                    }
                                                    r7.m4300b(abstractC3809q6);
                                                }
                                            }
                                            abstractC3809q6 = abstractC3809q6.f17997j;
                                            abstractC3519m = abstractC3519m;
                                            r7 = r7;
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    abstractC3519m = AbstractC3498f.m5366f(r7);
                                }
                            }
                        }
                    }
                    AbstractC3498f.m5362b(c2705e, abstractC3809q4);
                } else {
                    return;
                }
            }
        }
    }

    @Override // p146t1.InterfaceC3194d1
    /* renamed from: c */
    public final int mo4903c() {
        C3502g0 c3502g0 = (C3502g0) this.f15955b.f15967n.m3592g(this.f15956c);
        if (c3502g0 != null) {
            return ((C2702b) c3502g0.m5440n()).f14511e.f14519g;
        }
        return 0;
    }

    @Override // p146t1.InterfaceC3194d1
    /* renamed from: d */
    public final void mo4904d(int i7, long j6) {
        C3205h0 c3205h0 = this.f15955b;
        C3502g0 c3502g0 = (C3502g0) c3205h0.f15967n.m3592g(this.f15956c);
        if (c3502g0 != null && c3502g0.m5407I()) {
            int i8 = ((C2702b) c3502g0.m5440n()).f14511e.f14519g;
            if (i7 < 0 || i7 >= i8) {
                AbstractC3088a.m4752d("Index (" + i7 + ") is out of bound of [0, " + i8 + ')');
            }
            if (c3502g0.m5408J()) {
                AbstractC3088a.m4749a("Pre-measure called on node that is not placed");
            }
            C3502g0 c3502g02 = c3205h0.f15958e;
            c3502g02.f16899t = true;
            ((C3728t) AbstractC3511j0.m5464a(c3502g0)).m5748w((C3502g0) ((C2702b) c3502g0.m5440n()).get(i7), j6);
            c3502g02.f16899t = false;
            this.f15954a.m3653a(i7);
        }
    }
}
