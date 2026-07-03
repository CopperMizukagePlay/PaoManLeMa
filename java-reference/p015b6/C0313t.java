package p015b6;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.t */
/* loaded from: classes.dex */
public final class C0313t implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final Iterator f1108e;

    /* renamed from: f */
    public final /* synthetic */ C0302i f1109f;

    public C0313t(C0302i c0302i) {
        this.f1109f = c0302i;
        this.f1108e = c0302i.f1090b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1108e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1109f.f1091c.mo23f(this.f1108e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
