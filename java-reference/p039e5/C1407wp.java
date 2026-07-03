package p039e5;

import java.util.List;
import p024c6.AbstractC0451r;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wp */
/* loaded from: classes.dex */
public final class C1407wp extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f8513i;

    /* renamed from: j */
    public final /* synthetic */ String f8514j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f8515k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1407wp(String str, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f8513i = i7;
        this.f8514j = str;
        this.f8515k = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f8513i) {
            case 0:
                C1407wp c1407wp = (C1407wp) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c1407wp.mo29m(c1694m);
                return c1694m;
            default:
                C1407wp c1407wp2 = (C1407wp) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c1407wp2.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f8513i) {
            case 0:
                return new C1407wp(this.f8514j, this.f8515k, interfaceC2313c, 0);
            default:
                return new C1407wp(this.f8514j, this.f8515k, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7;
        int i8 = this.f8513i;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f8515k;
        String str = this.f8514j;
        switch (i8) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                Integer m973O = AbstractC0451r.m973O(str);
                if (m973O != null) {
                    i7 = AbstractC2168e.m3530q(m973O.intValue(), 10, 2000);
                } else {
                    i7 = 120;
                }
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                Integer m973O2 = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                if (m973O2 == null || m973O2.intValue() != i7) {
                    interfaceC2425y0.setValue(String.valueOf(i7));
                }
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                List list = AbstractC1220qo.f7143a;
                int m2156a = (int) AbstractC1220qo.m2156a(str);
                C3137j0 c3137j02 = AbstractC0945hr.f4635a;
                Integer m973O3 = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                if (m973O3 == null || m973O3.intValue() != m2156a) {
                    interfaceC2425y0.setValue(String.valueOf(m2156a));
                }
                return c1694m;
        }
    }
}
