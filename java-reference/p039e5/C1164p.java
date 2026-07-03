package p039e5;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.p */
/* loaded from: classes.dex */
public final class C1164p {

    /* renamed from: a */
    public final long f6743a;

    /* renamed from: b */
    public final boolean f6744b;

    /* renamed from: c */
    public final String f6745c;

    public C1164p(long j6, boolean z7, String str) {
        this.f6743a = j6;
        this.f6744b = z7;
        this.f6745c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164p)) {
            return false;
        }
        C1164p c1164p = (C1164p) obj;
        if (this.f6743a == c1164p.f6743a && this.f6744b == c1164p.f6744b && AbstractC3367j.m5096a(this.f6745c, c1164p.f6745c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(Long.hashCode(this.f6743a) * 31, 31, this.f6744b);
        String str = this.f6745c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return m4040d + hashCode;
    }

    public final String toString() {
        return "RemoteInfo(length=" + this.f6743a + ", rangeSupported=" + this.f6744b + ", fileName=" + this.f6745c + ")";
    }
}
