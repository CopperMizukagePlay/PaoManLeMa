package p063i0;

import androidx.compose.material3.AbstractC0165a;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o4 */
/* loaded from: classes.dex */
public final class C1967o4 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11607f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11608g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3810r f11609h;

    /* renamed from: i */
    public final /* synthetic */ boolean f11610i;

    /* renamed from: j */
    public final /* synthetic */ int f11611j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC1684c f11612k;

    /* renamed from: l */
    public final /* synthetic */ Object f11613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1967o4(boolean z7, InterfaceC1684c interfaceC1684c, InterfaceC3810r interfaceC3810r, boolean z8, Object obj, int i7, int i8) {
        super(2);
        this.f11607f = i8;
        this.f11608g = z7;
        this.f11612k = interfaceC1684c;
        this.f11609h = interfaceC3810r;
        this.f11610i = z8;
        this.f11613l = obj;
        this.f11611j = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11607f) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f11612k;
                C1959n4 c1959n4 = (C1959n4) this.f11613l;
                AbstractC1975p4.m3149a(this.f11608g, interfaceC3277a, this.f11609h, this.f11610i, c1959n4, (C2395p) obj, AbstractC2418w.m3957F(this.f11611j | 1));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f11612k;
                C2056z5 c2056z5 = (C2056z5) this.f11613l;
                AbstractC0165a.m376a(this.f11608g, interfaceC3279c, this.f11609h, this.f11610i, c2056z5, (C2395p) obj, AbstractC2418w.m3957F(this.f11611j | 1));
                return C1694m.f10482a;
        }
    }
}
