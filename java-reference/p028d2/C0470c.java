package p028d2;

import p150t5.InterfaceC3279c;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.c */
/* loaded from: classes.dex */
public final class C0470c extends AbstractC3809q implements InterfaceC3551w1 {

    /* renamed from: s */
    public boolean f1642s;

    /* renamed from: t */
    public final boolean f1643t;

    /* renamed from: u */
    public InterfaceC3279c f1644u;

    public C0470c(InterfaceC3279c interfaceC3279c, boolean z7, boolean z8) {
        this.f1642s = z7;
        this.f1643t = z8;
        this.f1644u = interfaceC3279c;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: k0 */
    public final boolean mo1029k0() {
        return this.f1643t;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: m0 */
    public final boolean mo1030m0() {
        return this.f1642s;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        this.f1644u.mo23f(c0477j);
    }
}
