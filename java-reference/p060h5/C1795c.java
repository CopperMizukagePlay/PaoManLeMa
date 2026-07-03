package p060h5;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p001a0.AbstractC0094y0;
import p015b6.C0296c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.c */
/* loaded from: classes.dex */
public final class C1795c extends C0296c implements ListIterator {

    /* renamed from: h */
    public final /* synthetic */ AbstractC1797e f10849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795c(AbstractC1797e abstractC1797e, int i7) {
        super(abstractC1797e);
        this.f10849h = abstractC1797e;
        int mo299a = abstractC1797e.mo299a();
        if (i7 >= 0 && i7 <= mo299a) {
            this.f1076f = i7;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, mo299a, "index: ", ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f1076f > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1076f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f1076f - 1;
            this.f1076f = i7;
            return this.f10849h.get(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1076f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
