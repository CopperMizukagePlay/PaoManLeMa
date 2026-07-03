package p154u1;

import p067i4.AbstractC2072e;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.InterfaceC3516l;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u1.e */
/* loaded from: classes.dex */
public interface InterfaceC3349e extends InterfaceC3351g, InterfaceC3516l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r2v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [u1.e, v1.l] */
    @Override // p154u1.InterfaceC3351g
    /* renamed from: e */
    default Object mo5084e(C3352h c3352h) {
        C3490c1 c3490c1;
        AbstractC3809q abstractC3809q = (AbstractC3809q) this;
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4749a("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e.f17996i;
        C3502g0 m5382v = AbstractC3498f.m5382v(this);
        while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 32) != 0) {
                while (abstractC3809q2 != null) {
                    if ((abstractC3809q2.f17994g & 32) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q2;
                        ?? r42 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3349e) {
                                InterfaceC3349e interfaceC3349e = (InterfaceC3349e) abstractC3519m;
                                if (interfaceC3349e.mo5085h().mo3349f(c3352h)) {
                                    return interfaceC3349e.mo5085h().mo3350k(c3352h);
                                }
                            } else if ((abstractC3519m.f17994g & 32) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r42 = r42;
                                while (abstractC3809q3 != null) {
                                    if ((abstractC3809q3.f17994g & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r42.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r42.m4300b(abstractC3809q3);
                                        }
                                    }
                                    abstractC3809q3 = abstractC3809q3.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = AbstractC3498f.m5366f(r42);
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
        return c3352h.f16415a.mo52a();
    }

    /* renamed from: h */
    default AbstractC2072e mo5085h() {
        return C3346b.f16408a;
    }
}
