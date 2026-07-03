package p001a0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p024c6.AbstractC0444k;
import p039e5.AbstractC1092mk;
import p039e5.C0811dk;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.y0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0094y0 {
    /* renamed from: a */
    public static int m174a(double d7, int i7, int i8) {
        return (Double.hashCode(d7) + i7) * i8;
    }

    /* renamed from: b */
    public static int m175b(int i7, int i8, String str) {
        return (str.hashCode() + i7) * i8;
    }

    /* renamed from: c */
    public static int m176c(List list, int i7, int i8) {
        return (list.hashCode() + i7) * i8;
    }

    /* renamed from: d */
    public static SharedPreferences.Editor m177d(Context context, String str, String str2, int i7) {
        AbstractC3367j.m5100e(context, str);
        return context.getSharedPreferences(str2, i7).edit();
    }

    /* renamed from: e */
    public static SharedPreferences.Editor m178e(InterfaceC2425y0 interfaceC2425y0, Boolean bool, Context context, String str, int i7) {
        interfaceC2425y0.setValue(bool);
        return context.getSharedPreferences(str, i7).edit();
    }

    /* renamed from: f */
    public static C0811dk m179f(float f7, float f8) {
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(f7, f8);
        return c0811dk;
    }

    /* renamed from: g */
    public static Object m180g(int i7, C2395p c2395p) {
        c2395p.m3888r(false);
        c2395p.m3857Z(i7);
        return c2395p.m3847O();
    }

    /* renamed from: h */
    public static Object m181h(int i7, C2395p c2395p, boolean z7) {
        c2395p.m3888r(z7);
        c2395p.m3857Z(i7);
        return c2395p.m3847O();
    }

    /* renamed from: i */
    public static String m182i(int i7, int i8, String str, String str2) {
        return str + i7 + str2 + i8;
    }

    /* renamed from: j */
    public static String m183j(int i7, int i8, String str, String str2, String str3) {
        return str + i7 + str2 + i8 + str3;
    }

    /* renamed from: k */
    public static String m184k(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    /* renamed from: l */
    public static String m185l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: m */
    public static String m186m(StringBuilder sb, float f7, char c7) {
        sb.append(f7);
        sb.append(c7);
        return sb.toString();
    }

    /* renamed from: n */
    public static String m187n(StringBuilder sb, String str, char c7) {
        sb.append(str);
        sb.append(c7);
        return sb.toString();
    }

    /* renamed from: o */
    public static StringBuilder m188o(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    /* renamed from: p */
    public static StringBuilder m189p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* renamed from: q */
    public static C2361g1 m190q(Context context, String str, int i7, String str2, boolean z7) {
        return AbstractC2418w.m3980x(Boolean.valueOf(context.getSharedPreferences(str, i7).getBoolean(str2, z7)));
    }

    /* renamed from: r */
    public static void m191r(String str, ArrayList arrayList) {
        arrayList.add(AbstractC0444k.m956t0(str).toString());
    }

    /* renamed from: s */
    public static void m192s(StringBuilder sb, int i7, String str, int i8, String str2) {
        sb.append(i7);
        sb.append(str);
        sb.append(i8);
        sb.append(str2);
    }

    /* renamed from: t */
    public static void m193t(StringBuilder sb, String str, double d7, String str2) {
        sb.append(str);
        sb.append(d7);
        sb.append(str2);
    }

    /* renamed from: u */
    public static void m194u(InterfaceC2425y0 interfaceC2425y0, Boolean bool, Context context, String str, boolean z7) {
        interfaceC2425y0.setValue(bool);
        AbstractC1092mk.m1693K3(context).edit().putBoolean(str, z7).apply();
    }

    /* renamed from: v */
    public static void m195v(InterfaceC2425y0 interfaceC2425y0, String str, Context context, String str2, String str3) {
        interfaceC2425y0.setValue(str);
        AbstractC1092mk.m1693K3(context).edit().putString(str2, str3).apply();
    }

    /* renamed from: w */
    public static boolean m196w(C2395p c2395p, int i7, InterfaceC2425y0 interfaceC2425y0) {
        c2395p.m3888r(false);
        c2395p.m3857Z(i7);
        return c2395p.m3870g(interfaceC2425y0);
    }
}
