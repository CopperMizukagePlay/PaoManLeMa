package p140s2;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.k */
/* loaded from: classes.dex */
public final class C3101k {

    /* renamed from: e */
    public static final C3101k f15697e = new C3101k(0, 0, 0, 0);

    /* renamed from: a */
    public final int f15698a;

    /* renamed from: b */
    public final int f15699b;

    /* renamed from: c */
    public final int f15700c;

    /* renamed from: d */
    public final int f15701d;

    public C3101k(int i7, int i8, int i9, int i10) {
        this.f15698a = i7;
        this.f15699b = i8;
        this.f15700c = i9;
        this.f15701d = i10;
    }

    /* renamed from: a */
    public final long m4787a() {
        return (((m4788b() / 2) + this.f15699b) & 4294967295L) | (((m4789c() / 2) + this.f15698a) << 32);
    }

    /* renamed from: b */
    public final int m4788b() {
        return this.f15701d - this.f15699b;
    }

    /* renamed from: c */
    public final int m4789c() {
        return this.f15700c - this.f15698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3101k)) {
            return false;
        }
        C3101k c3101k = (C3101k) obj;
        if (this.f15698a == c3101k.f15698a && this.f15699b == c3101k.f15699b && this.f15700c == c3101k.f15700c && this.f15701d == c3101k.f15701d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15701d) + AbstractC2647h.m4255a(this.f15700c, AbstractC2647h.m4255a(this.f15699b, Integer.hashCode(this.f15698a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f15698a);
        sb.append(", ");
        sb.append(this.f15699b);
        sb.append(", ");
        sb.append(this.f15700c);
        sb.append(", ");
        return AbstractC2487d.m4045i(sb, this.f15701d, ')');
    }
}
