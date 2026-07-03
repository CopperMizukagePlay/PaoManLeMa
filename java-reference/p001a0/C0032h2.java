package p001a0;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.h2 */
/* loaded from: classes.dex */
public final class C0032h2 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f155f;

    /* renamed from: g */
    public final /* synthetic */ C0048l2 f156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0032h2(C0048l2 c0048l2, int i7) {
        super(0);
        this.f155f = i7;
        this.f156g = c0048l2;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        boolean z8;
        switch (this.f155f) {
            case 0:
                if (this.f156g.f246a.m3729g() > 0.0f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                C0048l2 c0048l2 = this.f156g;
                if (c0048l2.f246a.m3729g() < c0048l2.f247b.m3729g()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
        }
    }
}
