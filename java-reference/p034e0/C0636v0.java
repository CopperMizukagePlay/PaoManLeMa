package p034e0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.v0 */
/* loaded from: classes.dex */
public final class C0636v0 {

    /* renamed from: a */
    public final long f2103a;

    /* renamed from: b */
    public final long f2104b;

    public C0636v0(long j6, long j7) {
        this.f2103a = j6;
        this.f2104b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0636v0)) {
            return false;
        }
        C0636v0 c0636v0 = (C0636v0) obj;
        if (C0677s.m1454c(this.f2103a, c0636v0.f2103a) && C0677s.m1454c(this.f2104b, c0636v0.f2104b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f2104b) + (Long.hashCode(this.f2103a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC2487d.m4051o(this.f2103a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0677s.m1460i(this.f2104b));
        sb.append(')');
        return sb.toString();
    }
}
