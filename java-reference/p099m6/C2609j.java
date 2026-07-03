package p099m6;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p136r6.AbstractC3067d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.j */
/* loaded from: classes.dex */
public final class C2609j {

    /* renamed from: j */
    public static final Pattern f14114j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f14115k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f14116l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f14117m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f14118a;

    /* renamed from: b */
    public final String f14119b;

    /* renamed from: c */
    public final long f14120c;

    /* renamed from: d */
    public final String f14121d;

    /* renamed from: e */
    public final String f14122e;

    /* renamed from: f */
    public final boolean f14123f;

    /* renamed from: g */
    public final boolean f14124g;

    /* renamed from: h */
    public final boolean f14125h;

    /* renamed from: i */
    public final boolean f14126i;

    public C2609j(String str, String str2, long j6, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f14118a = str;
        this.f14119b = str2;
        this.f14120c = j6;
        this.f14121d = str3;
        this.f14122e = str4;
        this.f14123f = z7;
        this.f14124g = z8;
        this.f14125h = z9;
        this.f14126i = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2609j) {
            C2609j c2609j = (C2609j) obj;
            if (AbstractC3367j.m5096a(c2609j.f14118a, this.f14118a) && AbstractC3367j.m5096a(c2609j.f14119b, this.f14119b) && c2609j.f14120c == this.f14120c && AbstractC3367j.m5096a(c2609j.f14121d, this.f14121d) && AbstractC3367j.m5096a(c2609j.f14122e, this.f14122e) && c2609j.f14123f == this.f14123f && c2609j.f14124g == this.f14124g && c2609j.f14125h == this.f14125h && c2609j.f14126i == this.f14126i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14126i) + AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC2487d.m4039c(AbstractC0094y0.m175b(AbstractC0094y0.m175b(527, 31, this.f14118a), 31, this.f14119b), 31, this.f14120c), 31, this.f14121d), 31, this.f14122e), 31, this.f14123f), 31, this.f14124g), 31, this.f14125h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14118a);
        sb.append('=');
        sb.append(this.f14119b);
        if (this.f14125h) {
            long j6 = this.f14120c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) AbstractC3067d.f15662a.get()).format(new Date(j6));
                AbstractC3367j.m5099d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f14126i) {
            sb.append("; domain=");
            sb.append(this.f14121d);
        }
        sb.append("; path=");
        sb.append(this.f14122e);
        if (this.f14123f) {
            sb.append("; secure");
        }
        if (this.f14124g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString()");
        return sb2;
    }
}
