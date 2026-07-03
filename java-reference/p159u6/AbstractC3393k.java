package p159u6;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.ExtractedText;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import p001a0.AbstractC0094y0;
import p001a0.C0019e1;
import p001a0.C0043k1;
import p001a0.C0051m1;
import p001a0.C0078t0;
import p001a0.InterfaceC0071r1;
import p003a4.AbstractC0104a;
import p015b6.C0306m;
import p019c1.C0370n;
import p019c1.C0373q;
import p024c6.AbstractC0444k;
import p027d1.C0464b;
import p031d5.C0512l;
import p034e0.C0622o0;
import p034e0.C0625q;
import p034e0.C0627r;
import p034e0.C0633u;
import p034e0.C0635v;
import p034e0.C0637w;
import p035e1.C0671o0;
import p035e1.C0677s;
import p039e5.C0811dk;
import p050g2.C1602n0;
import p053g5.C1687f;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p065i2.AbstractC2064e;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2272i;
import p079k1.C2274k;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2280q;
import p079k1.C2281r;
import p079k1.C2284u;
import p087l2.C2459w;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2647h;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p122q.AbstractC2963z;
import p140s2.C3100j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p170w1.InterfaceC3679g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.k */
/* loaded from: classes.dex */
public abstract class AbstractC3393k {

    /* renamed from: a */
    public static long f16474a;

    /* renamed from: b */
    public static Method f16475b;

    /* renamed from: c */
    public static C2266e f16476c;

    /* renamed from: d */
    public static C2266e f16477d;

    /* renamed from: e */
    public static C2266e f16478e;

    /* renamed from: f */
    public static C2266e f16479f;

    /* renamed from: g */
    public static C2266e f16480g;

    /* renamed from: h */
    public static C2266e f16481h;

    /* renamed from: i */
    public static C2266e f16482i;

    /* renamed from: j */
    public static C2266e f16483j;

    /* renamed from: k */
    public static C2266e f16484k;

    /* renamed from: l */
    public static C2266e f16485l;

    /* renamed from: m */
    public static C2266e f16486m;

    /* renamed from: n */
    public static C2266e f16487n;

    /* renamed from: o */
    public static C2266e f16488o;

    /* renamed from: p */
    public static C2266e f16489p;

    /* renamed from: q */
    public static C2266e f16490q;

    /* renamed from: r */
    public static C2266e f16491r;

