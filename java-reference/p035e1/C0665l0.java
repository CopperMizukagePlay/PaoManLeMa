package p035e1;

import p001a0.AbstractC0094y0;
import p027d1.C0464b;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.l0 */
/* loaded from: classes.dex */
public final class C0665l0 {

    /* renamed from: d */
    public static final C0665l0 f2176d = new C0665l0();

    /* renamed from: a */
    public final long f2177a;

    /* renamed from: b */
    public final long f2178b;

    /* renamed from: c */
    public final float f2179c;

    public C0665l0(long j6, long j7, float f7) {
        this.f2177a = j6;
        this.f2178b = j7;
        this.f2179c = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0665l0) {
                C0665l0 c0665l0 = (C0665l0) obj;
                if (C0677s.m1454c(this.f2177a, c0665l0.f2177a) && C0464b.m1006b(this.f2178b, c0665l0.f2178b) && this.f2179c == c0665l0.f2179c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Float.hashCode(this.f2179c) + AbstractC2487d.m4039c(Long.hashCode(this.f2177a) * 31, 31, this.f2178b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC2487d.m4051o(this.f2177a, sb, ", offset=");
        sb.append((Object) C0464b.m1013i(this.f2178b));
        sb.append(", blurRadius=");
        return AbstractC0094y0.m186m(sb, this.f2179c, ')');
    }

    public /* synthetic */ C0665l0() {
        this(AbstractC0659i0.m1404d(4278190080L), 0L, 0.0f);
    }
}
