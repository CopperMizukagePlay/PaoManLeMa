package p154u1;

import java.util.HashSet;
import p001a0.C0053n;
import p077k.C2184c0;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3488c;
import p162v1.C3502g0;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u1.d */
/* loaded from: classes.dex */
public final class C3348d {

    /* renamed from: a */
    public final C3728t f16409a;

    /* renamed from: b */
    public final C2705e f16410b = new C2705e(new C3488c[16]);

    /* renamed from: c */
    public final C2705e f16411c = new C2705e(new C3352h[16]);

    /* renamed from: d */
    public final C2705e f16412d = new C2705e(new C3502g0[16]);

    /* renamed from: e */
    public final C2705e f16413e = new C2705e(new C3352h[16]);

    /* renamed from: f */
    public boolean f16414f;

    public C3348d(C3728t c3728t) {
        this.f16409a = c3728t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: b */
    public static void m5082b(AbstractC3809q abstractC3809q, C3352h c3352h, HashSet hashSet) {
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
                if ((abstractC3809q4.f17995h & 32) != 0) {
                    for (AbstractC3809q abstractC3809q5 = abstractC3809q4; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                        if ((abstractC3809q5.f17994g & 32) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q5;
                            ?? r52 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3349e) {
                                    InterfaceC3349e interfaceC3349e = (InterfaceC3349e) abstractC3519m;
                                    if (interfaceC3349e instanceof C3488c) {
                                        C3488c c3488c = (C3488c) interfaceC3349e;
                                        if ((c3488c.f16788s instanceof InterfaceC3347c) && c3488c.f16790u.contains(c3352h)) {
                                            hashSet.add(interfaceC3349e);
                                        }
                                    }
                                    if (interfaceC3349e.mo5085h().mo3349f(c3352h)) {
                                        break;
                                    }
                                } else if ((abstractC3519m.f17994g & 32) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q6 = abstractC3519m.f16962t;
                                    int i8 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r52 = r52;
                                    while (abstractC3809q6 != null) {
                                        if ((abstractC3809q6.f17994g & 32) != 0) {
                                            i8++;
                                            r52 = r52;
                                            if (i8 == 1) {
                                                abstractC3519m = abstractC3809q6;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r52.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r52.m4300b(abstractC3809q6);
                                            }
                                        }
                                        abstractC3809q6 = abstractC3809q6.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r52 = r52;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r52);
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

    /* renamed from: a */
    public final void m5083a() {
        if (!this.f16414f) {
            this.f16414f = true;
            C0053n c0053n = new C0053n(26, this);
            C2184c0 c2184c0 = this.f16409a.f17782z0;
            if (c2184c0.m3561f(c0053n) < 0) {
                c2184c0.m3556a(c0053n);
            }
        }
    }
}
