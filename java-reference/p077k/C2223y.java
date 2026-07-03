package p077k;

import java.util.Arrays;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.y */
/* loaded from: classes.dex */
public final class C2223y {

    /* renamed from: a */
    public long[] f12762a;

    /* renamed from: b */
    public int f12763b;

    public C2223y(int i7) {
        long[] jArr;
        if (i7 == 0) {
            jArr = AbstractC2207o.f12716a;
        } else {
            jArr = new long[i7];
        }
        this.f12762a = jArr;
    }

    /* renamed from: a */
    public final void m3659a(long j6) {
        int i7 = this.f12763b + 1;
        long[] jArr = this.f12762a;
        if (jArr.length < i7) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i7, (jArr.length * 3) / 2));
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12762a = copyOf;
        }
        long[] jArr2 = this.f12762a;
        int i8 = this.f12763b;
        jArr2[i8] = j6;
        this.f12763b = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2223y) {
            C2223y c2223y = (C2223y) obj;
            int i7 = c2223y.f12763b;
            int i8 = this.f12763b;
            if (i7 == i8) {
                long[] jArr = this.f12762a;
                long[] jArr2 = c2223y.f12762a;
                C3879d m3513G = AbstractC2168e.m3513G(0, i8);
                int i9 = m3513G.f18163e;
                int i10 = m3513G.f18164f;
                if (i9 <= i10) {
                    while (jArr[i9] == jArr2[i9]) {
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
        long[] jArr = this.f12762a;
        int i7 = this.f12763b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += Long.hashCode(jArr[i9]) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f12762a;
        int i7 = this.f12763b;
        int i8 = 0;
        while (true) {
            if (i8 < i7) {
                long j6 = jArr[i8];
                if (i8 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i8 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(j6);
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
}
