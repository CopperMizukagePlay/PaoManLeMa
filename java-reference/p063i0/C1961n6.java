package p063i0;

import java.util.ArrayList;
import p053g5.C1694m;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.n6 */
/* loaded from: classes.dex */
public final class C1961n6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11587f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3282f f11588g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f11589h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1961n6(InterfaceC3282f interfaceC3282f, ArrayList arrayList, int i7) {
        super(2);
        this.f11587f = i7;
        this.f11588g = interfaceC3282f;
        this.f11589h = arrayList;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11587f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    this.f11588g.mo24c(this.f11589h, c2395p, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    this.f11588g.mo24c(this.f11589h, c2395p2, 0);
                }
                return C1694m.f10482a;
        }
    }
}
