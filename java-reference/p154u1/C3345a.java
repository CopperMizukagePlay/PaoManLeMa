package p154u1;

import p067i4.AbstractC2072e;
import p139s1.AbstractC3088a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u1.a */
/* loaded from: classes.dex */
public final class C3345a extends AbstractC2072e {

    /* renamed from: a */
    public InterfaceC3350f f16407a;

    @Override // p067i4.AbstractC2072e
    /* renamed from: f */
    public final boolean mo3349f(C3352h c3352h) {
        if (c3352h == this.f16407a.getKey()) {
            return true;
        }
        return false;
    }

    @Override // p067i4.AbstractC2072e
    /* renamed from: k */
    public final Object mo3350k(C3352h c3352h) {
        if (c3352h != this.f16407a.getKey()) {
            AbstractC3088a.m4750b("Check failed.");
        }
        return this.f16407a.getValue();
    }
}
