package p102n1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import com.paoman.lema.MainActivity;
import com.paoman.lema.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p001a0.AbstractC0094y0;
import p001a0.C0019e1;
import p001a0.C0043k1;
import p001a0.C0064p2;
import p006a7.C0129l;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0466d;
import p034e0.C0610i0;
import p034e0.C0612j0;
import p035e1.C0644b;
import p035e1.C0654g;
import p035e1.C0671o0;
import p035e1.C0677s;
import p037e3.C0692f;
import p039e5.C0811dk;
import p049g1.C1568b;
import p050g2.AbstractC1586f0;
import p050g2.C1594j0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p051g3.AbstractC1653q;
import p051g3.C1651p;
import p053g5.C1691j;
import p053g5.C1693l;
import p053g5.InterfaceC1685d;
import p073j2.AbstractC2168e;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2271h;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p145t0.C3173d;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.InterfaceC3679g2;
import p177x0.AbstractC3793a;
import p177x0.InterfaceC3810r;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n1.c */
/* loaded from: classes.dex */
public abstract class AbstractC2710c {

    /* renamed from: a */
    public static C0654g f14538a = null;

    /* renamed from: b */
    public static C0644b f14539b = null;

    /* renamed from: c */
    public static C1568b f14540c = null;

    /* renamed from: d */
    public static C2266e f14541d = null;

    /* renamed from: e */
    public static C2266e f14542e = null;

    /* renamed from: f */
    public static C2266e f14543f = null;

    /* renamed from: g */
    public static C2266e f14544g = null;

    /* renamed from: h */
    public static C2266e f14545h = null;

    /* renamed from: i */
    public static C2266e f14546i = null;

    /* renamed from: j */
    public static C2266e f14547j = null;

    /* renamed from: k */
    public static C2266e f14548k = null;

    /* renamed from: l */
    public static C2266e f14549l = null;

    /* renamed from: m */
    public static C2266e f14550m = null;

    /* renamed from: n */
    public static C2266e f14551n = null;

    /* renamed from: o */
    public static C2266e f14552o = null;

    /* renamed from: p */
    public static C2266e f14553p = null;

    /* renamed from: q */
    public static C2266e f14554q = null;

    /* renamed from: r */
    public static C2266e f14555r = null;

    /* renamed from: s */
    public static C2266e f14556s = null;

    /* renamed from: t */
    public static boolean f14557t = false;

    /* renamed from: u */
    public static Method f14558u;

    public AbstractC2710c() {
        new ConcurrentHashMap();
    }

