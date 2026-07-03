package p051g3;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000a.AbstractC0000a;
import p012b3.C0274b;
import p021c3.AbstractC0390a;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.m0 */
/* loaded from: classes.dex */
public class C1646m0 extends C1664v0 {

    /* renamed from: n */
    public static boolean f10399n = false;

    /* renamed from: o */
    public static Method f10400o;

    /* renamed from: p */
    public static Class f10401p;

    /* renamed from: q */
    public static Field f10402q;

    /* renamed from: r */
    public static Field f10403r;

    /* renamed from: c */
    public final WindowInsets f10404c;

    /* renamed from: d */
    public C0274b[] f10405d;

    /* renamed from: e */
    public C0274b f10406e;

    /* renamed from: f */
    public C1672z0 f10407f;

    /* renamed from: g */
    public C0274b f10408g;

    /* renamed from: h */
    public int f10409h;

    /* renamed from: i */
    public C1629e f10410i;

    /* renamed from: j */
    public int f10411j;

    /* renamed from: k */
    public int f10412k;

    /* renamed from: l */
    public Rect[][] f10413l;

    /* renamed from: m */
    public Rect[][] f10414m;

    public C1646m0(C1672z0 c1672z0, WindowInsets windowInsets) {
        super(c1672z0);
        this.f10406e = null;
        this.f10413l = new Rect[10];
        this.f10414m = new Rect[10];
        this.f10404c = windowInsets;
    }

    /* renamed from: D */
    private C1629e m2654D(View view) {
        Display display;
        int i7;
        int i8;
        int i9;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f10436a.f10450a.mo2677t()) {
            return C1629e.m2639a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int i10 = 0;
        C1635h m15p = AbstractC0000a.m15p(display, 0);
        C1635h m15p2 = AbstractC0000a.m15p(display, 1);
        C1635h m15p3 = AbstractC0000a.m15p(display, 2);
        C1635h m15p4 = AbstractC0000a.m15p(display, 3);
        int i11 = point.x;
        int i12 = point.y;
        if (m15p != null) {
            i7 = m15p.f10388b;
        } else {
            i7 = 0;
        }
        if (m15p2 != null) {
            i8 = m15p2.f10388b;
        } else {
            i8 = 0;
        }
        if (m15p3 != null) {
            i9 = m15p3.f10388b;
        } else {
            i9 = 0;
        }
        if (m15p4 != null) {
            i10 = m15p4.f10388b;
        }
        return C1629e.m2639a(i11, i12, false, i7, i8, i9, i10);
    }

