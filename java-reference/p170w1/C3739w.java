package p170w1;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0203o;
import com.paoman.lema.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p000a.AbstractC0000a;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p019c1.C0368l;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0488u;
import p028d2.C0468a;
import p028d2.C0473f;
import p028d2.C0474g;
import p028d2.C0475h;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0483p;
import p028d2.C0490w;
import p029d3.AbstractC0495b;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p043f2.EnumC1533a;
import p050g2.AbstractC1589h;
import p050g2.AbstractC1599m;
import p050g2.C1583e;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1597l;
import p050g2.C1598l0;
import p050g2.C1606p0;
import p050g2.C1608q0;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p059h3.AbstractC1776b;
import p059h3.C1778d;
import p059h3.C1781g;
import p059h3.C1782h;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p077k.AbstractC2201l;
import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p077k.C2194h0;
import p077k.C2216s0;
import p077k.C2219u;
import p077k.C2220v;
import p080k2.C2298i;
import p080k2.C2300k;
import p084l.AbstractC2334a;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p103n2.C2714b;
import p110o2.C2810g;
import p132r2.C3029c;
import p132r2.C3038l;
import p132r2.C3040n;
import p132r2.C3042p;
import p132r2.InterfaceC3041o;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3191c1;
import p146t1.InterfaceC3238v;
import p149t4.AbstractC3269f;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.C3502g0;
import p163v2.AbstractC3569i;
import p174w5.AbstractC3784a;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.w */
/* loaded from: classes.dex */
public final class C3739w extends C0019e1 {

    /* renamed from: f */
    public final /* synthetic */ C3653a0 f17797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3739w(C3653a0 c3653a0) {
        super(20, false);
        this.f17797f = c3653a0;
    }

