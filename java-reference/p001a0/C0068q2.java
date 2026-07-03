package p001a0;

import android.graphics.Insets;
import android.graphics.Matrix;
import android.net.Network;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p004a5.C0105a;
import p004a5.C0106b;
import p004a5.C0107c;
import p006a7.C0129l;
import p012b3.C0274b;
import p015b6.C0303j;
import p015b6.C0310q;
import p022c4.C0400j;
import p022c4.C0406p;
import p022c4.InterfaceC0407q;
import p023c5.C0410b;
import p023c5.InterfaceC0409a;
import p034e0.C0600d0;
import p035e1.AbstractC0659i0;
import p035e1.C0647c0;
import p039e5.C0990jb;
import p039e5.EnumC1342um;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p053g5.C1694m;
import p054g6.C1707h;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p061h6.C1828j;
import p063i0.C2008t5;
import p065i2.AbstractC2064e;
import p065i2.C2065f;
import p065i2.InterfaceC2063d;
import p067i4.AbstractC2072e;
import p067i4.C2069b;
import p071j0.C2125f0;
import p071j0.C2148r;
import p071j0.C2150s;
import p075j4.C2177a;
import p077k.C2184c0;
import p077k.C2194h0;
import p077k.C2213r;
import p077k.C2218t0;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.AbstractC2422x0;
import p085l0.C2350d2;
import p085l0.C2361g1;
import p087l2.C2444h;
import p087l2.C2459w;
import p087l2.InterfaceC2443g;
import p090l5.EnumC2465a;
import p093m0.InterfaceC2528i0;
import p096m3.C2573w;
import p096m3.C2574x;
import p096m3.C2576z;
import p096m3.InterfaceC2566p;
import p099m6.InterfaceC2611l;
import p101n0.C2705e;
import p107o.EnumC2788y0;
import p122q.C2904f0;
import p122q.InterfaceC2922l0;
import p144t.AbstractC3122c;
import p146t1.InterfaceC3206h1;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.C3334a;
import p153u0.InterfaceC3342i;
import p158u5.AbstractC3367j;
import p160v.C3409f0;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3502g0;
import p162v1.EnumC3489c0;
import p162v1.InterfaceC3525o;
import p165v4.C3587a;
import p165v4.C3589c;
import p168w.AbstractC3642y;
import p168w.C3639v;
import p170w1.AbstractC3681h0;
import p170w1.InterfaceC3746y0;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.q2 */
/* loaded from: classes.dex */
public class C0068q2 implements InterfaceC0409a, InterfaceC2611l, InterfaceC1702d, InterfaceC2063d, InterfaceC2922l0, InterfaceC2528i0, InterfaceC2566p, InterfaceC3342i, InterfaceC3206h1, InterfaceC3746y0 {

    /* renamed from: e */
    public final /* synthetic */ int f343e;

    /* renamed from: f */
    public Object f344f;

    /* renamed from: g */
    public Object f345g;

    public /* synthetic */ C0068q2(int i7, Object obj, Object obj2) {
        this.f343e = i7;
        this.f344f = obj;
        this.f345g = obj2;
    }

    /* renamed from: A */
    public static C0406p m132A(C0406p c0406p, float f7, float f8) {
        float f9;
        float f10;
        float f11 = c0406p.f1390a;
        float f12 = c0406p.f1391b;
        if (f11 < f7) {
            f9 = f11 - 1.0f;
        } else {
            f9 = f11 + 1.0f;
        }
        if (f12 < f8) {
            f10 = f12 - 1.0f;
        } else {
            f10 = f12 + 1.0f;
        }
        return new C0406p(f9, f10);
    }

