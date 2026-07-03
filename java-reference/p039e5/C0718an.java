package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.an */
/* loaded from: classes.dex */
public final class C0718an {

    /* renamed from: a */
    public final long f2448a;

    /* renamed from: b */
    public final String f2449b;

    /* renamed from: c */
    public final String f2450c;

    /* renamed from: d */
    public final double f2451d;

    /* renamed from: e */
    public final EnumC1466ym f2452e;

    /* renamed from: f */
    public final long f2453f;

    /* renamed from: g */
    public final long f2454g;

    /* renamed from: h */
    public final long f2455h;

    /* renamed from: i */
    public final long f2456i;

    /* renamed from: j */
    public final long f2457j;

    /* renamed from: k */
    public final long f2458k;

    /* renamed from: l */
    public final long f2459l;

    /* renamed from: m */
    public final double f2460m;

    /* renamed from: n */
    public final double f2461n;

    /* renamed from: o */
    public final double f2462o;

    /* renamed from: p */
    public final double f2463p;

    /* renamed from: q */
    public final double f2464q;

    /* renamed from: r */
    public final double f2465r;

    /* renamed from: s */
    public final double f2466s;

    /* renamed from: t */
    public final double f2467t;

    /* renamed from: u */
    public final double f2468u;

    /* renamed from: v */
    public final boolean f2469v;

    /* renamed from: w */
    public final String f2470w;

