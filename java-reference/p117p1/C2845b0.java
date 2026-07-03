package p117p1;

import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import p053g5.InterfaceC1684c;
import p082k5.InterfaceC2313c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.InterfaceC3363f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2845b0 implements PointerInputEventHandler, InterfaceC3363f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3281e f14937a;

    public C2845b0(InterfaceC3281e interfaceC3281e) {
        this.f14937a = interfaceC3281e;
    }

    @Override // p158u5.InterfaceC3363f
    /* renamed from: b */
    public final InterfaceC1684c mo3206b() {
        return this.f14937a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC3363f)) {
            return AbstractC3367j.m5096a(this.f14937a, ((InterfaceC3363f) obj).mo3206b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14937a.hashCode();
    }

    @Override // androidx.compose.p007ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC2872w interfaceC2872w, InterfaceC2313c interfaceC2313c) {
        return this.f14937a.mo22d(interfaceC2872w, interfaceC2313c);
    }
}
