package p051g3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.v0 */
/* loaded from: classes.dex */
public class C1664v0 {

    /* renamed from: b */
    public static final C1672z0 f10435b;

    /* renamed from: a */
    public final C1672z0 f10436a;

    static {
        AbstractC1644l0 c1630e0;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 36) {
            c1630e0 = new C1642k0();
        } else if (i7 >= 35) {
            c1630e0 = new C1640j0();
        } else if (i7 >= 34) {
            c1630e0 = new C1638i0();
        } else if (i7 >= 31) {
            c1630e0 = new C1636h0();
        } else if (i7 >= 30) {
            c1630e0 = new C1634g0();
        } else if (i7 >= 29) {
            c1630e0 = new C1632f0();
        } else {
            c1630e0 = new C1630e0();
        }
        f10435b = c1630e0.mo2641b().f10450a.mo2692a().f10450a.mo2686b().f10450a.mo2687c();
    }

    public C1664v0(C1672z0 c1672z0) {
        this.f10436a = c1672z0;
    }

    /* renamed from: a */
    public C1672z0 mo2692a() {
        return this.f10436a;
    }

    /* renamed from: b */
    public C1672z0 mo2686b() {
        return this.f10436a;
    }

    /* renamed from: c */
    public C1672z0 mo2687c() {
        return this.f10436a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1664v0)) {
            return false;
        }
        C1664v0 c1664v0 = (C1664v0) obj;
        if (mo2677t() == c1664v0.mo2677t() && mo2689s() == c1664v0.mo2689s() && Objects.equals(mo2673n(), c1664v0.mo2673n()) && Objects.equals(mo2688l(), c1664v0.mo2688l()) && Objects.equals(mo2693h(), c1664v0.mo2693h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<Rect> mo2669f(int i7) {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: g */
    public List<Rect> mo2670g(int i7) {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: h */
    public C1624c mo2693h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo2677t()), Boolean.valueOf(mo2689s()), mo2673n(), mo2688l(), mo2693h());
    }

    /* renamed from: i */
    public C0274b mo2671i(int i7) {
        return C0274b.f1014e;
    }

    /* renamed from: j */
    public C0274b mo2672j(int i7) {
        if ((i7 & 8) == 0) {
            return C0274b.f1014e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* renamed from: k */
    public C0274b mo2695k() {
        return mo2673n();
    }

    /* renamed from: l */
    public C0274b mo2688l() {
        return C0274b.f1014e;
    }

    /* renamed from: m */
    public C0274b mo2696m() {
        return mo2673n();
    }

    /* renamed from: n */
    public C0274b mo2673n() {
        return C0274b.f1014e;
    }

    /* renamed from: o */
    public C0274b mo2697o() {
        return mo2673n();
    }

    /* renamed from: r */
    public C1672z0 mo2676r(int i7, int i8, int i9, int i10) {
        return f10435b;
    }

    /* renamed from: s */
    public boolean mo2689s() {
        return false;
    }

    /* renamed from: t */
    public boolean mo2677t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo2678u(int i7) {
        return true;
    }

    /* renamed from: q */
    public void mo2675q() {
    }

    /* renamed from: A */
    public void mo2662A(int i7) {
    }

    /* renamed from: B */
    public void mo2663B(Rect[][] rectArr) {
    }

    /* renamed from: C */
    public void mo2664C(Rect[][] rectArr) {
    }

    /* renamed from: d */
    public void mo2667d(View view) {
    }

    /* renamed from: e */
    public void mo2668e(C1672z0 c1672z0) {
    }

    /* renamed from: p */
    public void mo2674p(View view) {
    }

    /* renamed from: v */
    public void mo2679v(C1629e c1629e) {
    }

    /* renamed from: w */
    public void mo2680w(C0274b[] c0274bArr) {
    }

    /* renamed from: x */
    public void mo2681x(C0274b c0274b) {
    }

    /* renamed from: y */
    public void mo2682y(C1672z0 c1672z0) {
    }

    /* renamed from: z */
    public void mo2690z(C0274b c0274b) {
    }
}
