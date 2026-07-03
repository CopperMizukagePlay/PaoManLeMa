package p085l0;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.m2 */
/* loaded from: classes.dex */
public final class C2386m2 implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final C2338a2 f13448e;

    /* renamed from: f */
    public final int f13449f;

    /* renamed from: g */
    public final C2339b f13450g;

    public C2386m2(C2338a2 c2338a2, int i7, AbstractC2384m0 abstractC2384m0, C2339b c2339b) {
        this.f13448e = c2338a2;
        this.f13449f = i7;
        this.f13450g = c2339b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2380l0(this.f13448e, this.f13449f, null, this.f13450g);
    }
}
