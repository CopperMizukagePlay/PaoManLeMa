package p063i0;

import p019c1.C0370n;
import p019c1.C0373q;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.v1 */
/* loaded from: classes.dex */
public final class C2020v1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f11945f = 1;

    /* renamed from: g */
    public final /* synthetic */ boolean f11946g;

    /* renamed from: h */
    public final /* synthetic */ Object f11947h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2020v1(InterfaceC3277a interfaceC3277a, boolean z7) {
        super(0);
        this.f11946g = z7;
        this.f11947h = (AbstractC3368k) interfaceC3277a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f11945f) {
            case 0:
                if (this.f11946g) {
                    C0373q c0373q = (C0373q) this.f11947h;
                    c0373q.getClass();
                    c0373q.m843a(new C0370n(1, 3));
                }
                return C1694m.f10482a;
            default:
                if (this.f11946g) {
                    ((AbstractC3368k) this.f11947h).mo52a();
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2020v1(boolean z7, C0373q c0373q) {
        super(0);
        this.f11946g = z7;
        this.f11947h = c0373q;
    }
}
