package p171w2;

import android.os.Handler;
import android.os.Looper;
import p053g5.C1694m;
import p140s2.C3102l;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p163v2.RunnableC3561a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.g */
/* loaded from: classes.dex */
public final class C3757g extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f17842f;

    /* renamed from: g */
    public final /* synthetic */ C3771u f17843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3757g(C3771u c3771u, int i7) {
        super(1);
        this.f17842f = i7;
        this.f17843g = c3771u;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        Looper looper;
        switch (this.f17842f) {
            case 0:
                InterfaceC3238v mo4935o = ((InterfaceC3238v) obj).mo4935o();
                AbstractC3367j.m5097b(mo4935o);
                this.f17843g.m5773l(mo4935o);
                return C1694m.f10482a;
            case 1:
                C3102l c3102l = new C3102l(((C3102l) obj).f15702a);
                C3771u c3771u = this.f17843g;
                c3771u.m5920setPopupContentSizefhxjrPA(c3102l);
                c3771u.m5774m();
                return C1694m.f10482a;
            default:
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) obj;
                C3771u c3771u2 = this.f17843g;
                Handler handler = c3771u2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    interfaceC3277a.mo52a();
                } else {
                    Handler handler2 = c3771u2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC3561a(3, interfaceC3277a));
                    }
                }
                return C1694m.f10482a;
        }
    }
}
