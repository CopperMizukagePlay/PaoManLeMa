package p068i5;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p077k.C2184c0;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;
import p162v1.C3531q;
import p166v5.InterfaceC3594a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.a */
/* loaded from: classes.dex */
public final class C2077a implements ListIterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f12298e;

    /* renamed from: f */
    public int f12299f;

    /* renamed from: g */
    public int f12300g;

    /* renamed from: h */
    public int f12301h;

    /* renamed from: i */
    public final Object f12302i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2077a(C3531q c3531q, int i7, int i8) {
        this(c3531q, (i8 & 1) != 0 ? 0 : i7, 0, c3531q.f16999e.f12629b);
        this.f12298e = 3;
    }

    /* renamed from: a */
    public void m3354a() {
        if (C2079c.m3365c(((C2078b) this.f12302i).f12307i) == this.f12301h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f12298e) {
            case 0:
                m3354a();
                C2078b c2078b = (C2078b) this.f12302i;
                int i7 = this.f12299f;
                this.f12299f = i7 + 1;
                c2078b.add(i7, obj);
                this.f12300g = -1;
                this.f12301h = C2078b.m3357c(c2078b);
                return;
            case 1:
                m3355b();
                C2079c c2079c = (C2079c) this.f12302i;
                int i8 = this.f12299f;
                this.f12299f = i8 + 1;
                c2079c.add(i8, obj);
                this.f12300g = -1;
                this.f12301h = C2079c.m3365c(c2079c);
                return;
            case 2:
                m3356c();
                C3469p c3469p = (C3469p) this.f12302i;
                c3469p.add(this.f12299f + 1, obj);
                this.f12300g = -1;
                this.f12299f++;
                this.f12301h = AbstractC3470q.m5265f(c3469p);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: b */
    public void m3355b() {
        if (C2079c.m3365c((C2079c) this.f12302i) == this.f12301h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public void m3356c() {
        if (AbstractC3470q.m5265f((C3469p) this.f12302i) == this.f12301h) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12298e) {
            case 0:
                if (this.f12299f < ((C2078b) this.f12302i).f12305g) {
                    return true;
                }
                return false;
            case 1:
                if (this.f12299f < ((C2079c) this.f12302i).f12310f) {
                    return true;
                }
                return false;
            case 2:
                if (this.f12299f < ((C3469p) this.f12302i).size() - 1) {
                    return true;
                }
                return false;
            default:
                if (this.f12299f < this.f12301h) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f12298e) {
            case 0:
                if (this.f12299f > 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f12299f > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.f12299f >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f12299f > this.f12300g) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f12298e) {
            case 0:
                m3354a();
                int i7 = this.f12299f;
                C2078b c2078b = (C2078b) this.f12302i;
                if (i7 < c2078b.f12305g) {
                    this.f12299f = i7 + 1;
                    this.f12300g = i7;
                    return c2078b.f12303e[c2078b.f12304f + i7];
                }
                throw new NoSuchElementException();
            case 1:
                m3355b();
                int i8 = this.f12299f;
                C2079c c2079c = (C2079c) this.f12302i;
                if (i8 < c2079c.f12310f) {
                    this.f12299f = i8 + 1;
                    this.f12300g = i8;
                    return c2079c.f12309e[i8];
                }
                throw new NoSuchElementException();
            case 2:
                m3356c();
                int i9 = this.f12299f + 1;
                this.f12300g = i9;
                C3469p c3469p = (C3469p) this.f12302i;
                AbstractC3470q.m5260a(i9, c3469p.size());
                Object obj = c3469p.get(i9);
                this.f12299f = i9;
                return obj;
            default:
                C2184c0 c2184c0 = ((C3531q) this.f12302i).f16999e;
                int i10 = this.f12299f;
                this.f12299f = i10 + 1;
                Object m3560e = c2184c0.m3560e(i10);
                AbstractC3367j.m5098c(m3560e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC3809q) m3560e;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f12298e) {
            case 0:
                return this.f12299f;
            case 1:
                return this.f12299f;
            case 2:
                return this.f12299f + 1;
            default:
                return this.f12299f - this.f12300g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f12298e) {
            case 0:
                m3354a();
                int i7 = this.f12299f;
                if (i7 > 0) {
                    int i8 = i7 - 1;
                    this.f12299f = i8;
                    this.f12300g = i8;
                    C2078b c2078b = (C2078b) this.f12302i;
                    return c2078b.f12303e[c2078b.f12304f + i8];
                }
                throw new NoSuchElementException();
            case 1:
                m3355b();
                int i9 = this.f12299f;
                if (i9 > 0) {
                    int i10 = i9 - 1;
                    this.f12299f = i10;
                    this.f12300g = i10;
                    return ((C2079c) this.f12302i).f12309e[i10];
                }
                throw new NoSuchElementException();
            case 2:
                m3356c();
                int i11 = this.f12299f;
                C3469p c3469p = (C3469p) this.f12302i;
                AbstractC3470q.m5260a(i11, c3469p.size());
                int i12 = this.f12299f;
                this.f12300g = i12;
                this.f12299f--;
                return c3469p.get(i12);
            default:
                C2184c0 c2184c0 = ((C3531q) this.f12302i).f16999e;
                int i13 = this.f12299f - 1;
                this.f12299f = i13;
                Object m3560e = c2184c0.m3560e(i13);
                AbstractC3367j.m5098c(m3560e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC3809q) m3560e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i7;
        switch (this.f12298e) {
            case 0:
                i7 = this.f12299f;
                return i7 - 1;
            case 1:
                i7 = this.f12299f;
                return i7 - 1;
            case 2:
                return this.f12299f;
            default:
                i7 = this.f12299f - this.f12300g;
                return i7 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f12298e) {
            case 0:
                C2078b c2078b = (C2078b) this.f12302i;
                m3354a();
                int i7 = this.f12300g;
                if (i7 != -1) {
                    c2078b.mo3000b(i7);
                    this.f12299f = this.f12300g;
                    this.f12300g = -1;
                    this.f12301h = C2078b.m3357c(c2078b);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            case 1:
                C2079c c2079c = (C2079c) this.f12302i;
                m3355b();
                int i8 = this.f12300g;
                if (i8 != -1) {
                    c2079c.mo3000b(i8);
                    this.f12299f = this.f12300g;
                    this.f12300g = -1;
                    this.f12301h = C2079c.m3365c(c2079c);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            case 2:
                m3356c();
                C3469p c3469p = (C3469p) this.f12302i;
                c3469p.remove(this.f12300g);
                this.f12299f--;
                this.f12300g = -1;
                this.f12301h = AbstractC3470q.m5265f(c3469p);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f12298e) {
            case 0:
                m3354a();
                int i7 = this.f12300g;
                if (i7 != -1) {
                    ((C2078b) this.f12302i).set(i7, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            case 1:
                m3355b();
                int i8 = this.f12300g;
                if (i8 != -1) {
                    ((C2079c) this.f12302i).set(i8, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            case 2:
                C3469p c3469p = (C3469p) this.f12302i;
                m3356c();
                int i9 = this.f12300g;
                if (i9 >= 0) {
                    c3469p.set(i9, obj);
                    this.f12301h = AbstractC3470q.m5265f(c3469p);
                    return;
                }
                throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2077a(C2079c c2079c, int i7) {
        this.f12298e = 1;
        this.f12302i = c2079c;
        this.f12299f = i7;
        this.f12300g = -1;
        this.f12301h = C2079c.m3365c(c2079c);
    }

    public C2077a(C3469p c3469p, int i7) {
        this.f12298e = 2;
        this.f12302i = c3469p;
        this.f12299f = i7 - 1;
        this.f12300g = -1;
        this.f12301h = AbstractC3470q.m5265f(c3469p);
    }

    public C2077a(C3531q c3531q, int i7, int i8, int i9) {
        this.f12298e = 3;
        this.f12302i = c3531q;
        this.f12299f = i7;
        this.f12300g = i8;
        this.f12301h = i9;
    }

    public C2077a(C2078b c2078b, int i7) {
        this.f12298e = 0;
        this.f12302i = c2078b;
        this.f12299f = i7;
        this.f12300g = -1;
        this.f12301h = C2078b.m3357c(c2078b);
    }
}
