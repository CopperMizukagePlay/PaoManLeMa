package p071j0;

import p053g5.C1694m;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2699z;
import p100n.C2635d;
import p100n.C2661l1;
import p100n.C2686u;
import p137s.C3073b;
import p137s.C3077f;
import p137s.C3083l;
import p137s.InterfaceC3079h;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.v */
/* loaded from: classes.dex */
public abstract class AbstractC2156v {

    /* renamed from: a */
    public static final C2661l1 f12546a;

    /* renamed from: b */
    public static final C2661l1 f12547b;

    /* renamed from: c */
    public static final C2661l1 f12548c;

    static {
        C2686u c2686u = new C2686u(0.4f, 0.0f, 0.6f, 1.0f);
        f12546a = new C2661l1(120, AbstractC2699z.f14497a, 2);
        f12547b = new C2661l1(150, c2686u, 2);
        f12548c = new C2661l1(120, c2686u, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r10 instanceof p137s.C3075d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r9 instanceof p137s.C3075d) != false) goto L6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3499a(C2635d c2635d, float f7, InterfaceC3079h interfaceC3079h, InterfaceC3079h interfaceC3079h2, AbstractC2583c abstractC2583c) {
        C2661l1 c2661l1;
        C2661l1 c2661l12 = null;
        if (interfaceC3079h2 != null) {
            boolean z7 = interfaceC3079h2 instanceof C3083l;
            c2661l1 = f12546a;
            if (!z7) {
                if (!(interfaceC3079h2 instanceof C3073b)) {
                    if (!(interfaceC3079h2 instanceof C3077f)) {
                    }
                }
            }
            c2661l12 = c2661l1;
        } else if (interfaceC3079h != null) {
            boolean z8 = interfaceC3079h instanceof C3083l;
            c2661l1 = f12547b;
            if (!z8 && !(interfaceC3079h instanceof C3073b)) {
                if (interfaceC3079h instanceof C3077f) {
                    c2661l12 = f12548c;
                }
            }
            c2661l12 = c2661l1;
        }
        C2661l1 c2661l13 = c2661l12;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (c2661l13 != null) {
            Object m4205c = C2635d.m4205c(c2635d, new C3096f(f7), c2661l13, null, abstractC2583c, 12);
            if (m4205c == enumC2465a) {
                return m4205c;
            }
        } else {
            Object m4207e = c2635d.m4207e(new C3096f(f7), abstractC2583c);
            if (m4207e == enumC2465a) {
                return m4207e;
            }
        }
        return C1694m.f10482a;
    }
}
