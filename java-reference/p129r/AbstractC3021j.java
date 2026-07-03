package p129r;

import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2638e;
import p100n.C2659l;
import p100n.C2675q0;
import p100n.C2692w;
import p122q.InterfaceC2958x0;
import p150t5.InterfaceC3279c;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r.j */
/* loaded from: classes.dex */
public abstract class AbstractC3021j {

    /* renamed from: a */
    public static final float f15576a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [u5.s, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4713a(InterfaceC2958x0 interfaceC2958x0, float f7, C2659l c2659l, C2692w c2692w, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        C3018g c3018g;
        int i7;
        boolean z7;
        float f8;
        C3376s c3376s;
        if (abstractC2583c instanceof C3018g) {
            C3018g c3018g2 = (C3018g) abstractC2583c;
            int i8 = c3018g2.f15564l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3018g2.f15564l = i8 - Integer.MIN_VALUE;
                c3018g = c3018g2;
                Object obj = c3018g.f15563k;
                i7 = c3018g.f15564l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        f8 = c3018g.f15560h;
                        c3376s = c3018g.f15562j;
                        c2659l = c3018g.f15561i;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    if (((Number) c2659l.m4265a()).floatValue() == 0.0f) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    C3019h c3019h = new C3019h(f7, obj2, interfaceC2958x0, interfaceC3279c, 0);
                    c3018g.f15561i = c2659l;
                    c3018g.f15562j = obj2;
                    c3018g.f15560h = f7;
                    c3018g.f15564l = 1;
                    Object m4220f = AbstractC2638e.m4220f(c2659l, c2692w, !z7, c3019h, c3018g);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4220f == enumC2465a) {
                        return enumC2465a;
                    }
                    f8 = f7;
                    c3376s = obj2;
                }
                return new C3012a(new Float(f8 - c3376s.f16448e), c2659l);
            }
        }
        c3018g = new AbstractC2583c(abstractC2583c);
        Object obj3 = c3018g.f15563k;
        i7 = c3018g.f15564l;
        if (i7 == 0) {
        }
        return new C3012a(new Float(f8 - c3376s.f16448e), c2659l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [u5.s, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4714b(InterfaceC2958x0 interfaceC2958x0, float f7, float f8, C2659l c2659l, C2675q0 c2675q0, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        AbstractC2583c abstractC2583c2;
        int i7;
        float floatValue;
        boolean z7;
        C2659l c2659l2;
        C3376s c3376s;
        float f9 = f7;
        if (abstractC2583c instanceof C3020i) {
            C3020i c3020i = (C3020i) abstractC2583c;
            int i8 = c3020i.f15575m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3020i.f15575m = i8 - Integer.MIN_VALUE;
                abstractC2583c2 = c3020i;
                C3020i c3020i2 = abstractC2583c2;
                Object obj = c3020i2.f15574l;
                i7 = c3020i2.f15575m;
                if (i7 == 0) {
                    if (i7 == 1) {
                        float f10 = c3020i2.f15571i;
                        float f11 = c3020i2.f15570h;
                        c3376s = c3020i2.f15573k;
                        c2659l2 = c3020i2.f15572j;
                        AbstractC1793a0.m2972L(obj);
                        floatValue = f10;
                        f9 = f11;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    floatValue = ((Number) c2659l.m4265a()).floatValue();
                    Float f12 = new Float(f9);
                    if (((Number) c2659l.m4265a()).floatValue() == 0.0f) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    C3019h c3019h = new C3019h(f8, obj2, interfaceC2958x0, interfaceC3279c, 1);
                    c3020i2.f15572j = c2659l;
                    c3020i2.f15573k = obj2;
                    c3020i2.f15570h = f9;
                    c3020i2.f15571i = floatValue;
                    c3020i2.f15575m = 1;
                    Object m4222h = AbstractC2638e.m4222h(c2659l, f12, c2675q0, !z7, c3019h, c3020i2);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4222h == enumC2465a) {
                        return enumC2465a;
                    }
                    c2659l2 = c2659l;
                    c3376s = obj2;
                }
                return new C3012a(new Float(f9 - c3376s.f16448e), AbstractC2638e.m4226l(c2659l2, 0.0f, m4715c(((Number) c2659l2.m4265a()).floatValue(), floatValue), 29));
            }
        }
        abstractC2583c2 = new AbstractC2583c(abstractC2583c);
        C3020i c3020i22 = abstractC2583c2;
        Object obj3 = c3020i22.f15574l;
        i7 = c3020i22.f15575m;
        if (i7 == 0) {
        }
        return new C3012a(new Float(f9 - c3376s.f16448e), AbstractC2638e.m4226l(c2659l2, 0.0f, m4715c(((Number) c2659l2.m4265a()).floatValue(), floatValue), 29));
    }

    /* renamed from: c */
    public static final float m4715c(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        if (f8 <= 0.0f ? f7 < f8 : f7 > f8) {
            return f8;
        }
        return f7;
    }
}
