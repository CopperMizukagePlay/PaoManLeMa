package androidx.compose.foundation.gestures;

import p001a0.C0012c2;
import p027d1.C0464b;
import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p107o.EnumC2788y0;
import p107o.InterfaceC2739f1;
import p122q.C2889a1;
import p122q.C2893b1;
import p122q.C2896c1;
import p122q.C2929n1;
import p122q.C2964z0;
import p122q.EnumC2931o0;
import p122q.InterfaceC2900e;
import p122q.InterfaceC2914i1;
import p122q.InterfaceC2925m0;
import p137s.C3081j;
import p150t5.InterfaceC3281e;
import p158u5.C3376s;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.gestures.a */
/* loaded from: classes.dex */
public abstract class AbstractC0152a {

    /* renamed from: a */
    public static final C2889a1 f632a = new Object();

    /* renamed from: b */
    public static final C2964z0 f633b = new Object();

    /* renamed from: c */
    public static final C2893b1 f634c = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [u5.s, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m327a(C2929n1 c2929n1, long j6, AbstractC2583c abstractC2583c) {
        C2896c1 c2896c1;
        int i7;
        C2929n1 c2929n12;
        C3376s c3376s;
        if (abstractC2583c instanceof C2896c1) {
            C2896c1 c2896c12 = (C2896c1) abstractC2583c;
            int i8 = c2896c12.f15109k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2896c12.f15109k = i8 - Integer.MIN_VALUE;
                c2896c1 = c2896c12;
                Object obj = c2896c1.f15108j;
                i7 = c2896c1.f15109k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C3376s c3376s2 = c2896c1.f15107i;
                        C2929n1 c2929n13 = c2896c1.f15106h;
                        AbstractC1793a0.m2972L(obj);
                        c3376s = c3376s2;
                        c2929n12 = c2929n13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    InterfaceC3281e c0012c2 = new C0012c2(c2929n1, j6, obj2, null, 2);
                    c2896c1.f15106h = c2929n1;
                    c2896c1.f15107i = obj2;
                    c2896c1.f15109k = 1;
                    Object m4592e = c2929n1.m4592e(EnumC2788y0.f14796e, c0012c2, c2896c1);
                    Object obj3 = EnumC2465a.f13750e;
                    if (m4592e == obj3) {
                        return obj3;
                    }
                    c2929n12 = c2929n1;
                    c3376s = obj2;
                }
                return new C0464b(c2929n12.m4594g(c3376s.f16448e));
            }
        }
        c2896c1 = new AbstractC2583c(abstractC2583c);
        Object obj4 = c2896c1.f15108j;
        i7 = c2896c1.f15109k;
        if (i7 == 0) {
        }
        return new C0464b(c2929n12.m4594g(c3376s.f16448e));
    }

    /* renamed from: b */
    public static final InterfaceC3810r m328b(InterfaceC3810r interfaceC3810r, InterfaceC2914i1 interfaceC2914i1, EnumC2931o0 enumC2931o0, InterfaceC2739f1 interfaceC2739f1, boolean z7, boolean z8, InterfaceC2925m0 interfaceC2925m0, C3081j c3081j, InterfaceC2900e interfaceC2900e) {
        return interfaceC3810r.mo5829e(new ScrollableElement(interfaceC2739f1, interfaceC2900e, interfaceC2925m0, enumC2931o0, interfaceC2914i1, c3081j, z7, z8));
    }
}
