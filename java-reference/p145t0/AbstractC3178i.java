package p145t0;

import java.util.ArrayList;
import p053g5.InterfaceC1684c;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2415v;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.i */
/* loaded from: classes.dex */
public abstract class AbstractC3178i {

    /* renamed from: a */
    public static final StackTraceElement[] f15890a = new StackTraceElement[0];

    /* renamed from: b */
    public static final C3180k f15891b = new C3180k(0, new long[0], new Object[0]);

    /* renamed from: a */
    public static final int m4870a(int i7, int i8) {
        return i7 << (((i8 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final long m4871b() {
        return Thread.currentThread().getId();
    }

    /* renamed from: c */
    public static final void m4872c(C2395p c2395p, InterfaceC3281e interfaceC3281e) {
        AbstractC3367j.m5098c(interfaceC3281e, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC3382y.m5111b(2, interfaceC3281e);
        interfaceC3281e.mo22d(c2395p, 1);
    }

    /* renamed from: d */
    public static final C3173d m4873d(int i7, InterfaceC1684c interfaceC1684c, C2395p c2395p) {
        Object m3847O = c2395p.m3847O();
        boolean z7 = true;
        if (m3847O == C2375k.f13421a) {
            m3847O = new C3173d(i7, interfaceC1684c, true);
            c2395p.m3877j0(m3847O);
        }
        C3173d c3173d = (C3173d) m3847O;
        if (!AbstractC3367j.m5096a(c3173d.f15884g, interfaceC1684c)) {
            if (c3173d.f15884g != null) {
                z7 = false;
            }
            c3173d.f15884g = interfaceC1684c;
            if (!z7 && c3173d.f15883f) {
                C2405r1 c2405r1 = c3173d.f15885h;
                if (c2405r1 != null) {
                    C2415v c2415v = c2405r1.f13539a;
                    if (c2415v != null) {
                        c2415v.m3944r(c2405r1, null);
                    }
                    c3173d.f15885h = null;
                }
                ArrayList arrayList = c3173d.f15886i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        C2405r1 c2405r12 = (C2405r1) arrayList.get(i8);
                        C2415v c2415v2 = c2405r12.f13539a;
                        if (c2415v2 != null) {
                            c2415v2.m3944r(c2405r12, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c3173d;
    }

    /* renamed from: e */
    public static final boolean m4874e(C2405r1 c2405r1, C2405r1 c2405r12) {
        if (c2405r1 != null) {
            if (c2405r1 instanceof C2405r1) {
                if (c2405r1.m3906b() && !c2405r1.equals(c2405r12) && !AbstractC3367j.m5096a(c2405r1.f13541c, c2405r12.f13541c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
