package p101n0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p060h5.AbstractC1806n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C2705e implements RandomAccess {

    /* renamed from: e */
    public Object[] f14517e;

    /* renamed from: f */
    public C2702b f14518f;

    /* renamed from: g */
    public int f14519g = 0;

    public C2705e(Object[] objArr) {
        this.f14517e = objArr;
    }

    /* renamed from: a */
    public final void m4299a(int i7, Object obj) {
        int i8 = this.f14519g + 1;
        if (this.f14517e.length < i8) {
            m4311m(i8);
        }
        Object[] objArr = this.f14517e;
        int i9 = this.f14519g;
        if (i7 != i9) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i9 - i7);
        }
        objArr[i7] = obj;
        this.f14519g++;
    }

    /* renamed from: b */
    public final void m4300b(Object obj) {
        int i7 = this.f14519g + 1;
        if (this.f14517e.length < i7) {
            m4311m(i7);
        }
        Object[] objArr = this.f14517e;
        int i8 = this.f14519g;
        objArr[i8] = obj;
        this.f14519g = i8 + 1;
    }

    /* renamed from: c */
    public final void m4301c(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i8 = this.f14519g + size;
        if (this.f14517e.length < i8) {
            m4311m(i8);
        }
        Object[] objArr = this.f14517e;
        int i9 = this.f14519g;
        if (i7 != i9) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i9 - i7);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr[i7 + i10] = list.get(i10);
        }
        this.f14519g += size;
    }

    /* renamed from: d */
    public final void m4302d(int i7, C2705e c2705e) {
        int i8 = c2705e.f14519g;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f14519g + i8;
        if (this.f14517e.length < i9) {
            m4311m(i9);
        }
        Object[] objArr = this.f14517e;
        int i10 = this.f14519g;
        if (i7 != i10) {
            System.arraycopy(objArr, i7, objArr, i7 + i8, i10 - i7);
        }
        System.arraycopy(c2705e.f14517e, 0, objArr, i7, i8);
        this.f14519g += i8;
    }

    /* renamed from: e */
    public final boolean m4303e(int i7, Collection collection) {
        int i8 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i9 = this.f14519g + size;
        if (this.f14517e.length < i9) {
            m4311m(i9);
        }
        Object[] objArr = this.f14517e;
        int i10 = this.f14519g;
        if (i7 != i10) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i10 - i7);
        }
        for (Object obj : collection) {
            int i11 = i8 + 1;
            if (i8 >= 0) {
                objArr[i8 + i7] = obj;
                i8 = i11;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        this.f14519g += size;
        return true;
    }

    /* renamed from: f */
    public final List m4304f() {
        C2702b c2702b = this.f14518f;
        if (c2702b == null) {
            C2702b c2702b2 = new C2702b(this);
            this.f14518f = c2702b2;
            return c2702b2;
        }
        return c2702b;
    }

    /* renamed from: g */
    public final void m4305g() {
        Object[] objArr = this.f14517e;
        int i7 = this.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f14519g = 0;
    }

    /* renamed from: h */
    public final boolean m4306h(Object obj) {
        int i7 = this.f14519g - 1;
        if (i7 >= 0) {
            for (int i8 = 0; !AbstractC3367j.m5096a(this.f14517e[i8], obj); i8++) {
                if (i8 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int m4307i(Object obj) {
        Object[] objArr = this.f14517e;
        int i7 = this.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            if (AbstractC3367j.m5096a(obj, objArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final boolean m4308j(Object obj) {
        int m4307i = m4307i(obj);
        if (m4307i >= 0) {
            m4309k(m4307i);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final Object m4309k(int i7) {
        Object[] objArr = this.f14517e;
        Object obj = objArr[i7];
        int i8 = this.f14519g;
        if (i7 != i8 - 1) {
            int i9 = i7 + 1;
            System.arraycopy(objArr, i9, objArr, i7, i8 - i9);
        }
        int i10 = this.f14519g - 1;
        this.f14519g = i10;
        objArr[i10] = null;
        return obj;
    }

    /* renamed from: l */
    public final void m4310l(int i7, int i8) {
        if (i8 > i7) {
            int i9 = this.f14519g;
            if (i8 < i9) {
                Object[] objArr = this.f14517e;
                System.arraycopy(objArr, i8, objArr, i7, i9 - i8);
            }
            int i10 = this.f14519g;
            int i11 = i10 - (i8 - i7);
            int i12 = i10 - 1;
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    this.f14517e[i13] = null;
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f14519g = i11;
        }
    }

    /* renamed from: m */
    public final void m4311m(int i7) {
        Object[] objArr = this.f14517e;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f14517e = objArr2;
    }
}
