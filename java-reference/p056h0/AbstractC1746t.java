package p056h0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.t */
/* loaded from: classes.dex */
public abstract class AbstractC1746t {

    /* renamed from: a */
    public static final boolean f10644a = AbstractC3367j.m5096a(Build.DEVICE, "layoutlib");

    /* renamed from: a */
    public static final C1738l m2798a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof C1738l) {
                return (C1738l) childAt;
            }
        }
        C1738l c1738l = new C1738l(viewGroup.getContext());
        viewGroup.addView(c1738l);
        return c1738l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    /* renamed from: b */
    public static final ViewGroup m2799b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (parent instanceof View) {
                view = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        return (ViewGroup) view;
    }
}
