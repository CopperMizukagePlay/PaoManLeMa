package p068i5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import p060h5.AbstractC1800h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.k */
/* loaded from: classes.dex */
public final class C2087k extends AbstractC1800h implements Serializable {

    /* renamed from: f */
    public static final C2087k f12338f;

    /* renamed from: e */
    public final C2084h f12339e;

    static {
        C2084h c2084h = C2084h.f12320r;
        f12338f = new C2087k(C2084h.f12320r);
    }

    public C2087k(C2084h c2084h) {
        AbstractC3367j.m5100e(c2084h, "backing");
        this.f12339e = c2084h;
    }

    @Override // p060h5.AbstractC1800h
    /* renamed from: a */
    public final int mo3001a() {
        return this.f12339e.f12329m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f12339e.m3418a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        this.f12339e.m3420c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12339e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12339e.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12339e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2084h c2084h = this.f12339e;
        c2084h.getClass();
        return new C2081e(c2084h, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2084h c2084h = this.f12339e;
        c2084h.m3420c();
        int m3425h = c2084h.m3425h(obj);
        if (m3425h < 0) {
            return false;
        }
        c2084h.m3429l(m3425h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        this.f12339e.m3420c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        this.f12339e.m3420c();
        return super.retainAll(collection);
    }

    public C2087k() {
        this(new C2084h());
    }
}
