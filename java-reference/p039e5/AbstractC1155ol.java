package p039e5;

import java.net.URI;
import java.util.regex.Pattern;
import p024c6.AbstractC0444k;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ol */
/* loaded from: classes.dex */
public abstract class AbstractC1155ol {

    /* renamed from: a */
    public static final Pattern f6638a = Pattern.compile("^(?!255\\.255\\.255\\.255$)([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$");

    /* renamed from: b */
    public static final Pattern f6639b = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    public static final Pattern f6640c = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4})*)?)::((([0-9A-Fa-f]{1,4}:)*[0-9A-Fa-f]{1,4})?)$");

    /* renamed from: d */
    public static final Pattern f6641d = Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z][A-Za-z0-9]*)$");

    /* renamed from: a */
    public static EnumC1124nl m2013a(String str) {
        AbstractC3367j.m5100e(str, "input");
        String m2015c = m2015c(str);
        if (f6638a.matcher(m2015c).matches()) {
            return EnumC1124nl.f6339e;
        }
        if (!f6639b.matcher(m2015c).matches() && !f6640c.matcher(m2015c).matches()) {
            if (f6641d.matcher(m2015c).matches()) {
                return EnumC1124nl.f6341g;
            }
            return EnumC1124nl.f6342h;
        }
        return EnumC1124nl.f6340f;
    }

    /* renamed from: b */
    public static boolean m2014b(String str) {
        AbstractC3367j.m5100e(str, "input");
        if (m2013a(str) != EnumC1124nl.f6342h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [g5.h] */
    /* renamed from: c */
    public static String m2015c(String str) {
        String str2;
        AbstractC3367j.m5100e(str, "raw");
        String obj = AbstractC0444k.m956t0(str).toString();
        if (obj.length() == 0) {
            return obj;
        }
        if (AbstractC0444k.m928R(obj, "://", false)) {
            try {
                String host = new URI(obj).getHost();
                String str3 = host;
                if (host == null) {
                    str3 = "";
                }
                boolean m937a0 = AbstractC0444k.m937a0(str3);
                str2 = str3;
                if (m937a0) {
                    str2 = obj;
                }
            } catch (Throwable th) {
                str2 = AbstractC1793a0.m2985m(th);
            }
            if (!(str2 instanceof C1689h)) {
                obj = str2;
            }
            return obj;
        }
        return AbstractC0444k.m944h0(AbstractC0444k.m943g0(obj, "["), "]");
    }
}
