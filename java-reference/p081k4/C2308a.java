package p081k4;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k4.a */
/* loaded from: classes.dex */
public final class C2308a {

    /* renamed from: h */
    public static final C2308a f13252h = new C2308a(4201, 4096, 1);

    /* renamed from: i */
    public static final C2308a f13253i = new C2308a(1033, 1024, 1);

    /* renamed from: j */
    public static final C2308a f13254j;

    /* renamed from: k */
    public static final C2308a f13255k;

    /* renamed from: l */
    public static final C2308a f13256l;

    /* renamed from: m */
    public static final C2308a f13257m;

    /* renamed from: n */
    public static final C2308a f13258n;

    /* renamed from: o */
    public static final C2308a f13259o;

    /* renamed from: a */
    public final int[] f13260a;

    /* renamed from: b */
    public final int[] f13261b;

    /* renamed from: c */
    public final C2309b f13262c;

    /* renamed from: d */
    public final C2309b f13263d;

    /* renamed from: e */
    public final int f13264e;

    /* renamed from: f */
    public final int f13265f;

    /* renamed from: g */
    public final int f13266g;

    static {
        C2308a c2308a = new C2308a(67, 64, 1);
        f13254j = c2308a;
        f13255k = new C2308a(19, 16, 1);
        f13256l = new C2308a(285, 256, 0);
        C2308a c2308a2 = new C2308a(301, 256, 1);
        f13257m = c2308a2;
        f13258n = c2308a2;
        f13259o = c2308a;
    }

    public C2308a(int i7, int i8, int i9) {
        this.f13265f = i7;
        this.f13264e = i8;
        this.f13266g = i9;
        this.f13260a = new int[i8];
        this.f13261b = new int[i8];
        int i10 = 1;
        for (int i11 = 0; i11 < i8; i11++) {
            this.f13260a[i11] = i10;
            i10 *= 2;
            if (i10 >= i8) {
                i10 = (i10 ^ i7) & (i8 - 1);
            }
        }
        for (int i12 = 0; i12 < i8 - 1; i12++) {
            this.f13261b[this.f13260a[i12]] = i12;
        }
        this.f13262c = new C2309b(this, new int[]{0});
        this.f13263d = new C2309b(this, new int[]{1});
    }

    /* renamed from: a */
    public final C2309b m3680a(int i7, int i8) {
        if (i7 >= 0) {
            if (i8 == 0) {
                return this.f13262c;
            }
            int[] iArr = new int[i7 + 1];
            iArr[0] = i8;
            return new C2309b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final int m3681b(int i7) {
        if (i7 != 0) {
            return this.f13260a[(this.f13264e - this.f13261b[i7]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public final int m3682c(int i7, int i8) {
        if (i7 != 0 && i8 != 0) {
            int[] iArr = this.f13261b;
            return this.f13260a[(iArr[i7] + iArr[i8]) % (this.f13264e - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f13265f));
        sb.append(',');
        return AbstractC2487d.m4045i(sb, this.f13264e, ')');
    }
}
