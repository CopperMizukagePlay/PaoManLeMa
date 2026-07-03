package p060h5;

import java.util.List;
import java.util.ListIterator;
import p001a0.AbstractC0094y0;
import p024c6.C0438e;
import p158u5.C3377t;
import p161v0.AbstractC3470q;
import p161v0.C3453b0;
import p166v5.InterfaceC3594a;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.z */
/* loaded from: classes.dex */
public final class C1818z implements ListIterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f10863e = 0;

    /* renamed from: f */
    public final Object f10864f;

    /* renamed from: g */
    public final /* synthetic */ Object f10865g;

    public C1818z(C0438e c0438e, int i7) {
        this.f10865g = c0438e;
        List list = (List) c0438e.f1496f;
        if (i7 >= 0 && i7 <= c0438e.mo299a()) {
            this.f10864f = list.listIterator(c0438e.mo299a() - i7);
            return;
        }
        StringBuilder m188o = AbstractC0094y0.m188o(i7, "Position index ", " must be in range [");
        m188o.append(new C3877b(0, c0438e.mo299a(), 1));
        m188o.append("].");
        throw new IndexOutOfBoundsException(m188o.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f10863e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10863e) {
            case 0:
                return ((ListIterator) this.f10864f).hasPrevious();
            default:
                if (((C3377t) this.f10864f).f16449e < ((C3453b0) this.f10865g).f16682h - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f10863e) {
            case 0:
                return ((ListIterator) this.f10864f).hasNext();
            default:
                if (((C3377t) this.f10864f).f16449e >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f10863e) {
            case 0:
                return ((ListIterator) this.f10864f).previous();
            default:
                C3377t c3377t = (C3377t) this.f10864f;
                int i7 = c3377t.f16449e + 1;
                C3453b0 c3453b0 = (C3453b0) this.f10865g;
                AbstractC3470q.m5260a(i7, c3453b0.f16682h);
                c3377t.f16449e = i7;
                return c3453b0.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f10863e) {
            case 0:
                C0438e c0438e = (C0438e) this.f10865g;
                return AbstractC1806n.m3066N(c0438e) - ((ListIterator) this.f10864f).previousIndex();
            default:
                return ((C3377t) this.f10864f).f16449e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f10863e) {
            case 0:
                return ((ListIterator) this.f10864f).next();
            default:
                C3377t c3377t = (C3377t) this.f10864f;
                int i7 = c3377t.f16449e;
                C3453b0 c3453b0 = (C3453b0) this.f10865g;
                AbstractC3470q.m5260a(i7, c3453b0.f16682h);
                c3377t.f16449e = i7 - 1;
                return c3453b0.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f10863e) {
            case 0:
                C0438e c0438e = (C0438e) this.f10865g;
                return AbstractC1806n.m3066N(c0438e) - ((ListIterator) this.f10864f).nextIndex();
            default:
                return ((C3377t) this.f10864f).f16449e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f10863e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f10863e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C1818z(C3377t c3377t, C3453b0 c3453b0) {
        this.f10864f = c3377t;
        this.f10865g = c3453b0;
    }
}
