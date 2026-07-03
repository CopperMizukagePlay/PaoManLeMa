package p092m;

import java.util.LinkedHashMap;
import java.util.Map;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.w */
/* loaded from: classes.dex */
public final class C2507w {

    /* renamed from: b */
    public static final C2507w f13850b = new C2507w(new C2488d0((C2508x) null, (C2495k) null, (LinkedHashMap) null, 63));

    /* renamed from: c */
    public static final C2507w f13851c = new C2507w(new C2488d0((C2508x) null, (C2495k) null, (LinkedHashMap) null, 47));

    /* renamed from: a */
    public final C2488d0 f13852a;

    public C2507w(C2488d0 c2488d0) {
        this.f13852a = c2488d0;
    }

    /* renamed from: a */
    public final C2507w m4064a(C2507w c2507w) {
        boolean z7;
        C2488d0 c2488d0 = c2507w.f13852a;
        C2508x c2508x = c2488d0.f13787a;
        C2488d0 c2488d02 = this.f13852a;
        if (c2508x == null) {
            c2508x = c2488d02.f13787a;
        }
        C2495k c2495k = c2488d0.f13788b;
        if (c2495k == null) {
            c2495k = c2488d02.f13788b;
        }
        if (!c2488d0.f13789c && !c2488d02.f13789c) {
            z7 = false;
        } else {
            z7 = true;
        }
        Map map = c2488d02.f13790d;
        Map map2 = c2488d0.f13790d;
        AbstractC3367j.m5100e(map, "<this>");
        AbstractC3367j.m5100e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C2507w(new C2488d0(c2508x, c2495k, z7, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2507w) && AbstractC3367j.m5096a(((C2507w) obj).f13852a, this.f13852a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13852a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        if (equals(f13850b)) {
            return "ExitTransition.None";
        }
        if (equals(f13851c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C2488d0 c2488d0 = this.f13852a;
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
        AbstractC2487d.m4057u(sb, str2, ",\nScale - ", null, ",\nKeepUntilTransitionsFinished - ");
        sb.append(c2488d0.f13789c);
        return sb.toString();
    }
}
