package androidx.lifecycle;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class C0215u {

    /* renamed from: a */
    public EnumC0203o f877a;

    /* renamed from: b */
    public InterfaceC0209r f878b;

    /* renamed from: a */
    public final void m467a(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        EnumC0203o m463a = enumC0201n.m463a();
        EnumC0203o enumC0203o = this.f877a;
        AbstractC3367j.m5100e(enumC0203o, "state1");
        if (m463a.compareTo(enumC0203o) < 0) {
            enumC0203o = m463a;
        }
        this.f877a = enumC0203o;
        this.f878b.mo454c(interfaceC0213t, enumC0201n);
        this.f877a = m463a;
    }
}
