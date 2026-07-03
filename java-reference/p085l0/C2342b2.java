package p085l0;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.b2 */
/* loaded from: classes.dex */
public final class C2342b2 implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final C2338a2 f13342e;

    /* renamed from: f */
    public final int f13343f;

    /* renamed from: g */
    public final int f13344g;

    public C2342b2(C2338a2 c2338a2, int i7, int i8) {
        this.f13342e = c2338a2;
        this.f13343f = i7;
        this.f13344g = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2338a2 c2338a2 = this.f13342e;
        if (c2338a2.f13336l != this.f13344g) {
            AbstractC2346c2.m3736f();
        }
        int i7 = this.f13343f;
        c2338a2.m3723f(i7);
        return new C2380l0(c2338a2, i7 + 1, AbstractC2346c2.m3731a(c2338a2.f13329e, i7) + i7);
    }
}
