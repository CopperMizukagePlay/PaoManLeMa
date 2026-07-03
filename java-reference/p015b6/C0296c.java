package p015b6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p060h5.AbstractC1797e;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.c */
/* loaded from: classes.dex */
public class C0296c implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f1075e = 0;

    /* renamed from: f */
    public int f1076f;

    /* renamed from: g */
    public final Object f1077g;

    public C0296c(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        this.f1077g = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1075e) {
            case 0:
                Iterator it = (Iterator) this.f1077g;
                while (this.f1076f > 0 && it.hasNext()) {
                    it.next();
                    this.f1076f--;
                }
                return it.hasNext();
            case 1:
                if (this.f1076f < ((AbstractC1797e) this.f1077g).mo299a()) {
                    return true;
                }
                return false;
            default:
                if (this.f1076f < ((Object[]) this.f1077g).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1075e) {
            case 0:
                Iterator it = (Iterator) this.f1077g;
                while (this.f1076f > 0 && it.hasNext()) {
                    it.next();
                    this.f1076f--;
                }
                return it.next();
            case 1:
                if (hasNext()) {
                    AbstractC1797e abstractC1797e = (AbstractC1797e) this.f1077g;
                    int i7 = this.f1076f;
                    this.f1076f = i7 + 1;
                    return abstractC1797e.get(i7);
                }
                throw new NoSuchElementException();
            default:
                try {
                    Object[] objArr = (Object[]) this.f1077g;
                    int i8 = this.f1076f;
                    this.f1076f = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f1076f--;
                    throw new NoSuchElementException(e7.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1075e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0296c(AbstractC1797e abstractC1797e) {
        this.f1077g = abstractC1797e;
    }

    public C0296c(C0297d c0297d) {
        this.f1077g = c0297d.f1078a.iterator();
        this.f1076f = c0297d.f1079b;
    }
}
