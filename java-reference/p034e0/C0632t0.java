package p034e0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import p053g5.C1694m;
import p067i4.AbstractC2072e;
import p085l0.InterfaceC2425y0;
import p107o.AbstractC2786x0;
import p107o.C2751j1;
import p140s2.C3098h;
import p140s2.C3102l;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.t0 */
/* loaded from: classes.dex */
public final class C0632t0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f2092f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3093c f2093g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f2094h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0632t0(InterfaceC3093c interfaceC3093c, InterfaceC2425y0 interfaceC2425y0, int i7) {
        super(1);
        this.f2092f = i7;
        this.f2093g = interfaceC3093c;
        this.f2094h = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C2751j1 c2751j1;
        switch (this.f2092f) {
            case 0:
                long j6 = ((C3098h) obj).f15695a;
                float m4780b = C3098h.m4780b(j6);
                InterfaceC3093c interfaceC3093c = this.f2093g;
                this.f2094h.setValue(new C3102l(AbstractC2072e.m3326b(interfaceC3093c.mo4513Q(m4780b), interfaceC3093c.mo4513Q(C3098h.m4779a(j6)))));
                return C1694m.f10482a;
            default:
                C0630s0 c0630s0 = new C0630s0(0, (InterfaceC3277a) obj);
                C0632t0 c0632t0 = new C0632t0(this.f2093g, this.f2094h, 0);
                if (AbstractC2786x0.m4428a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        c2751j1 = C2751j1.f14690b;
                    } else {
                        c2751j1 = C2751j1.f14691c;
                    }
                    if (AbstractC2786x0.m4428a()) {
                        return new MagnifierElement(c0630s0, c0632t0, c2751j1);
                    }
                    return C3807o.f17991a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