    /* renamed from: A */
    public static final String m5128A(float f7) {
        if (Float.isNaN(f7)) {
            return "NaN";
        }
        if (Float.isInfinite(f7)) {
            if (f7 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f8 = f7 * pow;
        int i7 = (int) f8;
        if (f8 - i7 >= 0.5f) {
            i7++;
        }
        float f9 = i7 / pow;
        if (max > 0) {
            return String.valueOf(f9);
        }
        return String.valueOf((int) f9);
    }

    /* renamed from: B */
    public static final double m5129B(long j6) {
        return ((j6 >>> 11) * 2048) + (j6 & 2047);
    }

    /* renamed from: a */
    public static final int m5130a(float[] fArr) {
        int i7;
        int i8 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        if (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i8 = 1;
        }
        return (i7 << 1) | i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5131b(C2855g0 c2855g0, AbstractC2581a abstractC2581a) {
        C0633u c0633u;
        int i7;
        Object obj;
        int size;
        int i8;
        if (abstractC2581a instanceof C0633u) {
            C0633u c0633u2 = (C0633u) abstractC2581a;
            int i9 = c0633u2.f2097j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0633u2.f2097j = i9 - Integer.MIN_VALUE;
                c0633u = c0633u2;
                Object obj2 = c0633u.f2096i;
                i7 = c0633u.f2097j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C2855g0 c2855g02 = c0633u.f2095h;
                        AbstractC1793a0.m2972L(obj2);
                        c2855g0 = c2855g02;
                        C2859j c2859j = (C2859j) obj2;
                        ?? r12 = c2859j.f14991a;
                        size = r12.size();
                        i8 = 0;
                        while (i8 < size) {
                            if (!AbstractC2866q.m4542a((C2868s) r12.get(i8))) {
                                c0633u.f2095h = c2855g0;
                                c0633u.f2097j = 1;
                                obj2 = c2855g0.m4514a(EnumC2860k.f14996f, c0633u);
                                obj = EnumC2465a.f13750e;
                                c2855g0 = c2855g0;
                                if (obj2 == obj) {
                                    return obj;
                                }
                                C2859j c2859j2 = (C2859j) obj2;
                                ?? r122 = c2859j2.f14991a;
                                size = r122.size();
                                i8 = 0;
                                while (i8 < size) {
                                }
                            } else {
                                i8++;
                            }
                        }
                        return c2859j2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj2);
                c0633u.f2095h = c2855g0;
                c0633u.f2097j = 1;
                obj2 = c2855g0.m4514a(EnumC2860k.f14996f, c0633u);
                obj = EnumC2465a.f13750e;
                c2855g0 = c2855g0;
                if (obj2 == obj) {
                }
                C2859j c2859j22 = (C2859j) obj2;
                ?? r1222 = c2859j22.f14991a;
                size = r1222.size();
                i8 = 0;
                while (i8 < size) {
                }
                return c2859j22;
            }
        }
        c0633u = new AbstractC2583c(abstractC2581a);
        Object obj22 = c0633u.f2096i;
        i7 = c0633u.f2097j;
        if (i7 == 0) {
        }
    }

    /* renamed from: c */
    public static final boolean m5132c(long j6) {
        return !C3100j.m4783a(j6, 9223372034707292159L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5133d(C2855g0 c2855g0, C0019e1 c0019e1, C0512l c0512l, C2859j c2859j, AbstractC2581a abstractC2581a) {
        C0635v c0635v;
        int i7;
        int i8;
        C0625q c0625q;
        C0622o0 c0622o0;
        C0019e1 c0019e12;
        C0019e1 c0019e13;
        C0043k1 c0043k1;
        float mo5294d;
        if (abstractC2581a instanceof C0635v) {
            C0635v c0635v2 = (C0635v) abstractC2581a;
            int i9 = c0635v2.f2102k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0635v2.f2102k = i9 - Integer.MIN_VALUE;
                c0635v = c0635v2;
                Object obj = c0635v.f2101j;
                i7 = c0635v.f2102k;
                int i10 = 0;
                int i11 = 1;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            c0019e13 = c0635v.f2100i;
                            c2855g0 = c0635v.f2099h;
                            AbstractC1793a0.m2972L(obj);
                            if (((Boolean) obj).booleanValue()) {
                                ?? r11 = c2855g0.f14969j.f14986x.f14991a;
                                int size = r11.size();
                                while (i10 < size) {
                                    C2868s c2868s = (C2868s) r11.get(i10);
                                    if (AbstractC2866q.m4543b(c2868s)) {
                                        c2868s.m4550a();
                                    }
                                    i10++;
                                }
                            }
                            c0019e13.getClass();
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0019e1 c0019e14 = c0635v.f2100i;
                    C2855g0 c2855g02 = c0635v.f2099h;
                    AbstractC1793a0.m2972L(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ?? r12 = c2855g02.f14969j.f14986x.f14991a;
                        int size2 = r12.size();
                        while (i10 < size2) {
                            C2868s c2868s2 = (C2868s) r12.get(i10);
                            if (AbstractC2866q.m4543b(c2868s2)) {
                                c2868s2.m4550a();
                            }
                            i10++;
                        }
                    }
                    c0019e14.getClass();
                    return C1694m.f10482a;
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC3679g2 interfaceC3679g2 = (InterfaceC3679g2) c0512l.f1836c;
                C2868s c2868s3 = (C2868s) c0512l.f1837d;
                C2868s c2868s4 = (C2868s) c2859j.f14991a.get(0);
                if (c2868s3 != null && c2868s4.f15007b - c2868s3.f15007b < interfaceC3679g2.mo5292b()) {
                    int i12 = c2868s3.f15014i;
                    float f7 = AbstractC2963z.f15361a;
                    if (i12 == 2) {
                        mo5294d = interfaceC3679g2.mo5294d() * AbstractC2963z.f15361a;
                    } else {
                        mo5294d = interfaceC3679g2.mo5294d();
                    }
                    if (C0464b.m1007c(C0464b.m1010f(c2868s3.f15008c, c2868s4.f15008c)) < mo5294d) {
                        c0512l.f1835b++;
                        c0512l.f1837d = c2868s4;
                        C2868s c2868s5 = (C2868s) c2859j.f14991a.get(0);
                        i8 = c0512l.f1835b;
                        if (i8 == 1) {
                            if (i8 != 2) {
                                c0625q = C0627r.f2076f;
                            } else {
                                c0625q = C0627r.f2075e;
                            }
                        } else {
                            c0625q = C0627r.f2074d;
                        }
                        C0625q c0625q2 = c0625q;
                        long j6 = c2868s5.f15008c;
                        c0622o0 = (C0622o0) c0019e1.f109e;
                        int i13 = 3;
                        if (c0622o0.m1285h() || c0622o0.m1287j().f13723a.f10239f.length() == 0 || (c0043k1 = c0622o0.f2047d) == null || c0043k1.m120d() == null) {
                            c0019e12 = c0019e1;
                            i11 = 0;
                        } else {
                            C0373q c0373q = c0622o0.f2052i;
                            if (c0373q != null) {
                                c0373q.m843a(new C0370n(i11, i13));
                            }
                            c0622o0.f2055l = j6;
                            c0622o0.f2060q = -1;
                            c0622o0.m1283f(true);
                            c0019e12 = c0019e1;
                            c0019e12.m51w(c0622o0.m1287j(), c0622o0.f2055l, true, c0625q2);
                        }
                        if (i11 != 0) {
                            long j7 = c2868s5.f15006a;
                            C0078t0 c0078t0 = new C0078t0(i13, c0019e12, c0625q2);
                            c0635v.f2099h = c2855g0;
                            c0635v.f2100i = c0019e12;
                            c0635v.f2102k = 2;
                            obj = AbstractC2963z.m4605c(c2855g0, j7, c0078t0, c0635v);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (obj == enumC2465a) {
                                return enumC2465a;
                            }
                            c0019e13 = c0019e12;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            c0019e13.getClass();
                        }
                        return C1694m.f10482a;
                    }
                }
                c0512l.f1835b = 1;
                c0512l.f1837d = c2868s4;
                C2868s c2868s52 = (C2868s) c2859j.f14991a.get(0);
                i8 = c0512l.f1835b;
                if (i8 == 1) {
                }
                C0625q c0625q22 = c0625q;
                long j62 = c2868s52.f15008c;
                c0622o0 = (C0622o0) c0019e1.f109e;
                int i132 = 3;
                if (c0622o0.m1285h()) {
                }
                c0019e12 = c0019e1;
                i11 = 0;
                if (i11 != 0) {
                }
                return C1694m.f10482a;
            }
        }
        c0635v = new AbstractC2583c(abstractC2581a);
        Object obj2 = c0635v.f2101j;
        i7 = c0635v.f2102k;
        int i102 = 0;
        int i112 = 1;
        if (i7 == 0) {
        }
    }

    /* renamed from: e */
    public static final ExtractedText m5134e(C2459w c2459w) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2459w.f13723a.f10239f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j6 = c2459w.f13724b;
        extractedText.selectionStart = C1602n0.m2589e(j6);
        extractedText.selectionEnd = C1602n0.m2588d(j6);
        extractedText.flags = !AbstractC0444k.m929S(c2459w.f13723a.f10239f, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r14 == r5) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ad, B:15:0x00b5, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d3, B:28:0x00d7, B:32:0x0041, B:34:0x0064, B:36:0x0068, B:38:0x0074, B:39:0x0080, B:43:0x0093, B:47:0x007c, B:49:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5135f(C2855g0 c2855g0, InterfaceC0071r1 interfaceC0071r1, C2859j c2859j, AbstractC2581a abstractC2581a) {
        C0637w c0637w;
        int i7;
        C2868s c2868s;
        C2868s c2868s2;
        float mo5294d;
        boolean z7;
        try {
            if (abstractC2581a instanceof C0637w) {
                C0637w c0637w2 = (C0637w) abstractC2581a;
                int i8 = c0637w2.f2109l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0637w2.f2109l = i8 - Integer.MIN_VALUE;
                    c0637w = c0637w2;
                    Object obj = c0637w.f2108k;
                    i7 = c0637w.f2109l;
                    int i9 = 1;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (i7 == 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                interfaceC0071r1 = c0637w.f2106i;
                                c2855g0 = c0637w.f2105h;
                                AbstractC1793a0.m2972L(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    ?? r11 = c2855g0.f14969j.f14986x.f14991a;
                                    int size = r11.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        C2868s c2868s3 = (C2868s) r11.get(i10);
                                        if (AbstractC2866q.m4543b(c2868s3)) {
                                            c2868s3.m4550a();
                                        }
                                    }
                                    interfaceC0071r1.mo161a();
                                } else {
                                    interfaceC0071r1.onCancel();
                                }
                                return C1694m.f10482a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2868s c2868s4 = c0637w.f2107j;
                        interfaceC0071r1 = c0637w.f2106i;
                        C2855g0 c2855g02 = c0637w.f2105h;
                        AbstractC1793a0.m2972L(obj);
                        c2868s = c2868s4;
                        c2855g0 = c2855g02;
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        c2868s = (C2868s) AbstractC1805m.m3045i0(c2859j.f14991a);
                        long j6 = c2868s.f15006a;
                        c0637w.f2105h = c2855g0;
                        c0637w.f2106i = interfaceC0071r1;
                        c0637w.f2107j = c2868s;
                        c0637w.f2109l = 1;
                        obj = AbstractC2963z.m4604b(c2855g0, j6, c0637w);
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    c2868s2 = (C2868s) obj;
                    if (c2868s2 != null) {
                        long j7 = c2868s2.f15008c;
                        InterfaceC3679g2 m4517f = c2855g0.m4517f();
                        int i11 = c2868s.f15014i;
                        float f7 = AbstractC2963z.f15361a;
                        if (i11 == 2) {
                            mo5294d = m4517f.mo5294d() * AbstractC2963z.f15361a;
                        } else {
                            mo5294d = m4517f.mo5294d();
                        }
                        if (C0464b.m1007c(C0464b.m1010f(c2868s.f15008c, j7)) < mo5294d) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            interfaceC0071r1.mo163c(j7);
                            long j8 = c2868s2.f15006a;
                            C0051m1 c0051m1 = new C0051m1(interfaceC0071r1, i9);
                            c0637w.f2105h = c2855g0;
                            c0637w.f2106i = interfaceC0071r1;
                            c0637w.f2107j = null;
                            c0637w.f2109l = 2;
                            obj = AbstractC2963z.m4605c(c2855g0, j8, c0051m1, c0637w);
                        }
                    }
                    return C1694m.f10482a;
                }
            }
            if (i7 == 0) {
            }
            c2868s2 = (C2868s) obj;
            if (c2868s2 != null) {
            }
            return C1694m.f10482a;
        } catch (CancellationException e7) {
            interfaceC0071r1.onCancel();
            throw e7;
        }
        c0637w = new AbstractC2583c(abstractC2581a);
        Object obj2 = c0637w.f2108k;
        i7 = c0637w.f2109l;
        int i92 = 1;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
    }

