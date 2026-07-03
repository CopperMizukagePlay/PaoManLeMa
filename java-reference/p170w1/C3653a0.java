package p170w1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.RunnableC0219y;
import com.paoman.lema.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0033i;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0466d;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0493z;
import p028d2.C0468a;
import p028d2.C0474g;
import p028d2.C0475h;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0483p;
import p028d2.C0490w;
import p035e1.AbstractC0655g0;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0660j;
import p035e1.InterfaceC0667m0;
import p035e1.ViewOnAttachStateChangeListenerC0650e;
import p047f6.AbstractC1555j;
import p047f6.C1547b;
import p047f6.C1548c;
import p050g2.C1587g;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p051g3.AbstractC1621b;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p059h3.AbstractC1776b;
import p059h3.C1782h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p077k.AbstractC2197j;
import p077k.AbstractC2199k;
import p077k.AbstractC2201l;
import p077k.AbstractC2203m;
import p077k.AbstractC2205n;
import p077k.AbstractC2210p0;
import p077k.C2191g;
import p077k.C2194h0;
import p077k.C2216s0;
import p077k.C2219u;
import p077k.C2220v;
import p077k.C2221w;
import p077k.C2222x;
import p084l.AbstractC2334a;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p140s2.C3101k;
import p150t5.InterfaceC3282f;
import p155u2.AbstractC3353a;
import p158u5.AbstractC3367j;
import p160v.C3423m0;
import p162v1.AbstractC3497e1;
import p162v1.C3502g0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.a0 */
/* loaded from: classes.dex */
public final class C3653a0 extends AbstractC1621b {

    /* renamed from: Q */
    public static final C2220v f17437Q;

    /* renamed from: A */
    public boolean f17438A;

    /* renamed from: B */
    public C3742x f17439B;

    /* renamed from: C */
    public C2221w f17440C;

    /* renamed from: D */
    public final C2222x f17441D;

    /* renamed from: E */
    public final C2219u f17442E;

    /* renamed from: F */
    public final C2219u f17443F;

    /* renamed from: G */
    public final String f17444G;

    /* renamed from: H */
    public final String f17445H;

    /* renamed from: I */
    public final C0031h1 f17446I;

    /* renamed from: J */
    public final C2221w f17447J;

    /* renamed from: K */
    public C3659b2 f17448K;

    /* renamed from: L */
    public boolean f17449L;

    /* renamed from: M */
    public final C2219u f17450M;

    /* renamed from: N */
    public final RunnableC0219y f17451N;

    /* renamed from: O */
    public final ArrayList f17452O;

    /* renamed from: P */
    public final C3748z f17453P;

    /* renamed from: d */
    public final C3728t f17454d;

    /* renamed from: e */
    public int f17455e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final C3748z f17456f = new C3748z(this, 0);

    /* renamed from: g */
    public final AccessibilityManager f17457g;

    /* renamed from: h */
    public long f17458h;

    /* renamed from: i */
    public final AccessibilityManagerAccessibilityStateChangeListenerC3732u f17459i;

    /* renamed from: j */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC3736v f17460j;

    /* renamed from: k */
    public List f17461k;

    /* renamed from: l */
    public final Handler f17462l;

    /* renamed from: m */
    public final C3739w f17463m;

    /* renamed from: n */
    public int f17464n;

    /* renamed from: o */
    public int f17465o;

    /* renamed from: p */
    public C1782h f17466p;

    /* renamed from: q */
    public C1782h f17467q;

    /* renamed from: r */
    public boolean f17468r;

    /* renamed from: s */
    public final C2221w f17469s;

    /* renamed from: t */
    public final C2221w f17470t;

    /* renamed from: u */
    public final C2216s0 f17471u;

    /* renamed from: v */
    public final C2216s0 f17472v;

    /* renamed from: w */
    public int f17473w;

    /* renamed from: x */
    public Integer f17474x;

    /* renamed from: y */
    public final C2191g f17475y;

