package p068i5;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Path;
import android.os.Binder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.p007ui.draw.AbstractC0166a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0033i;
import p012b3.AbstractC0273a;
import p024c6.AbstractC0451r;
import p027d1.C0465c;
import p031d5.C0512l;
import p035e1.AbstractC0659i0;
import p035e1.C0660j;
import p050g2.C1584e0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p051g3.AbstractC1655r;
import p053g5.C1694m;
import p060h5.AbstractC1799g;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p077k.AbstractC2210p0;
import p077k.C2194h0;
import p077k.C2196i0;
import p079k1.AbstractC2286w;
import p079k1.C2271h;
import p079k1.C2272i;
import p079k1.C2273j;
import p079k1.C2274k;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2277n;
import p079k1.C2278o;
import p079k1.C2279p;
import p079k1.C2280q;
import p079k1.C2281r;
import p079k1.C2282s;
import p079k1.C2283t;
import p079k1.C2284u;
import p079k1.C2285v;
import p082k5.C2319i;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p085l0.C2395p;
import p085l0.C2405r1;
import p087l2.C2459w;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p099m6.EnumC2624y;
import p103n2.C2713a;
import p103n2.C2714b;
import p107o.C2770q;
import p113o5.AbstractC2818a;
import p120p5.AbstractC2881a;
import p140s2.C3094d;
import p140s2.C3105o;
import p140s2.C3106p;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3516l;
import p169w0.C3647d;
import p174w5.AbstractC3784a;
import p176x.C3791f;
import p176x.C3792g;
import p176x.InterfaceC3786a;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3810r;
import p185y2.C3849b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.d */
/* loaded from: classes.dex */
public abstract class AbstractC2080d {
    /* renamed from: A */
    public static C0512l m3373A(String str) {
        int i7;
        String str2;
        AbstractC3367j.m5100e(str, "statusLine");
        boolean m971M = AbstractC0451r.m971M(str, "HTTP/1.", false);
        EnumC2624y enumC2624y = EnumC2624y.f14222f;
        if (m971M) {
            i7 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        enumC2624y = EnumC2624y.f14223g;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (AbstractC0451r.m971M(str, "ICY ", false)) {
            i7 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i8 = i7 + 3;
        if (str.length() >= i8) {
            try {
                String substring = str.substring(i7, i8);
                AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i8) {
                    if (str.charAt(i8) == ' ') {
                        str2 = str.substring(i7 + 4);
                        AbstractC3367j.m5099d(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new C0512l(enumC2624y, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    /* renamed from: B */
    public static InterfaceC2318h m3374B(InterfaceC2316f interfaceC2316f, InterfaceC2318h interfaceC2318h) {
        AbstractC3367j.m5100e(interfaceC2318h, "context");
        if (interfaceC2318h == C2319i.f13273e) {
            return interfaceC2316f;
        }
        return (InterfaceC2318h) interfaceC2318h.mo852B(interfaceC2316f, new C1584e0(8));
    }

    /* renamed from: C */
    public static final byte[] m3375C(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m3398k(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC3367j.m5099d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* renamed from: D */
    public static void m3376D(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            AbstractC1655r.m2703d(context, broadcastReceiver, intentFilter);
        } else if (i7 >= 26) {
            context.registerReceiver(broadcastReceiver, intentFilter, m3412y(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, m3412y(context), null);
        }
    }

    /* renamed from: E */
    public static final boolean m3377E(C2194h0 c2194h0, Object obj, Object obj2) {
        Object m3592g = c2194h0.m3592g(obj);
        if (m3592g == null) {
            return false;
        }
        if (m3592g instanceof C2196i0) {
            C2196i0 c2196i0 = (C2196i0) m3592g;
            boolean m3609k = c2196i0.m3609k(obj2);
            if (m3609k && c2196i0.m3605g()) {
                c2194h0.m3596k(obj);
            }
            return m3609k;
        }
        if (!m3592g.equals(obj2)) {
            return false;
        }
        c2194h0.m3596k(obj);
        return true;
    }

    /* renamed from: F */
    public static final void m3378F(C2194h0 c2194h0, Object obj) {
        boolean z7;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj2 = c2194h0.f12677b[i10];
                            Object obj3 = c2194h0.f12678c[i10];
                            if (obj3 instanceof C2196i0) {
                                C2196i0 c2196i0 = (C2196i0) obj3;
                                c2196i0.m3609k(obj);
                                z7 = c2196i0.m3605g();
                            } else if (obj3 == obj) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                c2194h0.m3597l(i10);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    public static void m3379G(Activity activity, String[] strArr, int i7) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (!TextUtils.isEmpty(strArr[i8])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i8));
                }
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4046j(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        activity.requestPermissions(strArr, i7);
    }

    /* renamed from: H */
    public static final void m3380H(Object[] objArr, int i7, int i8) {
        AbstractC3367j.m5100e(objArr, "<this>");
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    /* renamed from: I */
    public static final float m3381I(long j6, float f7, InterfaceC3093c interfaceC3093c) {
        float m4796c;
        long m4795b = C3105o.m4795b(j6);
        if (C3106p.m4798a(m4795b, 4294967296L)) {
            if (interfaceC3093c.mo560l() > 1.05d) {
                m4796c = C3105o.m4796c(j6) / C3105o.m4796c(interfaceC3093c.mo4521n0(f7));
            } else {
                return interfaceC3093c.mo4518f0(j6);
            }
        } else if (C3106p.m4798a(m4795b, 8589934592L)) {
            m4796c = C3105o.m4796c(j6);
        } else {
            return Float.NaN;
        }
        return m4796c * f7;
    }

    /* renamed from: J */
    public static final Object m3382J(InterfaceC3516l interfaceC3516l, C0465c c0465c, AbstractC2583c abstractC2583c) {
        InterfaceC3786a interfaceC3786a;
        Object mo5818O;
        if (((AbstractC3809q) interfaceC3516l).f17992e.f18005r) {
            AbstractC3497e1 m5381u = AbstractC3498f.m5381u(interfaceC3516l);
            if (!((AbstractC3809q) interfaceC3516l).f17992e.f18005r) {
                interfaceC3786a = null;
            } else {
                InterfaceC3786a interfaceC3786a2 = (InterfaceC3786a) AbstractC3498f.m5370j(interfaceC3516l, C3791f.f17955u);
                if (interfaceC3786a2 == null) {
                    interfaceC3786a2 = new C3792g(interfaceC3516l);
                }
                interfaceC3786a = interfaceC3786a2;
            }
            if (interfaceC3786a != null && (mo5818O = interfaceC3786a.mo5818O(m5381u, new C0033i(17, c0465c, m5381u), abstractC2583c)) == EnumC2465a.f13750e) {
                return mo5818O;
            }
        }
        return C1694m.f10482a;
    }

    /* renamed from: K */
    public static final void m3383K(Spannable spannable, long j6, int i7, int i8) {
        if (j6 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC0659i0.m1426z(j6)), i7, i8, 33);
        }
    }

    /* renamed from: L */
    public static final void m3384L(Spannable spannable, long j6, InterfaceC3093c interfaceC3093c, int i7, int i8) {
        long m4795b = C3105o.m4795b(j6);
        if (C3106p.m4798a(m4795b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC3784a.m5794D(interfaceC3093c.mo4518f0(j6)), false), i7, i8, 33);
        } else if (C3106p.m4798a(m4795b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C3105o.m4796c(j6)), i7, i8, 33);
        }
    }

    /* renamed from: M */
    public static final void m3385M(Spannable spannable, C2714b c2714b, int i7, int i8) {
        if (c2714b != null) {
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c2714b));
            Iterator it = c2714b.f14563e.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2713a) it.next()).f14561a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i7, i8, 33);
        }
    }

    /* renamed from: N */
    public static final void m3386N(List list, C0660j c0660j) {
        boolean z7;
        AbstractC2286w abstractC2286w;
        Path path;
        int i7;
        int i8;
        AbstractC2286w abstractC2286w2;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        C0660j c0660j2 = c0660j;
        Path path2 = c0660j2.f2151a;
        Path path3 = c0660j2.f2151a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        if (fillType == fillType2) {
            z7 = true;
        } else {
            z7 = false;
        }
        path3.rewind();
        if (!z7) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        if (list2.isEmpty()) {
            abstractC2286w = C2272i.f13166b;
        } else {
            abstractC2286w = (AbstractC2286w) list2.get(0);
        }
        int size = list2.size();
        float f11 = 0.0f;
        int i9 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i9 < size) {
            AbstractC2286w abstractC2286w3 = (AbstractC2286w) list2.get(i9);
            if (abstractC2286w3 instanceof C2272i) {
                path3.close();
                path = path3;
                i7 = size;
                f7 = f11;
                i8 = i9;
                abstractC2286w2 = abstractC2286w3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (abstractC2286w3 instanceof C2282s) {
                    C2282s c2282s = (C2282s) abstractC2286w3;
                    float f18 = c2282s.f13197b;
                    f14 += f18;
                    float f19 = c2282s.f13198c;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i7 = size;
                    f7 = f11;
                    i8 = i9;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (abstractC2286w3 instanceof C2276m) {
                        C2276m c2276m = (C2276m) abstractC2286w3;
                        float f20 = c2276m.f13176b;
                        float f21 = c2276m.f13177c;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (abstractC2286w3 instanceof C2281r) {
                            C2281r c2281r = (C2281r) abstractC2286w3;
                            float f22 = c2281r.f13196c;
                            float f23 = c2281r.f13195b;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (abstractC2286w3 instanceof C2275l) {
                            C2275l c2275l = (C2275l) abstractC2286w3;
                            float f24 = c2275l.f13175c;
                            float f25 = c2275l.f13174b;
                            c0660j2.m1429c(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (abstractC2286w3 instanceof C2280q) {
                            float f26 = ((C2280q) abstractC2286w3).f13194b;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (abstractC2286w3 instanceof C2274k) {
                            float f27 = ((C2274k) abstractC2286w3).f13173b;
                            c0660j2.m1429c(f27, f15);
                            f14 = f27;
                        } else {
                            if (abstractC2286w3 instanceof C2284u) {
                                f10 = ((C2284u) abstractC2286w3).f13203b;
                                path3.rLineTo(f11, f10);
                            } else if (abstractC2286w3 instanceof C2285v) {
                                float f28 = ((C2285v) abstractC2286w3).f13204b;
                                c0660j2.m1429c(f14, f28);
                                f15 = f28;
                            } else if (abstractC2286w3 instanceof C2279p) {
                                C2279p c2279p = (C2279p) abstractC2286w3;
                                path3.rCubicTo(c2279p.f13188b, c2279p.f13189c, c2279p.f13190d, c2279p.f13191e, c2279p.f13192f, c2279p.f13193g);
                                f12 = c2279p.f13190d + f14;
                                f13 = c2279p.f13191e + f15;
                                f14 += c2279p.f13192f;
                                f10 = c2279p.f13193g;
                            } else if (abstractC2286w3 instanceof C2273j) {
                                C2273j c2273j = (C2273j) abstractC2286w3;
                                path3.cubicTo(c2273j.f13167b, c2273j.f13168c, c2273j.f13169d, c2273j.f13170e, c2273j.f13171f, c2273j.f13172g);
                                f12 = c2273j.f13169d;
                                f13 = c2273j.f13170e;
                                float f29 = c2273j.f13171f;
                                f15 = c2273j.f13172g;
                                path = path3;
                                f14 = f29;
                            } else if (abstractC2286w3 instanceof C2283t) {
                                if (abstractC2286w.f13205a) {
                                    f9 = f15 - f13;
                                    f8 = f14 - f12;
                                } else {
                                    f8 = f11;
                                    f9 = f8;
                                }
                                C2283t c2283t = (C2283t) abstractC2286w3;
                                path3.rCubicTo(f8, f9, c2283t.f13199b, c2283t.f13200c, c2283t.f13201d, c2283t.f13202e);
                                f12 = c2283t.f13199b + f14;
                                f13 = c2283t.f13200c + f15;
                                f14 += c2283t.f13201d;
                                f10 = c2283t.f13202e;
                            } else if (abstractC2286w3 instanceof C2277n) {
                                if (abstractC2286w.f13205a) {
                                    float f30 = 2;
                                    f14 = (f14 * f30) - f12;
                                    f15 = (f30 * f15) - f13;
                                }
                                C2277n c2277n = (C2277n) abstractC2286w3;
                                path3.cubicTo(f14, f15, c2277n.f13178b, c2277n.f13179c, c2277n.f13180d, c2277n.f13181e);
                                path = path3;
                                float f31 = c2277n.f13178b;
                                float f32 = c2277n.f13179c;
                                float f33 = c2277n.f13180d;
                                f15 = c2277n.f13181e;
                                f14 = f33;
                                i7 = size;
                                f7 = f11;
                                i8 = i9;
                                abstractC2286w2 = abstractC2286w3;
                                f13 = f32;
                                f12 = f31;
                            } else {
                                path = path3;
                                if (abstractC2286w3 instanceof C2278o) {
                                    C2278o c2278o = (C2278o) abstractC2286w3;
                                    float f34 = c2278o.f13186f + f14;
                                    float f35 = c2278o.f13187g + f15;
                                    i8 = i9;
                                    i7 = size;
                                    m3399l(c0660j, f14, f15, f34, f35, c2278o.f13182b, c2278o.f13183c, 0.0f, c2278o.f13184d, c2278o.f13185e);
                                    f12 = f34;
                                    f14 = f12;
                                    f13 = f35;
                                    f15 = f13;
                                    abstractC2286w2 = abstractC2286w3;
                                    f7 = 0.0f;
                                } else {
                                    i7 = size;
                                    i8 = i9;
                                    if (abstractC2286w3 instanceof C2271h) {
                                        C2271h c2271h = (C2271h) abstractC2286w3;
                                        float f36 = c2271h.f13165f;
                                        float f37 = c2271h.f13164e;
                                        abstractC2286w2 = abstractC2286w3;
                                        f7 = 0.0f;
                                        m3399l(c0660j, f14, f15, f37, f36, c2271h.f13161b, c2271h.f13162c, 0.0f, false, c2271h.f13163d);
                                        f13 = f36;
                                        f15 = f13;
                                        f12 = f37;
                                        f14 = f12;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            f15 += f10;
                        }
                        path = path3;
                    }
                    i7 = size;
                    f7 = f11;
                    i8 = i9;
                }
                abstractC2286w2 = abstractC2286w3;
            }
            i9 = i8 + 1;
            c0660j2 = c0660j;
            f11 = f7;
            path3 = path;
            size = i7;
            abstractC2286w = abstractC2286w2;
            list2 = list;
        }
    }

    /* renamed from: O */
    public static final boolean m3387O(Throwable th, InterfaceC3277a interfaceC3277a) {
        Collection m3010C;
        Object invoke;
        AbstractC3367j.m5100e(th, "<this>");
        Integer num = AbstractC2881a.f15058a;
        C3647d c3647d = null;
        if (num != null && num.intValue() < 19) {
            Method method = AbstractC2818a.f14868b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                m3010C = AbstractC1804l.m3010C((Throwable[]) invoke);
            } else {
                m3010C = C1813u.f10860e;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            AbstractC3367j.m5099d(suppressed, "getSuppressed(...)");
            m3010C = AbstractC1804l.m3010C(suppressed);
        }
        boolean z7 = false;
        if (!m3010C.isEmpty()) {
            Iterator it = m3010C.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof C3647d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) interfaceC3277a.mo52a();
            boolean isEmpty = list.isEmpty();
            z7 = !isEmpty;
            if (!isEmpty) {
                c3647d = new C3647d(list);
            }
        } catch (Throwable th2) {
            c3647d = th2;
        }
        if (c3647d != null) {
            AbstractC0000a.m7h(th, c3647d);
        }
        return z7;
    }

    /* renamed from: a */
    public static final void m3388a(int i7, C2395p c2395p, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r) {
        int i8;
        int i9;
        int i10;
        c2395p.m3859a0(-932836462);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if (c2395p.m3874i(interfaceC3279c)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        if (((i8 | i9) & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC3122c.m4828a(c2395p, AbstractC0166a.m378a(interfaceC3810r, interfaceC3279c));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2770q(interfaceC3810r, interfaceC3279c, i7);
        }
    }

    /* renamed from: b */
    public static C3094d m3389b() {
        return new C3094d(1.0f, 1.0f);
    }

    /* renamed from: c */
    public static final Object[] m3390c(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC1804l.m3020M(objArr, objArr2, 0, i7, 6);
        AbstractC1804l.m3017J(objArr, objArr2, i7 + 2, i7, objArr.length);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    /* renamed from: d */
    public static final Object[] m3391d(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC1804l.m3020M(objArr, objArr2, 0, i7, 6);
        AbstractC1804l.m3017J(objArr, objArr2, i7, i7 + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: e */
    public static final Object[] m3392e(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1804l.m3020M(objArr, objArr2, 0, i7, 6);
        AbstractC1804l.m3017J(objArr, objArr2, i7, i7 + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: f */
    public static final String m3393f(Object[] objArr, int i7, int i8, AbstractC1799g abstractC1799g) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == abstractC1799g) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: g */
    public static final void m3394g(C2194h0 c2194h0, Object obj, Object obj2) {
        boolean z7;
        Object obj3;
        int m3591f = c2194h0.m3591f(obj);
        if (m3591f < 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            obj3 = null;
        } else {
            obj3 = c2194h0.f12678c[m3591f];
        }
        if (obj3 != null) {
            if (obj3 instanceof C2196i0) {
                ((C2196i0) obj3).m3599a(obj2);
            } else if (obj3 != obj2) {
                C2196i0 c2196i0 = new C2196i0();
                c2196i0.m3599a(obj3);
                c2196i0.m3599a(obj2);
                obj2 = c2196i0;
            }
            obj2 = obj3;
        }
        if (z7) {
            int i7 = ~m3591f;
            c2194h0.f12677b[i7] = obj;
            c2194h0.f12678c[i7] = obj2;
            return;
        }
        c2194h0.f12678c[m3591f] = obj2;
    }

    /* renamed from: h */
    public static int m3395h(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new C3849b(context).f18076a.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* renamed from: i */
    public static int m3396i(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i7 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String m572b = AbstractC0273a.m572b(context);
                            if (appOpsManager != null) {
                                i7 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, m572b);
                            }
                            noteProxyOpNoThrow = i7;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: j */
    public static C2194h0 m3397j() {
        long[] jArr = AbstractC2210p0.f12722a;
        return new C2194h0();
    }

    /* renamed from: k */
    public static final long m3398k(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j6 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j6 += read;
            read = inputStream.read(bArr);
        }
        return j6;
    }

    /* renamed from: l */
    public static final void m3399l(C0660j c0660j, double d7, double d8, double d9, double d10, double d11, double d12, double d13, boolean z7, boolean z8) {
        double d14;
        double d15;
        boolean z9;
        double d16 = d11;
        double d17 = (d13 / 180) * 3.141592653589793d;
        double cos = Math.cos(d17);
        double sin = Math.sin(d17);
        double d18 = ((d8 * sin) + (d7 * cos)) / d16;
        double d19 = ((d8 * cos) + ((-d7) * sin)) / d12;
        double d20 = ((d10 * sin) + (d9 * cos)) / d16;
        double d21 = ((d10 * cos) + ((-d9) * sin)) / d12;
        double d22 = d18 - d20;
        double d23 = d19 - d21;
        double d24 = 2;
        double d25 = (d18 + d20) / d24;
        double d26 = (d19 + d21) / d24;
        double d27 = (d23 * d23) + (d22 * d22);
        if (d27 != 0.0d) {
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                m3399l(c0660j, d7, d8, d9, d10, d16 * sqrt, d12 * sqrt, d13, z7, z8);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d22 * sqrt2;
            double d30 = sqrt2 * d23;
            if (z7 == z8) {
                d14 = d25 - d30;
                d15 = d26 + d29;
            } else {
                d14 = d25 + d30;
                d15 = d26 - d29;
            }
            double atan2 = Math.atan2(d19 - d15, d18 - d14);
            double atan22 = Math.atan2(d21 - d15, d20 - d14) - atan2;
            if (atan22 >= 0.0d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 != z9) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d31 = d14 * d16;
            double d32 = d15 * d12;
            double d33 = (d31 * cos) - (d32 * sin);
            double d34 = (d32 * cos) + (d31 * sin);
            double d35 = 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d35) / 3.141592653589793d));
            double cos2 = Math.cos(d17);
            double sin2 = Math.sin(d17);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = atan22;
            double d37 = -d16;
            double d38 = d37 * cos2;
            double d39 = d12 * sin2;
            double d40 = (d38 * sin3) - (d39 * cos3);
            double d41 = d37 * sin2;
            double d42 = d12 * cos2;
            double d43 = (cos3 * d42) + (sin3 * d41);
            double d44 = d36 / ceil;
            double d45 = atan2;
            double d46 = d40;
            int i7 = 0;
            double d47 = d7;
            double d48 = d43;
            double d49 = d8;
            while (i7 < ceil) {
                double d50 = d45 + d44;
                double sin4 = Math.sin(d50);
                double cos4 = Math.cos(d50);
                int i8 = i7;
                double d51 = (((d16 * cos2) * cos4) + d33) - (d39 * sin4);
                int i9 = ceil;
                double d52 = (d42 * sin4) + (d16 * sin2 * cos4) + d34;
                double d53 = (d38 * sin4) - (d39 * cos4);
                double d54 = (cos4 * d42) + (sin4 * d41);
                double d55 = d50 - d45;
                double tan = Math.tan(d55 / d24);
                double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d35) - 1) * Math.sin(d55)) / 3;
                double d56 = d35;
                c0660j.f2151a.cubicTo((float) ((d46 * sqrt3) + d47), (float) ((d48 * sqrt3) + d49), (float) (d51 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d51, (float) d52);
                sin2 = sin2;
                d47 = d51;
                i7 = i8 + 1;
                d33 = d33;
                d35 = d56;
                d45 = d50;
                d48 = d54;
                d46 = d53;
                d49 = d52;
                ceil = i9;
                d16 = d11;
            }
        }
    }

    /* renamed from: m */
    public static final float m3400m(float f7) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f7) & 8589934591L) / 3)) + 709952852);
        float f8 = intBitsToFloat - ((intBitsToFloat - (f7 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f8 - ((f8 - (f7 / (f8 * f8))) * 0.33333334f);
    }

    /* renamed from: n */
    public static InterfaceC2316f m3401n(InterfaceC2316f interfaceC2316f, InterfaceC2317g interfaceC2317g) {
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        if (AbstractC3367j.m5096a(interfaceC2316f.getKey(), interfaceC2317g)) {
            return interfaceC2316f;
        }
        return null;
    }

    /* renamed from: o */
    public static final int m3402o(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else if (i9 < 0) {
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i8;
    }

    /* renamed from: p */
    public static final C1587g m3403p(C2459w c2459w) {
        C1587g c1587g = c2459w.f13723a;
        long j6 = c2459w.f13724b;
        c1587g.getClass();
        return c1587g.subSequence(C1602n0.m2589e(j6), C1602n0.m2588d(j6));
    }

    /* renamed from: q */
    public static final long m3404q(double d7) {
        return m3413z((float) d7, 4294967296L);
    }

    /* renamed from: r */
    public static final long m3405r(int i7) {
        return m3413z(i7, 4294967296L);
    }

    /* renamed from: s */
    public static final C1587g m3406s(C2459w c2459w, int i7) {
        C1587g c1587g = c2459w.f13723a;
        long j6 = c2459w.f13724b;
        return c1587g.subSequence(C1602n0.m2588d(j6), Math.min(C1602n0.m2588d(j6) + i7, c2459w.f13723a.f10239f.length()));
    }

    /* renamed from: t */
    public static final C1587g m3407t(C2459w c2459w, int i7) {
        C1587g c1587g = c2459w.f13723a;
        long j6 = c2459w.f13724b;
        return c1587g.subSequence(Math.max(0, C1602n0.m2589e(j6) - i7), C1602n0.m2589e(j6));
    }

    /* renamed from: u */
    public static final int m3408u(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    /* renamed from: v */
    public static final float m3409v(float f7, float f8, float f9) {
        return (f9 * f8) + ((1 - f9) * f7);
    }

    /* renamed from: w */
    public static final int m3410w(float f7, int i7, int i8) {
        return i7 + ((int) Math.round((i8 - i7) * f7));
    }

    /* renamed from: x */
    public static InterfaceC2318h m3411x(InterfaceC2316f interfaceC2316f, InterfaceC2317g interfaceC2317g) {
        AbstractC3367j.m5100e(interfaceC2317g, "key");
        if (AbstractC3367j.m5096a(interfaceC2316f.getKey(), interfaceC2317g)) {
            return C2319i.f13273e;
        }
        return interfaceC2316f;
    }

    /* renamed from: y */
    public static String m3412y(Context context) {
        String opPackageName;
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (m3396i(context, str) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                StringBuilder sb = new StringBuilder();
                opPackageName = context.getOpPackageName();
                sb.append(opPackageName);
                sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
                str = sb.toString();
                if (m3396i(context, str) == 0) {
                    return str;
                }
            }
            throw new RuntimeException(AbstractC0094y0.m185l("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        }
        return str;
    }

    /* renamed from: z */
    public static final long m3413z(float f7, long j6) {
        long floatToRawIntBits = j6 | (Float.floatToRawIntBits(f7) & 4294967295L);
        C3106p[] c3106pArr = C3105o.f15707b;
        return floatToRawIntBits;
    }
}
