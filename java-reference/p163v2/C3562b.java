package p163v2;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p001a0.C0068q2;
import p012b3.C0274b;
import p051g3.AbstractC1661u;
import p051g3.C1628d0;
import p051g3.C1672z0;
import p065i2.AbstractC2064e;
import p146t1.AbstractC3191c1;
import p162v1.C3537s;
import p171w2.C3766p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.b */
/* loaded from: classes.dex */
public final class C3562b extends AbstractC1661u {

    /* renamed from: g */
    public final /* synthetic */ int f17112g;

    /* renamed from: h */
    public final /* synthetic */ ViewGroup f17113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3562b(ViewGroup viewGroup, int i7) {
        super(1);
        this.f17112g = i7;
        this.f17113h = viewGroup;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: d */
    public final C1672z0 mo2712d(C1672z0 c1672z0, List list) {
        switch (this.f17112g) {
            case 0:
                return ((C3576p) this.f17113h).m5540g(c1672z0);
            default:
                C3766p c3766p = (C3766p) this.f17113h;
                if (!c3766p.f17863p) {
                    View childAt = c3766p.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, c3766p.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, c3766p.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return c1672z0.f10450a.mo2676r(max, max2, max3, max4);
                    }
                    return c1672z0;
                }
                return c1672z0;
        }
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: e */
    public final C0068q2 mo2713e(C1628d0 c1628d0, C0068q2 c0068q2) {
        switch (this.f17112g) {
            case 0:
                C3537s c3537s = ((C3576p) this.f17113h).f17136C.f16872I.f16799c;
                if (c3537s.f17011T.f18005r) {
                    long m3225F = AbstractC2064e.m3225F(c3537s.mo4927U(0L));
                    int i7 = (int) (m3225F >> 32);
                    int i8 = 0;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    int i9 = (int) (m3225F & 4294967295L);
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    long mo4926S = AbstractC3191c1.m4897h(c3537s).mo4926S();
                    int i10 = (int) (mo4926S >> 32);
                    int i11 = (int) (mo4926S & 4294967295L);
                    long j6 = c3537s.f16055g;
                    long m3225F2 = AbstractC2064e.m3225F(c3537s.mo4927U((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L)));
                    int i12 = i10 - ((int) (m3225F2 >> 32));
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    int i13 = i11 - ((int) (4294967295L & m3225F2));
                    if (i13 >= 0) {
                        i8 = i13;
                    }
                    if (i7 != 0 || i9 != 0 || i12 != 0 || i8 != 0) {
                        return new C0068q2(6, AbstractC3569i.m5539f((C0274b) c0068q2.f344f, i7, i9, i12, i8), AbstractC3569i.m5539f((C0274b) c0068q2.f345g, i7, i9, i12, i8));
                    }
                    return c0068q2;
                }
                return c0068q2;
            default:
                C3766p c3766p = (C3766p) this.f17113h;
                if (!c3766p.f17863p) {
                    View childAt = c3766p.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, c3766p.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, c3766p.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        C0274b m581b = C0274b.m581b(max, max2, max3, max4);
                        int i14 = m581b.f1015a;
                        C0274b c0274b = (C0274b) c0068q2.f344f;
                        int i15 = m581b.f1016b;
                        int i16 = m581b.f1017c;
                        int i17 = m581b.f1018d;
                        return new C0068q2(6, C1672z0.m2740a(c0274b, i14, i15, i16, i17), C1672z0.m2740a((C0274b) c0068q2.f345g, i14, i15, i16, i17));
                    }
                    return c0068q2;
                }
                return c0068q2;
        }
    }
}
