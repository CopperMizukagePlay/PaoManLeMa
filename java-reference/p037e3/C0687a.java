package p037e3;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import p053g5.C1687f;
import p077k.C2194h0;
import p085l0.C2392o0;
import p158u5.AbstractC3367j;
import p162v1.C3502g0;
import p170w1.AbstractC3698l1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0687a implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f2232e;

    public /* synthetic */ C0687a(int i7) {
        this.f2232e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2232e) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b8 = bArr[i7];
                    byte b9 = bArr2[i7];
                    if (b8 != b9) {
                        return b8 - b9;
                    }
                }
                return 0;
            case 1:
                C1687f c1687f = (C1687f) obj;
                C1687f c1687f2 = (C1687f) obj2;
                return (((Number) c1687f.f10472f).intValue() - ((Number) c1687f.f10471e).intValue()) - (((Number) c1687f2.f10472f).intValue() - ((Number) c1687f2.f10471e).intValue());
            case 2:
                return AbstractC3367j.m5101f(((C2392o0) obj).f13463b, ((C2392o0) obj2).f13463b);
            case 3:
                C3502g0 c3502g0 = (C3502g0) obj;
                C3502g0 c3502g02 = (C3502g0) obj2;
                float f7 = c3502g0.f16873J.f16953p.f17078J;
                float f8 = c3502g02.f16873J.f16953p.f17078J;
                if (f7 == f8) {
                    return AbstractC3367j.m5101f(c3502g0.m5448v(), c3502g02.m5448v());
                }
                return Float.compare(f7, f8);
            case 4:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                C2194h0 c2194h0 = AbstractC3698l1.f17595d;
                Object m3592g = c2194h0.m3592g(view);
                AbstractC3367j.m5097b(m3592g);
                Rect rect = (Rect) m3592g;
                Object m3592g2 = c2194h0.m3592g(view2);
                AbstractC3367j.m5097b(m3592g2);
                Rect rect2 = (Rect) m3592g2;
                int i8 = rect.top - rect2.top;
                if (i8 == 0) {
                    return rect.bottom - rect2.bottom;
                }
                return i8;
            default:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                C2194h0 c2194h02 = AbstractC3698l1.f17595d;
                Object m3592g3 = c2194h02.m3592g(view3);
                AbstractC3367j.m5097b(m3592g3);
                Rect rect3 = (Rect) m3592g3;
                Object m3592g4 = c2194h02.m3592g(view4);
                AbstractC3367j.m5097b(m3592g4);
                Rect rect4 = (Rect) m3592g4;
                int i9 = rect3.left - rect4.left;
                if (i9 == 0) {
                    return (rect3.right - rect4.right) * AbstractC3698l1.f17594c;
                }
                return AbstractC3698l1.f17594c * i9;
        }
    }
}
