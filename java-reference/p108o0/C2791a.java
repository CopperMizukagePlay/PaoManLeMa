package p108o0;

import java.util.List;
import p060h5.AbstractC1797e;
import p065i2.AbstractC2064e;
import p116p0.AbstractC2834c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C2791a extends AbstractC1797e {

    /* renamed from: e */
    public final AbstractC2834c f14802e;

    /* renamed from: f */
    public final int f14803f;

    /* renamed from: g */
    public final int f14804g;

    public C2791a(AbstractC2834c abstractC2834c, int i7, int i8) {
        this.f14802e = abstractC2834c;
        this.f14803f = i7;
        AbstractC2064e.m3241n(i7, i8, abstractC2834c.mo299a());
        this.f14804g = i8 - i7;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f14804g;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC2064e.m3239l(i7, this.f14804g);
        return this.f14802e.get(this.f14803f + i7);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final List subList(int i7, int i8) {
        AbstractC2064e.m3241n(i7, i8, this.f14804g);
        int i9 = this.f14803f;
        return new C2791a(this.f14802e, i7 + i9, i9 + i8);
    }
}
