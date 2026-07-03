package p099m6;

import java.util.LinkedHashMap;
import java.util.Map;
import p053g5.C1687f;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1817y;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.a0 */
/* loaded from: classes.dex */
public final class C2592a0 {

    /* renamed from: a */
    public final C2619t f14018a;

    /* renamed from: b */
    public final String f14019b;

    /* renamed from: c */
    public final C2617r f14020c;

    /* renamed from: d */
    public final AbstractC2595c f14021d;

    /* renamed from: e */
    public final Map f14022e;

    /* renamed from: f */
    public C2597d f14023f;

    public C2592a0(C2619t c2619t, String str, C2617r c2617r, AbstractC2595c abstractC2595c, Map map) {
        AbstractC3367j.m5100e(c2619t, "url");
        AbstractC3367j.m5100e(str, "method");
        this.f14018a = c2619t;
        this.f14019b = str;
        this.f14020c = c2617r;
        this.f14021d = abstractC2595c;
        this.f14022e = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m6.z, java.lang.Object] */
    /* renamed from: a */
    public final C2625z m4122a() {
        LinkedHashMap m3089U;
        ?? obj = new Object();
        obj.f14234e = new LinkedHashMap();
        obj.f14230a = this.f14018a;
        obj.f14231b = this.f14019b;
        obj.f14233d = this.f14021d;
        Map map = this.f14022e;
        if (map.isEmpty()) {
            m3089U = new LinkedHashMap();
        } else {
            m3089U = AbstractC1817y.m3089U(map);
        }
        obj.f14234e = m3089U;
        obj.f14232c = this.f14020c.m4166c();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f14019b);
        sb.append(", url=");
        sb.append(this.f14018a);
        C2617r c2617r = this.f14020c;
        if (c2617r.size() != 0) {
            sb.append(", headers=[");
            int i7 = 0;
            for (Object obj : c2617r) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    C1687f c1687f = (C1687f) obj;
                    String str = (String) c1687f.f10471e;
                    String str2 = (String) c1687f.f10472f;
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i7 = i8;
                } else {
                    AbstractC1806n.m3072T();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f14022e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
