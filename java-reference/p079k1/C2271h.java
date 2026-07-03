package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.h */
/* loaded from: classes.dex */
public final class C2271h extends AbstractC2286w {

    /* renamed from: b */
    public final float f13161b;

    /* renamed from: c */
    public final float f13162c;

    /* renamed from: d */
    public final boolean f13163d;

    /* renamed from: e */
    public final float f13164e;

    /* renamed from: f */
    public final float f13165f;

    public C2271h(float f7, float f8, float f9, float f10, boolean z7) {
        super(3);
        this.f13161b = f7;
        this.f13162c = f8;
        this.f13163d = z7;
        this.f13164e = f9;
        this.f13165f = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2271h) {
                C2271h c2271h = (C2271h) obj;
                if (Float.compare(this.f13161b, c2271h.f13161b) != 0 || Float.compare(this.f13162c, c2271h.f13162c) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.f13163d != c2271h.f13163d || Float.compare(this.f13164e, c2271h.f13164e) != 0 || Float.compare(this.f13165f, c2271h.f13165f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13165f) + AbstractC2487d.m4038b(this.f13164e, AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(this.f13162c, Float.hashCode(this.f13161b) * 31, 31), 31), 31, false), 31, this.f13163d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f13161b);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f13162c);
        sb.append(", theta=0.0, isMoreThanHalf=false, isPositiveArc=");
        sb.append(this.f13163d);
        sb.append(", arcStartX=");
        sb.append(this.f13164e);
        sb.append(", arcStartY=");
        return AbstractC0094y0.m186m(sb, this.f13165f, ')');
    }
}
