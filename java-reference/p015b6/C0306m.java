package p015b6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p098m5.AbstractC2589i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.m */
/* loaded from: classes.dex */
public final class C0306m implements Iterator, InterfaceC2313c, InterfaceC3594a {

    /* renamed from: e */
    public int f1099e;

    /* renamed from: f */
    public Object f1100f;

    /* renamed from: g */
    public InterfaceC2313c f1101g;

    /* renamed from: a */
    public final RuntimeException m660a() {
        int i7 = this.f1099e;
        if (i7 != 4) {
            if (i7 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f1099e);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: b */
    public final void m661b(Object obj, AbstractC2589i abstractC2589i) {
        this.f1100f = obj;
        this.f1099e = 3;
        this.f1101g = abstractC2589i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f1099e;
            if (i7 != 0) {
                break;
            }
            this.f1099e = 5;
            InterfaceC2313c interfaceC2313c = this.f1101g;
            AbstractC3367j.m5097b(interfaceC2313c);
            this.f1101g = null;
            interfaceC2313c.mo663n(C1694m.f10482a);
        }
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return true;
            }
            if (i7 == 4) {
                return false;
            }
            throw m660a();
        }
        AbstractC3367j.m5097b(null);
        throw null;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return C2319i.f13273e;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        AbstractC1793a0.m2972L(obj);
        this.f1099e = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f1099e;
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    this.f1099e = 0;
                    Object obj = this.f1100f;
                    this.f1100f = null;
                    return obj;
                }
                throw m660a();
            }
            this.f1099e = 1;
            AbstractC3367j.m5097b(null);
            throw null;
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
