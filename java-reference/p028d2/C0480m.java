package p028d2;

import p005a6.InterfaceC0114e;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.m */
/* loaded from: classes.dex */
public final class C0480m extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f1688f;

    /* renamed from: g */
    public final /* synthetic */ String f1689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0480m(String str, int i7) {
        super(1);
        this.f1688f = i7;
        this.f1689g = str;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f1688f;
        C1694m c1694m = C1694m.f10482a;
        String str = this.f1689g;
        switch (i7) {
            case 0:
                AbstractC0489v.m1064b((C0477j) obj, str);
                return c1694m;
            case 1:
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1743d;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[2];
                c0490w.m1066a((C0477j) obj, str);
                return c1694m;
            default:
                C0477j c0477j = (C0477j) obj;
                AbstractC0489v.m1064b(c0477j, str);
                AbstractC0489v.m1065c(c0477j, 5);
                return c1694m;
        }
    }
}
