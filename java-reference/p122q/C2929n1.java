package p122q;

import androidx.compose.foundation.gestures.AbstractC0152a;
import p001a0.C0005b;
import p001a0.C0070r0;
import p027d1.C0464b;
import p039e5.C1134o0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p107o.EnumC2788y0;
import p107o.InterfaceC2739f1;
import p109o1.C2799d;
import p109o1.C2802g;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;
import p158u5.C3378u;
import p162v1.AbstractC3498f;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.n1 */
/* loaded from: classes.dex */
public final class C2929n1 {

    /* renamed from: a */
    public InterfaceC2914i1 f15229a;

    /* renamed from: b */
    public InterfaceC2739f1 f15230b;

    /* renamed from: c */
    public InterfaceC2925m0 f15231c;

    /* renamed from: d */
    public EnumC2931o0 f15232d;

    /* renamed from: e */
    public boolean f15233e;

    /* renamed from: f */
    public C2799d f15234f;

    /* renamed from: g */
    public int f15235g = 1;

    /* renamed from: h */
    public InterfaceC2958x0 f15236h = AbstractC0152a.f632a;

    /* renamed from: i */
    public final C2923l1 f15237i = new C2923l1(this);

    /* renamed from: j */
    public final C0005b f15238j = new C0005b(26, this);

    public C2929n1(InterfaceC2914i1 interfaceC2914i1, InterfaceC2739f1 interfaceC2739f1, InterfaceC2925m0 interfaceC2925m0, EnumC2931o0 enumC2931o0, boolean z7, C2799d c2799d) {
        this.f15229a = interfaceC2914i1;
        this.f15230b = interfaceC2739f1;
        this.f15231c = interfaceC2925m0;
        this.f15232d = enumC2931o0;
        this.f15233e = z7;
        this.f15234f = c2799d;
    }

    /* renamed from: a */
    public static final long m4588a(C2929n1 c2929n1, InterfaceC2958x0 interfaceC2958x0, long j6, int i7) {
        C2802g c2802g;
        long j7;
        int i8;
        C2802g c2802g2 = c2929n1.f15234f.f14811a;
        C2802g c2802g3 = null;
        if (c2802g2 != null && c2802g2.f18005r) {
            c2802g = (C2802g) AbstractC3498f.m5371k(c2802g2);
        } else {
            c2802g = null;
        }
        long j8 = 0;
        if (c2802g != null) {
            j7 = c2802g.mo4430o0(i7, j6);
        } else {
            j7 = 0;
        }
        long m1010f = C0464b.m1010f(j6, j7);
        if (c2929n1.f15232d == EnumC2931o0.f15241f) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        long m4591d = c2929n1.m4591d(c2929n1.m4594g(interfaceC2958x0.mo4566a(c2929n1.m4593f(c2929n1.m4591d(C0464b.m1005a(m1010f, 0.0f, i8))))));
        long m1010f2 = C0464b.m1010f(m1010f, m4591d);
        C2802g c2802g4 = c2929n1.f15234f.f14811a;
        if (c2802g4 != null && c2802g4.f18005r) {
            c2802g3 = (C2802g) AbstractC3498f.m5371k(c2802g4);
        }
        C2802g c2802g5 = c2802g3;
        if (c2802g5 != null) {
            j8 = c2802g5.mo2743N(i7, m4591d, m1010f2);
        }
        return C0464b.m1011g(C0464b.m1011g(j7, m4591d), j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [u5.u, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4589b(long j6, AbstractC2583c abstractC2583c) {
        C2917j1 c2917j1;
        int i7;
        C3378u c3378u;
        if (abstractC2583c instanceof C2917j1) {
            c2917j1 = (C2917j1) abstractC2583c;
            int i8 = c2917j1.f15196k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2917j1.f15196k = i8 - Integer.MIN_VALUE;
                Object obj = c2917j1.f15194i;
                i7 = c2917j1.f15196k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c3378u = c2917j1.f15193h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    obj2.f16450e = j6;
                    InterfaceC3281e c1134o0 = new C1134o0(this, obj2, j6, null);
                    c2917j1.f15193h = obj2;
                    c2917j1.f15196k = 1;
                    Object m4592e = m4592e(EnumC2788y0.f14796e, c1134o0, c2917j1);
                    Object obj3 = EnumC2465a.f13750e;
                    if (m4592e == obj3) {
                        return obj3;
                    }
                    c3378u = obj2;
                }
                return new C3107q(c3378u.f16450e);
            }
        }
        c2917j1 = new C2917j1(this, abstractC2583c);
        Object obj4 = c2917j1.f15194i;
        i7 = c2917j1.f15196k;
        if (i7 == 0) {
        }
        return new C3107q(c3378u.f16450e);
    }

    /* renamed from: c */
    public final float m4590c(float f7) {
        if (this.f15233e) {
            return f7 * (-1);
        }
        return f7;
    }

    /* renamed from: d */
    public final long m4591d(long j6) {
        if (this.f15233e) {
            return C0464b.m1012h(-1.0f, j6);
        }
        return j6;
    }

    /* renamed from: e */
    public final Object m4592e(EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        Object mo112a = this.f15229a.mo112a(enumC2788y0, new C0070r0(this, interfaceC3281e, (InterfaceC2313c) null), abstractC2583c);
        if (mo112a == EnumC2465a.f13750e) {
            return mo112a;
        }
        return C1694m.f10482a;
    }

    /* renamed from: f */
    public final float m4593f(long j6) {
        if (this.f15232d == EnumC2931o0.f15241f) {
            return C0464b.m1008d(j6);
        }
        return C0464b.m1009e(j6);
    }

    /* renamed from: g */
    public final long m4594g(float f7) {
        if (f7 == 0.0f) {
            return 0L;
        }
        if (this.f15232d == EnumC2931o0.f15241f) {
            return AbstractC3784a.m5797a(f7, 0.0f);
        }
        return AbstractC3784a.m5797a(0.0f, f7);
    }
}
