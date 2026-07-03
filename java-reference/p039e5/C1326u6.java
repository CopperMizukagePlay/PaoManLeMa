package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import p024c6.AbstractC0451r;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u6 */
/* loaded from: classes.dex */
public final class C1326u6 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7891e;

    /* renamed from: f */
    public final /* synthetic */ C1156om f7892f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7893g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7894h;

    public /* synthetic */ C1326u6(C1156om c1156om, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f7891e = i7;
        this.f7892f = c1156om;
        this.f7893g = interfaceC2425y0;
        this.f7894h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7;
        int i8;
        int i9 = this.f7891e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7894h;
        InterfaceC2425y0 interfaceC2425y02 = this.f7893g;
        C1156om c1156om = this.f7892f;
        switch (i9) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    List list = c1156om.f6656o;
                    C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                    EnumC0844em enumC0844em = (EnumC0844em) interfaceC2425y02.getValue();
                    Integer m973O = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                    if (m973O != null) {
                        i7 = AbstractC2168e.m3530q(m973O.intValue(), 1, 10000);
                    } else {
                        i7 = 200;
                    }
                    int ordinal = enumC0844em.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    i8 = AbstractC2168e.m3530q(i7, 1, 10000);
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            AbstractC1172p7.m2030G(list, AbstractC0155c.m346e(C3807o.f17991a, 1.0f), c2395p, 48);
                        } else {
                            i8 = 100;
                        }
                    } else {
                        i8 = 50;
                    }
                    list = AbstractC1805m.m3033A0(i8, list);
                    AbstractC1172p7.m2030G(list, AbstractC0155c.m346e(C3807o.f17991a, 1.0f), c2395p, 48);
                }
                return c1694m;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    List list2 = c1156om.f6656o;
                    C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                    AbstractC1172p7.m2029F(list2, ((Boolean) interfaceC2425y02.getValue()).booleanValue(), (EnumC1063lm) interfaceC2425y0.getValue(), null, c2395p2, 0);
                }
                return c1694m;
        }
    }
}
