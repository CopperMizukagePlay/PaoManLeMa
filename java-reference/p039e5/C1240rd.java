package p039e5;

import p023c5.C0410b;
import p023c5.C0420l;
import p023c5.InterfaceC0409a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rd */
/* loaded from: classes.dex */
public final class C1240rd implements InterfaceC0409a {

    /* renamed from: e */
    public final /* synthetic */ C0420l f7315e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f7316f;

    public C1240rd(C0420l c0420l, InterfaceC3279c interfaceC3279c) {
        this.f7315e = c0420l;
        this.f7316f = interfaceC3279c;
    }

    @Override // p023c5.InterfaceC0409a
    /* renamed from: c */
    public final void mo32c(C0410b c0410b) {
        this.f7315e.f1521e.m977g();
        String str = c0410b.f1392a.f1371a;
        AbstractC3367j.m5099d(str, "getText(...)");
        this.f7316f.mo23f(str);
    }
}
