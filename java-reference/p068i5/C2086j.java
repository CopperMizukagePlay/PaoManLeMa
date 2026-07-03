package p068i5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p123q0.AbstractC2977l;
import p123q0.C2969d;
import p123q0.C2970e;
import p123q0.C2978m;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.j */
/* loaded from: classes.dex */
public final class C2086j extends AbstractCollection implements Collection, InterfaceC3595b {

    /* renamed from: e */
    public final /* synthetic */ int f12336e;

    /* renamed from: f */
    public final Object f12337f;

    public /* synthetic */ C2086j(int i7, Object obj) {
        this.f12336e = i7;
        this.f12337f = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12336e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f12336e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f12336e) {
            case 0:
                ((C2084h) this.f12337f).clear();
                return;
            default:
                ((C2969d) this.f12337f).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12336e) {
            case 0:
                return ((C2084h) this.f12337f).containsValue(obj);
            default:
                return ((C2969d) this.f12337f).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f12336e) {
            case 0:
                return ((C2084h) this.f12337f).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12336e) {
            case 0:
                C2084h c2084h = (C2084h) this.f12337f;
                c2084h.getClass();
                return new C2081e(c2084h, 2);
            default:
                C2969d c2969d = (C2969d) this.f12337f;
                AbstractC2977l[] abstractC2977lArr = new AbstractC2977l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC2977lArr[i7] = new C2978m(2);
                }
                return new C2970e(c2969d, abstractC2977lArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f12336e) {
            case 0:
                C2084h c2084h = (C2084h) this.f12337f;
                c2084h.m3420c();
                int m3426i = c2084h.m3426i(obj);
                if (m3426i < 0) {
                    return false;
                }
                c2084h.m3429l(m3426i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f12336e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                ((C2084h) this.f12337f).m3420c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f12336e) {
            case 0:
                AbstractC3367j.m5100e(collection, "elements");
                ((C2084h) this.f12337f).m3420c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f12336e) {
            case 0:
                return ((C2084h) this.f12337f).f12329m;
            default:
                C2969d c2969d = (C2969d) this.f12337f;
                c2969d.getClass();
                return c2969d.f15382j;
        }
    }
}
