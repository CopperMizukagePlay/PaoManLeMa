package p002a1;

import p000a.AbstractC0000a;
import p001a0.C0019e1;
import p001a0.C0037j;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3546v;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a1.e */
/* loaded from: classes.dex */
public final class C0103e extends AbstractC3809q implements InterfaceC3487b2, InterfaceC3546v {

    /* renamed from: s */
    public C0103e f473s;

    /* renamed from: t */
    public C0103e f474t;

    /* renamed from: u */
    public long f475u;

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        this.f474t = null;
        this.f473s = null;
    }

    /* renamed from: K0 */
    public final boolean m199K0(C0019e1 c0019e1) {
        C0103e c0103e = this.f473s;
        if (c0103e == null) {
            C0103e c0103e2 = this.f474t;
            if (c0103e2 != null) {
                return c0103e2.m199K0(c0019e1);
            }
            return false;
        }
        return c0103e.m199K0(c0019e1);
    }

    /* renamed from: L0 */
    public final void m200L0(C0019e1 c0019e1) {
        C0103e c0103e = this.f474t;
        if (c0103e == null) {
            C0103e c0103e2 = this.f473s;
            if (c0103e2 != null) {
                c0103e2.m200L0(c0019e1);
                return;
            }
            return;
        }
        c0103e.m200L0(c0019e1);
    }

    /* renamed from: M0 */
    public final void m201M0(C0019e1 c0019e1) {
        C0103e c0103e = this.f474t;
        if (c0103e != null) {
            c0103e.m201M0(c0019e1);
        }
        C0103e c0103e2 = this.f473s;
        if (c0103e2 != null) {
            c0103e2.m201M0(c0019e1);
        }
        this.f473s = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u5.v] */
    /* renamed from: N0 */
    public final void m202N0(C0019e1 c0019e1) {
        InterfaceC3487b2 interfaceC3487b2;
        C0103e c0103e;
        C0103e c0103e2 = this.f473s;
        if (c0103e2 != null && AbstractC0000a.m6g(c0103e2, AbstractC2710c.m4350x(c0019e1))) {
            c0103e = c0103e2;
        } else {
            if (!this.f17992e.f18005r) {
                interfaceC3487b2 = null;
            } else {
                ?? obj = new Object();
                AbstractC3498f.m5386z(this, new C0037j((Object) obj, this, c0019e1, 3));
                interfaceC3487b2 = (InterfaceC3487b2) obj.f16451e;
            }
            c0103e = (C0103e) interfaceC3487b2;
        }
        if (c0103e != null && c0103e2 == null) {
            c0103e.m200L0(c0019e1);
            c0103e.m202N0(c0019e1);
            C0103e c0103e3 = this.f474t;
            if (c0103e3 != null) {
                c0103e3.m201M0(c0019e1);
            }
        } else if (c0103e == null && c0103e2 != null) {
            C0103e c0103e4 = this.f474t;
            if (c0103e4 != null) {
                c0103e4.m200L0(c0019e1);
                c0103e4.m202N0(c0019e1);
            }
            c0103e2.m201M0(c0019e1);
        } else if (!AbstractC3367j.m5096a(c0103e, c0103e2)) {
            if (c0103e != null) {
                c0103e.m200L0(c0019e1);
                c0103e.m202N0(c0019e1);
            }
            if (c0103e2 != null) {
                c0103e2.m201M0(c0019e1);
            }
        } else if (c0103e != null) {
            c0103e.m202N0(c0019e1);
        } else {
            C0103e c0103e5 = this.f474t;
            if (c0103e5 != null) {
                c0103e5.m202N0(c0019e1);
            }
        }
        this.f473s = c0103e;
    }

    /* renamed from: O0 */
    public final void m203O0(C0019e1 c0019e1) {
        C0103e c0103e = this.f474t;
        if (c0103e == null) {
            C0103e c0103e2 = this.f473s;
            if (c0103e2 != null) {
                c0103e2.m203O0(c0019e1);
                return;
            }
            return;
        }
        c0103e.m203O0(c0019e1);
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return C0101c.f470a;
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: r */
    public final void mo205r(long j6) {
        this.f475u = j6;
    }
}
