package p039e5;

import java.io.File;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z1 */
/* loaded from: classes.dex */
public final class C1476z1 {

    /* renamed from: a */
    public final File f9812a;

    /* renamed from: b */
    public final long f9813b;

    /* renamed from: c */
    public final String f9814c;

    public C1476z1(File file, long j6, String str) {
        this.f9812a = file;
        this.f9813b = j6;
        this.f9814c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1476z1)) {
            return false;
        }
        C1476z1 c1476z1 = (C1476z1) obj;
        if (AbstractC3367j.m5096a(this.f9812a, c1476z1.f9812a) && this.f9813b == c1476z1.f9813b && AbstractC3367j.m5096a(this.f9814c, c1476z1.f9814c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9814c.hashCode() + AbstractC2487d.m4039c(this.f9812a.hashCode() * 31, 31, this.f9813b);
    }

    public final String toString() {
        return "CrashLogEntry(file=" + this.f9812a + ", timestamp=" + this.f9813b + ", displayName=" + this.f9814c + ")";
    }
}