    /* renamed from: B */
    public static final C2266e m4319B() {
        C2266e c2266e = f14556s;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Timeline", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(23.0f, 8.0f);
        m179f.m1507h(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        m179f.m1507h(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        m179f.m1511l(-3.56f, 3.55f);
        m179f.m1506g(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        m179f.m1507h(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        m179f.m1514o(-2.0f, -0.9f, -2.0f, -2.0f);
        m179f.m1507h(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        m179f.m1511l(-2.55f, -2.55f);
        m179f.m1506g(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        m179f.m1514o(-0.36f, -0.02f, -0.52f, -0.07f);
        m179f.m1511l(-4.55f, 4.56f);
        m179f.m1506g(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        m179f.m1507h(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        m179f.m1514o(-2.0f, -0.9f, -2.0f, -2.0f);
        m179f.m1514o(0.9f, -2.0f, 2.0f, -2.0f);
        m179f.m1507h(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        m179f.m1511l(4.56f, -4.55f);
        m179f.m1506g(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        m179f.m1507h(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        m179f.m1514o(2.0f, 0.9f, 2.0f, 2.0f);
        m179f.m1507h(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        m179f.m1511l(2.55f, 2.55f);
        m179f.m1506g(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        m179f.m1514o(0.36f, 0.02f, 0.52f, 0.07f);
        m179f.m1511l(3.55f, -3.56f);
        m179f.m1506g(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        m179f.m1507h(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        m179f.m1513n(23.0f, 6.9f, 23.0f, 8.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14556s = m3673b;
        return m3673b;
    }

    /* renamed from: C */
    public static final int m4320C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    /* renamed from: D */
    public static final boolean m4321D(int i7) {
        int type = Character.getType(i7);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static final boolean m4322E(C0466d c0466d) {
        long j6 = c0466d.f1633e;
        if ((j6 >>> 32) == (4294967295L & j6) && j6 == c0466d.f1634f && j6 == c0466d.f1635g && j6 == c0466d.f1636h) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m4323F(char c7) {
        if (!Character.isWhitespace(c7) && !Character.isSpaceChar(c7)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static final boolean m4324G(int i7) {
        if (!Character.isWhitespace(i7) && i7 != 160) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static final boolean m4325H(int i7) {
        int type;
        if (m4324G(i7) && (type = Character.getType(i7)) != 14 && type != 13 && i7 != 10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g5.n, java.lang.Object, g5.d] */
    /* renamed from: I */
    public static InterfaceC1685d m4326I(InterfaceC3277a interfaceC3277a) {
        ?? obj = new Object();
        obj.f10483e = interfaceC3277a;
        obj.f10484f = C1693l.f10481a;
        return obj;
    }

    /* renamed from: J */
    public static C1691j m4327J(InterfaceC3277a interfaceC3277a) {
        AbstractC3367j.m5100e(interfaceC3277a, "initializer");
        return new C1691j(interfaceC3277a);
    }

    /* renamed from: L */
    public static String m4328L(long j6) {
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i8)) {
            return "CornerRadius.circular(" + AbstractC3393k.m5128A(Float.intBitsToFloat(i7)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC3393k.m5128A(Float.intBitsToFloat(i7)) + ", " + AbstractC3393k.m5128A(Float.intBitsToFloat(i8)) + ')';
    }

    /* renamed from: a */
    public static final C0466d m4329a(float f7, float f8, float f9, float f10, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new C0466d(f7, f8, f9, f10, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    /* renamed from: b */
    public static final void m4330b(InterfaceC3810r interfaceC3810r, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        c2395p.m3859a0(-2105228848);
        if (c2395p.m3870g(interfaceC3810r)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(C0610i0.f2009a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c3173d.mo22d(c2395p, 6);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0612j0(interfaceC3810r, c3173d, i7);
        }
    }

    /* renamed from: c */
    public static final long m4331c(C0043k1 c0043k1, C0465c c0465c, C0465c c0465c2, int i7) {
        long m4351y = m4351y(c0043k1, c0465c, i7);
        if (C1602n0.m2586b(m4351y)) {
            return C1602n0.f10302b;
        }
        long m4351y2 = m4351y(c0043k1, c0465c2, i7);
        if (C1602n0.m2586b(m4351y2)) {
            return C1602n0.f10302b;
        }
        int i8 = (int) (m4351y >> 32);
        int i9 = (int) (m4351y2 & 4294967295L);
        return AbstractC1586f0.m2558b(Math.min(i8, i8), Math.max(i9, i9));
    }

    /* renamed from: d */
    public static final boolean m4332d(C1598l0 c1598l0, int i7) {
        int m2578e = c1598l0.m2578e(i7);
        if (i7 == c1598l0.m2581h(m2578e) || i7 == c1598l0.m2577d(m2578e, false) ? c1598l0.m2582i(i7) != c1598l0.m2574a(i7) : c1598l0.m2574a(i7) != c1598l0.m2574a(i7 - 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m4333e(int i7) {
        if (2 <= i7 && i7 < 37) {
            return;
        }
        StringBuilder m188o = AbstractC0094y0.m188o(i7, "radix ", " was not in valid range ");
        m188o.append(new C3877b(2, 36, 1));
        throw new IllegalArgumentException(m188o.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [g3.p, java.lang.Object] */
    /* renamed from: h */
    public static boolean m4334h(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i7 = AbstractC1653q.f10423a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = C1651p.f10416d;
            C1651p c1651p = (C1651p) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            C1651p c1651p2 = c1651p;
            if (c1651p == null) {
                ?? obj = new Object();
                obj.f10417a = null;
                obj.f10418b = null;
                obj.f10419c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                c1651p2 = obj;
            }
            WeakReference weakReference2 = c1651p2.f10419c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                c1651p2.f10419c = new WeakReference(keyEvent);
                if (c1651p2.f10418b == null) {
                    c1651p2.f10418b = new SparseArray();
                }
                SparseArray sparseArray = c1651p2.f10418b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m4335i(char c7, char c8, boolean z7) {
        if (c7 == c8) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m4336j(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static C0692f m4337k(C0692f[] c0692fArr) {
        C0692f c0692f = null;
        int i7 = Integer.MAX_VALUE;
        for (C0692f c0692f2 : c0692fArr) {
            int abs = (Math.abs(c0692f2.f2248c - 400) * 2) + (c0692f2.f2249d ? 1 : 0);
            if (c0692f == null || i7 > abs) {
                c0692f = c0692f2;
                i7 = abs;
            }
        }
        return c0692f;
    }

    /* renamed from: l */
    public static final C2266e m4338l() {
        C2266e c2266e = f14543f;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ArrowDownward", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.0f, 12.0f);
        c0811dk.m1511l(-1.41f, -1.41f);
        c0811dk.m1510k(13.0f, 16.17f);
        c0811dk.m1516q(4.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(12.17f);
        c0811dk.m1511l(-5.58f, -5.59f);
        c0811dk.m1510k(4.0f, 12.0f);
        c0811dk.m1511l(8.0f, 8.0f);
        c0811dk.m1511l(8.0f, -8.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14543f = m3673b;
        return m3673b;
    }

    /* renamed from: m */
    public static final C2266e m4339m() {
        C2266e c2266e = f14544g;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.BugReport", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.0f, 8.0f);
        c0811dk.m1509j(-2.81f);
        c0811dk.m1507h(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
        c0811dk.m1510k(17.0f, 4.41f);
        c0811dk.m1510k(15.59f, 3.0f);
        c0811dk.m1511l(-2.17f, 2.17f);
        c0811dk.m1506g(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
        c0811dk.m1507h(-0.49f, 0.0f, -0.96f, 0.06f, -1.41f, 0.17f);
        c0811dk.m1510k(8.41f, 3.0f);
        c0811dk.m1510k(7.0f, 4.41f);
        c0811dk.m1511l(1.62f, 1.63f);
        c0811dk.m1506g(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
        c0811dk.m1510k(4.0f, 8.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(2.09f);
        c0811dk.m1507h(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
        c0811dk.m1517r(1.0f);
        c0811dk.m1510k(4.0f, 12.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(1.0f);
        c0811dk.m1507h(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        c0811dk.m1510k(4.0f, 16.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(2.81f);
        c0811dk.m1507h(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
        c0811dk.m1514o(4.15f, -1.21f, 5.19f, -3.0f);
        c0811dk.m1510k(20.0f, 18.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(-2.09f);
        c0811dk.m1507h(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
        c0811dk.m1517r(-1.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(-1.0f);
        c0811dk.m1507h(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        c0811dk.m1510k(20.0f, 10.0f);
        c0811dk.m1510k(20.0f, 8.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(14.0f, 16.0f);
        c0811dk.m1509j(-4.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(14.0f, 12.0f);
        c0811dk.m1509j(-4.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14544g = m3673b;
        return m3673b;
    }

    /* renamed from: n */
    public static int m4340n(int i7) {
        boolean z7;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("n1.c", "No cameras!");
            return -1;
        }
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            i7 = 0;
            while (i7 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i7, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i7++;
            }
        }
        if (i7 < numberOfCameras) {
            return i7;
        }
        if (z7) {
            return -1;
        }
        return 0;
    }

    /* renamed from: o */
    public static final C2266e m4341o() {
        C2266e c2266e = f14545h;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.CloudDownload", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(19.35f, 10.04f);
        m179f.m1506g(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        m179f.m1506g(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        m179f.m1506g(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        m179f.m1507h(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        m179f.m1509j(13.0f);
        m179f.m1507h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        m179f.m1507h(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        m179f.m1505f();
        m179f.m1512m(17.0f, 13.0f);
        m179f.m1511l(-5.0f, 5.0f);
        m179f.m1511l(-5.0f, -5.0f);
        m179f.m1509j(3.0f);
        m179f.m1516q(9.0f);
        m179f.m1509j(4.0f);
        m179f.m1517r(4.0f);
        m179f.m1509j(3.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14545h = m3673b;
        return m3673b;
    }

    /* renamed from: p */
    public static final C2266e m4342p() {
        C2266e c2266e = f14546i;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.DataUsage", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(13.0f, 2.05f);
        c0811dk.m1517r(3.03f);
        c0811dk.m1507h(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        c0811dk.m1507h(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        c0811dk.m1511l(2.6f, 1.53f);
        c0811dk.m1507h(0.56f, -1.24f, 0.88f, -2.62f, 0.88f, -4.07f);
        c0811dk.m1507h(0.0f, -5.18f, -3.95f, -9.45f, -9.0f, -9.95f);
        c0811dk.m1505f();
        c0811dk.m1512m(12.0f, 19.0f);
        c0811dk.m1507h(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        c0811dk.m1507h(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        c0811dk.m1516q(2.05f);
        c0811dk.m1507h(-5.06f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        c0811dk.m1507h(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        c0811dk.m1507h(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        c0811dk.m1511l(-2.6f, -1.53f);
        c0811dk.m1506g(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14546i = m3673b;
        return m3673b;
    }

    /* renamed from: q */
    public static final C2266e m4343q() {
        C2266e c2266e = f14547j;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Edit", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(3.0f, 17.25f);
        c0811dk.m1516q(21.0f);
        c0811dk.m1509j(3.75f);
        c0811dk.m1510k(17.81f, 9.94f);
        c0811dk.m1511l(-3.75f, -3.75f);
        c0811dk.m1510k(3.0f, 17.25f);
        c0811dk.m1505f();
        c0811dk.m1512m(20.71f, 7.04f);
        c0811dk.m1507h(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c0811dk.m1511l(-2.34f, -2.34f);
        c0811dk.m1507h(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c0811dk.m1511l(-1.83f, 1.83f);
        c0811dk.m1511l(3.75f, 3.75f);
        c0811dk.m1511l(1.83f, -1.83f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14547j = m3673b;
        return m3673b;
    }

    /* renamed from: r */
    public static final C2266e m4344r() {
        C2266e c2266e = f14548k;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.FolderOpen", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.0f, 6.0f);
        c0811dk.m1509j(-8.0f);
        c0811dk.m1511l(-2.0f, -2.0f);
        c0811dk.m1510k(4.0f, 4.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        c0811dk.m1510k(2.0f, 18.0f);
        c0811dk.m1507h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c0811dk.m1509j(16.0f);
        c0811dk.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0811dk.m1510k(22.0f, 8.0f);
        c0811dk.m1507h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(20.0f, 18.0f);
        c0811dk.m1510k(4.0f, 18.0f);
        c0811dk.m1510k(4.0f, 8.0f);
        c0811dk.m1509j(16.0f);
        c0811dk.m1517r(10.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14548k = m3673b;
        return m3673b;
    }

    /* renamed from: s */
    public static final long m4345s(KeyEvent keyEvent) {
        return AbstractC2168e.m3517d(keyEvent.getKeyCode());
    }

    /* renamed from: t */
    public static final C2266e m4346t() {
        C2266e c2266e = f14549l;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Lan", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(13.0f, 22.0f);
        c0811dk.m1511l(8.0f, 0.0f);
        c0811dk.m1511l(0.0f, -7.0f);
        c0811dk.m1511l(-3.0f, 0.0f);
        c0811dk.m1511l(0.0f, -4.0f);
        c0811dk.m1511l(-5.0f, 0.0f);
        c0811dk.m1511l(0.0f, -2.0f);
        c0811dk.m1511l(3.0f, 0.0f);
        c0811dk.m1511l(0.0f, -7.0f);
        c0811dk.m1511l(-8.0f, 0.0f);
        c0811dk.m1511l(0.0f, 7.0f);
        c0811dk.m1511l(3.0f, 0.0f);
        c0811dk.m1511l(0.0f, 2.0f);
        c0811dk.m1511l(-5.0f, 0.0f);
        c0811dk.m1511l(0.0f, 4.0f);
        c0811dk.m1511l(-3.0f, 0.0f);
        c0811dk.m1511l(0.0f, 7.0f);
        c0811dk.m1511l(8.0f, 0.0f);
        c0811dk.m1511l(0.0f, -7.0f);
        c0811dk.m1511l(-3.0f, 0.0f);
        c0811dk.m1511l(0.0f, -2.0f);
        c0811dk.m1511l(8.0f, 0.0f);
        c0811dk.m1511l(0.0f, 2.0f);
        c0811dk.m1511l(-3.0f, 0.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14549l = m3673b;
        return m3673b;
    }

    /* renamed from: u */
    public static final int m4347u(C1605p c1605p, long j6, InterfaceC3679g2 interfaceC3679g2) {
        float f7;
        if (interfaceC3679g2 != null) {
            f7 = interfaceC3679g2.mo5678f();
        } else {
            f7 = 0.0f;
        }
        int m2600c = c1605p.m2600c(C0464b.m1009e(j6));
        if (C0464b.m1009e(j6) >= c1605p.m2601d(m2600c) - f7 && C0464b.m1009e(j6) <= c1605p.m2599b(m2600c) + f7 && C0464b.m1008d(j6) >= (-f7) && C0464b.m1008d(j6) <= c1605p.f10315d + f7) {
            return m2600c;
        }
        return -1;
    }

    /* renamed from: v */
    public static final C2266e m4348v() {
        C2266e c2266e = f14550m;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Map", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.5f, 3.0f);
        c0811dk.m1511l(-0.16f, 0.03f);
        c0811dk.m1510k(15.0f, 5.1f);
        c0811dk.m1510k(9.0f, 3.0f);
        c0811dk.m1510k(3.36f, 4.9f);
        c0811dk.m1507h(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        c0811dk.m1516q(20.5f);
        c0811dk.m1507h(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        c0811dk.m1511l(0.16f, -0.03f);
        c0811dk.m1510k(9.0f, 18.9f);
        c0811dk.m1511l(6.0f, 2.1f);
        c0811dk.m1511l(5.64f, -1.9f);
        c0811dk.m1507h(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        c0811dk.m1516q(3.5f);
        c0811dk.m1507h(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        c0811dk.m1505f();
        c0811dk.m1512m(15.0f, 19.0f);
        c0811dk.m1511l(-6.0f, -2.11f);
        c0811dk.m1516q(5.0f);
        c0811dk.m1511l(6.0f, 2.11f);
        c0811dk.m1516q(19.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14550m = m3673b;
        return m3673b;
    }

    /* renamed from: w */
    public static final C2266e m4349w() {
        C2266e c2266e = f14551n;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.NetworkCheck", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(15.9f, 5.0f);
        m179f.m1507h(-0.17f, 0.0f, -0.32f, 0.09f, -0.41f, 0.23f);
        m179f.m1511l(-0.07f, 0.15f);
        m179f.m1511l(-5.18f, 11.65f);
        m179f.m1507h(-0.16f, 0.29f, -0.26f, 0.61f, -0.26f, 0.96f);
        m179f.m1507h(0.0f, 1.11f, 0.9f, 2.01f, 2.01f, 2.01f);
        m179f.m1507h(0.96f, 0.0f, 1.77f, -0.68f, 1.96f, -1.59f);
        m179f.m1511l(0.01f, -0.03f);
        m179f.m1510k(16.4f, 5.5f);
        m179f.m1507h(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        m179f.m1505f();
        m179f.m1512m(1.0f, 9.0f);
        m179f.m1511l(2.0f, 2.0f);
        m179f.m1507h(2.88f, -2.88f, 6.79f, -4.08f, 10.53f, -3.62f);
        m179f.m1511l(1.19f, -2.68f);
        m179f.m1506g(9.89f, 3.84f, 4.74f, 5.27f, 1.0f, 9.0f);
        m179f.m1505f();
        m179f.m1512m(21.0f, 11.0f);
        m179f.m1511l(2.0f, -2.0f);
        m179f.m1507h(-1.64f, -1.64f, -3.55f, -2.82f, -5.59f, -3.57f);
        m179f.m1511l(-0.53f, 2.82f);
        m179f.m1507h(1.5f, 0.62f, 2.9f, 1.53f, 4.12f, 2.75f);
        m179f.m1505f();
        m179f.m1512m(17.0f, 15.0f);
        m179f.m1511l(2.0f, -2.0f);
        m179f.m1507h(-0.8f, -0.8f, -1.7f, -1.42f, -2.66f, -1.89f);
        m179f.m1511l(-0.55f, 2.92f);
        m179f.m1507h(0.42f, 0.27f, 0.83f, 0.59f, 1.21f, 0.97f);
        m179f.m1505f();
        m179f.m1512m(5.0f, 13.0f);
        m179f.m1511l(2.0f, 2.0f);
        m179f.m1507h(1.13f, -1.13f, 2.56f, -1.79f, 4.03f, -2.0f);
        m179f.m1511l(1.28f, -2.88f);
        m179f.m1507h(-2.63f, -0.08f, -5.3f, 0.87f, -7.31f, 2.88f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14551n = m3673b;
        return m3673b;
    }

    /* renamed from: x */
    public static final long m4350x(C0019e1 c0019e1) {
        DragEvent dragEvent = (DragEvent) c0019e1.f109e;
        float x6 = dragEvent.getX();
        float y7 = dragEvent.getY();
        return (Float.floatToRawIntBits(x6) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L);
    }

    /* renamed from: y */
    public static final long m4351y(C0043k1 c0043k1, C0465c c0465c, int i7) {
        C1605p c1605p;
        C0064p2 m120d = c0043k1.m120d();
        if (m120d != null) {
            c1605p = m120d.f322a.f10289b;
        } else {
            c1605p = null;
        }
        InterfaceC3238v m119c = c0043k1.m119c();
        if (c1605p != null && m119c != null) {
            return c1605p.m2603f(c0465c.m1020g(m119c.mo4922C(0L)), i7, C1594j0.f10273b);
        }
        return C1602n0.f10302b;
    }

    /* renamed from: z */
    public static final C2266e m4352z() {
        C2266e c2266e = f14555r;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Speed", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(20.38f, 8.57f);
        c0811dk.m1511l(-1.23f, 1.85f);
        c0811dk.m1503c(8.0f, 8.0f, -0.22f, 7.58f, true);
        c0811dk.m1510k(5.07f, 18.0f);
        C2271h c2271h = new C2271h(8.0f, 8.0f, 15.58f, 6.85f, true);
        ArrayList arrayList = c0811dk.f3514f;
        arrayList.add(c2271h);
        c0811dk.m1511l(1.85f, -1.23f);
        arrayList.add(new C2271h(10.0f, 10.0f, 3.35f, 19.0f, false));
        c0811dk.m1503c(2.0f, 2.0f, 1.72f, 1.0f, false);
        c0811dk.m1509j(13.85f);
        c0811dk.m1503c(2.0f, 2.0f, 1.74f, -1.0f, false);
        c0811dk.m1503c(10.0f, 10.0f, -0.27f, -10.44f, false);
        c0811dk.m1505f();
        c0811dk.m1512m(10.59f, 15.41f);
        c0811dk.m1503c(2.0f, 2.0f, 2.83f, 0.0f, false);
        c0811dk.m1511l(5.66f, -8.49f);
        c0811dk.m1511l(-8.49f, 5.66f);
        c0811dk.m1503c(2.0f, 2.0f, 0.0f, 2.83f, false);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f14555r = m3673b;
        return m3673b;
    }

    /* renamed from: A */
    public C0129l mo2519A(MainActivity mainActivity, Object obj) {
        return null;
    }

    /* renamed from: K */
    public abstract Object mo2520K(Intent intent, int i7);

    /* renamed from: f */
    public abstract Typeface mo612f(Context context, C0692f[] c0692fArr);

    /* renamed from: g */
    public abstract Intent mo2521g(MainActivity mainActivity, Object obj);
}
