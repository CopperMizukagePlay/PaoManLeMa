package p056h0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.RunnableC0219y;
import p027d1.C0464b;
import p027d1.C0467e;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p137s.C3083l;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.n */
/* loaded from: classes.dex */
public final class C1740n extends View {

    /* renamed from: j */
    public static final int[] f10622j = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: k */
    public static final int[] f10623k = new int[0];

    /* renamed from: e */
    public C1750x f10624e;

    /* renamed from: f */
    public Boolean f10625f;

    /* renamed from: g */
    public Long f10626g;

    /* renamed from: h */
    public RunnableC0219y f10627h;

    /* renamed from: i */
    public InterfaceC3277a f10628i;

    private final void setRippleState(boolean z7) {
        long j6;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f10627h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l7 = this.f10626g;
        if (l7 != null) {
            j6 = l7.longValue();
        } else {
            j6 = 0;
        }
        long j7 = currentAnimationTimeMillis - j6;
        if (!z7 && j7 < 5) {
            RunnableC0219y runnableC0219y = new RunnableC0219y(10, this);
            this.f10627h = runnableC0219y;
            postDelayed(runnableC0219y, 50L);
        } else {
            if (z7) {
                iArr = f10622j;
            } else {
                iArr = f10623k;
            }
            C1750x c1750x = this.f10624e;
            if (c1750x != null) {
                c1750x.setState(iArr);
            }
        }
        this.f10626g = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(C1740n c1740n) {
        C1750x c1750x = c1740n.f10624e;
        if (c1750x != null) {
            c1750x.setState(f10623k);
        }
        c1740n.f10627h = null;
    }

    /* renamed from: b */
    public final void m2793b(C3083l c3083l, boolean z7, long j6, int i7, long j7, float f7, InterfaceC3277a interfaceC3277a) {
        if (this.f10624e == null || !Boolean.valueOf(z7).equals(this.f10625f)) {
            C1750x c1750x = new C1750x(z7);
            setBackground(c1750x);
            this.f10624e = c1750x;
            this.f10625f = Boolean.valueOf(z7);
        }
        C1750x c1750x2 = this.f10624e;
        AbstractC3367j.m5097b(c1750x2);
        this.f10628i = interfaceC3277a;
        Integer num = c1750x2.f10658g;
        if (num == null || num.intValue() != i7) {
            c1750x2.f10658g = Integer.valueOf(i7);
            C1749w.f10655a.m2804a(c1750x2, i7);
        }
        m2796e(j6, j7, f7);
        if (z7) {
            c1750x2.setHotspot(C0464b.m1008d(c3083l.f15681a), C0464b.m1009e(c3083l.f15681a));
        } else {
            c1750x2.setHotspot(c1750x2.getBounds().centerX(), c1750x2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: c */
    public final void m2794c() {
        this.f10628i = null;
        RunnableC0219y runnableC0219y = this.f10627h;
        if (runnableC0219y != null) {
            removeCallbacks(runnableC0219y);
            RunnableC0219y runnableC0219y2 = this.f10627h;
            AbstractC3367j.m5097b(runnableC0219y2);
            runnableC0219y2.run();
        } else {
            C1750x c1750x = this.f10624e;
            if (c1750x != null) {
                c1750x.setState(f10623k);
            }
        }
        C1750x c1750x2 = this.f10624e;
        if (c1750x2 == null) {
            return;
        }
        c1750x2.setVisible(false, false);
        unscheduleDrawable(c1750x2);
    }

    /* renamed from: d */
    public final void m2795d() {
        setRippleState(false);
    }

    /* renamed from: e */
    public final void m2796e(long j6, long j7, float f7) {
        boolean m1454c;
        C1750x c1750x = this.f10624e;
        if (c1750x == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f7 *= 2;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        long m1453b = C0677s.m1453b(f7, j7);
        C0677s c0677s = c1750x.f10657f;
        if (c0677s == null) {
            m1454c = false;
        } else {
            m1454c = C0677s.m1454c(c0677s.f2211a, m1453b);
        }
        if (!m1454c) {
            c1750x.f10657f = new C0677s(m1453b);
            c1750x.setColor(ColorStateList.valueOf(AbstractC0659i0.m1426z(m1453b)));
        }
        Rect rect = new Rect(0, 0, AbstractC3784a.m5794D(C0467e.m1026d(j6)), AbstractC3784a.m5794D(C0467e.m1024b(j6)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1750x.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        InterfaceC3277a interfaceC3277a = this.f10628i;
        if (interfaceC3277a != null) {
            interfaceC3277a.mo52a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
