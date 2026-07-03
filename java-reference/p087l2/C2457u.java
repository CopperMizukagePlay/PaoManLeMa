package p087l2;

import p050g2.C1587g;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.u */
/* loaded from: classes.dex */
public final class C2457u implements InterfaceC2443g {

    /* renamed from: a */
    public final C1587g f13719a;

    /* renamed from: b */
    public final int f13720b;

    public C2457u(String str, int i7) {
        this.f13719a = new C1587g(str);
        this.f13720b = i7;
    }

    @Override // p087l2.InterfaceC2443g
    /* renamed from: a */
    public final void mo786a(C2444h c2444h) {
        int length;
        int i7 = c2444h.f13695d;
        C1587g c1587g = this.f13719a;
        int i8 = -1;
        if (i7 != -1) {
            int i9 = c2444h.f13696e;
            String str = c1587g.f10239f;
            String str2 = c1587g.f10239f;
            c2444h.m4015d(i7, i9, str);
            if (str2.length() > 0) {
                c2444h.m4016e(i7, str2.length() + i7);
            }
        } else {
            int i10 = c2444h.f13693b;
            int i11 = c2444h.f13694c;
            String str3 = c1587g.f10239f;
            String str4 = c1587g.f10239f;
            c2444h.m4015d(i10, i11, str3);
            if (str4.length() > 0) {
                c2444h.m4016e(i10, str4.length() + i10);
            }
        }
        int i12 = c2444h.f13693b;
        int i13 = c2444h.f13694c;
        if (i12 == i13) {
            i8 = i13;
        }
        int i14 = this.f13720b;
        if (i14 > 0) {
            length = (i8 + i14) - 1;
        } else {
            length = (i8 + i14) - c1587g.f10239f.length();
        }
        int m3530q = AbstractC2168e.m3530q(length, 0, c2444h.f13692a.m3262b());
        c2444h.m4017f(m3530q, m3530q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2457u)) {
            return false;
        }
        C2457u c2457u = (C2457u) obj;
        if (AbstractC3367j.m5096a(this.f13719a.f10239f, c2457u.f13719a.f10239f) && this.f13720b == c2457u.f13720b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13719a.f10239f.hashCode() * 31) + this.f13720b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f13719a.f10239f);
        sb.append("', newCursorPosition=");
        return AbstractC2487d.m4045i(sb, this.f13720b, ')');
    }
}
