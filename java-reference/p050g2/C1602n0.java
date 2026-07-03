package p050g2;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.n0 */
/* loaded from: classes.dex */
public final class C1602n0 {

    /* renamed from: b */
    public static final long f10302b = AbstractC1586f0.m2558b(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f10303c = 0;

    /* renamed from: a */
    public final long f10304a;

    public /* synthetic */ C1602n0(long j6) {
        this.f10304a = j6;
    }

    /* renamed from: a */
    public static final boolean m2585a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m2586b(long j6) {
        if (((int) (j6 >> 32)) == ((int) (j6 & 4294967295L))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final int m2587c(long j6) {
        return m2588d(j6) - m2589e(j6);
    }

    /* renamed from: d */
    public static final int m2588d(long j6) {
        return Math.max((int) (j6 >> 32), (int) (j6 & 4294967295L));
    }

    /* renamed from: e */
    public static final int m2589e(long j6) {
        return Math.min((int) (j6 >> 32), (int) (j6 & 4294967295L));
    }

    /* renamed from: f */
    public static final boolean m2590f(long j6) {
        if (((int) (j6 >> 32)) > ((int) (j6 & 4294967295L))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m2591g(long j6) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j6 >> 32));
        sb.append(", ");
        return AbstractC2487d.m4045i(sb, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1602n0) {
            if (this.f10304a != ((C1602n0) obj).f10304a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10304a);
    }

    public final String toString() {
        return m2591g(this.f10304a);
    }
}
