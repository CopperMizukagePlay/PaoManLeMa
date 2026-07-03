package p085l0;

import p017c.C0320e;
import p032d6.C0584x;
import p032d6.InterfaceC0587y;
import p068i5.AbstractC2080d;
import p082k5.AbstractC2311a;
import p082k5.InterfaceC2318h;
import p169w0.C3645b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.x1 */
/* loaded from: classes.dex */
public final class C2423x1 extends AbstractC2311a implements InterfaceC0587y {

    /* renamed from: f */
    public final /* synthetic */ C3645b f13629f;

    /* renamed from: g */
    public final /* synthetic */ C2426y1 f13630g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2423x1(C3645b c3645b, C2426y1 c2426y1) {
        super(r0);
        C0584x c0584x = C0584x.f1938e;
        this.f13629f = c3645b;
        this.f13630g = c2426y1;
    }

    @Override // p032d6.InterfaceC0587y
    /* renamed from: q */
    public final void mo1248q(Throwable th, InterfaceC2318h interfaceC2318h) {
        C3645b c3645b = this.f13629f;
        C2426y1 c2426y1 = this.f13630g;
        AbstractC2080d.m3387O(th, new C0320e(29, c3645b, c2426y1));
        InterfaceC0587y interfaceC0587y = (InterfaceC0587y) c2426y1.f13633e.mo853h(C0584x.f1938e);
        if (interfaceC0587y != null) {
            interfaceC0587y.mo1248q(th, interfaceC2318h);
            return;
        }
        throw th;
    }
}
