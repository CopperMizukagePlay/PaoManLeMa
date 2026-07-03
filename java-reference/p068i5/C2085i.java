package p068i5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p060h5.AbstractC1800h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.i */
/* loaded from: classes.dex */
public final class C2085i extends AbstractC1800h {

    /* renamed from: e */
    public final /* synthetic */ int f12334e;

    /* renamed from: f */
    public final C2084h f12335f;

    public /* synthetic */ C2085i(C2084h c2084h, int i7) {
        this.f12334e = i7;
        this.f12335f = c2084h;
    }

    @Override // p060h5.AbstractC1800h
    /* renamed from: a */
    public final int mo3001a() {
        switch (this.f12334e) {
            case 0:
                return this.f12335f.f12329m;
            default:
                return this.f12335f.f12329m;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f12334e) {
            case 0:
                AbstractC3367j.m5100e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f12334e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC3367j.m5100e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f12334e) {
            case 0:
                this.f12335f.clear();
                return;
            default:
                this.f12335f.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f12334e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f12335f.m3423f((Map.Entry) obj);
            default:
                return this.f12335f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f12334e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                return this.f12335f.m3422e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f12334e) {
            case 0:
                return this.f12335f.isEmpty();
            default:
                return this.f12335f.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12334e) {
            case 0:
                C2084h c2084h = this.f12335f;
                c2084h.getClass();
                return new C2081e(c2084h, 0);
            default:
                C2084h c2084h2 = this.f12335f;
                c2084h2.getClass();
                return new C2081e(c2084h2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f12334e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C2084h c2084h = this.f12335f;
                c2084h.getClass();
                c2084h.m3420c();
                int m3425h = c2084h.m3425h(entry.getKey());
                if (m3425h < 0) {
                    return false;
                }
                Object[] objArr = c2084h.f12322f;
                AbstractC3367j.m5097b(objArr);
                if (!AbstractC3367j.m5096a(objArr[m3425h], entry.getValue())) {
                    return false;
                }
                c2084h.m3429l(m3425h);
                return true;
            default:
                C2084h c2084h2 = this.f12335f;
                c2084h2.m3420c();
                int m3425h2 = c2084h2.m3425h(obj);
                if (m3425h2 < 0) {
                    return false;
                }
                c2084h2.m3429l(m3425h2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f12334e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                this.f12335f.m3420c();
                return super.removeAll(collection);
            default:
                AbstractC3367j.m5100e(collection, "elements");
                this.f12335f.m3420c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f12334e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                this.f12335f.m3420c();
                return super.retainAll(collection);
            default:
                AbstractC3367j.m5100e(collection, "elements");
                this.f12335f.m3420c();
                return super.retainAll(collection);
        }
    }
}
