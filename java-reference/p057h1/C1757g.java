package p057h1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import p001a0.C0005b;
import p001a0.C0031h1;
import p035e1.AbstractC0646c;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0666m;
import p035e1.C0676r;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.C1568b;
import p067i4.AbstractC2072e;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.g */
/* loaded from: classes.dex */
public final class C1757g implements InterfaceC1754d {

    /* renamed from: b */
    public final C0676r f10714b;

    /* renamed from: c */
    public final C1568b f10715c;

    /* renamed from: d */
    public final RenderNode f10716d;

    /* renamed from: e */
    public long f10717e;

    /* renamed from: f */
    public Paint f10718f;

    /* renamed from: g */
    public Matrix f10719g;

    /* renamed from: h */
    public boolean f10720h;

    /* renamed from: i */
    public float f10721i;

    /* renamed from: j */
    public int f10722j;

    /* renamed from: k */
    public float f10723k;

    /* renamed from: l */
    public float f10724l;

    /* renamed from: m */
    public float f10725m;

    /* renamed from: n */
    public float f10726n;

    /* renamed from: o */
    public float f10727o;

    /* renamed from: p */
    public long f10728p;

    /* renamed from: q */
    public long f10729q;

    /* renamed from: r */
    public float f10730r;

    /* renamed from: s */
    public float f10731s;

    /* renamed from: t */
    public boolean f10732t;

    /* renamed from: u */
    public boolean f10733u;

    /* renamed from: v */
    public boolean f10734v;

    /* renamed from: w */
    public int f10735w;

