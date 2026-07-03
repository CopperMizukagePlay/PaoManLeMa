package p035e1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.m */
/* loaded from: classes.dex */
public final class C0666m {

    /* renamed from: a */
    public final ColorFilter f2180a;

    /* renamed from: b */
    public final long f2181b;

    /* renamed from: c */
    public final int f2182c;

    public C0666m(int i7, long j6) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0642a.m1312k();
            porterDuffColorFilter = AbstractC0642a.m1305d(AbstractC0659i0.m1426z(j6), AbstractC0659i0.m1422v(i7));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC0659i0.m1426z(j6), AbstractC0659i0.m1397D(i7));
        }
        this.f2180a = porterDuffColorFilter;
        this.f2181b = j6;
        this.f2182c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0666m)) {
            return false;
        }
        C0666m c0666m = (C0666m) obj;
        if (C0677s.m1454c(this.f2181b, c0666m.f2181b) && this.f2182c == c0666m.f2182c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Integer.hashCode(this.f2182c) + (Long.hashCode(this.f2181b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC2487d.m4051o(this.f2181b, sb, ", blendMode=");
        sb.append((Object) AbstractC0659i0.m1398E(this.f2182c));
        sb.append(')');
        return sb.toString();
    }
}
