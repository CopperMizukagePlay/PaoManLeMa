package p087l2;

import p065i2.C2065f;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.t */
/* loaded from: classes.dex */
public final class C2456t implements InterfaceC2443g {

    /* renamed from: a */
    public final int f13717a;

    /* renamed from: b */
    public final int f13718b;

    public C2456t(int i7, int i8) {
        this.f13717a = i7;
        this.f13718b = i8;
    }

    @Override // p087l2.InterfaceC2443g
    /* renamed from: a */
    public final void mo786a(C2444h c2444h) {
        boolean z7;
        if (c2444h.f13695d != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        C2065f c2065f = c2444h.f13692a;
        if (z7) {
            c2444h.f13695d = -1;
            c2444h.f13696e = -1;
        }
        int m3530q = AbstractC2168e.m3530q(this.f13717a, 0, c2065f.m3262b());
        int m3530q2 = AbstractC2168e.m3530q(this.f13718b, 0, c2065f.m3262b());
        if (m3530q != m3530q2) {
            if (m3530q < m3530q2) {
                c2444h.m4016e(m3530q, m3530q2);
            } else {
                c2444h.m4016e(m3530q2, m3530q);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2456t)) {
            return false;
        }
        C2456t c2456t = (C2456t) obj;
        if (this.f13717a == c2456t.f13717a && this.f13718b == c2456t.f13718b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13717a * 31) + this.f13718b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f13717a);
        sb.append(", end=");
        return AbstractC2487d.m4045i(sb, this.f13718b, ')');
    }
}