    public C1757g() {
        C0676r c0676r = new C0676r();
        C1568b c1568b = new C1568b();
        this.f10714b = c0676r;
        this.f10715c = c1568b;
        RenderNode m2858a = AbstractC1756f.m2858a();
        this.f10716d = m2858a;
        this.f10717e = 0L;
        m2858a.setClipToBounds(false);
        m2885O(m2858a, 0);
        this.f10721i = 1.0f;
        this.f10722j = 3;
        this.f10723k = 1.0f;
        this.f10724l = 1.0f;
        long j6 = C0677s.f2204b;
        this.f10728p = j6;
        this.f10729q = j6;
        this.f10731s = 8.0f;
        this.f10735w = 0;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: A */
    public final void mo2812A(long j6) {
        this.f10729q = j6;
        this.f10716d.setSpotShadowColor(AbstractC0659i0.m1426z(j6));
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: B */
    public final void mo2813B(float f7) {
        this.f10724l = f7;
        this.f10716d.setScaleY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: C */
    public final Matrix mo2814C() {
        Matrix matrix = this.f10719g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f10719g = matrix;
        }
        this.f10716d.getMatrix(matrix);
        return matrix;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: D */
    public final void mo2815D(int i7, int i8, long j6) {
        this.f10716d.setPosition(i7, i8, ((int) (j6 >> 32)) + i7, ((int) (4294967295L & j6)) + i8);
        this.f10717e = AbstractC2072e.m3347y(j6);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: E */
    public final float mo2816E() {
        return 0.0f;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: F */
    public final void mo2817F(float f7) {
        this.f10731s = f7;
        this.f10716d.setCameraDistance(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: G */
    public final float mo2818G() {
        return this.f10727o;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: H */
    public final boolean mo2819H() {
        boolean hasDisplayList;
        hasDisplayList = this.f10716d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: I */
    public final float mo2820I() {
        return this.f10724l;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: J */
    public final float mo2821J() {
        return this.f10730r;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: K */
    public final int mo2822K() {
        return this.f10722j;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: L */
    public final void mo2823L(long j6) {
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            this.f10716d.resetPivot();
        } else {
            this.f10716d.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
            this.f10716d.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: M */
    public final long mo2824M() {
        return this.f10728p;
    }

    /* renamed from: N */
    public final void m2884N() {
        boolean z7;
        boolean z8 = this.f10732t;
        boolean z9 = false;
        if (z8 && !this.f10720h) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z8 && this.f10720h) {
            z9 = true;
        }
        if (z7 != this.f10733u) {
            this.f10733u = z7;
            this.f10716d.setClipToBounds(z7);
        }
        if (z9 != this.f10734v) {
            this.f10734v = z9;
            this.f10716d.setClipToOutline(z9);
        }
    }

    /* renamed from: O */
    public final void m2885O(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setUseCompositingLayer(true, this.f10718f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, this.f10718f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f10718f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* renamed from: P */
    public final void m2886P() {
        int i7 = this.f10735w;
        if (i7 != 1 && this.f10722j == 3) {
            m2885O(this.f10716d, i7);
        } else {
            m2885O(this.f10716d, 1);
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: a */
    public final float mo2825a() {
        return this.f10721i;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: b */
    public final void mo2826b() {
        this.f10716d.setRotationX(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: c */
    public final void mo2827c(float f7) {
        this.f10721i = f7;
        this.f10716d.setAlpha(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: d */
    public final float mo2828d() {
        return this.f10723k;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: e */
    public final void mo2829e(InterfaceC0674q interfaceC0674q) {
        AbstractC0646c.m1349a(interfaceC0674q).drawRenderNode(this.f10716d);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: f */
    public final void mo2830f(float f7) {
        this.f10727o = f7;
        this.f10716d.setElevation(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: g */
    public final float mo2831g() {
        return this.f10726n;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: h */
    public final void mo2832h(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m, C1752b c1752b, C0005b c0005b) {
        RecordingCanvas beginRecording;
        C1568b c1568b = this.f10715c;
        beginRecording = this.f10716d.beginRecording();
        try {
            C0676r c0676r = this.f10714b;
            C0644b c0644b = c0676r.f2203a;
            Canvas canvas = c0644b.f2123a;
            c0644b.f2123a = beginRecording;
            C0031h1 c0031h1 = c1568b.f10182f;
            c0031h1.m84H(interfaceC3093c);
            c0031h1.m85I(enumC3103m);
            c0031h1.f153g = c1752b;
            c0031h1.m86J(this.f10717e);
            c0031h1.m83G(c0644b);
            c0005b.mo23f(c1568b);
            c0676r.f2203a.f2123a = canvas;
        } finally {
            this.f10716d.endRecording();
        }
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: i */
    public final void mo2833i(float f7) {
        this.f10730r = f7;
        this.f10716d.setRotationZ(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: j */
    public final void mo2834j() {
        this.f10716d.setRotationY(0.0f);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: k */
    public final void mo2835k(float f7) {
        this.f10726n = f7;
        this.f10716d.setTranslationY(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: l */
    public final long mo2836l() {
        return this.f10729q;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: m */
    public final void mo2837m(long j6) {
        this.f10728p = j6;
        this.f10716d.setAmbientShadowColor(AbstractC0659i0.m1426z(j6));
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: n */
    public final void mo2838n(Outline outline, long j6) {
        boolean z7;
        this.f10716d.setOutline(outline);
        if (outline != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f10720h = z7;
        m2884N();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: o */
    public final void mo2839o() {
        Paint paint = this.f10718f;
        if (paint == null) {
            paint = new Paint();
            this.f10718f = paint;
        }
        paint.setColorFilter(null);
        m2886P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: p */
    public final void mo2840p(float f7) {
        this.f10723k = f7;
        this.f10716d.setScaleX(f7);
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: q */
    public final void mo2841q(int i7) {
        this.f10722j = i7;
        Paint paint = this.f10718f;
        if (paint == null) {
            paint = new Paint();
            this.f10718f = paint;
        }
        paint.setBlendMode(AbstractC0659i0.m1422v(i7));
        m2886P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: r */
    public final float mo2842r() {
        return this.f10731s;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: s */
    public final void mo2843s() {
        this.f10716d.discardDisplayList();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: t */
    public final float mo2844t() {
        return this.f10725m;
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: u */
    public final void mo2845u(boolean z7) {
        this.f10732t = z7;
        m2884N();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: v */
    public final int mo2846v() {
        return this.f10735w;
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
        this.f10735w = i7;
        m2886P();
    }

    @Override // p057h1.InterfaceC1754d
    /* renamed from: z */
    public final void mo2850z(float f7) {
        this.f10725m = f7;
        this.f10716d.setTranslationX(f7);
    }
}
