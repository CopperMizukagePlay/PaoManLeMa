package p101n0;

import java.util.List;
import java.util.ListIterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C2704d implements ListIterator, InterfaceC3594a {

    /* renamed from: e */
    public final Object f14515e;

    /* renamed from: f */
    public int f14516f;

    public C2704d(int i7, List list) {
        this.f14515e = list;
        this.f14516f = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f14515e.add(this.f14516f, obj);
        this.f14516f++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f14516f < this.f14515e.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f14516f > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i7 = this.f14516f;
        this.f14516f = i7 + 1;
        return this.f14515e.get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14516f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i7 = this.f14516f - 1;
        this.f14516f = i7;
        return this.f14515e.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14516f - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7 = this.f14516f - 1;
        this.f14516f = i7;
        this.f14515e.remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f14515e.set(this.f14516f, obj);
    }
}
