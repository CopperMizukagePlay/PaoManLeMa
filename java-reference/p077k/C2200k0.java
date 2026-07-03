package p077k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p015b6.C0303j;
import p060h5.AbstractC1805m;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3598e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.k0 */
/* loaded from: classes.dex */
public final class C2200k0 implements InterfaceC3598e, Set, InterfaceC3594a {

    /* renamed from: e */
    public final C2196i0 f12703e;

    /* renamed from: f */
    public final C2196i0 f12704f;

    public C2200k0(C2196i0 c2196i0) {
        this.f12703e = c2196i0;
        this.f12704f = c2196i0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12704f.m3599a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        C2196i0 c2196i0 = this.f12704f;
        int i7 = c2196i0.f12687d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c2196i0.m3607i(it.next());
        }
        if (i7 != c2196i0.f12687d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12704f.m3600b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12703e.m3601c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12703e.m3601c(it.next())) {
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
        if (obj != null && C2200k0.class == obj.getClass()) {
            return AbstractC3367j.m5096a(this.f12703e, ((C2200k0) obj).f12703e);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12703e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12703e.m3605g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0303j(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12704f.m3609k(obj);
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
        C2196i0 c2196i0 = this.f12704f;
        c2196i0.getClass();
        int i9 = c2196i0.f12687d;
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
            int i15 = c2196i0.f12686c;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = c2196i0.f12684a;
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
                    if (AbstractC3367j.m5096a(c2196i0.f12685b[i8], next)) {
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
                c2196i0.m3610l(i8);
            }
        }
        if (i9 != c2196i0.f12687d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z7;
        AbstractC3367j.m5100e(collection, "elements");
        C2196i0 c2196i0 = this.f12704f;
        c2196i0.getClass();
        Object[] objArr = c2196i0.f12685b;
        int i7 = c2196i0.f12687d;
        long[] jArr = c2196i0.f12684a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j6) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!AbstractC1805m.m3041e0(collection, objArr[i11])) {
                                c2196i0.m3610l(i11);
                            }
                        }
                        j6 >>= 8;
                    }
                    z7 = false;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    z7 = false;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        } else {
            z7 = false;
        }
        if (i7 != c2196i0.f12687d) {
            return true;
        }
        return z7;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12703e.f12687d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    public final String toString() {
        return this.f12703e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        return AbstractC3366i.m5095b(this, objArr);
    }
}
