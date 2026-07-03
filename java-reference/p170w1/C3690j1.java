package p170w1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import p034e0.C0625q;
import p077k.AbstractC2202l0;
import p077k.AbstractC2210p0;
import p077k.AbstractC2212q0;
import p077k.C2182b0;
import p077k.C2194h0;
import p077k.C2196i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.j1 */
/* loaded from: classes.dex */
public final class C3690j1 implements Comparator {

    /* renamed from: e */
    public final C2194h0 f17574e;

    /* renamed from: f */
    public final C2196i0 f17575f;

    /* renamed from: g */
    public final C2194h0 f17576g;

    /* renamed from: h */
    public final C2182b0 f17577h;

    public C3690j1(C0625q c0625q) {
        long[] jArr = AbstractC2210p0.f12722a;
        this.f17574e = new C2194h0();
        int i7 = AbstractC2212q0.f12726a;
        this.f17575f = new C2196i0();
        this.f17576g = new C2194h0();
        C2182b0 c2182b0 = AbstractC2202l0.f12710a;
        this.f17577h = new C2182b0();
    }

    /* renamed from: a */
    public final void m5702a(ArrayList arrayList, ViewGroup viewGroup) {
        C2182b0 c2182b0;
        View view;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            c2182b0 = this.f17577h;
            if (i7 >= size) {
                break;
            }
            c2182b0.m3555h(i7, (View) arrayList.get(i7));
            i7++;
        }
        int size2 = arrayList.size() - 1;
        C2196i0 c2196i0 = this.f17575f;
        C2194h0 c2194h0 = this.f17574e;
        if (size2 >= 0) {
            while (true) {
                int i8 = size2 - 1;
                View view2 = (View) arrayList.get(size2);
                int nextFocusForwardId = view2.getNextFocusForwardId();
                if (nextFocusForwardId != 0 && nextFocusForwardId != -1) {
                    view = AbstractC3681h0.m5682i(view2, viewGroup, 2);
                } else {
                    view = null;
                }
                if (view != null && c2182b0.m3551d(view) >= 0) {
                    c2194h0.m3598m(view2, view);
                    c2196i0.m3599a(view);
                }
                if (i8 < 0) {
                    break;
                } else {
                    size2 = i8;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i9 = size3 - 1;
            View view3 = (View) arrayList.get(size3);
            if (((View) c2194h0.m3592g(view3)) != null && !c2196i0.m3601c(view3)) {
                View view4 = view3;
                while (view3 != null) {
                    C2194h0 c2194h02 = this.f17576g;
                    View view5 = (View) c2194h02.m3592g(view3);
                    if (view5 != null) {
                        if (view5 == view4) {
                            break;
                        }
                        view3 = view4;
                        view4 = view5;
                    }
                    c2194h02.m3598m(view3, view4);
                    view3 = (View) c2194h0.m3592g(view3);
                }
            }
            if (i9 >= 0) {
                size3 = i9;
            } else {
                return;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view != view2) {
            if (view != null) {
                if (view2 != null) {
                    C2194h0 c2194h0 = this.f17576g;
                    View view3 = (View) c2194h0.m3592g(view);
                    View view4 = (View) c2194h0.m3592g(view2);
                    if (view3 == view4 && view3 != null) {
                        if (view != view3) {
                            if (view2 != view3 && this.f17574e.m3592g(view) != null) {
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    if (view3 != null) {
                        view = view3;
                    }
                    if (view4 != null) {
                        view2 = view4;
                    }
                    if (view3 == null && view4 == null) {
                        return 0;
                    }
                    C2182b0 c2182b0 = this.f17577h;
                    if (c2182b0.m3552e(view) < c2182b0.m3552e(view2)) {
                        return -1;
                    }
                    return 1;
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
