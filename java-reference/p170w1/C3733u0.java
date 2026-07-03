package p170w1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import p139s1.AbstractC3088a;
import p162v1.C3502g0;
import p163v2.AbstractC3569i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.u0 */
/* loaded from: classes.dex */
public final class C3733u0 extends ViewGroup {

    /* renamed from: e */
    public final HashMap f17791e;

    /* renamed from: f */
    public final HashMap f17792f;

    public C3733u0(Context context) {
        super(context);
        setClipChildren(false);
        this.f17791e = new HashMap();
        this.f17792f = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC3569i, C3502g0> getHolderToLayoutNode() {
        return this.f17791e;
    }

    public final HashMap<C3502g0, AbstractC3569i> getLayoutNodeToHolder() {
        return this.f17792f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        for (AbstractC3569i abstractC3569i : this.f17791e.keySet()) {
            abstractC3569i.layout(abstractC3569i.getLeft(), abstractC3569i.getTop(), abstractC3569i.getRight(), abstractC3569i.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        int i9;
        boolean z8 = false;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC3088a.m4749a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            z8 = true;
        }
        if (!z8) {
            AbstractC3088a.m4749a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
        for (AbstractC3569i abstractC3569i : this.f17791e.keySet()) {
            int i10 = abstractC3569i.f17157y;
            if (i10 != Integer.MIN_VALUE && (i9 = abstractC3569i.f17158z) != Integer.MIN_VALUE) {
                abstractC3569i.measure(i10, i9);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C3502g0 c3502g0 = (C3502g0) this.f17791e.get(childAt);
            if (childAt.isLayoutRequested() && c3502g0 != null) {
                C3502g0.m5396Y(c3502g0, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
