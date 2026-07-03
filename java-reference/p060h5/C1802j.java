package p060h5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.j */
/* loaded from: classes.dex */
public final class C1802j implements Collection, InterfaceC3594a {

    /* renamed from: e */
    public final Object[] f10853e;

    /* renamed from: f */
    public final boolean f10854f;

    public C1802j(Object[] objArr, boolean z7) {
        AbstractC3367j.m5100e(objArr, "values");
        this.f10853e = objArr;
        this.f10854f = z7;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1804l.m3012E(this.f10853e, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!AbstractC1804l.m3012E(this.f10853e, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f10853e.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC3367j.m5103h(this.f10853e);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10853e.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f10853e;
        AbstractC3367j.m5100e(objArr, "<this>");
        if (this.f10854f && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        return AbstractC3366i.m5095b(this, objArr);
    }
}
