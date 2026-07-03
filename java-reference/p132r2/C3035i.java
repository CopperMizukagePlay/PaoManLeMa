package p132r2;

import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.i */
/* loaded from: classes.dex */
public final class C3035i {

    /* renamed from: c */
    public static final C3035i f15597c = new C3035i(C3032f.f15593c, 17);

    /* renamed from: a */
    public final float f15598a;

    /* renamed from: b */
    public final int f15599b;

    public C3035i(float f7, int i7) {
        this.f15598a = f7;
        this.f15599b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3035i) {
            C3035i c3035i = (C3035i) obj;
            float f7 = c3035i.f15598a;
            float f8 = C3032f.f15592b;
            if (Float.compare(this.f15598a, f7) == 0 && this.f15599b == c3035i.f15599b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f7 = C3032f.f15592b;
        return Integer.hashCode(0) + AbstractC2647h.m4255a(this.f15599b, Float.hashCode(this.f15598a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) C3032f.m4722b(this.f15598a));
        sb.append(", trim=");
        int i7 = this.f15599b;
        if (i7 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i7 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i7 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i7 == 0) {
            str = "LineHeightStyle.Trim.None";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
