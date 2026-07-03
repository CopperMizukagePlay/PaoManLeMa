package p057h1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import p001a0.C0005b;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0666m;
import p035e1.C0676r;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.C1568b;
import p064i1.AbstractC2058a;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.i */
/* loaded from: classes.dex */
public final class C1759i implements InterfaceC1754d {

    /* renamed from: z */
    public static final C1758h f10736z = new Canvas();

    /* renamed from: b */
    public final AbstractC2058a f10737b;

    /* renamed from: c */
    public final C0676r f10738c;

    /* renamed from: d */
    public final C1763m f10739d;

    /* renamed from: e */
    public final Resources f10740e;

    /* renamed from: f */
    public final Rect f10741f;

    /* renamed from: g */
    public Paint f10742g;

    /* renamed from: h */
    public int f10743h;

    /* renamed from: i */
    public int f10744i;

    /* renamed from: j */
    public long f10745j;

    /* renamed from: k */
    public boolean f10746k;

    /* renamed from: l */
    public boolean f10747l;

    /* renamed from: m */
    public boolean f10748m;

    /* renamed from: n */
    public int f10749n;

    /* renamed from: o */
    public int f10750o;

    /* renamed from: p */
    public float f10751p;

    /* renamed from: q */
    public boolean f10752q;

    /* renamed from: r */
    public float f10753r;

    /* renamed from: s */
    public float f10754s;

    /* renamed from: t */
    public float f10755t;

    /* renamed from: u */
    public float f10756u;

    /* renamed from: v */
    public float f10757v;

    /* renamed from: w */
    public long f10758w;

    /* renamed from: x */
    public long f10759x;

    /* renamed from: y */
    public float f10760y;

