package p129r;

import androidx.compose.foundation.gestures.AbstractC0152a;
import p001a0.C0068q2;
import p032d6.AbstractC0525d0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p096m3.C2572v;
import p098m5.AbstractC2583c;
import p100n.AbstractC2638e;
import p100n.AbstractC2667n1;
import p100n.C2659l;
import p100n.C2662m;
import p100n.C2664m1;
import p100n.C2673p1;
import p100n.C2675q0;
import p100n.C2692w;
import p122q.C2903f;
import p122q.C2918k;
import p122q.C2920k1;
import p122q.C2964z0;
import p122q.InterfaceC2925m0;
import p122q.InterfaceC2958x0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r.f */
/* loaded from: classes.dex */
public final class C3017f implements InterfaceC2925m0 {

    /* renamed from: a */
    public final C0068q2 f15556a;

    /* renamed from: b */
    public final C2692w f15557b;

    /* renamed from: c */
    public final C2675q0 f15558c;

    /* renamed from: d */
    public final C2964z0 f15559d = AbstractC0152a.f633b;

    public C3017f(C0068q2 c0068q2, C2692w c2692w, C2675q0 c2675q0) {
        this.f15556a = c0068q2;
        this.f15557b = c2692w;
        this.f15558c = c2675q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4710b(C3017f c3017f, InterfaceC2958x0 interfaceC2958x0, float f7, float f8, C3014c c3014c, AbstractC2583c abstractC2583c) {
        C3016e c3016e;
        int i7;
        C2673p1 c2673p1;
        Object m4713a;
        if (abstractC2583c instanceof C3016e) {
            c3016e = (C3016e) abstractC2583c;
            int i8 = c3016e.f15555j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3016e.f15555j = i8 - Integer.MIN_VALUE;
                C3016e c3016e2 = c3016e;
                Object obj = c3016e2.f15553h;
                i7 = c3016e2.f15555j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (Math.abs(f7) == 0.0f || Math.abs(f8) == 0.0f) {
                        return AbstractC2638e.m4216b(f7, f8, 28);
                    }
                    c3016e2.f15555j = 1;
                    C2692w c2692w = c3017f.f15557b;
                    C2664m1 c2664m1 = AbstractC2667n1.f14365a;
                    if (Math.abs(((C2662m) new C2572v(c2692w.f14462a).m4100h(new C2662m(0.0f), new C2662m(f8))).f14358a) >= Math.abs(f7)) {
                        c2673p1 = new C2673p1(7, c2692w);
                    } else {
                        c2673p1 = new C2673p1(8, c3017f.f15558c);
                    }
                    Float f9 = new Float(f7);
                    Float f10 = new Float(f8);
                    int i9 = c2673p1.f14389e;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    switch (i9) {
                        case 7:
                            m4713a = AbstractC3021j.m4713a(interfaceC2958x0, f9.floatValue(), AbstractC2638e.m4216b(0.0f, f10.floatValue(), 28), (C2692w) c2673p1.f14390f, c3014c, c3016e2);
                            if (m4713a != enumC2465a) {
                                m4713a = (C3012a) m4713a;
                                break;
                            }
                            break;
                        default:
                            float floatValue = f9.floatValue();
                            float floatValue2 = f10.floatValue();
                            m4713a = AbstractC3021j.m4714b(interfaceC2958x0, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, AbstractC2638e.m4216b(0.0f, floatValue2, 28), (C2675q0) c2673p1.f14390f, c3014c, c3016e2);
                            if (m4713a != enumC2465a) {
                                m4713a = (C3012a) m4713a;
                                break;
                            }
                            break;
                    }
                    obj = m4713a;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return ((C3012a) obj).f15542b;
            }
        }
        c3016e = new C3016e(c3017f, abstractC2583c);
        C3016e c3016e22 = c3016e;
        Object obj2 = c3016e22.f15553h;
        i7 = c3016e22.f15555j;
        if (i7 == 0) {
        }
        return ((C3012a) obj2).f15542b;
    }

    @Override // p122q.InterfaceC2925m0
    /* renamed from: a */
    public Object mo4587a(C2920k1 c2920k1, float f7, InterfaceC2313c interfaceC2313c) {
        return m4712d(c2920k1, f7, C2903f.f15136j, (AbstractC2583c) interfaceC2313c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4711c(InterfaceC2958x0 interfaceC2958x0, float f7, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        C3013b c3013b;
        int i7;
        InterfaceC3279c interfaceC3279c2;
        if (abstractC2583c instanceof C3013b) {
            c3013b = (C3013b) abstractC2583c;
            int i8 = c3013b.f15546k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3013b.f15546k = i8 - Integer.MIN_VALUE;
                Object obj = c3013b.f15544i;
                i7 = c3013b.f15546k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        interfaceC3279c2 = c3013b.f15543h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2918k c2918k = new C2918k(this, f7, interfaceC3279c, interfaceC2958x0, null);
                    c3013b.f15543h = interfaceC3279c;
                    c3013b.f15546k = 1;
                    obj = AbstractC0525d0.m1122A(this.f15559d, c2918k, c3013b);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                    interfaceC3279c2 = interfaceC3279c;
                }
                C3012a c3012a = (C3012a) obj;
                interfaceC3279c2.mo23f(new Float(0.0f));
                return c3012a;
            }
        }
        c3013b = new C3013b(this, abstractC2583c);
        Object obj2 = c3013b.f15544i;
        i7 = c3013b.f15546k;
        if (i7 == 0) {
        }
        C3012a c3012a2 = (C3012a) obj2;
        interfaceC3279c2.mo23f(new Float(0.0f));
        return c3012a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4712d(InterfaceC2958x0 interfaceC2958x0, float f7, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        C3015d c3015d;
        int i7;
        float floatValue;
        if (abstractC2583c instanceof C3015d) {
            c3015d = (C3015d) abstractC2583c;
            int i8 = c3015d.f15552j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3015d.f15552j = i8 - Integer.MIN_VALUE;
                Object obj = c3015d.f15550h;
                i7 = c3015d.f15552j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c3015d.f15552j = 1;
                    obj = m4711c(interfaceC2958x0, f7, interfaceC3279c, c3015d);
                    Object obj2 = EnumC2465a.f13750e;
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                C3012a c3012a = (C3012a) obj;
                floatValue = c3012a.f15541a.floatValue();
                C2659l c2659l = c3012a.f15542b;
                float f8 = 0.0f;
                if (floatValue != 0.0f) {
                    f8 = ((Number) c2659l.m4265a()).floatValue();
                }
                return new Float(f8);
            }
        }
        c3015d = new C3015d(this, abstractC2583c);
        Object obj3 = c3015d.f15550h;
        i7 = c3015d.f15552j;
        if (i7 == 0) {
        }
        C3012a c3012a2 = (C3012a) obj3;
        floatValue = c3012a2.f15541a.floatValue();
        C2659l c2659l2 = c3012a2.f15542b;
        float f82 = 0.0f;
        if (floatValue != 0.0f) {
        }
        return new Float(f82);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3017f) {
            C3017f c3017f = (C3017f) obj;
            if (c3017f.f15558c.equals(this.f15558c) && AbstractC3367j.m5096a(c3017f.f15557b, this.f15557b) && c3017f.f15556a.equals(this.f15556a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15556a.hashCode() + ((this.f15557b.hashCode() + (this.f15558c.hashCode() * 31)) * 31);
    }
}
