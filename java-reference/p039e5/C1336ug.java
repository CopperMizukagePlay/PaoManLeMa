package p039e5;

import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import p015b6.C0310q;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p117p1.InterfaceC2872w;
import p122q.AbstractC2959x1;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ug */
/* loaded from: classes.dex */
public final class C1336ug implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3277a f7939a;

    public C1336ug(InterfaceC3277a interfaceC3277a) {
        this.f7939a = interfaceC3277a;
    }

    @Override // androidx.compose.p007ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2872w interfaceC2872w, InterfaceC2313c interfaceC2313c) {
        Object m4600d = AbstractC2959x1.m4600d(interfaceC2872w, new C0310q(8, this.f7939a), null, null, interfaceC2313c, 14);
        if (m4600d == EnumC2465a.f13750e) {
            return m4600d;
        }
        return C1694m.f10482a;
    }
}