    /* renamed from: E */
    private static List<Rect> m2655E(Rect[][] rectArr, int i7) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0 && (rectArr2 = rectArr[AbstractC3393k.m5152w(i8)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    /* renamed from: F */
    private Rect[] m2656F(C0274b c0274b) {
        ArrayList arrayList = new ArrayList();
        int i7 = c0274b.f1015a;
        int i8 = c0274b.f1018d;
        int i9 = c0274b.f1017c;
        int i10 = c0274b.f1016b;
        if (i7 != 0) {
            arrayList.add(new Rect(0, 0, c0274b.f1015a, this.f10411j));
        }
        if (i10 != 0) {
            arrayList.add(new Rect(0, 0, this.f10412k, i10));
        }
        if (i9 != 0) {
            int i11 = this.f10412k;
            arrayList.add(new Rect(i11 - i9, 0, i11, this.f10411j));
        }
        if (i8 != 0) {
            int i12 = this.f10411j;
            arrayList.add(new Rect(0, i12 - i8, this.f10412k, i12));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* renamed from: G */
    private C0274b m2657G(int i7, boolean z7) {
        C0274b c0274b = C0274b.f1014e;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                c0274b = C0274b.m580a(c0274b, m2665H(i8, z7));
            }
        }
        return c0274b;
    }

    /* renamed from: I */
    private C0274b m2658I() {
        C1672z0 c1672z0 = this.f10407f;
        if (c1672z0 != null) {
            return c1672z0.f10450a.mo2688l();
        }
        return C0274b.f1014e;
    }

    /* renamed from: J */
    private C0274b m2659J(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f10399n) {
                m2660L();
            }
            Method method = f10400o;
            if (method != null && f10401p != null && f10402q != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f10402q.get(f10403r.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return C0274b.m581b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    /* renamed from: L */
    private static void m2660L() {
        try {
            f10400o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f10401p = cls;
            f10402q = cls.getDeclaredField("mVisibleInsets");
            f10403r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f10402q.setAccessible(true);
            f10403r.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f10399n = true;
    }

    /* renamed from: M */
    public static boolean m2661M(int i7, int i8) {
        if ((i7 & 6) == (i8 & 6)) {
            return true;
        }
        return false;
    }

    @Override // p051g3.C1664v0
    /* renamed from: A */
    public void mo2662A(int i7) {
        this.f10409h = i7;
    }

    @Override // p051g3.C1664v0
    /* renamed from: B */
    public void mo2663B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f10413l = (Rect[][]) rectArr.clone();
    }

    @Override // p051g3.C1664v0
    /* renamed from: C */
    public void mo2664C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f10414m = (Rect[][]) rectArr.clone();
    }

    /* renamed from: H */
    public C0274b m2665H(int i7, boolean z7) {
        int i8;
        C1624c mo2693h;
        int i9;
        int i10;
        int i11;
        C0274b c0274b = C0274b.f1014e;
        int i12 = 0;
        if (i7 != 1) {
            C0274b c0274b2 = null;
            if (i7 != 2) {
                if (i7 != 8) {
                    if (i7 != 16) {
                        if (i7 != 32) {
                            if (i7 != 64) {
                                if (i7 == 128) {
                                    C1672z0 c1672z0 = this.f10407f;
                                    if (c1672z0 != null) {
                                        mo2693h = c1672z0.f10450a.mo2693h();
                                    } else {
                                        mo2693h = mo2693h();
                                    }
                                    if (mo2693h != null) {
                                        int i13 = Build.VERSION.SDK_INT;
                                        if (i13 >= 28) {
                                            i9 = AbstractC0390a.m862e(mo2693h.f10367a);
                                        } else {
                                            i9 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i10 = AbstractC0390a.m864g(mo2693h.f10367a);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i11 = AbstractC0390a.m863f(mo2693h.f10367a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i13 >= 28) {
                                            i12 = AbstractC0390a.m861d(mo2693h.f10367a);
                                        }
                                        return C0274b.m581b(i9, i10, i11, i12);
                                    }
                                }
                            } else {
                                return mo2697o();
                            }
                        } else {
                            return mo2695k();
                        }
                    } else {
                        return mo2696m();
                    }
                } else {
                    C0274b[] c0274bArr = this.f10405d;
                    if (c0274bArr != null) {
                        c0274b2 = c0274bArr[AbstractC3393k.m5152w(8)];
                    }
                    if (c0274b2 != null) {
                        return c0274b2;
                    }
                    C0274b mo2673n = mo2673n();
                    C0274b m2658I = m2658I();
                    int i14 = mo2673n.f1018d;
                    if (i14 > m2658I.f1018d) {
                        return C0274b.m581b(0, 0, 0, i14);
                    }
                    C0274b c0274b3 = this.f10408g;
                    if (c0274b3 != null && !c0274b3.equals(c0274b) && (i8 = this.f10408g.f1018d) > m2658I.f1018d) {
                        return C0274b.m581b(0, 0, 0, i8);
                    }
                }
            } else {
                if (z7) {
                    C0274b m2658I2 = m2658I();
                    C0274b mo2688l = mo2688l();
                    return C0274b.m581b(Math.max(m2658I2.f1015a, mo2688l.f1015a), 0, Math.max(m2658I2.f1017c, mo2688l.f1017c), Math.max(m2658I2.f1018d, mo2688l.f1018d));
                }
                if ((this.f10409h & 2) == 0) {
                    C0274b mo2673n2 = mo2673n();
                    C1672z0 c1672z02 = this.f10407f;
                    if (c1672z02 != null) {
                        c0274b2 = c1672z02.f10450a.mo2688l();
                    }
                    int i15 = mo2673n2.f1018d;
                    if (c0274b2 != null) {
                        i15 = Math.min(i15, c0274b2.f1018d);
                    }
                    return C0274b.m581b(mo2673n2.f1015a, 0, mo2673n2.f1017c, i15);
                }
            }
        } else {
            if (z7) {
                return C0274b.m581b(0, Math.max(m2658I().f1016b, mo2673n().f1016b), 0, 0);
            }
            if ((this.f10409h & 4) == 0) {
                return C0274b.m581b(0, mo2673n().f1016b, 0, 0);
            }
        }
        return c0274b;
    }

    /* renamed from: K */
    public boolean m2666K(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !m2665H(i7, false).equals(C0274b.f1014e);
    }

    @Override // p051g3.C1664v0
    /* renamed from: d */
    public void mo2667d(View view) {
        this.f10412k = view.getWidth();
        this.f10411j = view.getHeight();
        C0274b m2659J = m2659J(view);
        if (m2659J == null) {
            m2659J = C0274b.f1014e;
        }
        mo2681x(m2659J);
    }

    @Override // p051g3.C1664v0
    /* renamed from: e */
    public void mo2668e(C1672z0 c1672z0) {
        c1672z0.f10450a.mo2682y(this.f10407f);
        C0274b c0274b = this.f10408g;
        C1664v0 c1664v0 = c1672z0.f10450a;
        c1664v0.mo2681x(c0274b);
        c1664v0.mo2662A(this.f10409h);
        c1664v0.mo2679v(this.f10410i);
        c1664v0.mo2663B(this.f10413l);
        c1664v0.mo2664C(this.f10414m);
    }

    @Override // p051g3.C1664v0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C1646m0 c1646m0 = (C1646m0) obj;
        if (!Objects.equals(this.f10408g, c1646m0.f10408g) || !m2661M(this.f10409h, c1646m0.f10409h)) {
            return false;
        }
        return true;
    }

    @Override // p051g3.C1664v0
    /* renamed from: f */
    public List<Rect> mo2669f(int i7) {
        return m2655E(this.f10413l, i7);
    }

    @Override // p051g3.C1664v0
    /* renamed from: g */
    public List<Rect> mo2670g(int i7) {
        return m2655E(this.f10414m, i7);
    }

    @Override // p051g3.C1664v0
    /* renamed from: i */
    public C0274b mo2671i(int i7) {
        return m2657G(i7, false);
    }

    @Override // p051g3.C1664v0
    /* renamed from: j */
    public C0274b mo2672j(int i7) {
        return m2657G(i7, true);
    }

    @Override // p051g3.C1664v0
    /* renamed from: n */
    public final C0274b mo2673n() {
        if (this.f10406e == null) {
            WindowInsets windowInsets = this.f10404c;
            this.f10406e = C0274b.m581b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f10406e;
    }

    @Override // p051g3.C1664v0
    /* renamed from: p */
    public void mo2674p(View view) {
        this.f10410i = m2654D(view);
    }

    @Override // p051g3.C1664v0
    /* renamed from: q */
    public void mo2675q() {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            int m5152w = AbstractC3393k.m5152w(i7);
            this.f10413l[m5152w] = m2656F(mo2671i(i7));
            if (i7 != 8) {
                this.f10414m[m5152w] = m2656F(mo2672j(i7));
            }
        }
    }

    @Override // p051g3.C1664v0
    /* renamed from: r */
    public C1672z0 mo2676r(int i7, int i8, int i9, int i10) {
        AbstractC1644l0 c1630e0;
        C1672z0 m2741c = C1672z0.m2741c(null, this.f10404c);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 36) {
            c1630e0 = new C1642k0(m2741c);
        } else if (i11 >= 35) {
            c1630e0 = new C1640j0(m2741c);
        } else if (i11 >= 34) {
            c1630e0 = new C1638i0(m2741c);
        } else if (i11 >= 31) {
            c1630e0 = new C1636h0(m2741c);
        } else if (i11 >= 30) {
            c1630e0 = new C1634g0(m2741c);
        } else if (i11 >= 29) {
            c1630e0 = new C1632f0(m2741c);
        } else {
            c1630e0 = new C1630e0(m2741c);
        }
        c1630e0.mo2643h(C1672z0.m2740a(mo2673n(), i7, i8, i9, i10));
        c1630e0.mo2642f(C1672z0.m2740a(mo2688l(), i7, i8, i9, i10));
        return c1630e0.mo2641b();
    }

    @Override // p051g3.C1664v0
    /* renamed from: t */
    public boolean mo2677t() {
        return this.f10404c.isRound();
    }

    @Override // p051g3.C1664v0
    /* renamed from: u */
    public boolean mo2678u(int i7) {
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0 && !m2666K(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // p051g3.C1664v0
    /* renamed from: v */
    public void mo2679v(C1629e c1629e) {
        this.f10410i = c1629e;
    }

    @Override // p051g3.C1664v0
    /* renamed from: w */
    public void mo2680w(C0274b[] c0274bArr) {
        this.f10405d = c0274bArr;
    }

    @Override // p051g3.C1664v0
    /* renamed from: x */
    public void mo2681x(C0274b c0274b) {
        this.f10408g = c0274b;
    }

    @Override // p051g3.C1664v0
    /* renamed from: y */
    public void mo2682y(C1672z0 c1672z0) {
        this.f10407f = c1672z0;
    }

    public C1646m0(C1672z0 c1672z0, C1646m0 c1646m0) {
        this(c1672z0, new WindowInsets(c1646m0.f10404c));
    }
}
