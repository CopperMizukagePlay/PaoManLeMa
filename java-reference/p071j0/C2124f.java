package p071j0;

import p092m.AbstractC2487d;
import p140s2.C3101k;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C2124f implements InterfaceC2129h0 {

    /* renamed from: a */
    public final C3801i f12422a;

    /* renamed from: b */
    public final C3801i f12423b;

    /* renamed from: c */
    public final int f12424c;

    public C2124f(C3801i c3801i, C3801i c3801i2, int i7) {
        this.f12422a = c3801i;
        this.f12423b = c3801i2;
        this.f12424c = i7;
    }

    @Override // p071j0.InterfaceC2129h0
    /* renamed from: a */
    public final int mo3476a(C3101k c3101k, long j6, int i7) {
        int m5826a = this.f12423b.m5826a(0, c3101k.m4788b());
        return c3101k.f15699b + m5826a + (-this.f12422a.m5826a(0, i7)) + this.f12424c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2124f) {
                C2124f c2124f = (C2124f) obj;
                if (!this.f12422a.equals(c2124f.f12422a) || !this.f12423b.equals(c2124f.f12423b) || this.f12424c != c2124f.f12424c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12424c) + AbstractC2487d.m4038b(this.f12423b.f17983a, Float.hashCode(this.f12422a.f17983a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f12422a);
        sb.append(", anchorAlignment=");
        sb.append(this.f12423b);
        sb.append(", offset=");
        return AbstractC2487d.m4045i(sb, this.f12424c, ')');
    }
}
