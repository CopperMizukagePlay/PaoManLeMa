package p160v;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p082k5.C2320j;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.d */
/* loaded from: classes.dex */
public final class C3404d implements InterfaceC3808p {

    /* renamed from: a */
    public boolean f16531a;

    /* renamed from: b */
    public C2320j f16532b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5165h(AbstractC2583c abstractC2583c) {
        C3402c c3402c;
        int i7;
        C2320j c2320j;
        if (abstractC2583c instanceof C3402c) {
            c3402c = (C3402c) abstractC2583c;
            int i8 = c3402c.f16528k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3402c.f16528k = i8 - Integer.MIN_VALUE;
                Object obj = c3402c.f16526i;
                i7 = c3402c.f16528k;
                C1694m c1694m = C1694m.f10482a;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2320j = c3402c.f16525h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (!this.f16531a) {
                        C2320j c2320j2 = this.f16532b;
                        c3402c.f16525h = c2320j2;
                        c3402c.f16528k = 1;
                        C2320j c2320j3 = new C2320j(AbstractC2064e.m3250x(c3402c), EnumC2465a.f13751f);
                        this.f16532b = c2320j3;
                        Object m3691a = c2320j3.m3691a();
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m3691a == enumC2465a) {
                            return enumC2465a;
                        }
                        c2320j = c2320j2;
                    }
                    return c1694m;
                }
                if (c2320j != null) {
                    c2320j.mo663n(c1694m);
                }
                return c1694m;
            }
        }
        c3402c = new C3402c(this, abstractC2583c);
        Object obj2 = c3402c.f16526i;
        i7 = c3402c.f16528k;
        C1694m c1694m2 = C1694m.f10482a;
        if (i7 == 0) {
        }
        if (c2320j != null) {
        }
        return c1694m2;
    }
}