    public C0718an(long j6, String str, String str2, double d7, EnumC1466ym enumC1466ym, long j7, long j8, long j9, long j10, long j11, long j12, long j13, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z7, String str3, int i7) {
        long currentTimeMillis = (i7 & 1) != 0 ? System.currentTimeMillis() : j6;
        String str4 = (i7 & 2) != 0 ? "" : str;
        String str5 = (i7 & 4) == 0 ? str2 : "";
        double d17 = (i7 & 8) != 0 ? 0.0d : d7;
        EnumC1466ym enumC1466ym2 = (i7 & 16) != 0 ? EnumC1466ym.f9458f : enumC1466ym;
        long j14 = (i7 & 32) != 0 ? 0L : j7;
        long j15 = (i7 & 64) != 0 ? 0L : j8;
        long j16 = (i7 & 128) != 0 ? 0L : j9;
        long j17 = (i7 & 256) != 0 ? 0L : j10;
        long j18 = (i7 & 512) != 0 ? 0L : j11;
        long j19 = (i7 & 1024) != 0 ? 0L : j12;
        long j20 = (i7 & 2048) != 0 ? 0L : j13;
        double d18 = (i7 & 4096) != 0 ? 0.0d : d8;
        double d19 = (i7 & 8192) != 0 ? 0.0d : d9;
        double d20 = (i7 & 16384) != 0 ? 0.0d : d10;
        double d21 = (32768 & i7) != 0 ? 0.0d : d11;
        double d22 = (65536 & i7) != 0 ? 0.0d : d12;
        double d23 = (131072 & i7) != 0 ? 0.0d : d13;
        double d24 = (262144 & i7) != 0 ? 0.0d : d14;
        double d25 = (524288 & i7) != 0 ? 0.0d : d15;
        double d26 = (1048576 & i7) != 0 ? 0.0d : d16;
        String str6 = (i7 & 4194304) != 0 ? null : str3;
        AbstractC3367j.m5100e(str5, "interfaceName");
        this.f2448a = currentTimeMillis;
        this.f2449b = str4;
        this.f2450c = str5;
        this.f2451d = d17;
        this.f2452e = enumC1466ym2;
        this.f2453f = j14;
        this.f2454g = j15;
        this.f2455h = j16;
        this.f2456i = j17;
        this.f2457j = j18;
        this.f2458k = j19;
        this.f2459l = j20;
        this.f2460m = d18;
        this.f2461n = d19;
        this.f2462o = d20;
        this.f2463p = d21;
        this.f2464q = d22;
        this.f2465r = d23;
        this.f2466s = d24;
        this.f2467t = d25;
        this.f2468u = d26;
        this.f2469v = z7;
        this.f2470w = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0718an) {
                C0718an c0718an = (C0718an) obj;
                if (this.f2448a != c0718an.f2448a || !AbstractC3367j.m5096a(this.f2449b, c0718an.f2449b) || !AbstractC3367j.m5096a(this.f2450c, c0718an.f2450c) || Double.compare(this.f2451d, c0718an.f2451d) != 0 || this.f2452e != c0718an.f2452e || this.f2453f != c0718an.f2453f || this.f2454g != c0718an.f2454g || this.f2455h != c0718an.f2455h || this.f2456i != c0718an.f2456i || this.f2457j != c0718an.f2457j || this.f2458k != c0718an.f2458k || this.f2459l != c0718an.f2459l || Double.compare(this.f2460m, c0718an.f2460m) != 0 || Double.compare(this.f2461n, c0718an.f2461n) != 0 || Double.compare(this.f2462o, c0718an.f2462o) != 0 || Double.compare(this.f2463p, c0718an.f2463p) != 0 || Double.compare(this.f2464q, c0718an.f2464q) != 0 || Double.compare(this.f2465r, c0718an.f2465r) != 0 || Double.compare(this.f2466s, c0718an.f2466s) != 0 || Double.compare(this.f2467t, c0718an.f2467t) != 0 || Double.compare(this.f2468u, c0718an.f2468u) != 0 || this.f2469v != c0718an.f2469v || !AbstractC3367j.m5096a(this.f2470w, c0718an.f2470w)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(AbstractC0094y0.m174a(this.f2468u, AbstractC0094y0.m174a(this.f2467t, AbstractC0094y0.m174a(this.f2466s, AbstractC0094y0.m174a(this.f2465r, AbstractC0094y0.m174a(this.f2464q, AbstractC0094y0.m174a(this.f2463p, AbstractC0094y0.m174a(this.f2462o, AbstractC0094y0.m174a(this.f2461n, AbstractC0094y0.m174a(this.f2460m, AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c((this.f2452e.hashCode() + AbstractC0094y0.m174a(this.f2451d, AbstractC0094y0.m175b(AbstractC0094y0.m175b(Long.hashCode(this.f2448a) * 31, 31, this.f2449b), 31, this.f2450c), 31)) * 31, 31, this.f2453f), 31, this.f2454g), 31, this.f2455h), 31, this.f2456i), 31, this.f2457j), 31, this.f2458k), 31, this.f2459l), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f2469v);
        String str = this.f2470w;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return m4040d + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueuePressureSnapshot(timestampMs=");
        sb.append(this.f2448a);
        sb.append(", displayName=");
        sb.append(this.f2449b);
        sb.append(", interfaceName=");
        sb.append(this.f2450c);
        sb.append(", pressureIndex=");
        sb.append(this.f2451d);
        sb.append(", level=");
        sb.append(this.f2452e);
        AbstractC2487d.m4056t(sb, ", qdiscBacklogBytes=", this.f2453f, ", qdiscDroppedTotal=");
        sb.append(this.f2454g);
        AbstractC2487d.m4056t(sb, ", qdiscRequeuesTotal=", this.f2455h, ", netdevTxDroppedTotal=");
        sb.append(this.f2456i);
        AbstractC2487d.m4056t(sb, ", netdevRxDroppedTotal=", this.f2457j, ", tcpRetransTotal=");
        sb.append(this.f2458k);
        AbstractC2487d.m4056t(sb, ", softnetSqueezeTotal=", this.f2459l, ", netdevDropRate=");
        sb.append(this.f2460m);
        AbstractC0094y0.m193t(sb, ", tcpRetransRate=", this.f2461n, ", qdiscRequeueRate=");
        sb.append(this.f2462o);
        AbstractC0094y0.m193t(sb, ", softnetSqueezeRate=", this.f2463p, ", backlogScore=");
        sb.append(this.f2464q);
        AbstractC0094y0.m193t(sb, ", dropScore=", this.f2465r, ", retransScore=");
        sb.append(this.f2466s);
        AbstractC0094y0.m193t(sb, ", requeueScore=", this.f2467t, ", squeezeScore=");
        sb.append(this.f2468u);
        sb.append(", monitorAvailable=");
        sb.append(this.f2469v);
        sb.append(", errorMessage=");
        sb.append(this.f2470w);
        sb.append(")");
        return sb.toString();
    }
}
