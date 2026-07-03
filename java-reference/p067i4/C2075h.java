package p067i4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.h */
/* loaded from: classes.dex */
public final class C2075h {

    /* renamed from: a */
    public final float f12285a;

    /* renamed from: b */
    public final float f12286b;

    /* renamed from: c */
    public final float f12287c;

    /* renamed from: d */
    public final float f12288d;

    /* renamed from: e */
    public final float f12289e;

    /* renamed from: f */
    public final float f12290f;

    /* renamed from: g */
    public final float f12291g;

    /* renamed from: h */
    public final float f12292h;

    /* renamed from: i */
    public final float f12293i;

    public C2075h(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f12285a = f7;
        this.f12286b = f10;
        this.f12287c = f13;
        this.f12288d = f8;
        this.f12289e = f11;
        this.f12290f = f14;
        this.f12291g = f9;
        this.f12292h = f12;
        this.f12293i = f15;
    }

    /* renamed from: a */
    public static C2075h m3352a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22) {
        C2075h m3353b = m3353b(f7, f8, f9, f10, f11, f12, f13, f14);
        float f23 = m3353b.f12289e;
        float f24 = m3353b.f12293i;
        float f25 = m3353b.f12290f;
        float f26 = m3353b.f12292h;
        float f27 = (f23 * f24) - (f25 * f26);
        float f28 = m3353b.f12291g;
        float f29 = m3353b.f12288d;
        float f30 = (f25 * f28) - (f29 * f24);
        float f31 = (f29 * f26) - (f23 * f28);
        float f32 = m3353b.f12287c;
        float f33 = m3353b.f12286b;
        float f34 = (f32 * f26) - (f33 * f24);
        float f35 = m3353b.f12285a;
        float f36 = (f24 * f35) - (f32 * f28);
        float f37 = (f28 * f33) - (f26 * f35);
        float f38 = (f33 * f25) - (f32 * f23);
        float f39 = (f32 * f29) - (f25 * f35);
        float f40 = (f35 * f23) - (f33 * f29);
        C2075h m3353b2 = m3353b(f15, f16, f17, f18, f19, f20, f21, f22);
        float f41 = m3353b2.f12285a;
        float f42 = m3353b2.f12288d;
        float f43 = m3353b2.f12291g;
        float f44 = (f43 * f38) + (f42 * f34) + (f41 * f27);
        float f45 = (f43 * f39) + (f42 * f36) + (f41 * f30);
        float f46 = f43 * f40;
        float f47 = f46 + (f42 * f37) + (f41 * f31);
        float f48 = m3353b2.f12286b;
        float f49 = m3353b2.f12289e;
        float f50 = m3353b2.f12292h;
        float f51 = (f50 * f38) + (f49 * f34) + (f48 * f27);
        float f52 = (f50 * f39) + (f49 * f36) + (f48 * f30);
        float f53 = f50 * f40;
        float f54 = f53 + (f49 * f37) + (f48 * f31);
        float f55 = m3353b2.f12287c;
        float f56 = m3353b2.f12290f;
        float f57 = f34 * f56;
        float f58 = m3353b2.f12293i;
        return new C2075h(f44, f45, f47, f51, f52, f54, (f38 * f58) + f57 + (f27 * f55), (f39 * f58) + (f36 * f56) + (f30 * f55), (f58 * f40) + (f56 * f37) + (f55 * f31));
    }

    /* renamed from: b */
    public static C2075h m3353b(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15 = ((f7 - f9) + f11) - f13;
        float f16 = ((f8 - f10) + f12) - f14;
        if (f15 == 0.0f && f16 == 0.0f) {
            return new C2075h(f9 - f7, f11 - f9, f7, f10 - f8, f12 - f10, f8, 0.0f, 0.0f, 1.0f);
        }
        float f17 = f9 - f11;
        float f18 = f13 - f11;
        float f19 = f10 - f12;
        float f20 = f14 - f12;
        float f21 = (f17 * f20) - (f18 * f19);
        float f22 = ((f20 * f15) - (f18 * f16)) / f21;
        float f23 = ((f17 * f16) - (f15 * f19)) / f21;
        return new C2075h((f22 * f9) + (f9 - f7), (f23 * f13) + (f13 - f7), f7, (f22 * f10) + (f10 - f8), (f23 * f14) + (f14 - f8), f8, f22, f23, 1.0f);
    }
}
