package p050g2;

import java.util.List;
import p001a0.AbstractC0094y0;
import p080k2.InterfaceC2293d;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.k0 */
/* loaded from: classes.dex */
public final class C1596k0 {

    /* renamed from: a */
    public final C1587g f10276a;

    /* renamed from: b */
    public final C1604o0 f10277b;

    /* renamed from: c */
    public final List f10278c;

    /* renamed from: d */
    public final int f10279d;

    /* renamed from: e */
    public final boolean f10280e;

    /* renamed from: f */
    public final int f10281f;

    /* renamed from: g */
    public final InterfaceC3093c f10282g;

    /* renamed from: h */
    public final EnumC3103m f10283h;

    /* renamed from: i */
    public final InterfaceC2293d f10284i;

    /* renamed from: j */
    public final long f10285j;

    public C1596k0(C1587g c1587g, C1604o0 c1604o0, List list, int i7, boolean z7, int i8, InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m, InterfaceC2293d interfaceC2293d, long j6) {
        this.f10276a = c1587g;
        this.f10277b = c1604o0;
        this.f10278c = list;
        this.f10279d = i7;
        this.f10280e = z7;
        this.f10281f = i8;
        this.f10282g = interfaceC3093c;
        this.f10283h = enumC3103m;
        this.f10284i = interfaceC2293d;
        this.f10285j = j6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1596k0) {
                C1596k0 c1596k0 = (C1596k0) obj;
                if (AbstractC3367j.m5096a(this.f10276a, c1596k0.f10276a) && AbstractC3367j.m5096a(this.f10277b, c1596k0.f10277b) && AbstractC3367j.m5096a(this.f10278c, c1596k0.f10278c) && this.f10279d == c1596k0.f10279d && this.f10280e == c1596k0.f10280e && this.f10281f == c1596k0.f10281f && AbstractC3367j.m5096a(this.f10282g, c1596k0.f10282g) && this.f10283h == c1596k0.f10283h && AbstractC3367j.m5096a(this.f10284i, c1596k0.f10284i) && C3091a.m4754b(this.f10285j, c1596k0.f10285j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10285j) + ((this.f10284i.hashCode() + ((this.f10283h.hashCode() + ((this.f10282g.hashCode() + AbstractC2647h.m4255a(this.f10281f, AbstractC2487d.m4040d((AbstractC0094y0.m176c(this.f10278c, (this.f10277b.hashCode() + (this.f10276a.hashCode() * 31)) * 31, 31) + this.f10279d) * 31, 31, this.f10280e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f10276a);
        sb.append(", style=");
        sb.append(this.f10277b);
        sb.append(", placeholders=");
        sb.append(this.f10278c);
        sb.append(", maxLines=");
        sb.append(this.f10279d);
        sb.append(", softWrap=");
        sb.append(this.f10280e);
        sb.append(", overflow=");
        int i7 = this.f10281f;
        if (i7 == 1) {
            str = "Clip";
        } else if (i7 == 2) {
            str = "Ellipsis";
        } else if (i7 == 5) {
            str = "MiddleEllipsis";
        } else if (i7 == 3) {
            str = "Visible";
        } else if (i7 == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.f10282g);
        sb.append(", layoutDirection=");
        sb.append(this.f10283h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f10284i);
        sb.append(", constraints=");
        sb.append((Object) C3091a.m4763k(this.f10285j));
        sb.append(')');
        return sb.toString();
    }
}
