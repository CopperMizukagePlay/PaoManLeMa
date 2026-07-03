package p077k;

import java.util.Arrays;
import p060h5.AbstractC1804l;
import p073j2.AbstractC2168e;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.v */
/* loaded from: classes.dex */
public final class C2220v {

    /* renamed from: a */
    public int[] f12754a;

    /* renamed from: b */
    public int f12755b;

    public C2220v(int i7) {
        int[] iArr;
        if (i7 == 0) {
            iArr = AbstractC2205n.f12714a;
        } else {
            iArr = new int[i7];
        }
        this.f12754a = iArr;
    }

    /* renamed from: a */
    public final void m3643a(int i7) {
        m3644b(this.f12755b + 1);
        int[] iArr = this.f12754a;
        int i8 = this.f12755b;
        iArr[i8] = i7;
        this.f12755b = i8 + 1;
    }

    /* renamed from: b */
    public final void m3644b(int i7) {
        int[] iArr = this.f12754a;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i7, (iArr.length * 3) / 2));
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12754a = copyOf;
        }
    }

    /* renamed from: c */
    public final int m3645c(int i7) {
        if (i7 >= 0 && i7 < this.f12755b) {
            return this.f12754a[i7];
        }
        AbstractC2334a.m3713d("Index must be between 0 and size");
        throw null;
    }

    /* renamed from: d */
    public final void m3646d(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f12755b)) {
            int[] iArr = this.f12754a;
            int i9 = iArr[i7];
            if (i7 != i8 - 1) {
                AbstractC1804l.m3015H(iArr, iArr, i7, i7 + 1, i8);
            }
            this.f12755b--;
            return;
        }
        AbstractC2334a.m3713d("Index must be between 0 and size");
        throw null;
    }

    /* renamed from: e */
    public final void m3647e(int i7, int i8) {
        if (i7 >= 0 && i7 < this.f12755b) {
            int[] iArr = this.f12754a;
            int i9 = iArr[i7];
            iArr[i7] = i8;
            return;
        }
        AbstractC2334a.m3713d("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2220v) {
            C2220v c2220v = (C2220v) obj;
            int i7 = c2220v.f12755b;
            int i8 = this.f12755b;
            if (i7 == i8) {
                int[] iArr = this.f12754a;
                int[] iArr2 = c2220v.f12754a;
                C3879d m3513G = AbstractC2168e.m3513G(0, i8);
                int i9 = m3513G.f18163e;
                int i10 = m3513G.f18164f;
                if (i9 <= i10) {
                    while (iArr[i9] == iArr2[i9]) {
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

    public final int hashCode() {
        int[] iArr = this.f12754a;
        int i7 = this.f12755b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += Integer.hashCode(iArr[i9]) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f12754a;
        int i7 = this.f12755b;
        int i8 = 0;
        while (true) {
            if (i8 < i7) {
                int i9 = iArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i9);
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

    public /* synthetic */ C2220v() {
        this(16);
    }
}
