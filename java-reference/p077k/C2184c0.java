package p077k;

import java.util.List;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1804l;
import p073j2.AbstractC2168e;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.c0 */
/* loaded from: classes.dex */
public final class C2184c0 {

    /* renamed from: a */
    public Object[] f12628a;

    /* renamed from: b */
    public int f12629b;

    public C2184c0(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = AbstractC2204m0.f12712a;
        } else {
            objArr = new Object[i7];
        }
        this.f12628a = objArr;
    }

    /* renamed from: a */
    public final void m3556a(Object obj) {
        int i7 = this.f12629b + 1;
        Object[] objArr = this.f12628a;
        if (objArr.length < i7) {
            m3567l(i7, objArr);
        }
        Object[] objArr2 = this.f12628a;
        int i8 = this.f12629b;
        objArr2[i8] = obj;
        this.f12629b = i8 + 1;
    }

    /* renamed from: b */
    public final void m3557b(List list) {
        if (!list.isEmpty()) {
            int i7 = this.f12629b;
            int size = list.size() + i7;
            Object[] objArr = this.f12628a;
            if (objArr.length < size) {
                m3567l(size, objArr);
            }
            Object[] objArr2 = this.f12628a;
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                objArr2[i8 + i7] = list.get(i8);
            }
            this.f12629b = list.size() + this.f12629b;
        }
    }

    /* renamed from: c */
    public final void m3558c() {
        AbstractC1804l.m3023P(this.f12628a, 0, this.f12629b);
        this.f12629b = 0;
    }

    /* renamed from: d */
    public final Object m3559d() {
        if (!m3562g()) {
            return this.f12628a[0];
        }
        AbstractC2334a.m3714e("ObjectList is empty.");
        throw null;
    }

    /* renamed from: e */
    public final Object m3560e(int i7) {
        if (i7 >= 0 && i7 < this.f12629b) {
            return this.f12628a[i7];
        }
        m3568m(i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2184c0) {
            C2184c0 c2184c0 = (C2184c0) obj;
            int i7 = c2184c0.f12629b;
            int i8 = this.f12629b;
            if (i7 == i8) {
                Object[] objArr = this.f12628a;
                Object[] objArr2 = c2184c0.f12628a;
                C3879d m3513G = AbstractC2168e.m3513G(0, i8);
                int i9 = m3513G.f18163e;
                int i10 = m3513G.f18164f;
                if (i9 <= i10) {
                    while (AbstractC3367j.m5096a(objArr[i9], objArr2[i9])) {
                        if (i9 != i10) {
                            i9++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m3561f(Object obj) {
        int i7 = 0;
        if (obj == null) {
            Object[] objArr = this.f12628a;
            int i8 = this.f12629b;
            while (i7 < i8) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        Object[] objArr2 = this.f12628a;
        int i9 = this.f12629b;
        while (i7 < i9) {
            if (obj.equals(objArr2[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: g */
    public final boolean m3562g() {
        if (this.f12629b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m3563h() {
        if (this.f12629b != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        Object[] objArr = this.f12628a;
        int i8 = this.f12629b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i9 += i7 * 31;
        }
        return i9;
    }

    /* renamed from: i */
    public final boolean m3564i(Object obj) {
        int m3561f = m3561f(obj);
        if (m3561f >= 0) {
            m3565j(m3561f);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Object m3565j(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12629b)) {
            Object[] objArr = this.f12628a;
            Object obj = objArr[i7];
            if (i7 != i8 - 1) {
                AbstractC1804l.m3017J(objArr, objArr, i7, i7 + 1, i8);
            }
            int i9 = this.f12629b - 1;
            this.f12629b = i9;
            objArr[i9] = null;
            return obj;
        }
        m3568m(i7);
        throw null;
    }

    /* renamed from: k */
    public final void m3566k(int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= (i9 = this.f12629b) && i8 >= 0 && i8 <= i9) {
            if (i8 >= i7) {
                if (i8 != i7) {
                    if (i8 < i9) {
                        Object[] objArr = this.f12628a;
                        AbstractC1804l.m3017J(objArr, objArr, i7, i8, i9);
                    }
                    int i10 = this.f12629b;
                    int i11 = i10 - (i8 - i7);
                    AbstractC1804l.m3023P(this.f12628a, i11, i10);
                    this.f12629b = i11;
                    return;
                }
                return;
            }
            AbstractC2334a.m3712c("Start (" + i7 + ") is more than end (" + i8 + ')');
            throw null;
        }
        AbstractC2334a.m3713d("Start (" + i7 + ") and end (" + i8 + ") must be in 0.." + this.f12629b);
        throw null;
    }

    /* renamed from: l */
    public final void m3567l(int i7, Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, (length * 3) / 2)];
        AbstractC1804l.m3017J(objArr, objArr2, 0, 0, length);
        this.f12628a = objArr2;
    }

    /* renamed from: m */
    public final void m3568m(int i7) {
        StringBuilder m188o = AbstractC0094y0.m188o(i7, "Index ", " must be in 0..");
        m188o.append(this.f12629b - 1);
        AbstractC2334a.m3713d(m188o.toString());
        throw null;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f12628a;
        int i7 = this.f12629b;
        int i8 = 0;
        while (true) {
            if (i8 < i7) {
                Object obj = objArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i8++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C2184c0() {
        this(16);
    }
}
