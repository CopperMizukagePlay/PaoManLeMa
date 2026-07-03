package p109o1;

import java.util.List;
import p019c1.C0377u;
import p060h5.AbstractC1806n;
import p117p1.C2862m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3379v;
import p160v.C3401b1;
import p160v.C3431q0;
import p162v1.EnumC3483a2;
import p162v1.InterfaceC3487b2;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o1.h */
/* loaded from: classes.dex */
public final class C2803h extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f14828f;

    /* renamed from: g */
    public final /* synthetic */ C3379v f14829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2803h(C3379v c3379v, int i7) {
        super(1);
        this.f14828f = i7;
        this.f14829g = c3379v;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        switch (this.f14828f) {
            case 0:
                Object obj2 = (InterfaceC3487b2) obj;
                if (((AbstractC3809q) obj2).f17992e.f18005r) {
                    this.f14829g.f16451e = obj2;
                    z7 = false;
                } else {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 1:
                C2862m c2862m = (C2862m) obj;
                C3379v c3379v = this.f14829g;
                Object obj3 = c3379v.f16451e;
                if (obj3 == null && c2862m.f15000t) {
                    c3379v.f16451e = c2862m;
                } else if (obj3 != null) {
                    c2862m.getClass();
                }
                return Boolean.TRUE;
            case 2:
                InterfaceC3487b2 interfaceC3487b2 = (InterfaceC3487b2) obj;
                AbstractC3367j.m5098c(interfaceC3487b2, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C3431q0 c3431q0 = ((C3401b1) interfaceC3487b2).f16524s;
                C3379v c3379v2 = this.f14829g;
                List list = (List) c3379v2.f16451e;
                if (list != null) {
                    list.add(c3431q0);
                } else {
                    list = AbstractC1806n.m3069Q(c3431q0);
                }
                c3379v2.f16451e = list;
                return EnumC3483a2.f16783f;
            default:
                this.f14829g.f16451e = (C0377u) obj;
                return Boolean.TRUE;
        }
    }
}
