package p085l0;

import p039e5.C1036kq;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.a0 */
/* loaded from: classes.dex */
public final class C2336a0 extends AbstractC2397p1 {

    /* renamed from: b */
    public final /* synthetic */ int f13326b = 1;

    /* renamed from: c */
    public final Object f13327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336a0(InterfaceC3277a interfaceC3277a) {
        super(interfaceC3277a);
        C2413u0 c2413u0 = C2413u0.f13575j;
        this.f13327c = c2413u0;
    }

    @Override // p085l0.AbstractC2397p1
    /* renamed from: a */
    public final C2401q1 mo3716a(Object obj) {
        boolean z7;
        boolean z8;
        switch (this.f13326b) {
            case 0:
                if (obj == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return new C2401q1(this, obj, z7, null, true);
            default:
                if (obj == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return new C2401q1(this, obj, z8, (InterfaceC2370i2) this.f13327c, true);
        }
    }

    @Override // p085l0.AbstractC2397p1
    /* renamed from: b */
    public InterfaceC2402q2 mo3717b() {
        switch (this.f13326b) {
            case 0:
                return (C2340b0) this.f13327c;
            default:
                return super.mo3717b();
        }
    }

    public C2336a0(InterfaceC3279c interfaceC3279c) {
        super(new C1036kq(6));
        this.f13327c = new C2340b0(interfaceC3279c);
    }
}
