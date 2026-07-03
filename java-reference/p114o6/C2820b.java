package p114o6;

import java.util.ArrayList;
import p001a0.C0068q2;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p099m6.AbstractC2602f0;
import p099m6.C2592a0;
import p099m6.C2596c0;
import p099m6.C2597d;
import p099m6.C2598d0;
import p099m6.C2617r;
import p099m6.EnumC2624y;
import p099m6.InterfaceC2620u;
import p106n6.AbstractC2721b;
import p136r6.C3070g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o6.b */
/* loaded from: classes.dex */
public final class C2820b implements InterfaceC2620u {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    @Override // p099m6.InterfaceC2620u
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2598d0 mo4178a(C3070g c3070g) {
        C0068q2 c0068q2;
        C0068q2 c0068q22;
        int i7;
        String str;
        int i8;
        C0068q2 c0068q23;
        C2617r c2617r;
        int i9;
        String str2;
        int length;
        System.currentTimeMillis();
        C2592a0 c2592a0 = c3070g.f15667e;
        AbstractC3367j.m5100e(c2592a0, "request");
        C0068q2 c0068q24 = new C0068q2(19, c2592a0, (Object) null);
        C2597d c2597d = c2592a0.f14023f;
        if (c2597d == null) {
            int i10 = C2597d.f14042n;
            C2617r c2617r2 = c2592a0.f14020c;
            int size = c2617r2.size();
            String str3 = null;
            int i11 = 0;
            boolean z7 = true;
            boolean z8 = false;
            boolean z9 = false;
            int i12 = -1;
            int i13 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i14 = -1;
            int i15 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (i11 < size) {
                String m4165b = c2617r2.m4165b(i11);
                String m4167d = c2617r2.m4167d(i11);
                if (AbstractC0451r.m966H(m4165b, "Cache-Control")) {
                    if (str3 == null) {
                        str3 = m4167d;
                        i8 = 0;
                        while (i8 < m4167d.length()) {
                            int length2 = m4167d.length();
                            int i16 = i8;
                            while (true) {
                                if (i16 < length2) {
                                    c0068q23 = c0068q24;
                                    if (AbstractC0444k.m929S("=,;", m4167d.charAt(i16))) {
                                        break;
                                    }
                                    i16++;
                                    c0068q24 = c0068q23;
                                } else {
                                    c0068q23 = c0068q24;
                                    i16 = m4167d.length();
                                    break;
                                }
                            }
                            String substring = m4167d.substring(i8, i16);
                            AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = AbstractC0444k.m956t0(substring).toString();
                            if (i16 == m4167d.length() || m4167d.charAt(i16) == ',' || m4167d.charAt(i16) == ';') {
                                c2617r = c2617r2;
                                i9 = size;
                                i8 = i16 + 1;
                                str2 = null;
                            } else {
                                int i17 = i16 + 1;
                                byte[] bArr = AbstractC2721b.f14569a;
                                int length3 = m4167d.length();
                                while (true) {
                                    if (i17 < length3) {
                                        char charAt = m4167d.charAt(i17);
                                        int i18 = i17;
                                        if (charAt != ' ' && charAt != '\t') {
                                            length = i18;
                                            break;
                                        }
                                        i17 = i18 + 1;
                                    } else {
                                        length = m4167d.length();
                                        break;
                                    }
                                }
                                if (length < m4167d.length() && m4167d.charAt(length) == '\"') {
                                    int i19 = length + 1;
                                    int m934X = AbstractC0444k.m934X(m4167d, '\"', i19, 4);
                                    str2 = m4167d.substring(i19, m934X);
                                    AbstractC3367j.m5099d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    c2617r = c2617r2;
                                    i9 = size;
                                    i8 = m934X + 1;
                                } else {
                                    int length4 = m4167d.length();
                                    int i20 = length;
                                    while (true) {
                                        if (i20 < length4) {
                                            c2617r = c2617r2;
                                            i9 = size;
                                            if (AbstractC0444k.m929S(",;", m4167d.charAt(i20))) {
                                                break;
                                            }
                                            i20++;
                                            c2617r2 = c2617r;
                                            size = i9;
                                        } else {
                                            c2617r = c2617r2;
                                            i9 = size;
                                            i20 = m4167d.length();
                                            break;
                                        }
                                    }
                                    String substring2 = m4167d.substring(length, i20);
                                    AbstractC3367j.m5099d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str2 = AbstractC0444k.m956t0(substring2).toString();
                                    i8 = i20;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z8 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z9 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i12 = AbstractC2721b.m4379y(str2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i13 = AbstractC2721b.m4379y(str2, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z10 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z11 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z12 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i14 = AbstractC2721b.m4379y(str2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i15 = AbstractC2721b.m4379y(str2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z13 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z14 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z15 = true;
                            }
                            c0068q24 = c0068q23;
                            c2617r2 = c2617r;
                            size = i9;
                        }
                        i11++;
                        c0068q24 = c0068q24;
                        c2617r2 = c2617r2;
                        size = size;
                    }
                } else if (!AbstractC0451r.m966H(m4165b, "Pragma")) {
                    i11++;
                    c0068q24 = c0068q24;
                    c2617r2 = c2617r2;
                    size = size;
                }
                z7 = false;
                i8 = 0;
                while (i8 < m4167d.length()) {
                }
                i11++;
                c0068q24 = c0068q24;
                c2617r2 = c2617r2;
                size = size;
            }
            c0068q2 = c0068q24;
            if (!z7) {
                str = null;
            } else {
                str = str3;
            }
            C2597d c2597d2 = new C2597d(z8, z9, i12, i13, z10, z11, z12, i14, i15, z13, z14, z15, str);
            c2592a0.f14023f = c2597d2;
            c2597d = c2597d2;
        } else {
            c0068q2 = c0068q24;
        }
        if (c2597d.f14052j) {
            Object obj2 = null;
            c0068q22 = new C0068q2(19, obj2, obj2);
        } else {
            c0068q22 = c0068q2;
        }
        C2592a0 c2592a02 = (C2592a0) c0068q22.f344f;
        C2598d0 c2598d0 = (C2598d0) c0068q22.f345g;
        if (c2592a02 == null && c2598d0 == null) {
            ArrayList arrayList = new ArrayList(20);
            return new C2598d0(c2592a0, EnumC2624y.f14223g, "Unsatisfiable Request (only-if-cached)", 504, null, new C2617r((String[]) arrayList.toArray(new String[0])), AbstractC2721b.f14571c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (c2592a02 == null) {
            AbstractC3367j.m5097b(c2598d0);
            C2596c0 m4143d = c2598d0.m4143d();
            C2598d0 m4444a = C2819a.m4444a(c2598d0);
            C2596c0.m4139b("cacheResponse", m4444a);
            m4143d.f14037i = m4444a;
            return m4143d.m4140a();
        }
        C2598d0 m4746b = c3070g.m4746b(c2592a02);
        if (c2598d0 != null) {
            if (m4746b.f14059h == 304) {
                C2596c0 m4143d2 = c2598d0.m4143d();
                C2617r c2617r3 = c2598d0.f14061j;
                C2617r c2617r4 = m4746b.f14061j;
                ArrayList arrayList2 = new ArrayList(20);
                int size2 = c2617r3.size();
                int i21 = 0;
                while (i21 < size2) {
                    String m4165b2 = c2617r3.m4165b(i21);
                    int i22 = size2;
                    String m4167d2 = c2617r3.m4167d(i21);
                    C2617r c2617r5 = c2617r3;
                    if ("Warning".equalsIgnoreCase(m4165b2)) {
                        i7 = i21;
                        if (AbstractC0451r.m971M(m4167d2, "1", false)) {
                            i21 = i7 + 1;
                            size2 = i22;
                            c2617r3 = c2617r5;
                        }
                    } else {
                        i7 = i21;
                    }
                    if ("Content-Length".equalsIgnoreCase(m4165b2) || "Content-Encoding".equalsIgnoreCase(m4165b2) || "Content-Type".equalsIgnoreCase(m4165b2) || !C2819a.m4445b(m4165b2) || c2617r4.m4164a(m4165b2) == null) {
                        AbstractC3367j.m5100e(m4165b2, "name");
                        AbstractC3367j.m5100e(m4167d2, "value");
                        arrayList2.add(m4165b2);
                        arrayList2.add(AbstractC0444k.m956t0(m4167d2).toString());
                    }
                    i21 = i7 + 1;
                    size2 = i22;
                    c2617r3 = c2617r5;
                }
                int size3 = c2617r4.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    String m4165b3 = c2617r4.m4165b(i23);
                    if (!"Content-Length".equalsIgnoreCase(m4165b3) && !"Content-Encoding".equalsIgnoreCase(m4165b3) && !"Content-Type".equalsIgnoreCase(m4165b3) && C2819a.m4445b(m4165b3)) {
                        String m4167d3 = c2617r4.m4167d(i23);
                        AbstractC3367j.m5100e(m4165b3, "name");
                        AbstractC3367j.m5100e(m4167d3, "value");
                        arrayList2.add(m4165b3);
                        arrayList2.add(AbstractC0444k.m956t0(m4167d3).toString());
                    }
                }
                m4143d2.f14034f = new C2617r((String[]) arrayList2.toArray(new String[0])).m4166c();
                m4143d2.f14039k = m4746b.f14066o;
                m4143d2.f14040l = m4746b.f14067p;
                C2598d0 m4444a2 = C2819a.m4444a(c2598d0);
                C2596c0.m4139b("cacheResponse", m4444a2);
                m4143d2.f14037i = m4444a2;
                C2598d0 m4444a3 = C2819a.m4444a(m4746b);
                C2596c0.m4139b("networkResponse", m4444a3);
                m4143d2.f14036h = m4444a3;
                m4143d2.m4140a();
                AbstractC2602f0 abstractC2602f0 = m4746b.f14062k;
                AbstractC3367j.m5097b(abstractC2602f0);
                abstractC2602f0.close();
                AbstractC3367j.m5097b(null);
                throw null;
            }
            AbstractC2602f0 abstractC2602f02 = c2598d0.f14062k;
            if (abstractC2602f02 != null) {
                AbstractC2721b.m4358d(abstractC2602f02);
            }
        }
        C2596c0 m4143d3 = m4746b.m4143d();
        C2598d0 m4444a4 = C2819a.m4444a(c2598d0);
        C2596c0.m4139b("cacheResponse", m4444a4);
        m4143d3.f14037i = m4444a4;
        C2598d0 m4444a5 = C2819a.m4444a(m4746b);
        C2596c0.m4139b("networkResponse", m4444a5);
        m4143d3.f14036h = m4444a5;
        return m4143d3.m4140a();
    }
}
