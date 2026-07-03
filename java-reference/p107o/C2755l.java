package p107o;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0473f;
import p028d2.C0477j;
import p028d2.C0490w;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.l */
/* loaded from: classes.dex */
public final class C2755l extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C2755l f14701g;

    /* renamed from: h */
    public static final C2755l f14702h;

    /* renamed from: i */
    public static final C2755l f14703i;

    /* renamed from: j */
    public static final C2755l f14704j;

    /* renamed from: k */
    public static final C2755l f14705k;

    /* renamed from: f */
    public final /* synthetic */ int f14706f;

    static {
        int i7 = 1;
        f14701g = new C2755l(i7, 0);
        f14702h = new C2755l(i7, 1);
        f14703i = new C2755l(i7, 2);
        f14704j = new C2755l(i7, 3);
        f14705k = new C2755l(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2755l(int i7, int i8) {
        super(i7);
        this.f14706f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f14706f;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                ((C3508i0) obj).m5460a();
                return c1694m;
            case 1:
                return c1694m;
            case 2:
                ((Number) obj).longValue();
                return c1694m;
            case 3:
                C0473f c0473f = C0473f.f1649c;
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                C0490w c0490w = AbstractC0487t.f1742c;
                InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[1];
                c0490w.m1066a((C0477j) obj, c0473f);
                return c1694m;
            case 4:
                return new C2769p1(((Number) obj).intValue());
            default:
                C0477j c0477j = (C0477j) obj;
                AbstractC0489v.m1064b(c0477j, "连接二维码");
                AbstractC0489v.m1065c(c0477j, 5);
                return c1694m;
        }
    }
}
