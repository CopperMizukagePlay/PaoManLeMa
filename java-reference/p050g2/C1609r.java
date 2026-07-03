package p050g2;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p008b.C0231f;
import p024c6.AbstractC0444k;
import p039e5.C1162os;
import p054g6.C1701c0;
import p054g6.InterfaceC1714o;
import p058h2.AbstractC1770g;
import p058h2.C1768e;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1817y;
import p060h5.C1803k;
import p060h5.C1813u;
import p080k2.InterfaceC2293d;
import p095m2.AbstractC2550a;
import p102n1.AbstractC2710c;
import p110o2.C2807d;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.r */
/* loaded from: classes.dex */
public final class C1609r implements InterfaceC1612u {

    /* renamed from: a */
    public final Object f10324a;

    /* renamed from: b */
    public final Object f10325b;

    /* renamed from: c */
    public final Object f10326c;

    /* renamed from: d */
    public final Object f10327d;

    /* renamed from: e */
    public Object f10328e;

    public C1609r(Map map) {
        AbstractC3367j.m5100e(map, "initialState");
        this.f10325b = AbstractC1817y.m3089U(map);
        this.f10326c = new LinkedHashMap();
        this.f10327d = new LinkedHashMap();
        this.f10328e = new LinkedHashMap();
        this.f10324a = new C0231f(1, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g5.d] */
    @Override // p050g2.InterfaceC1612u
    /* renamed from: a */
    public float mo2607a() {
        return ((Number) this.f10327d.getValue()).floatValue();
    }

    @Override // p050g2.InterfaceC1612u
    /* renamed from: b */
    public boolean mo2608b() {
        ArrayList arrayList = (ArrayList) this.f10324a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C1611t) arrayList.get(i7)).f10336a.mo2608b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g5.d] */
    @Override // p050g2.InterfaceC1612u
    /* renamed from: c */
    public float mo2609c() {
        return ((Number) this.f10328e.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi m2610d(int i7) {
        int intValue;
        Bidi bidi;
        int i8;
        Layout layout = (Layout) this.f10325b;
        ArrayList arrayList = (ArrayList) this.f10324a;
        ArrayList arrayList2 = (ArrayList) this.f10326c;
        boolean[] zArr = (boolean[]) this.f10327d;
        if (zArr[i7]) {
            return (Bidi) arrayList2.get(i7);
        }
        if (i7 == 0) {
            intValue = 0;
        } else {
            intValue = ((Number) arrayList.get(i7 - 1)).intValue();
        }
        int intValue2 = ((Number) arrayList.get(i7)).intValue();
        int i9 = intValue2 - intValue;
        char[] cArr = (char[]) this.f10328e;
        if (cArr == null || cArr.length < i9) {
            cArr = new char[i9];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i9)) {
            if (layout.getParagraphDirection(layout.getLineForOffset(m2614h(i7))) == -1) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            bidi = new Bidi(cArr2, 0, null, 0, i9, i8);
        }
        bidi = null;
        arrayList2.set(i7, bidi);
        zArr[i7] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f10328e;
            if (cArr2 == cArr3) {
                cArr2 = null;
            } else {
                cArr2 = cArr3;
            }
        }
        this.f10328e = cArr2;
        return bidi;
    }

    /* renamed from: e */
    public float m2611e(int i7, boolean z7) {
        Layout layout = (Layout) this.f10325b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        if (z7) {
            return layout.getPrimaryHorizontal(i7);
        }
        return layout.getSecondaryHorizontal(i7);
    }

    /* renamed from: f */
    public float m2612f(int i7, boolean z7, boolean z8) {
        boolean z9;
        Bidi bidi;
        boolean z10;
        int i8;
        boolean z11;
        int i9;
        boolean z12;
        boolean z13;
        int i10 = i7;
        Layout layout = (Layout) this.f10325b;
        if (!z8) {
            return m2611e(i7, z7);
        }
        int m2925d = AbstractC1770g.m2925d(layout, i10, z8);
        int lineStart = layout.getLineStart(m2925d);
        int lineEnd = layout.getLineEnd(m2925d);
        if (i10 != lineStart && i10 != lineEnd) {
            return m2611e(i7, z7);
        }
        if (i10 != 0 && i10 != layout.getText().length()) {
            int m2613g = m2613g(i10, z8);
            if (layout.getParagraphDirection(layout.getLineForOffset(m2614h(m2613g))) == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int m2615i = m2615i(lineEnd, lineStart);
            int m2614h = m2614h(m2613g);
            int i11 = lineStart - m2614h;
            int i12 = m2615i - m2614h;
            Bidi m2610d = m2610d(m2613g);
            if (m2610d != null) {
                bidi = m2610d.createLineBidi(i11, i12);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                C1768e[] c1768eArr = new C1768e[runCount];
                for (int i13 = 0; i13 < runCount; i13++) {
                    int runStart = bidi.getRunStart(i13) + lineStart;
                    int runLimit = bidi.getRunLimit(i13) + lineStart;
                    if (bidi.getRunLevel(i13) % 2 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c1768eArr[i13] = new C1768e(runStart, runLimit, z13);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i14 = 0; i14 < runCount2; i14++) {
                    bArr[i14] = (byte) bidi.getRunLevel(i14);
                }
                Bidi.reorderVisually(bArr, 0, c1768eArr, 0, runCount);
                if (i10 == lineStart) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < runCount) {
                            if (c1768eArr[i15].f10778a == i10) {
                                i9 = i15;
                                break;
                            }
                            i15++;
                        } else {
                            i9 = -1;
                            break;
                        }
                    }
                    C1768e c1768e = c1768eArr[i9];
                    if (!z7 && z9 != c1768e.f10780c) {
                        z12 = z9;
                    } else if (!z9) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i9 == 0 && z12) {
                        return layout.getLineLeft(m2925d);
                    }
                    if (i9 == runCount - 1 && !z12) {
                        return layout.getLineRight(m2925d);
                    }
                    if (z12) {
                        return layout.getPrimaryHorizontal(c1768eArr[i9 - 1].f10778a);
                    }
                    return layout.getPrimaryHorizontal(c1768eArr[i9 + 1].f10778a);
                }
                if (i10 > m2615i) {
                    i10 = m2615i(i10, lineStart);
                }
                int i16 = 0;
                while (true) {
                    if (i16 < runCount) {
                        if (c1768eArr[i16].f10779b == i10) {
                            i8 = i16;
                            break;
                        }
                        i16++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                C1768e c1768e2 = c1768eArr[i8];
                if (!z7 && z9 != c1768e2.f10780c) {
                    if (!z9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = z9;
                }
                if (i8 == 0 && z11) {
                    return layout.getLineLeft(m2925d);
                }
                if (i8 == runCount - 1 && !z11) {
                    return layout.getLineRight(m2925d);
                }
                if (z11) {
                    return layout.getPrimaryHorizontal(c1768eArr[i8 - 1].f10779b);
                }
                return layout.getPrimaryHorizontal(c1768eArr[i8 + 1].f10779b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z7 || z9 == isRtlCharAt) {
                if (!z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (i10 == lineStart) {
                z10 = z9;
            } else if (!z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return layout.getLineLeft(m2925d);
            }
            return layout.getLineRight(m2925d);
        }
        return m2611e(i7, z7);
    }

    /* renamed from: g */
    public int m2613g(int i7, boolean z7) {
        int i8;
        ArrayList arrayList = (ArrayList) this.f10324a;
        int m3064L = AbstractC1806n.m3064L(arrayList, Integer.valueOf(i7));
        if (m3064L < 0) {
            i8 = -(m3064L + 1);
        } else {
            i8 = m3064L + 1;
        }
        if (z7 && i8 > 0) {
            int i9 = i8 - 1;
            if (i7 == ((Number) arrayList.get(i9)).intValue()) {
                return i9;
            }
        }
        return i8;
    }

    /* renamed from: h */
    public int m2614h(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f10324a).get(i7 - 1)).intValue();
    }

    /* renamed from: i */
    public int m2615i(int i7, int i8) {
        while (i7 > i8) {
            char charAt = ((Layout) this.f10325b).getText().charAt(i7 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((AbstractC3367j.m5101f(charAt, 8192) < 0 || AbstractC3367j.m5101f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i7;
            }
            i7--;
        }
        return i7;
    }

    /* renamed from: j */
    public void m2616j(Object obj, String str) {
        AbstractC3367j.m5100e(str, "key");
        ((LinkedHashMap) this.f10325b).put(str, obj);
        InterfaceC1714o interfaceC1714o = (InterfaceC1714o) ((LinkedHashMap) this.f10327d).get(str);
        if (interfaceC1714o != null) {
            ((C1701c0) interfaceC1714o).m2751i(obj);
        }
        InterfaceC1714o interfaceC1714o2 = (InterfaceC1714o) ((LinkedHashMap) this.f10328e).get(str);
        if (interfaceC1714o2 != null) {
            ((C1701c0) interfaceC1714o2).m2751i(obj);
        }
    }

    public C1609r(Layout layout) {
        this.f10325b = layout;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        do {
            int m934X = AbstractC0444k.m934X(((Layout) this.f10325b).getText(), '\n', i7, 4);
            i7 = m934X < 0 ? ((Layout) this.f10325b).getText().length() : m934X + 1;
            arrayList.add(Integer.valueOf(i7));
        } while (i7 < ((Layout) this.f10325b).getText().length());
        this.f10324a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(null);
        }
        this.f10326c = arrayList2;
        this.f10327d = new boolean[((ArrayList) this.f10324a).size()];
        ((ArrayList) this.f10324a).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    public C1609r(C1587g c1587g, C1604o0 c1604o0, List list, InterfaceC3093c interfaceC3093c, InterfaceC2293d interfaceC2293d) {
        int i7;
        String str;
        ArrayList arrayList;
        String str2;
        List list2;
        C1587g c1587g2 = c1587g;
        C1604o0 c1604o02 = c1604o0;
        this.f10325b = c1587g2;
        this.f10326c = list;
        final int i8 = 0;
        this.f10327d = AbstractC2710c.m4326I(new InterfaceC3277a(this) { // from class: g2.q

            /* renamed from: f */
            public final /* synthetic */ C1609r f10322f;

            {
                this.f10322f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                Object obj;
                float f7;
                Object obj2;
                float f8;
                switch (i8) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f10322f.f10324a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float mo2607a = ((C1611t) obj3).f10336a.mo2607a();
                            int m3066N = AbstractC1806n.m3066N(arrayList2);
                            int i9 = 1;
                            if (1 <= m3066N) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i9);
                                    float mo2607a2 = ((C1611t) obj4).f10336a.mo2607a();
                                    if (Float.compare(mo2607a, mo2607a2) < 0) {
                                        obj3 = obj4;
                                        mo2607a = mo2607a2;
                                    }
                                    if (i9 != m3066N) {
                                        i9++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1611t c1611t = (C1611t) obj;
                        if (c1611t != null) {
                            f7 = c1611t.f10336a.mo2607a();
                        } else {
                            f7 = 0.0f;
                        }
                        return Float.valueOf(f7);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f10322f.f10324a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float m2921c = ((C1611t) obj5).f10336a.f14840i.m2921c();
                            int m3066N2 = AbstractC1806n.m3066N(arrayList3);
                            int i10 = 1;
                            if (1 <= m3066N2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i10);
                                    float m2921c2 = ((C1611t) obj6).f10336a.f14840i.m2921c();
                                    if (Float.compare(m2921c, m2921c2) < 0) {
                                        obj5 = obj6;
                                        m2921c = m2921c2;
                                    }
                                    if (i10 != m3066N2) {
                                        i10++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1611t c1611t2 = (C1611t) obj2;
                        if (c1611t2 != null) {
                            f8 = c1611t2.f10336a.f14840i.m2921c();
                        } else {
                            f8 = 0.0f;
                        }
                        return Float.valueOf(f8);
                }
            }
        });
        final int i9 = 1;
        this.f10328e = AbstractC2710c.m4326I(new InterfaceC3277a(this) { // from class: g2.q

            /* renamed from: f */
            public final /* synthetic */ C1609r f10322f;

            {
                this.f10322f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                Object obj;
                float f7;
                Object obj2;
                float f8;
                switch (i9) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f10322f.f10324a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float mo2607a = ((C1611t) obj3).f10336a.mo2607a();
                            int m3066N = AbstractC1806n.m3066N(arrayList2);
                            int i92 = 1;
                            if (1 <= m3066N) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i92);
                                    float mo2607a2 = ((C1611t) obj4).f10336a.mo2607a();
                                    if (Float.compare(mo2607a, mo2607a2) < 0) {
                                        obj3 = obj4;
                                        mo2607a = mo2607a2;
                                    }
                                    if (i92 != m3066N) {
                                        i92++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1611t c1611t = (C1611t) obj;
                        if (c1611t != null) {
                            f7 = c1611t.f10336a.mo2607a();
                        } else {
                            f7 = 0.0f;
                        }
                        return Float.valueOf(f7);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f10322f.f10324a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float m2921c = ((C1611t) obj5).f10336a.f14840i.m2921c();
                            int m3066N2 = AbstractC1806n.m3066N(arrayList3);
                            int i10 = 1;
                            if (1 <= m3066N2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i10);
                                    float m2921c2 = ((C1611t) obj6).f10336a.f14840i.m2921c();
                                    if (Float.compare(m2921c, m2921c2) < 0) {
                                        obj5 = obj6;
                                        m2921c = m2921c2;
                                    }
                                    if (i10 != m3066N2) {
                                        i10++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1611t c1611t2 = (C1611t) obj2;
                        if (c1611t2 != null) {
                            f8 = c1611t2.f10336a.f14840i.m2921c();
                        } else {
                            f8 = 0.0f;
                        }
                        return Float.valueOf(f8);
                }
            }
        });
        C1613v c1613v = c1604o02.f10310b;
        C1587g c1587g3 = AbstractC1589h.f10258a;
        ArrayList arrayList2 = c1587g2.f10241h;
        String str3 = c1587g2.f10239f;
        C1813u c1813u = C1813u.f10860e;
        List m3061y0 = arrayList2 != null ? AbstractC1805m.m3061y0(arrayList2, new C1585f(i9)) : c1813u;
        ArrayList arrayList3 = new ArrayList();
        C1803k c1803k = new C1803k();
        int size = m3061y0.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1583e c1583e = (C1583e) m3061y0.get(i10);
            C1613v m2621a = c1613v.m2621a((C1613v) c1583e.f10229a);
            int i12 = c1583e.f10230b;
            int i13 = c1583e.f10231c;
            if (i12 > i13) {
                AbstractC2550a.m4078a("Reversed range is not supported");
            }
            while (i11 < i12 && !c1803k.isEmpty()) {
                C1583e c1583e2 = (C1583e) c1803k.last();
                List list3 = m3061y0;
                int i14 = c1583e2.f10231c;
                C1813u c1813u2 = c1813u;
                Object obj = c1583e2.f10229a;
                if (i12 < i14) {
                    arrayList3.add(new C1583e(i11, i12, obj));
                    i11 = i12;
                    m3061y0 = list3;
                    c1813u = c1813u2;
                } else {
                    int i15 = size;
                    arrayList3.add(new C1583e(i11, i14, obj));
                    i11 = c1583e2.f10231c;
                    while (!c1803k.isEmpty() && i11 == ((C1583e) c1803k.last()).f10231c) {
                        c1803k.removeLast();
                    }
                    m3061y0 = list3;
                    c1813u = c1813u2;
                    size = i15;
                }
            }
            List list4 = m3061y0;
            C1813u c1813u3 = c1813u;
            int i16 = size;
            if (i11 < i12) {
                arrayList3.add(new C1583e(i11, i12, c1613v));
                i11 = i12;
            }
            C1583e c1583e3 = (C1583e) c1803k.m3005f();
            if (c1583e3 != null) {
                int i17 = c1583e3.f10231c;
                Object obj2 = c1583e3.f10229a;
                int i18 = c1583e3.f10230b;
                if (i18 == i12 && i17 == i13) {
                    c1803k.removeLast();
                    c1803k.addLast(new C1583e(i12, i13, ((C1613v) obj2).m2621a(m2621a)));
                } else if (i18 == i17) {
                    arrayList3.add(new C1583e(i18, i17, obj2));
                    c1803k.removeLast();
                    c1803k.addLast(new C1583e(i12, i13, m2621a));
                } else if (i17 >= i13) {
                    c1803k.addLast(new C1583e(i12, i13, ((C1613v) obj2).m2621a(m2621a)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                c1803k.addLast(new C1583e(i12, i13, m2621a));
            }
            i10++;
            m3061y0 = list4;
            c1813u = c1813u3;
            size = i16;
        }
        C1813u c1813u4 = c1813u;
        while (i11 <= str3.length() && !c1803k.isEmpty()) {
            C1583e c1583e4 = (C1583e) c1803k.last();
            Object obj3 = c1583e4.f10229a;
            int i19 = c1583e4.f10231c;
            arrayList3.add(new C1583e(i11, i19, obj3));
            while (!c1803k.isEmpty() && i19 == ((C1583e) c1803k.last()).f10231c) {
                c1803k.removeLast();
            }
            i11 = i19;
        }
        if (i11 < str3.length()) {
            arrayList3.add(new C1583e(i11, str3.length(), c1613v));
        }
        if (arrayList3.isEmpty()) {
            i7 = 0;
            arrayList3.add(new C1583e(0, 0, c1613v));
        } else {
            i7 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i20 = i7;
        while (i20 < size2) {
            C1583e c1583e5 = (C1583e) arrayList3.get(i20);
            int i21 = c1583e5.f10230b;
            int i22 = c1583e5.f10231c;
            if (i21 != i22) {
                str = str3.substring(i21, i22);
                AbstractC3367j.m5099d(str, "substring(...)");
            } else {
                str = "";
            }
            List m2569a = AbstractC1589h.m2569a(c1587g2, i21, i22, new C1162os(2));
            C1587g c1587g4 = new C1587g(str, m2569a == null ? c1813u4 : m2569a);
            C1613v c1613v2 = (C1613v) c1583e5.f10229a;
            if (c1613v2.f10340b == Integer.MIN_VALUE) {
                arrayList = arrayList3;
                str2 = str3;
                c1613v2 = new C1613v(c1613v2.f10339a, c1613v.f10340b, c1613v2.f10341c, c1613v2.f10342d, c1613v2.f10343e, c1613v2.f10344f, c1613v2.f10345g, c1613v2.f10346h, c1613v2.f10347i);
            } else {
                arrayList = arrayList3;
                str2 = str3;
            }
            C1604o0 c1604o03 = new C1604o0(c1604o02.f10309a, c1613v.m2621a(c1613v2));
            ?? r52 = c1587g4.f10238e;
            C1813u c1813u5 = r52 == 0 ? c1813u4 : r52;
            List list5 = (List) this.f10326c;
            ArrayList arrayList5 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i23 = 0;
            while (i23 < size3) {
                C1583e c1583e6 = (C1583e) list5.get(i23);
                int i24 = c1583e6.f10230b;
                C1613v c1613v3 = c1613v;
                int i25 = c1583e6.f10231c;
                if (AbstractC1589h.m2570b(i21, i22, i24, i25)) {
                    if (i21 > i24 || i25 > i22) {
                        AbstractC2550a.m4078a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList5.add(new C1583e(i24 - i21, i25 - i21, c1583e6.f10229a));
                } else {
                    list2 = list5;
                }
                i23++;
                list5 = list2;
                c1613v = c1613v3;
            }
            arrayList4.add(new C1611t(new C2807d(str, c1604o03, c1813u5, arrayList5, interfaceC2293d, interfaceC3093c), i21, i22));
            i20++;
            c1587g2 = c1587g;
            c1604o02 = c1604o0;
            str3 = str2;
            arrayList3 = arrayList;
        }
        this.f10324a = arrayList4;
    }
}
