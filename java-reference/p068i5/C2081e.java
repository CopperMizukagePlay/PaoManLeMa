package p068i5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.e */
/* loaded from: classes.dex */
public final class C2081e extends AbstractC2083g implements Iterator, InterfaceC3594a {

    /* renamed from: i */
    public final /* synthetic */ int f12312i;

    public C2081e(C2084h c2084h, int i7) {
        this.f12312i = i7;
        AbstractC3367j.m5100e(c2084h, "map");
        this.f12319h = c2084h;
        this.f12317f = -1;
        this.f12318g = c2084h.f12328l;
        m3417c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12312i) {
            case 0:
                m3416b();
                int i7 = this.f12316e;
                C2084h c2084h = (C2084h) this.f12319h;
                if (i7 < c2084h.f12326j) {
                    this.f12316e = i7 + 1;
                    this.f12317f = i7;
                    C2082f c2082f = new C2082f(c2084h, i7);
                    m3417c();
                    return c2082f;
                }
                throw new NoSuchElementException();
            case 1:
                m3416b();
                int i8 = this.f12316e;
                C2084h c2084h2 = (C2084h) this.f12319h;
                if (i8 < c2084h2.f12326j) {
                    this.f12316e = i8 + 1;
                    this.f12317f = i8;
                    Object obj = c2084h2.f12321e[i8];
                    m3417c();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                m3416b();
                int i9 = this.f12316e;
                C2084h c2084h3 = (C2084h) this.f12319h;
                if (i9 < c2084h3.f12326j) {
                    this.f12316e = i9 + 1;
                    this.f12317f = i9;
                    Object[] objArr = c2084h3.f12322f;
                    AbstractC3367j.m5097b(objArr);
                    Object obj2 = objArr[this.f12317f];
                    m3417c();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
