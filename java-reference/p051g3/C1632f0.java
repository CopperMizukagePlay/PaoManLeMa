package p051g3;

import android.view.WindowInsets;
import p012b3.C0274b;
import p035e1.AbstractC0642a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.f0 */
/* loaded from: classes.dex */
public class C1632f0 extends AbstractC1644l0 {

    /* renamed from: e */
    public final WindowInsets.Builder f10383e;

    public C1632f0() {
        this.f10383e = AbstractC0642a.m1308g();
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: b */
    public C1672z0 mo2641b() {
        WindowInsets build;
        m2652a();
        build = this.f10383e.build();
        C1672z0 m2741c = C1672z0.m2741c(null, build);
        C0274b[] c0274bArr = this.f10396b;
        C1664v0 c1664v0 = m2741c.f10450a;
        c1664v0.mo2680w(c0274bArr);
        c1664v0.mo2679v(null);
        c1664v0.mo2663B(this.f10397c);
        c1664v0.mo2664C(this.f10398d);
        return m2741c;
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: e */
    public void mo2645e(C0274b c0274b) {
        this.f10383e.setMandatorySystemGestureInsets(c0274b.m583d());
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: f */
    public void mo2642f(C0274b c0274b) {
        this.f10383e.setStableInsets(c0274b.m583d());
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: g */
    public void mo2646g(C0274b c0274b) {
        this.f10383e.setSystemGestureInsets(c0274b.m583d());
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: h */
    public void mo2643h(C0274b c0274b) {
        this.f10383e.setSystemWindowInsets(c0274b.m583d());
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: i */
    public void mo2647i(C0274b c0274b) {
        this.f10383e.setTappableElementInsets(c0274b.m583d());
    }

    public C1632f0(C1672z0 c1672z0) {
        super(c1672z0);
        WindowInsets.Builder m1308g;
        WindowInsets m2742b = c1672z0.m2742b();
        if (m2742b != null) {
            m1308g = AbstractC0642a.m1309h(m2742b);
        } else {
            m1308g = AbstractC0642a.m1308g();
        }
        this.f10383e = m1308g;
    }
}
