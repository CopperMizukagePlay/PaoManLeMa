package p039e5;

import java.util.Locale;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jr */
/* loaded from: classes.dex */
public final class C1006jr {

    /* renamed from: a */
    public final String f5163a;

    /* renamed from: b */
    public final String f5164b;

    /* renamed from: c */
    public final Map f5165c;

    public C1006jr(String str, String str2, Map map) {
        AbstractC3367j.m5100e(str, "url");
        AbstractC3367j.m5100e(str2, "method");
        AbstractC3367j.m5100e(map, "headers");
        this.f5163a = str;
        this.f5164b = str2;
        this.f5165c = map;
    }

    /* renamed from: a */
    public static C1006jr m1617a(C1006jr c1006jr, String str) {
        String str2 = c1006jr.f5164b;
        Map map = c1006jr.f5165c;
        AbstractC3367j.m5100e(str, "url");
        AbstractC3367j.m5100e(str2, "method");
        AbstractC3367j.m5100e(map, "headers");
        return new C1006jr(str, str2, map);
    }

    /* renamed from: b */
    public final String m1618b() {
        String upperCase = AbstractC0444k.m956t0(this.f5164b).toString().toUpperCase(Locale.ROOT);
        AbstractC3367j.m5099d(upperCase, "toUpperCase(...)");
        if (AbstractC0444k.m937a0(upperCase)) {
            return "GET";
        }
        return upperCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006jr)) {
            return false;
        }
        C1006jr c1006jr = (C1006jr) obj;
        if (AbstractC3367j.m5096a(this.f5163a, c1006jr.f5163a) && AbstractC3367j.m5096a(this.f5164b, c1006jr.f5164b) && AbstractC3367j.m5096a(this.f5165c, c1006jr.f5165c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5165c.hashCode() + AbstractC0094y0.m175b(this.f5163a.hashCode() * 31, 31, this.f5164b);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("SpeedTestEndpoint(url=", this.f5163a, ", method=", this.f5164b, ", headers=");
        m189p.append(this.f5165c);
        m189p.append(")");
        return m189p.toString();
    }
}
