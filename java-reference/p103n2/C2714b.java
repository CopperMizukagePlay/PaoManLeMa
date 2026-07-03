package p103n2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p060h5.C1813u;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n2.b */
/* loaded from: classes.dex */
public final class C2714b implements Collection, InterfaceC3594a {

    /* renamed from: g */
    public static final C2714b f14562g = new C2714b(C1813u.f10860e);

    /* renamed from: e */
    public final List f14563e;

    /* renamed from: f */
    public final int f14564f;

    public C2714b(List list) {
        this.f14563e = list;
        this.f14564f = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof C2713a)) {
            return false;
        }
        return this.f14563e.contains((C2713a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f14563e.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2714b)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f14563e, ((C2714b) obj).f14563e)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f14563e.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f14563e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f14563e.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f14564f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f14563e + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }
}
