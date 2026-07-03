package androidx.lifecycle;

import p008b.C0231f;
import p158u5.AbstractC3367j;
import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public final class C0190h0 implements InterfaceC0209r, AutoCloseable {

    /* renamed from: e */
    public final String f843e;

    /* renamed from: f */
    public final C0188g0 f844f;

    /* renamed from: g */
    public boolean f845g;

    public C0190h0(String str, C0188g0 c0188g0) {
        this.f843e = str;
        this.f844f = c0188g0;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        if (enumC0201n == EnumC0201n.ON_DESTROY) {
            this.f845g = false;
            interfaceC0213t.mo415g().m473f(this);
        }
    }

    /* renamed from: h */
    public final void m455h(C0216v c0216v, C3781e c3781e) {
        AbstractC3367j.m5100e(c3781e, "registry");
        AbstractC3367j.m5100e(c0216v, "lifecycle");
        if (!this.f845g) {
            this.f845g = true;
            c0216v.m468a(this);
            c3781e.m5787l(this.f843e, (C0231f) this.f844f.f842a.f10324a);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
