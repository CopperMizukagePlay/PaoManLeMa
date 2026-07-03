package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.t */
/* loaded from: classes.dex */
public final class C2283t extends AbstractC2286w {

    /* renamed from: b */
    public final float f13199b;

    /* renamed from: c */
    public final float f13200c;

    /* renamed from: d */
    public final float f13201d;

    /* renamed from: e */
    public final float f13202e;

    public C2283t(float f7, float f8, float f9, float f10) {
        super(2);
        this.f13199b = f7;
        this.f13200c = f8;
        this.f13201d = f9;
        this.f13202e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283t)) {
            return false;
        }
        C2283t c2283t = (C2283t) obj;
        if (Float.compare(this.f13199b, c2283t.f13199b) == 0 && Float.compare(this.f13200c, c2283t.f13200c) == 0 && Float.compare(this.f13201d, c2283t.f13201d) == 0 && Float.compare(this.f13202e, c2283t.f13202e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13202e) + AbstractC2487d.m4038b(this.f13201d, AbstractC2487d.m4038b(this.f13200c, Float.hashCode(this.f13199b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f13199b);
        sb.append(", dy1=");
        sb.append(this.f13200c);
        sb.append(", dx2=");
        sb.append(this.f13201d);
        sb.append(", dy2=");
        return AbstractC0094y0.m186m(sb, this.f13202e, ')');
    }
}
