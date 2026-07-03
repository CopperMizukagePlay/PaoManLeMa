package p092m;

import java.util.LinkedHashMap;
import java.util.Map;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.v */
/* loaded from: classes.dex */
public final class C2506v {

    /* renamed from: b */
    public static final C2506v f13848b = new C2506v(new C2488d0((C2508x) null, (C2495k) null, (LinkedHashMap) null, 63));

    /* renamed from: a */
    public final C2488d0 f13849a;

    public C2506v(C2488d0 c2488d0) {
        this.f13849a = c2488d0;
    }

    /* renamed from: a */
    public final C2506v m4063a(C2506v c2506v) {
        C2488d0 c2488d0 = c2506v.f13849a;
        C2508x c2508x = c2488d0.f13787a;
        C2488d0 c2488d02 = this.f13849a;
        if (c2508x == null) {
            c2508x = c2488d02.f13787a;
        }
        C2495k c2495k = c2488d0.f13788b;
        if (c2495k == null) {
            c2495k = c2488d02.f13788b;
        }
        Map map = c2488d02.f13790d;
        Map map2 = c2488d0.f13790d;
        AbstractC3367j.m5100e(map, "<this>");
        AbstractC3367j.m5100e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C2506v(new C2488d0(c2508x, c2495k, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2506v) && AbstractC3367j.m5096a(((C2506v) obj).f13849a, this.f13849a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13849a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        if (equals(f13848b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C2488d0 c2488d0 = this.f13849a;
        C2508x c2508x = c2488d0.f13787a;
        if (c2508x != null) {
            str = c2508x.toString();
        } else {
            str = null;
        }
        AbstractC2487d.m4057u(sb, str, ",\nSlide - ", null, ",\nShrink - ");
        C2495k c2495k = c2488d0.f13788b;
        if (c2495k != null) {
            str2 = c2495k.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
