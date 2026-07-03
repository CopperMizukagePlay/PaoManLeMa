package p039e5;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1687f;
import p060h5.AbstractC1806n;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qo */
/* loaded from: classes.dex */
public abstract class AbstractC1220qo {

    /* renamed from: a */
    public static final List f7143a = AbstractC1806n.m3067O(new C1687f("16ms 极速", 16L), new C1687f("33ms", 33L), new C1687f("50ms", 50L), new C1687f("100ms", 100L), new C1687f("250ms", 250L), new C1687f("500ms", 500L), new C1687f("1000ms 标准", 1000L));

    /* renamed from: a */
    public static long m2156a(String str) {
        Object obj;
        AbstractC3367j.m5100e(str, "text");
        String lowerCase = AbstractC0444k.m956t0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        if (!AbstractC0444k.m937a0(lowerCase)) {
            Iterator it = f7143a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC0451r.m966H((String) ((C1687f) obj).f10471e, lowerCase)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C1687f c1687f = (C1687f) obj;
            if (c1687f != null) {
                return ((Number) c1687f.f10472f).longValue();
            }
            Long m974P = AbstractC0451r.m974P(AbstractC0444k.m956t0(AbstractC0444k.m944h0(AbstractC0444k.m944h0(AbstractC0444k.m944h0(AbstractC0444k.m944h0(lowerCase, "ms"), "毫秒"), "s"), "秒")).toString());
            if (m974P != null) {
                long longValue = m974P.longValue();
                if (AbstractC0451r.m965G(lowerCase, "s", false) && !AbstractC0451r.m965G(lowerCase, "ms", false)) {
                    longValue *= 1000;
                }
                return AbstractC2168e.m3531r(longValue, 16L, 5000L);
            }
            return 250L;
        }
        return 250L;
    }

    /* renamed from: b */
    public static String m2157b(long j6) {
        Object obj;
        String str;
        Iterator it = f7143a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Number) ((C1687f) obj).f10472f).longValue() == j6) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1687f c1687f = (C1687f) obj;
        if (c1687f != null && (str = (String) c1687f.f10471e) != null) {
            return str;
        }
        return j6 + "ms";
    }
}
