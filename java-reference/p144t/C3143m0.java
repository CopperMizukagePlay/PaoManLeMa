package p144t;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.m0 */
/* loaded from: classes.dex */
public final class C3143m0 {

    /* renamed from: a */
    public float f15808a = 0.0f;

    /* renamed from: b */
    public boolean f15809b = true;

    /* renamed from: c */
    public C3158u f15810c = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3143m0) {
                C3143m0 c3143m0 = (C3143m0) obj;
                if (Float.compare(this.f15808a, c3143m0.f15808a) != 0 || this.f15809b != c3143m0.f15809b || !AbstractC3367j.m5096a(this.f15810c, c3143m0.f15810c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int m4040d = AbstractC2487d.m4040d(Float.hashCode(this.f15808a) * 31, 31, this.f15809b);
        C3158u c3158u = this.f15810c;
        if (c3158u == null) {
            hashCode = 0;
        } else {
            hashCode = c3158u.f15843a.hashCode();
        }
        return (m4040d + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f15808a + ", fill=" + this.f15809b + ", crossAxisAlignment=" + this.f15810c + ", flowLayoutData=null)";
    }
}
