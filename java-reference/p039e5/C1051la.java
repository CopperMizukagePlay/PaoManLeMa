package p039e5;

import p017c.C0328m;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.la */
/* loaded from: classes.dex */
public final /* synthetic */ class C1051la implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5462e;

    /* renamed from: f */
    public final /* synthetic */ C0328m f5463f;

    public /* synthetic */ C1051la(C0328m c0328m, int i7) {
        this.f5462e = i7;
        this.f5463f = c0328m;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f5462e) {
            case 0:
                this.f5463f.m675K(null);
                break;
            case 1:
                this.f5463f.m675K(new String[]{"application/octet-stream", "application/json", "text/*", "*/*"});
                break;
            default:
                this.f5463f.m675K(AbstractC1312tn.m2353c());
                break;
        }
        return C1694m.f10482a;
    }
}
