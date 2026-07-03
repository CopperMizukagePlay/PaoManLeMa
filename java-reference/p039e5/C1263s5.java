package p039e5;

import android.net.RouteInfo;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Map;
import org.json.JSONObject;
import p001a0.AbstractC0094y0;
import p015b6.C0308o;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0439f;
import p024c6.C0441h;
import p024c6.C0442i;
import p053g5.C1694m;
import p060h5.C1814v;
import p082k5.InterfaceC2313c;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1263s5 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7522e;

    public /* synthetic */ C1263s5(int i7) {
        this.f7522e = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i7 = this.f7522e;
        boolean z7 = true;
        C1694m c1694m = C1694m.f10482a;
        int i8 = 0;
        String str7 = "";
        InterfaceC2313c interfaceC2313c = null;
        switch (i7) {
            case 0:
                AbstractC3367j.m5100e((String) obj, "it");
                return c1694m;
            case 1:
                EnumC1495zk enumC1495zk = (EnumC1495zk) obj;
                AbstractC3367j.m5100e(enumC1495zk, "it");
                return enumC1495zk.f9914e;
            case 2:
                EnumC1402wk enumC1402wk = (EnumC1402wk) obj;
                AbstractC3367j.m5100e(enumC1402wk, "it");
                return enumC1402wk.f8488e;
            case 3:
                AbstractC3367j.m5100e((String) obj, "it");
                return c1694m;
            case 4:
                AbstractC3367j.m5100e((String) obj, "it");
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                C0439f c0439f = (C0439f) obj;
                AbstractC3367j.m5100e(c0439f, "it");
                String group = c0439f.f1497a.group();
                AbstractC3367j.m5099d(group, "group(...)");
                return group;
            case AbstractC3122c.f15759d /* 6 */:
                String str8 = (String) obj;
                AbstractC3367j.m5100e(str8, "it");
                return AbstractC0444k.m956t0(str8).toString();
            case 7:
                String str9 = (String) obj;
                AbstractC3367j.m5100e(str9, "it");
                if (!AbstractC0451r.m971M(str9, "{", false) || !AbstractC0451r.m965G(str9, "}", false)) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 8:
                C1482z7 c1482z7 = (C1482z7) obj;
                AbstractC3367j.m5100e(c1482z7, "it");
                return AbstractC2487d.m4044h(c1482z7.f9831a, "|", c1482z7.f9832b);
            case AbstractC3122c.f15758c /* 9 */:
                C0781cm c0781cm = (C0781cm) obj;
                AbstractC3367j.m5100e(c0781cm, "it");
                return c0781cm.f3166a;
            case AbstractC3122c.f15760e /* 10 */:
                C0439f c0439f2 = (C0439f) obj;
                AbstractC3367j.m5100e(c0439f2, "it");
                C0442i c0442i = AbstractC1483z8.f9834a;
                String group2 = c0439f2.f1497a.group();
                AbstractC3367j.m5099d(group2, "group(...)");
                return new C0781cm(AbstractC1483z8.m2436a(group2), C1814v.f10861e);
            case 11:
                C0781cm c0781cm2 = (C0781cm) obj;
                AbstractC3367j.m5100e(c0781cm2, "it");
                return c0781cm2.f3166a;
            case 12:
                C0877fn c0877fn = (C0877fn) obj;
                AbstractC3367j.m5100e(c0877fn, "it");
                return c0877fn.f4045a;
            case 13:
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                return c0800d9.f3340a;
            case 14:
                C0877fn c0877fn2 = (C0877fn) obj;
                AbstractC3367j.m5100e(c0877fn2, "it");
                return c0877fn2.f4045a;
            case AbstractC3122c.f15762g /* 15 */:
                String str10 = (String) obj;
                AbstractC3367j.m5100e(str10, "line");
                String obj2 = AbstractC0444k.m956t0(str10).toString();
                C0442i c0442i2 = new C0442i("\\s+");
                AbstractC3367j.m5100e(obj2, "input");
                AbstractC0444k.m946j0(0);
                return new C0308o(new C0441h(c0442i2, obj2, interfaceC2313c, i8));
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3367j.m5100e(entry, "it");
                return entry.getKey() + "=" + entry.getValue();
            case 17:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC3367j.m5100e(entry2, "it");
                return entry2.getKey() + "=" + entry2.getValue();
            case 18:
                InetAddress gateway = ((RouteInfo) obj).getGateway();
                if (gateway == null || !(gateway instanceof Inet4Address)) {
                    return null;
                }
                String hostAddress = ((Inet4Address) gateway).getHostAddress();
                if (hostAddress != null) {
                    str = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress, '%')).toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    str7 = str;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("0.0.0.0")) {
                    return null;
                }
                return str7;
            case 19:
                return Boolean.valueOf(((RouteInfo) obj).isDefaultRoute());
            case 20:
                InetAddress gateway2 = ((RouteInfo) obj).getGateway();
                if (gateway2 == null || !(gateway2 instanceof Inet4Address)) {
                    return null;
                }
                String hostAddress2 = ((Inet4Address) gateway2).getHostAddress();
                if (hostAddress2 != null) {
                    str2 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress2, '%')).toString();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str7 = str2;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("0.0.0.0")) {
                    return null;
                }
                return str7;
            case 21:
                InetAddress gateway3 = ((RouteInfo) obj).getGateway();
                if (gateway3 == null || !(gateway3 instanceof Inet4Address)) {
                    return null;
                }
                String hostAddress3 = ((Inet4Address) gateway3).getHostAddress();
                if (hostAddress3 != null) {
                    str3 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress3, '%')).toString();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str7 = str3;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("0.0.0.0")) {
                    return null;
                }
                return str7;
            case 22:
                InetAddress gateway4 = ((RouteInfo) obj).getGateway();
                if (gateway4 == null || !(gateway4 instanceof Inet6Address)) {
                    return null;
                }
                String hostAddress4 = ((Inet6Address) gateway4).getHostAddress();
                if (hostAddress4 != null) {
                    str4 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress4, '%')).toString();
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    str7 = str4;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("::")) {
                    return null;
                }
                return str7;
            case 23:
                return Boolean.valueOf(((RouteInfo) obj).isDefaultRoute());
            case 24:
                InetAddress gateway5 = ((RouteInfo) obj).getGateway();
                if (gateway5 == null || !(gateway5 instanceof Inet6Address)) {
                    return null;
                }
                String hostAddress5 = ((Inet6Address) gateway5).getHostAddress();
                if (hostAddress5 != null) {
                    str5 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress5, '%')).toString();
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    str7 = str5;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("::")) {
                    return null;
                }
                return str7;
            case 25:
                InetAddress gateway6 = ((RouteInfo) obj).getGateway();
                if (gateway6 == null || !(gateway6 instanceof Inet6Address)) {
                    return null;
                }
                String hostAddress6 = ((Inet6Address) gateway6).getHostAddress();
                if (hostAddress6 != null) {
                    str6 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(hostAddress6, '%')).toString();
                } else {
                    str6 = null;
                }
                if (str6 != null) {
                    str7 = str6;
                }
                if (AbstractC0444k.m937a0(str7) || str7.equals("::")) {
                    return null;
                }
                return str7;
            case 26:
                C0439f c0439f3 = (C0439f) obj;
                AbstractC3367j.m5100e(c0439f3, "it");
                String group3 = c0439f3.f1497a.group();
                AbstractC3367j.m5099d(group3, "group(...)");
                return AbstractC0451r.m973O(group3);
            case 27:
                return Boolean.valueOf(((JSONObject) obj).optBoolean("draft"));
            case 28:
                String str11 = (String) obj;
                AbstractC3367j.m5100e(str11, "arg");
                if (AbstractC0444k.m929S(str11, ' ')) {
                    return AbstractC0094y0.m185l("\"", str11, "\"");
                }
                return str11;
            default:
                AbstractC3367j.m5100e((String) obj, "it");
                return Boolean.valueOf(!AbstractC0444k.m937a0(r13));
        }
    }
}
