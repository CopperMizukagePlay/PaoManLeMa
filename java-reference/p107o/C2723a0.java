package p107o;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p010b1.InterfaceC0267e;
import p027d1.C0464b;
import p027d1.C0467e;
import p035e1.AbstractC0646c;
import p035e1.C0644b;
import p035e1.InterfaceC0674q;
import p049g1.C1567a;
import p049g1.C1568b;
import p057h1.C1752b;
import p058h2.AbstractC1765b;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.C3137j0;
import p162v1.C3508i0;
import p170w1.AbstractC3681h0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.a0 */
/* loaded from: classes.dex */
public final class C2723a0 extends AbstractC3681h0 implements InterfaceC0267e {

    /* renamed from: b */
    public final /* synthetic */ int f14580b = 1;

    /* renamed from: c */
    public final C2740g f14581c;

    /* renamed from: d */
    public final C2726b0 f14582d;

    /* renamed from: e */
    public Object f14583e;

    public C2723a0(C2740g c2740g, C2726b0 c2726b0) {
        this.f14581c = c2740g;
        this.f14582d = c2726b0;
    }

    /* renamed from: B */
    public static boolean m4381B(float f7, EdgeEffect edgeEffect, Canvas canvas) {
        if (f7 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f7);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: C */
    public static boolean m4382C(float f7, long j6, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f7);
        canvas.translate(C0464b.m1008d(j6), C0464b.m1009e(j6));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: D */
    public RenderNode m4383D() {
        RenderNode renderNode = (RenderNode) this.f14583e;
        if (renderNode == null) {
            RenderNode m2897d = AbstractC1765b.m2897d();
            this.f14583e = m2897d;
            return m2897d;
        }
        return renderNode;
    }

    @Override // p010b1.InterfaceC0267e
    /* renamed from: f */
    public final void mo561f(C3508i0 c3508i0) {
        boolean z7;
        boolean z8;
        boolean z9;
        RecordingCanvas beginRecording;
        float f7;
        boolean z10;
        float f8;
        float f9;
        float f10;
        float f11;
        boolean z11;
        float f12;
        boolean z12;
        float f13;
        boolean z13;
        float f14;
        float f15;
        switch (this.f14580b) {
            case 0:
                C3137j0 c3137j0 = ((C2733d1) this.f14583e).f14625b;
                C1568b c1568b = c3508i0.f16933e;
                long mo2546c = c1568b.mo2546c();
                C2740g c2740g = this.f14581c;
                c2740g.m4409l(mo2546c);
                if (C0467e.m1027e(c1568b.mo2546c())) {
                    c3508i0.m5460a();
                    return;
                }
                c3508i0.m5460a();
                c2740g.f14658g.getValue();
                Canvas m1349a = AbstractC0646c.m1349a(c1568b.f10182f.m106u());
                C2726b0 c2726b0 = this.f14582d;
                boolean z14 = false;
                if (C2726b0.m4384f(c2726b0.f14606f)) {
                    z7 = m4382C(270.0f, AbstractC3784a.m5797a(-C0467e.m1024b(c1568b.mo2546c()), c3508i0.mo4526y(c3137j0.mo4827d(c3508i0.getLayoutDirection()))), c2726b0.m4388c(), m1349a);
                } else {
                    z7 = false;
                }
                if (C2726b0.m4384f(c2726b0.f14604d)) {
                    if (!m4382C(0.0f, AbstractC3784a.m5797a(0.0f, c3508i0.mo4526y(c3137j0.f15796b)), c2726b0.m4390e(), m1349a) && !z7) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                }
                if (C2726b0.m4384f(c2726b0.f14607g)) {
                    if (!m4382C(90.0f, AbstractC3784a.m5797a(0.0f, c3508i0.mo4526y(c3137j0.mo4826c(c3508i0.getLayoutDirection())) + (-AbstractC3784a.m5794D(C0467e.m1026d(c1568b.mo2546c())))), c2726b0.m4389d(), m1349a) && !z7) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                }
                if (C2726b0.m4384f(c2726b0.f14605e)) {
                    if (m4382C(180.0f, AbstractC3784a.m5797a(-C0467e.m1026d(c1568b.mo2546c()), (-C0467e.m1024b(c1568b.mo2546c())) + c3508i0.mo4526y(c3137j0.f15798d)), c2726b0.m4387b(), m1349a) || z7) {
                        z14 = true;
                    }
                    z7 = z14;
                }
                if (z7) {
                    c2740g.m4404g();
                    return;
                }
                return;
            default:
                C1568b c1568b2 = c3508i0.f16933e;
                long mo2546c2 = c1568b2.mo2546c();
                C2740g c2740g2 = this.f14581c;
                c2740g2.m4409l(mo2546c2);
                if (C0467e.m1027e(c1568b2.mo2546c())) {
                    c3508i0.m5460a();
                    return;
                }
                c2740g2.f14658g.getValue();
                float mo4526y = c3508i0.mo4526y(AbstractC2781v.f14772a);
                Canvas m1349a2 = AbstractC0646c.m1349a(c1568b2.f10182f.m106u());
                C2726b0 c2726b02 = this.f14582d;
                if (!C2726b0.m4384f(c2726b02.f14604d) && !C2726b0.m4385g(c2726b02.f14608h) && !C2726b0.m4384f(c2726b02.f14605e) && !C2726b0.m4385g(c2726b02.f14609i)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!C2726b0.m4384f(c2726b02.f14606f) && !C2726b0.m4385g(c2726b02.f14610j) && !C2726b0.m4384f(c2726b02.f14607g) && !C2726b0.m4385g(c2726b02.f14611k)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z8 && z9) {
                    m4383D().setPosition(0, 0, m1349a2.getWidth(), m1349a2.getHeight());
                } else if (z8) {
                    m4383D().setPosition(0, 0, (AbstractC3784a.m5794D(mo4526y) * 2) + m1349a2.getWidth(), m1349a2.getHeight());
                } else if (z9) {
                    m4383D().setPosition(0, 0, m1349a2.getWidth(), (AbstractC3784a.m5794D(mo4526y) * 2) + m1349a2.getHeight());
                } else {
                    c3508i0.m5460a();
                    return;
                }
                beginRecording = m4383D().beginRecording();
                if (C2726b0.m4385g(c2726b02.f14610j)) {
                    EdgeEffect edgeEffect = c2726b02.f14610j;
                    if (edgeEffect == null) {
                        edgeEffect = c2726b02.m4386a();
                        c2726b02.f14610j = edgeEffect;
                    }
                    m4381B(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean m4384f = C2726b0.m4384f(c2726b02.f14606f);
                C2743h c2743h = C2743h.f14667a;
                if (m4384f) {
                    EdgeEffect m4388c = c2726b02.m4388c();
                    z10 = m4381B(270.0f, m4388c, beginRecording);
                    if (C2726b0.m4385g(c2726b02.f14606f)) {
                        float m1009e = C0464b.m1009e(c2740g2.m4403f());
                        EdgeEffect edgeEffect2 = c2726b02.f14610j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = c2726b02.m4386a();
                            c2726b02.f14610j = edgeEffect2;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            f15 = c2743h.m4413b(m4388c);
                        } else {
                            f15 = 0.0f;
                        }
                        f7 = mo4526y;
                        float f16 = 1 - m1009e;
                        if (i7 >= 31) {
                            c2743h.m4414c(edgeEffect2, f15, f16);
                        } else {
                            edgeEffect2.onPull(f15, f16);
                        }
                    } else {
                        f7 = mo4526y;
                    }
                } else {
                    f7 = mo4526y;
                    z10 = false;
                }
                if (C2726b0.m4385g(c2726b02.f14608h)) {
                    EdgeEffect edgeEffect3 = c2726b02.f14608h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = c2726b02.m4386a();
                        c2726b02.f14608h = edgeEffect3;
                    }
                    m4381B(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (C2726b0.m4384f(c2726b02.f14604d)) {
                    EdgeEffect m4390e = c2726b02.m4390e();
                    if (!m4381B(0.0f, m4390e, beginRecording) && !z10) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (C2726b0.m4385g(c2726b02.f14604d)) {
                        float m1008d = C0464b.m1008d(c2740g2.m4403f());
                        EdgeEffect edgeEffect4 = c2726b02.f14608h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = c2726b02.m4386a();
                            c2726b02.f14608h = edgeEffect4;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31) {
                            f14 = c2743h.m4413b(m4390e);
                        } else {
                            f14 = 0.0f;
                        }
                        if (i8 >= 31) {
                            c2743h.m4414c(edgeEffect4, f14, m1008d);
                        } else {
                            edgeEffect4.onPull(f14, m1008d);
                        }
                    }
                    z10 = z13;
                }
                if (C2726b0.m4385g(c2726b02.f14611k)) {
                    EdgeEffect edgeEffect5 = c2726b02.f14611k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = c2726b02.m4386a();
                        c2726b02.f14611k = edgeEffect5;
                    }
                    m4381B(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (C2726b0.m4384f(c2726b02.f14607g)) {
                    EdgeEffect m4389d = c2726b02.m4389d();
                    if (!m4381B(90.0f, m4389d, beginRecording) && !z10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (C2726b0.m4385g(c2726b02.f14607g)) {
                        float m1009e2 = C0464b.m1009e(c2740g2.m4403f());
                        EdgeEffect edgeEffect6 = c2726b02.f14611k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = c2726b02.m4386a();
                            c2726b02.f14611k = edgeEffect6;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 31) {
                            f13 = c2743h.m4413b(m4389d);
                        } else {
                            f13 = 0.0f;
                        }
                        if (i9 >= 31) {
                            c2743h.m4414c(edgeEffect6, f13, m1009e2);
                        } else {
                            edgeEffect6.onPull(f13, m1009e2);
                        }
                    }
                    z10 = z12;
                }
                if (C2726b0.m4385g(c2726b02.f14609i)) {
                    EdgeEffect edgeEffect7 = c2726b02.f14609i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = c2726b02.m4386a();
                        c2726b02.f14609i = edgeEffect7;
                    }
                    f8 = 0.0f;
                    m4381B(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f8 = 0.0f;
                }
                if (C2726b0.m4384f(c2726b02.f14605e)) {
                    EdgeEffect m4387b = c2726b02.m4387b();
                    if (!m4381B(180.0f, m4387b, beginRecording) && !z10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (C2726b0.m4385g(c2726b02.f14605e)) {
                        float m1008d2 = C0464b.m1008d(c2740g2.m4403f());
                        EdgeEffect edgeEffect8 = c2726b02.f14609i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = c2726b02.m4386a();
                            c2726b02.f14609i = edgeEffect8;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            f12 = c2743h.m4413b(m4387b);
                        } else {
                            f12 = f8;
                        }
                        float f17 = 1 - m1008d2;
                        if (i10 >= 31) {
                            c2743h.m4414c(edgeEffect8, f12, f17);
                        } else {
                            edgeEffect8.onPull(f12, f17);
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    c2740g2.m4404g();
                }
                if (z9) {
                    f9 = f8;
                } else {
                    f9 = f7;
                }
                if (!z8) {
                    f8 = f7;
                }
                EnumC3103m layoutDirection = c3508i0.getLayoutDirection();
                C0644b c0644b = new C0644b();
                c0644b.f2123a = beginRecording;
                long mo2546c3 = c1568b2.mo2546c();
                C0031h1 c0031h1 = c1568b2.f10182f;
                C1567a c1567a = ((C1568b) c0031h1.f154h).f10181e;
                InterfaceC3093c interfaceC3093c = c1567a.f10177a;
                EnumC3103m enumC3103m = c1567a.f10178b;
                InterfaceC0674q m106u = c0031h1.m106u();
                long m109x = c1568b2.f10182f.m109x();
                C0031h1 c0031h12 = c1568b2.f10182f;
                C1752b c1752b = (C1752b) c0031h12.f153g;
                c0031h12.m84H(c3508i0);
                c0031h12.m85I(layoutDirection);
                c0031h12.m83G(c0644b);
                c0031h12.m86J(mo2546c3);
                c0031h12.f153g = null;
                c0644b.mo1341m();
                try {
                    ((C0019e1) c1568b2.f10182f.f152f).m50v(f9, f8);
                    try {
                        c3508i0.m5460a();
                        c0644b.mo1338j();
                        C0031h1 c0031h13 = c1568b2.f10182f;
                        c0031h13.m84H(interfaceC3093c);
                        c0031h13.m85I(enumC3103m);
                        c0031h13.m83G(m106u);
                        c0031h13.m86J(m109x);
                        c0031h13.f153g = c1752b;
                        m4383D().endRecording();
                        int save = m1349a2.save();
                        m1349a2.translate(f10, f11);
                        m1349a2.drawRenderNode(m4383D());
                        m1349a2.restoreToCount(save);
                        return;
                    } finally {
                        ((C0019e1) c1568b2.f10182f.f152f).m50v(-f9, -f8);
                    }
                } catch (Throwable th) {
                    c0644b.mo1338j();
                    C0031h1 c0031h14 = c1568b2.f10182f;
                    c0031h14.m84H(interfaceC3093c);
                    c0031h14.m85I(enumC3103m);
                    c0031h14.m83G(m106u);
                    c0031h14.m86J(m109x);
                    c0031h14.f153g = c1752b;
                    throw th;
                }
        }
    }

    public C2723a0(C2740g c2740g, C2726b0 c2726b0, C2733d1 c2733d1) {
        this.f14581c = c2740g;
        this.f14582d = c2726b0;
        this.f14583e = c2733d1;
    }
}
