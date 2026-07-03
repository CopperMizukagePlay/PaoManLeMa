package p067i4;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.foundation.gestures.AbstractC0152a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import com.paoman.lema.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p001a0.AbstractC0094y0;
import p022c4.C0400j;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.C0474g;
import p028d2.C0477j;
import p028d2.C0490w;
import p032d6.AbstractC0525d0;
import p032d6.C0569s;
import p035e1.C0671o0;
import p036e2.C0685a;
import p039e5.C1054ld;
import p043f2.EnumC1533a;
import p050g2.C1587g;
import p051g3.AbstractC1655r;
import p059h3.C1781g;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2083g;
import p069i6.C2103p;
import p077k.C2184c0;
import p077k.C2194h0;
import p077k.C2221w;
import p085l0.AbstractC2399q;
import p085l0.AbstractC2406s;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.C2375k;
import p085l0.C2383m;
import p085l0.C2395p;
import p085l0.C2429z1;
import p090l5.EnumC2465a;
import p093m0.C2530j0;
import p098m5.AbstractC2583c;
import p100n.InterfaceC2656k;
import p101n0.C2702b;
import p104n3.C2717b;
import p107o.AbstractC2736e1;
import p107o.AbstractC2781v;
import p107o.C2730c1;
import p107o.C2733d1;
import p107o.C2740g;
import p107o.C2767p;
import p107o.EnumC2788y0;
import p107o.InterfaceC2739f1;
import p122q.C2943s0;
import p122q.C2949u0;
import p122q.C2952v0;
import p122q.C2955w0;
import p122q.EnumC2931o0;
import p122q.InterfaceC2914i1;
import p122q.InterfaceC2925m0;
import p137s.C3081j;
import p140s2.AbstractC3092b;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3281e;
import p154u1.C3352h;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p158u5.C3376s;
import p162v1.C3502g0;
import p168w.C3628k;
import p169w0.C3651h;
import p170w1.AbstractC3674f1;
import p170w1.AbstractC3681h0;
import p172w3.InterfaceC3782f;
import p177x0.InterfaceC3810r;
import p183y0.C3835d;
import p183y0.C3843l;
import p183y0.InterfaceC3844m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.e */
/* loaded from: classes.dex */
public abstract class AbstractC2072e {
    /* renamed from: a */
    public static final C2767p m3325a(float f7, long j6) {
        return new C2767p(f7, new C0671o0(j6));
    }

