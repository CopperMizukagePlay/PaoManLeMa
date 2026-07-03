package p057h1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0005b;
import p001a0.C0031h1;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0666m;
import p035e1.C0676r;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.C1567a;
import p049g1.C1568b;
import p067i4.AbstractC2072e;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.e */
/* loaded from: classes.dex */
public final class C1755e implements InterfaceC1754d {

    /* renamed from: z */
    public static final AtomicBoolean f10689z = new AtomicBoolean(true);

    /* renamed from: b */
    public final C0676r f10690b;

    /* renamed from: c */
    public final C1568b f10691c;

    /* renamed from: d */
    public final RenderNode f10692d;

    /* renamed from: e */
    public long f10693e;

    /* renamed from: f */
    public Paint f10694f;

    /* renamed from: g */
    public Matrix f10695g;

    /* renamed from: h */
    public boolean f10696h;

    /* renamed from: i */
    public long f10697i;

    /* renamed from: j */
    public int f10698j;

    /* renamed from: k */
    public int f10699k;

    /* renamed from: l */
    public float f10700l;

    /* renamed from: m */
    public boolean f10701m;

    /* renamed from: n */
    public float f10702n;

    /* renamed from: o */
    public float f10703o;

    /* renamed from: p */
    public float f10704p;

    /* renamed from: q */
    public float f10705q;

    /* renamed from: r */
    public float f10706r;

    /* renamed from: s */
    public long f10707s;

    /* renamed from: t */
    public long f10708t;

    /* renamed from: u */
    public float f10709u;

    /* renamed from: v */
    public float f10710v;

    /* renamed from: w */
    public boolean f10711w;

    /* renamed from: x */
    public boolean f10712x;

    /* renamed from: y */
    public boolean f10713y;

