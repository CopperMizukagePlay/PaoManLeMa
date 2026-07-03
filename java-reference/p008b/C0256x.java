package p008b;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;
import p001a0.C0019e1;
import p051g3.C1620a1;
import p060h5.AbstractC1793a0;
import p074j3.AbstractC2176a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.x */
/* loaded from: classes.dex */
public final class C0256x extends C0255w {
    @Override // p008b.C0254v, p008b.C0251s, p008b.AbstractC0257y
    /* renamed from: b */
    public void mo524b(C0244l0 c0244l0, C0244l0 c0244l02, Window window, View view, boolean z7, boolean z8) {
        C1620a1 c1620a1;
        boolean z9;
        AbstractC3367j.m5100e(c0244l0, "statusBarStyle");
        AbstractC3367j.m5100e(c0244l02, "navigationBarStyle");
        AbstractC3367j.m5100e(window, "window");
        AbstractC3367j.m5100e(view, "view");
        AbstractC1793a0.m2969I(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = null;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        }
        if (viewGroup != null) {
            int i7 = 0;
            while (true) {
                if (i7 < viewGroup.getChildCount()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    break;
                }
                int i8 = i7 + 1;
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof AbstractC2176a)) {
                            Iterator it = ((Iterable) tag).iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                    i7 = i8;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        C0019e1 c0019e1 = new C0019e1(view);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i9 >= 30) {
            c1620a1 = new C1620a1(window, c0019e1, 1);
        } else if (i9 >= 26) {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        } else {
            c1620a1 = new C1620a1(window, c0019e1, 0);
        }
        c1620a1.mo2625G(!z7);
        c1620a1.mo2624F(!z8);
    }
}
