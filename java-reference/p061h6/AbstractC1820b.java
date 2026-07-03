package p061h6;

import java.util.Arrays;
import p047f6.EnumC1546a;
import p053g5.C1694m;
import p054g6.C1718s;
import p082k5.InterfaceC2313c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.b */
/* loaded from: classes.dex */
public abstract class AbstractC1820b {

    /* renamed from: e */
    public AbstractC1822d[] f10867e;

    /* renamed from: f */
    public int f10868f;

    /* renamed from: g */
    public int f10869g;

    /* renamed from: h */
    public C1839u f10870h;

    /* renamed from: a */
    public final AbstractC1822d m3091a() {
        AbstractC1822d abstractC1822d;
        C1839u c1839u;
        synchronized (this) {
            try {
                AbstractC1822d[] abstractC1822dArr = this.f10867e;
                if (abstractC1822dArr == null) {
                    abstractC1822dArr = mo2749c();
                    this.f10867e = abstractC1822dArr;
                } else if (this.f10868f >= abstractC1822dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC1822dArr, abstractC1822dArr.length * 2);
                    AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                    this.f10867e = (AbstractC1822d[]) copyOf;
                    abstractC1822dArr = (AbstractC1822d[]) copyOf;
                }
                int i7 = this.f10869g;
                do {
                    abstractC1822d = abstractC1822dArr[i7];
                    if (abstractC1822d == null) {
                        abstractC1822d = mo2748b();
                        abstractC1822dArr[i7] = abstractC1822d;
                    }
                    i7++;
                    if (i7 >= abstractC1822dArr.length) {
                        i7 = 0;
                    }
                } while (!abstractC1822d.mo2754a(this));
                this.f10869g = i7;
                this.f10868f++;
                c1839u = this.f10870h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1839u != null) {
            c1839u.m3101w(1);
        }
        return abstractC1822d;
    }

    /* renamed from: b */
    public abstract AbstractC1822d mo2748b();

    /* renamed from: c */
    public abstract AbstractC1822d[] mo2749c();

    /* renamed from: d */
    public final void m3092d(AbstractC1822d abstractC1822d) {
        C1839u c1839u;
        int i7;
        InterfaceC2313c[] mo2755b;
        synchronized (this) {
            try {
                int i8 = this.f10868f - 1;
                this.f10868f = i8;
                c1839u = this.f10870h;
                if (i8 == 0) {
                    this.f10869g = 0;
                }
                AbstractC3367j.m5098c(abstractC1822d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                mo2755b = abstractC1822d.mo2755b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2313c interfaceC2313c : mo2755b) {
            if (interfaceC2313c != null) {
                interfaceC2313c.mo663n(C1694m.f10482a);
            }
        }
        if (c1839u != null) {
            c1839u.m3101w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h6.u, g6.s] */
    /* renamed from: e */
    public final C1839u m3093e() {
        C1839u c1839u;
        synchronized (this) {
            C1839u c1839u2 = this.f10870h;
            c1839u = c1839u2;
            if (c1839u2 == null) {
                int i7 = this.f10868f;
                ?? c1718s = new C1718s(1, Integer.MAX_VALUE, EnumC1546a.f10129f);
                c1718s.m2764q(Integer.valueOf(i7));
                this.f10870h = c1718s;
                c1839u = c1718s;
            }
        }
        return c1839u;
    }
}
