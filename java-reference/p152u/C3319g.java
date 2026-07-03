package p152u;

import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p160v.InterfaceC3438u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.g */
/* loaded from: classes.dex */
public final class C3319g implements InterfaceC3438u {

    /* renamed from: a */
    public final InterfaceC3279c f16283a;

    /* renamed from: b */
    public final AbstractC3368k f16284b;

    /* renamed from: c */
    public final C3173d f16285c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3319g(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, C3173d c3173d) {
        this.f16283a = interfaceC3279c;
        this.f16284b = (AbstractC3368k) interfaceC3279c2;
        this.f16285c = c3173d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.c, u5.k] */
    @Override // p160v.InterfaceC3438u
    /* renamed from: a */
    public final InterfaceC3279c mo5051a() {
        return this.f16284b;
    }

    @Override // p160v.InterfaceC3438u
    public final InterfaceC3279c getKey() {
        return this.f16283a;
    }
}
