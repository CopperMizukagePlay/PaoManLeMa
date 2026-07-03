package p056h0;

import android.view.ViewGroup;
import java.util.LinkedHashMap;
import p001a0.C0053n;
import p001a0.C0065q;
import p001a0.C0068q2;
import p035e1.AbstractC0646c;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.C1568b;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.InterfaceC2417v1;
import p085l0.InterfaceC2425y0;
import p107o.InterfaceC2771q0;
import p162v1.C3508i0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C1727a implements InterfaceC2417v1, InterfaceC1739m, InterfaceC2771q0 {

    /* renamed from: e */
    public final boolean f10571e;

    /* renamed from: f */
    public final C1748v f10572f;

    /* renamed from: g */
    public final boolean f10573g;

    /* renamed from: h */
    public final float f10574h;

    /* renamed from: i */
    public final InterfaceC2425y0 f10575i;

    /* renamed from: j */
    public final InterfaceC2425y0 f10576j;

    /* renamed from: k */
    public final ViewGroup f10577k;

    /* renamed from: l */
    public C1738l f10578l;

    /* renamed from: m */
    public final C2361g1 f10579m = AbstractC2418w.m3980x(null);

    /* renamed from: n */
    public final C2361g1 f10580n = AbstractC2418w.m3980x(Boolean.TRUE);

    /* renamed from: o */
    public long f10581o = 0;

    /* renamed from: p */
    public int f10582p = -1;

    /* renamed from: q */
    public final C0053n f10583q = new C0053n(8, this);

    public C1727a(boolean z7, float f7, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, ViewGroup viewGroup) {
        this.f10571e = z7;
        this.f10572f = new C1748v(new C0065q(interfaceC2425y02, 1), z7);
        this.f10573g = z7;
        this.f10574h = f7;
        this.f10575i = interfaceC2425y0;
        this.f10576j = interfaceC2425y02;
        this.f10577k = viewGroup;
    }

    @Override // p107o.InterfaceC2771q0
    /* renamed from: a */
    public final void mo2778a(C3508i0 c3508i0) {
        int mo4513Q;
        float mo4526y;
        C1568b c1568b = c3508i0.f16933e;
        this.f10581o = c1568b.mo2546c();
        float f7 = this.f10574h;
        if (Float.isNaN(f7)) {
            mo4513Q = AbstractC3784a.m5794D(AbstractC1737k.m2790a(c3508i0, this.f10573g, c1568b.mo2546c()));
        } else {
            mo4513Q = c1568b.mo4513Q(f7);
        }
        this.f10582p = mo4513Q;
        long j6 = ((C0677s) this.f10575i.getValue()).f2211a;
        float f8 = ((C1732f) this.f10576j.getValue()).f10594d;
        c3508i0.m5460a();
        if (Float.isNaN(f7)) {
            mo4526y = AbstractC1737k.m2790a(c3508i0, this.f10571e, c1568b.mo2546c());
        } else {
            mo4526y = c3508i0.mo4526y(f7);
        }
        this.f10572f.m2800a(c3508i0, mo4526y, j6);
        InterfaceC0674q m106u = c1568b.f10182f.m106u();
        ((Boolean) this.f10580n.getValue()).booleanValue();
        C1740n c1740n = (C1740n) this.f10579m.getValue();
        if (c1740n != null) {
            c1740n.m2796e(c1568b.mo2546c(), j6, f8);
            c1740n.draw(AbstractC0646c.m1349a(m106u));
        }
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: g */
    public final void mo2780g() {
        C1738l c1738l = this.f10578l;
        if (c1738l != null) {
            mo2782l0();
            C0068q2 c0068q2 = c1738l.f10620h;
            C1740n c1740n = (C1740n) ((LinkedHashMap) c0068q2.f344f).get(this);
            if (c1740n != null) {
                c1740n.m2794c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0068q2.f344f;
                C1740n c1740n2 = (C1740n) linkedHashMap.get(this);
                if (c1740n2 != null) {
                }
                linkedHashMap.remove(this);
                c1738l.f10619g.add(c1740n);
            }
        }
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: j */
    public final void mo2781j() {
        C1738l c1738l = this.f10578l;
        if (c1738l != null) {
            mo2782l0();
            C0068q2 c0068q2 = c1738l.f10620h;
            C1740n c1740n = (C1740n) ((LinkedHashMap) c0068q2.f344f).get(this);
            if (c1740n != null) {
                c1740n.m2794c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0068q2.f344f;
                C1740n c1740n2 = (C1740n) linkedHashMap.get(this);
                if (c1740n2 != null) {
                }
                linkedHashMap.remove(this);
                c1738l.f10619g.add(c1740n);
            }
        }
    }

    @Override // p056h0.InterfaceC1739m
    /* renamed from: l0 */
    public final void mo2782l0() {
        this.f10579m.setValue(null);
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: e */
    public final void mo2779e() {
    }
}