    public C1759i(AbstractC2058a abstractC2058a) {
        C0676r c0676r = new C0676r();
        C1568b c1568b = new C1568b();
        this.f10737b = abstractC2058a;
        this.f10738c = c0676r;
        C1763m c1763m = new C1763m(abstractC2058a, c0676r, c1568b);
        this.f10739d = c1763m;
        this.f10740e = abstractC2058a.getResources();
        this.f10741f = new Rect();
        abstractC2058a.addView(c1763m);
        c1763m.setClipBounds(null);
        this.f10745j = 0L;
        View.generateViewId();
        this.f10749n = 3;
        this.f10750o = 0;
        this.f10751p = 1.0f;
        this.f10753r = 1.0f;
        this.f10754s = 1.0f;
        long j6 = C0677s.f2204b;
        this.f10758w = j6;
        this.f10759x = j6;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: A */
    public final void mo2812A(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10759x = j6;
            this.f10739d.setOutlineSpotShadowColor(AbstractC0659i0.m1426z(j6));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: B */
    public final void mo2813B(float f7) {
        this.f10754s = f7;
        this.f10739d.setScaleY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: C */
    public final Matrix mo2814C() {
        return this.f10739d.getMatrix();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: D */
    public final void mo2815D(int i7, int i8, long j6) {
        boolean m4790a = C3102l.m4790a(this.f10745j, j6);
        C1763m c1763m = this.f10739d;
        if (!m4790a) {
            if (this.f10748m || c1763m.getClipToOutline()) {
                this.f10746k = true;
            }
            int i9 = (int) (j6 >> 32);
            int i10 = (int) (4294967295L & j6);
            c1763m.layout(i7, i8, i7 + i9, i8 + i10);
            this.f10745j = j6;
            if (this.f10752q) {
                c1763m.setPivotX(i9 / 2.0f);
                c1763m.setPivotY(i10 / 2.0f);
            }
        } else {
            int i11 = this.f10743h;
            if (i11 != i7) {
                c1763m.offsetLeftAndRight(i7 - i11);
            }
            int i12 = this.f10744i;
            if (i12 != i8) {
                c1763m.offsetTopAndBottom(i8 - i12);
            }
        }
        this.f10743h = i7;
        this.f10744i = i8;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: E */
    public final float mo2816E() {
        return 0.0f;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: F */
    public final void mo2817F(float f7) {
        this.f10739d.setCameraDistance(f7 * this.f10740e.getDisplayMetrics().densityDpi);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: G */
    public final float mo2818G() {
        return this.f10757v;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: I */
    public final float mo2820I() {
        return this.f10754s;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: J */
    public final float mo2821J() {
        return this.f10760y;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: K */
    public final int mo2822K() {
        return this.f10749n;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: L */
    public final void mo2823L(long j6) {
        long j7 = 9223372034707292159L & j6;
        C1763m c1763m = this.f10739d;
        if (j7 == 9205357640488583168L) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1763m.resetPivot();
                return;
            }
            this.f10752q = true;
            c1763m.setPivotX(((int) (this.f10745j >> 32)) / 2.0f);
            c1763m.setPivotY(((int) (this.f10745j & 4294967295L)) / 2.0f);
            return;
        }
        this.f10752q = false;
        c1763m.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
        c1763m.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: M */
    public final long mo2824M() {
        return this.f10758w;
    }

    /* renamed from: N */
    public final void m2887N(int i7) {
        C1763m c1763m = this.f10739d;
        boolean z7 = true;
        if (i7 == 1) {
            c1763m.setLayerType(2, this.f10742g);
        } else if (i7 == 2) {
            c1763m.setLayerType(0, this.f10742g);
            z7 = false;
        } else {
            c1763m.setLayerType(0, this.f10742g);
        }
        c1763m.setCanUseCompositingLayer$ui_graphics_release(z7);
    }

    /* renamed from: O */
    public final void m2888O() {
        int i7 = this.f10750o;
        if (i7 != 1 && this.f10749n == 3) {
            m2887N(i7);
        } else {
            m2887N(1);
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: a */
    public final float mo2825a() {
        return this.f10751p;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: b */
    public final void mo2826b() {
        this.f10739d.setRotationX(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: c */
    public final void mo2827c(float f7) {
        this.f10751p = f7;
        this.f10739d.setAlpha(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: d */
    public final float mo2828d() {
        return this.f10753r;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: e */
    public final void mo2829e(InterfaceC0674q interfaceC0674q) {
        Rect rect;
        boolean z7 = this.f10746k;
        C1763m c1763m = this.f10739d;
        if (z7) {
            if ((this.f10748m || c1763m.getClipToOutline()) && !this.f10747l) {
                rect = this.f10741f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c1763m.getWidth();
                rect.bottom = c1763m.getHeight();
            } else {
                rect = null;
            }
            c1763m.setClipBounds(rect);
        }
        if (AbstractC0646c.m1349a(interfaceC0674q).isHardwareAccelerated()) {
            this.f10737b.m3221a(interfaceC0674q, c1763m, c1763m.getDrawingTime());
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: f */
    public final void mo2830f(float f7) {
        this.f10757v = f7;
        this.f10739d.setElevation(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: g */
    public final float mo2831g() {
        return this.f10756u;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: h */
    public final void mo2832h(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m, C1752b c1752b, C0005b c0005b) {
        C1763m c1763m = this.f10739d;
        ViewParent parent = c1763m.getParent();
        AbstractC2058a abstractC2058a = this.f10737b;
        if (parent == null) {
            abstractC2058a.addView(c1763m);
        }
        c1763m.f10769k = interfaceC3093c;
        c1763m.f10770l = enumC3103m;
        c1763m.f10771m = c0005b;
        c1763m.f10772n = c1752b;
        if (c1763m.isAttachedToWindow()) {
            c1763m.setVisibility(4);
            c1763m.setVisibility(0);
            try {
                C0676r c0676r = this.f10738c;
                C1758h c1758h = f10736z;
                C0644b c0644b = c0676r.f2203a;
                Canvas canvas = c0644b.f2123a;
                c0644b.f2123a = c1758h;
                abstractC2058a.m3221a(c0644b, c1763m, c1763m.getDrawingTime());
                c0676r.f2203a.f2123a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: i */
    public final void mo2833i(float f7) {
        this.f10760y = f7;
        this.f10739d.setRotation(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: j */
    public final void mo2834j() {
        this.f10739d.setRotationY(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: k */
    public final void mo2835k(float f7) {
        this.f10756u = f7;
        this.f10739d.setTranslationY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: l */
    public final long mo2836l() {
        return this.f10759x;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: m */
    public final void mo2837m(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10758w = j6;
            this.f10739d.setOutlineAmbientShadowColor(AbstractC0659i0.m1426z(j6));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: n */
    public final void mo2838n(Outline outline, long j6) {
        C1763m c1763m = this.f10739d;
        c1763m.f10767i = outline;
        c1763m.invalidateOutline();
        boolean z7 = false;
        if ((this.f10748m || c1763m.getClipToOutline()) && outline != null) {
            c1763m.setClipToOutline(true);
            if (this.f10748m) {
                this.f10748m = false;
                this.f10746k = true;
            }
        }
        if (outline != null) {
            z7 = true;
        }
        this.f10747l = z7;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: o */
    public final void mo2839o() {
        Paint paint = this.f10742g;
        if (paint == null) {
            paint = new Paint();
            this.f10742g = paint;
        }
        paint.setColorFilter(null);
        m2888O();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: p */
    public final void mo2840p(float f7) {
        this.f10753r = f7;
        this.f10739d.setScaleX(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: q */
    public final void mo2841q(int i7) {
        this.f10749n = i7;
        Paint paint = this.f10742g;
        if (paint == null) {
            paint = new Paint();
            this.f10742g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC0659i0.m1397D(i7)));
        m2888O();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: r */
    public final float mo2842r() {
        return this.f10739d.getCameraDistance() / this.f10740e.getDisplayMetrics().densityDpi;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: s */
    public final void mo2843s() {
        this.f10737b.removeViewInLayout(this.f10739d);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: t */
    public final float mo2844t() {
        return this.f10755t;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: u */
    public final void mo2845u(boolean z7) {
        boolean z8;
        boolean z9 = false;
        if (z7 && !this.f10747l) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10748m = z8;
        this.f10746k = true;
        if (z7 && this.f10747l) {
            z9 = true;
        }
        this.f10739d.setClipToOutline(z9);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: v */
    public final int mo2846v() {
        return this.f10750o;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: w */
    public final float mo2847w() {
        return 0.0f;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: x */
    public final C0666m mo2848x() {
        return null;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: y */
    public final void mo2849y(int i7) {
        this.f10750o = i7;
        m2888O();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: z */
    public final void mo2850z(float f7) {
        this.f10755t = f7;
        this.f10739d.setTranslationX(f7);
    }
}
