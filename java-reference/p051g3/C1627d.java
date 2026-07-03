package p051g3;

import java.util.Objects;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.d */
/* loaded from: classes.dex */
public final class C1627d {

    /* renamed from: a */
    public final String f10372a;

    /* renamed from: b */
    public final int f10373b;

    /* renamed from: c */
    public final int f10374c;

    public C1627d(int i7, int i8, String str) {
        this.f10372a = str;
        this.f10373b = i7;
        this.f10374c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1627d) {
            C1627d c1627d = (C1627d) obj;
            if (Objects.equals(this.f10372a, c1627d.f10372a) && this.f10373b == c1627d.f10373b && this.f10374c == c1627d.f10374c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f10373b);
        Integer valueOf2 = Integer.valueOf(this.f10374c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f10372a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f10372a;
        if (str != null) {
            obj = Integer.valueOf(str.hashCode());
        } else {
            obj = "null";
        }
        sb.append(obj);
        sb.append(" displayWidth=");
        sb.append(this.f10373b);
        sb.append(" displayHeight=");
        sb.append(this.f10374c);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
