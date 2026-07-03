package p071j0;

import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p140s2.C3101k;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.v0 */
/* loaded from: classes.dex */
public final class C2157v0 implements InterfaceC2129h0 {

    /* renamed from: a */
    public final C3801i f12549a;

    /* renamed from: b */
    public final int f12550b;

    public C2157v0(C3801i c3801i, int i7) {
        this.f12549a = c3801i;
        this.f12550b = i7;
    }

    @Override // p071j0.InterfaceC2129h0
    /* renamed from: a */
    public final int mo3476a(C3101k c3101k, long j6, int i7) {
        int i8 = (int) (j6 & 4294967295L);
        int i9 = this.f12550b;
        if (i7 >= i8 - (i9 * 2)) {
            return Math.round((1 + 0.0f) * ((i8 - i7) / 2.0f));
        }
        return AbstractC2168e.m3530q(this.f12549a.m5826a(i7, i8), i9, (i8 - i9) - i7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2157v0) {
                C2157v0 c2157v0 = (C2157v0) obj;
                if (!this.f12549a.equals(c2157v0.f12549a) || this.f12550b != c2157v0.f12550b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12550b) + (Float.hashCode(this.f12549a.f17983a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f12549a);
        sb.append(", margin=");
        return AbstractC2487d.m4045i(sb, this.f12550b, ')');
    }
}
