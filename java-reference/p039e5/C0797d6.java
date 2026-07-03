package p039e5;

import android.content.Context;
import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d6 */
/* loaded from: classes.dex */
public final class C0797d6 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3321i;

    /* renamed from: j */
    public final /* synthetic */ Context f3322j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f3323k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f3324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0797d6(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f3321i = i7;
        this.f3322j = context;
        this.f3323k = interfaceC2425y0;
        this.f3324l = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3321i) {
            case 0:
                C0797d6 c0797d6 = (C0797d6) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0797d6.mo29m(c1694m);
                return c1694m;
            default:
                C0797d6 c0797d62 = (C0797d6) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c0797d62.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3321i) {
            case 0:
                return new C0797d6(this.f3322j, this.f3323k, this.f3324l, interfaceC2313c, 0);
            default:
                return new C0797d6(this.f3322j, this.f3323k, this.f3324l, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f3321i;
        C1694m c1694m = C1694m.f10482a;
        Context context = this.f3322j;
        InterfaceC2425y0 interfaceC2425y0 = this.f3324l;
        InterfaceC2425y0 interfaceC2425y02 = this.f3323k;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                if (((EnumC1495zk) interfaceC2425y02.getValue()) == EnumC1495zk.f9910f && !AbstractC3367j.m5096a((List) interfaceC2425y0.getValue(), AbstractC3784a.m5817z("UDP"))) {
                    interfaceC2425y0.setValue(AbstractC3784a.m5817z("UDP"));
                    AbstractC1249rm.m2220G0(context, AbstractC3784a.m5817z(EnumC0748bl.f2838f));
                }
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                C3860d c3860d = AbstractC1328u8.f7898a;
                if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                    interfaceC2425y0.setValue(AbstractC1249rm.m2265i0(context));
                }
                return c1694m;
        }
    }
}
