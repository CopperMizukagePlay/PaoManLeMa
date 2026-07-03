package p107o;

import androidx.compose.foundation.layout.AbstractC0154b;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p092m.AbstractC2487d;
import p144t.C3137j0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.d1 */
/* loaded from: classes.dex */
public final class C2733d1 {

    /* renamed from: a */
    public final long f14624a;

    /* renamed from: b */
    public final C3137j0 f14625b;

    public C2733d1() {
        long m1404d = AbstractC0659i0.m1404d(4284900966L);
        C3137j0 m330a = AbstractC0154b.m330a(0.0f, 0.0f, 3);
        this.f14624a = m1404d;
        this.f14625b = m330a;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C2733d1.class.equals(cls)) {
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                C2733d1 c2733d1 = (C2733d1) obj;
                if (!C0677s.m1454c(this.f14624a, c2733d1.f14624a) || !AbstractC3367j.m5096a(this.f14625b, c2733d1.f14625b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return this.f14625b.hashCode() + (Long.hashCode(this.f14624a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC2487d.m4051o(this.f14624a, sb, ", drawPadding=");
        sb.append(this.f14625b);
        sb.append(')');
        return sb.toString();
    }
}
