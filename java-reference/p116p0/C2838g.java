package p116p0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.g */
/* loaded from: classes.dex */
public final class C2838g extends AbstractC2832a {

    /* renamed from: g */
    public final Object[] f14923g;

    /* renamed from: h */
    public final C2841j f14924h;

    public C2838g(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        super(i7, i8);
        this.f14923g = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f14924h = new C2841j(objArr, i7 > i10 ? i10 : i7, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C2841j c2841j = this.f14924h;
            if (c2841j.hasNext()) {
                this.f14905e++;
                return c2841j.next();
            }
            int i7 = this.f14905e;
            this.f14905e = i7 + 1;
            return this.f14923g[i7 - c2841j.f14906f];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f14905e;
            C2841j c2841j = this.f14924h;
            int i8 = c2841j.f14906f;
            if (i7 > i8) {
                int i9 = i7 - 1;
                this.f14905e = i9;
                return this.f14923g[i9 - i8];
            }
            this.f14905e = i7 - 1;
            return c2841j.previous();
        }
        throw new NoSuchElementException();
    }
}
