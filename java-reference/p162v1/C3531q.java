package p162v1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1806n;
import p068i5.C2077a;
import p077k.C2184c0;
import p077k.C2223y;
import p084l.AbstractC2334a;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.q */
/* loaded from: classes.dex */
public final class C3531q implements List, InterfaceC3594a {

    /* renamed from: e */
    public final C2184c0 f16999e = new C2184c0(16);

    /* renamed from: f */
    public final C2223y f17000f = new C2223y(16);

    /* renamed from: g */
    public int f17001g = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5499a() {
        long m5361a = AbstractC3498f.m5361a(Float.POSITIVE_INFINITY, false, false);
        int i7 = this.f17001g + 1;
        int m3066N = AbstractC1806n.m3066N(this);
        if (i7 <= m3066N) {
            while (true) {
                C2223y c2223y = this.f17000f;
                if (i7 >= 0) {
                    if (i7 >= c2223y.f12763b) {
                        break;
                    }
                    long j6 = c2223y.f12762a[i7];
                    if (AbstractC3498f.m5368h(j6, m5361a) < 0) {
                        m5361a = j6;
                    }
                    if ((AbstractC3498f.m5372l(m5361a) >= 0.0f || !AbstractC3498f.m5377q(m5361a)) && i7 != m3066N) {
                        i7++;
                    }
                } else {
                    c2223y.getClass();
                    break;
                }
            }
            AbstractC2334a.m3713d("Index must be between 0 and size");
            throw null;
        }
        return m5361a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final void m5500b(int i7, int i8) {
        if (i7 < i8) {
            this.f16999e.m3566k(i7, i8);
            C2223y c2223y = this.f17000f;
            if (i7 >= 0) {
                int i9 = c2223y.f12763b;
                if (i7 <= i9 && i8 >= 0 && i8 <= i9) {
                    if (i8 >= i7) {
                        if (i8 != i7) {
                            if (i8 < i9) {
                                long[] jArr = c2223y.f12762a;
                                AbstractC1804l.m3016I(jArr, jArr, i7, i8, i9);
                            }
                            c2223y.f12763b -= i8 - i7;
                            return;
                        }
                        return;
                    }
                    AbstractC2334a.m3712c("The end index must be < start index");
                    throw null;
                }
            } else {
                c2223y.getClass();
            }
            AbstractC2334a.m3713d("Index must be between 0 and size");
            throw null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f17001g = -1;
        this.f16999e.m3558c();
        this.f17000f.f12763b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC3809q) || indexOf((AbstractC3809q) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC3809q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object m3560e = this.f16999e.m3560e(i7);
        AbstractC3367j.m5098c(m3560e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC3809q) m3560e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC3809q)) {
            return -1;
        }
        AbstractC3809q abstractC3809q = (AbstractC3809q) obj;
        int m3066N = AbstractC1806n.m3066N(this);
        if (m3066N >= 0) {
            int i7 = 0;
            while (!AbstractC3367j.m5096a(this.f16999e.m3560e(i7), abstractC3809q)) {
                if (i7 != m3066N) {
                    i7++;
                }
            }
            return i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16999e.m3562g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2077a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC3809q)) {
            return -1;
        }
        AbstractC3809q abstractC3809q = (AbstractC3809q) obj;
        for (int m3066N = AbstractC1806n.m3066N(this); -1 < m3066N; m3066N--) {
            if (AbstractC3367j.m5096a(this.f16999e.m3560e(m3066N), abstractC3809q)) {
                return m3066N;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2077a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16999e.f12629b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        return new C3528p(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C2077a(this, i7, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }
}
