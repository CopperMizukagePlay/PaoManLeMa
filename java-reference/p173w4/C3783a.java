package p173w4;

import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class C3783a {

    /* renamed from: e */
    public static final C3783a f17919e = new C3783a();

    /* renamed from: a */
    public final int[] f17920a = new int[929];

    /* renamed from: b */
    public final int[] f17921b = new int[929];

    /* renamed from: c */
    public final C3781e f17922c;

    /* renamed from: d */
    public final C3781e f17923d;

    public C3783a() {
        int i7 = 1;
        for (int i8 = 0; i8 < 929; i8++) {
            this.f17920a[i8] = i7;
            i7 = (i7 * 3) % 929;
        }
        for (int i9 = 0; i9 < 928; i9++) {
            this.f17921b[this.f17920a[i9]] = i9;
        }
        this.f17922c = new C3781e(this, new int[]{0});
        this.f17923d = new C3781e(this, new int[]{1});
    }

    /* renamed from: a */
    public final int m5790a(int i7, int i8) {
        return (i7 + i8) % 929;
    }

    /* renamed from: b */
    public final int m5791b(int i7) {
        if (i7 != 0) {
            return this.f17920a[928 - this.f17921b[i7]];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public final int m5792c(int i7, int i8) {
        if (i7 != 0 && i8 != 0) {
            int[] iArr = this.f17921b;
            return this.f17920a[(iArr[i7] + iArr[i8]) % 928];
        }
        return 0;
    }
}
