package p018c0;

import p001a0.C0043k1;
import p034e0.C0622o0;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p162v1.AbstractC3497e1;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3516l;
import p162v1.InterfaceC3525o;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.t */
/* loaded from: classes.dex */
public final class C0350t extends AbstractC3809q implements InterfaceC3513k, InterfaceC3525o, InterfaceC3516l {

    /* renamed from: s */
    public C0335e f1171s;

    /* renamed from: t */
    public C0043k1 f1172t;

    /* renamed from: u */
    public C0622o0 f1173u;

    /* renamed from: v */
    public final C2361g1 f1174v = AbstractC2418w.m3980x(null);

    public C0350t(C0335e c0335e, C0043k1 c0043k1, C0622o0 c0622o0) {
        this.f1171s = c0335e;
        this.f1172t = c0043k1;
        this.f1173u = c0622o0;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        C0335e c0335e = this.f1171s;
        if (c0335e.f1153a == null) {
            c0335e.f1153a = this;
            return;
        }
        throw new IllegalStateException("Expected textInputModifierNode to be null");
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        this.f1171s.m692k(this);
    }

    @Override // p162v1.InterfaceC3525o
    /* renamed from: x */
    public final void mo790x(AbstractC3497e1 abstractC3497e1) {
        this.f1174v.setValue(abstractC3497e1);
    }
}
