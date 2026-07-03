package p116p0;

import java.util.ListIterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2832a implements ListIterator, InterfaceC3594a {

    /* renamed from: e */
    public int f14905e;

    /* renamed from: f */
    public int f14906f;

    public AbstractC2832a(int i7, int i8) {
        this.f14905e = i7;
        this.f14906f = i8;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f14905e < this.f14906f) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f14905e > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14905e;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14905e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