    /* renamed from: g */
    public static void m5136g(StringBuilder sb, Object obj, InterfaceC3279c interfaceC3279c) {
        boolean z7;
        if (interfaceC3279c != null) {
            sb.append((CharSequence) interfaceC3279c.mo23f(obj));
            return;
        }
        if (obj == null) {
            z7 = true;
        } else {
            z7 = obj instanceof CharSequence;
        }
        if (z7) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* renamed from: h */
    public static void m5137h(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* renamed from: i */
    public static final Bundle m5138i(C1687f... c1687fArr) {
        Bundle bundle = new Bundle(c1687fArr.length);
        for (C1687f c1687f : c1687fArr) {
            String str = (String) c1687f.f10471e;
            Object obj = c1687f.f10472f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC3367j.m5097b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    /* renamed from: j */
    public static void m5139j(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: k */
    public static final void m5140k(int i7, int i8) {
        if (i7 <= i8) {
        } else {
            throw new IndexOutOfBoundsException(AbstractC0094y0.m183j(i7, i8, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* renamed from: l */
    public static final C2266e m5141l() {
        C2266e c2266e = f16477d;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Add", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(19.0f, 13.0f);
        c0811dk.m1509j(-6.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(-6.0f);
        c0811dk.m1508i(5.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1516q(5.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16477d = m3673b;
        return m3673b;
    }

    /* renamed from: m */
    public static final C2266e m5142m() {
        C2266e c2266e = f16478e;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ArrowUpward", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(4.0f, 12.0f);
        c0811dk.m1511l(1.41f, 1.41f);
        c0811dk.m1510k(11.0f, 7.83f);
        c0811dk.m1516q(20.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1516q(7.83f);
        c0811dk.m1511l(5.58f, 5.59f);
        c0811dk.m1510k(20.0f, 12.0f);
        c0811dk.m1511l(-8.0f, -8.0f);
        c0811dk.m1511l(-8.0f, 8.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16478e = m3673b;
        return m3673b;
    }

    /* renamed from: n */
    public static final C2266e m5143n() {
        C2266e c2266e = f16482i;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ExpandMore", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(16.59f, 8.59f));
        arrayList.add(new C2275l(12.0f, 13.17f));
        arrayList.add(new C2275l(7.41f, 8.59f));
        arrayList.add(new C2275l(6.0f, 10.0f));
        arrayList.add(new C2281r(6.0f, 6.0f));
        arrayList.add(new C2281r(6.0f, -6.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16482i = m3673b;
        return m3673b;
    }

    /* renamed from: o */
    public static final C2266e m5144o() {
        C2266e c2266e = f16476c;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("AutoMirrored.Filled.KeyboardArrowLeft", true);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(15.41f, 16.59f));
        arrayList.add(new C2275l(10.83f, 12.0f));
        arrayList.add(new C2281r(4.58f, -4.59f));
        arrayList.add(new C2275l(14.0f, 6.0f));
        arrayList.add(new C2281r(-6.0f, 6.0f));
        arrayList.add(new C2281r(6.0f, 6.0f));
        arrayList.add(new C2281r(1.41f, -1.41f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16476c = m3673b;
        return m3673b;
    }

    /* renamed from: p */
    public static final C2266e m5145p() {
        C2266e c2266e = f16484k;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Link", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(3.9f, 12.0f);
        m179f.m1507h(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        m179f.m1509j(4.0f);
        m179f.m1510k(11.0f, 7.0f);
        m179f.m1510k(7.0f, 7.0f);
        m179f.m1507h(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        m179f.m1514o(2.24f, 5.0f, 5.0f, 5.0f);
        m179f.m1509j(4.0f);
        m179f.m1517r(-1.9f);
        m179f.m1510k(7.0f, 15.1f);
        m179f.m1507h(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        m179f.m1505f();
        m179f.m1512m(8.0f, 13.0f);
        m179f.m1509j(8.0f);
        m179f.m1517r(-2.0f);
        m179f.m1510k(8.0f, 11.0f);
        m179f.m1517r(2.0f);
        m179f.m1505f();
        m179f.m1512m(17.0f, 7.0f);
        m179f.m1509j(-4.0f);
        m179f.m1517r(1.9f);
        m179f.m1509j(4.0f);
        m179f.m1507h(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        m179f.m1514o(-1.39f, 3.1f, -3.1f, 3.1f);
        m179f.m1509j(-4.0f);
        m179f.m1510k(13.0f, 17.0f);
        m179f.m1509j(4.0f);
        m179f.m1507h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        m179f.m1514o(-2.24f, -5.0f, -5.0f, -5.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16484k = m3673b;
        return m3673b;
    }

    /* renamed from: q */
    public static final C2266e m5146q() {
        C2266e c2266e = f16486m;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.OpenInNew", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(19.0f, 19.0f);
        c0811dk.m1508i(5.0f);
        c0811dk.m1516q(5.0f);
        c0811dk.m1509j(7.0f);
        c0811dk.m1516q(3.0f);
        c0811dk.m1508i(5.0f);
        c0811dk.m1507h(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1507h(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        c0811dk.m1509j(14.0f);
        c0811dk.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0811dk.m1517r(-7.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(7.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(14.0f, 3.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(3.59f);
        c0811dk.m1511l(-9.83f, 9.83f);
        c0811dk.m1511l(1.41f, 1.41f);
        c0811dk.m1510k(19.0f, 6.41f);
        c0811dk.m1516q(10.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1516q(3.0f);
        c0811dk.m1509j(-7.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16486m = m3673b;
        return m3673b;
    }

    /* renamed from: r */
    public static final C2266e m5147r() {
        C2266e c2266e = f16487n;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.PlayArrow", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(8.0f, 5.0f));
        arrayList.add(new C2284u(14.0f));
        arrayList.add(new C2281r(11.0f, -7.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16487n = m3673b;
        return m3673b;
    }

    /* renamed from: s */
    public static final C2266e m5148s() {
        C2266e c2266e = f16488o;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Refresh", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(17.65f, 6.35f);
        m179f.m1506g(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        m179f.m1507h(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        m179f.m1514o(3.57f, 8.0f, 7.99f, 8.0f);
        m179f.m1507h(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        m179f.m1509j(-2.08f);
        m179f.m1507h(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        m179f.m1507h(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        m179f.m1514o(2.69f, -6.0f, 6.0f, -6.0f);
        m179f.m1507h(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        m179f.m1510k(13.0f, 11.0f);
        m179f.m1509j(7.0f);
        m179f.m1516q(4.0f);
        m179f.m1511l(-2.35f, 2.35f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16488o = m3673b;
        return m3673b;
    }

    /* renamed from: t */
    public static final C2266e m5149t() {
        C2266e c2266e = f16489p;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Settings", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(19.14f, 12.94f);
        m179f.m1507h(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        m179f.m1507h(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        m179f.m1511l(2.03f, -1.58f);
        m179f.m1507h(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        m179f.m1511l(-1.92f, -3.32f);
        m179f.m1507h(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        m179f.m1511l(-2.39f, 0.96f);
        m179f.m1507h(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        m179f.m1510k(14.4f, 2.81f);
        m179f.m1507h(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        m179f.m1509j(-3.84f);
        m179f.m1507h(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        m179f.m1510k(9.25f, 5.35f);
        m179f.m1506g(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        m179f.m1510k(5.24f, 5.33f);
        m179f.m1507h(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        m179f.m1510k(2.74f, 8.87f);
        m179f.m1506g(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        m179f.m1511l(2.03f, 1.58f);
        m179f.m1506g(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        m179f.m1514o(0.02f, 0.64f, 0.07f, 0.94f);
        m179f.m1511l(-2.03f, 1.58f);
        m179f.m1507h(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        m179f.m1511l(1.92f, 3.32f);
        m179f.m1507h(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        m179f.m1511l(2.39f, -0.96f);
        m179f.m1507h(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        m179f.m1511l(0.36f, 2.54f);
        m179f.m1507h(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        m179f.m1509j(3.84f);
        m179f.m1507h(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        m179f.m1511l(0.36f, -2.54f);
        m179f.m1507h(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        m179f.m1511l(2.39f, 0.96f);
        m179f.m1507h(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        m179f.m1511l(1.92f, -3.32f);
        m179f.m1507h(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        m179f.m1510k(19.14f, 12.94f);
        m179f.m1505f();
        m179f.m1512m(12.0f, 15.6f);
        m179f.m1507h(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        m179f.m1514o(1.62f, -3.6f, 3.6f, -3.6f);
        m179f.m1514o(3.6f, 1.62f, 3.6f, 3.6f);
        m179f.m1513n(13.98f, 15.6f, 12.0f, 15.6f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16489p = m3673b;
        return m3673b;
    }

    /* renamed from: u */
    public static final C2266e m5150u() {
        C2266e c2266e = f16490q;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Stop", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(6.0f, 6.0f));
        arrayList.add(new C2280q(12.0f));
        arrayList.add(new C2284u(12.0f));
        arrayList.add(new C2274k(6.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16490q = m3673b;
        return m3673b;
    }

    /* renamed from: v */
    public static final C2266e m5151v() {
        C2266e c2266e = f16491r;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Wifi", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(1.0f, 9.0f);
        c0811dk.m1511l(2.0f, 2.0f);
        c0811dk.m1507h(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
        c0811dk.m1511l(2.0f, -2.0f);
        c0811dk.m1506g(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(9.0f, 17.0f);
        c0811dk.m1511l(3.0f, 3.0f);
        c0811dk.m1511l(3.0f, -3.0f);
        c0811dk.m1507h(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(5.0f, 13.0f);
        c0811dk.m1511l(2.0f, 2.0f);
        c0811dk.m1507h(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
        c0811dk.m1511l(2.0f, -2.0f);
        c0811dk.m1506g(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f16491r = m3673b;
        return m3673b;
    }

    /* renamed from: w */
    public static int m5152w(int i7) {
        if (i7 != 1) {
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return 4;
                }
                if (i7 != 32) {
                    if (i7 != 64) {
                        if (i7 != 128) {
                            if (i7 == 256) {
                                return 8;
                            }
                            if (i7 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(AbstractC2647h.m4256b("type needs to be >= FIRST and <= LAST, type=", i7));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    /* renamed from: x */
    public static boolean m5153x() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0104a.m206a();
        }
        try {
            if (f16475b == null) {
                f16474a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f16475b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f16475b.invoke(null, Long.valueOf(f16474a))).booleanValue();
        } catch (Exception e7) {
            if (e7 instanceof InvocationTargetException) {
                Throwable cause = e7.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: y */
    public static final boolean m5154y(C2859j c2859j) {
        ?? r52 = c2859j.f14991a;
        int size = r52.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C2868s) r52.get(i7)).f15014i != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k5.c, b6.m] */
    /* renamed from: z */
    public static C0306m m5155z(InterfaceC3281e interfaceC3281e) {
        ?? obj = new Object();
        obj.f1101g = AbstractC2064e.m3242p(obj, obj, interfaceC3281e);
        return obj;
    }
}
