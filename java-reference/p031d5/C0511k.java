package p031d5;

import android.graphics.Rect;
import android.util.Log;
import p023c5.C0432x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.k */
/* loaded from: classes.dex */
public final class C0511k extends AbstractC0514n {

    /* renamed from: a */
    public final /* synthetic */ int f1833a;

    @Override // p031d5.AbstractC0514n
    /* renamed from: a */
    public final float mo1095a(C0432x c0432x, C0432x c0432x2) {
        switch (this.f1833a) {
            case 0:
                if (c0432x.f1470e > 0 && c0432x.f1471f > 0) {
                    C0432x m920a = c0432x.m920a(c0432x2);
                    float f7 = m920a.f1470e * 1.0f;
                    float f8 = f7 / c0432x.f1470e;
                    if (f8 > 1.0f) {
                        f8 = (float) Math.pow(1.0f / f8, 1.1d);
                    }
                    float f9 = ((m920a.f1471f * 1.0f) / c0432x2.f1471f) + (f7 / c0432x2.f1470e);
                    return ((1.0f / f9) / f9) * f8;
                }
                return 0.0f;
            case 1:
                if (c0432x.f1470e > 0 && c0432x.f1471f > 0) {
                    float f10 = c0432x.m921b(c0432x2).f1470e;
                    float f11 = (f10 * 1.0f) / c0432x.f1470e;
                    if (f11 > 1.0f) {
                        f11 = (float) Math.pow(1.0f / f11, 1.1d);
                    }
                    float f12 = ((c0432x2.f1471f * 1.0f) / r0.f1471f) * ((c0432x2.f1470e * 1.0f) / f10);
                    return (((1.0f / f12) / f12) / f12) * f11;
                }
                return 0.0f;
            default:
                int i7 = c0432x.f1470e;
                int i8 = c0432x.f1471f;
                if (i7 > 0 && i8 > 0) {
                    int i9 = c0432x2.f1470e;
                    int i10 = c0432x2.f1471f;
                    float f13 = (i7 * 1.0f) / i9;
                    if (f13 < 1.0f) {
                        f13 = 1.0f / f13;
                    }
                    float f14 = i8;
                    float f15 = i10;
                    float f16 = (f14 * 1.0f) / f15;
                    if (f16 < 1.0f) {
                        f16 = 1.0f / f16;
                    }
                    float f17 = (1.0f / f13) / f16;
                    float f18 = ((i7 * 1.0f) / f14) / ((i9 * 1.0f) / f15);
                    if (f18 < 1.0f) {
                        f18 = 1.0f / f18;
                    }
                    return (((1.0f / f18) / f18) / f18) * f17;
                }
                return 0.0f;
        }
    }

    @Override // p031d5.AbstractC0514n
    /* renamed from: b */
    public final Rect mo1096b(C0432x c0432x, C0432x c0432x2) {
        switch (this.f1833a) {
            case 0:
                C0432x m920a = c0432x.m920a(c0432x2);
                Log.i("k", "Preview: " + c0432x + "; Scaled: " + m920a + "; Want: " + c0432x2);
                int i7 = m920a.f1470e;
                int i8 = (i7 - c0432x2.f1470e) / 2;
                int i9 = m920a.f1471f;
                int i10 = (i9 - c0432x2.f1471f) / 2;
                return new Rect(-i8, -i10, i7 - i8, i9 - i10);
            case 1:
                C0432x m921b = c0432x.m921b(c0432x2);
                Log.i("k", "Preview: " + c0432x + "; Scaled: " + m921b + "; Want: " + c0432x2);
                int i11 = m921b.f1470e;
                int i12 = (i11 - c0432x2.f1470e) / 2;
                int i13 = m921b.f1471f;
                int i14 = (i13 - c0432x2.f1471f) / 2;
                return new Rect(-i12, -i14, i11 - i12, i13 - i14);
            default:
                return new Rect(0, 0, c0432x2.f1470e, c0432x2.f1471f);
        }
    }
}
