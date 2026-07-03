package p009b0;

import androidx.compose.foundation.text.handwriting.AbstractC0163a;
import p001a0.C0062p0;
import p019c1.EnumC0376t;
import p019c1.InterfaceC0361e;
import p060h5.C1814v;
import p117p1.AbstractC2847c0;
import p117p1.C2849d0;
import p117p1.C2857h0;
import p117p1.C2859j;
import p117p1.EnumC2860k;
import p140s2.AbstractC3092b;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3277a;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3539s1;
import p162v1.InterfaceC3549w;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b0.c */
/* loaded from: classes.dex */
public final class C0261c extends AbstractC3519m implements InterfaceC3549w, InterfaceC3539s1, InterfaceC0361e {

    /* renamed from: u */
    public InterfaceC3277a f992u;

    /* renamed from: v */
    public boolean f993v;

    /* renamed from: w */
    public final C2857h0 f994w;

    public C0261c(InterfaceC3277a interfaceC3277a) {
        this.f992u = interfaceC3277a;
        C0062p0 c0062p0 = new C0062p0(this, null, 1);
        C2859j c2859j = AbstractC2847c0.f14941a;
        C2857h0 c2857h0 = new C2857h0(null, null, C2849d0.f14950a);
        c2857h0.f14983u = c0062p0;
        m5483K0(c2857h0);
        this.f994w = c2857h0;
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        this.f994w.mo545A(c2859j, enumC2860k, j6);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC0163a.f720a);
        int mo4513Q2 = interfaceC3223n0.mo4513Q(AbstractC0163a.f721b);
        int i7 = mo4513Q2 * 2;
        int i8 = mo4513Q * 2;
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4772i(i7, i8, j6));
        int i9 = mo4918e.f16054f - i8;
        return interfaceC3223n0.mo4941K(mo4918e.f16053e - i7, i9, C1814v.f10861e, new C0260b(mo4918e, mo4513Q2, mo4513Q, 0));
    }

    @Override // p019c1.InterfaceC0361e
    /* renamed from: h0 */
    public final void mo547h0(EnumC0376t enumC0376t) {
        this.f993v = enumC0376t.m844a();
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        this.f994w.mo548i0();
    }
}
