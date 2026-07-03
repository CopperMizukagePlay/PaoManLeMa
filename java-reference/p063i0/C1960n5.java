package p063i0;

import p027d1.C0464b;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p085l0.C2345c1;
import p140s2.C3102l;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.n5 */
/* loaded from: classes.dex */
public final class C1960n5 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11585f;

    /* renamed from: g */
    public final /* synthetic */ C2016u5 f11586g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1960n5(C2016u5 c2016u5, int i7) {
        super(1);
        this.f11585f = i7;
        this.f11586g = c2016u5;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        switch (this.f11585f) {
            case 0:
                this.f11586g.f11929m.m3730h((int) (((C3102l) obj).f15702a >> 32));
                return C1694m.f10482a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                C2016u5 c2016u5 = this.f11586g;
                C3876a c3876a = c2016u5.f11922f;
                float m3529p = AbstractC2168e.m3529p(floatValue, c3876a.f18161a, c3876a.f18162b);
                C2345c1 c2345c1 = c2016u5.f11923g;
                if (m3529p == c2345c1.m3729g()) {
                    z7 = false;
                } else {
                    if (m3529p != c2345c1.m3729g()) {
                        InterfaceC3279c interfaceC3279c = c2016u5.f11924h;
                        if (interfaceC3279c != null) {
                            interfaceC3279c.mo23f(Float.valueOf(m3529p));
                        } else {
                            c2016u5.m3187d(m3529p);
                        }
                    }
                    InterfaceC3277a interfaceC3277a = c2016u5.f11921e;
                    if (interfaceC3277a != null) {
                        interfaceC3277a.mo52a();
                    }
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            default:
                long j6 = ((C0464b) obj).f1623a;
                C2016u5 c2016u52 = this.f11586g;
                c2016u52.m3185b(0.0f);
                c2016u52.f11931o.mo52a();
                return C1694m.f10482a;
        }
    }
}
