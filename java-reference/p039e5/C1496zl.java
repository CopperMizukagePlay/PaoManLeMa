package p039e5;

import java.util.Locale;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0451r;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zl */
/* loaded from: classes.dex */
public final class C1496zl {

    /* renamed from: a */
    public final String f9915a;

    /* renamed from: b */
    public final EnumC1163ot f9916b;

    /* renamed from: c */
    public final int f9917c;

    /* renamed from: d */
    public final int f9918d;

    /* renamed from: e */
    public final int f9919e;

    /* renamed from: f */
    public final int f9920f;

    /* renamed from: g */
    public final String f9921g;

    /* renamed from: h */
    public final String f9922h;

    /* renamed from: i */
    public final int f9923i;

    /* renamed from: j */
    public final int f9924j;

    /* renamed from: k */
    public final int f9925k;

    public C1496zl(String str, EnumC1163ot enumC1163ot, int i7, int i8, int i9, String str2, int i10) {
        String str3;
        String language = Locale.getDefault().getLanguage();
        AbstractC3367j.m5099d(language, "getLanguage(...)");
        if (AbstractC0451r.m971M(language, "zh", false)) {
            str3 = "cn";
        } else {
            str3 = "en";
        }
        AbstractC3367j.m5100e(enumC1163ot, "protocol");
        this.f9915a = str;
        this.f9916b = enumC1163ot;
        this.f9917c = i7;
        this.f9918d = 5;
        this.f9919e = i8;
        this.f9920f = i9;
        this.f9921g = str2;
        this.f9922h = str3;
        this.f9923i = i10;
        this.f9924j = 20;
        this.f9925k = 50;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1496zl) {
                C1496zl c1496zl = (C1496zl) obj;
                if (!AbstractC3367j.m5096a(this.f9915a, c1496zl.f9915a) || this.f9916b != c1496zl.f9916b || this.f9917c != c1496zl.f9917c || this.f9918d != c1496zl.f9918d || this.f9919e != c1496zl.f9919e || this.f9920f != c1496zl.f9920f || !AbstractC3367j.m5096a(this.f9921g, c1496zl.f9921g) || !AbstractC3367j.m5096a(this.f9922h, c1496zl.f9922h) || this.f9923i != c1496zl.f9923i || this.f9924j != c1496zl.f9924j || this.f9925k != c1496zl.f9925k) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9925k) + AbstractC2647h.m4255a(this.f9924j, AbstractC2647h.m4255a(this.f9923i, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC2647h.m4255a(this.f9920f, AbstractC2647h.m4255a(this.f9919e, AbstractC2647h.m4255a(this.f9918d, AbstractC2647h.m4255a(this.f9917c, (this.f9916b.hashCode() + (this.f9915a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31, this.f9921g), 31, this.f9922h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextTraceTraceOptions(target=");
        sb.append(this.f9915a);
        sb.append(", protocol=");
        sb.append(this.f9916b);
        sb.append(", maxHops=");
        AbstractC0094y0.m192s(sb, this.f9917c, ", queries=", this.f9918d, ", timeoutMs=");
        AbstractC0094y0.m192s(sb, this.f9919e, ", port=", this.f9920f, ", dataProvider=");
        AbstractC2487d.m4057u(sb, this.f9921g, ", language=", this.f9922h, ", parallelRequests=");
        AbstractC0094y0.m192s(sb, this.f9923i, ", packetIntervalMs=", this.f9924j, ", ttlIntervalMs=");
        sb.append(this.f9925k);
        sb.append(")");
        return sb.toString();
    }
}
