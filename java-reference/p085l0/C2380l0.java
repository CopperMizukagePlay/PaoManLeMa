package p085l0;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.l0 */
/* loaded from: classes.dex */
public final class C2380l0 implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f13433e = 0;

    /* renamed from: f */
    public final C2338a2 f13434f;

    /* renamed from: g */
    public final int f13435g;

    /* renamed from: h */
    public int f13436h;

    /* renamed from: i */
    public int f13437i;

    public C2380l0(C2338a2 c2338a2, int i7, int i8) {
        this.f13434f = c2338a2;
        this.f13435g = i8;
        this.f13436h = i7;
        this.f13437i = c2338a2.f13336l;
        if (c2338a2.f13335k) {
            AbstractC2346c2.m3736f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13433e) {
            case 0:
                if (this.f13436h < this.f13435g) {
                    return true;
                }
                return false;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13433e) {
            case 0:
                C2338a2 c2338a2 = this.f13434f;
                int i7 = c2338a2.f13336l;
                int i8 = this.f13437i;
                if (i7 != i8) {
                    AbstractC2346c2.m3736f();
                }
                int i9 = this.f13436h;
                this.f13436h = AbstractC2346c2.m3731a(c2338a2.f13329e, i9) + i9;
                return new C2342b2(c2338a2, i9, i8);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13433e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2380l0(C2338a2 c2338a2, int i7, AbstractC2384m0 abstractC2384m0, AbstractC2418w abstractC2418w) {
        this.f13434f = c2338a2;
        this.f13435g = i7;
        this.f13436h = c2338a2.f13336l;
    }
}
