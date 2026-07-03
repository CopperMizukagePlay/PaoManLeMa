package p034e0;

import p000a.AbstractC0000a;
import p010b1.C0265c;
import p027d1.C0467e;
import p035e1.C0666m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.i */
/* loaded from: classes.dex */
public final class C0609i extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ long f2006f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f2007g;

    /* renamed from: h */
    public final /* synthetic */ boolean f2008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609i(long j6, InterfaceC3277a interfaceC3277a, boolean z7) {
        super(1);
        this.f2006f = j6;
        this.f2007g = interfaceC3277a;
        this.f2008h = z7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0265c c0265c = (C0265c) obj;
        return c0265c.m558a(new C0607h(this.f2007g, this.f2008h, AbstractC0000a.m8i(c0265c, C0467e.m1026d(c0265c.f999e.mo550c()) / 2.0f), new C0666m(5, this.f2006f)));
    }
}
