package p087l2;

import p050g2.C1587g;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.a */
/* loaded from: classes.dex */
public final class C2432a implements InterfaceC2443g {

    /* renamed from: a */
    public final C1587g f13653a;

    /* renamed from: b */
    public final int f13654b;

    public C2432a(C1587g c1587g, int i7) {
        this.f13653a = c1587g;
        this.f13654b = i7;
    }

    @Override // p087l2.InterfaceC2443g
    /* renamed from: a */
    public final void mo786a(C2444h c2444h) {
        int length;
        int i7 = c2444h.f13695d;
        C1587g c1587g = this.f13653a;
        int i8 = -1;
        if (i7 != -1) {
            c2444h.m4015d(i7, c2444h.f13696e, c1587g.f10239f);
        } else {
            c2444h.m4015d(c2444h.f13693b, c2444h.f13694c, c1587g.f10239f);
        }
        int i9 = c2444h.f13693b;
        int i10 = c2444h.f13694c;
        if (i9 == i10) {
            i8 = i10;
        }
        int i11 = this.f13654b;
        if (i11 > 0) {
            length = (i8 + i11) - 1;
        } else {
            length = (i8 + i11) - c1587g.f10239f.length();
        }
        int m3530q = AbstractC2168e.m3530q(length, 0, c2444h.f13692a.m3262b());
        c2444h.m4017f(m3530q, m3530q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2432a)) {
            return false;
        }
        C2432a c2432a = (C2432a) obj;
        if (AbstractC3367j.m5096a(this.f13653a.f10239f, c2432a.f13653a.f10239f) && this.f13654b == c2432a.f13654b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13653a.f10239f.hashCode() * 31) + this.f13654b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f13653a.f10239f);
        sb.append("', newCursorPosition=");
        return AbstractC2487d.m4045i(sb, this.f13654b, ')');
    }

    public C2432a(String str, int i7) {
        this(new C1587g(str), i7);
    }
}
