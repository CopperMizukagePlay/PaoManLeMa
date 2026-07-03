package p077k;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.r0 */
/* loaded from: classes.dex */
public class C2214r0 {

    /* renamed from: e */
    public int[] f12733e = AbstractC2334a.f13322a;

    /* renamed from: f */
    public Object[] f12734f = AbstractC2334a.f13324c;

    /* renamed from: g */
    public int f12735g;

    /* renamed from: a */
    public final int m3625a(Object obj) {
        int i7 = this.f12735g * 2;
        Object[] objArr = this.f12734f;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m3626b(int i7, Object obj) {
        int i8 = this.f12735g;
        if (i8 == 0) {
            return -1;
        }
        int m3710a = AbstractC2334a.m3710a(i8, i7, this.f12733e);
        if (m3710a < 0 || AbstractC3367j.m5096a(obj, this.f12734f[m3710a << 1])) {
            return m3710a;
        }
        int i9 = m3710a + 1;
        while (i9 < i8 && this.f12733e[i9] == i7) {
            if (AbstractC3367j.m5096a(obj, this.f12734f[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = m3710a - 1; i10 >= 0 && this.f12733e[i10] == i7; i10--) {
            if (AbstractC3367j.m5096a(obj, this.f12734f[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    /* renamed from: c */
    public final int m3627c(Object obj) {
        if (obj == null) {
            return m3628d();
        }
        return m3626b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f12735g > 0) {
            this.f12733e = AbstractC2334a.f13322a;
            this.f12734f = AbstractC2334a.f13324c;
            this.f12735g = 0;
        }
        if (this.f12735g <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (m3627c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (m3625a(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int m3628d() {
        int i7 = this.f12735g;
        if (i7 == 0) {
            return -1;
        }
        int m3710a = AbstractC2334a.m3710a(i7, 0, this.f12733e);
        if (m3710a < 0 || this.f12734f[m3710a << 1] == null) {
            return m3710a;
        }
        int i8 = m3710a + 1;
        while (i8 < i7 && this.f12733e[i8] == 0) {
            if (this.f12734f[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = m3710a - 1; i9 >= 0 && this.f12733e[i9] == 0; i9--) {
            if (this.f12734f[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    /* renamed from: e */
    public final Object m3629e(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12735g) {
            z7 = true;
        }
        if (z7) {
            return this.f12734f[i7 << 1];
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2214r0) {
                int i7 = this.f12735g;
                if (i7 != ((C2214r0) obj).f12735g) {
                    return false;
                }
                C2214r0 c2214r0 = (C2214r0) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object m3629e = m3629e(i8);
                    Object m3632h = m3632h(i8);
                    Object obj2 = c2214r0.get(m3629e);
                    if (m3632h == null) {
                        if (obj2 != null || !c2214r0.containsKey(m3629e)) {
                            return false;
                        }
                    } else if (!m3632h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f12735g != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f12735g;
            for (int i10 = 0; i10 < i9; i10++) {
                Object m3629e2 = m3629e(i10);
                Object m3632h2 = m3632h(i10);
                Object obj3 = ((Map) obj).get(m3629e2);
                if (m3632h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(m3629e2)) {
                        return false;
                    }
                } else if (!m3632h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final Object m3630f(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12735g)) {
            Object[] objArr = this.f12734f;
            int i9 = i7 << 1;
            Object obj = objArr[i9 + 1];
            if (i8 <= 1) {
                clear();
                return obj;
            }
            int i10 = i8 - 1;
            int[] iArr = this.f12733e;
            int i11 = 8;
            if (iArr.length > 8 && i8 < iArr.length / 3) {
                if (i8 > 8) {
                    i11 = i8 + (i8 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i11);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                this.f12733e = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f12734f, i11 << 1);
                AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                this.f12734f = copyOf2;
                if (i8 == this.f12735g) {
                    if (i7 > 0) {
                        AbstractC1804l.m3015H(iArr, this.f12733e, 0, 0, i7);
                        AbstractC1804l.m3017J(objArr, this.f12734f, 0, 0, i9);
                    }
                    if (i7 < i10) {
                        int i12 = i7 + 1;
                        AbstractC1804l.m3015H(iArr, this.f12733e, i7, i12, i8);
                        AbstractC1804l.m3017J(objArr, this.f12734f, i9, i12 << 1, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i7 < i10) {
                    int i13 = i7 + 1;
                    AbstractC1804l.m3015H(iArr, iArr, i7, i13, i8);
                    Object[] objArr2 = this.f12734f;
                    AbstractC1804l.m3017J(objArr2, objArr2, i9, i13 << 1, i8 << 1);
                }
                Object[] objArr3 = this.f12734f;
                int i14 = i10 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            }
            if (i8 == this.f12735g) {
                this.f12735g = i10;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    /* renamed from: g */
    public final Object m3631g(int i7, Object obj) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12735g) {
            z7 = true;
        }
        if (z7) {
            int i8 = (i7 << 1) + 1;
            Object[] objArr = this.f12734f;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
            return obj2;
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public Object get(Object obj) {
        int m3627c = m3627c(obj);
        if (m3627c >= 0) {
            return this.f12734f[(m3627c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int m3627c = m3627c(obj);
        if (m3627c >= 0) {
            return this.f12734f[(m3627c << 1) + 1];
        }
        return obj2;
    }

    /* renamed from: h */
    public final Object m3632h(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12735g) {
            z7 = true;
        }
        if (z7) {
            return this.f12734f[(i7 << 1) + 1];
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final int hashCode() {
        int i7;
        int[] iArr = this.f12733e;
        Object[] objArr = this.f12734f;
        int i8 = this.f12735g;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            int i12 = iArr[i10];
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i11 += i7 ^ i12;
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public final boolean isEmpty() {
        if (this.f12735g <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i7;
        int m3628d;
        int i8 = this.f12735g;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        if (obj != null) {
            m3628d = m3626b(i7, obj);
        } else {
            m3628d = m3628d();
        }
        if (m3628d >= 0) {
            int i9 = (m3628d << 1) + 1;
            Object[] objArr = this.f12734f;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~m3628d;
        int[] iArr = this.f12733e;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12733e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12734f, i11 << 1);
            AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
            this.f12734f = copyOf2;
            if (i8 != this.f12735g) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f12733e;
            int i12 = i10 + 1;
            AbstractC1804l.m3015H(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.f12734f;
            AbstractC1804l.m3017J(objArr2, objArr2, i12 << 1, i10 << 1, this.f12735g << 1);
        }
        int i13 = this.f12735g;
        if (i8 == i13) {
            int[] iArr3 = this.f12733e;
            if (i10 < iArr3.length) {
                iArr3[i10] = i7;
                Object[] objArr3 = this.f12734f;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f12735g = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int m3627c = m3627c(obj);
        if (m3627c >= 0) {
            return m3630f(m3627c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int m3627c = m3627c(obj);
        if (m3627c >= 0) {
            return m3631g(m3627c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f12735g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12735g * 28);
        sb.append('{');
        int i7 = this.f12735g;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object m3629e = m3629e(i8);
            if (m3629e != sb) {
                sb.append(m3629e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m3632h = m3632h(i8);
            if (m3632h != sb) {
                sb.append(m3632h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int m3627c = m3627c(obj);
        if (m3627c < 0 || !AbstractC3367j.m5096a(obj2, m3632h(m3627c))) {
            return false;
        }
        m3630f(m3627c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int m3627c = m3627c(obj);
        if (m3627c < 0 || !AbstractC3367j.m5096a(obj2, m3632h(m3627c))) {
            return false;
        }
        m3631g(m3627c, obj3);
        return true;
    }
}
