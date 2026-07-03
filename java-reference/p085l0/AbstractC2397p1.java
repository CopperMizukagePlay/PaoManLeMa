package p085l0;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC2397p1 {

    /* renamed from: a */
    public final C2410t0 f13519a;

    public AbstractC2397p1(InterfaceC3277a interfaceC3277a) {
        this.f13519a = new C2410t0(interfaceC3277a);
    }

    /* renamed from: a */
    public abstract C2401q1 mo3716a(Object obj);

    /* renamed from: b */
    public InterfaceC2402q2 mo3717b() {
        return this.f13519a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC2402q2 m3897c(C2401q1 c2401q1, InterfaceC2402q2 interfaceC2402q2) {
        C2368i0 c2368i0 = null;
        if (interfaceC2402q2 instanceof C2368i0) {
            if (c2401q1.f13532d) {
                c2368i0 = (C2368i0) interfaceC2402q2;
                c2368i0.f13410a.setValue(c2401q1.m3904a());
            }
        } else if (interfaceC2402q2 instanceof C2398p2) {
            if ((c2401q1.f13530b || c2401q1.f13533e != null) && !c2401q1.f13532d) {
                C2398p2 c2398p2 = (C2398p2) interfaceC2402q2;
                if (AbstractC3367j.m5096a(c2401q1.m3904a(), c2398p2.f13520a)) {
                    c2368i0 = c2398p2;
                }
            }
        } else if (interfaceC2402q2 instanceof C2340b0) {
            c2401q1.getClass();
        }
        if (c2368i0 == null) {
            if (c2401q1.f13532d) {
                Object obj = c2401q1.f13533e;
                InterfaceC2370i2 interfaceC2370i2 = c2401q1.f13531c;
                if (interfaceC2370i2 == null) {
                    interfaceC2370i2 = C2413u0.f13575j;
                }
                return new C2368i0(new C2361g1(obj, interfaceC2370i2));
            }
            return new C2398p2(c2401q1.m3904a());
        }
        return c2368i0;
    }
}
