package p107o;

import p035e1.C0671o0;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.p */
/* loaded from: classes.dex */
public final class C2767p {

    /* renamed from: a */
    public final float f14742a;

    /* renamed from: b */
    public final C0671o0 f14743b;

    public C2767p(float f7, C0671o0 c0671o0) {
        this.f14742a = f7;
        this.f14743b = c0671o0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2767p) {
                C2767p c2767p = (C2767p) obj;
                if (!C3096f.m4776a(this.f14742a, c2767p.f14742a) || !this.f14743b.equals(c2767p.f14743b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14743b.hashCode() + (Float.hashCode(this.f14742a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C3096f.m4777b(this.f14742a)) + ", brush=" + this.f14743b + ')';
    }
}
