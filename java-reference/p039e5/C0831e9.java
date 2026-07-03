package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.e9 */
/* loaded from: classes.dex */
public final class C0831e9 {

    /* renamed from: a */
    public final int f3659a;

    /* renamed from: b */
    public final long f3660b;

    /* renamed from: c */
    public final long f3661c;

    /* renamed from: d */
    public final long f3662d;

    /* renamed from: e */
    public final long f3663e;

    /* renamed from: f */
    public final String f3664f;

    /* renamed from: g */
    public final String f3665g;

    public C0831e9(int i7, long j6, long j7, long j8, long j9, String str, String str2) {
        this.f3659a = i7;
        this.f3660b = j6;
        this.f3661c = j7;
        this.f3662d = j8;
        this.f3663e = j9;
        this.f3664f = str;
        this.f3665g = str2;
    }

    /* renamed from: a */
    public static C0831e9 m1519a(C0831e9 c0831e9, long j6, long j7, long j8, long j9, String str, String str2, int i7) {
        long j10 = j6;
        int i8 = c0831e9.f3659a;
        if ((i7 & 2) != 0) {
            j10 = c0831e9.f3660b;
        }
        if ((i7 & 4) != 0) {
            j7 = c0831e9.f3661c;
        }
        if ((i7 & 8) != 0) {
            j8 = c0831e9.f3662d;
        }
        if ((i7 & 16) != 0) {
            j9 = c0831e9.f3663e;
        }
        if ((i7 & 32) != 0) {
            str = c0831e9.f3664f;
        }
        if ((i7 & 64) != 0) {
            str2 = c0831e9.f3665g;
        }
        String str3 = str2;
        c0831e9.getClass();
        AbstractC3367j.m5100e(str, "serverAddress");
        AbstractC3367j.m5100e(str3, "status");
        return new C0831e9(i8, j10, j7, j8, j9, str, str3);
    }

    /* renamed from: b */
    public final long m1520b() {
        long j6 = this.f3661c;
        long j7 = this.f3660b;
        if (j6 >= j7) {
            return (j6 - j7) + 1;
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0831e9)) {
            return false;
        }
        C0831e9 c0831e9 = (C0831e9) obj;
        if (this.f3659a == c0831e9.f3659a && this.f3660b == c0831e9.f3660b && this.f3661c == c0831e9.f3661c && this.f3662d == c0831e9.f3662d && this.f3663e == c0831e9.f3663e && AbstractC3367j.m5096a(this.f3664f, c0831e9.f3664f) && AbstractC3367j.m5096a(this.f3665g, c0831e9.f3665g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3665g.hashCode() + AbstractC0094y0.m175b(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Integer.hashCode(this.f3659a) * 31, 31, this.f3660b), 31, this.f3661c), 31, this.f3662d), 31, this.f3663e), 31, this.f3664f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadWorkerState(index=");
        sb.append(this.f3659a);
        sb.append(", rangeStart=");
        sb.append(this.f3660b);
        AbstractC2487d.m4056t(sb, ", rangeEnd=", this.f3661c, ", downloadedBytes=");
        sb.append(this.f3662d);
        AbstractC2487d.m4056t(sb, ", speedBytesPerSecond=", this.f3663e, ", serverAddress=");
        sb.append(this.f3664f);
        sb.append(", status=");
        sb.append(this.f3665g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C0831e9(int i7, long j6, long j7, long j8, String str, String str2) {
        this(i7, j6, j7, j8, 0L, str, str2);
    }
}
