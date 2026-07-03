package p160v;

import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2361g1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.l0 */
/* loaded from: classes.dex */
public final class C3421l0 {

    /* renamed from: a */
    public final Object f16587a;

    /* renamed from: b */
    public final C3425n0 f16588b;

    /* renamed from: c */
    public final C2349d1 f16589c = new C2349d1(-1);

    /* renamed from: d */
    public final C2349d1 f16590d = new C2349d1(0);

    /* renamed from: e */
    public final C2361g1 f16591e = AbstractC2418w.m3980x(null);

    /* renamed from: f */
    public final C2361g1 f16592f = AbstractC2418w.m3980x(null);

    public C3421l0(Object obj, C3425n0 c3425n0) {
        this.f16587a = obj;
        this.f16588b = c3425n0;
    }

    /* renamed from: a */
    public final C3421l0 m5182a() {
        C2349d1 c2349d1 = this.f16590d;
        if (c2349d1.m3741g() == 0) {
            this.f16588b.f16598e.add(this);
            C3421l0 c3421l0 = (C3421l0) this.f16592f.getValue();
            if (c3421l0 != null) {
                c3421l0.m5182a();
            } else {
                c3421l0 = null;
            }
            this.f16591e.setValue(c3421l0);
        }
        c2349d1.m3742h(c2349d1.m3741g() + 1);
        return this;
    }

    /* renamed from: b */
    public final void m5183b() {
        C2349d1 c2349d1 = this.f16590d;
        if (c2349d1.m3741g() > 0) {
            c2349d1.m3742h(c2349d1.m3741g() - 1);
            if (c2349d1.m3741g() == 0) {
                this.f16588b.f16598e.remove(this);
                C2361g1 c2361g1 = this.f16591e;
                C3421l0 c3421l0 = (C3421l0) c2361g1.getValue();
                if (c3421l0 != null) {
                    c3421l0.m5183b();
                }
                c2361g1.setValue(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once");
    }
}
