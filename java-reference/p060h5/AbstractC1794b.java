package p060h5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.b */
/* loaded from: classes.dex */
public abstract class AbstractC1794b implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public int f10847e;

    /* renamed from: f */
    public Object f10848f;

    /* renamed from: a */
    public abstract void mo655a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f10847e;
        if (i7 != 0) {
            if (i7 == 1) {
                return true;
            }
            if (i7 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        this.f10847e = 3;
        mo655a();
        if (this.f10847e != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f10847e;
        if (i7 == 1) {
            this.f10847e = 0;
            return this.f10848f;
        }
        if (i7 != 2) {
            this.f10847e = 3;
            mo655a();
            if (this.f10847e == 1) {
                this.f10847e = 0;
                return this.f10848f;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
