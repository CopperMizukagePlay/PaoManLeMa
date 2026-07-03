package p183y0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import p053g5.C1694m;
import p100n.C2673p1;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C3833b extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ C3834c f18043f;

    /* renamed from: g */
    public final /* synthetic */ int f18044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3833b(C3834c c3834c, int i7) {
        super(4);
        this.f18043f = c3834c;
        this.f18044g = i7;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C3834c c3834c = this.f18043f;
        C2673p1 c2673p1 = c3834c.f18045a;
        ((AutofillManager) c2673p1.f14390f).notifyViewEntered(c3834c.f18047c, this.f18044g, new Rect(intValue, intValue2, intValue3, intValue4));
        return C1694m.f10482a;
    }
}
