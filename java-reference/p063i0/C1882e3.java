package p063i0;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p035e1.C0661j0;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e3 */
/* loaded from: classes.dex */
public final class C1882e3 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11138f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11139g;

    /* renamed from: h */
    public final /* synthetic */ Object f11140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1882e3(int i7, Object obj, boolean z7) {
        super(1);
        this.f11138f = i7;
        this.f11139g = z7;
        this.f11140h = obj;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float floatValue;
        int i7 = this.f11138f;
        boolean z7 = true;
        Object obj2 = this.f11140h;
        boolean z8 = this.f11139g;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                C0661j0 c0661j0 = (C0661j0) obj;
                if (z8) {
                    floatValue = 1.0f;
                } else {
                    floatValue = ((Number) ((InterfaceC3277a) obj2).mo52a()).floatValue();
                }
                c0661j0.m1432a(floatValue);
                return c1694m;
            case 1:
                C0661j0 c0661j02 = (C0661j0) obj;
                if (z8 || !((Boolean) ((InterfaceC3277a) obj2).mo52a()).booleanValue()) {
                    z7 = false;
                }
                c0661j02.m1434e(z7);
                return c1694m;
            default:
                C0477j c0477j = (C0477j) obj;
                if (!z8) {
                    InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                    c0477j.m1036d(AbstractC0487t.f1748i, c1694m);
                }
                C1960n5 c1960n5 = new C1960n5((C2016u5) obj2, 1);
                InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
                c0477j.m1036d(AbstractC0476i.f1664h, new C0468a(null, c1960n5));
                return c1694m;
        }
    }
}
