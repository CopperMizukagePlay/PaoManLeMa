package p107o;

import p027d1.C0464b;
import p053g5.C1694m;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.v0 */
/* loaded from: classes.dex */
public final class C2782v0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f14775f;

    /* renamed from: g */
    public final /* synthetic */ C2784w0 f14776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2782v0(C2784w0 c2784w0, int i7) {
        super(0);
        this.f14775f = i7;
        this.f14776g = c2784w0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        long j6;
        switch (this.f14775f) {
            case 0:
                InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f14776g.f14788y.getValue();
                if (interfaceC3238v != null) {
                    j6 = interfaceC3238v.mo4927U(0L);
                } else {
                    j6 = 9205357640488583168L;
                }
                return new C0464b(j6);
            case 1:
                return new C0464b(this.f14776g.f14779A);
            default:
                this.f14776g.m4426M0();
                return C1694m.f10482a;
        }
    }
}
