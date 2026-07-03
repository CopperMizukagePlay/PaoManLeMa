package p098m5;

import p082k5.InterfaceC2313c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3380w;
import p158u5.C3381x;
import p158u5.InterfaceC3364g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m5.j */
/* loaded from: classes.dex */
public abstract class AbstractC2590j extends AbstractC2583c implements InterfaceC3364g {

    /* renamed from: h */
    public final int f14007h;

    public AbstractC2590j(int i7, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f14007h = i7;
    }

    @Override // p158u5.InterfaceC3364g
    /* renamed from: b */
    public final int mo4120b() {
        return this.f14007h;
    }

    @Override // p098m5.AbstractC2581a
    public final String toString() {
        if (this.f13997e == null) {
            AbstractC3380w.f16452a.getClass();
            String m5109a = C3381x.m5109a(this);
            AbstractC3367j.m5099d(m5109a, "renderLambdaToString(...)");
            return m5109a;
        }
        return super.toString();
    }
}
