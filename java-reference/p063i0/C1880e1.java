package p063i0;

import p035e1.C0677s;
import p035e1.InterfaceC0678t;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e1 */
/* loaded from: classes.dex */
public final class C1880e1 implements InterfaceC0678t {

    /* renamed from: a */
    public final /* synthetic */ int f11129a;

    /* renamed from: b */
    public final /* synthetic */ Object f11130b;

    public /* synthetic */ C1880e1(int i7, Object obj) {
        this.f11129a = i7;
        this.f11130b = obj;
    }

    @Override // p035e1.InterfaceC0678t
    /* renamed from: a */
    public final long mo1461a() {
        switch (this.f11129a) {
            case 0:
                C1898g1 c1898g1 = (C1898g1) this.f11130b;
                long mo1461a = c1898g1.f11217x.mo1461a();
                if (mo1461a == 16) {
                    C1983q4 c1983q4 = (C1983q4) AbstractC3498f.m5369i(c1898g1, AbstractC1999s4.f11758b);
                    if (c1983q4 != null) {
                        long j6 = c1983q4.f11696a;
                        if (j6 != 16) {
                            return j6;
                        }
                    }
                    return ((C0677s) AbstractC3498f.m5369i(c1898g1, AbstractC1862c1.f10996a)).f2211a;
                }
                return mo1461a;
            default:
                return ((C2007t4) this.f11130b).f11867c;
        }
    }
}
