package p071j0;

import p092m.AbstractC2487d;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p177x0.C3800h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C2122e implements InterfaceC2127g0 {

    /* renamed from: a */
    public final C3800h f12416a;

    /* renamed from: b */
    public final C3800h f12417b;

    /* renamed from: c */
    public final int f12418c;

    public C2122e(C3800h c3800h, C3800h c3800h2, int i7) {
        this.f12416a = c3800h;
        this.f12417b = c3800h2;
        this.f12418c = i7;
    }

    @Override // p071j0.InterfaceC2127g0
    /* renamed from: a */
    public final int mo3475a(C3101k c3101k, long j6, int i7, EnumC3103m enumC3103m) {
        int mo5824a = this.f12417b.mo5824a(0, c3101k.m4789c(), enumC3103m);
        int i8 = -this.f12416a.mo5824a(0, i7, enumC3103m);
        EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
        int i9 = this.f12418c;
        if (enumC3103m != enumC3103m2) {
            i9 = -i9;
        }
        return c3101k.f15698a + mo5824a + i8 + i9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2122e) {
                C2122e c2122e = (C2122e) obj;
                if (!this.f12416a.equals(c2122e.f12416a) || !this.f12417b.equals(c2122e.f12417b) || this.f12418c != c2122e.f12418c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12418c) + AbstractC2487d.m4038b(this.f12417b.f17982a, Float.hashCode(this.f12416a.f17982a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f12416a);
        sb.append(", anchorAlignment=");
        sb.append(this.f12417b);
        sb.append(", offset=");
        return AbstractC2487d.m4045i(sb, this.f12418c, ')');
    }
}
