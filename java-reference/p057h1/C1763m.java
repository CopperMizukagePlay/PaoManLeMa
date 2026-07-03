package p057h1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import p001a0.C0031h1;
import p035e1.C0644b;
import p035e1.C0676r;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1569c;
import p049g1.C1567a;
import p049g1.C1568b;
import p064i1.AbstractC2058a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.m */
/* loaded from: classes.dex */
public final class C1763m extends View {

    /* renamed from: o */
    public static final C1762l f10762o = new C1762l(0);

    /* renamed from: e */
    public final AbstractC2058a f10763e;

    /* renamed from: f */
    public final C0676r f10764f;

    /* renamed from: g */
    public final C1568b f10765g;

    /* renamed from: h */
    public boolean f10766h;

    /* renamed from: i */
    public Outline f10767i;

    /* renamed from: j */
    public boolean f10768j;

    /* renamed from: k */
    public InterfaceC3093c f10769k;

    /* renamed from: l */
    public EnumC3103m f10770l;

    /* renamed from: m */
    public InterfaceC3279c f10771m;

    /* renamed from: n */
    public C1752b f10772n;

    public C1763m(AbstractC2058a abstractC2058a, C0676r c0676r, C1568b c1568b) {
        super(abstractC2058a.getContext());
        this.f10763e = abstractC2058a;
        this.f10764f = c0676r;
        this.f10765g = c1568b;
        setOutlineProvider(f10762o);
        this.f10768j = true;
        this.f10769k = AbstractC1569c.f10185a;
        this.f10770l = EnumC3103m.f15703e;
        InterfaceC1754d.f10688a.getClass();
        this.f10771m = C1751a.f10661h;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0676r c0676r = this.f10764f;
        C0644b c0644b = c0676r.f2203a;
        Canvas canvas2 = c0644b.f2123a;
        c0644b.f2123a = canvas;
        InterfaceC3093c interfaceC3093c = this.f10769k;
        EnumC3103m enumC3103m = this.f10770l;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1752b c1752b = this.f10772n;
        InterfaceC3279c interfaceC3279c = this.f10771m;
        C1568b c1568b = this.f10765g;
        C0031h1 c0031h1 = c1568b.f10182f;
        C1567a c1567a = ((C1568b) c0031h1.f154h).f10181e;
        InterfaceC3093c interfaceC3093c2 = c1567a.f10177a;
        EnumC3103m enumC3103m2 = c1567a.f10178b;
        InterfaceC0674q m106u = c0031h1.m106u();
        C0031h1 c0031h12 = c1568b.f10182f;
        long m109x = c0031h12.m109x();
        C1752b c1752b2 = (C1752b) c0031h12.f153g;
        c0031h12.m84H(interfaceC3093c);
        c0031h12.m85I(enumC3103m);
        c0031h12.m83G(c0644b);
        c0031h12.m86J(floatToRawIntBits);
        c0031h12.f153g = c1752b;
        c0644b.mo1341m();
        try {
            interfaceC3279c.mo23f(c1568b);
            c0644b.mo1338j();
            c0031h12.m84H(interfaceC3093c2);
            c0031h12.m85I(enumC3103m2);
            c0031h12.m83G(m106u);
            c0031h12.m86J(m109x);
            c0031h12.f153g = c1752b2;
            c0676r.f2203a.f2123a = canvas2;
            this.f10766h = false;
        } catch (Throwable th) {
            c0644b.mo1338j();
            c0031h12.m84H(interfaceC3093c2);
            c0031h12.m85I(enumC3103m2);
            c0031h12.m83G(m106u);
            c0031h12.m86J(m109x);
            c0031h12.f153g = c1752b2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f10768j;
    }

    public final C0676r getCanvasHolder() {
        return this.f10764f;
    }

    public final View getOwnerView() {
        return this.f10763e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f10768j;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.f10766h) {
            this.f10766h = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z7) {
        if (this.f10768j != z7) {
            this.f10768j = z7;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z7) {
        this.f10766h = z7;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
