package p087l2;

import p065i2.C2065f;
import p092m.AbstractC2487d;
import p095m2.AbstractC2550a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.f */
/* loaded from: classes.dex */
public final class C2442f implements InterfaceC2443g {

    /* renamed from: a */
    public final int f13690a;

    /* renamed from: b */
    public final int f13691b;

    public C2442f(int i7, int i8) {
        boolean z7;
        this.f13690a = i7;
        this.f13691b = i8;
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
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 < this.f13690a) {
                int i10 = i9 + 1;
                int i11 = c2444h.f13693b;
                if (i11 > i10) {
                    char m4013b = c2444h.m4013b((i11 - i10) - 1);
                    char m4013b2 = c2444h.m4013b(c2444h.f13693b - i10);
                    if (Character.isHighSurrogate(m4013b) && Character.isLowSurrogate(m4013b2)) {
                        i9 += 2;
                    } else {
                        i9 = i10;
                    }
                    i8++;
                } else {
                    i9 = i11;
                    break;
                }
            } else {
                break;
            }
        }
        int i12 = 0;
        while (true) {
            if (i7 >= this.f13691b) {
                break;
            }
            int i13 = i12 + 1;
            int i14 = c2444h.f13694c;
            C2065f c2065f = c2444h.f13692a;
            if (i14 + i13 < c2065f.m3262b()) {
                char m4013b3 = c2444h.m4013b((c2444h.f13694c + i13) - 1);
                char m4013b4 = c2444h.m4013b(c2444h.f13694c + i13);
                if (Character.isHighSurrogate(m4013b3) && Character.isLowSurrogate(m4013b4)) {
                    i12 += 2;
                } else {
                    i12 = i13;
                }
                i7++;
            } else {
                i12 = c2065f.m3262b() - c2444h.f13694c;
                break;
            }
        }
        int i15 = c2444h.f13694c;
        c2444h.m4012a(i15, i12 + i15);
        int i16 = c2444h.f13693b;
        c2444h.m4012a(i16 - i9, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2442f)) {
            return false;
        }
        C2442f c2442f = (C2442f) obj;
        if (this.f13690a == c2442f.f13690a && this.f13691b == c2442f.f13691b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13690a * 31) + this.f13691b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f13690a);
        sb.append(", lengthAfterCursor=");
        return AbstractC2487d.m4045i(sb, this.f13691b, ')');
    }
}
