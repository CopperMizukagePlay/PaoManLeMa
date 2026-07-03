package p039e5;

import p001a0.C0062p0;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0726b implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f2523e;

    /* renamed from: f */
    public final /* synthetic */ C1196q0 f2524f;

    public /* synthetic */ C0726b(C1196q0 c1196q0, int i7) {
        this.f2523e = i7;
        this.f2524f = c1196q0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f2523e) {
            case 0:
                return this.f2524f.f6962a.getSharedPreferences("download_tasks", 0);
            case 1:
                C1196q0 c1196q0 = this.f2524f;
                AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C0062p0(c1196q0, null, 8), 3);
                return C1694m.f10482a;
            default:
                C1196q0 c1196q02 = this.f2524f;
                AbstractC0525d0.m1141s(c1196q02.f6966e, null, new C1072m0(c1196q02, null, 1), 3);
                return C1694m.f10482a;
        }
    }
}
