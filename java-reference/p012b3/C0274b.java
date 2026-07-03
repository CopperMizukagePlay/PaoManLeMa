package p012b3;

import android.graphics.Insets;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b3.b */
/* loaded from: classes.dex */
public final class C0274b {

    /* renamed from: e */
    public static final C0274b f1014e = new C0274b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f1015a;

    /* renamed from: b */
    public final int f1016b;

    /* renamed from: c */
    public final int f1017c;

    /* renamed from: d */
    public final int f1018d;

    public C0274b(int i7, int i8, int i9, int i10) {
        this.f1015a = i7;
        this.f1016b = i8;
        this.f1017c = i9;
        this.f1018d = i10;
    }

    /* renamed from: a */
    public static C0274b m580a(C0274b c0274b, C0274b c0274b2) {
        return m581b(Math.max(c0274b.f1015a, c0274b2.f1015a), Math.max(c0274b.f1016b, c0274b2.f1016b), Math.max(c0274b.f1017c, c0274b2.f1017c), Math.max(c0274b.f1018d, c0274b2.f1018d));
    }

    /* renamed from: b */
    public static C0274b m581b(int i7, int i8, int i9, int i10) {
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return f1014e;
        }
        return new C0274b(i7, i8, i9, i10);
    }

    /* renamed from: c */
    public static C0274b m582c(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return m581b(i7, i8, i9, i10);
    }

    /* renamed from: d */
    public final Insets m583d() {
        return AbstractC0273a.m579i(this.f1015a, this.f1016b, this.f1017c, this.f1018d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0274b.class != obj.getClass()) {
            return false;
        }
        C0274b c0274b = (C0274b) obj;
        if (this.f1018d == c0274b.f1018d && this.f1015a == c0274b.f1015a && this.f1017c == c0274b.f1017c && this.f1016b == c0274b.f1016b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1015a * 31) + this.f1016b) * 31) + this.f1017c) * 31) + this.f1018d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f1015a);
        sb.append(", top=");
        sb.append(this.f1016b);
        sb.append(", right=");
        sb.append(this.f1017c);
        sb.append(", bottom=");
        return AbstractC2487d.m4045i(sb, this.f1018d, '}');
    }
}
