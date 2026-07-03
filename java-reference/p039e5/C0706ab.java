package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ab */
/* loaded from: classes.dex */
public final class C0706ab {

    /* renamed from: a */
    public final int f2351a;

    /* renamed from: b */
    public final int f2352b;

    /* renamed from: c */
    public final int f2353c;

    /* renamed from: d */
    public final int f2354d;

    /* renamed from: e */
    public final int f2355e;

    /* renamed from: f */
    public final int f2356f;

    /* renamed from: g */
    public final int f2357g;

    /* renamed from: h */
    public final int f2358h;

    /* renamed from: i */
    public final boolean f2359i;

    /* renamed from: j */
    public final int f2360j;

    public C0706ab(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, int i15) {
        this.f2351a = i7;
        this.f2352b = i8;
        this.f2353c = i9;
        this.f2354d = i10;
        this.f2355e = i11;
        this.f2356f = i12;
        this.f2357g = i13;
        this.f2358h = i14;
        this.f2359i = z7;
        this.f2360j = i15;
    }

    /* renamed from: a */
    public static C0706ab m1495a(C0706ab c0706ab, boolean z7, int i7, int i8) {
        int i9 = c0706ab.f2351a;
        int i10 = c0706ab.f2352b;
        int i11 = c0706ab.f2353c;
        int i12 = c0706ab.f2354d;
        int i13 = c0706ab.f2355e;
        int i14 = c0706ab.f2356f;
        int i15 = c0706ab.f2357g;
        int i16 = c0706ab.f2358h;
        if ((i8 & 512) != 0) {
            i7 = c0706ab.f2360j;
        }
        c0706ab.getClass();
        return new C0706ab(i9, i10, i11, i12, i13, i14, i15, i16, z7, i7);
    }

    /* renamed from: b */
    public final int m1496b() {
        return this.f2352b;
    }

    /* renamed from: c */
    public final int m1497c() {
        return this.f2354d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0706ab)) {
            return false;
        }
        C0706ab c0706ab = (C0706ab) obj;
        if (this.f2351a == c0706ab.f2351a && this.f2352b == c0706ab.f2352b && this.f2353c == c0706ab.f2353c && this.f2354d == c0706ab.f2354d && this.f2355e == c0706ab.f2355e && this.f2356f == c0706ab.f2356f && this.f2357g == c0706ab.f2357g && this.f2358h == c0706ab.f2358h && this.f2359i == c0706ab.f2359i && this.f2360j == c0706ab.f2360j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2360j) + AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f2358h, AbstractC2647h.m4255a(this.f2357g, AbstractC2647h.m4255a(this.f2356f, AbstractC2647h.m4255a(this.f2355e, AbstractC2647h.m4255a(this.f2354d, AbstractC2647h.m4255a(this.f2353c, AbstractC2647h.m4255a(this.f2352b, Integer.hashCode(this.f2351a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f2359i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineTuningConfig(downloadMinWorkersPerUrl=");
        sb.append(this.f2351a);
        sb.append(", downloadMaxWorkersPerUrl=");
        sb.append(this.f2352b);
        sb.append(", uploadMinWorkersPerUrl=");
        AbstractC0094y0.m192s(sb, this.f2353c, ", uploadMaxWorkersPerUrl=", this.f2354d, ", downloadBufferKb=");
        AbstractC0094y0.m192s(sb, this.f2355e, ", uploadBufferKb=", this.f2356f, ", highThroughputWorkerBudget=");
        AbstractC0094y0.m192s(sb, this.f2357g, ", maxWorkerThreads=", this.f2358h, ", singleLocalPortEnabled=");
        sb.append(this.f2359i);
        sb.append(", singleLocalPort=");
        sb.append(this.f2360j);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C0706ab(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, int i15, int i16) {
        this((i16 & 1) != 0 ? 12 : i7, (i16 & 2) != 0 ? 20 : i8, (i16 & 4) != 0 ? 4 : i9, (i16 & 8) != 0 ? 10 : i10, (i16 & 16) != 0 ? 10 : i11, (i16 & 32) == 0 ? i12 : 10, (i16 & 64) != 0 ? 32 : i13, (i16 & 128) != 0 ? 256 : i14, (i16 & 256) != 0 ? false : z7, (i16 & 512) != 0 ? 40000 : i15);
    }
}
