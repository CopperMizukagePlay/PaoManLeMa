package p170w1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import p019c1.AbstractC0362f;
import p019c1.C0360d;
import p027d1.C0465c;
import p034e0.C0625q;
import p035e1.AbstractC0659i0;
import p100n.AbstractC2647h;
import p136r6.C3066c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.k1 */
/* loaded from: classes.dex */
public final class C3694k1 {

    /* renamed from: f */
    public static final C3066c f17581f = new C3066c(2);

    /* renamed from: a */
    public final Rect f17582a = new Rect();

    /* renamed from: b */
    public final Rect f17583b = new Rect();

    /* renamed from: c */
    public final Rect f17584c = new Rect();

    /* renamed from: d */
    public final C3690j1 f17585d = new C3690j1(new C0625q(this));

    /* renamed from: e */
    public final ArrayList f17586e = new ArrayList();

    /* renamed from: d */
    public static void m5703d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    /* renamed from: a */
    public final View m5704a(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i8;
        Rect rect2 = this.f17582a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 17 && i7 != 33) {
                    if (i7 == 66 || i7 == 130) {
                        int scrollY = viewGroup.getScrollY();
                        int scrollX = viewGroup.getScrollX();
                        rect2.set(scrollX, scrollY, scrollX, scrollY);
                    }
                } else {
                    m5703d(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                m5703d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            m5703d(viewGroup, rect2);
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException(AbstractC2647h.m4256b("Unknown direction: ", i7));
            }
            return m5706c(i7, rect2, view, viewGroup, arrayList);
        }
        C3690j1 c3690j1 = this.f17585d;
        try {
            c3690j1.m5702a(arrayList, viewGroup);
            Collections.sort(arrayList, c3690j1);
            c3690j1.f17576g.m3586a();
            c3690j1.f17575f.m3600b();
            c3690j1.f17577h.m3548a();
            c3690j1.f17574e.m3586a();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 17 || i7 == 33 || i7 == 66 || i7 == 130) {
                        view2 = m5706c(i7, this.f17582a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i8 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i8);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            if (view2 == null) {
                return (View) arrayList.get(size - 1);
            }
            return view2;
        } catch (Throwable th) {
            c3690j1.f17576g.m3586a();
            c3690j1.f17575f.m3600b();
            c3690j1.f17577h.m3548a();
            c3690j1.f17574e.m3586a();
            throw th;
        }
    }

    /* renamed from: b */
    public final View m5705b(ViewGroup viewGroup, View view, int i7) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup3 != null) {
                        viewGroup2 = viewGroup3;
                    }
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                }
            }
        }
        viewGroup2 = viewGroup;
        View m5682i = AbstractC3681h0.m5682i(view, viewGroup2, i7);
        boolean z7 = true;
        View view3 = m5682i;
        while (m5682i != null) {
            if (m5682i.isFocusable() && m5682i.getVisibility() == 0 && (!m5682i.isInTouchMode() || m5682i.isFocusableInTouchMode())) {
                view2 = m5682i;
                break;
            }
            m5682i = AbstractC3681h0.m5682i(m5682i, viewGroup2, i7);
            boolean z8 = !z7;
            if (!z7) {
                if (view3 != null) {
                    view3 = AbstractC3681h0.m5682i(view3, viewGroup2, i7);
                } else {
                    view3 = null;
                }
                if (view3 == m5682i) {
                    break;
                }
            }
            z7 = z8;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.f17586e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                AbstractC3681h0.m5684k(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i7, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = m5704a(i7, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    /* renamed from: c */
    public final View m5706c(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int i8;
        Rect rect2 = this.f17583b;
        rect2.set(rect);
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 == 130) {
                        rect2.offset(0, (-rect.height()) - 1);
                    }
                } else {
                    rect2.offset((-rect.width()) - 1, 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i9 = 0; i9 < size; i9++) {
            View view3 = (View) arrayList.get(i9);
            if (!AbstractC3367j.m5096a(view3, view) && !AbstractC3367j.m5096a(view3, viewGroup)) {
                Rect rect3 = this.f17584c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                C0465c m1395B = AbstractC0659i0.m1395B(rect3);
                C0465c m1395B2 = AbstractC0659i0.m1395B(rect2);
                C0465c m1395B3 = AbstractC0659i0.m1395B(rect);
                C0360d m801D = AbstractC0362f.m801D(i7);
                if (m801D != null) {
                    i8 = m801D.f1227a;
                } else {
                    i8 = 1;
                }
                if (AbstractC0362f.m817o(m1395B, m1395B2, m1395B3, i8)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
