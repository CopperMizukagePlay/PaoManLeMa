package p001a0;

import java.util.List;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1604o0;
import p050g2.C1609r;
import p060h5.C1813u;
import p080k2.InterfaceC2293d;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.q1 */
/* loaded from: classes.dex */
public final class C0067q1 {

    /* renamed from: a */
    public final C1587g f332a;

    /* renamed from: b */
    public final C1604o0 f333b;

    /* renamed from: e */
    public final boolean f336e;

    /* renamed from: g */
    public final InterfaceC3093c f338g;

    /* renamed from: h */
    public final InterfaceC2293d f339h;

    /* renamed from: j */
    public C1609r f341j;

    /* renamed from: k */
    public EnumC3103m f342k;

    /* renamed from: c */
    public final int f334c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f335d = 1;

    /* renamed from: f */
    public final int f337f = 1;

    /* renamed from: i */
    public final List f340i = C1813u.f10860e;

    public C0067q1(C1587g c1587g, C1604o0 c1604o0, boolean z7, InterfaceC3093c interfaceC3093c, InterfaceC2293d interfaceC2293d, int i7) {
        this.f332a = c1587g;
        this.f333b = c1604o0;
        this.f336e = z7;
        this.f338g = interfaceC3093c;
        this.f339h = interfaceC2293d;
    }

    /* renamed from: a */
    public final void m131a(EnumC3103m enumC3103m) {
        C1609r c1609r = this.f341j;
        if (c1609r == null || enumC3103m != this.f342k || c1609r.mo2608b()) {
            this.f342k = enumC3103m;
            c1609r = new C1609r(this.f332a, AbstractC1586f0.m2564h(this.f333b, enumC3103m), this.f340i, this.f338g, this.f339h);
        }
        this.f341j = c1609r;
    }
}
