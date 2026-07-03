package p063i0;

import p019c1.C0377u;
import p053g5.C1694m;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.g4 */
/* loaded from: classes.dex */
public final class C1901g4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11233f;

    /* renamed from: g */
    public final /* synthetic */ Object f11234g;

    /* renamed from: h */
    public final /* synthetic */ int f11235h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1901g4(int i7, int i8, Object obj) {
        super(1);
        this.f11233f = i8;
        this.f11234g = obj;
        this.f11235h = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f11233f) {
            case 0:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, (AbstractC3239v0) this.f11234g, 0, -this.f11235h);
                return C1694m.f10482a;
            case 1:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, (AbstractC3239v0) this.f11234g, -this.f11235h, 0);
                return C1694m.f10482a;
            default:
                C3379v c3379v = (C3379v) this.f11234g;
                Boolean valueOf = Boolean.valueOf(((C0377u) obj).m849O0(this.f11235h));
                c3379v.f16451e = valueOf;
                return valueOf;
        }
    }
}