    public C1755e(C3728t c3728t, C0676r c0676r, C1568b c1568b) {
        this.f10690b = c0676r;
        this.f10691c = c1568b;
        RenderNode create = RenderNode.create("Compose", c3728t);
        this.f10692d = create;
        this.f10693e = 0L;
        this.f10697i = 0L;
        if (f10689z.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC1761k.m2892c(create, AbstractC1761k.m2890a(create));
                AbstractC1761k.m2893d(create, AbstractC1761k.m2891b(create));
            }
            AbstractC1760j.m2889a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        m2852O(0);
        this.f10698j = 0;
        this.f10699k = 3;
        this.f10700l = 1.0f;
        this.f10702n = 1.0f;
        this.f10703o = 1.0f;
        long j6 = C0677s.f2204b;
        this.f10707s = j6;
        this.f10708t = j6;
        this.f10710v = 8.0f;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: A */
    public final void mo2812A(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10708t = j6;
            AbstractC1761k.m2893d(this.f10692d, AbstractC0659i0.m1426z(j6));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: B */
    public final void mo2813B(float f7) {
        this.f10703o = f7;
        this.f10692d.setScaleY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: C */
    public final Matrix mo2814C() {
        Matrix matrix = this.f10695g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f10695g = matrix;
        }
        this.f10692d.getMatrix(matrix);
        return matrix;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: D */
    public final void mo2815D(int i7, int i8, long j6) {
        int i9 = (int) (j6 >> 32);
        int i10 = (int) (4294967295L & j6);
        this.f10692d.setLeftTopRightBottom(i7, i8, i7 + i9, i8 + i10);
        if (!C3102l.m4790a(this.f10693e, j6)) {
            if (this.f10701m) {
                this.f10692d.setPivotX(i9 / 2.0f);
                this.f10692d.setPivotY(i10 / 2.0f);
            }
            this.f10693e = j6;
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: E */
    public final float mo2816E() {
        return 0.0f;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: F */
    public final void mo2817F(float f7) {
        this.f10710v = f7;
        this.f10692d.setCameraDistance(-f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: G */
    public final float mo2818G() {
        return this.f10706r;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: H */
    public final boolean mo2819H() {
        return this.f10692d.isValid();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: I */
    public final float mo2820I() {
        return this.f10703o;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: J */
    public final float mo2821J() {
        return this.f10709u;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: K */
    public final int mo2822K() {
        return this.f10699k;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: L */
    public final void mo2823L(long j6) {
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            this.f10701m = true;
            this.f10692d.setPivotX(((int) (this.f10693e >> 32)) / 2.0f);
            this.f10692d.setPivotY(((int) (4294967295L & this.f10693e)) / 2.0f);
        } else {
            this.f10701m = false;
            this.f10692d.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
            this.f10692d.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: M */
    public final long mo2824M() {
        return this.f10707s;
    }

    /* renamed from: N */
    public final void m2851N() {
        boolean z7;
        boolean z8 = this.f10711w;
        boolean z9 = false;
        if (z8 && !this.f10696h) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z8 && this.f10696h) {
            z9 = true;
        }
        if (z7 != this.f10712x) {
            this.f10712x = z7;
            this.f10692d.setClipToBounds(z7);
        }
        if (z9 != this.f10713y) {
            this.f10713y = z9;
            this.f10692d.setClipToOutline(z9);
        }
    }

    /* renamed from: O */
    public final void m2852O(int i7) {
        RenderNode renderNode = this.f10692d;
        if (i7 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f10694f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f10694f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f10694f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* renamed from: P */
    public final void m2853P() {
        int i7 = this.f10698j;
        if (i7 != 1 && this.f10699k == 3) {
            m2852O(i7);
        } else {
            m2852O(1);
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: a */
    public final float mo2825a() {
        return this.f10700l;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: b */
    public final void mo2826b() {
        this.f10692d.setRotationX(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: c */
    public final void mo2827c(float f7) {
        this.f10700l = f7;
        this.f10692d.setAlpha(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: d */
    public final float mo2828d() {
        return this.f10702n;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: e */
    public final void mo2829e(InterfaceC0674q interfaceC0674q) {
        DisplayListCanvas m1349a = AbstractC0646c.m1349a(interfaceC0674q);
        AbstractC3367j.m5098c(m1349a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        m1349a.drawRenderNode(this.f10692d);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: f */
    public final void mo2830f(float f7) {
        this.f10706r = f7;
        this.f10692d.setElevation(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: g */
    public final float mo2831g() {
        return this.f10705q;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: h */
    public final void mo2832h(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m, C1752b c1752b, C0005b c0005b) {
        Canvas start = this.f10692d.start(Math.max((int) (this.f10693e >> 32), (int) (this.f10697i >> 32)), Math.max((int) (this.f10693e & 4294967295L), (int) (this.f10697i & 4294967295L)));
        try {
            C0644b c0644b = this.f10690b.f2203a;
            Canvas canvas = c0644b.f2123a;
            c0644b.f2123a = start;
            C1568b c1568b = this.f10691c;
            C0031h1 c0031h1 = c1568b.f10182f;
            long m3347y = AbstractC2072e.m3347y(this.f10693e);
            C1567a c1567a = ((C1568b) c0031h1.f154h).f10181e;
            InterfaceC3093c interfaceC3093c2 = c1567a.f10177a;
            EnumC3103m enumC3103m2 = c1567a.f10178b;
            InterfaceC0674q m106u = c0031h1.m106u();
            long m109x = c0031h1.m109x();
            C1752b c1752b2 = (C1752b) c0031h1.f153g;
            c0031h1.m84H(interfaceC3093c);
            c0031h1.m85I(enumC3103m);
            c0031h1.m83G(c0644b);
            c0031h1.m86J(m3347y);
            c0031h1.f153g = c1752b;
            c0644b.mo1341m();
            try {
                c0005b.mo23f(c1568b);
                c0644b.mo1338j();
                c0031h1.m84H(interfaceC3093c2);
                c0031h1.m85I(enumC3103m2);
                c0031h1.m83G(m106u);
                c0031h1.m86J(m109x);
                c0031h1.f153g = c1752b2;
                c0644b.f2123a = canvas;
                this.f10692d.end(start);
            } catch (Throwable th) {
                c0644b.mo1338j();
                C0031h1 c0031h12 = c1568b.f10182f;
                c0031h12.m84H(interfaceC3093c2);
                c0031h12.m85I(enumC3103m2);
                c0031h12.m83G(m106u);
                c0031h12.m86J(m109x);
                c0031h12.f153g = c1752b2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f10692d.end(start);
            throw th2;
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: i */
    public final void mo2833i(float f7) {
        this.f10709u = f7;
        this.f10692d.setRotation(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: j */
    public final void mo2834j() {
        this.f10692d.setRotationY(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: k */
    public final void mo2835k(float f7) {
        this.f10705q = f7;
        this.f10692d.setTranslationY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: l */
    public final long mo2836l() {
        return this.f10708t;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: m */
    public final void mo2837m(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10707s = j6;
            AbstractC1761k.m2892c(this.f10692d, AbstractC0659i0.m1426z(j6));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: n */
    public final void mo2838n(Outline outline, long j6) {
        boolean z7;
        this.f10697i = j6;
        this.f10692d.setOutline(outline);
        if (outline != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f10696h = z7;
        m2851N();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: o */
    public final void mo2839o() {
        m2853P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: p */
    public final void mo2840p(float f7) {
        this.f10702n = f7;
        this.f10692d.setScaleX(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: q */
    public final void mo2841q(int i7) {
        if (this.f10699k == i7) {
            return;
        }
        this.f10699k = i7;
        Paint paint = this.f10694f;
        if (paint == null) {
            paint = new Paint();
            this.f10694f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC0659i0.m1397D(i7)));
        m2853P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: r */
    public final float mo2842r() {
        return this.f10710v;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: s */
    public final void mo2843s() {
        AbstractC1760j.m2889a(this.f10692d);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: t */
    public final float mo2844t() {
        return this.f10704p;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: u */
    public final void mo2845u(boolean z7) {
        this.f10711w = z7;
        m2851N();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: v */
    public final int mo2846v() {
        return this.f10698j;
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
        this.f10698j = i7;
        m2853P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: z */
    public final void mo2850z(float f7) {
        this.f10704p = f7;
        this.f10692d.setTranslationX(f7);
    }
}
