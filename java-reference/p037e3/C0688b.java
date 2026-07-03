package p037e3;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.b */
/* loaded from: classes.dex */
public final class C0688b {

    /* renamed from: a */
    public String f2233a;

    /* renamed from: b */
    public String f2234b;

    /* renamed from: c */
    public List f2235c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0688b)) {
            return false;
        }
        C0688b c0688b = (C0688b) obj;
        if (Objects.equals(this.f2233a, c0688b.f2233a) && Objects.equals(this.f2234b, c0688b.f2234b) && Objects.equals(this.f2235c, c0688b.f2235c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2233a, this.f2234b, this.f2235c);
    }
}
