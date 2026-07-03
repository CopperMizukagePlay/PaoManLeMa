package p087l2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import p001a0.C0031h1;
import p008b.AbstractC0223b;
import p027d1.C0465c;
import p035e1.AbstractC0659i0;
import p035e1.C0647c0;
import p050g2.AbstractC1586f0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p073j2.AbstractC2168e;
import p132r2.EnumC3036j;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.c */
/* loaded from: classes.dex */
public final class C2436c {

    /* renamed from: a */
    public final C3728t f13665a;

    /* renamed from: b */
    public final C0031h1 f13666b;

    /* renamed from: d */
    public boolean f13668d;

    /* renamed from: e */
    public boolean f13669e;

    /* renamed from: f */
    public boolean f13670f;

    /* renamed from: g */
    public boolean f13671g;

    /* renamed from: h */
    public boolean f13672h;

    /* renamed from: i */
    public boolean f13673i;

    /* renamed from: j */
    public C2459w f13674j;

    /* renamed from: k */
    public C1598l0 f13675k;

    /* renamed from: l */
    public InterfaceC2453q f13676l;

    /* renamed from: n */
    public C0465c f13678n;

    /* renamed from: o */
    public C0465c f13679o;

    /* renamed from: c */
    public final Object f13667c = new Object();

    /* renamed from: m */
    public AbstractC3368k f13677m = C2434b.f13657h;

    /* renamed from: p */
    public final CursorAnchorInfo.Builder f13680p = new CursorAnchorInfo.Builder();

    /* renamed from: q */
    public final float[] f13681q = C0647c0.m1350a();

    /* renamed from: r */
    public final Matrix f13682r = new Matrix();

    public C2436c(C3728t c3728t, C0031h1 c0031h1) {
        this.f13665a = c3728t;
        this.f13666b = c0031h1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, g5.d] */
    /* JADX WARN: Type inference failed for: r3v3, types: [t5.c, u5.k] */
    /* renamed from: a */
    public final void m4010a() {
        View view;
        int m2600c;
        int m2600c2;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z7;
        int i12;
        C0031h1 c0031h1 = this.f13666b;
        ?? r22 = c0031h1.f153g;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) c0031h1.f152f;
        if (!inputMethodManager.isActive(view2)) {
            return;
        }
        ?? r32 = this.f13677m;
        float[] fArr = this.f13681q;
        r32.mo23f(new C0647c0(fArr));
        this.f13665a.m5745t(fArr);
        Matrix matrix = this.f13682r;
        AbstractC0659i0.m1419s(matrix, fArr);
        C2459w c2459w = this.f13674j;
        AbstractC3367j.m5097b(c2459w);
        long j6 = c2459w.f13724b;
        InterfaceC2453q interfaceC2453q = this.f13676l;
        AbstractC3367j.m5097b(interfaceC2453q);
        C1598l0 c1598l0 = this.f13675k;
        AbstractC3367j.m5097b(c1598l0);
        C1605p c1605p = c1598l0.f10289b;
        C0465c c0465c = this.f13678n;
        AbstractC3367j.m5097b(c0465c);
        float f7 = c0465c.f1628d;
        float f8 = c0465c.f1626b;
        C0465c c0465c2 = this.f13679o;
        AbstractC3367j.m5097b(c0465c2);
        boolean z8 = this.f13670f;
        boolean z9 = this.f13671g;
        boolean z10 = this.f13672h;
        boolean z11 = this.f13673i;
        CursorAnchorInfo.Builder builder = this.f13680p;
        builder.reset();
        builder.setMatrix(matrix);
        C1602n0 c1602n0 = c2459w.f13725c;
        int m2589e = C1602n0.m2589e(j6);
        builder.setSelectionRange(m2589e, C1602n0.m2588d(j6));
        EnumC3036j enumC3036j = EnumC3036j.f15601f;
        if (z8 && m2589e >= 0) {
            int mo168b = interfaceC2453q.mo168b(m2589e);
            C0465c m2576c = c1598l0.m2576c(mo168b);
            view = view2;
            float m3529p = AbstractC2168e.m3529p(m2576c.f1625a, 0.0f, (int) (c1598l0.f10290c >> 32));
            boolean m3534u = AbstractC2168e.m3534u(c0465c, m3529p, m2576c.f1626b);
            boolean m3534u2 = AbstractC2168e.m3534u(c0465c, m3529p, m2576c.f1628d);
            if (c1598l0.m2574a(mo168b) == enumC3036j) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!m3534u && !m3534u2) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (!m3534u || !m3534u2) {
                i12 |= 2;
            }
            if (z7) {
                i12 |= 4;
            }
            float f9 = m2576c.f1626b;
            float f10 = m2576c.f1628d;
            builder.setInsertionMarkerLocation(m3529p, f9, f10, f10, i12);
        } else {
            view = view2;
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z9) {
            int i13 = -1;
            if (c1602n0 != null) {
                i7 = C1602n0.m2589e(c1602n0.f10304a);
            } else {
                i7 = -1;
            }
            if (c1602n0 != null) {
                i13 = C1602n0.m2588d(c1602n0.f10304a);
            }
            if (i7 >= 0 && i7 < i13) {
                builder2.setComposingText(i7, c2459w.f13723a.f10239f.subSequence(i7, i13));
                int mo168b2 = interfaceC2453q.mo168b(i7);
                int mo168b3 = interfaceC2453q.mo168b(i13);
                float[] fArr2 = new float[(mo168b3 - mo168b2) * 4];
                c1605p.m2598a(AbstractC1586f0.m2558b(mo168b2, mo168b3), fArr2);
                while (i7 < i13) {
                    int mo168b4 = interfaceC2453q.mo168b(i7);
                    int i14 = (mo168b4 - mo168b2) * 4;
                    float f11 = fArr2[i14];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f12 = fArr2[i14 + 1];
                    int i15 = i13;
                    float f13 = fArr2[i14 + 2];
                    float f14 = fArr2[i14 + 3];
                    int i16 = i7;
                    if (c0465c.f1625a < f13) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    if (f11 < c0465c.f1627c) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    int i17 = i8 & i9;
                    if (f8 < f14) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    int i18 = i17 & i10;
                    if (f12 < f7) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int i19 = i18 & i11;
                    if (!AbstractC2168e.m3534u(c0465c, f11, f12) || !AbstractC2168e.m3534u(c0465c, f13, f14)) {
                        i19 |= 2;
                    }
                    if (c1598l0.m2574a(mo168b4) == enumC3036j) {
                        i19 |= 4;
                    }
                    builder3.addCharacterBounds(i16, f11, f12, f13, f14, i19);
                    builder2 = builder3;
                    i7 = i16 + 1;
                    i13 = i15;
                }
            }
        }
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 33 && z10) {
            editorBounds = AbstractC0223b.m491i().setEditorBounds(AbstractC0659i0.m1425y(c0465c2));
            handwritingBounds = editorBounds.setHandwritingBounds(AbstractC0659i0.m1425y(c0465c2));
            build = handwritingBounds.build();
            builder2.setEditorBoundsInfo(build);
        }
        if (i20 >= 34 && z11 && !c0465c.m1017d() && (m2600c = c1605p.m2600c(f8)) <= (m2600c2 = c1605p.m2600c(f7))) {
            while (true) {
                builder2.addVisibleLineBounds(c1598l0.m2579f(m2600c), c1605p.m2601d(m2600c), c1598l0.m2580g(m2600c), c1605p.m2599b(m2600c));
                if (m2600c == m2600c2) {
                    break;
                } else {
                    m2600c++;
                }
            }
        }
        ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder2.build());
        this.f13669e = false;
    }
}
