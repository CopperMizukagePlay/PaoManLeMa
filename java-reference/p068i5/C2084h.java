package p068i5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3597d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.h */
/* loaded from: classes.dex */
public final class C2084h implements Map, Serializable, InterfaceC3597d {

    /* renamed from: r */
    public static final C2084h f12320r;

    /* renamed from: e */
    public Object[] f12321e;

    /* renamed from: f */
    public Object[] f12322f;

    /* renamed from: g */
    public int[] f12323g;

    /* renamed from: h */
    public int[] f12324h;

    /* renamed from: i */
    public int f12325i;

    /* renamed from: j */
    public int f12326j;

    /* renamed from: k */
    public int f12327k;

    /* renamed from: l */
    public int f12328l;

    /* renamed from: m */
    public int f12329m;

    /* renamed from: n */
    public C2085i f12330n;

    /* renamed from: o */
    public C2086j f12331o;

    /* renamed from: p */
    public C2085i f12332p;

    /* renamed from: q */
    public boolean f12333q;

    static {
        C2084h c2084h = new C2084h(0);
        c2084h.f12333q = true;
        f12320r = c2084h;
    }

    public C2084h() {
        this(8);
    }

    /* renamed from: a */
    public final int m3418a(Object obj) {
        m3420c();
        while (true) {
            int m3427j = m3427j(obj);
            int i7 = this.f12325i * 2;
            int length = this.f12324h.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f12324h;
                int i9 = iArr[m3427j];
                if (i9 <= 0) {
                    int i10 = this.f12326j;
                    Object[] objArr = this.f12321e;
                    if (i10 >= objArr.length) {
                        m3424g(1);
                    } else {
                        int i11 = i10 + 1;
                        this.f12326j = i11;
                        objArr[i10] = obj;
                        this.f12323g[i10] = m3427j;
                        iArr[m3427j] = i11;
                        this.f12329m++;
                        this.f12328l++;
                        if (i8 > this.f12325i) {
                            this.f12325i = i8;
                        }
                        return i10;
                    }
                } else {
                    if (AbstractC3367j.m5096a(this.f12321e[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        m3428k(this.f12324h.length * 2);
                        break;
                    }
                    int i12 = m3427j - 1;
                    if (m3427j == 0) {
                        m3427j = this.f12324h.length - 1;
                    } else {
                        m3427j = i12;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final C2084h m3419b() {
        m3420c();
        this.f12333q = true;
        if (this.f12329m > 0) {
            return this;
        }
        C2084h c2084h = f12320r;
        AbstractC3367j.m5098c(c2084h, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2084h;
    }

    /* renamed from: c */
    public final void m3420c() {
        if (!this.f12333q) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m3420c();
        int i7 = this.f12326j - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f12323g;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f12324h[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        AbstractC2080d.m3380H(this.f12321e, 0, this.f12326j);
        Object[] objArr = this.f12322f;
        if (objArr != null) {
            AbstractC2080d.m3380H(objArr, 0, this.f12326j);
        }
        this.f12329m = 0;
        this.f12326j = 0;
        this.f12328l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (m3425h(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (m3426i(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m3421d(boolean z7) {
        int i7;
        Object[] objArr = this.f12322f;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f12326j;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f12323g;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f12321e;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z7) {
                    iArr[i9] = i10;
                    this.f12324h[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        AbstractC2080d.m3380H(this.f12321e, i9, i7);
        if (objArr != null) {
            AbstractC2080d.m3380H(objArr, i9, this.f12326j);
        }
        this.f12326j = i9;
    }

    /* renamed from: e */
    public final boolean m3422e(Collection collection) {
        AbstractC3367j.m5100e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m3423f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2085i c2085i = this.f12332p;
        if (c2085i == null) {
            C2085i c2085i2 = new C2085i(this, 0);
            this.f12332p = c2085i2;
            return c2085i2;
        }
        return c2085i;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f12329m != map.size() || !m3422e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m3423f(Map.Entry entry) {
        AbstractC3367j.m5100e(entry, "entry");
        int m3425h = m3425h(entry.getKey());
        if (m3425h < 0) {
            return false;
        }
        Object[] objArr = this.f12322f;
        AbstractC3367j.m5097b(objArr);
        return AbstractC3367j.m5096a(objArr[m3425h], entry.getValue());
    }

    /* renamed from: g */
    public final void m3424g(int i7) {
        Object[] objArr;
        Object[] objArr2 = this.f12321e;
        int length = objArr2.length;
        int i8 = this.f12326j;
        int i9 = length - i8;
        int i10 = i8 - this.f12329m;
        int i11 = 1;
        if (i9 < i7 && i9 + i10 >= i7 && i10 >= objArr2.length / 4) {
            m3421d(true);
            return;
        }
        int i12 = i8 + i7;
        if (i12 >= 0) {
            if (i12 > objArr2.length) {
                int length2 = objArr2.length;
                int i13 = length2 + (length2 >> 1);
                if (i13 - i12 < 0) {
                    i13 = i12;
                }
                if (i13 - 2147483639 > 0) {
                    if (i12 > 2147483639) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i13);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                this.f12321e = copyOf;
                Object[] objArr3 = this.f12322f;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i13);
                    AbstractC3367j.m5099d(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f12322f = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f12323g, i13);
                AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                this.f12323g = copyOf2;
                if (i13 >= 1) {
                    i11 = i13;
                }
                int highestOneBit = Integer.highestOneBit(i11 * 3);
                if (highestOneBit > this.f12324h.length) {
                    m3428k(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int m3425h = m3425h(obj);
        if (m3425h < 0) {
            return null;
        }
        Object[] objArr = this.f12322f;
        AbstractC3367j.m5097b(objArr);
        return objArr[m3425h];
    }

    /* renamed from: h */
    public final int m3425h(Object obj) {
        int m3427j = m3427j(obj);
        int i7 = this.f12325i;
        while (true) {
            int i8 = this.f12324h[m3427j];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (AbstractC3367j.m5096a(this.f12321e[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            int i10 = m3427j - 1;
            if (m3427j == 0) {
                m3427j = this.f12324h.length - 1;
            } else {
                m3427j = i10;
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i7;
        int i8;
        C2081e c2081e = new C2081e(this, 0);
        int i9 = 0;
        while (c2081e.hasNext()) {
            int i10 = c2081e.f12316e;
            C2084h c2084h = (C2084h) c2081e.f12319h;
            if (i10 < c2084h.f12326j) {
                c2081e.f12316e = i10 + 1;
                c2081e.f12317f = i10;
                Object obj = c2084h.f12321e[i10];
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                Object[] objArr = c2084h.f12322f;
                AbstractC3367j.m5097b(objArr);
                Object obj2 = objArr[c2081e.f12317f];
                if (obj2 != null) {
                    i8 = obj2.hashCode();
                } else {
                    i8 = 0;
                }
                c2081e.m3417c();
                i9 += i7 ^ i8;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i9;
    }

    /* renamed from: i */
    public final int m3426i(Object obj) {
        int i7 = this.f12326j;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f12323g[i7] >= 0) {
                Object[] objArr = this.f12322f;
                AbstractC3367j.m5097b(objArr);
                if (AbstractC3367j.m5096a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f12329m == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int m3427j(Object obj) {
        int i7;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return (i7 * (-1640531527)) >>> this.f12327k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f12323g[r2] = r0;
        r2 = r6;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3428k(int i7) {
        this.f12328l++;
        int i8 = 0;
        if (this.f12326j > this.f12329m) {
            m3421d(false);
        }
        this.f12324h = new int[i7];
        this.f12327k = Integer.numberOfLeadingZeros(i7) + 1;
        while (i8 < this.f12326j) {
            int i9 = i8 + 1;
            int m3427j = m3427j(this.f12321e[i8]);
            int i10 = this.f12325i;
            while (true) {
                int[] iArr = this.f12324h;
                if (iArr[m3427j] == 0) {
                    break;
                }
                i10--;
                if (i10 >= 0) {
                    int i11 = m3427j - 1;
                    if (m3427j == 0) {
                        m3427j = iArr.length - 1;
                    } else {
                        m3427j = i11;
                    }
                } else {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2085i c2085i = this.f12330n;
        if (c2085i == null) {
            C2085i c2085i2 = new C2085i(this, 1);
            this.f12330n = c2085i2;
            return c2085i2;
        }
        return c2085i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3429l(int i7) {
        Object[] objArr = this.f12321e;
        AbstractC3367j.m5100e(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f12322f;
        if (objArr2 != null) {
            objArr2[i7] = null;
        }
        int i8 = this.f12323g[i7];
        int i9 = this.f12325i * 2;
        int length = this.f12324h.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i8;
        while (true) {
            int i13 = i8 - 1;
            if (i8 == 0) {
                i8 = this.f12324h.length - 1;
            } else {
                i8 = i13;
            }
            i11++;
            if (i11 > this.f12325i) {
                this.f12324h[i12] = 0;
                break;
            }
            int[] iArr = this.f12324h;
            int i14 = iArr[i8];
            if (i14 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i14 < 0) {
                iArr[i12] = -1;
            } else {
                int i15 = i14 - 1;
                int m3427j = m3427j(this.f12321e[i15]) - i8;
                int[] iArr2 = this.f12324h;
                if ((m3427j & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i14;
                    this.f12323g[i15] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f12324h[i12] = -1;
                    break;
                }
            }
            i12 = i8;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f12323g[i7] = -1;
        this.f12329m--;
        this.f12328l++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3420c();
        int m3418a = m3418a(obj);
        Object[] objArr = this.f12322f;
        if (objArr == null) {
            int length = this.f12321e.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f12322f = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        if (m3418a < 0) {
            int i7 = (-m3418a) - 1;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        objArr[m3418a] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC3367j.m5100e(map, "from");
        m3420c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            m3424g(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int m3418a = m3418a(entry.getKey());
                Object[] objArr = this.f12322f;
                if (objArr == null) {
                    int length = this.f12321e.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f12322f = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    }
                }
                if (m3418a >= 0) {
                    objArr[m3418a] = entry.getValue();
                } else {
                    int i7 = (-m3418a) - 1;
                    if (!AbstractC3367j.m5096a(entry.getValue(), objArr[i7])) {
                        objArr[i7] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m3420c();
        int m3425h = m3425h(obj);
        if (m3425h < 0) {
            return null;
        }
        Object[] objArr = this.f12322f;
        AbstractC3367j.m5097b(objArr);
        Object obj2 = objArr[m3425h];
        m3429l(m3425h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12329m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f12329m * 3) + 2);
        sb.append("{");
        int i7 = 0;
        C2081e c2081e = new C2081e(this, 0);
        while (c2081e.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = c2081e.f12316e;
            C2084h c2084h = (C2084h) c2081e.f12319h;
            if (i8 < c2084h.f12326j) {
                c2081e.f12316e = i8 + 1;
                c2081e.f12317f = i8;
                Object obj = c2084h.f12321e[i8];
                if (obj == c2084h) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = c2084h.f12322f;
                AbstractC3367j.m5097b(objArr);
                Object obj2 = objArr[c2081e.f12317f];
                if (obj2 == c2084h) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                c2081e.m3417c();
                i7++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C2086j c2086j = this.f12331o;
        if (c2086j == null) {
            C2086j c2086j2 = new C2086j(0, this);
            this.f12331o = c2086j2;
            return c2086j2;
        }
        return c2086j;
    }

    public C2084h(int i7) {
        if (i7 >= 0) {
            Object[] objArr = new Object[i7];
            int[] iArr = new int[i7];
            int highestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
            this.f12321e = objArr;
            this.f12322f = null;
            this.f12323g = iArr;
            this.f12324h = new int[highestOneBit];
            this.f12325i = 2;
            this.f12326j = 0;
            this.f12327k = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
