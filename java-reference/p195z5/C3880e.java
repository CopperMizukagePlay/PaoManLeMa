package p195z5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.e */
/* loaded from: classes.dex */
public final class C3880e implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final long f18171e;

    /* renamed from: f */
    public final long f18172f;

    /* renamed from: g */
    public boolean f18173g;

    /* renamed from: h */
    public long f18174h;

    public C3880e(long j6, long j7, long j8) {
        this.f18171e = j8;
        this.f18172f = j7;
        boolean z7 = false;
        if (j8 <= 0 ? j6 >= j7 : j6 <= j7) {
            z7 = true;
        }
        this.f18173g = z7;
        this.f18174h = z7 ? j6 : j7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18173g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j6 = this.f18174h;
        if (j6 == this.f18172f) {
            if (this.f18173g) {
                this.f18173g = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f18174h = this.f18171e + j6;
        }
        return Long.valueOf(j6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
