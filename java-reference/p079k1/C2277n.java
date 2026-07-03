package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.n */
/* loaded from: classes.dex */
public final class C2277n extends AbstractC2286w {

    /* renamed from: b */
    public final float f13178b;

    /* renamed from: c */
    public final float f13179c;

    /* renamed from: d */
    public final float f13180d;

    /* renamed from: e */
    public final float f13181e;

    public C2277n(float f7, float f8, float f9, float f10) {
        super(2);
        this.f13178b = f7;
        this.f13179c = f8;
        this.f13180d = f9;
        this.f13181e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2277n)) {
            return false;
        }
        C2277n c2277n = (C2277n) obj;
        if (Float.compare(this.f13178b, c2277n.f13178b) == 0 && Float.compare(this.f13179c, c2277n.f13179c) == 0 && Float.compare(this.f13180d, c2277n.f13180d) == 0 && Float.compare(this.f13181e, c2277n.f13181e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13181e) + AbstractC2487d.m4038b(this.f13180d, AbstractC2487d.m4038b(this.f13179c, Float.hashCode(this.f13178b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f13178b);
        sb.append(", y1=");
        sb.append(this.f13179c);
        sb.append(", x2=");
        sb.append(this.f13180d);
        sb.append(", y2=");
        return AbstractC0094y0.m186m(sb, this.f13181e, ')');
    }
}
