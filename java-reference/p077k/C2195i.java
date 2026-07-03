package p077k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.i */
/* loaded from: classes.dex */
public final class C2195i implements Set, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f12682e;

    /* renamed from: f */
    public final C2194h0 f12683f;

    public C2195i(C2194h0 c2194h0, int i7) {
        this.f12682e = i7;
        switch (i7) {
            case 1:
                AbstractC3367j.m5100e(c2194h0, "parent");
                this.f12683f = c2194h0;
                return;
            default:
                AbstractC3367j.m5100e(c2194h0, "parent");
                this.f12683f = c2194h0;
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12682e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC3367j.m5096a(this.f12683f.m3592g(entry.getKey()), entry.getValue());
            default:
                return this.f12683f.m3588c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12682e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!AbstractC3367j.m5096a(this.f12683f.m3592g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC3367j.m5100e(collection, "elements");
                Collection collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    if (!this.f12683f.m3588c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12682e) {
            case 0:
                return this.f12683f.m3594i();
            default:
                return this.f12683f.m3594i();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12682e) {
            case 0:
                return AbstractC3393k.m5155z(new C2193h(this, null, 0));
            default:
                return AbstractC3393k.m5155z(new C2193h(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12682e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f12682e) {
            case 0:
                return this.f12683f.f12680e;
            default:
                return this.f12683f.f12680e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12682e) {
            case 0:
                return AbstractC3366i.m5094a(this);
            default:
                return AbstractC3366i.m5094a(this);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12682e) {
            case 0:
                AbstractC3367j.m5100e(objArr, "array");
                return AbstractC3366i.m5095b(this, objArr);
            default:
                AbstractC3367j.m5100e(objArr, "array");
                return AbstractC3366i.m5095b(this, objArr);
        }
    }
}
