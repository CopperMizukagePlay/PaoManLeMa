package p039e5;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p024c6.AbstractC0444k;
import p032d6.C0548l;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p099m6.AbstractC2595c;
import p099m6.C2598d0;
import p099m6.InterfaceC2608i0;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vl */
/* loaded from: classes.dex */
public final class C1372vl extends AbstractC2595c {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f8199a;

    /* renamed from: b */
    public final /* synthetic */ C3379v f8200b;

    /* renamed from: c */
    public final /* synthetic */ C1403wl f8201c;

    /* renamed from: d */
    public final /* synthetic */ C1496zl f8202d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f8203e;

    /* renamed from: f */
    public final /* synthetic */ C1009k f8204f;

    /* renamed from: g */
    public final /* synthetic */ C3379v f8205g;

    /* renamed from: h */
    public final /* synthetic */ C0548l f8206h;

    public C1372vl(JSONObject jSONObject, C3379v c3379v, C1403wl c1403wl, C1496zl c1496zl, ArrayList arrayList, C1009k c1009k, C3379v c3379v2, C0548l c0548l) {
        this.f8199a = jSONObject;
        this.f8200b = c3379v;
        this.f8201c = c1403wl;
        this.f8202d = c1496zl;
        this.f8203e = arrayList;
        this.f8204f = c1009k;
        this.f8205g = c3379v2;
        this.f8206h = c0548l;
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: l */
    public final void mo2349l(C3887f c3887f, Exception exc) {
        C0548l c0548l = this.f8206h;
        if (c0548l.m1226y()) {
            c0548l.mo663n(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0031. Please report as an issue. */
    @Override // p099m6.AbstractC2595c
    /* renamed from: m */
    public final void mo2350m(InterfaceC2608i0 interfaceC2608i0, String str) {
        Object m2985m;
        AbstractC3367j.m5100e(interfaceC2608i0, "webSocket");
        C1403wl c1403wl = this.f8201c;
        C1009k c1009k = this.f8204f;
        C3379v c3379v = this.f8205g;
        C0548l c0548l = this.f8206h;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                C3379v c3379v2 = this.f8200b;
                C1496zl c1496zl = this.f8202d;
                ArrayList arrayList = this.f8203e;
                switch (hashCode) {
                    case -599445191:
                        if (!optString.equals("complete")) {
                            break;
                        } else {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (optJSONObject != null) {
                                jSONObject = optJSONObject;
                            }
                            c3379v.f16451e = jSONObject.optString("trace_map_url", (String) c3379v.f16451e);
                            if (AbstractC0444k.m937a0((CharSequence) c3379v2.f16451e)) {
                                c3379v2.f16451e = jSONObject.optString("resolved_ip", (String) c3379v2.f16451e);
                            }
                            List m2384j = C1403wl.m2384j(jSONObject.optJSONArray("hops"));
                            if (m2384j.isEmpty()) {
                                m2384j = AbstractC1805m.m3035C0(arrayList);
                            }
                            if (c0548l.m1226y()) {
                                String str2 = c1496zl.f9915a;
                                String str3 = (String) c3379v2.f16451e;
                                EnumC1163ot enumC1163ot = c1496zl.f9916b;
                                int i7 = c1496zl.f9917c;
                                int size = m2384j.size();
                                String str4 = (String) c3379v.f16451e;
                                EnumC1465yl enumC1465yl = c1403wl.f8490a;
                                String str5 = c1403wl.f8492c;
                                if (AbstractC0444k.m937a0(str5)) {
                                    str5 = c1403wl.f8491b;
                                }
                                c0548l.mo663n(new C1504zt(str2, str3, enumC1163ot, i7, size, m2384j, str4, "NTrace-core 追踪完成", enumC1465yl, str5, 1));
                            }
                            ((C3887f) interfaceC2608i0).m5901b("done", 1000);
                            break;
                        }
                    case 103497:
                        if (!optString.equals("hop")) {
                            break;
                        } else {
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                            if (optJSONObject2 != null) {
                                C1132nt m2383i = C1403wl.m2383i(optJSONObject2, (String) c3379v2.f16451e, c1496zl.f9915a);
                                int size2 = arrayList.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < size2) {
                                        Object obj = arrayList.get(i9);
                                        i9++;
                                        if (((C1132nt) obj).f6404a != m2383i.f6404a) {
                                            i8++;
                                        }
                                    } else {
                                        i8 = -1;
                                    }
                                }
                                if (i8 >= 0) {
                                    arrayList.set(i8, m2383i);
                                } else {
                                    arrayList.add(m2383i);
                                }
                                c1009k.mo23f(m2383i);
                                break;
                            } else {
                                return;
                            }
                        }
                    case 96784904:
                        if (!optString.equals("error")) {
                            break;
                        } else {
                            if (c0548l.m1226y()) {
                                c0548l.mo663n(null);
                            }
                            ((C3887f) interfaceC2608i0).m5901b("error", 1000);
                            break;
                        }
                    case 109757538:
                        if (!optString.equals("start")) {
                            break;
                        } else {
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                            if (optJSONObject3 != null) {
                                c3379v2.f16451e = optJSONObject3.optString("resolved_ip", (String) c3379v2.f16451e);
                                break;
                            } else {
                                return;
                            }
                        }
                }
            }
            m2985m = C1694m.f10482a;
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (C1690i.m2747a(m2985m) != null && c0548l.m1226y()) {
            c0548l.mo663n(null);
        }
    }

    @Override // p099m6.AbstractC2595c
    /* renamed from: n */
    public final void mo2371n(InterfaceC2608i0 interfaceC2608i0, C2598d0 c2598d0) {
        String jSONObject = this.f8199a.toString();
        AbstractC3367j.m5099d(jSONObject, "toString(...)");
        ((C3887f) interfaceC2608i0).m5906g(jSONObject);
    }
}
