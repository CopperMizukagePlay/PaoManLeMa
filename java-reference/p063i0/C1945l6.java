package p063i0;

import java.util.List;
import p001a0.C0060o2;
import p053g5.C1694m;
import p085l0.C2395p;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.AbstractC3793a;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.l6 */
/* loaded from: classes.dex */
public final class C1945l6 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f11496f;

    /* renamed from: g */
    public final /* synthetic */ int f11497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1945l6(int i7, int i8) {
        super(3);
        this.f11496f = i8;
        this.f11497g = i7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f11496f) {
            case 0:
                ((Number) obj3).intValue();
                C1937k6 c1937k6 = C1937k6.f11436a;
                c1937k6.m3138a(AbstractC3793a.m5821a(C3807o.f17991a, new C0060o2(4, (C1921i6) ((List) obj).get(this.f11497g))), 0.0f, 0L, (C2395p) obj2, 3072);
                return C1694m.f10482a;
            default:
                List list = (List) obj;
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                int size = list.size();
                int i7 = this.f11497g;
                if (i7 < size) {
                    C1937k6.f11436a.m3138a(AbstractC3793a.m5821a(C3807o.f17991a, new C0060o2(4, (C1921i6) list.get(i7))), 0.0f, 0L, c2395p, 3072);
                }
                return C1694m.f10482a;
        }
    }
}
