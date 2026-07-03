package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0438e;
import p024c6.C0439f;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fc */
/* loaded from: classes.dex */
public final /* synthetic */ class C0866fc implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3985e;

    public /* synthetic */ C0866fc(int i7) {
        this.f3985e = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        boolean z8;
        int i7;
        List list;
        Long m974P;
        switch (this.f3985e) {
            case 0:
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 1:
                ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                AbstractC3367j.m5099d(list2, "list(...)");
                return AbstractC1805m.m3039c0(list2);
            case 2:
                InetAddress inetAddress = (InetAddress) obj;
                if (!inetAddress.isLoopbackAddress() && inetAddress.getAddress().length == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 3:
                return ((InetAddress) obj).getHostAddress();
            case 4:
                AbstractC3367j.m5100e((String) obj, "it");
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C1301tc c1301tc = (C1301tc) obj;
                AbstractC3367j.m5100e(c1301tc, "it");
                return Integer.valueOf(c1301tc.f7782a);
            case AbstractC3122c.f15759d /* 6 */:
                C0910go c0910go = (C0910go) obj;
                AbstractC3367j.m5100e(c0910go, "it");
                return c0910go.f4322a;
            case 7:
                C1467yn c1467yn = (C1467yn) obj;
                AbstractC3367j.m5100e(c1467yn, "it");
                return c1467yn.f9464a;
            case 8:
                C1065lo c1065lo = (C1065lo) obj;
                AbstractC3367j.m5100e(c1065lo, "it");
                return Long.valueOf(c1065lo.f5706a);
            case AbstractC3122c.f15758c /* 9 */:
                C1189po c1189po = (C1189po) obj;
                AbstractC3367j.m5100e(c1189po, "it");
                return c1189po.f6927b;
            case AbstractC3122c.f15760e /* 10 */:
                C1467yn c1467yn2 = (C1467yn) obj;
                AbstractC3367j.m5100e(c1467yn2, "it");
                return c1467yn2.f9464a;
            case 11:
                return ((C1248rl) obj).f7391b;
            case 12:
                return AbstractC1249rm.m2247Z((C0707ac) obj);
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                List<C0948hu> list3 = (List) entry.getValue();
                int i8 = 0;
                if (list3 != null && list3.isEmpty()) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    for (C0948hu c0948hu : list3) {
                        if (!AbstractC0444k.m937a0(c0948hu.f4664f) && c0948hu.f4665g > 0 && (i7 = i7 + 1) < 0) {
                            AbstractC1806n.m3071S();
                            throw null;
                        }
                    }
                }
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((C0948hu) it.next()).f4668j >= 0.05d && (i8 = i8 + 1) < 0) {
                            AbstractC1806n.m3071S();
                            throw null;
                        }
                    }
                }
                return str + " workers=" + list3.size() + " connected=" + i7 + " activeSpeed=" + i8;
            case 14:
                C0716al c0716al = (C0716al) obj;
                AbstractC3367j.m5100e(c0716al, "it");
                return AbstractC0444k.m956t0(c0716al.f2442a).toString();
            case AbstractC3122c.f15762g /* 15 */:
                String network = ((Network) obj).toString();
                AbstractC3367j.m5099d(network, "toString(...)");
                return network;
            case 16:
                C1248rl c1248rl = (C1248rl) obj;
                AbstractC3367j.m5100e(c1248rl, "it");
                return AbstractC1249rm.m2251b0(c1248rl);
            case 17:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "line");
                C0439f m927a = AbstractC0972in.f4931b.m927a(str2);
                if (m927a != null) {
                    String obj2 = AbstractC0444k.m956t0(AbstractC0444k.m954r0((String) ((C0438e) m927a.m923a()).get(1), "@")).toString();
                    String str3 = (String) ((C0438e) m927a.m923a()).get(2);
                    if (AbstractC0444k.m928R(str3, "UP", false) && !AbstractC0444k.m928R(str3, "LOOPBACK", false) && (AbstractC0451r.m971M(obj2, "wlan", false) || AbstractC0451r.m971M(obj2, "rmnet", false) || AbstractC0451r.m971M(obj2, "ccmni", false) || AbstractC0451r.m971M(obj2, "wwan", false) || AbstractC0451r.m971M(obj2, "seth", false) || AbstractC0451r.m971M(obj2, "eth", false) || AbstractC0451r.m971M(obj2, "usb", false))) {
                        return obj2;
                    }
                }
                return null;
            case 18:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "it");
                return AbstractC0444k.m956t0(str4).toString();
            case 19:
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                return Boolean.valueOf(AbstractC0451r.m971M(str5, "Tcp:", false));
            case 20:
                String str6 = (String) obj;
                AbstractC3367j.m5100e(str6, "line");
                Pattern compile = Pattern.compile("\\s+");
                AbstractC3367j.m5099d(compile, "compile(...)");
                int i9 = 0;
                AbstractC0444k.m946j0(0);
                Matcher matcher = compile.matcher(str6);
                if (!matcher.find()) {
                    return AbstractC3784a.m5817z(str6.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                do {
                    arrayList.add(str6.subSequence(i9, matcher.start()).toString());
                    i9 = matcher.end();
                } while (matcher.find());
                arrayList.add(str6.subSequence(i9, str6.length()).toString());
                return arrayList;
            case 21:
                String str7 = (String) obj;
                AbstractC3367j.m5100e(str7, "it");
                List m949m0 = AbstractC0444k.m949m0(str7, new String[]{":"}, 6);
                if (m949m0.size() == 2) {
                    String obj3 = AbstractC0444k.m956t0((String) m949m0.get(0)).toString();
                    String obj4 = AbstractC0444k.m956t0((String) m949m0.get(1)).toString();
                    Pattern compile2 = Pattern.compile("\\s+");
                    AbstractC3367j.m5099d(compile2, "compile(...)");
                    AbstractC3367j.m5100e(obj4, "input");
                    AbstractC0444k.m946j0(0);
                    Matcher matcher2 = compile2.matcher(obj4);
                    if (!matcher2.find()) {
                        list = AbstractC3784a.m5817z(obj4.toString());
                    } else {
                        ArrayList arrayList2 = new ArrayList(10);
                        int i10 = 0;
                        do {
                            arrayList2.add(obj4.subSequence(i10, matcher2.start()).toString());
                            i10 = matcher2.end();
                        } while (matcher2.find());
                        arrayList2.add(obj4.subSequence(i10, obj4.length()).toString());
                        list = arrayList2;
                    }
                    if (list.size() >= 16 && (m974P = AbstractC0451r.m974P((String) list.get(0))) != null) {
                        long longValue = m974P.longValue();
                        Long m974P2 = AbstractC0451r.m974P((String) list.get(8));
                        if (m974P2 != null) {
                            return new C1093ml(longValue, m974P2.longValue(), obj3);
                        }
                    }
                }
                return null;
            case 22:
                C1485za c1485za = (C1485za) obj;
                AbstractC3367j.m5100e(c1485za, "it");
                return AbstractC2487d.m4044h(c1485za.m2437a(), "@", c1485za.f9840b);
            case 23:
                return AbstractC2647h.m4256b("内网地址 ", ((Integer) obj).intValue() + 1);
            case 24:
                return AbstractC2647h.m4256b("外网地址 ", ((Integer) obj).intValue() + 1);
            case 25:
                ((Float) obj).getClass();
                return C1694m.f10482a;
            case 26:
                C1471yr c1471yr = (C1471yr) obj;
                AbstractC3367j.m5100e(c1471yr, "it");
                return c1471yr.f9766b;
            case 27:
                C1471yr c1471yr2 = (C1471yr) obj;
                AbstractC3367j.m5100e(c1471yr2, "it");
                return Integer.valueOf(c1471yr2.f9767c);
            case 28:
                C1471yr c1471yr3 = (C1471yr) obj;
                AbstractC3367j.m5100e(c1471yr3, "it");
                return c1471yr3.f9765a;
            default:
                C1486zb c1486zb = (C1486zb) obj;
                AbstractC3367j.m5100e(c1486zb, "it");
                return c1486zb.f9845b + "(" + c1486zb.f9848e.f4316e + ")";
        }
    }

    public /* synthetic */ C0866fc(C1247rk c1247rk) {
        this.f3985e = 21;
    }
}
