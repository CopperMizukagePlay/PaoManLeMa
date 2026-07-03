package p170w1;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p019c1.C0367k;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.C0468a;
import p028d2.C0473f;
import p028d2.C0474g;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0490w;
import p035e1.AbstractC0664l;
import p035e1.C0660j;
import p037e3.C0687a;
import p043f2.EnumC1533a;
import p050g2.C1587g;
import p050g2.C1598l0;
import p053g5.InterfaceC1684c;
import p059h3.C1778d;
import p059h3.C1782h;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p077k.C2184c0;
import p077k.C2194h0;
import p085l0.C2413u0;
import p100n.C2649h1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.InterfaceC3467n;
import p162v1.C3502g0;
import p163v2.AbstractC3569i;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC3681h0 implements InterfaceC3675f2 {

    /* renamed from: a */
    public static final Class[] f17535a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: A */
    public static final String m5680A(int i7) {
        if (i7 == 0) {
            return "android.widget.Button";
        }
        if (i7 == 1) {
            return "android.widget.CheckBox";
        }
        if (i7 == 3) {
            return "android.widget.RadioButton";
        }
        if (i7 == 5) {
            return "android.widget.ImageView";
        }
        if (i7 == 6) {
            return "android.widget.Spinner";
        }
        if (i7 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* renamed from: h */
    public static final boolean m5681h(C0482o c0482o) {
        C0477j m1048k = c0482o.m1048k();
        return !m1048k.f1683e.m3588c(AbstractC0487t.f1748i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r0;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View m5682i(View view, View view2, int i7) {
        int nextFocusForwardId;
        View m5688o;
        if (i7 != 1) {
            if (i7 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                C0367k c0367k = new C0367k(nextFocusForwardId, 3);
                View view3 = null;
                while (true) {
                    m5688o = m5688o(view, c0367k, view3);
                    if (m5688o != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return m5688o;
            }
        } else if (view.getId() != -1) {
            C2649h1 c2649h1 = new C2649h1(23, view2, view);
            View view5 = null;
            while (true) {
                View m5688o2 = m5688o(view, c2649h1, view5);
                if (m5688o2 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    /* renamed from: j */
    public static final boolean m5683j(C0482o c0482o, Resources resources) {
        boolean z7;
        Object m3592g = c0482o.f1694d.f1683e.m3592g(AbstractC0487t.f1740a);
        String str = null;
        if (m3592g == null) {
            m3592g = null;
        }
        List list = (List) m3592g;
        if (list != null) {
            str = (String) AbstractC1805m.m3047k0(list);
        }
        if (str == null && m5691r(c0482o) == null && m5690q(c0482o, resources) == null && !m5689p(c0482o)) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!AbstractC0485r.m1061e(c0482o) && (c0482o.f1694d.f1685g || (c0482o.m1052o() && z7))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final void m5684k(View view, ArrayList arrayList, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i7;
        int i8;
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z7 || view.isFocusableInTouchMode())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (view instanceof ViewGroup) {
            int size = arrayList.size();
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getDescendantFocusability() == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 && z9) {
                arrayList.add(view);
            }
            if (viewGroup.getDescendantFocusability() != 393216) {
                int childCount = viewGroup.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i9 = 0; i9 < childCount; i9++) {
                    viewArr[i9] = viewGroup.getChildAt(i9);
                }
                C2184c0 c2184c0 = AbstractC3698l1.f17592a;
                if (viewGroup.getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0687a c0687a = AbstractC3698l1.f17597f;
                C2184c0 c2184c02 = AbstractC3698l1.f17592a;
                C2194h0 c2194h0 = AbstractC3698l1.f17595d;
                if (childCount < 2) {
                    i7 = 0;
                } else {
                    int i10 = childCount - c2184c02.f12629b;
                    i7 = 0;
                    for (int i11 = 0; i11 < i10; i11++) {
                        c2184c02.m3556a(new Rect());
                    }
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View view2 = viewArr[i12];
                        int i13 = AbstractC3698l1.f17593b;
                        AbstractC3698l1.f17593b = i13 + 1;
                        Rect rect = (Rect) c2184c02.m3560e(i13);
                        view2.getDrawingRect(rect);
                        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                        c2194h0.m3598m(view2, rect);
                    }
                    C0687a c0687a2 = AbstractC3698l1.f17596e;
                    AbstractC3367j.m5100e(c0687a2, "comparator");
                    if (childCount > 1) {
                        Arrays.sort(viewArr, c0687a2);
                    }
                    Object m3592g = c2194h0.m3592g(viewArr[0]);
                    AbstractC3367j.m5097b(m3592g);
                    int i14 = ((Rect) m3592g).bottom;
                    if (z10) {
                        i8 = -1;
                    } else {
                        i8 = 1;
                    }
                    AbstractC3698l1.f17594c = i8;
                    int i15 = 0;
                    for (int i16 = 0; i16 < childCount; i16++) {
                        Object m3592g2 = c2194h0.m3592g(viewArr[i16]);
                        AbstractC3367j.m5097b(m3592g2);
                        Rect rect2 = (Rect) m3592g2;
                        if (rect2.top >= i14) {
                            if (i16 - i15 > 1) {
                                AbstractC1804l.m3030W(viewArr, c0687a, i15, i16);
                            }
                            i14 = rect2.bottom;
                            i15 = i16;
                        } else {
                            i14 = Math.max(i14, rect2.bottom);
                        }
                    }
                    if (childCount - i15 > 1) {
                        AbstractC1804l.m3030W(viewArr, c0687a, i15, childCount);
                    }
                    AbstractC3698l1.f17593b = 0;
                    c2194h0.m3586a();
                }
                for (int i17 = i7; i17 < childCount; i17++) {
                    m5684k(viewArr[i17], arrayList, z7);
                }
            }
            if (z8 && !z9 && size == arrayList.size()) {
                arrayList.add(view);
                return;
            }
            return;
        }
        if (z8) {
            arrayList.add(view);
        }
    }

    /* renamed from: l */
    public static final void m5685l(C0482o c0482o, C1782h c1782h) {
        C0477j c0477j = c0482o.f1694d;
        C2194h0 c2194h0 = c0477j.f1683e;
        Object m3592g = c0477j.f1683e.m3592g(AbstractC0487t.f1763x);
        if (m3592g == null) {
            m3592g = null;
        }
        C0474g c0474g = (C0474g) m3592g;
        if (m5681h(c0482o)) {
            if (c0474g == null || c0474g.f1652a != 8) {
                Object m3592g2 = c2194h0.m3592g(AbstractC0476i.f1680x);
                if (m3592g2 == null) {
                    m3592g2 = null;
                }
                C0468a c0468a = (C0468a) m3592g2;
                if (c0468a != null) {
                    c1782h.m2955a(new C1778d(null, R.id.accessibilityActionPageUp, c0468a.f1638a, null));
                }
                Object m3592g3 = c2194h0.m3592g(AbstractC0476i.f1682z);
                if (m3592g3 == null) {
                    m3592g3 = null;
                }
                C0468a c0468a2 = (C0468a) m3592g3;
                if (c0468a2 != null) {
                    c1782h.m2955a(new C1778d(null, R.id.accessibilityActionPageDown, c0468a2.f1638a, null));
                }
                Object m3592g4 = c2194h0.m3592g(AbstractC0476i.f1681y);
                if (m3592g4 == null) {
                    m3592g4 = null;
                }
                C0468a c0468a3 = (C0468a) m3592g4;
                if (c0468a3 != null) {
                    c1782h.m2955a(new C1778d(null, R.id.accessibilityActionPageLeft, c0468a3.f1638a, null));
                }
                Object m3592g5 = c2194h0.m3592g(AbstractC0476i.f1655A);
                if (m3592g5 == null) {
                    m3592g5 = null;
                }
                C0468a c0468a4 = (C0468a) m3592g5;
                if (c0468a4 != null) {
                    c1782h.m2955a(new C1778d(null, R.id.accessibilityActionPageRight, c0468a4.f1638a, null));
                }
            }
        }
    }

    /* renamed from: m */
    public static final boolean m5686m(Object obj) {
        if (obj instanceof InterfaceC3467n) {
            InterfaceC3467n interfaceC3467n = (InterfaceC3467n) obj;
            if (interfaceC3467n.mo3728d() == C2413u0.f13572g || interfaceC3467n.mo3728d() == C2413u0.f13575j || interfaceC3467n.mo3728d() == C2413u0.f13573h) {
                Object value = interfaceC3467n.getValue();
                if (value != null) {
                    return m5686m(value);
                }
                return true;
            }
        } else {
            if ((obj instanceof InterfaceC1684c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i7 = 0; i7 < 7; i7++) {
                if (f17535a[i7].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static final float m5687n(float[] fArr, int i7, float[] fArr2, int i8) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    /* renamed from: o */
    public static final View m5688o(View view, InterfaceC3279c interfaceC3279c, View view2) {
        View m5688o;
        if (((Boolean) interfaceC3279c.mo23f(view)).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != view2 && (m5688o = m5688o(childAt, interfaceC3279c, view2)) != null) {
                    return m5688o;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: p */
    public static final boolean m5689p(C0482o c0482o) {
        boolean z7;
        Object m3592g = c0482o.f1694d.f1683e.m3592g(AbstractC0487t.f1733I);
        Object obj = null;
        if (m3592g == null) {
            m3592g = null;
        }
        EnumC1533a enumC1533a = (EnumC1533a) m3592g;
        C2194h0 c2194h0 = c0482o.f1694d.f1683e;
        Object m3592g2 = c2194h0.m3592g(AbstractC0487t.f1763x);
        if (m3592g2 == null) {
            m3592g2 = null;
        }
        C0474g c0474g = (C0474g) m3592g2;
        if (enumC1533a != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        Object m3592g3 = c2194h0.m3592g(AbstractC0487t.f1732H);
        if (m3592g3 != null) {
            obj = m3592g3;
        }
        if (((Boolean) obj) != null && (c0474g == null || c0474g.f1652a != 4)) {
            return true;
        }
        return z7;
    }

    /* renamed from: q */
    public static final String m5690q(C0482o c0482o, Resources resources) {
        float f7;
        int m3530q;
        C0477j c0477j = c0482o.f1694d;
        C0477j c0477j2 = c0482o.f1694d;
        Object m3592g = c0477j.f1683e.m3592g(AbstractC0487t.f1741b);
        String str = null;
        if (m3592g == null) {
            m3592g = null;
        }
        C2194h0 c2194h0 = c0477j2.f1683e;
        Object m3592g2 = c2194h0.m3592g(AbstractC0487t.f1733I);
        if (m3592g2 == null) {
            m3592g2 = null;
        }
        EnumC1533a enumC1533a = (EnumC1533a) m3592g2;
        Object m3592g3 = c2194h0.m3592g(AbstractC0487t.f1763x);
        if (m3592g3 == null) {
            m3592g3 = null;
        }
        C0474g c0474g = (C0474g) m3592g3;
        if (enumC1533a != null) {
            int ordinal = enumC1533a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (m3592g == null) {
                            m3592g = resources.getString(com.paoman.lema.R.string.indeterminate);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else if (c0474g != null && c0474g.f1652a == 2 && m3592g == null) {
                    m3592g = resources.getString(com.paoman.lema.R.string.state_off);
                }
            } else if (c0474g != null && c0474g.f1652a == 2 && m3592g == null) {
                m3592g = resources.getString(com.paoman.lema.R.string.state_on);
            }
        }
        Object m3592g4 = c2194h0.m3592g(AbstractC0487t.f1732H);
        if (m3592g4 == null) {
            m3592g4 = null;
        }
        Boolean bool = (Boolean) m3592g4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((c0474g == null || c0474g.f1652a != 4) && m3592g == null) {
                if (booleanValue) {
                    m3592g = resources.getString(com.paoman.lema.R.string.selected);
                } else {
                    m3592g = resources.getString(com.paoman.lema.R.string.not_selected);
                }
            }
        }
        Object m3592g5 = c2194h0.m3592g(AbstractC0487t.f1742c);
        if (m3592g5 == null) {
            m3592g5 = null;
        }
        C0473f c0473f = (C0473f) m3592g5;
        if (c0473f != null) {
            if (c0473f != C0473f.f1649c) {
                if (m3592g == null) {
                    C3876a c3876a = c0473f.f1651b;
                    float f8 = c3876a.f18162b;
                    float f9 = c3876a.f18161a;
                    if (f8 - f9 == 0.0f) {
                        f7 = 0.0f;
                    } else {
                        f7 = (c0473f.f1650a - f9) / (c3876a.f18162b - f9);
                    }
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (f7 == 0.0f) {
                        m3530q = 0;
                    } else if (f7 == 1.0f) {
                        m3530q = 100;
                    } else {
                        m3530q = AbstractC2168e.m3530q(Math.round(f7 * 100), 1, 99);
                    }
                    m3592g = resources.getString(com.paoman.lema.R.string.template_percent, Integer.valueOf(m3530q));
                }
            } else if (m3592g == null) {
                m3592g = resources.getString(com.paoman.lema.R.string.in_progress);
            }
        }
        C0490w c0490w = AbstractC0487t.f1729E;
        if (c2194h0.m3588c(c0490w)) {
            C2194h0 c2194h02 = new C0482o(c0482o.f1691a, true, c0482o.f1693c, c0477j2).m1048k().f1683e;
            Object m3592g6 = c2194h02.m3592g(AbstractC0487t.f1740a);
            if (m3592g6 == null) {
                m3592g6 = null;
            }
            Collection collection = (Collection) m3592g6;
            if (collection == null || collection.isEmpty()) {
                Object m3592g7 = c2194h02.m3592g(AbstractC0487t.f1725A);
                if (m3592g7 == null) {
                    m3592g7 = null;
                }
                Collection collection2 = (Collection) m3592g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object m3592g8 = c2194h02.m3592g(c0490w);
                    if (m3592g8 == null) {
                        m3592g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) m3592g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.paoman.lema.R.string.state_empty);
                    }
                }
            }
            m3592g = str;
        }
        return (String) m3592g;
    }

    /* renamed from: r */
    public static final C1587g m5691r(C0482o c0482o) {
        C1587g c1587g;
        C0477j c0477j = c0482o.f1694d;
        C0490w c0490w = AbstractC0487t.f1740a;
        C1587g c1587g2 = (C1587g) AbstractC0485r.m1060d(c0477j, AbstractC0487t.f1729E);
        List list = (List) AbstractC0485r.m1060d(c0482o.f1694d, AbstractC0487t.f1725A);
        if (list != null) {
            c1587g = (C1587g) AbstractC1805m.m3047k0(list);
        } else {
            c1587g = null;
        }
        if (c1587g2 == null) {
            return c1587g;
        }
        return c1587g2;
    }

    /* renamed from: s */
    public static boolean m5692s() {
        Object obj;
        Method method;
        try {
            if (C3728t.f17696L0 == null) {
                C3728t.f17696L0 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (C3728t.f17697M0 == null) {
                Class cls = C3728t.f17696L0;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                C3728t.f17697M0 = method;
            }
            Method method2 = C3728t.f17697M0;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            return AbstractC3367j.m5096a(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final C1598l0 m5693t(C0477j c0477j) {
        InterfaceC3279c interfaceC3279c;
        ArrayList arrayList = new ArrayList();
        Object m3592g = c0477j.f1683e.m3592g(AbstractC0476i.f1657a);
        if (m3592g == null) {
            m3592g = null;
        }
        C0468a c0468a = (C0468a) m3592g;
        if (c0468a == null || (interfaceC3279c = (InterfaceC3279c) c0468a.f1639b) == null || !((Boolean) interfaceC3279c.mo23f(arrayList)).booleanValue()) {
            return null;
        }
        return (C1598l0) arrayList.get(0);
    }

    /* renamed from: u */
    public static final boolean m5694u(float[] fArr, float[] fArr2) {
        boolean z7;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = fArr[11];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[14];
        float f22 = fArr[15];
        float f23 = (f7 * f12) - (f8 * f11);
        float f24 = (f7 * f13) - (f9 * f11);
        float f25 = (f7 * f14) - (f10 * f11);
        float f26 = (f8 * f13) - (f9 * f12);
        float f27 = (f8 * f14) - (f10 * f12);
        float f28 = (f9 * f14) - (f10 * f13);
        float f29 = (f15 * f20) - (f16 * f19);
        float f30 = (f15 * f21) - (f17 * f19);
        float f31 = (f15 * f22) - (f18 * f19);
        float f32 = (f16 * f21) - (f17 * f20);
        float f33 = (f16 * f22) - (f18 * f20);
        float f34 = (f17 * f22) - (f18 * f21);
        float f35 = (f28 * f29) + (((f26 * f31) + ((f25 * f32) + ((f23 * f34) - (f24 * f33)))) - (f27 * f30));
        if (f35 != 0.0f) {
            float f36 = 1.0f / f35;
            fArr2[0] = ((f14 * f32) + ((f12 * f34) - (f13 * f33))) * f36;
            fArr2[1] = (((f9 * f33) + ((-f8) * f34)) - (f10 * f32)) * f36;
            fArr2[2] = ((f22 * f26) + ((f20 * f28) - (f21 * f27))) * f36;
            fArr2[3] = (((f17 * f27) + ((-f16) * f28)) - (f18 * f26)) * f36;
            float f37 = -f11;
            fArr2[4] = (((f13 * f31) + (f37 * f34)) - (f14 * f30)) * f36;
            fArr2[5] = ((f10 * f30) + ((f34 * f7) - (f9 * f31))) * f36;
            float f38 = -f19;
            fArr2[6] = (((f21 * f25) + (f38 * f28)) - (f22 * f24)) * f36;
            fArr2[7] = ((f18 * f24) + ((f28 * f15) - (f17 * f25))) * f36;
            fArr2[8] = ((f14 * f29) + ((f11 * f33) - (f12 * f31))) * f36;
            fArr2[9] = (((f31 * f8) + ((-f7) * f33)) - (f10 * f29)) * f36;
            fArr2[10] = ((f22 * f23) + ((f19 * f27) - (f20 * f25))) * f36;
            fArr2[11] = (((f25 * f16) + ((-f15) * f27)) - (f18 * f23)) * f36;
            fArr2[12] = (((f12 * f30) + (f37 * f32)) - (f13 * f29)) * f36;
            fArr2[13] = ((f9 * f29) + ((f7 * f32) - (f8 * f30))) * f36;
            fArr2[14] = (((f20 * f24) + (f38 * f26)) - (f21 * f23)) * f36;
            fArr2[15] = ((f17 * f23) + ((f15 * f26) - (f16 * f24))) * f36;
        }
        if (f35 == 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        return !z7;
    }

    /* renamed from: v */
    public static final boolean m5695v(float f7, float f8, C0660j c0660j) {
        float f9 = f7 - 0.005f;
        float f10 = f8 - 0.005f;
        float f11 = f7 + 0.005f;
        float f12 = f8 + 0.005f;
        C0660j m1445a = AbstractC0664l.m1445a();
        if (Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) {
            AbstractC0664l.m1446b("Invalid rectangle, make sure no value is NaN");
        }
        if (m1445a.f2152b == null) {
            m1445a.f2152b = new RectF();
        }
        RectF rectF = m1445a.f2152b;
        AbstractC3367j.m5097b(rectF);
        rectF.set(f9, f10, f11, f12);
        Path path = m1445a.f2151a;
        RectF rectF2 = m1445a.f2152b;
        AbstractC3367j.m5097b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        C0660j m1445a2 = AbstractC0664l.m1445a();
        m1445a2.m1430d(c0660j, m1445a, 1);
        boolean isEmpty = m1445a2.f2151a.isEmpty();
        m1445a2.m1431e();
        m1445a.m1431e();
        return !isEmpty;
    }

    /* renamed from: w */
    public static final boolean m5696w(float f7, float f8, float f9, float f10, long j6) {
        float f11 = f7 - f9;
        float f12 = f8 - f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        if (((f12 * f12) / (intBitsToFloat2 * intBitsToFloat2)) + ((f11 * f11) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static final void m5697x(float[] fArr, float[] fArr2) {
        float m5687n = m5687n(fArr2, 0, fArr, 0);
        float m5687n2 = m5687n(fArr2, 0, fArr, 1);
        float m5687n3 = m5687n(fArr2, 0, fArr, 2);
        float m5687n4 = m5687n(fArr2, 0, fArr, 3);
        float m5687n5 = m5687n(fArr2, 1, fArr, 0);
        float m5687n6 = m5687n(fArr2, 1, fArr, 1);
        float m5687n7 = m5687n(fArr2, 1, fArr, 2);
        float m5687n8 = m5687n(fArr2, 1, fArr, 3);
        float m5687n9 = m5687n(fArr2, 2, fArr, 0);
        float m5687n10 = m5687n(fArr2, 2, fArr, 1);
        float m5687n11 = m5687n(fArr2, 2, fArr, 2);
        float m5687n12 = m5687n(fArr2, 2, fArr, 3);
        float m5687n13 = m5687n(fArr2, 3, fArr, 0);
        float m5687n14 = m5687n(fArr2, 3, fArr, 1);
        float m5687n15 = m5687n(fArr2, 3, fArr, 2);
        float m5687n16 = m5687n(fArr2, 3, fArr, 3);
        fArr[0] = m5687n;
        fArr[1] = m5687n2;
        fArr[2] = m5687n3;
        fArr[3] = m5687n4;
        fArr[4] = m5687n5;
        fArr[5] = m5687n6;
        fArr[6] = m5687n7;
        fArr[7] = m5687n8;
        fArr[8] = m5687n9;
        fArr[9] = m5687n10;
        fArr[10] = m5687n11;
        fArr[11] = m5687n12;
        fArr[12] = m5687n13;
        fArr[13] = m5687n14;
        fArr[14] = m5687n15;
        fArr[15] = m5687n16;
    }

    /* renamed from: y */
    public static final AbstractC3569i m5698y(C3733u0 c3733u0, int i7) {
        Object obj;
        Iterator<T> it = c3733u0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C3502g0) ((Map.Entry) obj).getKey()).f16885f == i7) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (AbstractC3569i) entry.getValue();
    }

    /* renamed from: z */
    public static final String m5699z(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
