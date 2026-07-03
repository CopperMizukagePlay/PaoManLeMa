package p195z5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.c */
/* loaded from: classes.dex */
public final class C3878c implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final int f18166e;

    /* renamed from: f */
    public final int f18167f;

    /* renamed from: g */
    public boolean f18168g;

    /* renamed from: h */
    public int f18169h;

    public C3878c(int i7, int i8, int i9) {
        this.f18166e = i9;
        this.f18167f = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f18168g = z7;
        this.f18169h = z7 ? i7 : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18168g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i7 = this.f18169h;
        if (i7 == this.f18167f) {
            if (this.f18168g) {
                this.f18168g = false;
                return i7;
            }
            throw new NoSuchElementException();
        }
        this.f18169h = this.f18166e + i7;
        return i7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
