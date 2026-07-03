package p018c0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import p027d1.C0465c;
import p035e1.AbstractC0659i0;
import p035e1.C0647c0;
import p050g2.AbstractC1586f0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p132r2.EnumC3036j;
import p146t1.InterfaceC3238v;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.u */
/* loaded from: classes.dex */
public final class C0351u {

    /* renamed from: a */
    public final C0333c f1175a;

    /* renamed from: b */
    public final C0349s f1176b;

    /* renamed from: d */
    public boolean f1178d;

    /* renamed from: e */
    public boolean f1179e;

    /* renamed from: f */
    public boolean f1180f;

    /* renamed from: g */
    public boolean f1181g;

    /* renamed from: h */
    public boolean f1182h;

    /* renamed from: i */
    public boolean f1183i;

    /* renamed from: j */
    public C2459w f1184j;

    /* renamed from: k */
    public C1598l0 f1185k;

    /* renamed from: l */
    public InterfaceC2453q f1186l;

    /* renamed from: m */
    public C0465c f1187m;

    /* renamed from: n */
    public C0465c f1188n;

    /* renamed from: c */
    public final Object f1177c = new Object();

    /* renamed from: o */
    public final CursorAnchorInfo.Builder f1189o = new CursorAnchorInfo.Builder();

    /* renamed from: p */
    public final float[] f1190p = C0647c0.m1350a();

    /* renamed from: q */
    public final Matrix f1191q = new Matrix();

    public C0351u(C0333c c0333c, C0349s c0349s) {
        this.f1175a = c0333c;
        this.f1176b = c0349s;
    }

