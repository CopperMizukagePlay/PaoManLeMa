package p123q0;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.l */
/* loaded from: classes.dex */
public abstract class AbstractC2977l implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public Object[] f15397e = C2976k.f15392e.f15396d;

    /* renamed from: f */
    public int f15398f;

    /* renamed from: g */
    public int f15399g;

    /* renamed from: a */
    public final void m4638a(Object[] objArr, int i7, int i8) {
        this.f15397e = objArr;
        this.f15398f = i7;
        this.f15399g = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15399g < this.f15398f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
