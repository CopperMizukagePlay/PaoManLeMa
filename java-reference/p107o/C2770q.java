package p107o;

import androidx.compose.p007ui.viewinterop.AbstractC0174a;
import p053g5.C1694m;
import p068i5.AbstractC2080d;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.q */
/* loaded from: classes.dex */
public final class C2770q extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f14753f = 1;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f14754g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3810r f14755h;

    /* renamed from: i */
    public final /* synthetic */ int f14756i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770q(InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, int i7) {
        super(2);
        this.f14754g = interfaceC3279c;
        this.f14755h = interfaceC3810r;
        this.f14756i = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f14753f;
        C2395p c2395p = (C2395p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC2080d.m3388a(AbstractC2418w.m3957F(this.f14756i | 1), c2395p, this.f14754g, this.f14755h);
                return C1694m.f10482a;
            default:
                AbstractC0174a.m403a(AbstractC2418w.m3957F(this.f14756i | 1), c2395p, this.f14754g, this.f14755h);
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770q(InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c, int i7) {
        super(2);
        this.f14755h = interfaceC3810r;
        this.f14754g = interfaceC3279c;
        this.f14756i = i7;
    }
}
