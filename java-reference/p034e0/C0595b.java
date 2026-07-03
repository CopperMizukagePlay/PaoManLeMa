package p034e0;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class C0595b extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f1956f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0617m f1957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0595b(InterfaceC0617m interfaceC0617m, int i7) {
        super(0);
        this.f1956f = i7;
        this.f1957g = interfaceC0617m;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f1956f) {
            case 0:
                return Boolean.valueOf(AbstractC3784a.m5815x(this.f1957g.mo125a()));
            default:
                return Boolean.valueOf(AbstractC3784a.m5815x(this.f1957g.mo125a()));
        }
    }
}
