package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xm */
/* loaded from: classes.dex */
public final class C1435xm {

    /* renamed from: a */
    public final String f8842a;

    /* renamed from: b */
    public final String f8843b;

    /* renamed from: c */
    public final String f8844c;

    /* renamed from: d */
    public final EnumC1070lt f8845d;

    public C1435xm(String str, String str2, String str3, EnumC1070lt enumC1070lt) {
        AbstractC3367j.m5100e(str, "id");
        AbstractC3367j.m5100e(str3, "interfaceName");
        this.f8842a = str;
        this.f8843b = str2;
        this.f8844c = str3;
        this.f8845d = enumC1070lt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1435xm)) {
            return false;
        }
        C1435xm c1435xm = (C1435xm) obj;
        if (AbstractC3367j.m5096a(this.f8842a, c1435xm.f8842a) && AbstractC3367j.m5096a(this.f8843b, c1435xm.f8843b) && AbstractC3367j.m5096a(this.f8844c, c1435xm.f8844c) && this.f8845d == c1435xm.f8845d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8845d.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f8842a.hashCode() * 31, 31, this.f8843b), 31, this.f8844c);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("QueueMonitorTarget(id=", this.f8842a, ", displayName=", this.f8843b, ", interfaceName=");
        m189p.append(this.f8844c);
        m189p.append(", transport=");
        m189p.append(this.f8845d);
        m189p.append(")");
        return m189p.toString();
    }
}
