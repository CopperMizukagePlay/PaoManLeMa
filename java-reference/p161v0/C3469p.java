package p161v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p039e5.C1282so;
import p068i5.C2077a;
import p085l0.AbstractC2389n1;
import p116p0.AbstractC2834c;
import p116p0.C2833b;
import p116p0.C2837f;
import p116p0.C2840i;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.p */
/* loaded from: classes.dex */
public final class C3469p implements Parcelable, InterfaceC3478y, List, RandomAccess, InterfaceC3595b {
    public static final Parcelable.Creator<C3469p> CREATOR = new Object();

    /* renamed from: e */
    public C3475v f16732e;

    public C3469p(AbstractC2834c abstractC2834c) {
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        C3475v c3475v = new C3475v(m5244k.mo5221g(), abstractC2834c);
        if (!(m5244k instanceof C3450a)) {
            c3475v.f16668b = new C3475v(1, abstractC2834c);
        }
        this.f16732e = c3475v;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f16732e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4456c = abstractC2834c.mo4456c(obj);
            if (mo4456c.equals(abstractC2834c)) {
                return false;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i7, mo4456c, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return AbstractC3470q.m5267h(this, new C1282so(i7, collection));
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        abstractC3451a0.f16668b = this.f16732e;
        this.f16732e = (C3475v) abstractC3451a0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC3459f m5244k;
        C3475v c3475v = this.f16732e;
        AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (AbstractC3465l.f16721c) {
            m5244k = AbstractC3465l.m5244k();
            C3475v c3475v2 = (C3475v) AbstractC3465l.m5256w(c3475v, this, m5244k);
            synchronized (AbstractC3470q.f16733a) {
                c3475v2.f16763c = C2840i.f14929f;
                c3475v2.f16764d++;
                c3475v2.f16765e++;
            }
        }
        AbstractC3465l.m5247n(m5244k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC3470q.m5264e(this).f16763c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC3470q.m5264e(this).f16763c.containsAll(collection);
    }

    /* renamed from: d */
    public final void m5259d(int i7, int i8) {
        int i9;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i9 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            C2837f mo4458e = abstractC2834c.mo4458e();
            mo4458e.subList(i7, i8).clear();
            AbstractC2834c m4477c = mo4458e.m4477c();
            if (!AbstractC3367j.m5096a(m4477c, abstractC2834c)) {
                C3475v c3475v3 = this.f16732e;
                AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
                synchronized (AbstractC3465l.f16721c) {
                    m5244k = AbstractC3465l.m5244k();
                    m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i9, m4477c, true);
                }
                AbstractC3465l.m5247n(m5244k, this);
            } else {
                return;
            }
        } while (!m5261b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return AbstractC3470q.m5264e(this).f16763c.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC3470q.m5264e(this).f16763c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC3470q.m5264e(this).f16763c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC3470q.m5264e(this).f16763c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2077a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        Object obj = get(i7);
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i8 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4460g = abstractC2834c.mo4460g(i7);
            if (mo4460g.equals(abstractC2834c)) {
                break;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i8, mo4460g, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4459f = abstractC2834c.mo4459f(new C2833b(0, collection));
            if (AbstractC3367j.m5096a(mo4459f, abstractC2834c)) {
                return false;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i7, mo4459f, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC3470q.m5267h(this, new C2833b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        int i8;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        Object obj2 = get(i7);
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i8 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4461h = abstractC2834c.mo4461h(i7, obj);
            if (mo4461h.equals(abstractC2834c)) {
                break;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i8, mo4461h, false);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC3470q.m5264e(this).f16763c.mo299a();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        boolean z7;
        if (i7 >= 0 && i7 <= i8 && i8 <= size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2389n1.m3828a("fromIndex or toIndex are out of bounds");
        }
        return new C3453b0(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    public final String toString() {
        C3475v c3475v = this.f16732e;
        AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C3475v) AbstractC3465l.m5242i(c3475v)).f16763c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC2834c abstractC2834c = AbstractC3470q.m5264e(this).f16763c;
        int mo299a = abstractC2834c.mo299a();
        parcel.writeInt(mo299a);
        for (int i8 = 0; i8 < mo299a; i8++) {
            parcel.writeValue(abstractC2834c.get(i8));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4457d = abstractC2834c.mo4457d(collection);
            if (AbstractC3367j.m5096a(mo4457d, abstractC2834c)) {
                return false;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i7, mo4457d, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C2077a(this, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }

    public C3469p() {
        this(C2840i.f14929f);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i8 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            AbstractC2834c mo4455b = abstractC2834c.mo4455b(i7, obj);
            if (mo4455b.equals(abstractC2834c)) {
                return;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i8, mo4455b, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        AbstractC2834c abstractC2834c;
        AbstractC3459f m5244k;
        boolean m5261b;
        do {
            synchronized (AbstractC3470q.f16733a) {
                C3475v c3475v = this.f16732e;
                AbstractC3367j.m5098c(c3475v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C3475v c3475v2 = (C3475v) AbstractC3465l.m5242i(c3475v);
                i7 = c3475v2.f16764d;
                abstractC2834c = c3475v2.f16763c;
            }
            AbstractC3367j.m5097b(abstractC2834c);
            int indexOf = abstractC2834c.indexOf(obj);
            AbstractC2834c mo4460g = indexOf != -1 ? abstractC2834c.mo4460g(indexOf) : abstractC2834c;
            if (mo4460g.equals(abstractC2834c)) {
                return false;
            }
            C3475v c3475v3 = this.f16732e;
            AbstractC3367j.m5098c(c3475v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                m5261b = AbstractC3470q.m5261b((C3475v) AbstractC3465l.m5256w(c3475v3, this, m5244k), i7, mo4460g, true);
            }
            AbstractC3465l.m5247n(m5244k, this);
        } while (!m5261b);
        return true;
    }
}
