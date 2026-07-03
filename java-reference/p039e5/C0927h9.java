package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import p053g5.C1689h;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.h9 */
/* loaded from: classes.dex */
public final class C0927h9 {

    /* renamed from: a */
    public static final C0927h9 f4481a = new Object();

    /* renamed from: b */
    public static final C1701c0 f4482b;

    /* renamed from: c */
    public static final C1715p f4483c;

    /* renamed from: d */
    public static boolean f4484d;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.h9, java.lang.Object] */
    static {
        C1701c0 m2771b = AbstractC1719t.m2771b(new C0959i9("", false, EnumC0704a9.f2345f, 4, 32, EnumC1452y8.f9301f, 64, 2, EnumC1390w8.f8311g, false, false, 3));
        f4482b = m2771b;
        f4483c = new C1715p(m2771b);
    }

    /* renamed from: c */
    public static void m1553c(Context context, EnumC0704a9 enumC0704a9, int i7, int i8, EnumC1452y8 enumC1452y8, int i9, int i10, EnumC1390w8 enumC1390w8, int i11) {
        EnumC0704a9 enumC0704a92;
        int i12;
        int i13;
        EnumC1452y8 enumC1452y82;
        int i14;
        int i15;
        EnumC1390w8 enumC1390w82;
        int i16 = i11 & 2;
        C1701c0 c1701c0 = f4482b;
        if (i16 != 0) {
            enumC0704a92 = ((C0959i9) c1701c0.getValue()).f4781c;
        } else {
            enumC0704a92 = enumC0704a9;
        }
        if ((i11 & 4) != 0) {
            i12 = ((C0959i9) c1701c0.getValue()).f4782d;
        } else {
            i12 = i7;
        }
        if ((i11 & 8) != 0) {
            i13 = ((C0959i9) c1701c0.getValue()).f4783e;
        } else {
            i13 = i8;
        }
        if ((i11 & 16) != 0) {
            enumC1452y82 = ((C0959i9) c1701c0.getValue()).f4784f;
        } else {
            enumC1452y82 = enumC1452y8;
        }
        if ((i11 & 32) != 0) {
            i14 = ((C0959i9) c1701c0.getValue()).f4785g;
        } else {
            i14 = i9;
        }
        if ((i11 & 64) != 0) {
            i15 = ((C0959i9) c1701c0.getValue()).f4786h;
        } else {
            i15 = i10;
        }
        if ((i11 & 128) != 0) {
            enumC1390w82 = ((C0959i9) c1701c0.getValue()).f4787i;
        } else {
            enumC1390w82 = enumC1390w8;
        }
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(enumC0704a92, "networkStack");
        AbstractC3367j.m5100e(enumC1452y82, "httpProtocol");
        AbstractC3367j.m5100e(enumC1390w82, "dnsMode");
        f4481a.m1554a(context);
        C0959i9 m1601a = C0959i9.m1601a((C0959i9) c1701c0.getValue(), null, false, enumC0704a92, AbstractC2168e.m3530q(i12, 1, 32), AbstractC2168e.m3530q(i13, 1, 512), enumC1452y82, AbstractC2168e.m3530q(i14, 8, 1024), AbstractC2168e.m3530q(i15, 0, 128), enumC1390w82, false, false, 0, 3587);
        context.getSharedPreferences("downloader_settings", 0).edit().putString("template_network_stack", m1601a.f4781c.name()).putInt("template_workers_per_server", m1601a.f4782d).putInt("template_max_workers", m1601a.f4783e).putString("template_http_protocol", m1601a.f4784f.name()).putInt("template_buffer_size_kb", m1601a.f4785g).putInt("template_max_tail_hedges", m1601a.f4786h).putString("template_dns_mode", m1601a.f4787i.name()).apply();
        c1701c0.m2752j(null, m1601a);
    }

    /* renamed from: a */
    public final void m1554a(Context context) {
        Object m2985m;
        Object m2985m2;
        Object m2985m3;
        AbstractC3367j.m5100e(context, "context");
        if (f4484d) {
            return;
        }
        synchronized (this) {
            try {
                if (f4484d) {
                    return;
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("downloader_settings", 0);
                C1701c0 c1701c0 = f4482b;
                String string = sharedPreferences.getString("directory_uri", "");
                if (string == null) {
                    string = "";
                }
                String str = string;
                boolean z7 = sharedPreferences.getBoolean("pure_mode", false);
                try {
                    String string2 = sharedPreferences.getString("template_network_stack", "DUAL_STACK");
                    if (string2 == null) {
                        string2 = "";
                    }
                    m2985m = EnumC0704a9.valueOf(string2);
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                Object obj = EnumC0704a9.f2345f;
                if (m2985m instanceof C1689h) {
                    m2985m = obj;
                }
                EnumC0704a9 enumC0704a9 = (EnumC0704a9) m2985m;
                int m3530q = AbstractC2168e.m3530q(sharedPreferences.getInt("template_workers_per_server", 4), 1, 32);
                int m3530q2 = AbstractC2168e.m3530q(sharedPreferences.getInt("template_max_workers", 32), 1, 512);
                try {
                    String string3 = sharedPreferences.getString("template_http_protocol", "HTTP_1_1");
                    if (string3 == null) {
                        string3 = "";
                    }
                    m2985m2 = EnumC1452y8.valueOf(string3);
                } catch (Throwable th2) {
                    m2985m2 = AbstractC1793a0.m2985m(th2);
                }
                Object obj2 = EnumC1452y8.f9301f;
                if (m2985m2 instanceof C1689h) {
                    m2985m2 = obj2;
                }
                EnumC1452y8 enumC1452y8 = (EnumC1452y8) m2985m2;
                int m3530q3 = AbstractC2168e.m3530q(sharedPreferences.getInt("template_buffer_size_kb", 64), 8, 1024);
                int m3530q4 = AbstractC2168e.m3530q(sharedPreferences.getInt("template_max_tail_hedges", 2), 0, 128);
                try {
                    String string4 = sharedPreferences.getString("template_dns_mode", "MULTI_SELECT");
                    if (string4 == null) {
                        string4 = "";
                    }
                    m2985m3 = EnumC1390w8.valueOf(string4);
                } catch (Throwable th3) {
                    m2985m3 = AbstractC1793a0.m2985m(th3);
                }
                Object obj3 = EnumC1390w8.f8311g;
                if (m2985m3 instanceof C1689h) {
                    m2985m3 = obj3;
                }
                C0959i9 c0959i9 = new C0959i9(str, z7, enumC0704a9, m3530q, m3530q2, enumC1452y8, m3530q3, m3530q4, (EnumC1390w8) m2985m3, sharedPreferences.getBoolean("launch_directly", false), sharedPreferences.getBoolean("auto_start_downloads", false), AbstractC2168e.m3530q(sharedPreferences.getInt("max_concurrent_downloads", 3), 0, 20));
                c1701c0.getClass();
                c1701c0.m2752j(null, c0959i9);
                f4484d = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* renamed from: b */
    public final void m1555b(Context context, Uri uri) {
        AbstractC3367j.m5100e(uri, "uri");
        m1554a(context);
        try {
            context.getContentResolver().takePersistableUriPermission(uri, 3);
        } catch (Throwable th) {
            AbstractC1793a0.m2985m(th);
        }
        context.getSharedPreferences("downloader_settings", 0).edit().putString("directory_uri", uri.toString()).apply();
        C1701c0 c1701c0 = f4482b;
        C0959i9 c0959i9 = (C0959i9) c1701c0.getValue();
        String uri2 = uri.toString();
        AbstractC3367j.m5099d(uri2, "toString(...)");
        C0959i9 m1601a = C0959i9.m1601a(c0959i9, uri2, false, null, 0, 0, null, 0, 0, null, false, false, 0, 4094);
        c1701c0.getClass();
        c1701c0.m2752j(null, m1601a);
    }

    /* renamed from: d */
    public final void m1556d(Context context, InterfaceC3279c interfaceC3279c) {
        m1554a(context);
        C1701c0 c1701c0 = f4482b;
        C0959i9 c0959i9 = (C0959i9) interfaceC3279c.mo23f(c1701c0.getValue());
        context.getSharedPreferences("downloader_settings", 0).edit().putBoolean("launch_directly", c0959i9.f4788j).putBoolean("auto_start_downloads", c0959i9.f4789k).putInt("max_concurrent_downloads", c0959i9.f4790l).apply();
        c1701c0.getClass();
        c1701c0.m2752j(null, c0959i9);
    }
}
