package p170w1;

import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import com.paoman.lema.R;
import p085l0.C2415v;
import p085l0.InterfaceC2403r;
import p100n.C2649h1;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.t2 */
/* loaded from: classes.dex */
public final class C3731t2 implements InterfaceC2403r, InterfaceC0209r {

    /* renamed from: e */
    public final C3728t f17785e;

    /* renamed from: f */
    public final C2415v f17786f;

    /* renamed from: g */
    public boolean f17787g;

    /* renamed from: h */
    public C0216v f17788h;

    /* renamed from: i */
    public InterfaceC3281e f17789i = AbstractC3666d1.f17502a;

    public C3731t2(C3728t c3728t, C2415v c2415v) {
        this.f17785e = c3728t;
        this.f17786f = c2415v;
    }

    /* renamed from: a */
    public final void m5752a() {
        if (!this.f17787g) {
            this.f17787g = true;
            this.f17785e.getView().setTag(R.id.wrapped_composition_tag, null);
            C0216v c0216v = this.f17788h;
            if (c0216v != null) {
                c0216v.m473f(this);
            }
        }
        this.f17786f.m3938l();
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        if (enumC0201n == EnumC0201n.ON_DESTROY) {
            m5752a();
        } else if (enumC0201n == EnumC0201n.ON_CREATE && !this.f17787g) {
            m5753e(this.f17789i);
        }
    }

    /* renamed from: e */
    public final void m5753e(InterfaceC3281e interfaceC3281e) {
        this.f17785e.setOnViewTreeOwnersAvailable(new C2649h1(24, this, interfaceC3281e));
    }
}
