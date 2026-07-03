package p115p;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C2821a {

    /* renamed from: a */
    public final long f14876a;

    /* renamed from: b */
    public final long f14877b;

    /* renamed from: c */
    public final long f14878c;

    /* renamed from: d */
    public final long f14879d;

    /* renamed from: e */
    public final long f14880e;

    public C2821a(long j6, long j7, long j8, long j9, long j10) {
        this.f14876a = j6;
        this.f14877b = j7;
        this.f14878c = j8;
        this.f14879d = j9;
        this.f14880e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2821a)) {
            return false;
        }
        C2821a c2821a = (C2821a) obj;
        if (C0677s.m1454c(this.f14876a, c2821a.f14876a) && C0677s.m1454c(this.f14877b, c2821a.f14877b) && C0677s.m1454c(this.f14878c, c2821a.f14878c) && C0677s.m1454c(this.f14879d, c2821a.f14879d) && C0677s.m1454c(this.f14880e, c2821a.f14880e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f14880e) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f14876a) * 31, 31, this.f14877b), 31, this.f14878c), 31, this.f14879d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC2487d.m4051o(this.f14876a, sb, ", textColor=");
        AbstractC2487d.m4051o(this.f14877b, sb, ", iconColor=");
        AbstractC2487d.m4051o(this.f14878c, sb, ", disabledTextColor=");
        AbstractC2487d.m4051o(this.f14879d, sb, ", disabledIconColor=");
        sb.append((Object) C0677s.m1460i(this.f14880e));
        sb.append(')');
        return sb.toString();
    }
}
