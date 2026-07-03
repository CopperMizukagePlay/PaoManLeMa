package p077k;

import java.util.Arrays;
import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.p */
/* loaded from: classes.dex */
public final class C2209p implements Cloneable {

    /* renamed from: e */
    public /* synthetic */ boolean f12718e;

    /* renamed from: f */
    public /* synthetic */ long[] f12719f;

    /* renamed from: g */
    public /* synthetic */ Object[] f12720g;

    /* renamed from: h */
    public /* synthetic */ int f12721h;

    public C2209p(int i7) {
        if (i7 == 0) {
            this.f12719f = AbstractC2334a.f13323b;
            this.f12720g = AbstractC2334a.f13324c;
            return;
        }
        int i8 = i7 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f12719f = new long[i11];
        this.f12720g = new Object[i11];
    }

    /* renamed from: a */
    public final long m3614a(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12721h)) {
            if (this.f12718e) {
                long[] jArr = this.f12719f;
                Object[] objArr = this.f12720g;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != AbstractC2211q.f12723a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12718e = false;
                this.f12721h = i9;
            }
            return this.f12719f[i7];
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    /* renamed from: b */
    public final void m3615b(long j6, Object obj) {
        Object obj2 = AbstractC2211q.f12723a;
        int m3711b = AbstractC2334a.m3711b(this.f12719f, this.f12721h, j6);
        if (m3711b >= 0) {
            this.f12720g[m3711b] = obj;
            return;
        }
        int i7 = ~m3711b;
        int i8 = this.f12721h;
        if (i7 < i8) {
            Object[] objArr = this.f12720g;
            if (objArr[i7] == obj2) {
                this.f12719f[i7] = j6;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f12718e) {
            long[] jArr = this.f12719f;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f12720g;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12718e = false;
                this.f12721h = i9;
                i7 = ~AbstractC2334a.m3711b(this.f12719f, i9, j6);
            }
        }
        int i11 = this.f12721h;
        if (i11 >= this.f12719f.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f12719f, i15);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12719f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12720g, i15);
            AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
            this.f12720g = copyOf2;
        }
        int i16 = this.f12721h;
        if (i16 - i7 != 0) {
            long[] jArr2 = this.f12719f;
            int i17 = i7 + 1;
            AbstractC1804l.m3016I(jArr2, jArr2, i17, i7, i16);
            Object[] objArr3 = this.f12720g;
            AbstractC1804l.m3017J(objArr3, objArr3, i17, i7, this.f12721h);
        }
        this.f12719f[i7] = j6;
        this.f12720g[i7] = obj;
        this.f12721h++;
    }

    /* renamed from: c */
    public final int m3616c() {
        if (this.f12718e) {
            int i7 = this.f12721h;
            long[] jArr = this.f12719f;
            Object[] objArr = this.f12720g;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC2211q.f12723a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f12718e = false;
            this.f12721h = i8;
        }
        return this.f12721h;
    }

    public final Object clone() {
        Object clone = super.clone();
        AbstractC3367j.m5098c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2209p c2209p = (C2209p) clone;
        c2209p.f12719f = (long[]) this.f12719f.clone();
        c2209p.f12720g = (Object[]) this.f12720g.clone();
        return c2209p;
    }

    /* renamed from: d */
    public final Object m3617d(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12721h)) {
            if (this.f12718e) {
                long[] jArr = this.f12719f;
                Object[] objArr = this.f12720g;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != AbstractC2211q.f12723a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f12718e = false;
                this.f12721h = i9;
            }
            return this.f12720g[i7];
        }
        AbstractC2334a.m3712c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final String toString() {
        if (m3616c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12721h * 28);
        sb.append('{');
        int i7 = this.f12721h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m3614a(i8));
            sb.append('=');
            Object m3617d = m3617d(i8);
            if (m3617d != sb) {
                sb.append(m3617d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
