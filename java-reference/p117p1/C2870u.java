package p117p1;

import java.util.ArrayList;
import p027d1.C0464b;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.u */
/* loaded from: classes.dex */
public final class C2870u {

    /* renamed from: a */
    public final long f15024a;

    /* renamed from: b */
    public final long f15025b;

    /* renamed from: c */
    public final long f15026c;

    /* renamed from: d */
    public final long f15027d;

    /* renamed from: e */
    public final boolean f15028e;

    /* renamed from: f */
    public final float f15029f;

    /* renamed from: g */
    public final int f15030g;

    /* renamed from: h */
    public final boolean f15031h;

    /* renamed from: i */
    public final ArrayList f15032i;

    /* renamed from: j */
    public final long f15033j;

    /* renamed from: k */
    public final long f15034k;

    public C2870u(long j6, long j7, long j8, long j9, boolean z7, float f7, int i7, boolean z8, ArrayList arrayList, long j10, long j11) {
        this.f15024a = j6;
        this.f15025b = j7;
        this.f15026c = j8;
        this.f15027d = j9;
        this.f15028e = z7;
        this.f15029f = f7;
        this.f15030g = i7;
        this.f15031h = z8;
        this.f15032i = arrayList;
        this.f15033j = j10;
        this.f15034k = j11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2870u) {
                C2870u c2870u = (C2870u) obj;
                if (C2867r.m4548a(this.f15024a, c2870u.f15024a) && this.f15025b == c2870u.f15025b && C0464b.m1006b(this.f15026c, c2870u.f15026c) && C0464b.m1006b(this.f15027d, c2870u.f15027d) && this.f15028e == c2870u.f15028e && Float.compare(this.f15029f, c2870u.f15029f) == 0 && this.f15030g == c2870u.f15030g && this.f15031h == c2870u.f15031h && this.f15032i.equals(c2870u.f15032i) && C0464b.m1006b(this.f15033j, c2870u.f15033j) && C0464b.m1006b(this.f15034k, c2870u.f15034k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15034k) + AbstractC2487d.m4039c((this.f15032i.hashCode() + AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f15030g, AbstractC2487d.m4038b(this.f15029f, AbstractC2487d.m4040d(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f15024a) * 31, 31, this.f15025b), 31, this.f15026c), 31, this.f15027d), 31, this.f15028e), 31), 31), 31, this.f15031h)) * 31, 31, this.f15033j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) C2867r.m4549b(this.f15024a));
        sb.append(", uptime=");
        sb.append(this.f15025b);
        sb.append(", positionOnScreen=");
        sb.append((Object) C0464b.m1013i(this.f15026c));
        sb.append(", position=");
        sb.append((Object) C0464b.m1013i(this.f15027d));
        sb.append(", down=");
        sb.append(this.f15028e);
        sb.append(", pressure=");
        sb.append(this.f15029f);
        sb.append(", type=");
        int i7 = this.f15030g;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.f15031h);
        sb.append(", historical=");
        sb.append(this.f15032i);
        sb.append(", scrollDelta=");
        sb.append((Object) C0464b.m1013i(this.f15033j));
        sb.append(", originalEventPosition=");
        sb.append((Object) C0464b.m1013i(this.f15034k));
        sb.append(')');
        return sb.toString();
    }
}
