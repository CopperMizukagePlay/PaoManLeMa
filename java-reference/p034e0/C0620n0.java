package p034e0;

import p001a0.C0043k1;
import p001a0.C0064p2;
import p001a0.EnumC0088w0;
import p001a0.InterfaceC0071r1;
import p027d1.C0464b;
import p087l2.C2459w;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.n0 */
/* loaded from: classes.dex */
public final class C0620n0 implements InterfaceC0071r1 {

    /* renamed from: a */
    public final /* synthetic */ C0622o0 f2039a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2040b;

    public C0620n0(C0622o0 c0622o0, boolean z7) {
        this.f2039a = c0622o0;
        this.f2040b = z7;
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: a */
    public final void mo161a() {
        C0622o0 c0622o0 = this.f2039a;
        c0622o0.f2058o.setValue(null);
        c0622o0.f2059p.setValue(null);
        c0622o0.m1293p(true);
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: b */
    public final void mo162b() {
        C0622o0 c0622o0 = this.f2039a;
        c0622o0.f2058o.setValue(null);
        c0622o0.f2059p.setValue(null);
        c0622o0.m1293p(true);
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: d */
    public final void mo164d() {
        EnumC0088w0 enumC0088w0;
        C0064p2 m120d;
        boolean z7 = this.f2040b;
        if (z7) {
            enumC0088w0 = EnumC0088w0.f406f;
        } else {
            enumC0088w0 = EnumC0088w0.f407g;
        }
        C0622o0 c0622o0 = this.f2039a;
        c0622o0.f2058o.setValue(enumC0088w0);
        long m1286i = c0622o0.m1286i(z7);
        float f7 = AbstractC0641z.f2120a;
        long m5797a = AbstractC3784a.m5797a(C0464b.m1008d(m1286i), C0464b.m1009e(m1286i) - 1.0f);
        C0043k1 c0043k1 = c0622o0.f2047d;
        if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
            long m130e = m120d.m130e(m5797a);
            c0622o0.f2055l = m130e;
            c0622o0.f2059p.setValue(new C0464b(m130e));
            c0622o0.f2057n = 0L;
            c0622o0.f2060q = -1;
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.f227q.setValue(Boolean.TRUE);
            }
            c0622o0.m1293p(false);
        }
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: e */
    public final void mo165e(long j6) {
        C0622o0 c0622o0 = this.f2039a;
        long m1011g = C0464b.m1011g(c0622o0.f2057n, j6);
        c0622o0.f2057n = m1011g;
        c0622o0.f2059p.setValue(new C0464b(C0464b.m1011g(c0622o0.f2055l, m1011g)));
        C2459w m1287j = c0622o0.m1287j();
        C0464b m1284g = c0622o0.m1284g();
        AbstractC3367j.m5097b(m1284g);
        C0622o0.m1278a(c0622o0, m1287j, m1284g.f1623a, false, this.f2040b, C0627r.f2077g, true);
        c0622o0.m1293p(false);
    }

    @Override // p001a0.InterfaceC0071r1
    public final void onCancel() {
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: c */
    public final void mo163c(long j6) {
    }
}
