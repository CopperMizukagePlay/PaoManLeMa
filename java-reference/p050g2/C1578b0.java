package p050g2;

import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.b0 */
/* loaded from: classes.dex */
public final class C1578b0 implements InterfaceC3279c {

    /* renamed from: e */
    public static final C1578b0 f10199e = new Object();

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        if (AbstractC3367j.m5096a(obj, Boolean.FALSE)) {
            return new C0677s(C0677s.f2209g);
        }
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C0677s(AbstractC0659i0.m1403c(((Integer) obj).intValue()));
    }
}
