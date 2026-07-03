package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wm */
/* loaded from: classes.dex */
public final class C1404wm {

    /* renamed from: a */
    public final String f8498a;

    /* renamed from: b */
    public final String f8499b;

    /* renamed from: c */
    public final String f8500c;

    /* renamed from: d */
    public final boolean f8501d;

    /* renamed from: e */
    public final boolean f8502e;

    public C1404wm(String str, String str2, String str3, boolean z7, boolean z8) {
        AbstractC3367j.m5100e(str, "targetName");
        this.f8498a = str;
        this.f8499b = str2;
        this.f8500c = str3;
        this.f8501d = z7;
        this.f8502e = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404wm)) {
            return false;
        }
        C1404wm c1404wm = (C1404wm) obj;
        if (AbstractC3367j.m5096a(this.f8498a, c1404wm.f8498a) && AbstractC3367j.m5096a(this.f8499b, c1404wm.f8499b) && AbstractC3367j.m5096a(this.f8500c, c1404wm.f8500c) && this.f8501d == c1404wm.f8501d && this.f8502e == c1404wm.f8502e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f8498a.hashCode() * 31;
        int i7 = 0;
        String str = this.f8499b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        String str2 = this.f8500c;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return Boolean.hashCode(this.f8502e) + AbstractC2487d.m4040d((i8 + i7) * 31, 31, this.f8501d);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("PublicIpTargetDisplay(targetName=", this.f8498a, ", ipv4Value=", this.f8499b, ", ipv6Value=");
        m189p.append(this.f8500c);
        m189p.append(", ipv4Loading=");
        m189p.append(this.f8501d);
        m189p.append(", ipv6Loading=");
        m189p.append(this.f8502e);
        m189p.append(")");
        return m189p.toString();
    }
}
