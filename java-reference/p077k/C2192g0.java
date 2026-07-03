package p077k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p015b6.C0303j;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3598e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.g0 */
/* loaded from: classes.dex */
public final class C2192g0 implements InterfaceC3598e, Set, InterfaceC3594a {

    /* renamed from: e */
    public final C2188e0 f12663e;

    /* renamed from: f */
    public final C2188e0 f12664f;

    public C2192g0(C2188e0 c2188e0) {
        AbstractC3367j.m5100e(c2188e0, "parent");
        this.f12663e = c2188e0;
        this.f12664f = c2188e0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12664f.m3574a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        C2188e0 c2188e0 = this.f12664f;
        c2188e0.getClass();
        int i7 = c2188e0.f12647g;
        for (Object obj : collection) {
            int m3577d = c2188e0.m3577d(obj);
            c2188e0.f12642b[m3577d] = obj;
            long[] jArr = c2188e0.f12643c;
            int i8 = c2188e0.f12644d;
            jArr[m3577d] = (i8 & 2147483647L) | 4611686016279904256L;
            if (i8 != Integer.MAX_VALUE) {
                jArr[i8] = ((m3577d & 2147483647L) << 31) | (jArr[i8] & (-4611686016279904257L));
            }
            c2188e0.f12644d = m3577d;
            if (c2188e0.f12645e == Integer.MAX_VALUE) {
                c2188e0.f12645e = m3577d;
            }
        }
        if (i7 != c2188e0.f12647g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12664f.m3575b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12663e.m3576c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12663e.m3576c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2192g0.class == obj.getClass()) {
            return AbstractC3367j.m5096a(this.f12663e, ((C2192g0) obj).f12663e);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12663e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.f12663e.f12647g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0303j(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12664f.m3580g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i7;
        int i8;
        AbstractC3367j.m5100e(collection, "elements");
        C2188e0 c2188e0 = this.f12664f;
        c2188e0.getClass();
        int i9 = c2188e0.f12647g;
        Iterator it = collection.iterator();
        while (true) {
            int i10 = 1;
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                i7 = next.hashCode();
            } else {
                i7 = 0;
            }
            int i12 = i7 * (-862048943);
            int i13 = i12 ^ (i12 << 16);
            int i14 = i13 & 127;
            int i15 = c2188e0.f12646f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = c2188e0.f12641a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i10;
                int i20 = i11;
                long j6 = (((-i18) >> 63) & (jArr[i17 + i10] << (64 - i18))) | (jArr[i17] >>> i18);
                long j7 = (i14 * 72340172838076673L) ^ j6;
                long j8 = -9187201950435737472L;
                long j9 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j9 == 0) {
                        break;
                    }
                    i8 = ((Long.numberOfTrailingZeros(j9) >> 3) + i16) & i15;
                    long j10 = j8;
                    if (AbstractC3367j.m5096a(c2188e0.f12642b[i8], next)) {
                        break;
                    }
                    j9 &= j9 - 1;
                    j8 = j10;
                }
                i11 = i20 + 8;
                i16 = (i16 + i11) & i15;
                i10 = i19;
            }
            if (i8 >= 0) {
                c2188e0.m3581h(i8);
            }
        }
        if (i9 != c2188e0.f12647g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        return this.f12664f.m3582i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12663e.f12647g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    public final String toString() {
        return this.f12663e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        return AbstractC3366i.m5095b(this, objArr);
    }
}
