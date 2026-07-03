package p085l0;

import java.util.ArrayList;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.z1 */
/* loaded from: classes.dex */
public final class C2429z1 {

    /* renamed from: a */
    public final C2338a2 f13637a;

    /* renamed from: b */
    public final int[] f13638b;

    /* renamed from: c */
    public final int f13639c;

    /* renamed from: d */
    public Object[] f13640d;

    /* renamed from: e */
    public final int f13641e;

    /* renamed from: f */
    public boolean f13642f;

    /* renamed from: g */
    public int f13643g;

    /* renamed from: h */
    public int f13644h;

    /* renamed from: i */
    public int f13645i;

    /* renamed from: j */
    public final C2388n0 f13646j;

    /* renamed from: k */
    public int f13647k;

    /* renamed from: l */
    public int f13648l;

    /* renamed from: m */
    public int f13649m;

    /* renamed from: n */
    public boolean f13650n;

    public C2429z1(C2338a2 c2338a2) {
        this.f13637a = c2338a2;
        this.f13638b = c2338a2.f13329e;
        int i7 = c2338a2.f13330f;
        this.f13639c = i7;
        this.f13640d = c2338a2.f13331g;
        this.f13641e = c2338a2.f13332h;
        this.f13644h = i7;
        this.f13645i = -1;
        this.f13646j = new C2388n0();
    }

    /* renamed from: a */
    public final C2335a m3988a(int i7) {
        ArrayList arrayList = this.f13637a.f13337m;
        int m3735e = AbstractC2346c2.m3735e(arrayList, i7, this.f13639c);
        if (m3735e < 0) {
            C2335a c2335a = new C2335a(i7);
            arrayList.add(-(m3735e + 1), c2335a);
            return c2335a;
        }
        return (C2335a) arrayList.get(m3735e);
    }