    @Override // p001a0.C0019e1
    /* renamed from: g */
    public final void mo36g(int i7, C1782h c1782h, String str, Bundle bundle) {
        this.f17797f.m5637c(i7, c1782h, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0832, code lost:
    
        if (r6 == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        if (p028d2.C0482o.m1038j(4, r7).isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0813 A[LOOP:9: B:382:0x07f6->B:391:0x0813, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0819 A[EDGE_INSN: B:392:0x0819->B:393:0x0819 BREAK  A[LOOP:9: B:382:0x07f6->B:391:0x0813], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0616  */
    /* JADX WARN: Type inference failed for: r2v74, types: [h5.u] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.util.ArrayList] */
    @Override // p001a0.C0019e1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1782h mo37h(int i7) {
        EnumC0203o enumC0203o;
        Integer num;
        AccessibilityManager accessibilityManager;
        C2216s0 c2216s0;
        boolean z7;
        C3653a0 c3653a0;
        C3728t c3728t;
        C2219u c2219u;
        C0482o c0482o;
        C2194h0 c2194h0;
        C3502g0 c3502g0;
        C0474g c0474g;
        C0477j c0477j;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C1782h c1782h;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C0474g c0474g2;
        int i8;
        String str;
        C1782h c1782h2;
        int i9;
        Object m3592g;
        Integer num2;
        int i10;
        C3653a0 c3653a02;
        boolean z8;
        Object m3592g2;
        boolean z9;
        C3728t c3728t2;
        Bundle bundle;
        C1782h c1782h3;
        AbstractC3569i m5698y;
        boolean z10;
        boolean z11;
        boolean z12;
        C3502g0 c3502g02;
        boolean z13;
        C1778d c1778d;
        boolean z14;
        C1778d c1778d2;
        boolean z15;
        String str2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC3041o interfaceC3041o;
        InterfaceC3041o interfaceC3041o2;
        C2300k c2300k;
        int i11;
        int i12;
        boolean z26;
        C0482o c0482o2;
        int i13;
        View view;
        boolean z27;
        C0216v mo415g;
        C3653a0 c3653a03 = this.f17797f;
        AccessibilityManager accessibilityManager2 = c3653a03.f17457g;
        C3728t c3728t3 = c3653a03.f17454d;
        C3696l viewTreeOwners = c3728t3.getViewTreeOwners();
        if (viewTreeOwners != null && (mo415g = viewTreeOwners.f17587a.mo415g()) != null) {
            enumC0203o = mo415g.f881c;
        } else {
            enumC0203o = null;
        }
        if (enumC0203o == EnumC0203o.f863e) {
            if (!accessibilityManager2.isEnabled()) {
                c1782h3 = new C1782h(AccessibilityNodeInfo.obtain());
                i9 = i7;
                c3653a02 = c3653a03;
                if (c3653a02.f17468r) {
                    if (i9 == c3653a02.f17464n) {
                        c3653a02.f17466p = c1782h3;
                    }
                    if (i9 == c3653a02.f17465o) {
                        c3653a02.f17467q = c1782h3;
                    }
                }
                return c1782h3;
            }
            c1782h3 = null;
            i9 = i7;
            c3653a02 = c3653a03;
            if (c3653a02.f17468r) {
            }
            return c1782h3;
        }
        C0483p c0483p = (C0483p) c3653a03.m5647m().m3612b(i7);
        if (c0483p == null) {
            if (!accessibilityManager2.isEnabled()) {
                c1782h3 = new C1782h(AccessibilityNodeInfo.obtain());
                i9 = i7;
                c3653a02 = c3653a03;
                if (c3653a02.f17468r) {
                }
                return c1782h3;
            }
            c1782h3 = null;
            i9 = i7;
            c3653a02 = c3653a03;
            if (c3653a02.f17468r) {
            }
            return c1782h3;
        }
        C0482o c0482o3 = c0483p.f1698a;
        C0477j m1048k = c0482o3.m1048k();
        C3502g0 c3502g03 = c0482o3.f1693c;
        Object m3592g3 = m1048k.f1683e.m3592g(AbstractC0487t.f1753n);
        if (m3592g3 == null) {
            m3592g3 = null;
        }
        boolean m5096a = AbstractC3367j.m5096a(m3592g3, Boolean.TRUE);
        if (m5096a) {
            if (Build.VERSION.SDK_INT >= 34) {
                z27 = AbstractC1776b.m2943e(accessibilityManager2);
            } else {
                z27 = true;
            }
            if (!z27) {
                i9 = i7;
                c3653a02 = c3653a03;
                c1782h3 = null;
                if (c3653a02.f17468r) {
                }
                return c1782h3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1782h c1782h4 = new C1782h(obtain);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            AbstractC1776b.m2945g(obtain, m5096a);
        } else {
            c1782h4.m2959f(64, m5096a);
        }
        if (i7 == -1) {
            Object parentForAccessibility = c3728t3.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            } else {
                view = null;
            }
            c1782h4.f10827b = -1;
            obtain.setParent(view);
        } else {
            C0482o m1049l = c0482o3.m1049l();
            if (m1049l != null) {
                num = Integer.valueOf(m1049l.f1697g);
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == c3728t3.getSemanticsOwner().m1055a().f1697g) {
                    intValue = -1;
                }
                c1782h4.f10827b = intValue;
                obtain.setParent(c3728t3, intValue);
            } else {
                AbstractC3088a.m4751c("semanticsNode " + i7 + " has null parent");
                throw new RuntimeException();
            }
        }
        c1782h4.f10828c = i7;
        obtain.setSource(c3728t3, i7);
        obtain.setBoundsInScreen(c3653a03.m5638d(c0483p));
        C2219u c2219u2 = c3653a03.f17450M;
        C2216s0 c2216s02 = c3653a03.f17472v;
        Resources resources = c3728t3.getContext().getResources();
        c1782h4.m2960g("android.view.View");
        C0477j c0477j2 = c0482o3.f1694d;
        C2194h0 c2194h02 = c0477j2.f1683e;
        if (c2194h02.m3588c(AbstractC0487t.f1729E)) {
            c1782h4.m2960g("android.widget.EditText");
        }
        if (c2194h02.m3588c(AbstractC0487t.f1725A)) {
            c1782h4.m2960g("android.widget.TextView");
        }
        Object m3592g4 = c2194h02.m3592g(AbstractC0487t.f1763x);
        if (m3592g4 == null) {
            m3592g4 = null;
        }
        C0474g c0474g3 = (C0474g) m3592g4;
        if (c0474g3 != null) {
            int i15 = c0474g3.f1652a;
            accessibilityManager = accessibilityManager2;
            if (!c0482o3.f1695e) {
                i13 = 4;
                c2216s0 = c2216s02;
            } else {
                i13 = 4;
                c2216s0 = c2216s02;
            }
            if (i15 == i13) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
            } else if (i15 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
            } else {
                String m5680A = AbstractC3681h0.m5680A(i15);
                if (i15 != 5 || c0482o3.m1052o() || c0477j2.f1685g) {
                    c1782h4.m2960g(m5680A);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            c2216s0 = c2216s02;
        }
        obtain.setPackageName(c3728t3.getContext().getPackageName());
        obtain.setImportantForAccessibility(AbstractC0485r.m1062f(c0482o3));
        if (i14 >= 34) {
            z7 = AbstractC1776b.m2943e(accessibilityManager);
        } else {
            z7 = true;
        }
        List m1038j = C0482o.m1038j(4, c0482o3);
        int size = m1038j.size();
        boolean z28 = z7;
        int i16 = 0;
        int i17 = 0;
        while (i17 < size) {
            int i18 = size;
            C0482o c0482o4 = (C0482o) m1038j.get(i17);
            List list = m1038j;
            AbstractC2201l m5647m = c3653a03.m5647m();
            int i19 = i17;
            int i20 = c0482o4.f1697g;
            if (m5647m.m3611a(i20)) {
                AbstractC3569i abstractC3569i = c3728t3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c0482o4.f1693c);
                if (i20 != -1) {
                    if (abstractC3569i != null) {
                        obtain.addChild(abstractC3569i);
                    } else {
                        C0483p c0483p2 = (C0483p) c3653a03.m5647m().m3612b(i20);
                        if (c0483p2 != null && (c0482o2 = c0483p2.f1698a) != null) {
                            Object m3592g5 = c0482o2.m1048k().f1683e.m3592g(AbstractC0487t.f1753n);
                            if (m3592g5 == null) {
                                m3592g5 = null;
                            }
                            z26 = AbstractC3367j.m5096a(m3592g5, Boolean.TRUE);
                        } else {
                            z26 = false;
                        }
                        if (z28 || !z26) {
                            obtain.addChild(c3728t3, i20);
                        }
                    }
                    c2219u2.m3642f(i20, i16);
                    i16++;
                }
            }
            i17 = i19 + 1;
            m1038j = list;
            size = i18;
        }
        int i21 = c3653a03.f17464n;
        AccessibilityNodeInfo accessibilityNodeInfo3 = c1782h4.f10826a;
        if (i7 == i21) {
            accessibilityNodeInfo3.setAccessibilityFocused(true);
            c1782h4.m2955a(C1778d.f10815d);
        } else {
            accessibilityNodeInfo3.setAccessibilityFocused(false);
            c1782h4.m2955a(C1778d.f10814c);
        }
        C1587g m5691r = AbstractC3681h0.m5691r(c0482o3);
        if (m5691r != null) {
            c3728t3.getFontFamilyResolver();
            InterfaceC3093c density = c3728t3.getDensity();
            C0031h1 c0031h1 = c3653a03.f17446I;
            c3728t = c3728t3;
            String str3 = m5691r.f10239f;
            c3502g0 = c3502g03;
            List list2 = m5691r.f10238e;
            SpannableString spannableString2 = new SpannableString(str3);
            ArrayList arrayList3 = m5691r.f10240g;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                c3653a0 = c3653a03;
                int i22 = 0;
                while (i22 < size2) {
                    ArrayList arrayList4 = arrayList3;
                    C1583e c1583e = (C1583e) arrayList3.get(i22);
                    int i23 = i22;
                    C1588g0 c1588g0 = (C1588g0) c1583e.f10229a;
                    int i24 = size2;
                    int i25 = c1583e.f10230b;
                    int i26 = c1583e.f10231c;
                    C2219u c2219u3 = c2219u2;
                    C0474g c0474g4 = c0474g3;
                    C0477j c0477j3 = c0477j2;
                    long mo4717b = c1588g0.f10242a.mo4717b();
                    AccessibilityNodeInfo accessibilityNodeInfo4 = obtain;
                    C1782h c1782h5 = c1782h4;
                    long j6 = c1588g0.f10243b;
                    C2300k c2300k2 = c1588g0.f10244c;
                    C2298i c2298i = c1588g0.f10245d;
                    C3042p c3042p = c1588g0.f10251j;
                    C2714b c2714b = c1588g0.f10252k;
                    C0482o c0482o5 = c0482o3;
                    C2194h0 c2194h03 = c2194h02;
                    long j7 = c1588g0.f10253l;
                    C3038l c3038l = c1588g0.f10254m;
                    InterfaceC3041o interfaceC3041o3 = c1588g0.f10242a;
                    if (C0677s.m1454c(mo4717b, interfaceC3041o3.mo4717b())) {
                        interfaceC3041o2 = interfaceC3041o3;
                    } else {
                        if (mo4717b != 16) {
                            interfaceC3041o = new C3029c(mo4717b);
                        } else {
                            interfaceC3041o = C3040n.f15609a;
                        }
                        interfaceC3041o2 = interfaceC3041o;
                    }
                    AbstractC2080d.m3383K(spannableString2, interfaceC3041o2.mo4717b(), i25, i26);
                    SpannableString spannableString3 = spannableString2;
                    AbstractC2080d.m3384L(spannableString3, j6, density, i25, i26);
                    if (c2300k2 == null && c2298i == null) {
                        i12 = 33;
                    } else {
                        if (c2300k2 == null) {
                            c2300k = C2300k.f13233h;
                        } else {
                            c2300k = c2300k2;
                        }
                        if (c2298i != null) {
                            i11 = c2298i.f13229a;
                        } else {
                            i11 = 0;
                        }
                        StyleSpan styleSpan = new StyleSpan(AbstractC2064e.m3249w(c2300k, i11));
                        i12 = 33;
                        spannableString3.setSpan(styleSpan, i25, i26, 33);
                    }
                    if (c3038l != null) {
                        int i27 = c3038l.f15607a;
                        if ((i27 | 1) == i27) {
                            spannableString3.setSpan(new UnderlineSpan(), i25, i26, i12);
                        }
                        if ((i27 | 2) == i27) {
                            spannableString3.setSpan(new StrikethroughSpan(), i25, i26, i12);
                        }
                    }
                    if (c3042p != null) {
                        spannableString3.setSpan(new ScaleXSpan(c3042p.f15611a), i25, i26, i12);
                    }
                    AbstractC2080d.m3385M(spannableString3, c2714b, i25, i26);
                    if (j7 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(AbstractC0659i0.m1426z(j7)), i25, i26, i12);
                    }
                    i22 = i23 + 1;
                    spannableString2 = spannableString3;
                    arrayList3 = arrayList4;
                    size2 = i24;
                    c2219u2 = c2219u3;
                    c0477j2 = c0477j3;
                    c0474g3 = c0474g4;
                    c1782h4 = c1782h5;
                    obtain = accessibilityNodeInfo4;
                    c0482o3 = c0482o5;
                    c2194h02 = c2194h03;
                }
            } else {
                c3653a0 = c3653a03;
            }
            c2219u = c2219u2;
            c0482o = c0482o3;
            c2194h0 = c2194h02;
            c0474g = c0474g3;
            c0477j = c0477j2;
            accessibilityNodeInfo = obtain;
            c1782h = c1782h4;
            SpannableString spannableString4 = spannableString2;
            int length = str3.length();
            ?? r22 = C1813u.f10860e;
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    Object obj = list2.get(i28);
                    C1583e c1583e2 = (C1583e) obj;
                    if ((c1583e2.f10229a instanceof C1608q0) && AbstractC1589h.m2570b(0, length, c1583e2.f10230b, c1583e2.f10231c)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r22;
            }
            int size4 = arrayList.size();
            for (int i29 = 0; i29 < size4; i29++) {
                C1583e c1583e3 = (C1583e) arrayList.get(i29);
                C1608q0 c1608q0 = (C1608q0) c1583e3.f10229a;
                int i30 = c1583e3.f10230b;
                int i31 = c1583e3.f10231c;
                if (c1608q0 instanceof C1608q0) {
                    spannableString4.setSpan(new TtsSpan.VerbatimBuilder(c1608q0.f10323a).build(), i30, i31, 33);
                } else {
                    throw new RuntimeException();
                }
            }
            int length2 = str3.length();
            if (list2 != null) {
                arrayList2 = new ArrayList(list2.size());
                int size5 = list2.size();
                for (int i32 = 0; i32 < size5; i32++) {
                    Object obj2 = list2.get(i32);
                    C1583e c1583e4 = (C1583e) obj2;
                    if ((c1583e4.f10229a instanceof C1606p0) && AbstractC1589h.m2570b(0, length2, c1583e4.f10230b, c1583e4.f10231c)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r22;
            }
            int size6 = arrayList2.size();
            for (int i33 = 0; i33 < size6; i33++) {
                C1583e c1583e5 = (C1583e) arrayList2.get(i33);
                C1606p0 c1606p0 = (C1606p0) c1583e5.f10229a;
                int i34 = c1583e5.f10230b;
                int i35 = c1583e5.f10231c;
                WeakHashMap weakHashMap = (WeakHashMap) c0031h1.f152f;
                Object obj3 = weakHashMap.get(c1606p0);
                if (obj3 == null) {
                    obj3 = new URLSpan(c1606p0.f10320a);
                    weakHashMap.put(c1606p0, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i34, i35, 33);
            }
            int length3 = str3.length();
            if (list2 != null) {
                r22 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i36 = 0; i36 < size7; i36++) {
                    Object obj4 = list2.get(i36);
                    C1583e c1583e6 = (C1583e) obj4;
                    if ((c1583e6.f10229a instanceof AbstractC1599m) && AbstractC1589h.m2570b(0, length3, c1583e6.f10230b, c1583e6.f10231c)) {
                        r22.add(obj4);
                    }
                }
            }
            int size8 = r22.size();
            for (int i37 = 0; i37 < size8; i37++) {
                C1583e c1583e7 = (C1583e) r22.get(i37);
                int i38 = c1583e7.f10230b;
                Object obj5 = c1583e7.f10229a;
                int i39 = c1583e7.f10231c;
                if (i38 != i39) {
                    AbstractC1599m abstractC1599m = (AbstractC1599m) obj5;
                    if (abstractC1599m instanceof C1597l) {
                        AbstractC3367j.m5098c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        C1597l c1597l = (C1597l) obj5;
                        C1583e c1583e8 = new C1583e(i38, i39, c1597l);
                        WeakHashMap weakHashMap2 = (WeakHashMap) c0031h1.f153g;
                        Object obj6 = weakHashMap2.get(c1583e8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(c1597l.f10286a);
                            weakHashMap2.put(c1583e8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i38, i39, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) c0031h1.f154h;
                        Object obj7 = weakHashMap3.get(c1583e7);
                        if (obj7 == null) {
                            obj7 = new C2810g(abstractC1599m);
                            weakHashMap3.put(c1583e7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i38, i39, 33);
                    }
                }
            }
            spannableString = (SpannableString) C3653a0.m5626H(spannableString4);
        } else {
            c3653a0 = c3653a03;
            c3728t = c3728t3;
            c2219u = c2219u2;
            c0482o = c0482o3;
            c2194h0 = c2194h02;
            c3502g0 = c3502g03;
            c0474g = c0474g3;
            c0477j = c0477j2;
            accessibilityNodeInfo = obtain;
            c1782h = c1782h4;
            spannableString = null;
        }
        accessibilityNodeInfo3.setText(spannableString);
        C0490w c0490w = AbstractC0487t.f1735K;
        C2194h0 c2194h04 = c2194h0;
        if (c2194h04.m3588c(c0490w)) {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
            accessibilityNodeInfo2.setContentInvalid(true);
            Object m3592g6 = c2194h04.m3592g(c0490w);
            if (m3592g6 == null) {
                m3592g6 = null;
            }
            accessibilityNodeInfo2.setError((CharSequence) m3592g6);
        } else {
            accessibilityNodeInfo2 = accessibilityNodeInfo;
        }
        C0482o c0482o6 = c0482o;
        String m5690q = AbstractC3681h0.m5690q(c0482o6, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0495b.m1078h(accessibilityNodeInfo3, m5690q);
        } else {
            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", m5690q);
        }
        accessibilityNodeInfo2.setCheckable(AbstractC3681h0.m5689p(c0482o6));
        Object m3592g7 = c2194h04.m3592g(AbstractC0487t.f1733I);
        if (m3592g7 == null) {
            m3592g7 = null;
        }
        EnumC1533a enumC1533a = (EnumC1533a) m3592g7;
        if (enumC1533a != null) {
            if (enumC1533a == EnumC1533a.f10090e) {
                accessibilityNodeInfo3.setChecked(true);
            } else if (enumC1533a == EnumC1533a.f10091f) {
                accessibilityNodeInfo3.setChecked(false);
            }
        }
        Object m3592g8 = c2194h04.m3592g(AbstractC0487t.f1732H);
        if (m3592g8 == null) {
            m3592g8 = null;
        }
        Boolean bool = (Boolean) m3592g8;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (c0474g == null) {
                c0474g2 = c0474g;
                i8 = 4;
            } else {
                c0474g2 = c0474g;
                i8 = 4;
                if (c0474g2.f1652a == 4) {
                    accessibilityNodeInfo2.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo3.setChecked(booleanValue);
        } else {
            c0474g2 = c0474g;
            i8 = 4;
        }
        C0477j c0477j4 = c0477j;
        if (!c0477j4.f1685g || C0482o.m1038j(i8, c0482o6).isEmpty()) {
            Object m3592g9 = c2194h04.m3592g(AbstractC0487t.f1740a);
            if (m3592g9 == null) {
                m3592g9 = null;
            }
            List list3 = (List) m3592g9;
            if (list3 != null) {
                str = (String) AbstractC1805m.m3047k0(list3);
            } else {
                str = null;
            }
            accessibilityNodeInfo2.setContentDescription(str);
        }
        Object m3592g10 = c2194h04.m3592g(AbstractC0487t.f1764y);
        if (m3592g10 == null) {
            m3592g10 = null;
        }
        String str4 = (String) m3592g10;
        if (str4 != null) {
            C0482o c0482o7 = c0482o6;
            while (true) {
                if (c0482o7 != null) {
                    C0477j c0477j5 = c0482o7.f1694d;
                    C0490w c0490w2 = AbstractC0488u.f1766a;
                    if (c0477j5.f1683e.m3588c(c0490w2)) {
                        z25 = ((Boolean) c0477j5.m1034b(c0490w2)).booleanValue();
                        break;
                    }
                    c0482o7 = c0482o7.m1049l();
                } else {
                    z25 = false;
                    break;
                }
            }
            if (z25) {
                accessibilityNodeInfo2.setViewIdResourceName(str4);
            }
        }
        Object m3592g11 = c2194h04.m3592g(AbstractC0487t.f1747h);
        if (m3592g11 == null) {
            m3592g11 = null;
        }
        if (((C1694m) m3592g11) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo3.setHeading(true);
            } else {
                c1782h2 = c1782h;
                c1782h2.m2959f(2, true);
                i9 = i7;
                if (i9 != -1) {
                    int m3640d = c2219u.m3640d(c0482o6.f1697g);
                    if (m3640d != -1) {
                        accessibilityNodeInfo2.setDrawingOrder(m3640d);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo2.setPassword(c2194h04.m3588c(AbstractC0487t.f1734J));
                accessibilityNodeInfo2.setEditable(c2194h04.m3588c(AbstractC0487t.f1737M));
                m3592g = c2194h04.m3592g(AbstractC0487t.f1738N);
                if (m3592g == null) {
                    m3592g = null;
                }
                num2 = (Integer) m3592g;
                if (num2 == null) {
                    i10 = num2.intValue();
                } else {
                    i10 = -1;
                }
                accessibilityNodeInfo2.setMaxTextLength(i10);
                accessibilityNodeInfo2.setEnabled(AbstractC3681h0.m5681h(c0482o6));
                C0490w c0490w3 = AbstractC0487t.f1750k;
                accessibilityNodeInfo2.setFocusable(c2194h04.m3588c(c0490w3));
                if (!accessibilityNodeInfo2.isFocusable()) {
                    accessibilityNodeInfo2.setFocused(((Boolean) c0477j4.m1034b(c0490w3)).booleanValue());
                    if (accessibilityNodeInfo2.isFocused()) {
                        accessibilityNodeInfo3.addAction(2);
                        c3653a02 = c3653a0;
                        c3653a02.f17465o = i9;
                    } else {
                        c3653a02 = c3653a0;
                        z8 = true;
                        accessibilityNodeInfo3.addAction(1);
                        accessibilityNodeInfo3.setVisibleToUser(AbstractC0485r.m1061e(c0482o6) ^ z8);
                        m3592g2 = c2194h04.m3592g(AbstractC0487t.f1749j);
                        if (m3592g2 == null) {
                            m3592g2 = null;
                        }
                        if (m3592g2 == null) {
                            accessibilityNodeInfo3.setClickable(false);
                            C0468a c0468a = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1658b);
                            if (c0468a != null) {
                                boolean m5096a2 = AbstractC3367j.m5096a(AbstractC0485r.m1060d(c0477j4, AbstractC0487t.f1732H), Boolean.TRUE);
                                if (c0474g2 == null || c0474g2.f1652a != 4) {
                                    z21 = false;
                                } else {
                                    z21 = true;
                                }
                                if (!z21) {
                                    if (c0474g2 == null || c0474g2.f1652a != 3) {
                                        z24 = false;
                                    } else {
                                        z24 = true;
                                    }
                                    if (!z24) {
                                        z22 = false;
                                        if (!z22 && (!z22 || m5096a2)) {
                                            z23 = false;
                                        } else {
                                            z23 = true;
                                        }
                                        accessibilityNodeInfo3.setClickable(z23);
                                        if (AbstractC3681h0.m5681h(c0482o6) && accessibilityNodeInfo2.isClickable()) {
                                            c1782h2.m2955a(new C1778d(c0468a.f1638a, 16));
                                        }
                                    }
                                }
                                z22 = true;
                                if (!z22) {
                                }
                                z23 = true;
                                accessibilityNodeInfo3.setClickable(z23);
                                if (AbstractC3681h0.m5681h(c0482o6)) {
                                    c1782h2.m2955a(new C1778d(c0468a.f1638a, 16));
                                }
                            }
                            accessibilityNodeInfo3.setLongClickable(false);
                            C0468a c0468a2 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1659c);
                            if (c0468a2 != null) {
                                accessibilityNodeInfo3.setLongClickable(true);
                                if (AbstractC3681h0.m5681h(c0482o6)) {
                                    c1782h2.m2955a(new C1778d(c0468a2.f1638a, 32));
                                }
                            }
                            C0468a c0468a3 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1672p);
                            if (c0468a3 != null) {
                                c1782h2.m2955a(new C1778d(c0468a3.f1638a, 16384));
                            }
                            if (AbstractC3681h0.m5681h(c0482o6)) {
                                C0468a c0468a4 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1666j);
                                if (c0468a4 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a4.f1638a, 2097152));
                                }
                                C0468a c0468a5 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1671o);
                                if (c0468a5 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a5.f1638a, android.R.id.accessibilityActionImeEnter));
                                }
                                C0468a c0468a6 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1673q);
                                if (c0468a6 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a6.f1638a, 65536));
                                }
                                C0468a c0468a7 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1674r);
                                if (c0468a7 != null && accessibilityNodeInfo2.isFocused()) {
                                    ClipDescription primaryClipDescription = c3728t.getClipboardManager().f17534a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        z20 = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        z20 = false;
                                    }
                                    if (z20) {
                                        c1782h2.m2955a(new C1778d(c0468a7.f1638a, 32768));
                                    }
                                }
                            }
                            String m5627n = C3653a0.m5627n(c0482o6);
                            if (m5627n != null && m5627n.length() != 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                accessibilityNodeInfo2.setTextSelection(c3653a02.m5646l(c0482o6), c3653a02.m5645k(c0482o6));
                                C0468a c0468a8 = (C0468a) AbstractC0485r.m1060d(c0477j4, AbstractC0476i.f1665i);
                                if (c0468a8 != null) {
                                    str2 = c0468a8.f1638a;
                                } else {
                                    str2 = null;
                                }
                                c1782h2.m2955a(new C1778d(str2, 131072));
                                accessibilityNodeInfo3.addAction(256);
                                accessibilityNodeInfo3.addAction(512);
                                accessibilityNodeInfo3.setMovementGranularities(11);
                                List list4 = (List) AbstractC0485r.m1060d(c0477j4, AbstractC0487t.f1740a);
                                if (list4 != null && !list4.isEmpty()) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                if (z16 && c2194h04.m3588c(AbstractC0476i.f1657a)) {
                                    if (!c2194h04.m3588c(AbstractC0487t.f1729E) || AbstractC3367j.m5096a(AbstractC0485r.m1060d(c0477j4, c0490w3), Boolean.TRUE)) {
                                        C3502g0 m5447u = c3502g0.m5447u();
                                        while (true) {
                                            if (m5447u != null) {
                                                C0477j m5449w = m5447u.m5449w();
                                                if (m5449w != null && m5449w.f1685g) {
                                                    if (m5449w.f1683e.m3588c(AbstractC0487t.f1729E)) {
                                                        z19 = true;
                                                        if (!z19) {
                                                            break;
                                                        }
                                                        m5447u = m5447u.m5447u();
                                                    }
                                                }
                                                z19 = false;
                                                if (!z19) {
                                                }
                                            } else {
                                                m5447u = null;
                                                break;
                                            }
                                        }
                                        if (m5447u != null) {
                                            C0477j m5449w2 = m5447u.m5449w();
                                            if (m5449w2 != null) {
                                                Object m3592g12 = m5449w2.f1683e.m3592g(c0490w3);
                                                if (m3592g12 == null) {
                                                    m3592g12 = null;
                                                }
                                                z18 = AbstractC3367j.m5096a(m3592g12, Boolean.TRUE);
                                            } else {
                                                z18 = false;
                                            }
                                        }
                                        z17 = false;
                                        if (!z17) {
                                            accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                        }
                                    }
                                    z17 = true;
                                    if (!z17) {
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add("androidx.compose.ui.semantics.id");
                                CharSequence m2958e = c1782h2.m2958e();
                                if (m2958e != null && m2958e.length() != 0) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (!z15 && c2194h04.m3588c(AbstractC0476i.f1657a)) {
                                    arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c2194h04.m3588c(AbstractC0487t.f1764y)) {
                                    arrayList5.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (c2194h04.m3588c(AbstractC0487t.f1739O)) {
                                    arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                    accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                                }
                            }
                            C0473f c0473f = (C0473f) AbstractC0485r.m1060d(c0477j4, AbstractC0487t.f1742c);
                            if (c0473f != null) {
                                float f7 = c0473f.f1650a;
                                C0490w c0490w4 = AbstractC0476i.f1664h;
                                if (c2194h04.m3588c(c0490w4)) {
                                    c1782h2.m2960g("android.widget.SeekBar");
                                } else {
                                    c1782h2.m2960g("android.widget.ProgressBar");
                                }
                                C0473f c0473f2 = C0473f.f1649c;
                                if (c0473f != C0473f.f1649c) {
                                    accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C1781g(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(c0473f.m1031a().f18161a).floatValue(), Float.valueOf(c0473f.m1031a().f18162b).floatValue(), f7)).f10824a);
                                }
                                if (c0482o6.m1050m().f1683e.m3588c(c0490w4) && AbstractC3681h0.m5681h(c0482o6)) {
                                    float floatValue = Float.valueOf(c0473f.m1031a().f18162b).floatValue();
                                    float floatValue2 = Float.valueOf(c0473f.m1031a().f18161a).floatValue();
                                    if (floatValue < floatValue2) {
                                        floatValue = floatValue2;
                                    }
                                    if (f7 < floatValue) {
                                        c1782h2.m2955a(C1778d.f10816e);
                                    }
                                    float floatValue3 = Float.valueOf(c0473f.m1031a().f18161a).floatValue();
                                    float floatValue4 = Float.valueOf(c0473f.m1031a().f18162b).floatValue();
                                    if (floatValue3 > floatValue4) {
                                        floatValue3 = floatValue4;
                                    }
                                    if (f7 > floatValue3) {
                                        c1782h2.m2955a(C1778d.f10817f);
                                    }
                                }
                            }
                            int i40 = Build.VERSION.SDK_INT;
                            if (AbstractC3681h0.m5681h(c0482o6)) {
                                Object m3592g13 = c0482o6.f1694d.f1683e.m3592g(AbstractC0476i.f1664h);
                                if (m3592g13 == null) {
                                    m3592g13 = null;
                                }
                                C0468a c0468a9 = (C0468a) m3592g13;
                                if (c0468a9 != null) {
                                    c1782h2.m2955a(new C1778d(null, android.R.id.accessibilityActionSetProgress, c0468a9.f1638a, null));
                                }
                            }
                            AbstractC2168e.m3510D(c0482o6, c1782h2);
                            AbstractC2168e.m3511E(c0482o6, c1782h2);
                            C0475h c0475h = (C0475h) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0487t.f1759t);
                            C0468a c0468a10 = (C0468a) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0476i.f1660d);
                            if (c0475h != null && c0468a10 != null) {
                                Object m3592g14 = c0482o6.m1048k().f1683e.m3592g(AbstractC0487t.f1745f);
                                if (m3592g14 == null) {
                                    m3592g14 = null;
                                }
                                if (m3592g14 == null) {
                                    Object m3592g15 = c0482o6.m1048k().f1683e.m3592g(AbstractC0487t.f1744e);
                                    if (m3592g15 == null) {
                                        m3592g15 = null;
                                    }
                                    if (m3592g15 == null) {
                                        z12 = false;
                                        if (!z12) {
                                            c1782h2.m2960g("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) c0475h.m1032a().mo52a()).floatValue() > 0.0f) {
                                            accessibilityNodeInfo3.setScrollable(true);
                                        }
                                        if (AbstractC3681h0.m5681h(c0482o6)) {
                                            boolean m5630s = C3653a0.m5630s(c0475h);
                                            EnumC3103m enumC3103m = EnumC3103m.f15704f;
                                            if (m5630s) {
                                                c1782h2.m2955a(C1778d.f10816e);
                                                c3502g02 = c3502g0;
                                                if (c3502g02.f16866C == enumC3103m) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (!z14) {
                                                    c1778d2 = C1778d.f10821j;
                                                } else {
                                                    c1778d2 = C1778d.f10819h;
                                                }
                                                c1782h2.m2955a(c1778d2);
                                            } else {
                                                c3502g02 = c3502g0;
                                            }
                                            if (C3653a0.m5629r(c0475h)) {
                                                c1782h2.m2955a(C1778d.f10817f);
                                                if (c3502g02.f16866C == enumC3103m) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (!z13) {
                                                    c1778d = C1778d.f10819h;
                                                } else {
                                                    c1778d = C1778d.f10821j;
                                                }
                                                c1782h2.m2955a(c1778d);
                                            }
                                        }
                                    }
                                }
                                z12 = true;
                                if (!z12) {
                                }
                                if (((Number) c0475h.m1032a().mo52a()).floatValue() > 0.0f) {
                                }
                                if (AbstractC3681h0.m5681h(c0482o6)) {
                                }
                            }
                            C0475h c0475h2 = (C0475h) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0487t.f1760u);
                            if (c0475h2 != null && c0468a10 != null) {
                                Object m3592g16 = c0482o6.m1048k().f1683e.m3592g(AbstractC0487t.f1745f);
                                if (m3592g16 == null) {
                                    m3592g16 = null;
                                }
                                if (m3592g16 == null) {
                                    Object m3592g17 = c0482o6.m1048k().f1683e.m3592g(AbstractC0487t.f1744e);
                                    if (m3592g17 == null) {
                                        m3592g17 = null;
                                    }
                                    if (m3592g17 == null) {
                                        z11 = false;
                                        if (!z11) {
                                            c1782h2.m2960g("android.widget.ScrollView");
                                        }
                                        if (((Number) c0475h2.m1032a().mo52a()).floatValue() > 0.0f) {
                                            accessibilityNodeInfo3.setScrollable(true);
                                        }
                                        if (AbstractC3681h0.m5681h(c0482o6)) {
                                            if (C3653a0.m5630s(c0475h2)) {
                                                c1782h2.m2955a(C1778d.f10816e);
                                                c1782h2.m2955a(C1778d.f10820i);
                                            }
                                            if (C3653a0.m5629r(c0475h2)) {
                                                c1782h2.m2955a(C1778d.f10817f);
                                                c1782h2.m2955a(C1778d.f10818g);
                                            }
                                        }
                                    }
                                }
                                z11 = true;
                                if (!z11) {
                                }
                                if (((Number) c0475h2.m1032a().mo52a()).floatValue() > 0.0f) {
                                }
                                if (AbstractC3681h0.m5681h(c0482o6)) {
                                }
                            }
                            if (i40 >= 29) {
                                AbstractC3681h0.m5685l(c0482o6, c1782h2);
                            }
                            CharSequence charSequence = (CharSequence) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0487t.f1743d);
                            if (i40 >= 28) {
                                accessibilityNodeInfo3.setPaneTitle(charSequence);
                            } else {
                                accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                            }
                            if (AbstractC3681h0.m5681h(c0482o6)) {
                                C0468a c0468a11 = (C0468a) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0476i.f1675s);
                                if (c0468a11 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a11.f1638a, 262144));
                                }
                                C0468a c0468a12 = (C0468a) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0476i.f1676t);
                                if (c0468a12 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a12.f1638a, 524288));
                                }
                                C0468a c0468a13 = (C0468a) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0476i.f1677u);
                                if (c0468a13 != null) {
                                    c1782h2.m2955a(new C1778d(c0468a13.f1638a, 1048576));
                                }
                                C0477j m1050m = c0482o6.m1050m();
                                C0490w c0490w5 = AbstractC0476i.f1679w;
                                if (m1050m.f1683e.m3588c(c0490w5)) {
                                    List list5 = (List) c0482o6.m1050m().m1034b(c0490w5);
                                    int size9 = list5.size();
                                    C2220v c2220v = C3653a0.f17437Q;
                                    if (size9 < c2220v.f12755b) {
                                        C2216s0 c2216s03 = new C2216s0();
                                        C2182b0 m3613a = AbstractC2202l0.m3613a();
                                        C2216s0 c2216s04 = c2216s0;
                                        if (AbstractC2334a.m3710a(c2216s04.f12741g, i9, c2216s04.f12739e) >= 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            C2182b0 c2182b0 = (C2182b0) c2216s04.m3634b(i9);
                                            int[] iArr = c2220v.f12754a;
                                            int i41 = c2220v.f12755b;
                                            int i42 = 0;
                                            int[] iArr2 = new int[16];
                                            int i43 = 0;
                                            while (i43 < i41) {
                                                int i44 = iArr[i43];
                                                int i45 = i41;
                                                int i46 = i42 + 1;
                                                C2182b0 c2182b02 = c2182b0;
                                                if (iArr2.length < i46) {
                                                    int[] copyOf = Arrays.copyOf(iArr2, Math.max(i46, (iArr2.length * 3) / 2));
                                                    AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                                                    iArr2 = copyOf;
                                                }
                                                iArr2[i42] = i44;
                                                i43++;
                                                i42 = i46;
                                                i41 = i45;
                                                c2182b0 = c2182b02;
                                            }
                                            C2182b0 c2182b03 = c2182b0;
                                            ArrayList arrayList6 = new ArrayList();
                                            if (list5.size() <= 0) {
                                                if (arrayList6.size() > 0) {
                                                    AbstractC2487d.m4054r(arrayList6.get(0));
                                                    if (i42 > 0) {
                                                        int i47 = iArr2[0];
                                                        throw null;
                                                    }
                                                    AbstractC2334a.m3713d("Index must be between 0 and size");
                                                    throw null;
                                                }
                                            } else {
                                                AbstractC2487d.m4054r(list5.get(0));
                                                AbstractC3367j.m5097b(c2182b03);
                                                throw null;
                                            }
                                        } else if (list5.size() > 0) {
                                            AbstractC2487d.m4054r(list5.get(0));
                                            c2220v.m3645c(0);
                                            throw null;
                                        }
                                        c3653a02.f17471u.m3635c(i9, c2216s03);
                                        c2216s04.m3635c(i9, m3613a);
                                    } else {
                                        throw new IllegalStateException("Can't have more than " + c2220v.f12755b + " custom actions for one widget");
                                    }
                                }
                            }
                            boolean m5683j = AbstractC3681h0.m5683j(c0482o6, resources);
                            if (Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfo3.setScreenReaderFocusable(m5683j);
                            } else {
                                c1782h2.m2959f(1, m5683j);
                            }
                            int m3640d2 = c3653a02.f17442E.m3640d(i9);
                            if (m3640d2 != -1) {
                                AbstractC3569i m5698y2 = AbstractC3681h0.m5698y(c3728t.getAndroidViewsHandler$ui_release(), m3640d2);
                                if (m5698y2 != null) {
                                    accessibilityNodeInfo3.setTraversalBefore(m5698y2);
                                    c3728t2 = c3728t;
                                } else {
                                    c3728t2 = c3728t;
                                    accessibilityNodeInfo3.setTraversalBefore(c3728t2, m3640d2);
                                }
                                bundle = null;
                                c3653a02.m5637c(i9, c1782h2, c3653a02.f17444G, null);
                            } else {
                                c3728t2 = c3728t;
                                bundle = null;
                            }
                            int m3640d3 = c3653a02.f17443F.m3640d(i9);
                            if (m3640d3 != -1 && (m5698y = AbstractC3681h0.m5698y(c3728t2.getAndroidViewsHandler$ui_release(), m3640d3)) != null) {
                                accessibilityNodeInfo3.setTraversalAfter(m5698y);
                                c3653a02.m5637c(i9, c1782h2, c3653a02.f17445H, bundle);
                            }
                            String str5 = (String) AbstractC0485r.m1060d(c0482o6.m1050m(), AbstractC0488u.f1767b);
                            if (str5 != null) {
                                c1782h2.m2960g(str5);
                            }
                            c1782h3 = c1782h2;
                            if (c3653a02.f17468r) {
                            }
                            return c1782h3;
                        }
                        throw new ClassCastException();
                    }
                } else {
                    c3653a02 = c3653a0;
                }
                z8 = true;
                accessibilityNodeInfo3.setVisibleToUser(AbstractC0485r.m1061e(c0482o6) ^ z8);
                m3592g2 = c2194h04.m3592g(AbstractC0487t.f1749j);
                if (m3592g2 == null) {
                }
                if (m3592g2 == null) {
                }
            }
        }
        c1782h2 = c1782h;
        i9 = i7;
        if (i9 != -1) {
        }
        accessibilityNodeInfo2.setPassword(c2194h04.m3588c(AbstractC0487t.f1734J));
        accessibilityNodeInfo2.setEditable(c2194h04.m3588c(AbstractC0487t.f1737M));
        m3592g = c2194h04.m3592g(AbstractC0487t.f1738N);
        if (m3592g == null) {
        }
        num2 = (Integer) m3592g;
        if (num2 == null) {
        }
        accessibilityNodeInfo2.setMaxTextLength(i10);
        accessibilityNodeInfo2.setEnabled(AbstractC3681h0.m5681h(c0482o6));
        C0490w c0490w32 = AbstractC0487t.f1750k;
        accessibilityNodeInfo2.setFocusable(c2194h04.m3588c(c0490w32));
        if (!accessibilityNodeInfo2.isFocusable()) {
        }
        z8 = true;
        accessibilityNodeInfo3.setVisibleToUser(AbstractC0485r.m1061e(c0482o6) ^ z8);
        m3592g2 = c2194h04.m3592g(AbstractC0487t.f1749j);
        if (m3592g2 == null) {
        }
        if (m3592g2 == null) {
        }
    }

    @Override // p001a0.C0019e1
    /* renamed from: l */
    public final C1782h mo41l(int i7) {
        C3653a0 c3653a0 = this.f17797f;
        if (i7 != 1) {
            if (i7 == 2) {
                return mo37h(c3653a0.f17464n);
            }
            throw new IllegalArgumentException(AbstractC2647h.m4256b("Unknown focus type: ", i7));
        }
        int i8 = c3653a0.f17465o;
        if (i8 == Integer.MIN_VALUE) {
            return null;
        }
        return mo37h(i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x01a9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x06d0, code lost:
    
        if (r0 != 16) goto L520;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:601:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18, types: [w1.c, t4.f] */
    /* JADX WARN: Type inference failed for: r8v24, types: [w1.d, t4.f] */
    @Override // p001a0.C0019e1
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo47s(int i7, int i8, Bundle bundle) {
        C0482o c0482o;
        boolean z7;
        boolean z8;
        int i9;
        Integer num;
        boolean z9;
        boolean z10;
        AbstractC3269f abstractC3269f;
        int[] mo4985e;
        int i10;
        int i11;
        int i12;
        int length;
        C1598l0 m5693t;
        Object obj;
        InterfaceC3277a interfaceC3277a;
        int i13;
        Object obj2;
        InterfaceC3277a interfaceC3277a2;
        Boolean bool;
        InterfaceC3277a interfaceC3277a3;
        Object obj3;
        InterfaceC3277a interfaceC3277a4;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        float f7;
        Float f8;
        Float f9;
        boolean z19;
        float intBitsToFloat;
        Object obj4;
        C0468a c0468a;
        InterfaceC3277a interfaceC3277a5;
        Object obj5;
        float intBitsToFloat2;
        boolean z20;
        Object obj6;
        C0468a c0468a2;
        InterfaceC3277a interfaceC3277a6;
        Object obj7;
        InterfaceC3279c interfaceC3279c;
        Object obj8;
        InterfaceC3277a interfaceC3277a7;
        Object obj9;
        InterfaceC3277a interfaceC3277a8;
        Object obj10;
        InterfaceC3277a interfaceC3277a9;
        Object obj11;
        InterfaceC3277a interfaceC3277a10;
        Object obj12;
        InterfaceC3277a interfaceC3277a11;
        String str;
        Object obj13;
        InterfaceC3279c interfaceC3279c2;
        C0468a c0468a3;
        long j6;
        long j7;
        AbstractC3497e1 m1042d;
        Object m3592g;
        Object m3592g2;
        Object obj14;
        float f10;
        float f11;
        boolean z21;
        float f12;
        float f13;
        float f14;
        InterfaceC3281e interfaceC3281e;
        Object obj15;
        InterfaceC3279c interfaceC3279c3;
        Object obj16;
        InterfaceC3277a interfaceC3277a12;
        Object obj17;
        InterfaceC3277a interfaceC3277a13;
        Object obj18;
        InterfaceC3277a interfaceC3277a14;
        Object obj19;
        InterfaceC3277a interfaceC3277a15;
        Object obj20;
        InterfaceC3277a interfaceC3277a16;
        Object obj21;
        boolean z22;
        C3653a0 c3653a0 = this.f17797f;
        AccessibilityManager accessibilityManager = c3653a0.f17457g;
        Float valueOf = Float.valueOf(0.0f);
        C3728t c3728t = c3653a0.f17454d;
        C0483p c0483p = (C0483p) c3653a0.m5647m().m3612b(i7);
        if (c0483p == null || (c0482o = c0483p.f1698a) == null) {
            return false;
        }
        C3502g0 c3502g0 = c0482o.f1693c;
        int i14 = c0482o.f1697g;
        C0477j c0477j = c0482o.f1694d;
        C2194h0 c2194h0 = c0477j.f1683e;
        Object m3592g3 = c2194h0.m3592g(AbstractC0487t.f1753n);
        if (m3592g3 == null) {
            m3592g3 = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (AbstractC3367j.m5096a(m3592g3, bool2)) {
            if (Build.VERSION.SDK_INT >= 34) {
                z22 = AbstractC1776b.m2943e(accessibilityManager);
            } else {
                z22 = true;
            }
            if (!z22) {
                return false;
            }
        }
        if (i8 != 64) {
            if (i8 != 128) {
                int i15 = -1;
                if (i8 != 256 && i8 != 512) {
                    if (i8 != 16384) {
                        if (i8 != 131072) {
                            if (!AbstractC3681h0.m5681h(c0482o)) {
                                return false;
                            }
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    EnumC3103m enumC3103m = EnumC3103m.f15704f;
                                    switch (i8) {
                                        case 16:
                                            Object m3592g4 = c2194h0.m3592g(AbstractC0476i.f1658b);
                                            if (m3592g4 == null) {
                                                m3592g4 = null;
                                            }
                                            C0468a c0468a4 = (C0468a) m3592g4;
                                            if (c0468a4 != null && (interfaceC3277a3 = (InterfaceC3277a) c0468a4.f1639b) != null) {
                                                bool = (Boolean) interfaceC3277a3.mo52a();
                                            } else {
                                                bool = null;
                                            }
                                            C3653a0.m5631x(c3653a0, i7, 1, null, 12);
                                            if (bool == null) {
                                                return false;
                                            }
                                            return bool.booleanValue();
                                        case 32:
                                            Object m3592g5 = c2194h0.m3592g(AbstractC0476i.f1659c);
                                            if (m3592g5 == null) {
                                                obj3 = null;
                                            } else {
                                                obj3 = m3592g5;
                                            }
                                            C0468a c0468a5 = (C0468a) obj3;
                                            if (c0468a5 == null || (interfaceC3277a4 = (InterfaceC3277a) c0468a5.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a4.mo52a()).booleanValue();
                                        case 4096:
                                        case 8192:
                                            break;
                                        case 32768:
                                            Object m3592g6 = c2194h0.m3592g(AbstractC0476i.f1674r);
                                            if (m3592g6 == null) {
                                                obj8 = null;
                                            } else {
                                                obj8 = m3592g6;
                                            }
                                            C0468a c0468a6 = (C0468a) obj8;
                                            if (c0468a6 == null || (interfaceC3277a7 = (InterfaceC3277a) c0468a6.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a7.mo52a()).booleanValue();
                                        case 65536:
                                            Object m3592g7 = c2194h0.m3592g(AbstractC0476i.f1673q);
                                            if (m3592g7 == null) {
                                                obj9 = null;
                                            } else {
                                                obj9 = m3592g7;
                                            }
                                            C0468a c0468a7 = (C0468a) obj9;
                                            if (c0468a7 == null || (interfaceC3277a8 = (InterfaceC3277a) c0468a7.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a8.mo52a()).booleanValue();
                                        case 262144:
                                            Object m3592g8 = c2194h0.m3592g(AbstractC0476i.f1675s);
                                            if (m3592g8 == null) {
                                                obj10 = null;
                                            } else {
                                                obj10 = m3592g8;
                                            }
                                            C0468a c0468a8 = (C0468a) obj10;
                                            if (c0468a8 == null || (interfaceC3277a9 = (InterfaceC3277a) c0468a8.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a9.mo52a()).booleanValue();
                                        case 524288:
                                            Object m3592g9 = c2194h0.m3592g(AbstractC0476i.f1676t);
                                            if (m3592g9 == null) {
                                                obj11 = null;
                                            } else {
                                                obj11 = m3592g9;
                                            }
                                            C0468a c0468a9 = (C0468a) obj11;
                                            if (c0468a9 == null || (interfaceC3277a10 = (InterfaceC3277a) c0468a9.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a10.mo52a()).booleanValue();
                                        case 1048576:
                                            Object m3592g10 = c2194h0.m3592g(AbstractC0476i.f1677u);
                                            if (m3592g10 == null) {
                                                obj12 = null;
                                            } else {
                                                obj12 = m3592g10;
                                            }
                                            C0468a c0468a10 = (C0468a) obj12;
                                            if (c0468a10 == null || (interfaceC3277a11 = (InterfaceC3277a) c0468a10.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a11.mo52a()).booleanValue();
                                        case 2097152:
                                            if (bundle != null) {
                                                str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                            } else {
                                                str = null;
                                            }
                                            Object m3592g11 = c2194h0.m3592g(AbstractC0476i.f1666j);
                                            if (m3592g11 == null) {
                                                obj13 = null;
                                            } else {
                                                obj13 = m3592g11;
                                            }
                                            C0468a c0468a11 = (C0468a) obj13;
                                            if (c0468a11 == null || (interfaceC3279c2 = (InterfaceC3279c) c0468a11.f1639b) == null) {
                                                return false;
                                            }
                                            if (str == null) {
                                                str = "";
                                            }
                                            return ((Boolean) interfaceC3279c2.mo23f(new C1587g(str))).booleanValue();
                                        case android.R.id.accessibilityActionShowOnScreen:
                                            C0482o m1049l = c0482o.m1049l();
                                            if (m1049l != null) {
                                                Object m3592g12 = m1049l.f1694d.f1683e.m3592g(AbstractC0476i.f1660d);
                                                if (m3592g12 == null) {
                                                    m3592g12 = null;
                                                }
                                                c0468a3 = (C0468a) m3592g12;
                                                while (m1049l != null && c0468a3 == null) {
                                                    m1049l = m1049l.m1049l();
                                                    if (m1049l != null) {
                                                        Object m3592g13 = m1049l.f1694d.f1683e.m3592g(AbstractC0476i.f1660d);
                                                        if (m3592g13 == null) {
                                                            m3592g13 = null;
                                                        }
                                                        c0468a3 = (C0468a) m3592g13;
                                                    }
                                                }
                                                if (m1049l == null) {
                                                    C0465c m1045g = c0482o.m1045g();
                                                    return c3728t.requestRectangleOnScreen(new Rect((int) Math.floor(m1045g.f1625a), (int) Math.floor(m1045g.f1626b), AbstractC3784a.m5794D((float) Math.ceil(m1045g.f1627c)), AbstractC3784a.m5794D((float) Math.ceil(m1045g.f1628d))));
                                                }
                                                C2194h0 c2194h02 = m1049l.f1694d.f1683e;
                                                C3502g0 c3502g02 = m1049l.f1693c;
                                                C0465c m4894e = AbstractC3191c1.m4894e(c3502g02.f16872I.f16799c);
                                                InterfaceC3238v mo4935o = c3502g02.f16872I.f16799c.mo4935o();
                                                long j8 = 0;
                                                if (mo4935o != null) {
                                                    j6 = ((AbstractC3497e1) mo4935o).mo4927U(0L);
                                                } else {
                                                    j6 = 0;
                                                }
                                                C0465c m1020g = m4894e.m1020g(j6);
                                                AbstractC3497e1 m1042d2 = c0482o.m1042d();
                                                if (m1042d2 != null) {
                                                    if (!m1042d2.mo5333V0().f18005r) {
                                                        m1042d2 = null;
                                                    }
                                                    if (m1042d2 != null) {
                                                        j7 = m1042d2.mo4927U(0L);
                                                        m1042d = c0482o.m1042d();
                                                        if (m1042d != null) {
                                                            j8 = m1042d.f16055g;
                                                        }
                                                        C0465c m3d = AbstractC0000a.m3d(j7, AbstractC2072e.m3347y(j8));
                                                        m3592g = c2194h02.m3592g(AbstractC0487t.f1759t);
                                                        if (m3592g == null) {
                                                            m3592g = null;
                                                        }
                                                        m3592g2 = c2194h02.m3592g(AbstractC0487t.f1760u);
                                                        if (m3592g2 != null) {
                                                            obj14 = null;
                                                        } else {
                                                            obj14 = m3592g2;
                                                        }
                                                        f10 = m3d.f1625a - m1020g.f1625a;
                                                        f11 = m3d.f1627c - m1020g.f1627c;
                                                        if (Math.signum(f10) != Math.signum(f11)) {
                                                            if (Math.abs(f10) >= Math.abs(f11)) {
                                                                f10 = f11;
                                                            }
                                                        } else {
                                                            f10 = 0.0f;
                                                        }
                                                        if (c3502g0.f16866C != enumC3103m) {
                                                            z21 = true;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (z21) {
                                                            f10 = -f10;
                                                        }
                                                        f12 = m3d.f1626b - m1020g.f1626b;
                                                        f13 = m3d.f1628d - m1020g.f1628d;
                                                        if (Math.signum(f12) != Math.signum(f13)) {
                                                            if (Math.abs(f12) < Math.abs(f13)) {
                                                                f14 = f12;
                                                            } else {
                                                                f14 = f13;
                                                            }
                                                        } else {
                                                            f14 = 0.0f;
                                                        }
                                                        if (c0468a3 != null || (interfaceC3281e = (InterfaceC3281e) c0468a3.f1639b) == null || !((Boolean) interfaceC3281e.mo22d(Float.valueOf(f10), Float.valueOf(f14))).booleanValue()) {
                                                            return false;
                                                        }
                                                        return true;
                                                    }
                                                }
                                                j7 = 0;
                                                m1042d = c0482o.m1042d();
                                                if (m1042d != null) {
                                                }
                                                C0465c m3d2 = AbstractC0000a.m3d(j7, AbstractC2072e.m3347y(j8));
                                                m3592g = c2194h02.m3592g(AbstractC0487t.f1759t);
                                                if (m3592g == null) {
                                                }
                                                m3592g2 = c2194h02.m3592g(AbstractC0487t.f1760u);
                                                if (m3592g2 != null) {
                                                }
                                                f10 = m3d2.f1625a - m1020g.f1625a;
                                                f11 = m3d2.f1627c - m1020g.f1627c;
                                                if (Math.signum(f10) != Math.signum(f11)) {
                                                }
                                                if (c3502g0.f16866C != enumC3103m) {
                                                }
                                                if (z21) {
                                                }
                                                f12 = m3d2.f1626b - m1020g.f1626b;
                                                f13 = m3d2.f1628d - m1020g.f1628d;
                                                if (Math.signum(f12) != Math.signum(f13)) {
                                                }
                                                return c0468a3 != null ? false : false;
                                            }
                                            c0468a3 = null;
                                            break;
                                        case android.R.id.accessibilityActionSetProgress:
                                            if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                return false;
                                            }
                                            Object m3592g14 = c2194h0.m3592g(AbstractC0476i.f1664h);
                                            if (m3592g14 == null) {
                                                obj15 = null;
                                            } else {
                                                obj15 = m3592g14;
                                            }
                                            C0468a c0468a12 = (C0468a) obj15;
                                            if (c0468a12 == null || (interfaceC3279c3 = (InterfaceC3279c) c0468a12.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3279c3.mo23f(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        case android.R.id.accessibilityActionImeEnter:
                                            Object m3592g15 = c2194h0.m3592g(AbstractC0476i.f1671o);
                                            if (m3592g15 == null) {
                                                obj16 = null;
                                            } else {
                                                obj16 = m3592g15;
                                            }
                                            C0468a c0468a13 = (C0468a) obj16;
                                            if (c0468a13 == null || (interfaceC3277a12 = (InterfaceC3277a) c0468a13.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a12.mo52a()).booleanValue();
                                        default:
                                            switch (i8) {
                                                case android.R.id.accessibilityActionScrollUp:
                                                case android.R.id.accessibilityActionScrollLeft:
                                                case android.R.id.accessibilityActionScrollDown:
                                                case android.R.id.accessibilityActionScrollRight:
                                                    break;
                                                default:
                                                    switch (i8) {
                                                        case android.R.id.accessibilityActionPageUp:
                                                            Object m3592g16 = c2194h0.m3592g(AbstractC0476i.f1680x);
                                                            if (m3592g16 == null) {
                                                                obj17 = null;
                                                            } else {
                                                                obj17 = m3592g16;
                                                            }
                                                            C0468a c0468a14 = (C0468a) obj17;
                                                            if (c0468a14 == null || (interfaceC3277a13 = (InterfaceC3277a) c0468a14.f1639b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC3277a13.mo52a()).booleanValue();
                                                        case android.R.id.accessibilityActionPageDown:
                                                            Object m3592g17 = c2194h0.m3592g(AbstractC0476i.f1682z);
                                                            if (m3592g17 == null) {
                                                                obj18 = null;
                                                            } else {
                                                                obj18 = m3592g17;
                                                            }
                                                            C0468a c0468a15 = (C0468a) obj18;
                                                            if (c0468a15 == null || (interfaceC3277a14 = (InterfaceC3277a) c0468a15.f1639b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC3277a14.mo52a()).booleanValue();
                                                        case android.R.id.accessibilityActionPageLeft:
                                                            Object m3592g18 = c2194h0.m3592g(AbstractC0476i.f1681y);
                                                            if (m3592g18 == null) {
                                                                obj19 = null;
                                                            } else {
                                                                obj19 = m3592g18;
                                                            }
                                                            C0468a c0468a16 = (C0468a) obj19;
                                                            if (c0468a16 == null || (interfaceC3277a15 = (InterfaceC3277a) c0468a16.f1639b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC3277a15.mo52a()).booleanValue();
                                                        case android.R.id.accessibilityActionPageRight:
                                                            Object m3592g19 = c2194h0.m3592g(AbstractC0476i.f1655A);
                                                            if (m3592g19 == null) {
                                                                obj20 = null;
                                                            } else {
                                                                obj20 = m3592g19;
                                                            }
                                                            C0468a c0468a17 = (C0468a) obj20;
                                                            if (c0468a17 == null || (interfaceC3277a16 = (InterfaceC3277a) c0468a17.f1639b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) interfaceC3277a16.mo52a()).booleanValue();
                                                        default:
                                                            C2216s0 c2216s0 = (C2216s0) c3653a0.f17471u.m3634b(i7);
                                                            if (c2216s0 == null || ((CharSequence) c2216s0.m3634b(i8)) == null) {
                                                                return false;
                                                            }
                                                            Object m3592g20 = c2194h0.m3592g(AbstractC0476i.f1679w);
                                                            if (m3592g20 == null) {
                                                                obj21 = null;
                                                            } else {
                                                                obj21 = m3592g20;
                                                            }
                                                            List list = (List) obj21;
                                                            if (list == null || list.size() <= 0) {
                                                                return false;
                                                            }
                                                            list.get(0).getClass();
                                                            throw new ClassCastException();
                                                    }
                                            }
                                    }
                                    if (i8 == 4096) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (i8 == 8192) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (i8 == 16908345) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (i8 == 16908347) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (i8 == 16908344) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (i8 == 16908346) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z13 && !z14 && !z11 && !z12) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    if (!z15 && !z16 && !z11 && !z12) {
                                        z18 = false;
                                    } else {
                                        z18 = true;
                                    }
                                    if (z11 || z12) {
                                        Object m3592g21 = c2194h0.m3592g(AbstractC0487t.f1742c);
                                        if (m3592g21 == null) {
                                            m3592g21 = null;
                                        }
                                        C0473f c0473f = (C0473f) m3592g21;
                                        Object m3592g22 = c2194h0.m3592g(AbstractC0476i.f1664h);
                                        if (m3592g22 == null) {
                                            m3592g22 = null;
                                        }
                                        C0468a c0468a18 = (C0468a) m3592g22;
                                        if (c0473f != null) {
                                            C3876a c3876a = c0473f.f1651b;
                                            if (c0468a18 != null) {
                                                float f15 = c3876a.f18162b;
                                                float f16 = c3876a.f18161a;
                                                if (f15 < f16) {
                                                    f7 = f16;
                                                } else {
                                                    f7 = f15;
                                                }
                                                if (f16 <= f15) {
                                                    f15 = f16;
                                                }
                                                float f17 = (f7 - f15) / 20;
                                                if (z12) {
                                                    f17 = -f17;
                                                }
                                                InterfaceC3279c interfaceC3279c4 = (InterfaceC3279c) c0468a18.f1639b;
                                                if (interfaceC3279c4 == null) {
                                                    return false;
                                                }
                                                return ((Boolean) interfaceC3279c4.mo23f(Float.valueOf(c0473f.f1650a + f17))).booleanValue();
                                            }
                                        }
                                    }
                                    long m1015b = AbstractC3191c1.m4894e(c3502g0.f16872I.f16799c).m1015b();
                                    ArrayList arrayList = new ArrayList();
                                    Object m3592g23 = c2194h0.m3592g(AbstractC0476i.f1656B);
                                    if (m3592g23 == null) {
                                        m3592g23 = null;
                                    }
                                    C0468a c0468a19 = (C0468a) m3592g23;
                                    if (c0468a19 != null && (interfaceC3279c = (InterfaceC3279c) c0468a19.f1639b) != null && ((Boolean) interfaceC3279c.mo23f(arrayList)).booleanValue()) {
                                        f8 = (Float) arrayList.get(0);
                                    } else {
                                        f8 = null;
                                    }
                                    Object m3592g24 = c2194h0.m3592g(AbstractC0476i.f1660d);
                                    if (m3592g24 == null) {
                                        m3592g24 = null;
                                    }
                                    C0468a c0468a20 = (C0468a) m3592g24;
                                    if (c0468a20 == null) {
                                        return false;
                                    }
                                    InterfaceC1684c interfaceC1684c = c0468a20.f1639b;
                                    Object m3592g25 = c2194h0.m3592g(AbstractC0487t.f1759t);
                                    if (m3592g25 == null) {
                                        m3592g25 = null;
                                    }
                                    C0475h c0475h = (C0475h) m3592g25;
                                    if (c0475h != null && z17) {
                                        if (f8 != null) {
                                            intBitsToFloat2 = f8.floatValue();
                                            f9 = f8;
                                            z19 = z18;
                                        } else {
                                            f9 = f8;
                                            z19 = z18;
                                            intBitsToFloat2 = Float.intBitsToFloat((int) (m1015b >> 32));
                                        }
                                        if (z13 || z12) {
                                            intBitsToFloat2 = -intBitsToFloat2;
                                        }
                                        if (c3502g0.f16866C == enumC3103m) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (z20 && (z13 || z14)) {
                                            intBitsToFloat2 = -intBitsToFloat2;
                                        }
                                        if (C3653a0.m5628q(c0475h, intBitsToFloat2)) {
                                            C0490w c0490w = AbstractC0476i.f1681y;
                                            if (!c2194h0.m3588c(c0490w) && !c2194h0.m3588c(AbstractC0476i.f1655A)) {
                                                InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) interfaceC1684c;
                                                if (interfaceC3281e2 == null) {
                                                    return false;
                                                }
                                                return ((Boolean) interfaceC3281e2.mo22d(Float.valueOf(intBitsToFloat2), valueOf)).booleanValue();
                                            }
                                            if (intBitsToFloat2 > 0.0f) {
                                                Object m3592g26 = c2194h0.m3592g(AbstractC0476i.f1655A);
                                                if (m3592g26 == null) {
                                                    obj7 = null;
                                                } else {
                                                    obj7 = m3592g26;
                                                }
                                                c0468a2 = (C0468a) obj7;
                                            } else {
                                                Object m3592g27 = c2194h0.m3592g(c0490w);
                                                if (m3592g27 == null) {
                                                    obj6 = null;
                                                } else {
                                                    obj6 = m3592g27;
                                                }
                                                c0468a2 = (C0468a) obj6;
                                            }
                                            if (c0468a2 == null || (interfaceC3277a6 = (InterfaceC3277a) c0468a2.f1639b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) interfaceC3277a6.mo52a()).booleanValue();
                                        }
                                    } else {
                                        f9 = f8;
                                        z19 = z18;
                                    }
                                    Object m3592g28 = c2194h0.m3592g(AbstractC0487t.f1760u);
                                    if (m3592g28 == null) {
                                        m3592g28 = null;
                                    }
                                    C0475h c0475h2 = (C0475h) m3592g28;
                                    if (c0475h2 == null || !z19) {
                                        return false;
                                    }
                                    if (f9 != null) {
                                        intBitsToFloat = f9.floatValue();
                                    } else {
                                        intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & m1015b));
                                    }
                                    if (z15 || z12) {
                                        intBitsToFloat = -intBitsToFloat;
                                    }
                                    if (!C3653a0.m5628q(c0475h2, intBitsToFloat)) {
                                        return false;
                                    }
                                    C0490w c0490w2 = AbstractC0476i.f1680x;
                                    if (!c2194h0.m3588c(c0490w2) && !c2194h0.m3588c(AbstractC0476i.f1682z)) {
                                        InterfaceC3281e interfaceC3281e3 = (InterfaceC3281e) interfaceC1684c;
                                        if (interfaceC3281e3 == null) {
                                            return false;
                                        }
                                        return ((Boolean) interfaceC3281e3.mo22d(valueOf, Float.valueOf(intBitsToFloat))).booleanValue();
                                    }
                                    if (intBitsToFloat > 0.0f) {
                                        Object m3592g29 = c2194h0.m3592g(AbstractC0476i.f1682z);
                                        if (m3592g29 == null) {
                                            obj5 = null;
                                        } else {
                                            obj5 = m3592g29;
                                        }
                                        c0468a = (C0468a) obj5;
                                    } else {
                                        Object m3592g30 = c2194h0.m3592g(c0490w2);
                                        if (m3592g30 == null) {
                                            obj4 = null;
                                        } else {
                                            obj4 = m3592g30;
                                        }
                                        c0468a = (C0468a) obj4;
                                    }
                                    if (c0468a == null || (interfaceC3277a5 = (InterfaceC3277a) c0468a.f1639b) == null) {
                                        return false;
                                    }
                                    return ((Boolean) interfaceC3277a5.mo52a()).booleanValue();
                                }
                                Object m3592g31 = c2194h0.m3592g(AbstractC0487t.f1750k);
                                if (m3592g31 == null) {
                                    m3592g31 = null;
                                }
                                if (!AbstractC3367j.m5096a(m3592g31, bool2)) {
                                    return false;
                                }
                                ((C0368l) c3728t.getFocusOwner()).m831b(8, false, true);
                                return true;
                            }
                            if (c3728t.isInTouchMode()) {
                                c3728t.requestFocusFromTouch();
                            }
                            Object m3592g32 = c2194h0.m3592g(AbstractC0476i.f1678v);
                            if (m3592g32 == null) {
                                obj2 = null;
                            } else {
                                obj2 = m3592g32;
                            }
                            C0468a c0468a21 = (C0468a) obj2;
                            if (c0468a21 == null || (interfaceC3277a2 = (InterfaceC3277a) c0468a21.f1639b) == null) {
                                return false;
                            }
                            return ((Boolean) interfaceC3277a2.mo52a()).booleanValue();
                        }
                        if (bundle != null) {
                            i13 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                        } else {
                            i13 = -1;
                        }
                        if (bundle != null) {
                            i15 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                        }
                        boolean m5635D = c3653a0.m5635D(c0482o, i13, i15, false);
                        if (m5635D) {
                            C3653a0.m5631x(c3653a0, c3653a0.m5650t(i14), 0, null, 12);
                        }
                        return m5635D;
                    }
                    Object m3592g33 = c2194h0.m3592g(AbstractC0476i.f1672p);
                    if (m3592g33 == null) {
                        obj = null;
                    } else {
                        obj = m3592g33;
                    }
                    C0468a c0468a22 = (C0468a) obj;
                    if (c0468a22 == null || (interfaceC3277a = (InterfaceC3277a) c0468a22.f1639b) == null) {
                        return false;
                    }
                    return ((Boolean) interfaceC3277a.mo52a()).booleanValue();
                }
                if (bundle == null) {
                    return false;
                }
                int i16 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                boolean z23 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                if (i8 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Integer num2 = c3653a0.f17474x;
                if (num2 == null || i14 != num2.intValue()) {
                    c3653a0.f17473w = -1;
                    c3653a0.f17474x = Integer.valueOf(i14);
                }
                String m5627n = C3653a0.m5627n(c0482o);
                if (m5627n == null || m5627n.length() == 0) {
                    return false;
                }
                String m5627n2 = C3653a0.m5627n(c0482o);
                if (m5627n2 != null && m5627n2.length() != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 4) {
                                if (i16 == 8) {
                                    if (C3664d.f17500c == null) {
                                        C3664d.f17500c = new AbstractC3269f();
                                    }
                                    C3664d c3664d = C3664d.f17500c;
                                    AbstractC3367j.m5098c(c3664d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                    c3664d.f16115a = m5627n2;
                                    abstractC3269f = c3664d;
                                }
                            }
                            if (c2194h0.m3588c(AbstractC0476i.f1657a) && (m5693t = AbstractC3681h0.m5693t(c0477j)) != null) {
                                if (i16 == 4) {
                                    if (C3656b.f17485g == null) {
                                        C3656b.f17485g = new C3656b(2);
                                    }
                                    C3656b c3656b = C3656b.f17485g;
                                    AbstractC3367j.m5098c(c3656b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                    c3656b.f16115a = m5627n2;
                                    c3656b.f17489d = m5693t;
                                    abstractC3269f = c3656b;
                                } else {
                                    if (C3660c.f17493e == null) {
                                        ?? abstractC3269f2 = new AbstractC3269f();
                                        new Rect();
                                        C3660c.f17493e = abstractC3269f2;
                                    }
                                    C3660c c3660c = C3660c.f17493e;
                                    AbstractC3367j.m5098c(c3660c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                    c3660c.f16115a = m5627n2;
                                    c3660c.f17496c = m5693t;
                                    c3660c.f17497d = c0482o;
                                    abstractC3269f = c3660c;
                                }
                            }
                        } else {
                            Locale locale = c3728t.getContext().getResources().getConfiguration().locale;
                            if (C3656b.f17484f == null) {
                                C3656b c3656b2 = new C3656b(1);
                                c3656b2.f17489d = BreakIterator.getWordInstance(locale);
                                C3656b.f17484f = c3656b2;
                            }
                            C3656b c3656b3 = C3656b.f17484f;
                            AbstractC3367j.m5098c(c3656b3, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                            c3656b3.m5657g(m5627n2);
                            abstractC3269f = c3656b3;
                        }
                    } else {
                        Locale locale2 = c3728t.getContext().getResources().getConfiguration().locale;
                        if (C3656b.f17483e == null) {
                            C3656b c3656b4 = new C3656b(0);
                            c3656b4.f17489d = BreakIterator.getCharacterInstance(locale2);
                            C3656b.f17483e = c3656b4;
                        }
                        C3656b c3656b5 = C3656b.f17483e;
                        AbstractC3367j.m5098c(c3656b5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                        c3656b5.m5657g(m5627n2);
                        abstractC3269f = c3656b5;
                    }
                    if (abstractC3269f != null) {
                        return false;
                    }
                    int m5645k = c3653a0.m5645k(c0482o);
                    if (m5645k == -1) {
                        if (z10) {
                            length = 0;
                        } else {
                            length = m5627n.length();
                        }
                        m5645k = length;
                    }
                    if (z10) {
                        mo4985e = abstractC3269f.mo4982a(m5645k);
                    } else {
                        mo4985e = abstractC3269f.mo4985e(m5645k);
                    }
                    if (mo4985e == null) {
                        return false;
                    }
                    int i17 = mo4985e[0];
                    int i18 = mo4985e[1];
                    if (z23 && !c2194h0.m3588c(AbstractC0487t.f1740a) && c2194h0.m3588c(AbstractC0487t.f1729E)) {
                        i10 = c3653a0.m5646l(c0482o);
                        if (i10 == -1) {
                            if (z10) {
                                i10 = i17;
                            } else {
                                i10 = i18;
                            }
                        }
                        if (z10) {
                            i11 = i18;
                        } else {
                            i11 = i17;
                        }
                    } else {
                        if (z10) {
                            i10 = i18;
                        } else {
                            i10 = i17;
                        }
                        i11 = i10;
                    }
                    if (z10) {
                        i12 = 256;
                    } else {
                        i12 = 512;
                    }
                    c3653a0.f17439B = new C3742x(c0482o, i12, i16, i17, i18, SystemClock.uptimeMillis());
                    c3653a0.m5635D(c0482o, i10, i11, true);
                    return true;
                }
                abstractC3269f = null;
                if (abstractC3269f != null) {
                }
            } else {
                if (c3653a0.f17464n == i7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    return false;
                }
                c3653a0.f17464n = Integer.MIN_VALUE;
                c3653a0.f17466p = null;
                c3728t.invalidate();
                C3653a0.m5631x(c3653a0, i7, 65536, null, 12);
                return true;
            }
        } else {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            int i19 = c3653a0.f17464n;
            if (i19 == i7) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                return false;
            }
            if (i19 != Integer.MIN_VALUE) {
                i9 = 12;
                num = null;
                C3653a0.m5631x(c3653a0, i19, 65536, null, 12);
            } else {
                i9 = 12;
                num = null;
            }
            c3653a0.f17464n = i7;
            c3728t.invalidate();
            C3653a0.m5631x(c3653a0, i7, 32768, num, i9);
            return true;
        }
    }
}
