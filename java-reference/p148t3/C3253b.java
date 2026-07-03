package p148t3;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.b */
/* loaded from: classes.dex */
public final class C3253b {

    /* renamed from: a */
    public final int f16076a;

    /* renamed from: b */
    public final float f16077b;

    /* renamed from: c */
    public final float f16078c;

    /* renamed from: d */
    public final float f16079d;

    /* renamed from: e */
    public final long f16080e;

    public C3253b(int i7, float f7, float f8, float f9, long j6) {
        this.f16076a = i7;
        this.f16077b = f7;
        this.f16078c = f8;
        this.f16079d = f9;
        this.f16080e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3253b.class == obj.getClass()) {
            C3253b c3253b = (C3253b) obj;
            if (this.f16078c == c3253b.f16078c && this.f16079d == c3253b.f16079d && this.f16077b == c3253b.f16077b && this.f16076a == c3253b.f16076a && this.f16080e == c3253b.f16080e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16080e) + AbstractC2647h.m4255a(this.f16076a, AbstractC2487d.m4038b(this.f16077b, AbstractC2487d.m4038b(this.f16079d, Float.hashCode(this.f16078c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f16078c + ", touchY=" + this.f16079d + ", progress=" + this.f16077b + ", swipeEdge=" + this.f16076a + ", frameTimeMillis=" + this.f16080e + ')';
    }
}
