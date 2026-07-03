package p049g1;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g1.h */
/* loaded from: classes.dex */
public final class C1574h extends AbstractC1571e {

    /* renamed from: a */
    public final float f10188a;

    /* renamed from: b */
    public final float f10189b;

    /* renamed from: c */
    public final int f10190c;

    /* renamed from: d */
    public final int f10191d;

    public C1574h(float f7, float f8, int i7, int i8, int i9) {
        f8 = (i9 & 2) != 0 ? 4.0f : f8;
        i7 = (i9 & 4) != 0 ? 0 : i7;
        i8 = (i9 & 8) != 0 ? 0 : i8;
        this.f10188a = f7;
        this.f10189b = f8;
        this.f10190c = i7;
        this.f10191d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1574h)) {
            return false;
        }
        C1574h c1574h = (C1574h) obj;
        if (this.f10188a == c1574h.f10188a && this.f10189b == c1574h.f10189b && this.f10190c == c1574h.f10190c && this.f10191d == c1574h.f10191d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2647h.m4255a(this.f10191d, AbstractC2647h.m4255a(this.f10190c, AbstractC2487d.m4038b(this.f10189b, Float.hashCode(this.f10188a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f10188a);
        sb.append(", miter=");
        sb.append(this.f10189b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i7 = this.f10190c;
        if (i7 == 0) {
            str = "Butt";
        } else if (i7 == 1) {
            str = "Round";
        } else if (i7 != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i8 = this.f10191d;
        if (i8 == 0) {
            str2 = "Miter";
        } else if (i8 == 1) {
            str2 = "Round";
        } else if (i8 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