    /* renamed from: b */
    public final Object m3989b(int[] iArr, int i7) {
        int bitCount;
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 1];
        if ((268435456 & i9) != 0) {
            Object[] objArr = this.f13640d;
            if (i8 >= iArr.length) {
                bitCount = iArr.length;
            } else {
                bitCount = iArr[i8 + 4] + Integer.bitCount(i9 >> 29);
            }
            return objArr[bitCount];
        }
        return C2375k.f13421a;
    }

    /* renamed from: c */
    public final void m3990c() {
        this.f13642f = true;
        C2338a2 c2338a2 = this.f13637a;
        c2338a2.getClass();
        if (this.f13637a != c2338a2 || c2338a2.f13333i <= 0) {
            AbstractC2399q.m3900c("Unexpected reader close()");
        }
        c2338a2.f13333i--;
        this.f13640d = new Object[0];
    }

    /* renamed from: d */
    public final boolean m3991d(int i7) {
        if ((this.f13638b[(i7 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m3992e() {
        boolean z7;
        int m3731a;
        int i7;
        if (this.f13647k == 0) {
            if (this.f13643g == this.f13644h) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                AbstractC2399q.m3900c("endGroup() not called at the end of a group");
            }
            int i8 = (this.f13645i * 5) + 2;
            int[] iArr = this.f13638b;
            int i9 = iArr[i8];
            this.f13645i = i9;
            int i10 = this.f13639c;
            if (i9 < 0) {
                m3731a = i10;
            } else {
                m3731a = AbstractC2346c2.m3731a(iArr, i9) + i9;
            }
            this.f13644h = m3731a;
            int m3822b = this.f13646j.m3822b();
            if (m3822b < 0) {
                this.f13648l = 0;
                this.f13649m = 0;
                return;
            }
            this.f13648l = m3822b;
            if (i9 >= i10 - 1) {
                i7 = this.f13641e;
            } else {
                i7 = iArr[((i9 + 1) * 5) + 4];
            }
            this.f13649m = i7;
        }
    }

    /* renamed from: f */
    public final Object m3993f() {
        int i7 = this.f13643g;
        if (i7 < this.f13644h) {
            return m3989b(this.f13638b, i7);
        }
        return 0;
    }

    /* renamed from: g */
    public final int m3994g() {
        int i7 = this.f13643g;
        if (i7 < this.f13644h) {
            return this.f13638b[i7 * 5];
        }
        return 0;
    }

    /* renamed from: h */
    public final Object m3995h(int i7, int i8) {
        int i9;
        int[] iArr = this.f13638b;
        int m3733c = AbstractC2346c2.m3733c(iArr, i7);
        int i10 = i7 + 1;
        if (i10 < this.f13639c) {
            i9 = iArr[(i10 * 5) + 4];
        } else {
            i9 = this.f13641e;
        }
        int i11 = m3733c + i8;
        if (i11 < i9) {
            return this.f13640d[i11];
        }
        return C2375k.f13421a;
    }

    /* renamed from: i */
    public final int m3996i(int i7) {
        return this.f13638b[i7 * 5];
    }

    /* renamed from: j */
    public final boolean m3997j(int i7) {
        if ((this.f13638b[(i7 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m3998k(int i7) {
        if ((this.f13638b[(i7 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m3999l(int i7) {
        if ((this.f13638b[(i7 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final Object m4000m() {
        int i7;
        if (this.f13647k <= 0 && (i7 = this.f13648l) < this.f13649m) {
            this.f13650n = true;
            Object[] objArr = this.f13640d;
            this.f13648l = i7 + 1;
            return objArr[i7];
        }
        this.f13650n = false;
        return C2375k.f13421a;
    }

    /* renamed from: n */
    public final Object m4001n(int i7) {
        int i8 = i7 * 5;
        int[] iArr = this.f13638b;
        int i9 = iArr[i8 + 1] & 1073741824;
        if (i9 != 0) {
            if (i9 != 0) {
                return this.f13640d[iArr[i8 + 4]];
            }
            return C2375k.f13421a;
        }
        return null;
    }

    /* renamed from: o */
    public final int m4002o(int i7) {
        return this.f13638b[(i7 * 5) + 1] & 67108863;
    }

    /* renamed from: p */
    public final Object m4003p(int[] iArr, int i7) {
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) != 0) {
            return this.f13640d[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
        }
        return null;
    }

    /* renamed from: q */
    public final int m4004q(int i7) {
        return this.f13638b[(i7 * 5) + 2];
    }

    /* renamed from: r */
    public final void m4005r(int i7) {
        boolean z7;
        int i8;
        if (this.f13647k == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot reposition while in an empty region");
        }
        this.f13643g = i7;
        int[] iArr = this.f13638b;
        int i9 = this.f13639c;
        if (i7 < i9) {
            i8 = iArr[(i7 * 5) + 2];
        } else {
            i8 = -1;
        }
        if (i8 != this.f13645i) {
            this.f13645i = i8;
            if (i8 < 0) {
                this.f13644h = i9;
            } else {
                this.f13644h = AbstractC2346c2.m3731a(iArr, i8) + i8;
            }
            this.f13648l = 0;
            this.f13649m = 0;
        }
    }

    /* renamed from: s */
    public final int m4006s() {
        boolean z7;
        int i7 = 1;
        if (this.f13647k == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot skip while in an empty region");
        }
        int i8 = this.f13643g;
        int[] iArr = this.f13638b;
        if ((iArr[(i8 * 5) + 1] & 1073741824) == 0) {
            i7 = iArr[(i8 * 5) + 1] & 67108863;
        }
        this.f13643g = AbstractC2346c2.m3731a(iArr, i8) + i8;
        return i7;
    }

    /* renamed from: t */
    public final void m4007t() {
        boolean z7;
        if (this.f13647k == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot skip the enclosing group while in an empty region");
        }
        this.f13643g = this.f13644h;
        this.f13648l = 0;
        this.f13649m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f13643g);
        sb.append(", key=");
        sb.append(m3994g());
        sb.append(", parent=");
        sb.append(this.f13645i);
        sb.append(", end=");
        return AbstractC2487d.m4045i(sb, this.f13644h, ')');
    }

    /* renamed from: u */
    public final void m4008u() {
        boolean z7;
        int i7;
        if (this.f13647k <= 0) {
            int i8 = this.f13645i;
            int i9 = this.f13643g;
            int[] iArr = this.f13638b;
            if (iArr[(i9 * 5) + 2] == i8) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                AbstractC2389n1.m3828a("Invalid slot table detected");
            }
            int i10 = this.f13648l;
            int i11 = this.f13649m;
            C2388n0 c2388n0 = this.f13646j;
            if (i10 == 0 && i11 == 0) {
                c2388n0.m3823c(-1);
            } else {
                c2388n0.m3823c(i10);
            }
            this.f13645i = i9;
            this.f13644h = AbstractC2346c2.m3731a(iArr, i9) + i9;
            int i12 = i9 + 1;
            this.f13643g = i12;
            this.f13648l = AbstractC2346c2.m3733c(iArr, i9);
            if (i9 >= this.f13639c - 1) {
                i7 = this.f13641e;
            } else {
                i7 = iArr[(i12 * 5) + 4];
            }
            this.f13649m = i7;
        }
    }
}