    /* renamed from: b */
    public static final long m3326b(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [u5.s, java.lang.Object] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3327c(InterfaceC2914i1 interfaceC2914i1, float f7, InterfaceC2656k interfaceC2656k, AbstractC2583c abstractC2583c) {
        C2943s0 c2943s0;
        int i7;
        C3376s c3376s;
        if (abstractC2583c instanceof C2943s0) {
            C2943s0 c2943s02 = (C2943s0) abstractC2583c;
            int i8 = c2943s02.f15275j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2943s02.f15275j = i8 - Integer.MIN_VALUE;
                c2943s0 = c2943s02;
                Object obj = c2943s0.f15274i;
                i7 = c2943s0.f15275j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c3376s = c2943s0.f15273h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    InterfaceC3281e c2949u0 = new C2949u0(f7, interfaceC2656k, obj2, null);
                    c2943s0.f15273h = obj2;
                    c2943s0.f15275j = 1;
                    Object mo112a = interfaceC2914i1.mo112a(EnumC2788y0.f14796e, c2949u0, c2943s0);
                    Object obj3 = EnumC2465a.f13750e;
                    if (mo112a == obj3) {
                        return obj3;
                    }
                    c3376s = obj2;
                }
                return new Float(c3376s.f16448e);
            }
        }
        c2943s0 = new AbstractC2583c(abstractC2583c);
        Object obj4 = c2943s0.f15274i;
        i7 = c2943s0.f15275j;
        if (i7 == 0) {
        }
        return new Float(c3376s.f16448e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [w0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l0.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    /* renamed from: d */
    public static final List m3328d(C2350d2 c2350d2, Integer num, int i7, Integer num2) {
        int i8;
        int i9;
        C2184c0 c2184c0;
        if (!c2350d2.f13381w && c2350d2.m3779p() != 0) {
            ?? c3651h = new C3651h(c2350d2);
            if (num2 != null) {
                i8 = num2.intValue();
            } else {
                i8 = c2350d2.f13380v;
                if (i8 < 0) {
                    i8 = c2350d2.m3748D(c2350d2.f13360b, i7);
                }
            }
            if (num == 0) {
                int m3757M = c2350d2.f13367i - c2350d2.m3757M(c2350d2.f13360b, c2350d2.m3781r(i7));
                C2221w c2221w = c2350d2.f13377s;
                if (c2221w != null && (c2184c0 = (C2184c0) c2221w.m3612b(i7)) != null) {
                    i9 = c2184c0.f12629b;
                } else {
                    i9 = 0;
                }
                num = Integer.valueOf(m3757M + i9);
            }
            while (i7 >= 0) {
                c3651h.m5616b(c2350d2.m3758N(i7), num);
                num = c2350d2.m3766b(i7);
                if (i8 >= 0) {
                    int i10 = i8;
                    i8 = c2350d2.m3748D(c2350d2.f13360b, i8);
                    i7 = i10;
                } else {
                    i7 = i8;
                }
            }
            return c3651h.f17428a;
        }
        return C1813u.f10860e;
    }

    /* renamed from: e */
    public static int m3329e(int i7, int i8) {
        int i9 = i7 - i8;
        if (i9 > i8) {
            i9 = i8;
            i8 = i9;
        }
        int i10 = 1;
        int i11 = 1;
        while (i7 > i8) {
            i10 *= i7;
            if (i11 <= i9) {
                i10 /= i11;
                i11++;
            }
            i7--;
        }
        while (i11 <= i9) {
            i10 /= i11;
            i11++;
        }
        return i10;
    }

    /* renamed from: g */
    public static final Integer m3330g(C2429z1 c2429z1, AbstractC2406s abstractC2406s, int i7, int i8) {
        Integer m3330g;
        int[] iArr = c2429z1.f13638b;
        while (true) {
            C2383m c2383m = null;
            if (i7 >= i8) {
                return null;
            }
            int i9 = iArr[(i7 * 5) + 3] + i7;
            if (c2429z1.m3997j(i7) && c2429z1.m3996i(i7) == 206 && AbstractC3367j.m5096a(c2429z1.m4003p(iArr, i7), AbstractC2399q.f13525e)) {
                Object m3995h = c2429z1.m3995h(i7, 0);
                if (m3995h instanceof C2383m) {
                    c2383m = (C2383m) m3995h;
                }
                if (c2383m != null && c2383m.f13446e.equals(abstractC2406s)) {
                    return Integer.valueOf(i7);
                }
            }
            if (c2429z1.m3991d(i7) && (m3330g = m3330g(c2429z1, abstractC2406s, i7 + 1, i9)) != null) {
                return Integer.valueOf(m3330g.intValue());
            }
            i7 = i9;
        }
    }

    /* renamed from: h */
    public static long m3331h(int i7, int i8, int i9, int i10) {
        int min;
        int i11;
        int i12 = 262142;
        int min2 = Math.min(i9, 262142);
        int i13 = Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i10, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i11 = min2;
        } else {
            i11 = min;
        }
        if (i11 >= 8191) {
            if (i11 < 32767) {
                i12 = 65534;
            } else if (i11 < 65535) {
                i12 = 32766;
            } else if (i11 < 262143) {
                i12 = 8190;
            } else {
                AbstractC3092b.m4775l(i11);
                throw new RuntimeException();
            }
        }
        if (i8 != Integer.MAX_VALUE) {
            i13 = Math.min(i12, i8);
        }
        return AbstractC3092b.m4764a(Math.min(i12, i7), i13, min2, min);
    }

    /* renamed from: i */
    public static long m3332i(int i7, int i8, int i9, int i10) {
        int min;
        int i11;
        int i12 = 262142;
        int min2 = Math.min(i7, 262142);
        int i13 = Integer.MAX_VALUE;
        if (i8 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i8, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i11 = min2;
        } else {
            i11 = min;
        }
        if (i11 >= 8191) {
            if (i11 < 32767) {
                i12 = 65534;
            } else if (i11 < 65535) {
                i12 = 32766;
            } else if (i11 < 262143) {
                i12 = 8190;
            } else {
                AbstractC3092b.m4775l(i11);
                throw new RuntimeException();
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            i13 = Math.min(i12, i10);
        }
        return AbstractC3092b.m4764a(min2, min, Math.min(i12, i9), i13);
    }

    /* renamed from: j */
    public static final InterfaceC3782f m3333j(View view) {
        InterfaceC3782f interfaceC3782f;
        AbstractC3367j.m5100e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof InterfaceC3782f) {
                interfaceC3782f = (InterfaceC3782f) tag;
            } else {
                interfaceC3782f = null;
            }
            if (interfaceC3782f != null) {
                return interfaceC3782f;
            }
            Object m3335m = m3335m(view);
            if (m3335m instanceof View) {
                view = (View) m3335m;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static C1781g m3334l(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C1781g(AbstractC1655r.m2700a(view));
        }
        return null;
    }

    /* renamed from: m */
    public static final ViewParent m3335m(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* renamed from: n */
    public static int m3336n(int[] iArr, int i7, boolean z7) {
        boolean z8;
        int[] iArr2 = iArr;
        int i8 = 0;
        for (int i9 : iArr2) {
            i8 += i9;
        }
        int length = iArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (i10 < i13) {
                int i14 = 1 << i10;
                i12 |= i14;
                int i15 = 1;
                while (i15 < iArr2[i10]) {
                    int i16 = i8 - i15;
                    int i17 = length - i10;
                    int i18 = i17 - 2;
                    int m3329e = m3329e(i16 - 1, i18);
                    if (z7 && i12 == 0) {
                        int i19 = i17 - 1;
                        if (i16 - i19 >= i19) {
                            m3329e -= m3329e(i16 - i17, i18);
                        }
                    }
                    boolean z9 = true;
                    if (i17 - 1 > 1) {
                        int i20 = i16 - i18;
                        int i21 = 0;
                        while (i20 > i7) {
                            i21 += m3329e((i16 - i20) - 1, i17 - 3);
                            i20--;
                            z9 = z9;
                        }
                        z8 = z9;
                        m3329e -= (i13 - i10) * i21;
                    } else {
                        z8 = true;
                        if (i16 > i7) {
                            m3329e--;
                        }
                    }
                    i11 += m3329e;
                    i15++;
                    i12 &= ~i14;
                    iArr2 = iArr;
                }
                i8 -= i15;
                i10++;
                iArr2 = iArr;
            } else {
                return i11;
            }
        }
    }

    /* renamed from: o */
    public static final int m3337o(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    /* renamed from: p */
    public static final boolean m3338p(String str) {
        AbstractC3367j.m5100e(str, "method");
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b6  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3339q(ViewStructure viewStructure, C3502g0 c3502g0, AutofillId autofillId, String str, C0685a c0685a) {
        int i7;
        long j6;
        long j7;
        long j8;
        char c7;
        EnumC1533a enumC1533a;
        C0474g c0474g;
        C1587g c1587g;
        C3835d c3835d;
        boolean z7;
        InterfaceC3844m interfaceC3844m;
        Boolean bool;
        boolean z8;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        int i8;
        Integer num3;
        String[] m3288m;
        boolean z9;
        boolean z10;
        boolean z11;
        AutofillValue forText;
        String m5680A;
        String[] m3288m2;
        boolean z12;
        String[] m3288m3;
        C2194h0 c2194h0;
        long[] jArr;
        Object[] objArr;
        Integer num4;
        long[] jArr2;
        Object[] objArr2;
        C2194h0 c2194h02;
        EnumC1533a enumC1533a2;
        C0474g c0474g2;
        C1587g c1587g2;
        int i9;
        Integer num5 = 1;
        C0490w c0490w = AbstractC0487t.f1740a;
        C0490w c0490w2 = AbstractC0476i.f1657a;
        C0477j m5449w = c3502g0.m5449w();
        int i10 = 2;
        int i11 = 8;
        if (m5449w != null && (c2194h02 = m5449w.f1683e) != null) {
            j6 = 128;
            Object[] objArr3 = c2194h02.f12677b;
            Object[] objArr4 = c2194h02.f12678c;
            long[] jArr3 = c2194h02.f12676a;
            j7 = 255;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                c3835d = null;
                z7 = false;
                enumC1533a2 = null;
                interfaceC3844m = null;
                bool = null;
                c0474g2 = null;
                z8 = false;
                num = null;
                c1587g2 = null;
                j8 = -9187201950435737472L;
                while (true) {
                    long j9 = jArr3[i12];
                    i7 = i10;
                    c7 = 7;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j9 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr3[i15];
                                Object obj2 = objArr4[i15];
                                C0490w c0490w3 = (C0490w) obj;
                                i9 = i11;
                                if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1757r)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    c3835d = (C3835d) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1740a)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) AbstractC1805m.m3047k0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1756q)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    interfaceC3844m = (InterfaceC3844m) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1729E)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c1587g2 = (C1587g) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1750k)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1738N)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1734J)) {
                                    z8 = true;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1763x)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    c0474g2 = (C0474g) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1732H)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0487t.f1733I)) {
                                    AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    enumC1533a2 = (EnumC1533a) obj2;
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0476i.f1658b)) {
                                    viewStructure.setClickable(true);
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0476i.f1659c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0476i.f1678v)) {
                                    viewStructure.setFocusable(true);
                                } else if (AbstractC3367j.m5096a(c0490w3, AbstractC0476i.f1666j)) {
                                    z7 = true;
                                }
                            } else {
                                i9 = i11;
                            }
                            j9 >>= i9;
                            i14++;
                            i11 = i9;
                        }
                        if (i13 != i11) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    i10 = i7;
                    i11 = 8;
                }
            } else {
                i7 = 2;
                j8 = -9187201950435737472L;
                c7 = 7;
                c3835d = null;
                z7 = false;
                enumC1533a2 = null;
                interfaceC3844m = null;
                bool = null;
                c0474g2 = null;
                z8 = false;
                num = null;
                c1587g2 = null;
            }
            enumC1533a = enumC1533a2;
            c0474g = c0474g2;
            c1587g = c1587g2;
        } else {
            i7 = 2;
            j6 = 128;
            j7 = 255;
            j8 = -9187201950435737472L;
            c7 = 7;
            enumC1533a = null;
            c0474g = null;
            c1587g = null;
            c3835d = null;
            z7 = false;
            interfaceC3844m = null;
            bool = null;
            z8 = false;
            num = null;
        }
        C0477j m5449w2 = c3502g0.m5449w();
        if (m5449w2 != null && m5449w2.f1685g && !m5449w2.f1686h) {
            m5449w2 = m5449w2.m1033a();
            C2184c0 c2184c0 = new C2184c0(((C2702b) c3502g0.m5440n()).f14511e.f14519g);
            c2184c0.m3557b(c3502g0.m5440n());
            while (c2184c0.m3563h()) {
                C3502g0 c3502g02 = (C3502g0) c2184c0.m3565j(c2184c0.f12629b - 1);
                C0477j m5449w3 = c3502g02.m5449w();
                if (m5449w3 != null && !m5449w3.f1685g) {
                    m5449w2.m1035c(m5449w3);
                    if (!m5449w3.f1686h) {
                        c2184c0.m3557b(c3502g02.m5440n());
                    }
                }
            }
        }
        if (m5449w2 != null && (c2194h0 = m5449w2.f1683e) != null) {
            Object[] objArr5 = c2194h0.f12677b;
            Object[] objArr6 = c2194h0.f12678c;
            long[] jArr4 = c2194h0.f12676a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i16 = 0;
                list = null;
                while (true) {
                    long j10 = jArr4[i16];
                    if ((((~j10) << c7) & j10 & j8) != j8) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j10 & j7) < j6) {
                                int i19 = (i16 << 3) + i18;
                                Object obj3 = objArr5[i19];
                                num4 = num5;
                                Object obj4 = objArr6[i19];
                                jArr2 = jArr4;
                                C0490w c0490w4 = (C0490w) obj3;
                                objArr2 = objArr5;
                                if (AbstractC3367j.m5096a(c0490w4, AbstractC0487t.f1748i)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC3367j.m5096a(c0490w4, AbstractC0487t.f1725A)) {
                                    AbstractC3367j.m5098c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num4 = num5;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j10 >>= 8;
                            i18++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num5 = num4;
                        }
                        num2 = num5;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        num2 = num5;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i16 == length2) {
                        break;
                    }
                    i16++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num5 = num2;
                }
                valueOf = Integer.valueOf(c3502g0.f16885f);
                if (c3502g0.m5447u() == null) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    i8 = valueOf.intValue();
                } else {
                    i8 = -1;
                }
                viewStructure.setAutofillId(autofillId, i8);
                viewStructure.setId(i8, str, null, null);
                if (c3835d != null || z7) {
                    num3 = num2;
                } else if (enumC1533a == null) {
                    num3 = Integer.valueOf(i7);
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    viewStructure.setAutofillType(num3.intValue());
                }
                if (interfaceC3844m != null && (m3288m3 = AbstractC2067b.m3288m(interfaceC3844m)) != null) {
                    viewStructure.setAutofillHints(m3288m3);
                }
                c0685a.f2217a.m1103g(c3502g0.f16885f, new C1054ld(i7, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                int i20 = 4;
                if (enumC1533a != null) {
                    viewStructure.setCheckable(true);
                    if (enumC1533a == EnumC1533a.f10090e) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    viewStructure.setChecked(z12);
                } else if (bool != null && (c0474g == null || c0474g.f1652a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                InterfaceC3844m.f18059a.getClass();
                m3288m = AbstractC2067b.m3288m(C3843l.f18058b);
                AbstractC3367j.m5100e(m3288m, "<this>");
                if (m3288m.length != 0) {
                    String str2 = m3288m[0];
                    if (interfaceC3844m != null && (m3288m2 = AbstractC2067b.m3288m(interfaceC3844m)) != null) {
                        boolean m3012E = AbstractC1804l.m3012E(m3288m2, str2);
                        z9 = true;
                        if (m3012E) {
                            z10 = true;
                            if (z8 && !z10) {
                                z11 = false;
                            } else {
                                z11 = z9;
                            }
                            if (z11) {
                                viewStructure.setDataIsSensitive(true);
                            }
                            if (!c3502g0.f16872I.f16800d.m5341d1()) {
                                i20 = 0;
                            }
                            viewStructure.setVisibility(i20);
                            if (list != null) {
                                int size = list.size();
                                String str3 = "";
                                for (int i21 = 0; i21 < size; i21++) {
                                    C1587g c1587g3 = (C1587g) list.get(i21);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str3);
                                    str3 = AbstractC0094y0.m187n(sb, c1587g3.f10239f, '\n');
                                }
                                viewStructure.setText(str3);
                                viewStructure.setClassName("android.widget.TextView");
                            }
                            if (((C2702b) c3502g0.m5440n()).isEmpty() && c0474g != null && (m5680A = AbstractC3681h0.m5680A(c0474g.f1652a)) != null) {
                                viewStructure.setClassName(m5680A);
                            }
                            if (!z7) {
                                viewStructure.setClassName("android.widget.EditText");
                                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                    viewStructure.setMaxTextLength(num.intValue());
                                }
                                if (c1587g != null) {
                                    forText = AutofillValue.forText(c1587g.f10239f);
                                    viewStructure.setAutofillValue(forText);
                                }
                                if (z11) {
                                    viewStructure.setInputType(129);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        z9 = true;
                    }
                    z10 = false;
                    if (z8) {
                    }
                    z11 = z9;
                    if (z11) {
                    }
                    if (!c3502g0.f16872I.f16800d.m5341d1()) {
                    }
                    viewStructure.setVisibility(i20);
                    if (list != null) {
                    }
                    if (((C2702b) c3502g0.m5440n()).isEmpty()) {
                        viewStructure.setClassName(m5680A);
                    }
                    if (!z7) {
                    }
                } else {
                    throw new NoSuchElementException("Array is empty.");
                }
            }
        }
        num2 = num5;
        list = null;
        valueOf = Integer.valueOf(c3502g0.f16885f);
        if (c3502g0.m5447u() == null) {
        }
        if (valueOf == null) {
        }
        viewStructure.setAutofillId(autofillId, i8);
        viewStructure.setId(i8, str, null, null);
        if (c3835d != null) {
            if (enumC1533a == null) {
            }
            if (num3 != null) {
            }
            if (interfaceC3844m != null) {
                viewStructure.setAutofillHints(m3288m3);
            }
            c0685a.f2217a.m1103g(c3502g0.f16885f, new C1054ld(i7, viewStructure));
            if (bool != null) {
            }
            int i202 = 4;
            if (enumC1533a != null) {
            }
            InterfaceC3844m.f18059a.getClass();
            m3288m = AbstractC2067b.m3288m(C3843l.f18058b);
            AbstractC3367j.m5100e(m3288m, "<this>");
            if (m3288m.length != 0) {
            }
        }
        num3 = num2;
        if (num3 != null) {
        }
        if (interfaceC3844m != null) {
        }
        c0685a.f2217a.m1103g(c3502g0.f16885f, new C1054ld(i7, viewStructure));
        if (bool != null) {
        }
        int i2022 = 4;
        if (enumC1533a != null) {
        }
        InterfaceC3844m.f18059a.getClass();
        m3288m = AbstractC2067b.m3288m(C3843l.f18058b);
        AbstractC3367j.m5100e(m3288m, "<this>");
        if (m3288m.length != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [i5.g, n3.b] */
    /* renamed from: r */
    public static C2717b m3340r(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    int i9 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j6 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i9) {
                        break;
                    }
                    i8++;
                } else {
                    j6 = -1;
                    break;
                }
            }
            if (j6 != -1) {
                duplicate.position(duplicate.position() + ((int) (j6 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j7 = duplicate.getInt() & 4294967295L;
                for (int i10 = 0; i10 < j7; i10++) {
                    int i11 = duplicate.getInt();
                    long j8 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i11 || 1701669481 == i11) {
                        duplicate.position((int) (j8 + j6));
                        ?? abstractC2083g = new AbstractC2083g();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        abstractC2083g.f12319h = duplicate;
                        abstractC2083g.f12316e = position;
                        int i12 = position - duplicate.getInt(position);
                        abstractC2083g.f12317f = i12;
                        abstractC2083g.f12318g = ((ByteBuffer) abstractC2083g.f12319h).getShort(i12);
                        return abstractC2083g;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2069b m3341s(C2069b c2069b, int i7, int i8, C2075h c2075h) {
        int i9 = i8;
        C2075h c2075h2 = c2075h;
        if (i7 > 0 && i9 > 0) {
            C2069b c2069b2 = new C2069b(i7, i9);
            int i10 = i7 * 2;
            float[] fArr = new float[i10];
            int i11 = 0;
            while (i11 < i9) {
                float f7 = i11 + 0.5f;
                for (int i12 = 0; i12 < i10; i12 += 2) {
                    fArr[i12] = (i12 / 2) + 0.5f;
                    fArr[i12 + 1] = f7;
                }
                float f8 = c2075h2.f12285a;
                float f9 = c2075h2.f12286b;
                float f10 = c2075h2.f12287c;
                float f11 = c2075h2.f12288d;
                float f12 = c2075h2.f12289e;
                float f13 = c2075h2.f12290f;
                float f14 = c2075h2.f12291g;
                float f15 = c2075h2.f12292h;
                float f16 = c2075h2.f12293i;
                int i13 = i10 - 1;
                for (int i14 = 0; i14 < i13; i14 += 2) {
                    float f17 = fArr[i14];
                    int i15 = i14 + 1;
                    float f18 = fArr[i15];
                    float f19 = (f13 * f18) + (f10 * f17) + f16;
                    fArr[i14] = (((f11 * f18) + (f8 * f17)) + f14) / f19;
                    fArr[i15] = (((f18 * f12) + (f17 * f9)) + f15) / f19;
                }
                int i16 = c2069b.f12258e;
                int i17 = c2069b.f12259f;
                boolean z7 = true;
                for (int i18 = 0; i18 < i13 && z7; i18 += 2) {
                    int i19 = (int) fArr[i18];
                    int i20 = i18 + 1;
                    int i21 = (int) fArr[i20];
                    if (i19 >= -1 && i19 <= i16 && i21 >= -1 && i21 <= i17) {
                        if (i19 == -1) {
                            fArr[i18] = 0.0f;
                        } else if (i19 == i16) {
                            fArr[i18] = i16 - 1;
                        } else {
                            z7 = false;
                            if (i21 != -1) {
                                fArr[i20] = 0.0f;
                            } else if (i21 == i17) {
                                fArr[i20] = i17 - 1;
                            }
                            z7 = true;
                        }
                        z7 = true;
                        if (i21 != -1) {
                        }
                        z7 = true;
                    } else {
                        throw C0400j.m878a();
                    }
                }
                boolean z8 = true;
                for (int i22 = i10 - 2; i22 >= 0 && z8; i22 -= 2) {
                    int i23 = (int) fArr[i22];
                    int i24 = i22 + 1;
                    int i25 = (int) fArr[i24];
                    if (i23 >= -1 && i23 <= i16 && i25 >= -1 && i25 <= i17) {
                        if (i23 == -1) {
                            fArr[i22] = 0.0f;
                        } else if (i23 == i16) {
                            fArr[i22] = i16 - 1;
                        } else {
                            z8 = false;
                            if (i25 != -1) {
                                fArr[i24] = 0.0f;
                            } else if (i25 == i17) {
                                fArr[i24] = i17 - 1;
                            }
                            z8 = true;
                        }
                        z8 = true;
                        if (i25 != -1) {
                        }
                        z8 = true;
                    } else {
                        throw C0400j.m878a();
                    }
                }
                for (int i26 = 0; i26 < i10; i26 += 2) {
                    try {
                        if (c2069b.m3313b((int) fArr[i26], (int) fArr[i26 + 1])) {
                            c2069b2.m3319h(i26 / 2, i11);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw C0400j.m878a();
                    }
                }
                i11++;
                i9 = i8;
                c2075h2 = c2075h;
            }
            return c2069b2;
        }
        throw C0400j.m878a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [u5.s, java.lang.Object] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3342t(InterfaceC2914i1 interfaceC2914i1, float f7, AbstractC2583c abstractC2583c) {
        C2952v0 c2952v0;
        int i7;
        C3376s c3376s;
        if (abstractC2583c instanceof C2952v0) {
            C2952v0 c2952v02 = (C2952v0) abstractC2583c;
            int i8 = c2952v02.f15309j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2952v02.f15309j = i8 - Integer.MIN_VALUE;
                c2952v0 = c2952v02;
                Object obj = c2952v0.f15308i;
                i7 = c2952v0.f15309j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c3376s = c2952v0.f15307h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? obj2 = new Object();
                    InterfaceC3281e c2955w0 = new C2955w0(obj2, f7, null);
                    c2952v0.f15307h = obj2;
                    c2952v0.f15309j = 1;
                    Object mo112a = interfaceC2914i1.mo112a(EnumC2788y0.f14796e, c2955w0, c2952v0);
                    Object obj3 = EnumC2465a.f13750e;
                    if (mo112a == obj3) {
                        return obj3;
                    }
                    c3376s = obj2;
                }
                return new Float(c3376s.f16448e);
            }
        }
        c2952v0 = new AbstractC2583c(abstractC2583c);
        Object obj4 = c2952v0.f15308i;
        i7 = c2952v0.f15309j;
        if (i7 == 0) {
        }
        return new Float(c3376s.f16448e);
    }

    /* renamed from: u */
    public static final InterfaceC3810r m3343u(InterfaceC3810r interfaceC3810r, InterfaceC2914i1 interfaceC2914i1, EnumC2931o0 enumC2931o0, boolean z7, InterfaceC2925m0 interfaceC2925m0, C3081j c3081j, C3628k c3628k, C2395p c2395p, int i7) {
        InterfaceC2739f1 interfaceC2739f1;
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3810r interfaceC3810r3;
        InterfaceC2914i1 interfaceC2914i12;
        EnumC2931o0 enumC2931o02;
        InterfaceC2925m0 interfaceC2925m02;
        C3081j c3081j2;
        boolean z8;
        boolean z9;
        if ((i7 & 64) != 0) {
            c3628k = null;
        }
        C3628k c3628k2 = c3628k;
        Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
        C2733d1 c2733d1 = (C2733d1) c2395p.m3878k(AbstractC2736e1.f14648a);
        if (c2733d1 != null) {
            c2395p.m3857Z(1586021609);
            boolean m3870g = c2395p.m3870g(context) | c2395p.m3870g(c2733d1);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C2740g(context, c2733d1);
                c2395p.m3877j0(m3847O);
            }
            interfaceC2739f1 = (C2740g) m3847O;
            c2395p.m3888r(false);
        } else {
            c2395p.m3857Z(1586120933);
            c2395p.m3888r(false);
            interfaceC2739f1 = C2730c1.f14619f;
        }
        InterfaceC2739f1 interfaceC2739f12 = interfaceC2739f1;
        EnumC2931o0 enumC2931o03 = EnumC2931o0.f15240e;
        if (enumC2931o0 == enumC2931o03) {
            interfaceC3810r2 = AbstractC2781v.f14774c;
        } else {
            interfaceC3810r2 = AbstractC2781v.f14773b;
        }
        InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(interfaceC3810r2).mo5829e(interfaceC2739f12.mo4393d());
        if (((EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n)) == EnumC3103m.f15704f && enumC2931o0 != enumC2931o03) {
            interfaceC3810r3 = mo5829e;
            interfaceC2914i12 = interfaceC2914i1;
            z9 = z7;
            interfaceC2925m02 = interfaceC2925m0;
            c3081j2 = c3081j;
            z8 = false;
            enumC2931o02 = enumC2931o0;
        } else {
            interfaceC3810r3 = mo5829e;
            interfaceC2914i12 = interfaceC2914i1;
            enumC2931o02 = enumC2931o0;
            interfaceC2925m02 = interfaceC2925m0;
            c3081j2 = c3081j;
            z8 = true;
            z9 = z7;
        }
        return AbstractC0152a.m328b(interfaceC3810r3, interfaceC2914i12, enumC2931o02, interfaceC2739f12, z9, z8, interfaceC2925m02, c3081j2, c3628k2);
    }

    /* renamed from: v */
    public static final void m3344v(C2530j0 c2530j0, int i7, Object obj) {
        c2530j0.f13893e[(c2530j0.f13894f - c2530j0.f13889a[c2530j0.f13890b - 1].f1361c) + i7] = obj;
    }

    /* renamed from: w */
    public static final void m3345w(C2530j0 c2530j0, int i7, Object obj, int i8, Object obj2) {
        int i9 = c2530j0.f13894f - c2530j0.f13889a[c2530j0.f13890b - 1].f1361c;
        Object[] objArr = c2530j0.f13893e;
        objArr[i7 + i9] = obj;
        objArr[i9 + i8] = obj2;
    }

    /* renamed from: x */
    public static final Object m3346x(C2103p c2103p, C2103p c2103p2, InterfaceC3281e interfaceC3281e) {
        Object c0569s;
        Object m1187Y;
        try {
            AbstractC3382y.m5111b(2, interfaceC3281e);
            c0569s = interfaceC3281e.mo22d(c2103p2, c2103p);
        } catch (Throwable th) {
            c0569s = new C0569s(th, false);
        }
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (c0569s != enumC2465a && (m1187Y = c2103p.m1187Y(c0569s)) != AbstractC0525d0.f1859e) {
            if (!(m1187Y instanceof C0569s)) {
                return AbstractC0525d0.m1147y(m1187Y);
            }
            throw ((C0569s) m1187Y).f1923a;
        }
        return enumC2465a;
    }

    /* renamed from: y */
    public static final long m3347y(long j6) {
        return (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [w0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* renamed from: z */
    public static final ArrayList m3348z(C2429z1 c2429z1, int i7, Integer num) {
        ?? c3651h = new C3651h(c2429z1);
        int m4004q = c2429z1.m4004q(i7);
        C2335a m3988a = c2429z1.m3988a(i7);
        while (i7 >= 0) {
            c3651h.m5616b(c2429z1.f13637a.m3723f(i7), num);
            if (m4004q >= 0) {
                C2335a c2335a = m3988a;
                m3988a = c2429z1.m3988a(m4004q);
                i7 = m4004q;
                m4004q = c2429z1.m4004q(m4004q);
                num = c2335a;
            } else {
                i7 = m4004q;
                num = m3988a;
            }
        }
        return c3651h.f17428a;
    }

    /* renamed from: f */
    public abstract boolean mo3349f(C3352h c3352h);

    /* renamed from: k */
    public abstract Object mo3350k(C3352h c3352h);
}
