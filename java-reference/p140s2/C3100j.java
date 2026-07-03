package p140s2;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.j */
/* loaded from: classes.dex */
public final class C3100j {

    /* renamed from: a */
    public final long f15696a;

    public /* synthetic */ C3100j(long j6) {
        this.f15696a = j6;
    }

    /* renamed from: a */
    public static final boolean m4783a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final long m4784b(long j6, long j7) {
        return ((((int) (j6 >> 32)) - ((int) (j7 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) - ((int) (j7 & 4294967295L))) & 4294967295L);
    }

    /* renamed from: c */
    public static final long m4785c(long j6, long j7) {
        return ((((int) (j6 >> 32)) + ((int) (j7 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) + ((int) (j7 & 4294967295L))) & 4294967295L);
    }

    /* renamed from: d */
    public static String m4786d(long j6) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j6 >> 32));
        sb.append(", ");
        return AbstractC2487d.m4045i(sb, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3100j) {
            if (this.f15696a != ((C3100j) obj).f15696a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15696a);
    }

    public final String toString() {
        return m4786d(this.f15696a);
    }
}
