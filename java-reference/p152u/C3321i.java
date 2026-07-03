package p152u;

import p001a0.C0057o;
import p031d5.C0512l;
import p063i0.C1894f6;
import p085l0.C2395p;
import p085l0.C2405r1;
import p145t0.AbstractC3178i;
import p158u5.AbstractC3367j;
import p160v.AbstractC3405d0;
import p160v.C3412h;
import p160v.InterfaceC3413h0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.i */
/* loaded from: classes.dex */
public final class C3321i implements InterfaceC3413h0 {

    /* renamed from: a */
    public final C3330r f16287a;

    /* renamed from: b */
    public final C3320h f16288b;

    /* renamed from: c */
    public final C3315c f16289c;

    /* renamed from: d */
    public final C0512l f16290d;

    public C3321i(C3330r c3330r, C3320h c3320h, C3315c c3315c, C0512l c0512l) {
        this.f16287a = c3330r;
        this.f16288b = c3320h;
        this.f16289c = c3315c;
        this.f16290d = c0512l;
    }

    @Override // p160v.InterfaceC3413h0
    /* renamed from: a */
    public final int mo5055a() {
        return this.f16288b.mo5053i().f1835b;
    }

    @Override // p160v.InterfaceC3413h0
    /* renamed from: b */
    public final int mo5056b(Object obj) {
        return this.f16290d.mo1098b(obj);
    }

    @Override // p160v.InterfaceC3413h0
    /* renamed from: c */
    public final Object mo5057c(int i7) {
        Object m1101e = this.f16290d.m1101e(i7);
        if (m1101e == null) {
            return this.f16288b.m5175j(i7);
        }
        return m1101e;
    }

    @Override // p160v.InterfaceC3413h0
    /* renamed from: d */
    public final Object mo5058d(int i7) {
        C3412h m1100d = this.f16288b.f16286b.m1100d(i7);
        return m1100d.f16553c.mo5051a().mo23f(Integer.valueOf(i7 - m1100d.f16551a));
    }

    @Override // p160v.InterfaceC3413h0
    /* renamed from: e */
    public final void mo5059e(int i7, Object obj, C2395p c2395p, int i8) {
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-462424778);
        if (c2395p.m3866e(i7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i12 = i9 | i8;
        if (c2395p.m3874i(obj)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i12 | i10;
        if (c2395p.m3870g(this)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC3405d0.m5167b(obj, i7, this.f16287a.f16377r, AbstractC3178i.m4873d(-824725566, new C1894f6(i7, 1, this), c2395p), c2395p, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0057o(this, i7, obj, i8, 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3321i)) {
            return false;
        }
        return AbstractC3367j.m5096a(this.f16288b, ((C3321i) obj).f16288b);
    }

    public final int hashCode() {
        return this.f16288b.hashCode();
    }
}
