package p087l2;

import p065i2.C2065f;
import p092m.AbstractC2487d;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.e */
/* loaded from: classes.dex */
public final class C2440e implements InterfaceC2443g {

    /* renamed from: a */
    public final int f13687a;

    /* renamed from: b */
    public final int f13688b;

    public C2440e(int i7, int i8) {
        boolean z7;
        this.f13687a = i7;
        this.f13688b = i8;
        if (i7 >= 0 && i8 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2550a.m4078a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.");
        }
    }

    @Override // p087l2.InterfaceC2443g
    /* renamed from: a */
    public final void mo786a(C2444h c2444h) {
        int i7 = c2444h.f13694c;
        C2065f c2065f = c2444h.f13692a;
        int i8 = this.f13688b;
        int i9 = i7 + i8;
        if (((i7 ^ i9) & (i8 ^ i9)) < 0) {
            i9 = c2065f.m3262b();
        }
        c2444h.m4012a(c2444h.f13694c, Math.min(i9, c2065f.m3262b()));
        int i10 = c2444h.f13693b;
        int i11 = this.f13687a;
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) < 0) {
            i12 = 0;
        }
        c2444h.m4012a(Math.max(0, i12), c2444h.f13693b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440e)) {
            return false;
        }
        C2440e c2440e = (C2440e) obj;
        if (this.f13687a == c2440e.f13687a && this.f13688b == c2440e.f13688b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13687a * 31) + this.f13688b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f13687a);
        sb.append(", lengthAfterCursor=");
        return AbstractC2487d.m4045i(sb, this.f13688b, ')');
    }
}
