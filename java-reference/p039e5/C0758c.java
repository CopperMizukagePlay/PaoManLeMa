package p039e5;

import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p099m6.C2625z;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0758c implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f2917e;

    /* renamed from: f */
    public final /* synthetic */ C1196q0 f2918f;

    /* renamed from: g */
    public final /* synthetic */ C0800d9 f2919g;

    public /* synthetic */ C0758c(C1196q0 c1196q0, C0800d9 c0800d9, int i7) {
        this.f2917e = i7;
        this.f2918f = c1196q0;
        this.f2919g = c0800d9;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f2917e) {
            case 0:
                C0800d9 c0800d9 = this.f2919g;
                String str = c0800d9.f3341b;
                this.f2918f.getClass();
                C2625z m2088L = C1196q0.m2088L(c0800d9, str);
                m2088L.m4191c("Range", "bytes=0-0");
                m2088L.m4190b();
                return m2088L.m4189a();
            case 1:
                String str2 = this.f2919g.f3340a;
                AbstractC3367j.m5100e(str2, "id");
                C1196q0 c1196q0 = this.f2918f;
                AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C0791d0(c1196q0, str2, null, 0), 3);
                return C1694m.f10482a;
            case 2:
                this.f2918f.m2119P(this.f2919g.f3340a);
                return C1694m.f10482a;
            default:
                String str3 = this.f2919g.f3340a;
                AbstractC3367j.m5100e(str3, "id");
                C1196q0 c1196q02 = this.f2918f;
                AbstractC0525d0.m1141s(c1196q02.f6966e, null, new C0791d0(c1196q02, str3, null, 1), 3);
                return C1694m.f10482a;
        }
    }
}
