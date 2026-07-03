package p039e5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.AbstractC0094y0;
import p015b6.AbstractC0307n;
import p015b6.C0300g;
import p015b6.C0301h;
import p015b6.C0302i;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0437d;
import p024c6.C0442i;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p068i5.C2077a;
import p068i5.C2079c;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.v7 */
/* loaded from: classes.dex */
public abstract class AbstractC1358v7 {

    /* renamed from: a */
    public static final C0442i f8121a = new C0442i("(?<!\\d)(?:\\d{1,3}\\.){3}\\d{1,3}(?:/\\d{1,2})?(?!\\d)");

    /* renamed from: b */
    public static final Set f8122b = AbstractC1793a0.m2971K("label", "cidr", "序号", "省份", "地区", "城市", "运营商", "中国电信", "中国联通", "中国移动", "典型", "subnet", "地域", "备注");

    /* renamed from: a */
    public static Integer m2368a(JSONObject jSONObject, LinkedHashMap linkedHashMap) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("label", "");
            AbstractC3367j.m5099d(optString, "optString(...)");
            String obj = AbstractC0444k.m956t0(optString).toString();
            String optString2 = jSONObject.optString("cidr", "");
            AbstractC3367j.m5099d(optString2, "optString(...)");
            String obj2 = AbstractC0444k.m956t0(optString2).toString();
            if (!AbstractC0444k.m937a0(obj2)) {
                C0878fo c0878fo = new C0878fo(obj, obj2);
                if (AbstractC1249rm.m2287t0(c0878fo) != null) {
                    linkedHashMap.put(obj + "|" + obj2, c0878fo);
                    return null;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x03d7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0171, code lost:
    
        if (r13.f1508e.matcher(r5).find() == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1327u7 m2369b(String str) {
        C1327u7 c1327u7;
        Object m2985m;
        Iterator it;
        C1813u c1813u;
        boolean z7;
        String str2;
        List list;
        ArrayList arrayList;
        List list2;
        String str3;
        Object obj;
        boolean z8;
        List<C0878fo> list3;
        ArrayList arrayList2;
        String str4;
        Object obj2;
        String str5;
        String str6;
        Object obj3;
        AbstractC3367j.m5100e(str, "raw");
        String m943g0 = AbstractC0444k.m943g0(AbstractC0444k.m956t0(str).toString(), "\ufeff");
        boolean m937a0 = AbstractC0444k.m937a0(m943g0);
        C1813u c1813u2 = C1813u.f10860e;
        ?? r32 = 0;
        if (m937a0) {
            return new C1327u7(c1813u2, 0, "剪贴板为空");
        }
        C2079c m5802f = AbstractC3784a.m5802f();
        String obj4 = AbstractC0444k.m956t0(m943g0).toString();
        if (AbstractC0451r.m971M(obj4, "[", false)) {
            m5802f.add(obj4);
        }
        int i7 = 1;
        C0300g c0300g = new C0300g(new C0301h(new C0302i(AbstractC0444k.m940d0(obj4), new C1263s5(6), 1), true, new C1263s5(7)));
        while (c0300g.hasNext()) {
            m5802f.add((String) c0300g.next());
        }
        C2079c m5798b = AbstractC3784a.m5798b(m5802f);
        String str7 = null;
        if (!m5798b.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ListIterator listIterator = m5798b.listIterator(0);
            int i8 = 0;
            while (true) {
                C2077a c2077a = (C2077a) listIterator;
                if (!c2077a.hasNext()) {
                    break;
                }
                String str8 = (String) c2077a.next();
                try {
                    boolean m971M = AbstractC0451r.m971M(str8, "[", false);
                    m2985m = C1694m.f10482a;
                    if (m971M) {
                        JSONArray jSONArray = new JSONArray(str8);
                        int length = jSONArray.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            Integer m2368a = m2368a(jSONArray.optJSONObject(i9), linkedHashMap);
                            if (m2368a != null) {
                                i8 += m2368a.intValue();
                            }
                        }
                    } else {
                        Integer m2368a2 = m2368a(new JSONObject(str8), linkedHashMap);
                        if (m2368a2 != null) {
                            i8 += m2368a2.intValue();
                        } else {
                            m2985m = null;
                        }
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (C1690i.m2747a(m2985m) != null) {
                    i8++;
                }
            }
            if (!linkedHashMap.isEmpty()) {
                Collection values = linkedHashMap.values();
                AbstractC3367j.m5099d(values, "<get-values>(...)");
                c1327u7 = new C1327u7(AbstractC1805m.m3035C0(values), i8, null);
                if (c1327u7 == null) {
                    return c1327u7;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it2 = AbstractC0444k.m940d0(m943g0).iterator();
                int i10 = 0;
                while (true) {
                    C0437d c0437d = (C0437d) it2;
                    if (c0437d.hasNext()) {
                        String obj5 = AbstractC0444k.m956t0((String) c0437d.next()).toString();
                        if (!AbstractC0444k.m937a0(obj5)) {
                            String lowerCase = obj5.toLowerCase(Locale.ROOT);
                            AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
                            Set set = f8122b;
                            boolean z9 = set instanceof Collection;
                            C0442i c0442i = f8121a;
                            if (!z9 || !set.isEmpty()) {
                                Iterator it3 = set.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
                                    AbstractC3367j.m5099d(lowerCase2, "toLowerCase(...)");
                                    if (AbstractC0444k.m928R(lowerCase, lowerCase2, r32)) {
                                        c0442i.getClass();
                                    }
                                }
                            }
                            if (!AbstractC0451r.m971M(obj5, "序号", r32) && !AbstractC0451r.m971M(lowerCase, "label\t", r32) && !AbstractC0451r.m971M(lowerCase, "label,", r32)) {
                                List m668G = AbstractC0307n.m668G(new C0302i(C0442i.m926b(c0442i, obj5), new C1263s5(5), i7));
                                if (m668G.isEmpty()) {
                                    it = it2;
                                    c1813u = c1813u2;
                                    z8 = r32;
                                    str2 = str7;
                                    list3 = c1813u;
                                } else {
                                    if (AbstractC0444k.m929S(obj5, '\t')) {
                                        char[] cArr = new char[i7];
                                        cArr[r32] = '\t';
                                        List m948l0 = AbstractC0444k.m948l0(obj5, cArr);
                                        ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(m948l0));
                                        Iterator it4 = m948l0.iterator();
                                        while (it4.hasNext()) {
                                            AbstractC0094y0.m191r((String) it4.next(), arrayList3);
                                        }
                                        arrayList = new ArrayList();
                                        int size = arrayList3.size();
                                        int i11 = r32;
                                        while (i11 < size) {
                                            Object obj6 = arrayList3.get(i11);
                                            i11++;
                                            if (!AbstractC0444k.m937a0((String) obj6)) {
                                                arrayList.add(obj6);
                                            }
                                        }
                                    } else if (AbstractC0444k.m929S(obj5, ',')) {
                                        char[] cArr2 = new char[i7];
                                        cArr2[r32] = ',';
                                        List m948l02 = AbstractC0444k.m948l0(obj5, cArr2);
                                        ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(m948l02));
                                        Iterator it5 = m948l02.iterator();
                                        while (it5.hasNext()) {
                                            AbstractC0094y0.m191r((String) it5.next(), arrayList4);
                                        }
                                        arrayList = new ArrayList();
                                        int size2 = arrayList4.size();
                                        int i12 = r32;
                                        while (i12 < size2) {
                                            Object obj7 = arrayList4.get(i12);
                                            i12++;
                                            if (!AbstractC0444k.m937a0((String) obj7)) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                    } else {
                                        Pattern compile = Pattern.compile("\\s{2,}|\\s+(?=\\d)");
                                        AbstractC3367j.m5099d(compile, "compile(...)");
                                        AbstractC0444k.m946j0(r32);
                                        Matcher matcher = compile.matcher(obj5);
                                        if (!matcher.find()) {
                                            list = AbstractC3784a.m5817z(obj5.toString());
                                        } else {
                                            ArrayList arrayList5 = new ArrayList(10);
                                            int i13 = r32;
                                            do {
                                                arrayList5.add(obj5.subSequence(i13, matcher.start()).toString());
                                                i13 = matcher.end();
                                            } while (matcher.find());
                                            arrayList5.add(obj5.subSequence(i13, obj5.length()).toString());
                                            list = arrayList5;
                                        }
                                        ArrayList arrayList6 = new ArrayList(AbstractC1807o.m3073U(list));
                                        Iterator it6 = list.iterator();
                                        while (it6.hasNext()) {
                                            AbstractC0094y0.m191r((String) it6.next(), arrayList6);
                                        }
                                        arrayList = new ArrayList();
                                        int size3 = arrayList6.size();
                                        int i14 = r32;
                                        while (i14 < size3) {
                                            Object obj8 = arrayList6.get(i14);
                                            i14++;
                                            if (!AbstractC0444k.m937a0((String) obj8)) {
                                                arrayList.add(obj8);
                                            }
                                        }
                                    }
                                    String str9 = "input";
                                    String str10 = "";
                                    if (m668G.size() == i7) {
                                        String str11 = (String) AbstractC1805m.m3045i0(m668G);
                                        int size4 = arrayList.size();
                                        int i15 = r32;
                                        while (true) {
                                            if (i15 < size4) {
                                                obj3 = arrayList.get(i15);
                                                i15++;
                                                String str12 = (String) obj3;
                                                if (!AbstractC3367j.m5096a(str12, str11)) {
                                                    str6 = str7;
                                                    String obj9 = AbstractC0444k.m956t0(str12).toString();
                                                    c0442i.getClass();
                                                    AbstractC3367j.m5100e(obj9, "input");
                                                    if (c0442i.f1508e.matcher(obj9).matches()) {
                                                        continue;
                                                    } else {
                                                        for (int i16 = 0; i16 < str12.length(); i16++) {
                                                            if (!Character.isDigit(str12.charAt(i16))) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str6 = str7;
                                                }
                                                str7 = str6;
                                            } else {
                                                str6 = str7;
                                                obj3 = str6;
                                                break;
                                            }
                                        }
                                        String str13 = (String) obj3;
                                        if (str13 != null) {
                                            str10 = str13;
                                        }
                                        list3 = AbstractC3784a.m5817z(new C0878fo(str10, str11));
                                        it = it2;
                                        c1813u = c1813u2;
                                        z8 = false;
                                        str2 = str6;
                                    } else {
                                        ?? r17 = str7;
                                        List m3067O = AbstractC1806n.m3067O("电信", "联通", "移动");
                                        int size5 = arrayList.size();
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < size5) {
                                                obj = arrayList.get(i17);
                                                i17++;
                                                it = it2;
                                                String str14 = (String) obj;
                                                list2 = m668G;
                                                String obj10 = AbstractC0444k.m956t0(str14).toString();
                                                c0442i.getClass();
                                                AbstractC3367j.m5100e(obj10, "input");
                                                str3 = str10;
                                                if (!c0442i.f1508e.matcher(obj10).matches()) {
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 >= str14.length()) {
                                                            break;
                                                        }
                                                        if (!Character.isDigit(str14.charAt(i18))) {
                                                            if (!m3067O.isEmpty()) {
                                                                Iterator it7 = m3067O.iterator();
                                                                while (it7.hasNext()) {
                                                                    String str15 = (String) it7.next();
                                                                    if (!str14.equals(str15)) {
                                                                        Iterator it8 = it7;
                                                                        if (AbstractC0451r.m965G(str14, str15, false)) {
                                                                            break;
                                                                        }
                                                                        it7 = it8;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        i18++;
                                                    }
                                                }
                                                it2 = it;
                                                str10 = str3;
                                                m668G = list2;
                                            } else {
                                                it = it2;
                                                list2 = m668G;
                                                str3 = str10;
                                                obj = r17;
                                                break;
                                            }
                                        }
                                        String str16 = (String) obj;
                                        if (str16 == null) {
                                            str16 = str3;
                                        }
                                        String obj11 = AbstractC0444k.m956t0(str16).toString();
                                        Iterator it9 = AbstractC1806n.m3067O("维吾尔自治区", "壮族自治区", "回族自治区", "特别行政区", "自治区", "省", "市").iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                break;
                                            }
                                            String str17 = (String) it9.next();
                                            if (AbstractC0451r.m965G(obj11, str17, false)) {
                                                obj11 = AbstractC0444k.m944h0(obj11, str17);
                                                break;
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList(AbstractC1807o.m3073U(list2));
                                        Iterator it10 = list2.iterator();
                                        int i19 = 0;
                                        while (it10.hasNext()) {
                                            Object next = it10.next();
                                            int i20 = i19 + 1;
                                            if (i19 >= 0) {
                                                String str18 = (String) next;
                                                Iterator it11 = it10;
                                                int size6 = arrayList.size();
                                                C1813u c1813u3 = c1813u2;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i21 < size6) {
                                                        obj2 = arrayList.get(i21);
                                                        int i22 = i21 + 1;
                                                        String str19 = (String) obj2;
                                                        arrayList2 = arrayList;
                                                        String obj12 = AbstractC0444k.m956t0(str19).toString();
                                                        c0442i.getClass();
                                                        AbstractC3367j.m5100e(obj12, str9);
                                                        str4 = str9;
                                                        if (!c0442i.f1508e.matcher(obj12).matches()) {
                                                            for (int i23 = 0; i23 < str19.length(); i23++) {
                                                                if (!Character.isDigit(str19.charAt(i23))) {
                                                                    if (AbstractC0451r.m965G(str19, "电信", false) || AbstractC0451r.m965G(str19, "联通", false) || AbstractC0451r.m965G(str19, "移动", false)) {
                                                                        break;
                                                                    }
                                                                    i21 = i22;
                                                                    str9 = str4;
                                                                    arrayList = arrayList2;
                                                                }
                                                            }
                                                        }
                                                        i21 = i22;
                                                        str9 = str4;
                                                        arrayList = arrayList2;
                                                    } else {
                                                        arrayList2 = arrayList;
                                                        str4 = str9;
                                                        obj2 = r17;
                                                        break;
                                                    }
                                                }
                                                String str20 = (String) obj2;
                                                if (str20 == null) {
                                                    if (!AbstractC0444k.m937a0(obj11) && i19 < m3067O.size()) {
                                                        str20 = obj11 + m3067O.get(i19);
                                                    } else {
                                                        str5 = str3;
                                                        arrayList7.add(new C0878fo(str5, str18));
                                                        i19 = i20;
                                                        it10 = it11;
                                                        c1813u2 = c1813u3;
                                                        str9 = str4;
                                                        arrayList = arrayList2;
                                                    }
                                                }
                                                str5 = str20;
                                                arrayList7.add(new C0878fo(str5, str18));
                                                i19 = i20;
                                                it10 = it11;
                                                c1813u2 = c1813u3;
                                                str9 = str4;
                                                arrayList = arrayList2;
                                            } else {
                                                AbstractC1806n.m3072T();
                                                throw r17;
                                            }
                                        }
                                        c1813u = c1813u2;
                                        z8 = false;
                                        list3 = arrayList7;
                                        str2 = r17;
                                    }
                                }
                                for (C0878fo c0878fo : list3) {
                                    String m4044h = AbstractC2487d.m4044h(c0878fo.f4047a, "|", c0878fo.f4048b);
                                    if (AbstractC1249rm.m2287t0(c0878fo) == null) {
                                        i10++;
                                    } else {
                                        linkedHashMap2.put(m4044h, c0878fo);
                                    }
                                }
                                z7 = z8;
                            }
                            it = it2;
                            c1813u = c1813u2;
                            z7 = r32;
                            str2 = str7;
                            i10++;
                        } else {
                            it = it2;
                            c1813u = c1813u2;
                            z7 = r32;
                            str2 = str7;
                        }
                        r32 = z7;
                        str7 = str2;
                        it2 = it;
                        c1813u2 = c1813u;
                        i7 = 1;
                    } else {
                        C1813u c1813u4 = c1813u2;
                        String str21 = str7;
                        Collection values2 = linkedHashMap2.values();
                        AbstractC3367j.m5099d(values2, "<get-values>(...)");
                        List m3035C0 = AbstractC1805m.m3035C0(values2);
                        if (m3035C0.isEmpty()) {
                            return new C1327u7(c1813u4, i10, "未能识别有效 Subnet，请从 Excel「App导入格式」复制 label 与 cidr 两列后重试");
                        }
                        return new C1327u7(m3035C0, i10, str21);
                    }
                }
            }
        }
        c1327u7 = null;
        if (c1327u7 == null) {
        }
    }
}
