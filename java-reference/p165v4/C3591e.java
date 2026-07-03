package p165v4;

import p001a0.C0068q2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.e */
/* loaded from: classes.dex */
public final class C3591e extends C0068q2 {

    /* renamed from: h */
    public final boolean f17244h;

    public C3591e(C3589c c3589c, boolean z7) {
        super(c3589c);
        this.f17244h = z7;
    }

    /* renamed from: H */
    public final C3587a m5585H() {
        C3587a[] c3587aArr = (C3587a[]) this.f345g;
        C3588b c3588b = new C3588b();
        C3588b c3588b2 = new C3588b();
        C3588b c3588b3 = new C3588b();
        C3588b c3588b4 = new C3588b();
        for (C3587a c3587a : c3587aArr) {
            if (c3587a != null) {
                c3587a.m5578b();
                int i7 = c3587a.f17229e % 30;
                int i8 = c3587a.f17230f;
                if (!this.f17244h) {
                    i8 += 2;
                }
                int i9 = i8 % 3;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            c3588b.m5580b(i7 + 1);
                        }
                    } else {
                        c3588b4.m5580b(i7 / 3);
                        c3588b3.m5580b(i7 % 3);
                    }
                } else {
                    c3588b2.m5580b((i7 * 3) + 1);
                }
            }
        }
        if (c3588b.m5579a().length != 0 && c3588b2.m5579a().length != 0 && c3588b3.m5579a().length != 0 && c3588b4.m5579a().length != 0 && c3588b.m5579a()[0] >= 1 && c3588b2.m5579a()[0] + c3588b3.m5579a()[0] >= 3 && c3588b2.m5579a()[0] + c3588b3.m5579a()[0] <= 90) {
            C3587a c3587a2 = new C3587a(c3588b.m5579a()[0], c3588b2.m5579a()[0], c3588b3.m5579a()[0], c3588b4.m5579a()[0], 0);
            m5586I(c3587aArr, c3587a2);
            return c3587a2;
        }
        return null;
    }

    /* renamed from: I */
    public final void m5586I(C3587a[] c3587aArr, C3587a c3587a) {
        for (int i7 = 0; i7 < c3587aArr.length; i7++) {
            C3587a c3587a2 = c3587aArr[i7];
            if (c3587a2 != null) {
                int i8 = c3587a2.f17229e % 30;
                int i9 = c3587a2.f17230f;
                if (i9 > c3587a.f17230f) {
                    c3587aArr[i7] = null;
                } else {
                    if (!this.f17244h) {
                        i9 += 2;
                    }
                    int i10 = i9 % 3;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2 && i8 + 1 != c3587a.f17226b) {
                                c3587aArr[i7] = null;
                            }
                        } else if (i8 / 3 != c3587a.f17227c || i8 % 3 != c3587a.f17229e) {
                            c3587aArr[i7] = null;
                        }
                    } else if ((i8 * 3) + 1 != c3587a.f17228d) {
                        c3587aArr[i7] = null;
                    }
                }
            }
        }
    }

    @Override // p001a0.C0068q2
    public final String toString() {
        return "IsLeft: " + this.f17244h + '\n' + super.toString();
    }
}
