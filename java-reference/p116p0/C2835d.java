package p116p0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.d */
/* loaded from: classes.dex */
public final class C2835d extends AbstractC2832a {

    /* renamed from: g */
    public final /* synthetic */ int f14909g = 1;

    /* renamed from: h */
    public final Object f14910h;

    public C2835d(Object[] objArr, int i7, int i8) {
        super(i7, i8);
        this.f14910h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f14909g) {
            case 0:
                if (hasNext()) {
                    Object[] objArr = (Object[]) this.f14910h;
                    int i7 = this.f14905e;
                    this.f14905e = i7 + 1;
                    return objArr[i7];
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    this.f14905e++;
                    return this.f14910h;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f14909g) {
            case 0:
                if (hasPrevious()) {
                    Object[] objArr = (Object[]) this.f14910h;
                    int i7 = this.f14905e - 1;
                    this.f14905e = i7;
                    return objArr[i7];
                }
                throw new NoSuchElementException();
            default:
                if (hasPrevious()) {
                    this.f14905e--;
                    return this.f14910h;
                }
                throw new NoSuchElementException();
        }
    }

    public C2835d(int i7, Object obj) {
        super(i7, 1);
        this.f14910h = obj;
    }
}
