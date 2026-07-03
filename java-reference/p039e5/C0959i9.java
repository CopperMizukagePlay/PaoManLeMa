package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i9 */
/* loaded from: classes.dex */
public final class C0959i9 {

    /* renamed from: a */
    public final String f4779a;

    /* renamed from: b */
    public final boolean f4780b;

    /* renamed from: c */
    public final EnumC0704a9 f4781c;

    /* renamed from: d */
    public final int f4782d;

    /* renamed from: e */
    public final int f4783e;

    /* renamed from: f */
    public final EnumC1452y8 f4784f;

    /* renamed from: g */
    public final int f4785g;

    /* renamed from: h */
    public final int f4786h;

    /* renamed from: i */
    public final EnumC1390w8 f4787i;

    /* renamed from: j */
    public final boolean f4788j;

    /* renamed from: k */
    public final boolean f4789k;

    /* renamed from: l */
    public final int f4790l;

    public C0959i9(String str, boolean z7, EnumC0704a9 enumC0704a9, int i7, int i8, EnumC1452y8 enumC1452y8, int i9, int i10, EnumC1390w8 enumC1390w8, boolean z8, boolean z9, int i11) {
        AbstractC3367j.m5100e(enumC0704a9, "networkStack");
        AbstractC3367j.m5100e(enumC1452y8, "httpProtocol");
        AbstractC3367j.m5100e(enumC1390w8, "dnsMode");
        this.f4779a = str;
        this.f4780b = z7;
        this.f4781c = enumC0704a9;
        this.f4782d = i7;
        this.f4783e = i8;
        this.f4784f = enumC1452y8;
        this.f4785g = i9;
        this.f4786h = i10;
        this.f4787i = enumC1390w8;
        this.f4788j = z8;
        this.f4789k = z9;
        this.f4790l = i11;
    }

    /* renamed from: a */
    public static C0959i9 m1601a(C0959i9 c0959i9, String str, boolean z7, EnumC0704a9 enumC0704a9, int i7, int i8, EnumC1452y8 enumC1452y8, int i9, int i10, EnumC1390w8 enumC1390w8, boolean z8, boolean z9, int i11, int i12) {
        EnumC0704a9 enumC0704a92;
        int i13;
        int i14;
        EnumC1452y8 enumC1452y82;
        int i15;
        int i16;
        EnumC1390w8 enumC1390w82;
        boolean z10;
        boolean z11;
        int i17;
        if ((i12 & 1) != 0) {
            str = c0959i9.f4779a;
        }
        String str2 = str;
        if ((i12 & 2) != 0) {
            z7 = c0959i9.f4780b;
        }
        boolean z12 = z7;
        if ((i12 & 4) != 0) {
            enumC0704a92 = c0959i9.f4781c;
        } else {
            enumC0704a92 = enumC0704a9;
        }
        if ((i12 & 8) != 0) {
            i13 = c0959i9.f4782d;
        } else {
            i13 = i7;
        }
        if ((i12 & 16) != 0) {
            i14 = c0959i9.f4783e;
        } else {
            i14 = i8;
        }
        if ((i12 & 32) != 0) {
            enumC1452y82 = c0959i9.f4784f;
        } else {
            enumC1452y82 = enumC1452y8;
        }
        if ((i12 & 64) != 0) {
            i15 = c0959i9.f4785g;
        } else {
            i15 = i9;
        }
        if ((i12 & 128) != 0) {
            i16 = c0959i9.f4786h;
        } else {
            i16 = i10;
        }
        if ((i12 & 256) != 0) {
            enumC1390w82 = c0959i9.f4787i;
        } else {
            enumC1390w82 = enumC1390w8;
        }
        if ((i12 & 512) != 0) {
            z10 = c0959i9.f4788j;
        } else {
            z10 = z8;
        }
        if ((i12 & 1024) != 0) {
            z11 = c0959i9.f4789k;
        } else {
            z11 = z9;
        }
        if ((i12 & 2048) != 0) {
            i17 = c0959i9.f4790l;
        } else {
            i17 = i11;
        }
        c0959i9.getClass();
        AbstractC3367j.m5100e(enumC0704a92, "networkStack");
        AbstractC3367j.m5100e(enumC1452y82, "httpProtocol");
        AbstractC3367j.m5100e(enumC1390w82, "dnsMode");
        return new C0959i9(str2, z12, enumC0704a92, i13, i14, enumC1452y82, i15, i16, enumC1390w82, z10, z11, i17);
    }

    /* renamed from: b */
    public final boolean m1602b() {
        return this.f4788j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959i9)) {
            return false;
        }
        C0959i9 c0959i9 = (C0959i9) obj;
        if (AbstractC3367j.m5096a(this.f4779a, c0959i9.f4779a) && this.f4780b == c0959i9.f4780b && this.f4781c == c0959i9.f4781c && this.f4782d == c0959i9.f4782d && this.f4783e == c0959i9.f4783e && this.f4784f == c0959i9.f4784f && this.f4785g == c0959i9.f4785g && this.f4786h == c0959i9.f4786h && this.f4787i == c0959i9.f4787i && this.f4788j == c0959i9.f4788j && this.f4789k == c0959i9.f4789k && this.f4790l == c0959i9.f4790l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4790l) + AbstractC2487d.m4040d(AbstractC2487d.m4040d((this.f4787i.hashCode() + AbstractC2647h.m4255a(this.f4786h, AbstractC2647h.m4255a(this.f4785g, (this.f4784f.hashCode() + AbstractC2647h.m4255a(this.f4783e, AbstractC2647h.m4255a(this.f4782d, (this.f4781c.hashCode() + AbstractC2487d.m4040d(this.f4779a.hashCode() * 31, 31, this.f4780b)) * 31, 31), 31)) * 31, 31), 31)) * 31, 31, this.f4788j), 31, this.f4789k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloaderSettingsSnapshot(directoryUri=");
        sb.append(this.f4779a);
        sb.append(", pureMode=");
        sb.append(this.f4780b);
        sb.append(", networkStack=");
        sb.append(this.f4781c);
        sb.append(", workersPerServer=");
        sb.append(this.f4782d);
        sb.append(", maxWorkers=");
        sb.append(this.f4783e);
        sb.append(", httpProtocol=");
        sb.append(this.f4784f);
        sb.append(", bufferSizeKb=");
        AbstractC0094y0.m192s(sb, this.f4785g, ", maxTailHedges=", this.f4786h, ", dnsMode=");
        sb.append(this.f4787i);
        sb.append(", launchDirectly=");
        sb.append(this.f4788j);
        sb.append(", autoStartDownloads=");
        sb.append(this.f4789k);
        sb.append(", maxConcurrentDownloads=");
        sb.append(this.f4790l);
        sb.append(")");
        return sb.toString();
    }
}
