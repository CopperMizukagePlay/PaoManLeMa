package p102n1;

import android.view.KeyEvent;
import p150t5.InterfaceC3279c;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n1.e */
/* loaded from: classes.dex */
public final class C2712e extends AbstractC3809q implements InterfaceC2711d {

    /* renamed from: s */
    public InterfaceC3279c f14559s;

    /* renamed from: t */
    public InterfaceC3279c f14560t;

    @Override // p102n1.InterfaceC2711d
    /* renamed from: V */
    public final boolean mo4353V(KeyEvent keyEvent) {
        InterfaceC3279c interfaceC3279c = this.f14559s;
        if (interfaceC3279c != null) {
            return ((Boolean) interfaceC3279c.mo23f(new C2709b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p102n1.InterfaceC2711d
    /* renamed from: j */
    public final boolean mo4354j(KeyEvent keyEvent) {
        InterfaceC3279c interfaceC3279c = this.f14560t;
        if (interfaceC3279c != null) {
            return ((Boolean) interfaceC3279c.mo23f(new C2709b(keyEvent))).booleanValue();
        }
        return false;
    }
}
