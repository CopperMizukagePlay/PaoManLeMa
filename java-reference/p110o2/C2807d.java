package p110o2;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import p001a0.C0031h1;
import p001a0.C0068q2;
import p006a7.C0129l;
import p024c6.AbstractC0444k;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p037e3.C0687a;
import p039e5.C1369vi;
import p049g1.AbstractC1571e;
import p050g2.AbstractC1589h;
import p050g2.C1583e;
import p050g2.C1588g0;
import p050g2.C1604o0;
import p050g2.C1613v;
import p050g2.C1615x;
import p050g2.C1617z;
import p050g2.InterfaceC1577b;
import p050g2.InterfaceC1612u;
import p053g5.C1687f;
import p058h2.C1766c;
import p058h2.C1769f;
import p060h5.AbstractC1807o;
import p068i5.AbstractC2080d;
import p073j2.C2164a;
import p073j2.C2165b;
import p073j2.C2169f;
import p073j2.C2170g;
import p073j2.C2171h;
import p073j2.C2172i;
import p073j2.C2174k;
import p073j2.C2175l;
import p080k2.AbstractC2305p;
import p080k2.C2294e;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.C2307r;
import p080k2.InterfaceC2293d;
import p085l0.InterfaceC2390n2;
import p096m3.C2560j;
import p096m3.C2574x;
import p096m3.C2576z;
import p100n.C2673p1;
import p103n2.AbstractC2715c;
import p103n2.C2713a;
import p103n2.C2714b;
import p125q2.C2984a;
import p125q2.C2985b;
import p132r2.C3027a;
import p132r2.C3035i;
import p132r2.C3038l;
import p132r2.C3042p;
import p132r2.C3043q;
import p132r2.C3045s;
import p132r2.InterfaceC3041o;
import p140s2.C3105o;
import p140s2.C3106p;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o2.d */
/* loaded from: classes.dex */
public final class C2807d implements InterfaceC1612u {

    /* renamed from: a */
    public final String f14832a;

    /* renamed from: b */
    public final C1604o0 f14833b;

    /* renamed from: c */
    public final List f14834c;

    /* renamed from: d */
    public final List f14835d;

    /* renamed from: e */
    public final InterfaceC2293d f14836e;

    /* renamed from: f */
    public final InterfaceC3093c f14837f;

    /* renamed from: g */
    public final C2809f f14838g;

    /* renamed from: h */
    public final CharSequence f14839h;

    /* renamed from: i */
    public final C1769f f14840i;

    /* renamed from: j */
    public C0031h1 f14841j;

    /* renamed from: k */
    public final boolean f14842k;

    /* renamed from: l */
    public final int f14843l;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x04e4, code lost:
    
