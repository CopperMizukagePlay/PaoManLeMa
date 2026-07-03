package p077k;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C2179a extends AbstractSet {

    /* renamed from: e */
    public final /* synthetic */ C2189f f12610e;

    public C2179a(C2189f c2189f) {
        this.f12610e = c2189f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2185d(this.f12610e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12610e.f12735g;
    }
}
