package p171w2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p001a0.C0074s0;
import p051g3.AbstractC1643l;
import p051g3.AbstractC1653q;
import p051g3.C1672z0;
import p051g3.InterfaceC1631f;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2395p;
import p085l0.C2405r1;
import p150t5.InterfaceC3281e;
import p163v2.C3562b;
import p170w1.AbstractC3652a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.p */
/* loaded from: classes.dex */
public final class C3766p extends AbstractC3652a implements InterfaceC3768r, InterfaceC1631f {

    /* renamed from: m */
    public final Window f17860m;

    /* renamed from: n */
    public final C2361g1 f17861n;

    /* renamed from: o */
    public boolean f17862o;

    /* renamed from: p */
    public boolean f17863p;

    /* renamed from: q */
    public boolean f17864q;

    /* renamed from: r */
    public boolean f17865r;

    public C3766p(Context context, Window window) {
        super(context);
        this.f17860m = window;
        this.f17861n = AbstractC2418w.m3980x(AbstractC3764n.f17858a);
        int i7 = AbstractC1653q.f10423a;
        AbstractC1643l.m2651b(this, this);
        AbstractC1653q.m2699b(this, new C3562b(this, 1));
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: a */
    public final void mo5617a(int i7, C2395p c2395p) {
        int i8;
        boolean z7;
        c2395p.m3859a0(1735448596);
        if (c2395p.m3874i(this)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = i8 | i7;
        if ((i9 & 3) != 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i9 & 1, z7)) {
            ((InterfaceC3281e) this.f17861n.getValue()).mo22d(c2395p, 0);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, 15, this);
        }
    }

    @Override // p051g3.InterfaceC1631f
    /* renamed from: c */
    public final C1672z0 mo2644c(View view, C1672z0 c1672z0) {
        if (!this.f17863p) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return c1672z0.f10450a.mo2676r(max, max2, max3, max4);
            }
        }
        return c1672z0;
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: e */
    public final void mo5620e(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i11 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i12 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: f */
    public final void mo5621f(int i7, int i8) {
        int i9;
        int min;
        int i10 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo5621f(i7, i8);
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        Window window = this.f17860m;
        if (mode == Integer.MIN_VALUE && !this.f17862o && !this.f17863p && window.getAttributes().height == -2) {
            i9 = size2 + 1;
        } else {
            i9 = size2;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i11 = size - paddingRight;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = i9 - paddingBottom;
        if (i12 >= 0) {
            i10 = i12;
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        childAt.measure(i7, i8);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
        } else {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                min = childAt.getMeasuredHeight() + paddingBottom;
            } else {
                min = size2;
            }
        } else {
            min = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, min);
        if (!this.f17863p && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
            window.addFlags(Integer.MIN_VALUE);
            if (!this.f17862o) {
                window.setLayout(-1, -1);
            }
        }
    }

    @Override // p170w1.AbstractC3652a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f17865r;
    }
}
