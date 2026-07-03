package p077k;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p015b6.C0303j;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.t0 */
/* loaded from: classes.dex */
public final class C2218t0 implements Collection, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f12746e = 1;

    /* renamed from: f */
    public final Object f12747f;

    public C2218t0() {
        int i7 = AbstractC2208o0.f12717a;
        this.f12747f = new C2188e0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2188e0) this.f12747f).m3574a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C2188e0) this.f12747f).m3575b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12746e) {
            case 0:
                return ((C2194h0) this.f12747f).m3589d(obj);
            default:
                return ((C2188e0) this.f12747f).m3576c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12746e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!((C2194h0) this.f12747f).m3589d(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((C2188e0) this.f12747f).m3576c(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12746e) {
            case 0:
                return ((C2194h0) this.f12747f).m3594i();
            default:
                if (((C2188e0) this.f12747f).f12647g == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12746e) {
            case 0:
                return AbstractC3393k.m5155z(new C2193h(this, null, 2));
            default:
                C2188e0 c2188e0 = (C2188e0) this.f12747f;
                c2188e0.getClass();
                return new C0303j(new C2192g0(c2188e0));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2188e0) this.f12747f).m3580g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2188e0) this.f12747f).m3580g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12746e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C2188e0) this.f12747f).m3582i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f12746e) {
            case 0:
                return ((C2194h0) this.f12747f).f12680e;
            default:
                return ((C2188e0) this.f12747f).f12647g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f12746e) {
            case 0:
                return AbstractC3366i.m5094a(this);
            default:
                return AbstractC3366i.m5094a(this);
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12746e) {
            case 0:
                AbstractC3367j.m5100e(objArr, "array");
                return AbstractC3366i.m5095b(this, objArr);
            default:
                return AbstractC3366i.m5095b(this, objArr);
        }
    }

    public C2218t0(C2194h0 c2194h0) {
        AbstractC3367j.m5100e(c2194h0, "parent");
        this.f12747f = c2194h0;
    }
}
