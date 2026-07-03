package p039e5;

import android.net.Uri;
import p017c.C0328m;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ma */
/* loaded from: classes.dex */
public final /* synthetic */ class C1082ma implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5876e;

    /* renamed from: f */
    public final /* synthetic */ C0328m f5877f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f5878g;

    public /* synthetic */ C1082ma(C0328m c0328m, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f5876e = i7;
        this.f5877f = c0328m;
        this.f5878g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f5876e) {
            case 0:
                String str = ((C0959i9) this.f5878g.getValue()).f4779a;
                Uri uri = null;
                if (AbstractC0444k.m937a0(str)) {
                    str = null;
                }
                if (str != null) {
                    uri = Uri.parse(str);
                }
                this.f5877f.m675K(uri);
                break;
            default:
                this.f5878g.setValue(Boolean.FALSE);
                this.f5877f.m675K(AbstractC1092mk.m1770b3());
                break;
        }
        return C1694m.f10482a;
    }
}