    /* renamed from: a */
    public final void m791a() {
        boolean z7;
        boolean z8;
        boolean z9;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        C0349s c0349s = this.f1176b;
        InputMethodManager m787a = c0349s.m787a();
        View view = c0349s.f1170b;
        if (!m787a.isActive(view)) {
            return;
        }
        float[] fArr = this.f1190p;
        C0647c0.m1353d(fArr);
        InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f1175a.f1146m.f1174v.getValue();
        if (interfaceC3238v != null) {
            if (!interfaceC3238v.mo4923M()) {
                interfaceC3238v = null;
            }
            if (interfaceC3238v != null) {
                interfaceC3238v.mo4924N(fArr);
            }
        }
        C0465c c0465c = this.f1188n;
        AbstractC3367j.m5097b(c0465c);
        float f7 = -c0465c.f1625a;
        C0465c c0465c2 = this.f1188n;
        AbstractC3367j.m5097b(c0465c2);
        C0647c0.m1355f(fArr, f7, -c0465c2.f1626b);
        Matrix matrix = this.f1191q;
        AbstractC0659i0.m1419s(matrix, fArr);
        C2459w c2459w = this.f1184j;
        AbstractC3367j.m5097b(c2459w);
        long j6 = c2459w.f13724b;
        InterfaceC2453q interfaceC2453q = this.f1186l;
        AbstractC3367j.m5097b(interfaceC2453q);
        C1598l0 c1598l0 = this.f1185k;
        AbstractC3367j.m5097b(c1598l0);
        C0465c c0465c3 = this.f1187m;
        AbstractC3367j.m5097b(c0465c3);
        C0465c c0465c4 = this.f1188n;
        AbstractC3367j.m5097b(c0465c4);
        boolean z11 = this.f1180f;
        boolean z12 = this.f1181g;
        boolean z13 = this.f1182h;
        boolean z14 = this.f1183i;
        CursorAnchorInfo.Builder builder = this.f1189o;
        builder.reset();
        builder.setMatrix(matrix);
        C1602n0 c1602n0 = c2459w.f13725c;
        int m2589e = C1602n0.m2589e(j6);
        builder.setSelectionRange(m2589e, C1602n0.m2588d(j6));
        EnumC3036j enumC3036j = EnumC3036j.f15601f;
        if (z11 && m2589e >= 0) {
            int mo168b = interfaceC2453q.mo168b(m2589e);
            C0465c m2576c = c1598l0.m2576c(mo168b);
            z7 = z12;
            z8 = z13;
            float m3529p = AbstractC2168e.m3529p(m2576c.f1625a, 0.0f, (int) (c1598l0.f10290c >> 32));
            boolean m2983k = AbstractC1793a0.m2983k(c0465c3, m3529p, m2576c.f1626b);
            boolean m2983k2 = AbstractC1793a0.m2983k(c0465c3, m3529p, m2576c.f1628d);
            if (c1598l0.m2574a(mo168b) == enumC3036j) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!m2983k && !m2983k2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            if (!m2983k || !m2983k2) {
                i13 |= 2;
            }
            if (z10) {
                i13 |= 4;
            }
            float f8 = m2576c.f1626b;
            float f9 = m2576c.f1628d;
            builder.setInsertionMarkerLocation(m3529p, f8, f9, f9, i13);
        } else {
            z7 = z12;
            z8 = z13;
        }
        if (z7) {
            int i14 = -1;
            if (c1602n0 != null) {
                i8 = C1602n0.m2589e(c1602n0.f10304a);
            } else {
                i8 = -1;
            }
            if (c1602n0 != null) {
                i14 = C1602n0.m2588d(c1602n0.f10304a);
            }
            if (i8 >= 0 && i8 < i14) {
                builder.setComposingText(i8, c2459w.f13723a.f10239f.subSequence(i8, i14));
                int mo168b2 = interfaceC2453q.mo168b(i8);
                int mo168b3 = interfaceC2453q.mo168b(i14);
                float[] fArr2 = new float[(mo168b3 - mo168b2) * 4];
                z9 = z14;
                c1598l0.f10289b.m2598a(AbstractC1586f0.m2558b(mo168b2, mo168b3), fArr2);
                while (i8 < i14) {
                    int mo168b4 = interfaceC2453q.mo168b(i8);
                    int i15 = (mo168b4 - mo168b2) * 4;
                    float f10 = fArr2[i15];
                    float f11 = fArr2[i15 + 1];
                    int i16 = i14;
                    float f12 = fArr2[i15 + 2];
                    float f13 = fArr2[i15 + 3];
                    int i17 = mo168b2;
                    if (c0465c3.f1625a < f12) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if (f10 < c0465c3.f1627c) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    int i18 = i9 & i10;
                    if (c0465c3.f1626b < f13) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int i19 = i18 & i11;
                    if (f11 < c0465c3.f1628d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i20 = i19 & i12;
                    if (!AbstractC1793a0.m2983k(c0465c3, f10, f11) || !AbstractC1793a0.m2983k(c0465c3, f12, f13)) {
                        i20 |= 2;
                    }
                    if (c1598l0.m2574a(mo168b4) == enumC3036j) {
                        i20 |= 4;
                    }
                    int i21 = i8;
                    builder.addCharacterBounds(i21, f10, f11, f12, f13, i20);
                    i8 = i21 + 1;
                    i14 = i16;
                    mo168b2 = i17;
                }
                i7 = Build.VERSION.SDK_INT;
                if (i7 >= 33 && z8) {
                    AbstractC0338h.m696a(builder, c0465c4);
                }
                if (i7 >= 34 && z9) {
                    AbstractC0340j.m727a(builder, c1598l0, c0465c3);
                }
                c0349s.m787a().updateCursorAnchorInfo(view, builder.build());
                this.f1179e = false;
            }
        }
        z9 = z14;
        i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            AbstractC0338h.m696a(builder, c0465c4);
        }
        if (i7 >= 34) {
            AbstractC0340j.m727a(builder, c1598l0, c0465c3);
        }
        c0349s.m787a().updateCursorAnchorInfo(view, builder.build());
        this.f1179e = false;
    }
}
