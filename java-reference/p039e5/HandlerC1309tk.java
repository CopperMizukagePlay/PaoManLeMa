package p039e5;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0075s1;
import p015b6.AbstractC0307n;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1814v;
import p068i5.C2079c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tk */
/* loaded from: classes.dex */
public final class HandlerC1309tk extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f7826a;

    /* renamed from: b */
    public final /* synthetic */ Object f7827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC1309tk(Object obj, Looper looper, int i7) {
        super(looper);
        this.f7826a = i7;
        this.f7827b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043f A[Catch: all -> 0x04f8, TryCatch #5 {all -> 0x04f8, blocks: (B:163:0x042f, B:165:0x043f, B:170:0x044f), top: B:162:0x042f }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x050c  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        boolean z7;
        Object obj2;
        String string;
        Object obj3;
        C1340uk c1340uk;
        Object obj4;
        int length;
        int i7;
        JSONArray jSONArray;
        int i8;
        Double valueOf;
        JSONArray jSONArray2;
        Network network;
        Object m2985m;
        String str5;
        String str6;
        C1248rl c1248rl;
        List list;
        List list2;
        List list3;
        List list4;
        Object m2985m2;
        Object m2985m3;
        List list5;
        List list6;
        Long l7;
        Object parcelable;
        int i9 = this.f7826a;
        String str7 = "";
        Object obj5 = this.f7827b;
        int i10 = 1;
        switch (i9) {
            case 0:
                C1340uk c1340uk2 = (C1340uk) obj5;
                AbstractC3367j.m5100e(message, "msg");
                if (message.what == 10) {
                    if (message.getData().getInt("run_token", -1) == c1340uk2.f7972q) {
                        String string2 = message.getData().getString("target_id");
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (!AbstractC0444k.m937a0(string2)) {
                            LinkedHashMap linkedHashMap = c1340uk2.f7963h;
                            Bundle data = message.getData();
                            AbstractC3367j.m5099d(data, "getData(...)");
                            boolean z8 = data.getBoolean("running_download", false);
                            boolean z9 = data.getBoolean("running_upload", false);
                            double d7 = data.getDouble("download_mbps", 0.0d);
                            double d8 = data.getDouble("upload_mbps", 0.0d);
                            double d9 = data.getDouble("download_avg_mbps", 0.0d);
                            double d10 = data.getDouble("upload_avg_mbps", 0.0d);
                            String str8 = "id";
                            long j6 = data.getLong("download_total_bytes", 0L);
                            long j7 = data.getLong("upload_total_bytes", 0L);
                            double d11 = data.getDouble("final_download_mbps", 0.0d);
                            double d12 = data.getDouble("final_upload_mbps", 0.0d);
                            boolean z10 = data.getBoolean("show_download", true);
                            boolean z11 = data.getBoolean("show_upload", true);
                            String string3 = data.getString("message");
                            if (string3 == null) {
                                str = "";
                            } else {
                                str = string3;
                            }
                            String string4 = data.getString("stop_reason");
                            if (string4 == null) {
                                str2 = "";
                            } else {
                                str2 = string4;
                            }
                            long j8 = data.getLong("elapsed_millis", 0L);
                            long j9 = data.getLong("sample_interval_ms", 250L);
                            double d13 = data.getDouble("cpu_process_percent", 0.0d);
                            double d14 = data.getDouble("cpu_total_percent", 0.0d);
                            String string5 = data.getString("rate_push_status");
                            if (string5 == null) {
                                str3 = "";
                            } else {
                                str3 = string5;
                            }
                            String string6 = data.getString("interface_rates");
                            if (string6 == null) {
                                string6 = "";
                            }
                            try {
                                JSONArray jSONArray3 = new JSONArray(string6);
                                C2079c m5802f = AbstractC3784a.m5802f();
                                int length2 = jSONArray3.length();
                                int i11 = 0;
                                while (i11 < length2) {
                                    JSONObject optJSONObject = jSONArray3.optJSONObject(i11);
                                    if (optJSONObject == null) {
                                        str4 = str8;
                                        jSONArray2 = jSONArray3;
                                    } else {
                                        str4 = str8;
                                        try {
                                            String optString = optJSONObject.optString(str4);
                                            AbstractC3367j.m5099d(optString, "optString(...)");
                                            String optString2 = optJSONObject.optString("name");
                                            AbstractC3367j.m5099d(optString2, "optString(...)");
                                            String optString3 = optJSONObject.optString("interfaceName");
                                            AbstractC3367j.m5099d(optString3, "optString(...)");
                                            jSONArray2 = jSONArray3;
                                            m5802f.add(new C0707ac(optString, optString2, optString3, optJSONObject.optDouble("downloadMbps", 0.0d), optJSONObject.optDouble("uploadMbps", 0.0d), optJSONObject.optLong("downloadBytes", 0L), optJSONObject.optLong("uploadBytes", 0L)));
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = AbstractC1793a0.m2985m(th);
                                            z7 = obj instanceof C1689h;
                                            obj2 = C1813u.f10860e;
                                            if (z7) {
                                            }
                                            List list7 = (List) obj;
                                            string = data.getString("worker_stats");
                                            if (string != null) {
                                            }
                                            JSONArray jSONArray4 = new JSONArray(str7);
                                            C2079c m5802f2 = AbstractC3784a.m5802f();
                                            length = jSONArray4.length();
                                            i7 = 0;
                                            while (i7 < length) {
                                            }
                                            obj3 = obj2;
                                            c1340uk = c1340uk2;
                                            obj4 = AbstractC3784a.m5798b(m5802f2);
                                            if (obj4 instanceof C1689h) {
                                            }
                                            linkedHashMap.put(string2, new C0976ir(z8, z9, d7, d8, d9, d10, j6, j7, null, null, d11, d12, list7, j8, null, z10, z11, str, str2, (List) obj4, j9, d14, d13, str3, 1106789120));
                                            C1340uk.m2363a(c1340uk);
                                            return;
                                        }
                                    }
                                    i11++;
                                    jSONArray3 = jSONArray2;
                                    str8 = str4;
                                }
                                str4 = str8;
                                obj = AbstractC3784a.m5798b(m5802f);
                            } catch (Throwable th2) {
                                th = th2;
                                str4 = str8;
                            }
                            z7 = obj instanceof C1689h;
                            obj2 = C1813u.f10860e;
                            if (z7) {
                                obj = obj2;
                            }
                            List list72 = (List) obj;
                            string = data.getString("worker_stats");
                            if (string != null) {
                                str7 = string;
                            }
                            try {
                                JSONArray jSONArray42 = new JSONArray(str7);
                                C2079c m5802f22 = AbstractC3784a.m5802f();
                                length = jSONArray42.length();
                                i7 = 0;
                                while (i7 < length) {
                                    JSONObject optJSONObject2 = jSONArray42.optJSONObject(i7);
                                    if (optJSONObject2 == null) {
                                        jSONArray = jSONArray42;
                                        obj3 = obj2;
                                        i8 = length;
                                        c1340uk = c1340uk2;
                                    } else {
                                        String optString4 = optJSONObject2.optString(str4);
                                        AbstractC3367j.m5099d(optString4, "optString(...)");
                                        String optString5 = optJSONObject2.optString("direction");
                                        AbstractC3367j.m5099d(optString5, "optString(...)");
                                        String optString6 = optJSONObject2.optString("workerLabel");
                                        AbstractC3367j.m5099d(optString6, "optString(...)");
                                        jSONArray = jSONArray42;
                                        String optString7 = optJSONObject2.optString("interfaceName");
                                        AbstractC3367j.m5099d(optString7, "optString(...)");
                                        String optString8 = optJSONObject2.optString("urlShort");
                                        AbstractC3367j.m5099d(optString8, "optString(...)");
                                        String optString9 = optJSONObject2.optString("connectedIp");
                                        AbstractC3367j.m5099d(optString9, "optString(...)");
                                        obj3 = obj2;
                                        try {
                                            int optInt = optJSONObject2.optInt("localPort", 0);
                                            i8 = length;
                                            c1340uk = c1340uk2;
                                            try {
                                                long optLong = optJSONObject2.optLong("sessionBytes", 0L);
                                                long optLong2 = optJSONObject2.optLong("totalBytes", 0L);
                                                double optDouble = optJSONObject2.optDouble("speedMbps", 0.0d);
                                                if (optJSONObject2.isNull("progressPercent")) {
                                                    valueOf = null;
                                                } else {
                                                    valueOf = Double.valueOf(optJSONObject2.optDouble("progressPercent", 0.0d));
                                                }
                                                long optLong3 = optJSONObject2.optLong("contentLength", -1L);
                                                String optString10 = optJSONObject2.optString("status");
                                                AbstractC3367j.m5099d(optString10, "optString(...)");
                                                m5802f22.add(new C0948hu(optString4, optString5, optString6, optString7, optString8, optString9, optInt, optLong, optLong2, optDouble, valueOf, optLong3, optString10, optJSONObject2.optInt("attempt", 0)));
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj4 = AbstractC1793a0.m2985m(th);
                                                if (obj4 instanceof C1689h) {
                                                }
                                                linkedHashMap.put(string2, new C0976ir(z8, z9, d7, d8, d9, d10, j6, j7, null, null, d11, d12, list72, j8, null, z10, z11, str, str2, (List) obj4, j9, d14, d13, str3, 1106789120));
                                                C1340uk.m2363a(c1340uk);
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c1340uk = c1340uk2;
                                            obj4 = AbstractC1793a0.m2985m(th);
                                            if (obj4 instanceof C1689h) {
                                            }
                                            linkedHashMap.put(string2, new C0976ir(z8, z9, d7, d8, d9, d10, j6, j7, null, null, d11, d12, list72, j8, null, z10, z11, str, str2, (List) obj4, j9, d14, d13, str3, 1106789120));
                                            C1340uk.m2363a(c1340uk);
                                            return;
                                        }
                                    }
                                    i7++;
                                    jSONArray42 = jSONArray;
                                    c1340uk2 = c1340uk;
                                    obj2 = obj3;
                                    length = i8;
                                }
                                obj3 = obj2;
                                c1340uk = c1340uk2;
                                obj4 = AbstractC3784a.m5798b(m5802f22);
                            } catch (Throwable th5) {
                                th = th5;
                                obj3 = obj2;
                            }
                            if (obj4 instanceof C1689h) {
                                obj4 = obj3;
                            }
                            linkedHashMap.put(string2, new C0976ir(z8, z9, d7, d8, d9, d10, j6, j7, null, null, d11, d12, list72, j8, null, z10, z11, str, str2, (List) obj4, j9, d14, d13, str3, 1106789120));
                            C1340uk.m2363a(c1340uk);
                            return;
                        }
                        return;
                    }
                    return;
                }
                super.handleMessage(message);
                return;
            default:
                AbstractServiceC1371vk abstractServiceC1371vk = (AbstractServiceC1371vk) obj5;
                C1100ms c1100ms = abstractServiceC1371vk.f8192e;
                AbstractC3367j.m5100e(message, "msg");
                int i12 = message.what;
                int i13 = 2;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                super.handleMessage(message);
                                return;
                            } else {
                                c1100ms.getClass();
                                c1100ms.m1965V0(SystemClock.elapsedRealtime(), c1100ms.f6071e0, "手动停止上传");
                                return;
                            }
                        }
                        c1100ms.getClass();
                        c1100ms.m1963T0(SystemClock.elapsedRealtime(), c1100ms.f6068d0, "手动停止下载");
                        return;
                    }
                    abstractServiceC1371vk.m2370a();
                    return;
                }
                abstractServiceC1371vk.f8194g = message.replyTo;
                Bundle data2 = message.getData();
                if (data2 == null) {
                    data2 = new Bundle();
                }
                Bundle bundle = data2;
                C0565q1 c0565q1 = abstractServiceC1371vk.f8195h;
                if (c0565q1 != null) {
                    c0565q1.mo1114c(null);
                }
                c1100ms.m1962S0();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundle.getParcelable("target_network", Network.class);
                    network = (Network) parcelable;
                } else {
                    network = (Network) bundle.getParcelable("target_network");
                }
                Network network2 = network;
                try {
                    String string7 = bundle.getString("target_transport");
                    if (string7 == null) {
                        string7 = "";
                    }
                    m2985m = EnumC1070lt.valueOf(string7);
                } catch (Throwable th6) {
                    m2985m = AbstractC1793a0.m2985m(th6);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = EnumC1070lt.f5748i;
                }
                EnumC1070lt enumC1070lt = (EnumC1070lt) m2985m;
                String string8 = bundle.getString("target_id");
                if (string8 == null) {
                    str5 = "";
                } else {
                    str5 = string8;
                }
                String string9 = bundle.getString("target_name");
                if (string9 == null) {
                    str6 = "";
                } else {
                    str6 = string9;
                }
                if (!AbstractC0444k.m937a0(str5) && !AbstractC0444k.m937a0(str6)) {
                    c1248rl = new C1248rl(str5, str6, network2, enumC1070lt, bundle.getString("target_interface"), bundle.getString("target_link_speed"));
                } else {
                    c1248rl = null;
                }
                if (c1248rl != null) {
                    abstractServiceC1371vk.f8196i = c1248rl.f7390a;
                    abstractServiceC1371vk.f8197j = bundle.getInt("run_token", 0);
                    try {
                        Process.setThreadPriority(-4);
                    } catch (Throwable th7) {
                        AbstractC1793a0.m2985m(th7);
                    }
                    C1247rk c1247rk = C1247rk.f7381h;
                    Context applicationContext = abstractServiceC1371vk.getApplicationContext();
                    AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                    c1247rk.m2197k(applicationContext);
                    AbstractC1249rm.m2261g0("MP_WORKER start pid=" + Process.myPid() + " target=" + AbstractC1249rm.m2251b0(c1248rl));
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("download_urls");
                    if (stringArrayList != null) {
                        list = AbstractC1805m.m3035C0(stringArrayList);
                    } else {
                        list = null;
                    }
                    C1813u c1813u = C1813u.f10860e;
                    if (list == null) {
                        list2 = c1813u;
                    } else {
                        list2 = list;
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("upload_urls");
                    if (stringArrayList2 != null) {
                        list3 = AbstractC1805m.m3035C0(stringArrayList2);
                    } else {
                        list3 = null;
                    }
                    if (list3 == null) {
                        list4 = c1813u;
                    } else {
                        list4 = list3;
                    }
                    String string10 = bundle.getString("download_endpoints");
                    if (string10 == null) {
                        string10 = "";
                    }
                    List m2221H = AbstractC1249rm.m2221H(string10);
                    String string11 = bundle.getString("upload_endpoints");
                    if (string11 == null) {
                        string11 = "";
                    }
                    List m2221H2 = AbstractC1249rm.m2221H(string11);
                    C0706ab c0706ab = new C0706ab(bundle.getInt("download_min_workers", 12), bundle.getInt("download_max_workers", 20), bundle.getInt("upload_min_workers", 4), bundle.getInt("upload_max_workers", 10), bundle.getInt("download_buffer_kb", 10), bundle.getInt("upload_buffer_kb", 10), bundle.getInt("worker_budget", 32), bundle.getInt("max_worker_threads", 256), false, 0, 512);
                    try {
                        String string12 = bundle.getString("network_mode");
                        if (string12 == null) {
                            string12 = "";
                        }
                        m2985m2 = EnumC1127no.valueOf(string12);
                    } catch (Throwable th8) {
                        m2985m2 = AbstractC1793a0.m2985m(th8);
                    }
                    if (m2985m2 instanceof C1689h) {
                        m2985m2 = EnumC1127no.f6360g;
                    }
                    EnumC1127no enumC1127no = (EnumC1127no) m2985m2;
                    String string13 = bundle.getString("dns_selections");
                    if (string13 != null) {
                        str7 = string13;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str7);
                        Iterator<String> keys = jSONObject.keys();
                        AbstractC3367j.m5099d(keys, "keys(...)");
                        m2985m3 = AbstractC1817y.m3085Q(AbstractC0307n.m667F(AbstractC0307n.m664C(keys), new C1427xe(jSONObject, i10)));
                    } catch (Throwable th9) {
                        m2985m3 = AbstractC1793a0.m2985m(th9);
                    }
                    if (m2985m3 instanceof C1689h) {
                        m2985m3 = C1814v.f10861e;
                    }
                    Map map = (Map) m2985m3;
                    ArrayList<String> stringArrayList3 = bundle.getStringArrayList("custom_dns_servers");
                    if (stringArrayList3 != null) {
                        list5 = AbstractC1805m.m3035C0(stringArrayList3);
                    } else {
                        list5 = null;
                    }
                    if (list5 == null) {
                        list6 = c1813u;
                    } else {
                        list6 = list5;
                    }
                    C1405wn c1405wn = new C1405wn(bundle.getInt("custom_dns_timeout_ms", 2000), bundle.getInt("custom_dns_retry_count", 3), list6, c1813u, false);
                    C1100ms c1100ms2 = abstractServiceC1371vk.f8192e;
                    boolean z12 = bundle.getBoolean("run_download", false);
                    boolean z13 = bundle.getBoolean("run_upload", false);
                    boolean z14 = bundle.getBoolean("use_root_stats", false);
                    long j10 = bundle.getLong("duration_ms");
                    Long valueOf2 = Long.valueOf(j10);
                    if (j10 > 0) {
                        l7 = valueOf2;
                    } else {
                        l7 = null;
                    }
                    List m5817z = AbstractC3784a.m5817z(c1248rl);
                    C1096mo c1096mo = new C1096mo(bundle.getDouble("download_limit_mbps", 0.0d), bundle.getDouble("upload_limit_mbps", 0.0d), bundle.getDouble("total_limit_mbps", 0.0d));
                    C0789cu c0789cu = AbstractC0947ht.f4658a;
                    C1100ms.m1896Q0(c1100ms2, list2, list4, m2221H, m2221H2, z12, z13, z14, l7, m5817z, c1096mo, true, false, false, bundle.getLong("sample_interval_ms", 250L), c1248rl.f7393d, new C0750bn(), bundle.getBoolean("emergency_compensation", true), c0706ab, enumC1127no, c1405wn, map, bundle.getInt("chart_sample_capacity", 120), 58720256);
                    abstractServiceC1371vk.f8195h = AbstractC0525d0.m1141s(abstractServiceC1371vk.f8193f, null, new C0075s1(abstractServiceC1371vk, null, i13), 3);
                    return;
                }
                return;
        }
    }
}