    /* renamed from: B */
    public static C0406p m133B(C0406p c0406p, C0406p c0406p2, int i7) {
        float f7 = c0406p2.f1390a;
        float f8 = c0406p.f1390a;
        float f9 = i7 + 1;
        float f10 = c0406p2.f1391b;
        float f11 = c0406p.f1391b;
        return new C0406p(f8 + ((f7 - f8) / f9), f11 + ((f10 - f11) / f9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: u */
    public static void m134u(C3502g0 c3502g0) {
        if (c3502g0.f16882S > 0) {
            if (c3502g0.f16873J.f16941d == EnumC3489c0.f16795i && !c3502g0.m5442p() && !c3502g0.m5443q() && !c3502g0.f16883T && c3502g0.m5408J()) {
                AbstractC3809q abstractC3809q = c3502g0.f16872I.f16802f;
                if ((abstractC3809q.f17995h & 256) != 0) {
                    while (abstractC3809q != null) {
                        if ((abstractC3809q.f17994g & 256) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q;
                            ?? r52 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3525o) {
                                    InterfaceC3525o interfaceC3525o = (InterfaceC3525o) abstractC3519m;
                                    interfaceC3525o.mo790x(AbstractC3498f.m5380t(interfaceC3525o, 256));
                                } else if ((abstractC3519m.f17994g & 256) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                    int i7 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r52 = r52;
                                    while (abstractC3809q2 != null) {
                                        if ((abstractC3809q2.f17994g & 256) != 0) {
                                            i7++;
                                            r52 = r52;
                                            if (i7 == 1) {
                                                abstractC3519m = abstractC3809q2;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r52.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r52.m4300b(abstractC3809q2);
                                            }
                                        }
                                        abstractC3809q2 = abstractC3809q2.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r52 = r52;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r52);
                            }
                        }
                        if ((abstractC3809q.f17995h & 256) == 0) {
                            break;
                        } else {
                            abstractC3809q = abstractC3809q.f17997j;
                        }
                    }
                }
            }
            c3502g0.f16881R = false;
            C2705e m5451y = c3502g0.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i8 = m5451y.f14519g;
            for (int i9 = 0; i9 < i8; i9++) {
                m134u((C3502g0) objArr[i9]);
            }
        }
    }

    /* renamed from: C */
    public float m135C(int i7, int i8, int i9, int i10) {
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C0068q2 c0068q2;
        int i20;
        int i21 = 1;
        if (Math.abs(i10 - i8) > Math.abs(i9 - i7)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i12 = i7;
            i11 = i8;
            i14 = i9;
            i13 = i10;
        } else {
            i11 = i7;
            i12 = i8;
            i13 = i9;
            i14 = i10;
        }
        int abs = Math.abs(i13 - i11);
        int abs2 = Math.abs(i14 - i12);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = -1;
        if (i11 < i13) {
            i15 = 1;
        } else {
            i15 = -1;
        }
        if (i12 < i14) {
            i24 = 1;
        }
        int i25 = i13 + i15;
        int i26 = i11;
        int i27 = i12;
        int i28 = 0;
        while (true) {
            if (i26 != i25) {
                if (z7) {
                    i17 = i27;
                } else {
                    i17 = i26;
                }
                if (z7) {
                    i18 = i26;
                } else {
                    i18 = i27;
                }
                boolean z8 = z7;
                if (i28 == i21) {
                    i19 = i21;
                    i20 = abs;
                    c0068q2 = this;
                } else {
                    i19 = 0;
                    c0068q2 = this;
                    i20 = abs;
                }
                if (i19 == ((C2069b) c0068q2.f344f).m3313b(i17, i18)) {
                    if (i28 == 2) {
                        return AbstractC2064e.m3246t(i26, i27, i11, i12);
                    }
                    i28++;
                }
                i23 += abs2;
                if (i23 > 0) {
                    if (i27 == i14) {
                        i16 = 2;
                        break;
                    }
                    i27 += i24;
                    i23 -= i20;
                }
                i26 += i15;
                abs = i20;
                z7 = z8;
                i21 = 1;
                i22 = 2;
            } else {
                i16 = i22;
                break;
            }
        }
        if (i28 == i16) {
            return AbstractC2064e.m3246t(i25, i14, i11, i12);
        }
        return Float.NaN;
    }

    /* renamed from: D */
    public float m136D(int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        C2069b c2069b = (C2069b) this.f344f;
        float m135C = m135C(i7, i8, i9, i10);
        int i11 = i7 - (i9 - i7);
        int i12 = 0;
        if (i11 < 0) {
            f7 = i7 / (i7 - i11);
            i11 = 0;
        } else {
            int i13 = c2069b.f12258e;
            if (i11 >= i13) {
                float f9 = ((i13 - 1) - i7) / (i11 - i7);
                int i14 = i13 - 1;
                f7 = f9;
                i11 = i14;
            } else {
                f7 = 1.0f;
            }
        }
        float f10 = i8;
        int i15 = (int) (f10 - ((i10 - i8) * f7));
        if (i15 < 0) {
            f8 = f10 / (i8 - i15);
        } else {
            int i16 = c2069b.f12259f;
            if (i15 >= i16) {
                f8 = ((i16 - 1) - i8) / (i15 - i8);
                i12 = i16 - 1;
            } else {
                i12 = i15;
                f8 = 1.0f;
            }
        }
        return (m135C(i7, i8, (int) (((i11 - i7) * f8) + i7), i12) + m135C) - 1.0f;
    }

    /* renamed from: E */
    public void m137E(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f344f;
        Object parent = view.getParent();
        if (parent instanceof View) {
            m137E((View) parent, fArr);
            C0647c0.m1353d(fArr2);
            C0647c0.m1355f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC3681h0.m5697x(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C0647c0.m1353d(fArr2);
            C0647c0.m1355f(fArr2, left, top);
            AbstractC3681h0.m5697x(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f345g;
            view.getLocationInWindow(iArr);
            C0647c0.m1353d(fArr2);
            C0647c0.m1355f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC3681h0.m5697x(fArr, fArr2);
            float f7 = iArr[0];
            float f8 = iArr[1];
            C0647c0.m1353d(fArr2);
            C0647c0.m1355f(fArr2, f7, f8);
            AbstractC3681h0.m5697x(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            AbstractC0659i0.m1420t(matrix, fArr2);
            AbstractC3681h0.m5697x(fArr, fArr2);
        }
    }

    /* renamed from: F */
    public int m138F(C0406p c0406p, C0406p c0406p2) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = (int) c0406p.f1390a;
        int i13 = (int) c0406p.f1391b;
        int i14 = (int) c0406p2.f1390a;
        C2069b c2069b = (C2069b) this.f344f;
        int i15 = 1;
        int min = Math.min(c2069b.f12259f - 1, (int) c0406p2.f1391b);
        int i16 = 0;
        if (Math.abs(min - i13) > Math.abs(i14 - i12)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i12 = i13;
            i13 = i12;
            i14 = min;
            min = i14;
        }
        int abs = Math.abs(i14 - i12);
        int abs2 = Math.abs(min - i13);
        int i17 = (-abs) / 2;
        if (i13 < min) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        if (i12 >= i14) {
            i15 = -1;
        }
        if (z7) {
            i8 = i13;
        } else {
            i8 = i12;
        }
        if (z7) {
            i9 = i12;
        } else {
            i9 = i13;
        }
        boolean m3313b = c2069b.m3313b(i8, i9);
        while (i12 != i14) {
            if (z7) {
                i10 = i13;
            } else {
                i10 = i12;
            }
            if (z7) {
                i11 = i12;
            } else {
                i11 = i13;
            }
            boolean m3313b2 = c2069b.m3313b(i10, i11);
            if (m3313b2 != m3313b) {
                i16++;
                m3313b = m3313b2;
            }
            i17 += abs2;
            if (i17 > 0) {
                if (i13 == min) {
                    return i16;
                }
                i13 += i7;
                i17 -= abs;
            }
            i12 += i15;
        }
        return i16;
    }

    /* renamed from: G */
    public void m139G(AbstractC2422x0 abstractC2422x0) {
        Object m3592g = ((C2194h0) this.f345g).m3592g(abstractC2422x0);
        if (m3592g != null) {
            if (m3592g instanceof C2184c0) {
                C2184c0 c2184c0 = (C2184c0) m3592g;
                Object[] objArr = c2184c0.f12628a;
                if (c2184c0.f12629b > 0) {
                    AbstractC3367j.m5098c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                    throw new ClassCastException();
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    @Override // p122q.InterfaceC2922l0
    /* renamed from: a */
    public Object mo140a(C0070r0 c0070r0, C2904f0 c2904f0) {
        Object m3485b = ((C2150s) this.f345g).m3485b(EnumC2788y0.f14797f, new C2148r(this, c0070r0, null), c2904f0);
        if (m3485b == EnumC2465a.f13750e) {
            return m3485b;
        }
        return C1694m.f10482a;
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: b */
    public Object mo141b() {
        return (C2576z) this.f344f;
    }

    @Override // p023c5.InterfaceC0409a
    /* renamed from: c */
    public void mo32c(C0410b c0410b) {
        ((InterfaceC0409a) this.f344f).mo32c(c0410b);
    }

    @Override // p153u0.InterfaceC3342i
    /* renamed from: d */
    public Object mo142d(C3334a c3334a, Object obj) {
        return ((InterfaceC3281e) this.f344f).mo22d(c3334a, obj);
    }

    @Override // p099m6.InterfaceC2611l
    /* renamed from: e */
    public List mo34e(String str) {
        List m3031X;
        ArrayList arrayList;
        switch (this.f343e) {
            case 4:
                AbstractC3367j.m5100e(str, "hostname");
                if (str.equalsIgnoreCase((String) this.f344f)) {
                    return AbstractC3784a.m5817z(InetAddress.getByName((String) this.f345g));
                }
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    AbstractC3367j.m5099d(allByName, "getAllByName(hostname)");
                    return AbstractC1804l.m3031X(allByName);
                } catch (NullPointerException e7) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e7);
                    throw unknownHostException;
                }
            default:
                EnumC1342um enumC1342um = (EnumC1342um) this.f345g;
                AbstractC3367j.m5100e(str, "hostname");
                Network network = (Network) this.f344f;
                if (network != null) {
                    InetAddress[] allByName2 = network.getAllByName(str);
                    AbstractC3367j.m5099d(allByName2, "getAllByName(...)");
                    m3031X = AbstractC1804l.m3031X(allByName2);
                } else {
                    try {
                        InetAddress[] allByName3 = InetAddress.getAllByName(str);
                        AbstractC3367j.m5099d(allByName3, "getAllByName(hostname)");
                        m3031X = AbstractC1804l.m3031X(allByName3);
                    } catch (NullPointerException e8) {
                        UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException2.initCause(e8);
                        throw unknownHostException2;
                    }
                }
                int ordinal = enumC1342um.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        arrayList = new ArrayList();
                        for (Object obj : m3031X) {
                            InetAddress inetAddress = (InetAddress) obj;
                            if (inetAddress instanceof Inet6Address) {
                                Inet6Address inet6Address = (Inet6Address) inetAddress;
                                if (!inet6Address.isLoopbackAddress() && !inet6Address.isLinkLocalAddress()) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    arrayList = new ArrayList();
                    for (Object obj2 : m3031X) {
                        if (obj2 instanceof Inet4Address) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                throw new UnknownHostException("No " + enumC1342um.name() + " address for " + str);
        }
    }

    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    public Object mo35f(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        switch (this.f343e) {
            case 7:
                Object mo35f = ((C1828j) this.f344f).mo35f(new C1707h(new Object(), interfaceC1704e, (C0990jb) this.f345g, 0), interfaceC2313c);
                if (mo35f != EnumC2465a.f13750e) {
                    return C1694m.f10482a;
                }
                return mo35f;
            default:
                Object mo35f2 = ((InterfaceC1702d) this.f344f).mo35f(new C0600d0(6, interfaceC1704e, (C2125f0) this.f345g), interfaceC2313c);
                if (mo35f2 != EnumC2465a.f13750e) {
                    return C1694m.f10482a;
                }
                return mo35f2;
        }
    }

    @Override // p170w1.InterfaceC3746y0
    /* renamed from: g */
    public void mo143g(View view, float[] fArr) {
        C0647c0.m1353d(fArr);
        m137E(view, fArr);
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: h */
    public int mo144h(int i7) {
        do {
            i7 = ((C2065f) this.f345g).m3270j(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f344f).charAt(i7)));
        return i7;
    }

    @Override // p093m0.InterfaceC2528i0
    /* renamed from: i */
    public List mo145i(Integer num) {
        List mo145i = ((InterfaceC2528i0) this.f344f).mo145i(null);
        C2350d2 c2350d2 = (C2350d2) this.f345g;
        int i7 = c2350d2.f13380v;
        if (i7 < 0) {
            return mo145i;
        }
        return AbstractC1805m.m3058v0(AbstractC2072e.m3328d(c2350d2, num, i7, Integer.valueOf(c2350d2.m3748D(c2350d2.f13360b, i7))), mo145i);
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: j */
    public int mo146j(int i7) {
        do {
            i7 = ((C2065f) this.f345g).m3269i(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f344f).charAt(i7 - 1)));
        return i7;
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: k */
    public boolean mo147k(CharSequence charSequence, int i7, int i8, C2573w c2573w) {
        Spannable spannableString;
        if ((c2573w.f13973c & 4) > 0) {
            return true;
        }
        if (((C2576z) this.f344f) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f344f = new C2576z(spannableString);
        }
        ((C0129l) this.f345g).getClass();
        ((C2576z) this.f344f).setSpan(new C2574x(c2573w), i7, i8, 33);
        return true;
    }

    @Override // p153u0.InterfaceC3342i
    /* renamed from: l */
    public Object mo148l(Object obj) {
        return ((InterfaceC3279c) this.f345g).mo23f(obj);
    }

    @Override // p023c5.InterfaceC0409a
    /* renamed from: n */
    public void mo42n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0406p c0406p = (C0406p) it.next();
            ViewfinderView viewfinderView = ((DecoratedBarcodeView) this.f345g).f1522f;
            if (viewfinderView.f1531k.size() < 20) {
                viewfinderView.f1531k.add(c0406p);
            }
        }
        ((InterfaceC0409a) this.f344f).mo42n(list);
    }

    @Override // p146t1.InterfaceC3206h1
    /* renamed from: o */
    public void mo149o(C2218t0 c2218t0) {
        int i7;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f345g;
        linkedHashMap.clear();
        Iterator it = c2218t0.iterator();
        while (true) {
            C0303j c0303j = (C0303j) it;
            if (c0303j.hasNext()) {
                Object m5177b = ((C3409f0) this.f344f).m5177b(c0303j.next());
                Integer num = (Integer) linkedHashMap.get(m5177b);
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                if (i7 == 7) {
                    c0303j.remove();
                } else {
                    linkedHashMap.put(m5177b, Integer.valueOf(i7 + 1));
                }
            } else {
                return;
            }
        }
    }

    @Override // p146t1.InterfaceC3206h1
    /* renamed from: p */
    public boolean mo150p(Object obj, Object obj2) {
        C3409f0 c3409f0 = (C3409f0) this.f344f;
        return AbstractC3367j.m5096a(c3409f0.m5177b(obj), c3409f0.m5177b(obj2));
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: q */
    public int mo151q(int i7) {
        CharSequence charSequence = (CharSequence) this.f344f;
        do {
            i7 = ((C2065f) this.f345g).m3269i(i7);
            if (i7 == -1 || i7 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i7)));
        return i7;
    }

    @Override // p065i2.InterfaceC2063d
    /* renamed from: r */
    public int mo152r(int i7) {
        do {
            i7 = ((C2065f) this.f345g).m3270j(i7);
            if (i7 == -1 || i7 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f344f).charAt(i7 - 1)));
        return i7;
    }

    /* renamed from: s */
    public C2459w m153s(List list) {
        InterfaceC2443g interfaceC2443g;
        Exception e7;
        long m2558b;
        InterfaceC2443g interfaceC2443g2;
        C1602n0 c1602n0 = null;
        try {
            int size = list.size();
            int i7 = 0;
            interfaceC2443g = null;
            while (i7 < size) {
                try {
                    interfaceC2443g2 = (InterfaceC2443g) list.get(i7);
                } catch (Exception e8) {
                    e7 = e8;
                }
                try {
                    interfaceC2443g2.mo786a((C2444h) this.f344f);
                    i7++;
                    interfaceC2443g = interfaceC2443g2;
                } catch (Exception e9) {
                    e7 = e9;
                    interfaceC2443g = interfaceC2443g2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((C2444h) this.f344f).f13692a.m3262b());
                    sb2.append(", composition=");
                    sb2.append(((C2444h) this.f344f).m4014c());
                    sb2.append(", selection=");
                    C2444h c2444h = (C2444h) this.f344f;
                    sb2.append((Object) C1602n0.m2591g(AbstractC1586f0.m2558b(c2444h.f13693b, c2444h.f13694c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC1805m.m3050n0(list, sb, new C0310q(18, interfaceC2443g, this), 60);
                    String sb3 = sb.toString();
                    AbstractC3367j.m5099d(sb3, "toString(...)");
                    throw new RuntimeException(sb3, e7);
                }
            }
            C2444h c2444h2 = (C2444h) this.f344f;
            c2444h2.getClass();
            C1587g c1587g = new C1587g(c2444h2.f13692a.toString());
            C2444h c2444h3 = (C2444h) this.f344f;
            long m2558b2 = AbstractC1586f0.m2558b(c2444h3.f13693b, c2444h3.f13694c);
            C1602n0 c1602n02 = new C1602n0(m2558b2);
            if (!C1602n0.m2590f(((C2459w) this.f345g).f13724b)) {
                c1602n0 = c1602n02;
            }
            if (c1602n0 != null) {
                m2558b = c1602n0.f10304a;
            } else {
                m2558b = AbstractC1586f0.m2558b(C1602n0.m2588d(m2558b2), C1602n0.m2589e(m2558b2));
            }
            C2459w c2459w = new C2459w(c1587g, m2558b, ((C2444h) this.f344f).m4014c());
            this.f345g = c2459w;
            return c2459w;
        } catch (Exception e10) {
            interfaceC2443g = null;
            e7 = e10;
        }
    }

    /* renamed from: t */
    public float m154t(C0107c c0107c, C0107c c0107c2) {
        int i7 = (int) c0107c.f1390a;
        int i8 = (int) c0107c.f1391b;
        int i9 = (int) c0107c2.f1390a;
        int i10 = (int) c0107c2.f1391b;
        float m136D = m136D(i7, i8, i9, i10);
        float m136D2 = m136D((int) c0107c2.f1390a, i10, (int) c0107c.f1390a, i8);
        if (Float.isNaN(m136D)) {
            return m136D2 / 7.0f;
        }
        if (Float.isNaN(m136D2)) {
            return m136D / 7.0f;
        }
        return (m136D + m136D2) / 14.0f;
    }

    public String toString() {
        switch (this.f343e) {
            case AbstractC3122c.f15759d /* 6 */:
                return "Bounds{lower=" + ((C0274b) this.f344f) + " upper=" + ((C0274b) this.f345g) + "}";
            case 27:
                Formatter formatter = new Formatter();
                try {
                    int i7 = 0;
                    for (C3587a c3587a : (C3587a[]) this.f345g) {
                        if (c3587a == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i7));
                            i7++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i7), Integer.valueOf(c3587a.f17230f), Integer.valueOf(c3587a.f17229e));
                            i7++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            default:
                return super.toString();
        }
    }

    /* renamed from: v */
    public C0105a m155v(float f7, int i7, int i8, float f8) {
        int i9;
        C0105a m208b;
        C0105a m208b2;
        int i10 = (int) (f8 * f7);
        int max = Math.max(0, i7 - i10);
        C2069b c2069b = (C2069b) this.f344f;
        int min = Math.min(c2069b.f12258e - 1, i7 + i10) - max;
        float f9 = 3.0f * f7;
        if (min >= f9) {
            int max2 = Math.max(0, i8 - i10);
            int min2 = Math.min(c2069b.f12259f - 1, i8 + i10) - max2;
            if (min2 >= f9) {
                C2069b c2069b2 = (C2069b) this.f344f;
                C0106b c0106b = new C0106b(c2069b2, max, max2, min, min2, f7, (InterfaceC0407q) this.f345g);
                int i11 = c0106b.f481e;
                int i12 = c0106b.f479c;
                int i13 = i11 + i12;
                int i14 = c0106b.f482f;
                int i15 = (i14 / 2) + c0106b.f480d;
                int[] iArr = new int[3];
                for (int i16 = 0; i16 < i14; i16++) {
                    if ((i16 & 1) == 0) {
                        i9 = (i16 + 1) / 2;
                    } else {
                        i9 = -((i16 + 1) / 2);
                    }
                    int i17 = i9 + i15;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i18 = i12;
                    while (i18 < i13 && !c2069b2.m3313b(i18, i17)) {
                        i18++;
                    }
                    int i19 = 0;
                    while (i18 < i13) {
                        if (c2069b2.m3313b(i18, i17)) {
                            if (i19 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i19 == 2) {
                                if (c0106b.m207a(iArr) && (m208b2 = c0106b.m208b(i17, i18, iArr)) != null) {
                                    return m208b2;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i19 = 1;
                            } else {
                                i19++;
                                iArr[i19] = iArr[i19] + 1;
                            }
                        } else {
                            if (i19 == 1) {
                                i19++;
                            }
                            iArr[i19] = iArr[i19] + 1;
                        }
                        i18++;
                    }
                    if (c0106b.m207a(iArr) && (m208b = c0106b.m208b(i17, i13, iArr)) != null) {
                        return m208b;
                    }
                }
                ArrayList arrayList = c0106b.f478b;
                if (!arrayList.isEmpty()) {
                    return (C0105a) arrayList.get(0);
                }
                throw C0400j.m878a();
            }
            throw C0400j.m878a();
        }
        throw C0400j.m878a();
    }

    /* renamed from: w */
    public C3587a m156w(int i7) {
        C3587a c3587a;
        C3587a c3587a2;
        C3587a[] c3587aArr = (C3587a[]) this.f345g;
        C3587a c3587a3 = c3587aArr[m158y(i7)];
        if (c3587a3 != null) {
            return c3587a3;
        }
        for (int i8 = 1; i8 < 5; i8++) {
            int m158y = m158y(i7) - i8;
            if (m158y >= 0 && (c3587a2 = c3587aArr[m158y]) != null) {
                return c3587a2;
            }
            int m158y2 = m158y(i7) + i8;
            if (m158y2 < c3587aArr.length && (c3587a = c3587aArr[m158y2]) != null) {
                return c3587a;
            }
        }
        return null;
    }

    /* renamed from: x */
    public InterfaceC3217l0 m157x() {
        return (InterfaceC3217l0) ((C2361g1) this.f345g).getValue();
    }

    /* renamed from: y */
    public int m158y(int i7) {
        return i7 - ((C3589c) this.f344f).f17239h;
    }

    /* renamed from: z */
    public boolean m159z(C0406p c0406p) {
        float f7 = c0406p.f1390a;
        if (f7 >= 0.0f) {
            C2069b c2069b = (C2069b) this.f344f;
            if (f7 <= c2069b.f12258e - 1) {
                float f8 = c0406p.f1391b;
                if (f8 > 0.0f && f8 <= c2069b.f12259f - 1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ C0068q2(int i7, boolean z7) {
        this.f343e = i7;
    }

    public C0068q2(C3502g0 c3502g0, InterfaceC3217l0 interfaceC3217l0) {
        this.f343e = 24;
        this.f344f = c3502g0;
        this.f345g = AbstractC2418w.m3980x(interfaceC3217l0);
    }

    public C0068q2(C3589c c3589c) {
        this.f343e = 27;
        this.f344f = new C3589c(c3589c);
        this.f345g = new C3587a[(c3589c.f17240i - c3589c.f17239h) + 1];
    }

    public C0068q2(AbstractC3642y abstractC3642y, C0028g2 c0028g2, C3639v c3639v) {
        this.f343e = 21;
        this.f344f = abstractC3642y;
        this.f345g = c0028g2;
    }

    public C0068q2(DecoratedBarcodeView decoratedBarcodeView, InterfaceC0409a interfaceC0409a) {
        this.f343e = 2;
        this.f345g = decoratedBarcodeView;
        this.f344f = interfaceC0409a;
    }

    public C0068q2(C2069b c2069b, int i7) {
        this.f343e = i7;
        switch (i7) {
            case 18:
                this.f344f = c2069b;
                this.f345g = new C2177a(c2069b);
                return;
            default:
                this.f344f = c2069b;
                return;
        }
    }

    public C0068q2(C3409f0 c3409f0) {
        this.f343e = 23;
        this.f344f = c3409f0;
        this.f345g = new LinkedHashMap();
    }

    public C0068q2(int i7) {
        this.f343e = i7;
        switch (i7) {
            case 13:
                this.f344f = new C0129l(27);
                this.f345g = new C2213r(16);
                return;
            case 14:
                this.f344f = new C2194h0();
                this.f345g = new C2194h0();
                return;
            case 26:
                this.f344f = new C2705e(new C3502g0[16]);
                return;
            case 29:
                this.f344f = new C2705e(new Reference[16]);
                this.f345g = new ReferenceQueue();
                return;
            default:
                this.f344f = new LinkedHashMap();
                this.f345g = new LinkedHashMap();
                return;
        }
    }

    public C0068q2(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f343e = 6;
        lowerBound = bounds.getLowerBound();
        this.f344f = C0274b.m582c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f345g = C0274b.m582c(upperBound);
    }

    public C0068q2(C2150s c2150s) {
        this.f343e = 11;
        this.f345g = c2150s;
        this.f344f = new C2008t5(1, c2150s);
    }

    public C0068q2(float[] fArr) {
        this.f343e = 28;
        this.f344f = fArr;
        this.f345g = new int[2];
    }
}
