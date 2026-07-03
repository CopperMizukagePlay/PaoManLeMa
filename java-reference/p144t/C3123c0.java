package p144t;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.c0 */
/* loaded from: classes.dex */
public final class C3123c0 {

    /* renamed from: a */
    public final int f15763a;

    /* renamed from: b */
    public final int f15764b;

    /* renamed from: c */
    public final int f15765c;

    /* renamed from: d */
    public final int f15766d;

    public C3123c0(int i7, int i8, int i9, int i10) {
        this.f15763a = i7;
        this.f15764b = i8;
        this.f15765c = i9;
        this.f15766d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123c0)) {
            return false;
        }
        C3123c0 c3123c0 = (C3123c0) obj;
        if (this.f15763a == c3123c0.f15763a && this.f15764b == c3123c0.f15764b && this.f15765c == c3123c0.f15765c && this.f15766d == c3123c0.f15766d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15763a * 31) + this.f15764b) * 31) + this.f15765c) * 31) + this.f15766d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f15763a);
        sb.append(", top=");
        sb.append(this.f15764b);
        sb.append(", right=");
        sb.append(this.f15765c);
        sb.append(", bottom=");
        return AbstractC2487d.m4045i(sb, this.f15766d, ')');
    }
}
