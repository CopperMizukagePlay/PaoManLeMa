package p152u;

import p001a0.C0005b;
import p031d5.C0512l;
import p039e5.C1054ld;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p160v.AbstractC3405d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.h */
/* loaded from: classes.dex */
public final class C3320h extends AbstractC3405d0 {

    /* renamed from: b */
    public final C0512l f16286b = new C0512l();

    public C3320h(InterfaceC3279c interfaceC3279c) {
        interfaceC3279c.mo23f(this);
    }

    /* renamed from: l */
    public static void m5052l(C3320h c3320h, String str, C3173d c3173d, int i7) {
        int i8 = 1;
        C0005b c0005b = null;
        if ((i7 & 1) != 0) {
            str = null;
        }
        C0512l c0512l = c3320h.f16286b;
        if (str != null) {
            c0005b = new C0005b(27, str);
        }
        c0512l.m1097a(1, new C3319g(c0005b, new C3324l(i8, 2), new C3173d(-1010194746, new C1054ld(1, c3173d), true)));
    }

    @Override // p160v.AbstractC3405d0
    /* renamed from: i */
    public final C0512l mo5053i() {
        return this.f16286b;
    }

    /* renamed from: m */
    public final void m5054m(int i7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, C3173d c3173d) {
        this.f16286b.m1097a(i7, new C3319g(interfaceC3279c, interfaceC3279c2, c3173d));
    }
}
