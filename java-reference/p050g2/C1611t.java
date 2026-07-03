package p050g2;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p110o2.C2807d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.t */
/* loaded from: classes.dex */
public final class C1611t {

    /* renamed from: a */
    public final C2807d f10336a;

    /* renamed from: b */
    public final int f10337b;

    /* renamed from: c */
    public final int f10338c;

    public C1611t(C2807d c2807d, int i7, int i8) {
        this.f10336a = c2807d;
        this.f10337b = i7;
        this.f10338c = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1611t) {
                C1611t c1611t = (C1611t) obj;
                if (!this.f10336a.equals(c1611t.f10336a) || this.f10337b != c1611t.f10337b || this.f10338c != c1611t.f10338c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10338c) + AbstractC2647h.m4255a(this.f10337b, this.f10336a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f10336a);
        sb.append(", startIndex=");
        sb.append(this.f10337b);
        sb.append(", endIndex=");
        return AbstractC2487d.m4045i(sb, this.f10338c, ')');
    }
}
