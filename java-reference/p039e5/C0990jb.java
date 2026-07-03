package p039e5;

import org.json.JSONArray;
import org.json.JSONObject;
import p015b6.AbstractC0307n;
import p015b6.C0300g;
import p015b6.C0301h;
import p015b6.C0310q;
import p024c6.AbstractC0444k;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p054g6.EnumC1721v;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.EnumC2408s1;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2625z;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jb */
/* loaded from: classes.dex */
public final class C0990jb extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5043i;

    /* renamed from: j */
    public /* synthetic */ Object f5044j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0990jb(int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(i7, interfaceC2313c);
        this.f5043i = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f5043i) {
            case 0:
                return ((C0990jb) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0990jb) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0990jb) mo28k((EnumC1721v) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0990jb) mo28k((EnumC2408s1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5043i) {
            case 0:
                C0990jb c0990jb = new C0990jb(2, interfaceC2313c, 0);
                c0990jb.f5044j = obj;
                return c0990jb;
            case 1:
                C0990jb c0990jb2 = new C0990jb(2, interfaceC2313c, 1);
                c0990jb2.f5044j = obj;
                return c0990jb2;
            case 2:
                C0990jb c0990jb3 = new C0990jb(2, interfaceC2313c, 2);
                c0990jb3.f5044j = obj;
                return c0990jb3;
            default:
                C0990jb c0990jb4 = new C0990jb(2, interfaceC2313c, 3);
                c0990jb4.f5044j = obj;
                return c0990jb4;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object m2985m;
        C2598d0 m4681e;
        String str;
        Object obj2;
        String str2;
        String str3;
        Object m2985m2;
        boolean z7 = true;
        switch (this.f5043i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                try {
                    C2625z c2625z = new C2625z();
                    c2625z.m4194f("https://api.github.com/repos/yuliwen2003-max/PaoManLeMa_Release/releases?per_page=20");
                    c2625z.m4191c("Accept", "application/vnd.github+json");
                    c2625z.m4191c("User-Agent", "SpeedTest-V5.0.1");
                    m4681e = C1238rb.f7308b.m4187b(c2625z.m4189a()).m4681e();
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                try {
                    if (!m4681e.m4142c()) {
                        m2985m = new C1289t0("GitHub 返回 " + m4681e.f14059h);
                        m4681e.close();
                    } else {
                        AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
                        String str4 = null;
                        if (abstractC2602f0 != null) {
                            str = abstractC2602f0.m4148h();
                        } else {
                            str = null;
                        }
                        String str5 = "";
                        if (str == null) {
                            str = "";
                        }
                        C1238rb c1238rb = C1238rb.f7307a;
                        JSONArray jSONArray = new JSONArray(str);
                        C0300g c0300g = new C0300g(new C0301h(AbstractC0307n.m667F(AbstractC1805m.m3039c0(AbstractC2168e.m3513G(0, jSONArray.length())), new C0310q(6, jSONArray)), false, new C1263s5(27)));
                        while (true) {
                            if (c0300g.hasNext()) {
                                obj2 = c0300g.next();
                                if (C1238rb.m2162b((JSONObject) obj2) != null) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        JSONObject jSONObject = (JSONObject) obj2;
                        if (jSONObject == null) {
                            m2985m = new C1289t0("暂无可用 Release APK");
                            m4681e.close();
                        } else {
                            String optString = jSONObject.optString("tag_name");
                            String optString2 = jSONObject.optString("name", optString);
                            C1238rb c1238rb2 = C1238rb.f7307a;
                            AbstractC3367j.m5097b(optString);
                            if (!C1238rb.m2170k(optString)) {
                                m2985m = new Object();
                                m4681e.close();
                            } else {
                                JSONObject m2162b = C1238rb.m2162b(jSONObject);
                                if (m2162b != null) {
                                    str2 = m2162b.optString("browser_download_url");
                                } else {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = str2;
                                }
                                if (AbstractC0444k.m937a0(str3)) {
                                    m2985m = new C1289t0("最新 Release 没有 APK 附件");
                                    m4681e.close();
                                } else {
                                    String m2172m = C1238rb.m2172m(optString);
                                    if (AbstractC0444k.m937a0(optString2)) {
                                        optString2 = C1238rb.m2172m(optString);
                                    }
                                    String str6 = optString2;
                                    String optString3 = jSONObject.optString("html_url");
                                    AbstractC3367j.m5099d(optString3, "optString(...)");
                                    if (m2162b != null) {
                                        str4 = m2162b.optString("name");
                                    }
                                    if (str4 != null) {
                                        str5 = str4;
                                    }
                                    if (AbstractC0444k.m937a0(str5)) {
                                        str5 = "SpeedTest-" + C1238rb.m2172m(optString) + ".apk";
                                    }
                                    String optString4 = jSONObject.optString("body");
                                    AbstractC3367j.m5099d(optString4, "optString(...)");
                                    m2985m = new C1258s0(new C1227r0(m2172m, str6, optString3, str3, str5, optString4));
                                    m4681e.close();
                                    Throwable m2747a = C1690i.m2747a(m2985m);
                                    if (m2747a != null) {
                                        String message = m2747a.getMessage();
                                        if (message == null) {
                                            message = "检查更新失败";
                                        }
                                        m2985m = new C1289t0(message);
                                    }
                                }
                            }
                        }
                    }
                    return m2985m;
                } finally {
                }
            case 1:
                AbstractC1793a0.m2972L(obj);
                try {
                    if (Runtime.getRuntime().exec(new String[]{"ping", "-c", "1", "-W", "1", "127.0.0.1"}).waitFor() != 0) {
                        z7 = false;
                    }
                    m2985m2 = Boolean.valueOf(z7);
                } catch (Throwable th2) {
                    m2985m2 = AbstractC1793a0.m2985m(th2);
                }
                Boolean bool = Boolean.FALSE;
                if (m2985m2 instanceof C1689h) {
                    return bool;
                }
                return m2985m2;
            case 2:
                AbstractC1793a0.m2972L(obj);
                if (((EnumC1721v) this.f5044j) == EnumC1721v.f10560e) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                AbstractC1793a0.m2972L(obj);
                if (((EnumC2408s1) this.f5044j) != EnumC2408s1.f13550e) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
        }
    }
}
