package p169w0;

import java.util.List;
import p068i5.AbstractC2080d;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p085l0.C2395p;
import p093m0.InterfaceC2528i0;
import p147t2.C3250c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C3645b implements InterfaceC2528i0, InterfaceC2316f {

    /* renamed from: f */
    public static final C3250c f17421f = new C3250c(7);

    /* renamed from: e */
    public final C2395p f17422e;

    public C3645b(C2395p c2395p) {
        this.f17422e = c2395p;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        return interfaceC3281e.mo22d(obj, this);
    }

    @Override // p082k5.InterfaceC2316f
    public final InterfaceC2317g getKey() {
        return f17421f;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3401n(this, interfaceC2317g);
    }

    @Override // p093m0.InterfaceC2528i0
    /* renamed from: i */
    public final List mo145i(Integer num) {
        return this.f17422e.m3840H();
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3411x(this, interfaceC2317g);
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        return AbstractC2080d.m3374B(this, interfaceC2318h);
    }
}
