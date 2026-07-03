package p101n0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.c */
/* loaded from: classes.dex */
public final class C2703c implements List, InterfaceC3595b {

    /* renamed from: e */
    public final Object f14512e;

    /* renamed from: f */
    public final int f14513f;

    /* renamed from: g */
    public int f14514g;

    public C2703c(List list, int i7, int i8) {
        this.f14512e = list;
        this.f14513f = i7;
        this.f14514g = i8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7 = this.f14514g;
        this.f14514g = i7 + 1;
        this.f14512e.add(i7, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        this.f14512e.addAll(i7 + this.f14513f, collection);
        int size = collection.size();
        this.f14514g += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7 = this.f14514g - 1;
        int i8 = this.f14513f;
        if (i8 <= i7) {
            while (true) {
                this.f14512e.remove(i7);
                if (i7 == i8) {
                    break;
                } else {
                    i7--;
                }
            }
        }
        this.f14514g = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i7 = this.f14514g;
        for (int i8 = this.f14513f; i8 < i7; i8++) {
            if (AbstractC3367j.m5096a(this.f14512e.get(i8), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC2706f.m4312a(i7, this);
        return this.f14512e.get(i7 + this.f14513f);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i7 = this.f14514g;
        int i8 = this.f14513f;
        for (int i9 = i8; i9 < i7; i9++) {
            if (AbstractC3367j.m5096a(this.f14512e.get(i9), obj)) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f14514g == this.f14513f) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2704d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7 = this.f14514g - 1;
        int i8 = this.f14513f;
        if (i8 <= i7) {
            while (!AbstractC3367j.m5096a(this.f14512e.get(i7), obj)) {
                if (i7 != i8) {
                    i7--;
                } else {
                    return -1;
                }
            }
            return i7 - i8;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2704d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7 = this.f14514g;
        for (int i8 = this.f14513f; i8 < i7; i8++) {
            ?? r22 = this.f14512e;
            if (AbstractC3367j.m5096a(r22.get(i8), obj)) {
                r22.remove(i8);
                this.f14514g--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7 = this.f14514g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i7 != this.f14514g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7 = this.f14514g;
        int i8 = i7 - 1;
        int i9 = this.f14513f;
        if (i9 <= i8) {
            while (true) {
                ?? r32 = this.f14512e;
                if (!collection.contains(r32.get(i8))) {
                    r32.remove(i8);
                    this.f14514g--;
                }
                if (i8 == i9) {
                    break;
                }
                i8--;
            }
        }
        if (i7 != this.f14514g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC2706f.m4312a(i7, this);
        return this.f14512e.set(i7 + this.f14513f, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14514g - this.f14513f;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        AbstractC2706f.m4313b(this, i7, i8);
        return new C2703c(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f14512e.add(i7 + this.f14513f, obj);
        this.f14514g++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C2704d(i7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f14512e.addAll(this.f14514g, collection);
        int size = collection.size();
        this.f14514g += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i7) {
        AbstractC2706f.m4312a(i7, this);
        this.f14514g--;
        return this.f14512e.remove(i7 + this.f14513f);
    }
}
