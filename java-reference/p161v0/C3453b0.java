package p161v0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p060h5.C1818z;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2389n1;
import p116p0.AbstractC2834c;
import p116p0.C2837f;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p166v5.InterfaceC3595b;
import p195z5.C3878c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.b0 */
/* loaded from: classes.dex */
public final class C3453b0 implements List, InterfaceC3595b {

    /* renamed from: e */
    public final C3469p f16679e;

    /* renamed from: f */
    public final int f16680f;

    /* renamed from: g */
    public int f16681g;

    /* renamed from: h */
    public int f16682h;

    public C3453b0(C3469p c3469p, int i7, int i8) {
        this.f16679e = c3469p;
        this.f16680f = i7;
        this.f16681g = AbstractC3470q.m5265f(c3469p);
        this.f16682h = i8 - i7;
    }

    /* renamed from: a */
    public final void m5218a() {
        if (AbstractC3470q.m5265f(this.f16679e) == this.f16681g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m5218a();
        int i7 = this.f16680f + this.f16682h;
        C3469p c3469p = this.f16679e;
        c3469p.add(i7, obj);
        this.f16682h++;
        this.f16681g = AbstractC3470q.m5265f(c3469p);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f16682h, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f16682h > 0) {
            m5218a();
            int i7 = this.f16682h;
            int i8 = this.f16680f;
            C3469p c3469p = this.f16679e;
            c3469p.m5259d(i8, i7 + i8);
            this.f16682h = 0;
            this.f16681g = AbstractC3470q.m5265f(c3469p);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        m5218a();
        AbstractC3470q.m5260a(i7, this.f16682h);
        return this.f16679e.get(this.f16680f + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m5218a();
        int i7 = this.f16682h;
        int i8 = this.f16680f;
        Iterator it = AbstractC2168e.m3513G(i8, i7 + i8).iterator();
        while (it.hasNext()) {
            int nextInt = ((C3878c) it).nextInt();
            if (AbstractC3367j.m5096a(obj, this.f16679e.get(nextInt))) {
                return nextInt - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f16682h == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m5218a();
        int i7 = this.f16682h;
        int i8 = this.f16680f;
        for (int i9 = (i7 + i8) - 1; i9 >= i8; i9--) {
            if (AbstractC3367j.m5096a(obj, this.f16679e.get(i9))) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z7 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z7) {
                    z7 = true;
                }
            }
            return z7;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        m5218a();
        C3469p c3469p = this.f16679e;
        int i8 = this.f16680f;
        int i9 = this.f16682h + i8;
        int size = c3469p.size();
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = c3469p.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            C2837f mo4458e = abstractC2834c.mo4458e();
            mo4458e.subList(i8, i9).retainAll(collection);
            AbstractC2834c m4477c = mo4458e.m4477c();
            if (AbstractC3367j.m5096a(m4477c, abstractC2834c)) {
                break;
            }
            C3475v c3475v3 = c3469p.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, c3469p, m5244k), i7, m4477c, true);
            }
            AbstractC3465l.m5247n(m5244k, c3469p);
        } while (!m5261b);
        int size2 = size - c3469p.size();
        if (size2 > 0) {
            this.f16681g = AbstractC3470q.m5265f(this.f16679e);
            this.f16682h -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC3470q.m5260a(i7, this.f16682h);
        m5218a();
        int i8 = i7 + this.f16680f;
        C3469p c3469p = this.f16679e;
        Object obj2 = c3469p.set(i8, obj);
        this.f16681g = AbstractC3470q.m5265f(c3469p);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16682h;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        boolean z7;
        if (i7 >= 0 && i7 <= i8 && i8 <= this.f16682h) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2389n1.m3828a("fromIndex or toIndex are out of bounds");
        }
        m5218a();
        int i9 = this.f16680f;
        return new C3453b0(this.f16679e, i7 + i9, i8 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u5.t, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        m5218a();
        ?? obj = new Object();
        obj.f16449e = i7 - 1;
        return new C1818z((C3377t) obj, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        m5218a();
        int i8 = i7 + this.f16680f;
        C3469p c3469p = this.f16679e;
        boolean addAll = c3469p.addAll(i8, collection);
        if (addAll) {
            this.f16682h = collection.size() + this.f16682h;
            this.f16681g = AbstractC3470q.m5265f(c3469p);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        m5218a();
        int i8 = this.f16680f + i7;
        C3469p c3469p = this.f16679e;
        Object remove = c3469p.remove(i8);
        this.f16682h--;
        this.f16681g = AbstractC3470q.m5265f(c3469p);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        m5218a();
        int i8 = this.f16680f + i7;
        C3469p c3469p = this.f16679e;
        c3469p.add(i8, obj);
        this.f16682h++;
        this.f16681g = AbstractC3470q.m5265f(c3469p);
    }
}
