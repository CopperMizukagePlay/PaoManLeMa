package p039e5;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jc */
/* loaded from: classes.dex */
public final /* synthetic */ class C0991jc implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f5045e;

    /* renamed from: f */
    public final /* synthetic */ C1270sc f5046f;

    public /* synthetic */ C0991jc(C1270sc c1270sc, int i7) {
        this.f5045e = i7;
        this.f5046f = c1270sc;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0930hc c0930hc = (C0930hc) obj;
        switch (this.f5045e) {
            case 0:
                C1270sc.m2321k(this.f5046f, true, c0930hc, "双向测试进行中…");
                break;
            case 1:
                C1270sc.m2321k(this.f5046f, false, c0930hc, "双向测试进行中…");
                break;
            case 2:
                C1270sc.m2321k(this.f5046f, true, c0930hc, "测试进行中…");
                break;
            default:
                C1270sc.m2321k(this.f5046f, false, c0930hc, "测试进行中…");
                break;
        }
        return C1694m.f10482a;
    }
}
