package p061h6;

import p039e5.C1279sl;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2088a;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.c */
/* loaded from: classes.dex */
public abstract class AbstractC1821c {

    /* renamed from: a */
    public static final InterfaceC2313c[] f10871a = new InterfaceC2313c[0];

    /* renamed from: b */
    public static final C1279sl f10872b = new C1279sl("NULL", 1);

    /* renamed from: a */
    public static final Object m3094a(InterfaceC2318h interfaceC2318h, Object obj, Object obj2, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        Object mo22d;
        Object m3441l = AbstractC2088a.m3441l(interfaceC2318h, obj2);
        try {
            C1838t c1838t = new C1838t(interfaceC2313c, interfaceC2318h);
            if (interfaceC3281e == null) {
                mo22d = AbstractC2064e.m3230K(interfaceC3281e, obj, c1838t);
            } else {
                AbstractC3382y.m5111b(2, interfaceC3281e);
                mo22d = interfaceC3281e.mo22d(obj, c1838t);
            }
            AbstractC2088a.m3436g(interfaceC2318h, m3441l);
            if (mo22d == EnumC2465a.f13750e) {
                AbstractC3367j.m5100e(interfaceC2313c, "frame");
            }
            return mo22d;
        } catch (Throwable th) {
            AbstractC2088a.m3436g(interfaceC2318h, m3441l);
            throw th;
        }
    }
}