    /* renamed from: z */
    public final C1548c f17476z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i7 = AbstractC2199k.f12702a;
        C2220v c2220v = new C2220v(32);
        int i8 = c2220v.f12755b;
        if (i8 >= 0) {
            int i9 = i8 + 32;
            c2220v.m3644b(i9);
            int[] iArr2 = c2220v.f12754a;
            int i10 = c2220v.f12755b;
            if (i8 != i10) {
                AbstractC1804l.m3015H(iArr2, iArr2, i9, i8, i10);
            }
            AbstractC1804l.m3019L(iArr, iArr2, i8, 0, 12);
            c2220v.f12755b += 32;
            f17437Q = c2220v;
            return;
        }
        AbstractC2334a.m3713d("");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [w1.u] */
    /* JADX WARN: Type inference failed for: r3v4, types: [w1.v] */
    public C3653a0(C3728t c3728t) {
        this.f17454d = c3728t;
        Object systemService = c3728t.getContext().getSystemService("accessibility");
        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f17457g = accessibilityManager;
        this.f17458h = 100L;
        this.f17459i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: w1.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z7) {
                List<AccessibilityServiceInfo> list;
                C3653a0 c3653a0 = C3653a0.this;
                if (z7) {
                    list = c3653a0.f17457g.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = C1813u.f10860e;
                }
                c3653a0.f17461k = list;
            }
        };
        this.f17460j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: w1.v
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                C3653a0 c3653a0 = C3653a0.this;
                c3653a0.f17461k = c3653a0.f17457g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f17461k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f17462l = new Handler(Looper.getMainLooper());
        this.f17463m = new C3739w(this);
        this.f17464n = Integer.MIN_VALUE;
        this.f17465o = Integer.MIN_VALUE;
        this.f17469s = new C2221w();
        this.f17470t = new C2221w();
        this.f17471u = new C2216s0();
        this.f17472v = new C2216s0();
        this.f17473w = -1;
        this.f17475y = new C2191g();
        int i7 = 1;
        this.f17476z = AbstractC1555j.m2510a(1, 6, null);
        this.f17438A = true;
        C2221w c2221w = AbstractC2203m.f12711a;
        AbstractC3367j.m5098c(c2221w, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f17440C = c2221w;
        this.f17441D = new C2222x();
        this.f17442E = new C2219u();
        this.f17443F = new C2219u();
        this.f17444G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f17445H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f17446I = new C0031h1(9, (byte) 0);
        this.f17447J = new C2221w();
        C0482o m1055a = c3728t.getSemanticsOwner().m1055a();
        AbstractC3367j.m5098c(c2221w, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f17448K = new C3659b2(m1055a, c2221w);
        int i8 = AbstractC2197j.f12689a;
        this.f17450M = new C2219u();
        c3728t.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0650e(i7, this));
        this.f17451N = new RunnableC0219y(15, this);
        this.f17452O = new ArrayList();
        this.f17453P = new C3748z(this, i7);
    }

    /* renamed from: E */
    public static Rect m5623E(AbstractC0655g0 abstractC0655g0) {
        if (!(abstractC0655g0 instanceof C0651e0) && !(abstractC0655g0 instanceof C0653f0)) {
            return null;
        }
        C0465c mo1356a = abstractC0655g0.mo1356a();
        return new Rect((int) mo1356a.f1625a, (int) mo1356a.f1626b, (int) mo1356a.f1627c, (int) mo1356a.f1628d);
    }

    /* renamed from: F */
    public static float[] m5624F(AbstractC0655g0 abstractC0655g0) {
        if (abstractC0655g0 instanceof C0653f0) {
            C0466d c0466d = ((C0653f0) abstractC0655g0).f2142a;
            long j6 = c0466d.f1636h;
            long j7 = c0466d.f1635g;
            long j8 = c0466d.f1634f;
            long j9 = c0466d.f1633e;
            return new float[]{Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L))};
        }
        return null;
    }

    /* renamed from: G */
    public static Region m5625G(AbstractC0655g0 abstractC0655g0) {
        if (abstractC0655g0 instanceof C0649d0) {
            C0649d0 c0649d0 = (C0649d0) abstractC0655g0;
            C0465c mo1356a = c0649d0.mo1356a();
            Region region = new Region(new Rect((int) mo1356a.f1625a, (int) mo1356a.f1626b, (int) mo1356a.f1627c, (int) mo1356a.f1628d));
            Region region2 = new Region();
            C0660j c0660j = c0649d0.f2132a;
            if (c0660j instanceof C0660j) {
                region2.setPath(c0660j.f2151a, region);
                return region2;
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* renamed from: H */
    public static CharSequence m5626H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i7 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i7 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i7);
                AbstractC3367j.m5098c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    /* renamed from: n */
    public static String m5627n(C0482o c0482o) {
        C1587g c1587g;
        if (c0482o != null) {
            C0477j c0477j = c0482o.f1694d;
            C2194h0 c2194h0 = c0477j.f1683e;
            C0490w c0490w = AbstractC0487t.f1740a;
            if (c2194h0.m3588c(c0490w)) {
                return AbstractC3353a.m5086a((List) c0477j.m1034b(c0490w), ",", null, 62);
            }
            C0490w c0490w2 = AbstractC0487t.f1729E;
            if (c2194h0.m3588c(c0490w2)) {
                Object m3592g = c2194h0.m3592g(c0490w2);
                if (m3592g == null) {
                    m3592g = null;
                }
                C1587g c1587g2 = (C1587g) m3592g;
                if (c1587g2 != null) {
                    return c1587g2.f10239f;
                }
            } else {
                Object m3592g2 = c2194h0.m3592g(AbstractC0487t.f1725A);
                if (m3592g2 == null) {
                    m3592g2 = null;
                }
                List list = (List) m3592g2;
                if (list != null && (c1587g = (C1587g) AbstractC1805m.m3047k0(list)) != null) {
                    return c1587g.f10239f;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [t5.a, u5.k] */
    /* renamed from: q */
    public static final boolean m5628q(C0475h c0475h, float f7) {
        ?? r02 = c0475h.f1653a;
        if (f7 >= 0.0f || ((Number) r02.mo52a()).floatValue() <= 0.0f) {
            if (f7 > 0.0f && ((Number) r02.mo52a()).floatValue() < ((Number) c0475h.f1654b.mo52a()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [t5.a, u5.k] */
    /* renamed from: r */
    public static final boolean m5629r(C0475h c0475h) {
        ?? r02 = c0475h.f1653a;
        if (((Number) r02.mo52a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.mo52a()).floatValue();
        ((Number) c0475h.f1654b.mo52a()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [t5.a, u5.k] */
    /* renamed from: s */
    public static final boolean m5630s(C0475h c0475h) {
        ?? r02 = c0475h.f1653a;
        if (((Number) r02.mo52a()).floatValue() < ((Number) c0475h.f1654b.mo52a()).floatValue()) {
            return true;
        }
        ((Number) r02.mo52a()).floatValue();
        return false;
    }

    /* renamed from: x */
    public static /* synthetic */ void m5631x(C3653a0 c3653a0, int i7, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        c3653a0.m5653w(i7, i8, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d8, code lost:
    
        if (r1.isEmpty() == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0507, code lost:
    
        if (r12 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x050c, code lost:
    
        if (r12 == null) goto L572;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0515  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5632A(AbstractC2201l abstractC2201l) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i7;
        Integer num;
        int i8;
        int i9;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        Integer num2;
        C0482o c0482o;
        C0477j c0477j;
        C0482o c0482o2;
        int i13;
        int i14;
        int i15;
        int i16;
        C2194h0 c2194h0;
        C3502g0 c3502g0;
        int i17;
        C0477j c0477j2;
        ArrayList arrayList3;
        long j6;
        int i18;
        int i19;
        int i20;
        C3502g0 c3502g02;
        Integer num3;
        int i21;
        C2194h0 c2194h02;
        int i22;
        C3655a2 c3655a2;
        boolean z7;
        C3655a2 c3655a22;
        boolean z8;
        int i23;
        String str;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z9;
        boolean z10;
        C2194h0 c2194h03;
        Integer num4;
        AccessibilityEvent m5644j;
        Integer num5;
        boolean z11;
        String str2;
        AbstractC2201l abstractC2201l2 = abstractC2201l;
        ArrayList arrayList4 = this.f17452O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC2201l2.f12706b;
        long[] jArr3 = abstractC2201l2.f12705a;
        int i28 = 2;
        int length = jArr3.length - 2;
        int i29 = 0;
        Integer num6 = 0;
        if (length >= 0) {
            int i30 = 0;
            while (true) {
                long j7 = jArr3[i30];
                int i31 = i28;
                int i32 = length;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8;
                    int i34 = 8 - ((~(i30 - i32)) >>> 31);
                    long j8 = j7;
                    int i35 = i29;
                    while (i35 < i34) {
                        if ((j8 & 255) < 128) {
                            int i36 = iArr3[(i30 << 3) + i35];
                            C3659b2 c3659b2 = (C3659b2) this.f17447J.m3612b(i36);
                            if (c3659b2 != null) {
                                C0477j c0477j3 = c3659b2.f17491a;
                                C2194h0 c2194h04 = c0477j3.f1683e;
                                C0483p c0483p = (C0483p) abstractC2201l2.m3612b(i36);
                                int i37 = i33;
                                if (c0483p != null) {
                                    c0482o = c0483p.f1698a;
                                } else {
                                    c0482o = null;
                                }
                                if (c0482o != null) {
                                    C3502g0 c3502g03 = c0482o.f1693c;
                                    C0477j c0477j4 = c0482o.f1694d;
                                    iArr2 = iArr3;
                                    int i38 = c0482o.f1697g;
                                    jArr2 = jArr3;
                                    C2194h0 c2194h05 = c0477j4.f1683e;
                                    i12 = i30;
                                    Object[] objArr = c2194h05.f12677b;
                                    Object[] objArr2 = c2194h05.f12678c;
                                    long[] jArr4 = c2194h05.f12676a;
                                    i9 = i35;
                                    int length2 = jArr4.length - 2;
                                    if (length2 >= 0) {
                                        C3502g0 c3502g04 = c3502g03;
                                        i10 = i34;
                                        int i39 = 0;
                                        i15 = 0;
                                        while (true) {
                                            long j9 = jArr4[i39];
                                            c0482o2 = c0482o;
                                            int i40 = i39;
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i41 = 8 - ((~(i40 - length2)) >>> 31);
                                                int i42 = 0;
                                                while (i42 < i41) {
                                                    if ((j9 & 255) < 128) {
                                                        int i43 = (i40 << 3) + i42;
                                                        Object obj = objArr[i43];
                                                        int i44 = length2;
                                                        Object obj2 = objArr2[i43];
                                                        c0477j2 = c0477j3;
                                                        C0490w c0490w = (C0490w) obj;
                                                        j6 = j9;
                                                        C0490w c0490w2 = AbstractC0487t.f1759t;
                                                        if (!AbstractC3367j.m5096a(c0490w, c0490w2) && !AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1760u)) {
                                                            i19 = i42;
                                                            z7 = false;
                                                        } else {
                                                            int size = arrayList5.size();
                                                            i19 = i42;
                                                            int i45 = 0;
                                                            while (true) {
                                                                if (i45 < size) {
                                                                    int i46 = size;
                                                                    if (((C3655a2) arrayList5.get(i45)).f17477e == i36) {
                                                                        c3655a2 = (C3655a2) arrayList5.get(i45);
                                                                        break;
                                                                    } else {
                                                                        i45++;
                                                                        size = i46;
                                                                    }
                                                                } else {
                                                                    c3655a2 = null;
                                                                    break;
                                                                }
                                                            }
                                                            if (c3655a2 != null) {
                                                                z7 = false;
                                                            } else {
                                                                c3655a2 = new C3655a2(i36, arrayList4);
                                                                z7 = true;
                                                            }
                                                            arrayList4.add(c3655a2);
                                                        }
                                                        if (!z7) {
                                                            Object m3592g = c2194h04.m3592g(c0490w);
                                                            if (m3592g == null) {
                                                                m3592g = null;
                                                            }
                                                            if (AbstractC3367j.m5096a(obj2, m3592g)) {
                                                                i21 = i36;
                                                                arrayList3 = arrayList5;
                                                                i18 = i41;
                                                                i20 = i37;
                                                                c3502g02 = c3502g04;
                                                                num3 = num6;
                                                                c2194h02 = c2194h04;
                                                                i22 = i44;
                                                            }
                                                        }
                                                        C0490w c0490w3 = AbstractC0487t.f1743d;
                                                        if (AbstractC3367j.m5096a(c0490w, c0490w3)) {
                                                            AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            String str3 = (String) obj2;
                                                            if (c2194h04.m3588c(c0490w3)) {
                                                                m5654y(i36, i37, str3);
                                                            }
                                                            i21 = i36;
                                                            arrayList3 = arrayList5;
                                                            i18 = i41;
                                                            c3502g02 = c3502g04;
                                                            i20 = 8;
                                                            num3 = num6;
                                                            c2194h02 = c2194h04;
                                                            i22 = i44;
                                                        } else if (AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1741b) || AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1733I)) {
                                                            i21 = i36;
                                                            arrayList3 = arrayList5;
                                                            i18 = i41;
                                                            c3502g02 = c3502g04;
                                                            num3 = num6;
                                                            c2194h02 = c2194h04;
                                                            i22 = i44;
                                                            i20 = 8;
                                                            m5631x(this, m5650t(i21), 2048, 64, 8);
                                                            m5631x(this, m5650t(i21), 2048, num3, 8);
                                                        } else if (AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1742c)) {
                                                            i20 = 8;
                                                            m5631x(this, m5650t(i36), 2048, 64, 8);
                                                            m5631x(this, m5650t(i36), 2048, num6, 8);
                                                            i21 = i36;
                                                            arrayList3 = arrayList5;
                                                            i18 = i41;
                                                            c3502g02 = c3502g04;
                                                            num3 = num6;
                                                            c2194h02 = c2194h04;
                                                            i22 = i44;
                                                        } else {
                                                            C0490w c0490w4 = AbstractC0487t.f1732H;
                                                            arrayList3 = arrayList5;
                                                            if (AbstractC3367j.m5096a(c0490w, c0490w4)) {
                                                                Object m3592g2 = c2194h05.m3592g(AbstractC0487t.f1763x);
                                                                if (m3592g2 == null) {
                                                                    m3592g2 = null;
                                                                }
                                                                C0474g c0474g = (C0474g) m3592g2;
                                                                if (c0474g == null || c0474g.f1652a != 4) {
                                                                    z11 = false;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                if (z11) {
                                                                    Object m3592g3 = c2194h05.m3592g(c0490w4);
                                                                    if (m3592g3 == null) {
                                                                        m3592g3 = null;
                                                                    }
                                                                    if (AbstractC3367j.m5096a(m3592g3, Boolean.TRUE)) {
                                                                        AccessibilityEvent m5642h = m5642h(m5650t(i36), 4);
                                                                        C0482o c0482o3 = c0482o2;
                                                                        c3502g02 = c3502g04;
                                                                        C0482o c0482o4 = new C0482o(c0482o3.f1691a, true, c3502g02, c0477j4);
                                                                        Object m3592g4 = c0482o4.m1048k().f1683e.m3592g(AbstractC0487t.f1740a);
                                                                        if (m3592g4 == null) {
                                                                            m3592g4 = null;
                                                                        }
                                                                        List list = (List) m3592g4;
                                                                        c0482o2 = c0482o3;
                                                                        String str4 = null;
                                                                        if (list != null) {
                                                                            str4 = AbstractC3353a.m5086a(list, ",", null, 62);
                                                                        }
                                                                        Object m3592g5 = c0482o4.m1048k().f1683e.m3592g(AbstractC0487t.f1725A);
                                                                        if (m3592g5 == null) {
                                                                            m3592g5 = null;
                                                                        }
                                                                        List list2 = (List) m3592g5;
                                                                        i18 = i41;
                                                                        if (list2 != null) {
                                                                            str2 = AbstractC3353a.m5086a(list2, ",", null, 62);
                                                                        } else {
                                                                            str2 = null;
                                                                        }
                                                                        if (str4 != null) {
                                                                            m5642h.setContentDescription(str4);
                                                                        }
                                                                        if (str2 != null) {
                                                                            m5642h.getText().add(str2);
                                                                        }
                                                                        m5652v(m5642h);
                                                                    } else {
                                                                        i18 = i41;
                                                                        c3502g02 = c3502g04;
                                                                        m5631x(this, m5650t(i36), 2048, num6, 8);
                                                                    }
                                                                } else {
                                                                    i18 = i41;
                                                                    c3502g02 = c3502g04;
                                                                    m5631x(this, m5650t(i36), 2048, 64, 8);
                                                                    m5631x(this, m5650t(i36), 2048, num6, 8);
                                                                }
                                                                num3 = num6;
                                                                i21 = i36;
                                                                c2194h02 = c2194h04;
                                                                i22 = i44;
                                                                i20 = 8;
                                                            } else {
                                                                i18 = i41;
                                                                c3502g02 = c3502g04;
                                                                if (AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1740a)) {
                                                                    int m5650t = m5650t(i36);
                                                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                    m5653w(m5650t, 2048, 4, (List) obj2);
                                                                    num3 = num6;
                                                                    i21 = i36;
                                                                    c2194h02 = c2194h04;
                                                                } else {
                                                                    C0490w c0490w5 = AbstractC0487t.f1729E;
                                                                    String str5 = "";
                                                                    if (AbstractC3367j.m5096a(c0490w, c0490w5)) {
                                                                        if (c2194h05.m3588c(AbstractC0476i.f1666j)) {
                                                                            Object m3592g6 = c2194h04.m3592g(c0490w5);
                                                                            if (m3592g6 == null) {
                                                                                m3592g6 = null;
                                                                            }
                                                                            C1587g c1587g = (C1587g) m3592g6;
                                                                            if (c1587g == null) {
                                                                                c1587g = "";
                                                                            }
                                                                            Object m3592g7 = c2194h05.m3592g(c0490w5);
                                                                            if (m3592g7 == null) {
                                                                                m3592g7 = null;
                                                                            }
                                                                            CharSequence charSequence = (C1587g) m3592g7;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence m5626H = m5626H(charSequence);
                                                                            int length3 = c1587g.length();
                                                                            int length4 = charSequence.length();
                                                                            if (length3 > length4) {
                                                                                i24 = length4;
                                                                            } else {
                                                                                i24 = length3;
                                                                            }
                                                                            Integer num7 = num6;
                                                                            int i47 = 0;
                                                                            while (true) {
                                                                                i25 = length3;
                                                                                if (i47 < i24) {
                                                                                    i26 = length4;
                                                                                    if (c1587g.charAt(i47) != charSequence.charAt(i47)) {
                                                                                        break;
                                                                                    }
                                                                                    i47++;
                                                                                    length3 = i25;
                                                                                    length4 = i26;
                                                                                } else {
                                                                                    i26 = length4;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int i48 = 0;
                                                                            while (true) {
                                                                                if (i48 < i24 - i47) {
                                                                                    i27 = i48;
                                                                                    if (c1587g.charAt((i25 - 1) - i48) != charSequence.charAt((i26 - 1) - i27)) {
                                                                                        break;
                                                                                    } else {
                                                                                        i48 = i27 + 1;
                                                                                    }
                                                                                } else {
                                                                                    i27 = i48;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int i49 = (i25 - i27) - i47;
                                                                            int i50 = (i26 - i27) - i47;
                                                                            C0490w c0490w6 = AbstractC0487t.f1734J;
                                                                            boolean m3588c = c2194h04.m3588c(c0490w6);
                                                                            boolean m3588c2 = c2194h05.m3588c(c0490w6);
                                                                            boolean m3588c3 = c2194h04.m3588c(AbstractC0487t.f1729E);
                                                                            if (m3588c3 && !m3588c && m3588c2) {
                                                                                z9 = true;
                                                                            } else {
                                                                                z9 = false;
                                                                            }
                                                                            if (m3588c3 && m3588c && !m3588c2) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = false;
                                                                            }
                                                                            if (z9 || z10) {
                                                                                c2194h03 = c2194h04;
                                                                                i21 = i36;
                                                                                num4 = num7;
                                                                                m5644j = m5644j(m5650t(i36), num4, num7, Integer.valueOf(i26), m5626H);
                                                                            } else {
                                                                                c2194h03 = c2194h04;
                                                                                m5644j = m5642h(m5650t(i36), 16);
                                                                                m5644j.setFromIndex(i47);
                                                                                m5644j.setRemovedCount(i49);
                                                                                m5644j.setAddedCount(i50);
                                                                                m5644j.setBeforeText(c1587g);
                                                                                m5644j.getText().add(m5626H);
                                                                                i21 = i36;
                                                                                num4 = num7;
                                                                            }
                                                                            m5644j.setClassName("android.widget.EditText");
                                                                            m5652v(m5644j);
                                                                            if (!z9 && !z10) {
                                                                                num5 = num4;
                                                                            } else {
                                                                                long j10 = ((C1602n0) c0477j4.m1034b(AbstractC0487t.f1730F)).f10304a;
                                                                                num5 = num4;
                                                                                m5644j.setFromIndex((int) (j10 >> 32));
                                                                                m5644j.setToIndex((int) (j10 & 4294967295L));
                                                                                m5652v(m5644j);
                                                                            }
                                                                            i22 = i44;
                                                                            num3 = num5;
                                                                            c2194h02 = c2194h03;
                                                                            i20 = 8;
                                                                        } else {
                                                                            Integer num8 = num6;
                                                                            i21 = i36;
                                                                            i20 = 8;
                                                                            m5631x(this, m5650t(i21), 2048, Integer.valueOf(i31), 8);
                                                                            i22 = i44;
                                                                            num3 = num8;
                                                                            c2194h02 = c2194h04;
                                                                        }
                                                                    } else {
                                                                        Integer num9 = num6;
                                                                        i21 = i36;
                                                                        c2194h02 = c2194h04;
                                                                        C0490w c0490w7 = AbstractC0487t.f1730F;
                                                                        if (AbstractC3367j.m5096a(c0490w, c0490w7)) {
                                                                            Object m3592g8 = c2194h05.m3592g(c0490w5);
                                                                            if (m3592g8 == null) {
                                                                                m3592g8 = null;
                                                                            }
                                                                            C1587g c1587g2 = (C1587g) m3592g8;
                                                                            if (c1587g2 != null && (str = c1587g2.f10239f) != null) {
                                                                                str5 = str;
                                                                            }
                                                                            long j11 = ((C1602n0) c0477j4.m1034b(c0490w7)).f10304a;
                                                                            num3 = num9;
                                                                            m5652v(m5644j(m5650t(i21), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (j11 & 4294967295L)), Integer.valueOf(str5.length()), m5626H(str5)));
                                                                            m5655z(i38);
                                                                        } else {
                                                                            i22 = i44;
                                                                            num3 = num9;
                                                                            if (!AbstractC3367j.m5096a(c0490w, c0490w2) && !AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1760u)) {
                                                                                if (AbstractC3367j.m5096a(c0490w, AbstractC0487t.f1750k)) {
                                                                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        i23 = 8;
                                                                                        m5652v(m5642h(m5650t(i38), 8));
                                                                                    } else {
                                                                                        i23 = 8;
                                                                                    }
                                                                                    m5631x(this, m5650t(i38), 2048, num3, i23);
                                                                                    i20 = i23;
                                                                                } else {
                                                                                    C0490w c0490w8 = AbstractC0476i.f1679w;
                                                                                    if (AbstractC3367j.m5096a(c0490w, c0490w8)) {
                                                                                        List list3 = (List) c0477j4.m1034b(c0490w8);
                                                                                        Object m3592g9 = c2194h02.m3592g(c0490w8);
                                                                                        if (m3592g9 == null) {
                                                                                            m3592g9 = null;
                                                                                        }
                                                                                        List list4 = (List) m3592g9;
                                                                                        if (list4 != null) {
                                                                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                            if (list3.size() <= 0) {
                                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                                if (list4.size() <= 0) {
                                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                                        i15 = 0;
                                                                                                    } else {
                                                                                                        i15 = 1;
                                                                                                    }
                                                                                                } else {
                                                                                                    list4.get(0).getClass();
                                                                                                    throw new ClassCastException();
                                                                                                }
                                                                                            } else {
                                                                                                list3.get(0).getClass();
                                                                                                throw new ClassCastException();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (obj2 instanceof C0468a) {
                                                                                            C0468a c0468a = (C0468a) obj2;
                                                                                            Object m3592g10 = c2194h02.m3592g(c0490w);
                                                                                            if (m3592g10 == null) {
                                                                                                m3592g10 = null;
                                                                                            }
                                                                                            if (c0468a != m3592g10) {
                                                                                                if (m3592g10 instanceof C0468a) {
                                                                                                    String str6 = c0468a.f1638a;
                                                                                                    C0468a c0468a2 = (C0468a) m3592g10;
                                                                                                    InterfaceC1684c interfaceC1684c = c0468a2.f1639b;
                                                                                                    if (AbstractC3367j.m5096a(str6, c0468a2.f1638a)) {
                                                                                                        InterfaceC1684c interfaceC1684c2 = c0468a.f1639b;
                                                                                                        if (interfaceC1684c2 == null) {
                                                                                                        }
                                                                                                        if (interfaceC1684c2 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                z8 = false;
                                                                                                if (z8) {
                                                                                                    i15 = 0;
                                                                                                }
                                                                                            }
                                                                                            z8 = true;
                                                                                            if (z8) {
                                                                                            }
                                                                                        }
                                                                                        i15 = 1;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                m5649p(c3502g02);
                                                                                int size2 = arrayList4.size();
                                                                                int i51 = 0;
                                                                                while (true) {
                                                                                    if (i51 < size2) {
                                                                                        if (((C3655a2) arrayList4.get(i51)).f17477e == i21) {
                                                                                            c3655a22 = (C3655a2) arrayList4.get(i51);
                                                                                            break;
                                                                                        }
                                                                                        i51++;
                                                                                    } else {
                                                                                        c3655a22 = null;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                AbstractC3367j.m5097b(c3655a22);
                                                                                Object m3592g11 = c2194h05.m3592g(c0490w2);
                                                                                if (m3592g11 == null) {
                                                                                    m3592g11 = null;
                                                                                }
                                                                                c3655a22.f17481i = (C0475h) m3592g11;
                                                                                Object m3592g12 = c2194h05.m3592g(AbstractC0487t.f1760u);
                                                                                if (m3592g12 == null) {
                                                                                    m3592g12 = null;
                                                                                }
                                                                                c3655a22.f17482j = (C0475h) m3592g12;
                                                                                if (c3655a22.f17478f.contains(c3655a22)) {
                                                                                    this.f17454d.getSnapshotObserver().m5498a(c3655a22, this.f17453P, new C0033i(16, c3655a22, this));
                                                                                }
                                                                            }
                                                                            i20 = 8;
                                                                        }
                                                                    }
                                                                }
                                                                i22 = i44;
                                                                i20 = 8;
                                                            }
                                                        }
                                                    } else {
                                                        c0477j2 = c0477j3;
                                                        arrayList3 = arrayList5;
                                                        j6 = j9;
                                                        i18 = i41;
                                                        i19 = i42;
                                                        i20 = i37;
                                                        c3502g02 = c3502g04;
                                                        num3 = num6;
                                                        i21 = i36;
                                                        c2194h02 = c2194h04;
                                                        i22 = length2;
                                                    }
                                                    i37 = i20;
                                                    c2194h04 = c2194h02;
                                                    c3502g04 = c3502g02;
                                                    i41 = i18;
                                                    i42 = i19 + 1;
                                                    length2 = i22;
                                                    num6 = num3;
                                                    arrayList5 = arrayList3;
                                                    i36 = i21;
                                                    j9 = j6 >> i20;
                                                    c0477j3 = c0477j2;
                                                }
                                                i14 = i36;
                                                c0477j = c0477j3;
                                                arrayList2 = arrayList5;
                                                c3502g0 = c3502g04;
                                                i13 = 1;
                                                num2 = num6;
                                                i17 = length2;
                                                int i52 = i41;
                                                c2194h0 = c2194h04;
                                                i11 = 0;
                                                if (i52 != i37) {
                                                    break;
                                                }
                                            } else {
                                                i14 = i36;
                                                c0477j = c0477j3;
                                                c2194h0 = c2194h04;
                                                arrayList2 = arrayList5;
                                                c3502g0 = c3502g04;
                                                i11 = 0;
                                                i13 = 1;
                                                num2 = num6;
                                                i17 = length2;
                                            }
                                            if (i40 == i17) {
                                                break;
                                            }
                                            i36 = i14;
                                            c2194h04 = c2194h0;
                                            c3502g04 = c3502g0;
                                            c0482o = c0482o2;
                                            c0477j3 = c0477j;
                                            i37 = 8;
                                            i39 = i40 + 1;
                                            length2 = i17;
                                            num6 = num2;
                                            arrayList5 = arrayList2;
                                        }
                                    } else {
                                        c0477j = c0477j3;
                                        arrayList2 = arrayList5;
                                        i10 = i34;
                                        c0482o2 = c0482o;
                                        i11 = 0;
                                        i13 = 1;
                                        num2 = num6;
                                        i14 = i36;
                                        i15 = 0;
                                    }
                                    if (i15 == 0) {
                                        Iterator it = c0477j.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (!c0482o2.m1048k().f1683e.m3588c((C0490w) ((Map.Entry) it.next()).getKey())) {
                                                    i16 = i13;
                                                    break;
                                                }
                                            } else {
                                                i16 = i11;
                                                break;
                                            }
                                        }
                                        i15 = i16;
                                    }
                                    if (i15 != 0) {
                                        i33 = 8;
                                        m5631x(this, m5650t(i14), 2048, num2, 8);
                                    } else {
                                        i33 = 8;
                                    }
                                    j8 >>= i33;
                                    i35 = i9 + 1;
                                    abstractC2201l2 = abstractC2201l;
                                    i29 = i11;
                                    num6 = num2;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    i30 = i12;
                                    i34 = i10;
                                    arrayList5 = arrayList2;
                                } else {
                                    throw AbstractC2487d.m4041e("no value for specified key");
                                }
                            }
                        }
                        i9 = i35;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i10 = i34;
                        i11 = i29;
                        i12 = i30;
                        num2 = num6;
                        j8 >>= i33;
                        i35 = i9 + 1;
                        abstractC2201l2 = abstractC2201l;
                        i29 = i11;
                        num6 = num2;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                        i30 = i12;
                        i34 = i10;
                        arrayList5 = arrayList2;
                    }
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i7 = i29;
                    int i53 = i30;
                    num = num6;
                    if (i34 == i33) {
                        i8 = i53;
                    } else {
                        return;
                    }
                } else {
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i7 = i29;
                    num = num6;
                    i8 = i30;
                }
                if (i8 != i32) {
                    i30 = i8 + 1;
                    abstractC2201l2 = abstractC2201l;
                    length = i32;
                    i29 = i7;
                    num6 = num;
                    i28 = i31;
                    iArr3 = iArr;
                    jArr3 = jArr;
                    arrayList5 = arrayList;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    public final void m5633B(C3502g0 c3502g0, C2222x c2222x) {
        C0477j m5449w;
        if (c3502g0.m5407I() && !this.f17454d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c3502g0)) {
            C3502g0 c3502g02 = null;
            if (!c3502g0.f16872I.m5308d(8)) {
                c3502g0 = c3502g0.m5447u();
                while (true) {
                    if (c3502g0 != null) {
                        if (c3502g0.f16872I.m5308d(8)) {
                            break;
                        } else {
                            c3502g0 = c3502g0.m5447u();
                        }
                    } else {
                        c3502g0 = null;
                        break;
                    }
                }
            }
            if (c3502g0 != null && (m5449w = c3502g0.m5449w()) != null) {
                if (!m5449w.f1685g) {
                    C3502g0 m5447u = c3502g0.m5447u();
                    while (true) {
                        if (m5447u != null) {
                            C0477j m5449w2 = m5447u.m5449w();
                            if (m5449w2 != null && m5449w2.f1685g) {
                                c3502g02 = m5447u;
                                break;
                            }
                            m5447u = m5447u.m5447u();
                        } else {
                            break;
                        }
                    }
                    if (c3502g02 != null) {
                        c3502g0 = c3502g02;
                    }
                }
                int i7 = c3502g0.f16885f;
                if (c2222x.m3653a(i7)) {
                    m5631x(this, m5650t(i7), 2048, 1, 8);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r0v18, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [t5.a, u5.k] */
    /* renamed from: C */
    public final void m5634C(C3502g0 c3502g0) {
        if (c3502g0.m5407I() && !this.f17454d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c3502g0)) {
            int i7 = c3502g0.f16885f;
            C0475h c0475h = (C0475h) this.f17469s.m3612b(i7);
            C0475h c0475h2 = (C0475h) this.f17470t.m3612b(i7);
            if (c0475h == null && c0475h2 == null) {
                return;
            }
            AccessibilityEvent m5642h = m5642h(i7, 4096);
            if (c0475h != null) {
                m5642h.setScrollX((int) ((Number) c0475h.f1653a.mo52a()).floatValue());
                m5642h.setMaxScrollX((int) ((Number) c0475h.f1654b.mo52a()).floatValue());
            }
            if (c0475h2 != null) {
                m5642h.setScrollY((int) ((Number) c0475h2.f1653a.mo52a()).floatValue());
                m5642h.setMaxScrollY((int) ((Number) c0475h2.f1654b.mo52a()).floatValue());
            }
            m5652v(m5642h);
        }
    }

    /* renamed from: D */
    public final boolean m5635D(C0482o c0482o, int i7, int i8, boolean z7) {
        String m5627n;
        Integer num;
        Integer num2;
        C0477j c0477j = c0482o.f1694d;
        int i9 = c0482o.f1697g;
        C0490w c0490w = AbstractC0476i.f1665i;
        boolean z8 = false;
        if (c0477j.f1683e.m3588c(c0490w) && AbstractC3681h0.m5681h(c0482o)) {
            InterfaceC3282f interfaceC3282f = (InterfaceC3282f) ((C0468a) c0482o.f1694d.m1034b(c0490w)).f1639b;
            if (interfaceC3282f != null) {
                return ((Boolean) interfaceC3282f.mo24c(Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
            }
        } else if ((i7 != i8 || i8 != this.f17473w) && (m5627n = m5627n(c0482o)) != null) {
            if (i7 < 0 || i7 != i8 || i8 > m5627n.length()) {
                i7 = -1;
            }
            this.f17473w = i7;
            if (m5627n.length() > 0) {
                z8 = true;
            }
            int m5650t = m5650t(i9);
            Integer num3 = null;
            if (z8) {
                num = Integer.valueOf(this.f17473w);
            } else {
                num = null;
            }
            if (z8) {
                num2 = Integer.valueOf(this.f17473w);
            } else {
                num2 = null;
            }
            if (z8) {
                num3 = Integer.valueOf(m5627n.length());
            }
            m5652v(m5644j(m5650t, num, num2, num3, m5627n));
            m5655z(i9);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5636I() {
        long j6;
        long j7;
        long j8;
        char c7;
        long[] jArr;
        long[] jArr2;
        long j9;
        int i7;
        int i8;
        int i9;
        char c8;
        C0482o c0482o;
        C2222x c2222x = new C2222x();
        C2222x c2222x2 = this.f17441D;
        int[] iArr = c2222x2.f12758b;
        long[] jArr3 = c2222x2.f12757a;
        int length = jArr3.length - 2;
        C2221w c2221w = this.f17447J;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            j6 = 128;
            j7 = 255;
            while (true) {
                long j10 = jArr3[i11];
                char c9 = 7;
                j8 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            c8 = c9;
                            C0483p c0483p = (C0483p) m5647m().m3612b(i14);
                            String str = null;
                            if (c0483p != null) {
                                c0482o = c0483p.f1698a;
                            } else {
                                c0482o = null;
                            }
                            if (c0482o != null) {
                                if (c0482o.f1694d.f1683e.m3588c(AbstractC0487t.f1743d)) {
                                }
                            }
                            c2222x.m3653a(i14);
                            C3659b2 c3659b2 = (C3659b2) c2221w.m3612b(i14);
                            if (c3659b2 != null) {
                                Object m3592g = c3659b2.f17491a.f1683e.m3592g(AbstractC0487t.f1743d);
                                if (m3592g != 0) {
                                    str = m3592g;
                                }
                                str = str;
                            }
                            m5654y(i14, 32, str);
                        } else {
                            c8 = c9;
                        }
                        j10 >>= 8;
                        i13++;
                        c9 = c8;
                    }
                    c7 = c9;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c7 = 7;
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            j6 = 128;
            j7 = 255;
            j8 = -9187201950435737472L;
            c7 = 7;
        }
        int[] iArr2 = c2222x.f12758b;
        long[] jArr4 = c2222x.f12757a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr4[i15];
                if ((((~j11) << c7) & j11 & j8) != j8) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & j7) < j6) {
                            int i18 = iArr2[(i15 << 3) + i17];
                            int hashCode = Integer.hashCode(i18) * (-862048943);
                            int i19 = hashCode ^ (hashCode << 16);
                            int i20 = i19 & 127;
                            int i21 = c2222x2.f12759c;
                            int i22 = (i19 >>> 7) & i21;
                            i7 = i10;
                            int i23 = 0;
                            while (true) {
                                long[] jArr5 = c2222x2.f12757a;
                                int i24 = i22 >> 3;
                                jArr2 = jArr4;
                                int i25 = (i22 & 7) << 3;
                                j9 = j11;
                                long j12 = (jArr5[i24] >>> i25) | ((jArr5[i24 + 1] << (64 - i25)) & ((-i25) >> 63));
                                int i26 = i21;
                                long j13 = (i20 * 72340172838076673L) ^ j12;
                                long j14 = (j13 - 72340172838076673L) & (~j13) & j8;
                                while (true) {
                                    if (j14 == 0) {
                                        break;
                                    }
                                    i9 = (i22 + (Long.numberOfTrailingZeros(j14) >> 3)) & i26;
                                    int i27 = i26;
                                    if (c2222x2.f12758b[i9] == i18) {
                                        break;
                                    }
                                    j14 &= j14 - 1;
                                    i26 = i27;
                                }
                                i23 += 8;
                                i22 = (i22 + i23) & i8;
                                jArr4 = jArr2;
                                i21 = i8;
                                j11 = j9;
                            }
                            int i28 = i9;
                            if (i28 >= 0) {
                                c2222x2.m3658f(i28);
                            }
                        } else {
                            jArr2 = jArr4;
                            j9 = j11;
                            i7 = i10;
                        }
                        j11 = j9 >> i7;
                        i17++;
                        i10 = i7;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i16 != i10) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                jArr4 = jArr;
                i10 = 8;
            }
        }
        c2221w.m3648c();
        AbstractC2201l m5647m = m5647m();
        int[] iArr3 = m5647m.f12706b;
        Object[] objArr = m5647m.f12707c;
        long[] jArr6 = m5647m.f12705a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i29 = 0;
            while (true) {
                long j15 = jArr6[i29];
                if ((((~j15) << c7) & j15 & j8) != j8) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = 0; i31 < i30; i31++) {
                        if ((j15 & j7) < j6) {
                            int i32 = (i29 << 3) + i31;
                            int i33 = iArr3[i32];
                            C0482o c0482o2 = ((C0483p) objArr[i32]).f1698a;
                            C0477j c0477j = c0482o2.f1694d;
                            C0490w c0490w = AbstractC0487t.f1743d;
                            if (c0477j.f1683e.m3588c(c0490w) && c2222x2.m3653a(i33)) {
                                m5654y(i33, 16, (String) c0482o2.f1694d.m1034b(c0490w));
                            }
                            c2221w.m3652g(i33, new C3659b2(c0482o2, m5647m()));
                        }
                        j15 >>= 8;
                    }
                    if (i30 != 8) {
                        break;
                    }
                }
                if (i29 == length3) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        this.f17448K = new C3659b2(this.f17454d.getSemanticsOwner().m1055a(), m5647m());
    }

    @Override // p051g3.AbstractC1621b
    /* renamed from: a */
    public final C0019e1 mo2631a(View view) {
        return this.f17463m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m5637c(int i7, C1782h c1782h, String str, Bundle bundle) {
        C0482o c0482o;
        Object obj;
        Region m5625G;
        Object obj2;
        float[] m5624F;
        Object obj3;
        Rect m5623E;
        Object obj4;
        Object obj5;
        int i8;
        C0465c c0465c;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i9;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = c1782h.f10826a;
        C0483p c0483p = (C0483p) m5647m().m3612b(i7);
        if (c0483p != null && (c0482o = c0483p.f1698a) != null) {
            C0477j c0477j = c0482o.f1694d;
            C2194h0 c2194h0 = c0477j.f1683e;
            String m5627n = m5627n(c0482o);
            if (AbstractC3367j.m5096a(str, this.f17444G)) {
                int m3640d = this.f17442E.m3640d(i7);
                if (m3640d != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, m3640d);
                    return;
                }
                return;
            }
            if (AbstractC3367j.m5096a(str, this.f17445H)) {
                int m3640d2 = this.f17443F.m3640d(i7);
                if (m3640d2 != -1) {
                    accessibilityNodeInfo2.getExtras().putInt(str, m3640d2);
                    return;
                }
                return;
            }
            AbstractC3497e1 abstractC3497e1 = null;
            if (c2194h0.m3588c(AbstractC0476i.f1657a) && bundle != null && AbstractC3367j.m5096a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i11 > 0 && i10 >= 0) {
                    if (m5627n != null) {
                        i8 = m5627n.length();
                    } else {
                        i8 = Integer.MAX_VALUE;
                    }
                    if (i10 < i8) {
                        C1598l0 m5693t = AbstractC3681h0.m5693t(c0477j);
                        if (m5693t != null) {
                            ArrayList arrayList = new ArrayList();
                            int i12 = 0;
                            while (i12 < i11) {
                                int i13 = i10 + i12;
                                if (i13 >= m5693t.f10288a.f10276a.f10239f.length()) {
                                    arrayList.add(abstractC3497e1);
                                    accessibilityNodeInfo = accessibilityNodeInfo2;
                                    i9 = i11;
                                } else {
                                    C0465c m2575b = m5693t.m2575b(i13);
                                    AbstractC3497e1 m1042d = c0482o.m1042d();
                                    long j6 = 0;
                                    if (m1042d != null) {
                                        if (!m1042d.mo5333V0().f18005r) {
                                            m1042d = abstractC3497e1;
                                        }
                                        if (m1042d != null) {
                                            j6 = m1042d.mo4927U(0L);
                                        }
                                    }
                                    C0465c m1020g = m2575b.m1020g(j6);
                                    C0465c m1045g = c0482o.m1045g();
                                    if (m1020g.m1018e(m1045g)) {
                                        c0465c = m1020g.m1016c(m1045g);
                                    } else {
                                        c0465c = abstractC3497e1;
                                    }
                                    if (c0465c != 0) {
                                        float f7 = c0465c.f1625a;
                                        C3728t c3728t = this.f17454d;
                                        long m5746u = c3728t.m5746u((Float.floatToRawIntBits(c0465c.f1626b) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
                                        long m5746u2 = c3728t.m5746u((Float.floatToRawIntBits(c0465c.f1627c) << 32) | (Float.floatToRawIntBits(c0465c.f1628d) & 4294967295L));
                                        int i14 = (int) (m5746u >> 32);
                                        int i15 = (int) (m5746u2 >> 32);
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i9 = i11;
                                        int i16 = (int) (m5746u & 4294967295L);
                                        int i17 = (int) (m5746u2 & 4294967295L);
                                        rectF = new RectF(Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)));
                                    } else {
                                        accessibilityNodeInfo = accessibilityNodeInfo2;
                                        i9 = i11;
                                        rectF = null;
                                    }
                                    arrayList.add(rectF);
                                }
                                i12++;
                                i11 = i9;
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                abstractC3497e1 = null;
                            }
                            accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            C0490w c0490w = AbstractC0487t.f1764y;
            if (c2194h0.m3588c(c0490w) && bundle != null && AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.testTag")) {
                Object m3592g = c2194h0.m3592g(c0490w);
                if (m3592g == null) {
                    obj5 = null;
                } else {
                    obj5 = m3592g;
                }
                String str2 = (String) obj5;
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, c0482o.f1697g);
                return;
            }
            if (AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object m3592g2 = c2194h0.m3592g(AbstractC0487t.f1739O);
                if (m3592g2 == null) {
                    obj4 = null;
                } else {
                    obj4 = m3592g2;
                }
                InterfaceC0667m0 interfaceC0667m0 = (InterfaceC0667m0) obj4;
                if (interfaceC0667m0 != null) {
                    AbstractC0655g0 m5643i = m5643i(interfaceC0667m0, c0482o);
                    if (m5643i instanceof C0651e0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m5623E(m5643i));
                        return;
                    } else if (m5643i instanceof C0653f0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m5623E(m5643i));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m5624F(m5643i));
                        return;
                    } else {
                        if (m5643i instanceof C0649d0) {
                            accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m5625G(m5643i));
                            return;
                        }
                        throw new RuntimeException();
                    }
                }
                return;
            }
            if (AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object m3592g3 = c2194h0.m3592g(AbstractC0487t.f1739O);
                if (m3592g3 == null) {
                    obj3 = null;
                } else {
                    obj3 = m3592g3;
                }
                InterfaceC0667m0 interfaceC0667m02 = (InterfaceC0667m0) obj3;
                if (interfaceC0667m02 != null && (m5623E = m5623E(m5643i(interfaceC0667m02, c0482o))) != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m5623E);
                    return;
                }
                return;
            }
            if (AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object m3592g4 = c2194h0.m3592g(AbstractC0487t.f1739O);
                if (m3592g4 == null) {
                    obj2 = null;
                } else {
                    obj2 = m3592g4;
                }
                InterfaceC0667m0 interfaceC0667m03 = (InterfaceC0667m0) obj2;
                if (interfaceC0667m03 != null && (m5624F = m5624F(m5643i(interfaceC0667m03, c0482o))) != null) {
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m5624F);
                    return;
                }
                return;
            }
            if (AbstractC3367j.m5096a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object m3592g5 = c2194h0.m3592g(AbstractC0487t.f1739O);
                if (m3592g5 == null) {
                    obj = null;
                } else {
                    obj = m3592g5;
                }
                InterfaceC0667m0 interfaceC0667m04 = (InterfaceC0667m0) obj;
                if (interfaceC0667m04 != null && (m5625G = m5625G(m5643i(interfaceC0667m04, c0482o))) != null) {
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m5625G);
                }
            }
        }
    }

    /* renamed from: d */
    public final Rect m5638d(C0483p c0483p) {
        C3101k c3101k = c0483p.f1699b;
        float f7 = c3101k.f15698a;
        float f8 = c3101k.f15699b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        C3728t c3728t = this.f17454d;
        long m5746u = c3728t.m5746u(floatToRawIntBits);
        float f9 = c3101k.f15700c;
        float f10 = c3101k.f15701d;
        long m5746u2 = c3728t.m5746u((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        int i7 = (int) (m5746u >> 32);
        int i8 = (int) (m5746u2 >> 32);
        int i9 = (int) (m5746u & 4294967295L);
        int i10 = (int) (m5746u2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.floor(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r4, r2) == r7) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0086, B:29:0x0095, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5639e(AbstractC2583c abstractC2583c) {
        C3745y c3745y;
        int i7;
        C2191g c2191g;
        C2191g c2191g2;
        C2222x c2222x;
        C1547b c1547b;
        C2222x c2222x2;
        C1547b c1547b2;
        int i8;
        long j6;
        Object m2476b;
        try {
            if (abstractC2583c instanceof C3745y) {
                c3745y = (C3745y) abstractC2583c;
                int i9 = c3745y.f17813l;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c3745y.f17813l = i9 - Integer.MIN_VALUE;
                    Object obj = c3745y.f17811j;
                    i7 = c3745y.f17813l;
                    c2191g = this.f17475y;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (i7 == 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                c1547b2 = c3745y.f17810i;
                                c2222x2 = c3745y.f17809h;
                                AbstractC1793a0.m2972L(obj);
                                char c7 = 2;
                                c2191g2 = c2191g;
                                c2222x = c2222x2;
                                c2191g = c2191g2;
                                c1547b = c1547b2;
                                c3745y.f17809h = c2222x;
                                c3745y.f17810i = c1547b;
                                c3745y.f17813l = 1;
                                m2476b = c1547b.m2476b(c3745y);
                                if (m2476b == enumC2465a) {
                                    C1547b c1547b3 = c1547b;
                                    c2222x2 = c2222x;
                                    obj = m2476b;
                                    c1547b2 = c1547b3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        c1547b2.m2477c();
                                        if (m5648o()) {
                                            int i10 = c2191g.f12662g;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                C3502g0 c3502g0 = (C3502g0) c2191g.f12661f[i11];
                                                m5633B(c3502g0, c2222x2);
                                                m5634C(c3502g0);
                                            }
                                            c2222x2.f12760d = 0;
                                            long[] jArr = c2222x2.f12757a;
                                            if (jArr != AbstractC2210p0.f12722a) {
                                                try {
                                                    AbstractC1804l.m3024Q(jArr, -9187201950435737472L);
                                                    long[] jArr2 = c2222x2.f12757a;
                                                    i8 = c2222x2.f12759c;
                                                    int i12 = i8 >> 3;
                                                    jArr2[i12] = ((~j6) & jArr2[i12]) | j6;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    c2191g2.clear();
                                                    throw th;
                                                }
                                                j6 = 255 << ((i8 & 7) << 3);
                                                c2191g2 = c2191g;
                                            } else {
                                                c2191g2 = c2191g;
                                            }
                                            c2222x2.f12761e = AbstractC2210p0.m3618a(c2222x2.f12759c) - c2222x2.f12760d;
                                            if (!this.f17449L) {
                                                this.f17449L = true;
                                                this.f17462l.post(this.f17451N);
                                            }
                                        } else {
                                            c2191g2 = c2191g;
                                        }
                                        c2191g2.clear();
                                        this.f17469s.m3648c();
                                        this.f17470t.m3648c();
                                        long j7 = this.f17458h;
                                        c3745y.f17809h = c2222x2;
                                        c3745y.f17810i = c1547b2;
                                        c7 = 2;
                                        c3745y.f17813l = 2;
                                    } else {
                                        c2191g.clear();
                                        return C1694m.f10482a;
                                    }
                                } else {
                                    return enumC2465a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c1547b2 = c3745y.f17810i;
                            c2222x2 = c3745y.f17809h;
                            AbstractC1793a0.m2972L(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        c2222x = new C2222x();
                        C1548c c1548c = this.f17476z;
                        c1548c.getClass();
                        c1547b = new C1547b(c1548c);
                        c3745y.f17809h = c2222x;
                        c3745y.f17810i = c1547b;
                        c3745y.f17813l = 1;
                        m2476b = c1547b.m2476b(c3745y);
                        if (m2476b == enumC2465a) {
                        }
                    }
                }
            }
            if (i7 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            c2191g2 = c2191g;
        }
        c3745y = new C3745y(this, abstractC2583c);
        Object obj2 = c3745y.f17811j;
        i7 = c3745y.f17813l;
        c2191g = this.f17475y;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r2v7, types: [t5.a, u5.k] */
    /* renamed from: f */
    public final boolean m5640f(boolean z7, int i7, long j6) {
        C0490w c0490w;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (!AbstractC3367j.m5096a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC2201l m5647m = m5647m();
        if (C0464b.m1006b(j6, 9205357640488583168L) || (((9223372034707292159L & j6) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z7) {
            c0490w = AbstractC0487t.f1760u;
        } else if (!z7) {
            c0490w = AbstractC0487t.f1759t;
        } else {
            throw new RuntimeException();
        }
        Object[] objArr = m5647m.f12707c;
        long[] jArr = m5647m.f12705a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i9 = 0;
        boolean z12 = false;
        while (true) {
            long j7 = jArr[i9];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j7) < 128) {
                        C0483p c0483p = (C0483p) objArr[(i9 << 3) + i12];
                        C3101k c3101k = c0483p.f1699b;
                        float f7 = c3101k.f15698a;
                        i8 = i10;
                        float f8 = c3101k.f15699b;
                        float f9 = c3101k.f15700c;
                        float f10 = c3101k.f15701d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                        if (intBitsToFloat >= f7) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (intBitsToFloat < f9) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z13 = z8 & z9;
                        if (intBitsToFloat2 >= f8) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z14 = z13 & z10;
                        if (intBitsToFloat2 < f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 & z14) {
                            Object m3592g = c0483p.f1698a.f1694d.f1683e.m3592g(c0490w);
                            if (m3592g == null) {
                                m3592g = null;
                            }
                            C0475h c0475h = (C0475h) m3592g;
                            if (c0475h != null) {
                                ?? r22 = c0475h.f1653a;
                                if (i7 < 0) {
                                    if (((Number) r22.mo52a()).floatValue() <= 0.0f) {
                                    }
                                    z12 = true;
                                } else {
                                    if (((Number) r22.mo52a()).floatValue() >= ((Number) c0475h.f1654b.mo52a()).floatValue()) {
                                    }
                                    z12 = true;
                                }
                            }
                        }
                    } else {
                        i8 = i10;
                    }
                    j7 >>= i8;
                    i12++;
                    i10 = i8;
                }
                if (i11 != i10) {
                    return z12;
                }
            }
            if (i9 != length) {
                i9++;
            } else {
                return z12;
            }
        }
    }

    /* renamed from: g */
    public final void m5641g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m5648o()) {
                m5651u(this.f17454d.getSemanticsOwner().m1055a(), this.f17448K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m5632A(m5647m());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m5636I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: h */
    public final AccessibilityEvent m5642h(int i7, int i8) {
        C0483p c0483p;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        C3728t c3728t = this.f17454d;
        obtain.setPackageName(c3728t.getContext().getPackageName());
        obtain.setSource(c3728t, i7);
        if (m5648o() && (c0483p = (C0483p) m5647m().m3612b(i7)) != null) {
            C0482o c0482o = c0483p.f1698a;
            obtain.setPassword(c0482o.f1694d.f1683e.m3588c(AbstractC0487t.f1734J));
            Object m3592g = c0482o.f1694d.f1683e.m3592g(AbstractC0487t.f1753n);
            if (m3592g == null) {
                m3592g = null;
            }
            boolean m5096a = AbstractC3367j.m5096a(m3592g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC1776b.m2944f(obtain, m5096a);
            }
        }
        return obtain;
    }

    /* renamed from: i */
    public final AbstractC0655g0 m5643i(InterfaceC0667m0 interfaceC0667m0, C0482o c0482o) {
        long j6;
        AbstractC3497e1 m1042d = c0482o.m1042d();
        if (m1042d != null) {
            j6 = m1042d.f16055g;
        } else {
            j6 = 0;
        }
        return interfaceC0667m0.mo1393a(AbstractC2072e.m3347y(j6), c0482o.f1693c.f16866C, this.f17454d.getDensity());
    }

    /* renamed from: j */
    public final AccessibilityEvent m5644j(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent m5642h = m5642h(i7, 8192);
        if (num != null) {
            m5642h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            m5642h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            m5642h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            m5642h.getText().add(charSequence);
        }
        return m5642h;
    }

    /* renamed from: k */
    public final int m5645k(C0482o c0482o) {
        C0477j c0477j = c0482o.f1694d;
        C0477j c0477j2 = c0482o.f1694d;
        C0490w c0490w = AbstractC0487t.f1740a;
        if (!c0477j.f1683e.m3588c(AbstractC0487t.f1740a)) {
            C0490w c0490w2 = AbstractC0487t.f1730F;
            if (c0477j2.f1683e.m3588c(c0490w2)) {
                return (int) (((C1602n0) c0477j2.m1034b(c0490w2)).f10304a & 4294967295L);
            }
        }
        return this.f17473w;
    }

    /* renamed from: l */
    public final int m5646l(C0482o c0482o) {
        C0477j c0477j = c0482o.f1694d;
        C0477j c0477j2 = c0482o.f1694d;
        C0490w c0490w = AbstractC0487t.f1740a;
        if (!c0477j.f1683e.m3588c(AbstractC0487t.f1740a)) {
            C0490w c0490w2 = AbstractC0487t.f1730F;
            if (c0477j2.f1683e.m3588c(c0490w2)) {
                return (int) (((C1602n0) c0477j2.m1034b(c0490w2)).f10304a >> 32);
            }
        }
        return this.f17473w;
    }

    /* renamed from: m */
    public final AbstractC2201l m5647m() {
        C0482o c0482o;
        if (this.f17438A) {
            this.f17438A = false;
            C3728t c3728t = this.f17454d;
            this.f17440C = AbstractC0485r.m1058b(c3728t.getSemanticsOwner());
            if (m5648o()) {
                C2221w c2221w = this.f17440C;
                Resources resources = c3728t.getContext().getResources();
                C2219u c2219u = this.f17442E;
                c2219u.m3637a();
                C2219u c2219u2 = this.f17443F;
                c2219u2.m3637a();
                C0483p c0483p = (C0483p) c2221w.m3612b(-1);
                if (c0483p != null) {
                    c0482o = c0483p.f1698a;
                } else {
                    c0482o = null;
                }
                AbstractC3367j.m5097b(c0482o);
                ArrayList m1068b = AbstractC0493z.m1068b(c0482o, new C3423m0(6, c2221w), new C3423m0(7, resources), AbstractC3784a.m5817z(c0482o));
                int m3066N = AbstractC1806n.m3066N(m1068b);
                int i7 = 1;
                if (1 <= m3066N) {
                    while (true) {
                        int i8 = ((C0482o) m1068b.get(i7 - 1)).f1697g;
                        int i9 = ((C0482o) m1068b.get(i7)).f1697g;
                        c2219u.m3642f(i8, i9);
                        c2219u2.m3642f(i9, i8);
                        if (i7 == m3066N) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.f17440C;
    }

    /* renamed from: o */
    public final boolean m5648o() {
        if (this.f17457g.isEnabled() && !this.f17461k.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m5649p(C3502g0 c3502g0) {
        if (this.f17475y.add(c3502g0)) {
            this.f17476z.mo2505v(C1694m.f10482a);
        }
    }

    /* renamed from: t */
    public final int m5650t(int i7) {
        if (i7 == this.f17454d.getSemanticsOwner().m1055a().f1697g) {
            return -1;
        }
        return i7;
    }

    /* renamed from: u */
    public final void m5651u(C0482o c0482o, C3659b2 c3659b2) {
        int[] iArr = AbstractC2205n.f12714a;
        C2222x c2222x = new C2222x();
        List m1038j = C0482o.m1038j(4, c0482o);
        C3502g0 c3502g0 = c0482o.f1693c;
        int size = m1038j.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0482o c0482o2 = (C0482o) m1038j.get(i7);
            AbstractC2201l m5647m = m5647m();
            int i8 = c0482o2.f1697g;
            if (m5647m.m3611a(i8)) {
                if (!c3659b2.f17492b.m3654b(i8)) {
                    m5649p(c3502g0);
                    return;
                }
                c2222x.m3653a(i8);
            }
        }
        C2222x c2222x2 = c3659b2.f17492b;
        int[] iArr2 = c2222x2.f12758b;
        long[] jArr = c2222x2.f12757a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr[i9];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128 && !c2222x.m3654b(iArr2[(i9 << 3) + i11])) {
                            m5649p(c3502g0);
                            return;
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        List m1038j2 = C0482o.m1038j(4, c0482o);
        int size2 = m1038j2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C0482o c0482o3 = (C0482o) m1038j2.get(i12);
            C3659b2 c3659b22 = (C3659b2) this.f17447J.m3612b(c0482o3.f1697g);
            if (c3659b22 != null && m5647m().m3611a(c0482o3.f1697g)) {
                m5651u(c0482o3, c3659b22);
            }
        }
    }

    /* renamed from: v */
    public final boolean m5652v(AccessibilityEvent accessibilityEvent) {
        if (!m5648o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f17468r = true;
        }
        try {
            return ((Boolean) this.f17456f.mo23f(accessibilityEvent)).booleanValue();
        } finally {
            this.f17468r = false;
        }
    }

    /* renamed from: w */
    public final boolean m5653w(int i7, int i8, Integer num, List list) {
        if (i7 != Integer.MIN_VALUE && m5648o()) {
            AccessibilityEvent m5642h = m5642h(i7, i8);
            if (num != null) {
                m5642h.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                m5642h.setContentDescription(AbstractC3353a.m5086a(list, ",", null, 62));
            }
            return m5652v(m5642h);
        }
        return false;
    }

    /* renamed from: y */
    public final void m5654y(int i7, int i8, String str) {
        AccessibilityEvent m5642h = m5642h(m5650t(i7), 32);
        m5642h.setContentChangeTypes(i8);
        if (str != null) {
            m5642h.getText().add(str);
        }
        m5652v(m5642h);
    }

    /* renamed from: z */
    public final void m5655z(int i7) {
        C3742x c3742x = this.f17439B;
        if (c3742x != null) {
            C0482o c0482o = c3742x.f17801a;
            if (i7 != c0482o.f1697g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c3742x.f17806f <= 1000) {
                AccessibilityEvent m5642h = m5642h(m5650t(c0482o.f1697g), 131072);
                m5642h.setFromIndex(c3742x.f17804d);
                m5642h.setToIndex(c3742x.f17805e);
                m5642h.setAction(c3742x.f17802b);
                m5642h.setMovementGranularity(c3742x.f17803c);
                m5642h.getText().add(m5627n(c0482o));
                m5652v(m5642h);
            }
        }
        this.f17439B = null;
    }
}