        if ((r2.f10310b.f10341c & 1095216660480L) != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0099, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x09af A[LOOP:8: B:342:0x09ad->B:343:0x09af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o2.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.TextPaint, o2.f, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v69, types: [m3.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2807d(String str, C1604o0 c1604o0, List list, List list2, InterfaceC2293d interfaceC2293d, InterfaceC3093c interfaceC3093c) {
        Locale locale;
        int i7;
        C2806c c2806c;
        C3045s c3045s;
        int flags;
        int i8;
        C1588g0 c1588g0;
        int size;
        int i9;
        Object obj;
        boolean z7;
        String str2;
        C2714b c2714b;
        C3042p c3042p;
        long j6;
        long m4795b;
        AbstractC2305p abstractC2305p;
        boolean z8;
        C2806c c2806c2;
        C2307r m3678b;
        Typeface typeface;
        long j7;
        C3027a c3027a;
        boolean z9;
        long j8;
        boolean z10;
        boolean z11;
        C1588g0 c1588g02;
        ?? r32;
        ?? r7;
        C1604o0 c1604o02;
        List list3;
        boolean z12;
        float f7;
        String str3;
        CharSequence charSequence;
        Spannable spannableString;
        C1617z c1617z;
        long j9;
        long j10;
        float m3381I;
        int i10;
        C3043q c3043q;
        Spannable spannable;
        ArrayList arrayList;
        int size2;
        int i11;
        C1588g0 c1588g03;
        ArrayList arrayList2;
        int i12;
        int[] iArr;
        int size3;
        int i13;
        boolean z13;
        C3043q c3043q2;
        int size4;
        int i14;
        int i15;
        int i16;
        InterfaceC3093c interfaceC3093c2;
        Object c2169f;
        int i17;
        int i18;
        boolean z14;
        InterfaceC3093c interfaceC3093c3;
        int i19;
        int i20;
        float m4796c;
        float m4796c2;
        C1615x c1615x;
        int i21;
        C2576z c2576z;
        int i22;
        C2574x[] c2574xArr;
        C1583e c1583e;
        C2714b c2714b2;
        ?? obj2 = new Object();
        obj2.f14832a = str;
        obj2.f14833b = c1604o0;
        obj2.f14834c = list;
        obj2.f14835d = list2;
        obj2.f14836e = interfaceC2293d;
        obj2.f14837f = interfaceC3093c;
        float mo559b = interfaceC3093c.mo559b();
        ?? textPaint = new TextPaint(1);
        ((TextPaint) textPaint).density = mo559b;
        textPaint.f14847b = C3038l.f15604b;
        textPaint.f14848c = 3;
        textPaint.f14849d = C0665l0.f2176d;
        obj2.f14838g = textPaint;
        C1617z c1617z2 = c1604o0.f10311c;
        C2673p1 c2673p1 = C2813j.f14859a;
        C2673p1 c2673p12 = C2813j.f14859a;
        InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) c2673p12.f14390f;
        if (interfaceC2390n2 == null) {
            if (C2560j.m4082d()) {
                interfaceC2390n2 = c2673p12.m4285q();
                c2673p12.f14390f = interfaceC2390n2;
            } else {
                interfaceC2390n2 = AbstractC2814k.f14860a;
            }
        }
        obj2.f14842k = ((Boolean) interfaceC2390n2.getValue()).booleanValue();
        int i23 = c1604o0.f10310b.f10340b;
        C2714b c2714b3 = c1604o0.f10309a.f10252k;
        if (i23 != 4) {
            if (i23 != 5) {
                if (i23 == 1) {
                    i7 = 0;
                } else if (i23 == 2) {
                    i7 = 1;
                } else if (i23 == 3 || i23 == Integer.MIN_VALUE) {
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c2714b3 == null || (locale = ((C2713a) c2714b3.f14563e.get(0)).f14561a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                } else {
                    throw new IllegalStateException("Invalid TextDirection.");
                }
                obj2.f14843l = i7;
                c2806c = new C2806c(obj2);
                c3045s = c1604o0.f10310b.f10347i;
                c3045s = c3045s == null ? C3045s.f15617c : c3045s;
                if (c3045s.f15620b) {
                    flags = textPaint.getFlags() | 128;
                } else {
                    flags = textPaint.getFlags() & (-129);
                }
                textPaint.setFlags(flags);
                i8 = c3045s.f15619a;
                if (i8 == 1) {
                    textPaint.setFlags(textPaint.getFlags() | 64);
                    textPaint.setHinting(0);
                } else if (i8 == 2) {
                    textPaint.getFlags();
                    textPaint.setHinting(1);
                } else if (i8 == 3) {
                    textPaint.getFlags();
                    textPaint.setHinting(0);
                } else {
                    textPaint.getFlags();
                }
                c1588g0 = c1604o0.f10309a;
                size = list.size();
                i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i9);
                    if (((C1583e) obj).f10229a instanceof C1588g0) {
                        break;
                    } else {
                        i9++;
                    }
                }
                z7 = obj != null;
                long j11 = c1588g0.f10243b;
                str2 = c1588g0.f10248g;
                c2714b = c1588g0.f10252k;
                InterfaceC3041o interfaceC3041o = c1588g0.f10242a;
                c3042p = c1588g0.f10251j;
                j6 = c1588g0.f10249h;
                m4795b = C3105o.m4795b(j11);
                if (C3106p.m4798a(m4795b, 4294967296L)) {
                    textPaint.setTextSize(interfaceC3093c.mo4518f0(j11));
                } else if (C3106p.m4798a(m4795b, 8589934592L)) {
                    textPaint.setTextSize(C3105o.m4796c(j11) * textPaint.getTextSize());
                }
                abstractC2305p = c1588g0.f10247f;
                if (abstractC2305p != null && c1588g0.f10245d == null && c1588g0.f10244c == null) {
                    c2806c2 = c2806c;
                    z8 = z7;
                } else {
                    C2300k c2300k = c1588g0.f10244c;
                    c2300k = c2300k == null ? C2300k.f13233h : c2300k;
                    C2298i c2298i = c1588g0.f10245d;
                    int i24 = c2298i != null ? c2298i.f13229a : 0;
                    C2299j c2299j = c1588g0.f10246e;
                    int i25 = c2299j != null ? c2299j.f13230a : 65535;
                    C2807d c2807d = c2806c.f14831e;
                    z8 = z7;
                    c2806c2 = c2806c;
                    m3678b = ((C2294e) c2807d.f14836e).m3678b(abstractC2305p, c2300k, i24, i25);
                    if (!(m3678b instanceof C2307r)) {
                        C0031h1 c0031h1 = new C0031h1(m3678b, c2807d.f14841j);
                        c2807d.f14841j = c0031h1;
                        Object obj3 = c0031h1.f154h;
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    } else {
                        Object obj4 = m3678b.f13250e;
                        AbstractC3367j.m5098c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj4;
                    }
                    textPaint.setTypeface(typeface);
                }
                if (c2714b != null) {
                    C2714b c2714b4 = C2714b.f14562g;
                    C0031h1 c0031h12 = AbstractC2715c.f14565a;
                    c0031h12.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((C0129l) c0031h12.f154h)) {
                        try {
                            c2714b2 = (C2714b) c0031h12.f153g;
                            if (c2714b2 == null || localeList != ((LocaleList) c0031h12.f152f)) {
                                int size5 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size5);
                                int i26 = 0;
                                while (i26 < size5) {
                                    arrayList3.add(new C2713a(localeList.get(i26)));
                                    i26++;
                                    size5 = size5;
                                }
                                c2714b2 = new C2714b(arrayList3);
                                c0031h12.f152f = localeList;
                                c0031h12.f153g = c2714b2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!c2714b.equals(c2714b2)) {
                        ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(c2714b));
                        Iterator it = c2714b.f14563e.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((C2713a) it.next()).f14561a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    textPaint.setFontFeatureSettings(str2);
                }
                if (c3042p != null && !c3042p.equals(C3042p.f15610c)) {
                    textPaint.setTextScaleX(textPaint.getTextScaleX() * c3042p.f15611a);
                    textPaint.setTextSkewX(textPaint.getTextSkewX() + c3042p.f15612b);
                }
                textPaint.m4438d(interfaceC3041o.mo4717b());
                textPaint.m4437c(interfaceC3041o.mo4718c(), 9205357640488583168L, interfaceC3041o.mo4716a());
                textPaint.m4440f(c1588g0.f10255n);
                textPaint.m4441g(c1588g0.f10254m);
                textPaint.m4439e(c1588g0.f10257p);
                if (!C3106p.m4798a(C3105o.m4795b(j6), 4294967296L) && C3105o.m4796c(j6) != 0.0f) {
                    float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
                    float mo4518f0 = interfaceC3093c.mo4518f0(j6);
                    if (textScaleX != 0.0f) {
                        textPaint.setLetterSpacing(mo4518f0 / textScaleX);
                    }
                } else if (C3106p.m4798a(C3105o.m4795b(j6), 8589934592L)) {
                    textPaint.setLetterSpacing(C3105o.m4796c(j6));
                }
                j7 = c1588g0.f10253l;
                c3027a = c1588g0.f10250i;
                z9 = (z8 || !C3106p.m4798a(C3105o.m4795b(j6), 4294967296L) || C3105o.m4796c(j6) == 0.0f) ? false : true;
                j8 = C0677s.f2209g;
                z10 = C0677s.m1454c(j7, j8) && !C0677s.m1454c(j7, C0677s.f2208f);
                z11 = c3027a == null && Float.compare(c3027a.f15585a, 0.0f) != 0;
                if (!z9 || z10 || z11) {
                    c1588g02 = new C1588g0(0L, 0L, (C2300k) null, (C2298i) null, (C2299j) null, (AbstractC2305p) null, (String) null, z9 ? j6 : C3105o.f15708c, z11 ? c3027a : null, (C3042p) null, (C2714b) null, z10 ? j7 : j8, (C3038l) null, (C0665l0) null, 63103);
                } else {
                    c1588g02 = null;
                }
                if (c1588g02 != null) {
                    int size6 = obj2.f14834c.size() + 1;
                    r32 = new ArrayList(size6);
                    for (int i27 = 0; i27 < size6; i27++) {
                        if (i27 == 0) {
                            c1583e = new C1583e(0, obj2.f14832a.length(), c1588g02);
                        } else {
                            c1583e = (C1583e) obj2.f14834c.get(i27 - 1);
                        }
                        r32.add(c1583e);
                    }
                } else {
                    r32 = obj2.f14834c;
                }
                r7 = obj2.f14832a;
                float textSize = obj2.f14838g.getTextSize();
                c1604o02 = obj2.f14833b;
                list3 = obj2.f14835d;
                InterfaceC3093c interfaceC3093c4 = obj2.f14837f;
                z12 = obj2.f14842k;
                C2804a c2804a = AbstractC2805b.f14830a;
                if (z12 || !C2560j.m4082d()) {
                    f7 = 0.0f;
                    str3 = r7;
                    charSequence = str3;
                } else {
                    C1617z c1617z3 = c1604o02.f10311c;
                    if (c1617z3 != null) {
                        C1615x c1615x2 = c1617z3.f10354b;
                    }
                    C2560j m4081a = C2560j.m4081a();
                    int length = r7.length();
                    if (!(m4081a.m4084c() == 1)) {
                        throw new IllegalStateException("Not initialized yet");
                    }
                    if (length < 0) {
                        throw new IllegalArgumentException("end cannot be negative");
                    }
                    if (length >= 0) {
                        if (r7.length() >= 0) {
                            if (length <= r7.length()) {
                                if (r7.length() == 0 || length == 0) {
                                    f7 = 0.0f;
                                    str3 = r7;
                                } else {
                                    C0031h1 c0031h13 = m4081a.f13932e.f13922b;
                                    c0031h13.getClass();
                                    if (r7 instanceof Spannable) {
                                        i21 = 0;
                                        c2576z = new C2576z((Spannable) r7);
                                    } else if (!(r7 instanceof Spanned) || ((Spanned) r7).nextSpanTransition(-1, length + 1, C2574x.class) > length) {
                                        i21 = 0;
                                        c2576z = null;
                                    } else {
                                        ?? obj5 = new Object();
                                        i21 = 0;
                                        obj5.f13979e = false;
                                        obj5.f13980f = new SpannableString(r7);
                                        c2576z = obj5;
                                    }
                                    if (c2576z == null || (c2574xArr = (C2574x[]) c2576z.f13980f.getSpans(i21, length, C2574x.class)) == null || c2574xArr.length <= 0) {
                                        f7 = 0.0f;
                                        str3 = r7;
                                        i22 = 0;
                                    } else {
                                        int length2 = c2574xArr.length;
                                        f7 = 0.0f;
                                        int i28 = 0;
                                        int i29 = 0;
                                        String str4 = r7;
                                        while (i29 < length2) {
                                            C2574x c2574x = c2574xArr[i29];
                                            String str5 = str4;
                                            int spanStart = c2576z.f13980f.getSpanStart(c2574x);
                                            C2574x[] c2574xArr2 = c2574xArr;
                                            int spanEnd = c2576z.f13980f.getSpanEnd(c2574x);
                                            if (spanStart != length) {
                                                c2576z.removeSpan(c2574x);
                                            }
                                            i28 = Math.min(spanStart, i28);
                                            length = Math.max(spanEnd, length);
                                            i29++;
                                            c2574xArr = c2574xArr2;
                                            str4 = str5;
                                        }
                                        str3 = str4;
                                        i22 = i28;
                                    }
                                    if (i22 != length && i22 < str3.length()) {
                                        C2576z c2576z2 = (C2576z) c0031h13.m79C(str3, i22, length, Integer.MAX_VALUE, false, new C0068q2(17, c2576z, (C0129l) c0031h13.f152f));
                                        if (c2576z2 != null) {
                                            charSequence = c2576z2.f13980f;
                                            AbstractC3367j.m5097b(charSequence);
                                        }
                                    }
                                }
                                charSequence = str3;
                                AbstractC3367j.m5097b(charSequence);
                            } else {
                                throw new IllegalArgumentException("end should be < than charSequence length");
                            }
                        } else {
                            throw new IllegalArgumentException("start should be < than charSequence length");
                        }
                    } else {
                        throw new IllegalArgumentException("start should be <= than end");
                    }
                }
                C2807d c2807d2 = (r32.isEmpty() && list3.isEmpty() && AbstractC3367j.m5096a(c1604o02.f10310b.f10342d, C3043q.f15613c)) ? obj2 : c2807d2;
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                if (AbstractC3367j.m5096a(c1604o02.f10309a.f10254m, C3038l.f15605c)) {
                    spannableString.setSpan(AbstractC2805b.f14830a, 0, str3.length(), 33);
                }
                c1617z = c1604o02.f10311c;
                if ((c1617z != null || (c1615x = c1617z.f10354b) == null) ? false : c1615x.f10351a) {
                    C1613v c1613v = c1604o02.f10310b;
                    if (c1613v.f10344f == null) {
                        j9 = 0;
                        float m3381I2 = AbstractC2080d.m3381I(c1613v.f10341c, textSize, interfaceC3093c4);
                        if (!Float.isNaN(m3381I2)) {
                            spannableString.setSpan(new C2171h(m3381I2), 0, spannableString.length(), 33);
                        }
                        j10 = 1095216660480L;
                        i10 = 0;
                        c3043q = c1604o02.f10310b.f10342d;
                        if (c3043q != null) {
                            long j12 = c3043q.f15614a;
                            long j13 = c3043q.f15615b;
                            spannable = spannableString;
                            if ((!C3105o.m4794a(j12, AbstractC2080d.m3405r(i10)) || !C3105o.m4794a(j13, AbstractC2080d.m3405r(i10))) && (j12 & j10) != j9 && (j13 & j10) != j9) {
                                long m4795b2 = C3105o.m4795b(j12);
                                if (C3106p.m4798a(m4795b2, 4294967296L)) {
                                    m4796c = interfaceC3093c4.mo4518f0(j12);
                                } else {
                                    m4796c = C3106p.m4798a(m4795b2, 8589934592L) ? C3105o.m4796c(j12) * textSize : f7;
                                }
                                long m4795b3 = C3105o.m4795b(j13);
                                if (C3106p.m4798a(m4795b3, 4294967296L)) {
                                    m4796c2 = interfaceC3093c4.mo4518f0(j13);
                                } else {
                                    m4796c2 = C3106p.m4798a(m4795b3, 8589934592L) ? C3105o.m4796c(j13) * textSize : f7;
                                }
                                spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(m4796c), (int) Math.ceil(m4796c2)), 0, spannable.length(), 33);
                            }
                        } else {
                            spannable = spannableString;
                        }
                        arrayList = new ArrayList(r32.size());
                        size2 = r32.size();
                        for (i11 = 0; i11 < size2; i11++) {
                            C1583e c1583e2 = (C1583e) r32.get(i11);
                            Object obj6 = c1583e2.f10229a;
                            if (obj6 instanceof C1588g0) {
                                C1588g0 c1588g04 = (C1588g0) obj6;
                                if (((c1588g04.f10247f == null && c1588g04.f10245d == null && c1588g04.f10244c == null) ? false : true) || ((C1588g0) obj6).f10246e != null) {
                                    arrayList.add(c1583e2);
                                }
                            }
                        }
                        C1588g0 c1588g05 = c1604o02.f10309a;
                        AbstractC2305p abstractC2305p2 = c1588g05.f10247f;
                        C1588g0 c1588g06 = ((abstractC2305p2 == null || c1588g05.f10245d != null || c1588g05.f10244c != null) && c1588g05.f10246e == null) ? null : new C1588g0(0L, 0L, c1588g05.f10244c, c1588g05.f10245d, c1588g05.f10246e, abstractC2305p2, (String) null, 0L, (C3027a) null, (C3042p) null, (C2714b) null, 0L, (C3038l) null, (C0665l0) null, 65475);
                        C1369vi c1369vi = new C1369vi(1, spannable, c2806c2);
                        if (arrayList.size() <= 1) {
                            if (!arrayList.isEmpty()) {
                                C1588g0 c1588g07 = (C1588g0) ((C1583e) arrayList.get(0)).f10229a;
                                c1369vi.mo24c(c1588g06 != null ? c1588g06.m2568c(c1588g07) : c1588g07, Integer.valueOf(((C1583e) arrayList.get(0)).f10230b), Integer.valueOf(((C1583e) arrayList.get(0)).f10231c));
                            }
                        } else {
                            int size7 = arrayList.size();
                            int i30 = size7 * 2;
                            int[] iArr2 = new int[i30];
                            int size8 = arrayList.size();
                            for (int i31 = 0; i31 < size8; i31++) {
                                C1583e c1583e3 = (C1583e) arrayList.get(i31);
                                iArr2[i31] = c1583e3.f10230b;
                                iArr2[i31 + size7] = c1583e3.f10231c;
                            }
                            if (i30 > 1) {
                                Arrays.sort(iArr2);
                            }
                            if (i30 != 0) {
                                int i32 = iArr2[0];
                                int i33 = 0;
                                while (i33 < i30) {
                                    int i34 = iArr2[i33];
                                    if (i34 == i32) {
                                        arrayList2 = arrayList;
                                        c1588g03 = c1588g06;
                                        i12 = i30;
                                        iArr = iArr2;
                                    } else {
                                        int size9 = arrayList.size();
                                        c1588g03 = c1588g06;
                                        int i35 = 0;
                                        while (i35 < size9) {
                                            ArrayList arrayList5 = arrayList;
                                            C1583e c1583e4 = (C1583e) arrayList.get(i35);
                                            int i36 = i30;
                                            int i37 = c1583e4.f10230b;
                                            int[] iArr3 = iArr2;
                                            int i38 = c1583e4.f10231c;
                                            if (i37 != i38 && AbstractC1589h.m2570b(i32, i34, i37, i38)) {
                                                C1588g0 c1588g08 = (C1588g0) c1583e4.f10229a;
                                                c1588g06 = c1588g06 != null ? c1588g06.m2568c(c1588g08) : c1588g08;
                                            }
                                            i35++;
                                            i30 = i36;
                                            arrayList = arrayList5;
                                            iArr2 = iArr3;
                                        }
                                        arrayList2 = arrayList;
                                        i12 = i30;
                                        iArr = iArr2;
                                        if (c1588g06 != null) {
                                            c1369vi.mo24c(c1588g06, Integer.valueOf(i32), Integer.valueOf(i34));
                                        }
                                        i32 = i34;
                                    }
                                    i33++;
                                    c1588g06 = c1588g03;
                                    i30 = i12;
                                    arrayList = arrayList2;
                                    iArr2 = iArr;
                                }
                            } else {
                                throw new NoSuchElementException("Array is empty.");
                            }
                        }
                        size3 = r32.size();
                        i13 = 0;
                        z13 = false;
                        while (i13 < size3) {
                            C1583e c1583e5 = (C1583e) r32.get(i13);
                            Object obj7 = c1583e5.f10229a;
                            if (obj7 instanceof C1588g0) {
                                int i39 = c1583e5.f10230b;
                                int i40 = c1583e5.f10231c;
                                if (i39 >= 0 && i39 < spannable.length() && i40 > i39 && i40 <= spannable.length()) {
                                    C1588g0 c1588g09 = (C1588g0) obj7;
                                    C3027a c3027a2 = c1588g09.f10250i;
                                    InterfaceC3041o interfaceC3041o2 = c1588g09.f10242a;
                                    if (c3027a2 != null) {
                                        spannable.setSpan(new C2164a(c3027a2.f15585a, 0), i39, i40, 33);
                                    }
                                    i17 = size3;
                                    i18 = i13;
                                    AbstractC2080d.m3383K(spannable, interfaceC3041o2.mo4717b(), i39, i40);
                                    AbstractC0670o mo4718c = interfaceC3041o2.mo4718c();
                                    float mo4716a = interfaceC3041o2.mo4716a();
                                    if (mo4718c != null) {
                                        if (mo4718c instanceof C0671o0) {
                                            AbstractC2080d.m3383K(spannable, ((C0671o0) mo4718c).f2197a, i39, i40);
                                        } else {
                                            spannable.setSpan(new C2985b((AbstractC0663k0) mo4718c, mo4716a), i39, i40, 33);
                                        }
                                    }
                                    C3038l c3038l = c1588g09.f10254m;
                                    if (c3038l != null) {
                                        int i41 = c3038l.f15607a;
                                        C2175l c2175l = new C2175l((i41 | 1) == i41, (i41 | 2) == i41);
                                        i19 = 33;
                                        spannable.setSpan(c2175l, i39, i40, 33);
                                    } else {
                                        i19 = 33;
                                    }
                                    InterfaceC3093c interfaceC3093c5 = interfaceC3093c4;
                                    AbstractC2080d.m3384L(spannable, c1588g09.f10243b, interfaceC3093c5, i39, i40);
                                    String str6 = c1588g09.f10248g;
                                    if (str6 != null) {
                                        spannable.setSpan(new C2165b(0, str6), i39, i40, i19);
                                    }
                                    C3042p c3042p2 = c1588g09.f10251j;
                                    if (c3042p2 != null) {
                                        spannable.setSpan(new ScaleXSpan(c3042p2.f15611a), i39, i40, i19);
                                        spannable.setSpan(new C2164a(c3042p2.f15612b, 1), i39, i40, i19);
                                    }
                                    AbstractC2080d.m3385M(spannable, c1588g09.f10252k, i39, i40);
                                    long j14 = c1588g09.f10253l;
                                    if (j14 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(AbstractC0659i0.m1426z(j14)), i39, i40, 33);
                                    }
                                    C0665l0 c0665l0 = c1588g09.f10255n;
                                    if (c0665l0 != null) {
                                        long j15 = c0665l0.f2178b;
                                        interfaceC3093c3 = interfaceC3093c5;
                                        int m1426z = AbstractC0659i0.m1426z(c0665l0.f2177a);
                                        z14 = z13;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j15 & 4294967295L));
                                        float f8 = c0665l0.f2179c;
                                        C2174k c2174k = new C2174k(intBitsToFloat, intBitsToFloat2, f8 == f7 ? Float.MIN_VALUE : f8, m1426z);
                                        i20 = 33;
                                        spannable.setSpan(c2174k, i39, i40, 33);
                                    } else {
                                        z14 = z13;
                                        interfaceC3093c3 = interfaceC3093c5;
                                        i20 = 33;
                                    }
                                    AbstractC1571e abstractC1571e = c1588g09.f10257p;
                                    if (abstractC1571e != null) {
                                        spannable.setSpan(new C2984a(abstractC1571e), i39, i40, i20);
                                    }
                                    if (C3106p.m4798a(C3105o.m4795b(c1588g09.f10249h), 4294967296L) || C3106p.m4798a(C3105o.m4795b(c1588g09.f10249h), 8589934592L)) {
                                        z13 = true;
                                        i13 = i18 + 1;
                                        size3 = i17;
                                        interfaceC3093c4 = interfaceC3093c3;
                                    }
                                    z13 = z14;
                                    i13 = i18 + 1;
                                    size3 = i17;
                                    interfaceC3093c4 = interfaceC3093c3;
                                }
                            }
                            i17 = size3;
                            i18 = i13;
                            z14 = z13;
                            interfaceC3093c3 = interfaceC3093c4;
                            z13 = z14;
                            i13 = i18 + 1;
                            size3 = i17;
                            interfaceC3093c4 = interfaceC3093c3;
                        }
                        InterfaceC3093c interfaceC3093c6 = interfaceC3093c4;
                        if (z13) {
                            int size10 = r32.size();
                            int i42 = 0;
                            while (i42 < size10) {
                                C1583e c1583e6 = (C1583e) r32.get(i42);
                                InterfaceC1577b interfaceC1577b = (InterfaceC1577b) c1583e6.f10229a;
                                if (interfaceC1577b instanceof C1588g0) {
                                    int i43 = c1583e6.f10230b;
                                    int i44 = c1583e6.f10231c;
                                    if (i43 >= 0 && i43 < spannable.length() && i44 > i43 && i44 <= spannable.length()) {
                                        long j16 = ((C1588g0) interfaceC1577b).f10249h;
                                        long m4795b4 = C3105o.m4795b(j16);
                                        i15 = size10;
                                        i16 = i42;
                                        if (C3106p.m4798a(m4795b4, 4294967296L)) {
                                            interfaceC3093c2 = interfaceC3093c6;
                                            c2169f = new C2170g(interfaceC3093c2.mo4518f0(j16));
                                        } else {
                                            interfaceC3093c2 = interfaceC3093c6;
                                            c2169f = C3106p.m4798a(m4795b4, 8589934592L) ? new C2169f(C3105o.m4796c(j16)) : null;
                                        }
                                        if (c2169f != null) {
                                            spannable.setSpan(c2169f, i43, i44, 33);
                                        }
                                        interfaceC3093c6 = interfaceC3093c2;
                                        i42 = i16 + 1;
                                        size10 = i15;
                                    }
                                }
                                i15 = size10;
                                i16 = i42;
                                interfaceC3093c2 = interfaceC3093c6;
                                interfaceC3093c6 = interfaceC3093c2;
                                i42 = i16 + 1;
                                size10 = i15;
                            }
                        }
                        InterfaceC3093c interfaceC3093c7 = interfaceC3093c6;
                        c3043q2 = c1604o02.f10310b.f10342d;
                        if (c3043q2 != null) {
                            long j17 = c3043q2.f15614a;
                            long m4795b5 = C3105o.m4795b(j17);
                            if (C3106p.m4798a(m4795b5, 4294967296L)) {
                                interfaceC3093c7.mo4518f0(j17);
                            } else if (C3106p.m4798a(m4795b5, 8589934592L)) {
                                C3105o.m4796c(j17);
                            }
                        }
                        size4 = r32.size();
                        for (i14 = 0; i14 < size4; i14++) {
                            Object obj8 = ((C1583e) r32.get(i14)).f10229a;
                        }
                        if (list3.size() > 0) {
                            C1583e c1583e7 = (C1583e) list3.get(0);
                            if (c1583e7.f10229a == null) {
                                for (Object obj9 : spannable.getSpans(c1583e7.f10230b, c1583e7.f10231c, C2574x.class)) {
                                    spannable.removeSpan((C2574x) obj9);
                                }
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        c2807d2 = this;
                        charSequence = spannable;
                        c2807d2.f14839h = charSequence;
                        c2807d2.f14840i = new C1769f(charSequence, c2807d2.f14838g, c2807d2.f14843l);
                        return;
                    }
                }
                j9 = 0;
                C1613v c1613v2 = c1604o02.f10310b;
                C3035i c3035i = c1613v2.f10344f;
                c3035i = c3035i == null ? C3035i.f15597c : c3035i;
                j10 = 1095216660480L;
                m3381I = AbstractC2080d.m3381I(c1613v2.f10341c, textSize, interfaceC3093c4);
                if (!Float.isNaN(m3381I)) {
                    int length3 = (spannableString.length() == 0 || AbstractC0444k.m938b0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i45 = c3035i.f15599b;
                    i10 = 0;
                    spannableString.setSpan(new C2172i(m3381I, length3, (i45 & 1) > 0, (i45 & 16) > 0, c3035i.f15598a, false), 0, spannableString.length(), 33);
                    c3043q = c1604o02.f10310b.f10342d;
                    if (c3043q != null) {
                    }
                    arrayList = new ArrayList(r32.size());
                    size2 = r32.size();
                    while (i11 < size2) {
                    }
                    C1588g0 c1588g052 = c1604o02.f10309a;
                    AbstractC2305p abstractC2305p22 = c1588g052.f10247f;
                    if (abstractC2305p22 == null || c1588g052.f10245d != null || c1588g052.f10244c != null) {
                    }
                    C1369vi c1369vi2 = new C1369vi(1, spannable, c2806c2);
                    if (arrayList.size() <= 1) {
                    }
                    size3 = r32.size();
                    i13 = 0;
                    z13 = false;
                    while (i13 < size3) {
                    }
                    InterfaceC3093c interfaceC3093c62 = interfaceC3093c4;
                    if (z13) {
                    }
                    InterfaceC3093c interfaceC3093c72 = interfaceC3093c62;
                    c3043q2 = c1604o02.f10310b.f10342d;
                    if (c3043q2 != null) {
                    }
                    size4 = r32.size();
                    while (i14 < size4) {
                    }
                    if (list3.size() > 0) {
                    }
                }
                i10 = 0;
                c3043q = c1604o02.f10310b.f10342d;
                if (c3043q != null) {
                }
                arrayList = new ArrayList(r32.size());
                size2 = r32.size();
                while (i11 < size2) {
                }
                C1588g0 c1588g0522 = c1604o02.f10309a;
                AbstractC2305p abstractC2305p222 = c1588g0522.f10247f;
                if (abstractC2305p222 == null || c1588g0522.f10245d != null || c1588g0522.f10244c != null) {
                }
                C1369vi c1369vi22 = new C1369vi(1, spannable, c2806c2);
                if (arrayList.size() <= 1) {
                }
                size3 = r32.size();
                i13 = 0;
                z13 = false;
                while (i13 < size3) {
                }
                InterfaceC3093c interfaceC3093c622 = interfaceC3093c4;
                if (z13) {
                }
                InterfaceC3093c interfaceC3093c722 = interfaceC3093c622;
                c3043q2 = c1604o02.f10310b.f10342d;
                if (c3043q2 != null) {
                }
                size4 = r32.size();
                while (i14 < size4) {
                }
                if (list3.size() > 0) {
                }
            }
            i7 = 3;
            obj2.f14843l = i7;
            c2806c = new C2806c(obj2);
            c3045s = c1604o0.f10310b.f10347i;
            if (c3045s == null) {
            }
            if (c3045s.f15620b) {
            }
            textPaint.setFlags(flags);
            i8 = c3045s.f15619a;
            if (i8 == 1) {
            }
            c1588g0 = c1604o0.f10309a;
            size = list.size();
            i9 = 0;
            while (true) {
                if (i9 >= size) {
                }
                i9++;
            }
            if (obj != null) {
            }
            long j112 = c1588g0.f10243b;
            str2 = c1588g0.f10248g;
            c2714b = c1588g0.f10252k;
            InterfaceC3041o interfaceC3041o3 = c1588g0.f10242a;
            c3042p = c1588g0.f10251j;
            j6 = c1588g0.f10249h;
            m4795b = C3105o.m4795b(j112);
            if (C3106p.m4798a(m4795b, 4294967296L)) {
            }
            abstractC2305p = c1588g0.f10247f;
            if (abstractC2305p != null) {
            }
            C2300k c2300k2 = c1588g0.f10244c;
            if (c2300k2 == null) {
            }
            C2298i c2298i2 = c1588g0.f10245d;
            if (c2298i2 != null) {
            }
            C2299j c2299j2 = c1588g0.f10246e;
            if (c2299j2 != null) {
            }
            C2807d c2807d3 = c2806c.f14831e;
            z8 = z7;
            c2806c2 = c2806c;
            m3678b = ((C2294e) c2807d3.f14836e).m3678b(abstractC2305p, c2300k2, i24, i25);
            if (!(m3678b instanceof C2307r)) {
            }
            textPaint.setTypeface(typeface);
            if (c2714b != null) {
            }
            if (str2 != null) {
                textPaint.setFontFeatureSettings(str2);
            }
            if (c3042p != null) {
                textPaint.setTextScaleX(textPaint.getTextScaleX() * c3042p.f15611a);
                textPaint.setTextSkewX(textPaint.getTextSkewX() + c3042p.f15612b);
            }
            textPaint.m4438d(interfaceC3041o3.mo4717b());
            textPaint.m4437c(interfaceC3041o3.mo4718c(), 9205357640488583168L, interfaceC3041o3.mo4716a());
            textPaint.m4440f(c1588g0.f10255n);
            textPaint.m4441g(c1588g0.f10254m);
            textPaint.m4439e(c1588g0.f10257p);
            if (!C3106p.m4798a(C3105o.m4795b(j6), 4294967296L)) {
            }
            if (C3106p.m4798a(C3105o.m4795b(j6), 8589934592L)) {
            }
            j7 = c1588g0.f10253l;
            c3027a = c1588g0.f10250i;
            if (z8) {
            }
            j8 = C0677s.f2209g;
            if (C0677s.m1454c(j7, j8)) {
            }
            if (c3027a == null) {
            }
            if (z9) {
            }
            c1588g02 = new C1588g0(0L, 0L, (C2300k) null, (C2298i) null, (C2299j) null, (AbstractC2305p) null, (String) null, z9 ? j6 : C3105o.f15708c, z11 ? c3027a : null, (C3042p) null, (C2714b) null, z10 ? j7 : j8, (C3038l) null, (C0665l0) null, 63103);
            if (c1588g02 != null) {
            }
            r7 = obj2.f14832a;
            float textSize2 = obj2.f14838g.getTextSize();
            c1604o02 = obj2.f14833b;
            list3 = obj2.f14835d;
            InterfaceC3093c interfaceC3093c42 = obj2.f14837f;
            z12 = obj2.f14842k;
            C2804a c2804a2 = AbstractC2805b.f14830a;
            if (z12) {
            }
            f7 = 0.0f;
            str3 = r7;
            charSequence = str3;
            if (r32.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            if (AbstractC3367j.m5096a(c1604o02.f10309a.f10254m, C3038l.f15605c)) {
            }
            c1617z = c1604o02.f10311c;
            if ((c1617z != null || (c1615x = c1617z.f10354b) == null) ? false : c1615x.f10351a) {
            }
            j9 = 0;
            C1613v c1613v22 = c1604o02.f10310b;
            C3035i c3035i2 = c1613v22.f10344f;
            if (c3035i2 == null) {
            }
            j10 = 1095216660480L;
            m3381I = AbstractC2080d.m3381I(c1613v22.f10341c, textSize2, interfaceC3093c42);
            if (!Float.isNaN(m3381I)) {
            }
            i10 = 0;
            c3043q = c1604o02.f10310b.f10342d;
            if (c3043q != null) {
            }
            arrayList = new ArrayList(r32.size());
            size2 = r32.size();
            while (i11 < size2) {
            }
            C1588g0 c1588g05222 = c1604o02.f10309a;
            AbstractC2305p abstractC2305p2222 = c1588g05222.f10247f;
            if (abstractC2305p2222 == null || c1588g05222.f10245d != null || c1588g05222.f10244c != null) {
            }
            C1369vi c1369vi222 = new C1369vi(1, spannable, c2806c2);
            if (arrayList.size() <= 1) {
            }
            size3 = r32.size();
            i13 = 0;
            z13 = false;
            while (i13 < size3) {
            }
            InterfaceC3093c interfaceC3093c6222 = interfaceC3093c42;
            if (z13) {
            }
            InterfaceC3093c interfaceC3093c7222 = interfaceC3093c6222;
            c3043q2 = c1604o02.f10310b.f10342d;
            if (c3043q2 != null) {
            }
            size4 = r32.size();
            while (i14 < size4) {
            }
            if (list3.size() > 0) {
            }
        }
        i7 = 2;
        obj2.f14843l = i7;
        c2806c = new C2806c(obj2);
        c3045s = c1604o0.f10310b.f10347i;
        if (c3045s == null) {
        }
        if (c3045s.f15620b) {
        }
        textPaint.setFlags(flags);
        i8 = c3045s.f15619a;
        if (i8 == 1) {
        }
        c1588g0 = c1604o0.f10309a;
        size = list.size();
        i9 = 0;
        while (true) {
            if (i9 >= size) {
            }
            i9++;
        }
        if (obj != null) {
        }
        long j1122 = c1588g0.f10243b;
        str2 = c1588g0.f10248g;
        c2714b = c1588g0.f10252k;
        InterfaceC3041o interfaceC3041o32 = c1588g0.f10242a;
        c3042p = c1588g0.f10251j;
        j6 = c1588g0.f10249h;
        m4795b = C3105o.m4795b(j1122);
        if (C3106p.m4798a(m4795b, 4294967296L)) {
        }
        abstractC2305p = c1588g0.f10247f;
        if (abstractC2305p != null) {
        }
        C2300k c2300k22 = c1588g0.f10244c;
        if (c2300k22 == null) {
        }
        C2298i c2298i22 = c1588g0.f10245d;
        if (c2298i22 != null) {
        }
        C2299j c2299j22 = c1588g0.f10246e;
        if (c2299j22 != null) {
        }
        C2807d c2807d32 = c2806c.f14831e;
        z8 = z7;
        c2806c2 = c2806c;
        m3678b = ((C2294e) c2807d32.f14836e).m3678b(abstractC2305p, c2300k22, i24, i25);
        if (!(m3678b instanceof C2307r)) {
        }
        textPaint.setTypeface(typeface);
        if (c2714b != null) {
        }
        if (str2 != null) {
        }
        if (c3042p != null) {
        }
        textPaint.m4438d(interfaceC3041o32.mo4717b());
        textPaint.m4437c(interfaceC3041o32.mo4718c(), 9205357640488583168L, interfaceC3041o32.mo4716a());
        textPaint.m4440f(c1588g0.f10255n);
        textPaint.m4441g(c1588g0.f10254m);
        textPaint.m4439e(c1588g0.f10257p);
        if (!C3106p.m4798a(C3105o.m4795b(j6), 4294967296L)) {
        }
        if (C3106p.m4798a(C3105o.m4795b(j6), 8589934592L)) {
        }
        j7 = c1588g0.f10253l;
        c3027a = c1588g0.f10250i;
        if (z8) {
        }
        j8 = C0677s.f2209g;
        if (C0677s.m1454c(j7, j8)) {
        }
        if (c3027a == null) {
        }
        if (z9) {
        }
        c1588g02 = new C1588g0(0L, 0L, (C2300k) null, (C2298i) null, (C2299j) null, (AbstractC2305p) null, (String) null, z9 ? j6 : C3105o.f15708c, z11 ? c3027a : null, (C3042p) null, (C2714b) null, z10 ? j7 : j8, (C3038l) null, (C0665l0) null, 63103);
        if (c1588g02 != null) {
        }
        r7 = obj2.f14832a;
        float textSize22 = obj2.f14838g.getTextSize();
        c1604o02 = obj2.f14833b;
        list3 = obj2.f14835d;
        InterfaceC3093c interfaceC3093c422 = obj2.f14837f;
        z12 = obj2.f14842k;
        C2804a c2804a22 = AbstractC2805b.f14830a;
        if (z12) {
        }
        f7 = 0.0f;
        str3 = r7;
        charSequence = str3;
        if (r32.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        if (AbstractC3367j.m5096a(c1604o02.f10309a.f10254m, C3038l.f15605c)) {
        }
        c1617z = c1604o02.f10311c;
        if ((c1617z != null || (c1615x = c1617z.f10354b) == null) ? false : c1615x.f10351a) {
        }
        j9 = 0;
        C1613v c1613v222 = c1604o02.f10310b;
        C3035i c3035i22 = c1613v222.f10344f;
        if (c3035i22 == null) {
        }
        j10 = 1095216660480L;
        m3381I = AbstractC2080d.m3381I(c1613v222.f10341c, textSize22, interfaceC3093c422);
        if (!Float.isNaN(m3381I)) {
        }
        i10 = 0;
        c3043q = c1604o02.f10310b.f10342d;
        if (c3043q != null) {
        }
        arrayList = new ArrayList(r32.size());
        size2 = r32.size();
        while (i11 < size2) {
        }
        C1588g0 c1588g052222 = c1604o02.f10309a;
        AbstractC2305p abstractC2305p22222 = c1588g052222.f10247f;
        if (abstractC2305p22222 == null || c1588g052222.f10245d != null || c1588g052222.f10244c != null) {
        }
        C1369vi c1369vi2222 = new C1369vi(1, spannable, c2806c2);
        if (arrayList.size() <= 1) {
        }
        size3 = r32.size();
        i13 = 0;
        z13 = false;
        while (i13 < size3) {
        }
        InterfaceC3093c interfaceC3093c62222 = interfaceC3093c422;
        if (z13) {
        }
        InterfaceC3093c interfaceC3093c72222 = interfaceC3093c62222;
        c3043q2 = c1604o02.f10310b.f10342d;
        if (c3043q2 != null) {
        }
        size4 = r32.size();
        while (i14 < size4) {
        }
        if (list3.size() > 0) {
        }
    }

    @Override // p050g2.InterfaceC1612u
    /* renamed from: a */
    public final float mo2607a() {
        float f7;
        C1769f c1769f = this.f14840i;
        float f8 = c1769f.f10785e;
        TextPaint textPaint = c1769f.f10782b;
        if (!Float.isNaN(f8)) {
            return c1769f.f10785e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c1769f.f10781a;
        lineInstance.setText(new C1766c(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0687a(1));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C1687f(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                C1687f c1687f = (C1687f) priorityQueue.peek();
                if (c1687f != null && ((Number) c1687f.f10472f).intValue() - ((Number) c1687f.f10471e).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new C1687f(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        if (priorityQueue.isEmpty()) {
            f7 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                C1687f c1687f2 = (C1687f) it.next();
                float desiredWidth = Layout.getDesiredWidth(c1769f.m2920b(), ((Number) c1687f2.f10471e).intValue(), ((Number) c1687f2.f10472f).intValue(), textPaint);
                while (it.hasNext()) {
                    C1687f c1687f3 = (C1687f) it.next();
                    desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c1769f.m2920b(), ((Number) c1687f3.f10471e).intValue(), ((Number) c1687f3.f10472f).intValue(), textPaint));
                }
                f7 = desiredWidth;
            } else {
                throw new NoSuchElementException();
            }
        }
        c1769f.f10785e = f7;
        return f7;
    }

    @Override // p050g2.InterfaceC1612u
    /* renamed from: b */
    public final boolean mo2608b() {
        boolean z7;
        C0031h1 c0031h1 = this.f14841j;
        if (c0031h1 != null) {
            z7 = c0031h1.m78B();
        } else {
            z7 = false;
        }
        if (!z7) {
            if (!this.f14842k) {
                C1617z c1617z = this.f14833b.f10311c;
                C2673p1 c2673p1 = C2813j.f14859a;
                C2673p1 c2673p12 = C2813j.f14859a;
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) c2673p12.f14390f;
                if (interfaceC2390n2 == null) {
                    if (C2560j.m4082d()) {
                        interfaceC2390n2 = c2673p12.m4285q();
                        c2673p12.f14390f = interfaceC2390n2;
                    } else {
                        interfaceC2390n2 = AbstractC2814k.f14860a;
                    }
                }
                if (((Boolean) interfaceC2390n2.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p050g2.InterfaceC1612u
    /* renamed from: c */
    public final float mo2609c() {
        return this.f14840i.m2921c();
    }
}
