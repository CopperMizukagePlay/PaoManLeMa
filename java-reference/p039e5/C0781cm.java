package p039e5;

import java.util.Map;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cm */
/* loaded from: classes.dex */
public final class C0781cm {

    /* renamed from: a */
    public final String f3166a;

    /* renamed from: b */
    public final Object f3167b;

    public C0781cm(String str, Map map) {
        AbstractC3367j.m5100e(str, "url");
        this.f3166a = str;
        this.f3167b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0781cm) {
                C0781cm c0781cm = (C0781cm) obj;
                if (!AbstractC3367j.m5096a(this.f3166a, c0781cm.f3166a) || !this.f3167b.equals(c0781cm.f3167b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3167b.hashCode() + (this.f3166a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedDownloadInput(url=" + this.f3166a + ", headers=" + this.f3167b + ")";
    }
}
