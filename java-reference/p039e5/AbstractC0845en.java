package p039e5;

import android.net.Network;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p099m6.C2598d0;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.en */
/* loaded from: classes.dex */
public abstract class AbstractC0845en {

    /* renamed from: a */
    public static final C2623x f3782a;

    static {
        C2622w c2622w = new C2622w();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2622w.m4180a(8000L, timeUnit);
        c2622w.m4183d(8000L, timeUnit);
        c2622w.f14173h = false;
        c2622w.f14174i = false;
        f3782a = new C2623x(c2622w);
    }

    /* renamed from: a */
    public static HttpURLConnection m1521a(C1248rl c1248rl, String str, String str2, boolean z7) {
        URLConnection openConnection;
        Network network;
        URL url = new URL(str);
        if (c1248rl == null || (network = c1248rl.f7392c) == null || (openConnection = network.openConnection(url)) == null) {
            openConnection = url.openConnection();
        }
        AbstractC3367j.m5098c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setRequestProperty("Accept", "*/*");
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("User-Agent", "HBCS-SpeedTest/1.0");
        if (str2.equals("GET")) {
            httpURLConnection.setRequestProperty("Range", "bytes=0-0");
        }
        return httpURLConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
    
        if (r1 == 206) goto L35;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1522b(C1248rl c1248rl, String str) {
        int responseCode;
        String m1524d = m1524d(c1248rl, str, true);
        if (m1524d != null) {
            return m1524d;
        }
        String m1524d2 = m1524d(c1248rl, str, false);
        if (m1524d2 != null) {
            return m1524d2;
        }
        String str2 = str;
        for (int i7 = 0; i7 < 15; i7++) {
            HttpURLConnection m1521a = m1521a(c1248rl, str2, "HEAD", false);
            try {
                int responseCode2 = m1521a.getResponseCode();
                if (200 > responseCode2 || responseCode2 >= 300) {
                    if (300 <= responseCode2 && responseCode2 < 400) {
                        String headerField = m1521a.getHeaderField("Location");
                        if (headerField != null) {
                            str2 = new URL(new URL(str2), headerField).toString();
                            m1521a.disconnect();
                        }
                    } else {
                        m1521a.disconnect();
                        HttpURLConnection m1521a2 = m1521a(c1248rl, str2, "GET", true);
                        String str3 = null;
                        try {
                            responseCode = m1521a2.getResponseCode();
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            m1521a2.disconnect();
                            throw th;
                        }
                        if (200 <= responseCode) {
                            if (responseCode < 300) {
                                str3 = m1521a2.getURL().toString();
                                m1521a2.disconnect();
                                str2 = str3;
                            }
                        }
                    }
                }
                m1521a.disconnect();
                break;
            } catch (Throwable th2) {
                m1521a.disconnect();
                throw th2;
            }
        }
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    /* renamed from: c */
    public static String m1523c(C1248rl c1248rl, String str) {
        String str2;
        Object m2985m;
        AbstractC3367j.m5100e(str, "originalUrl");
        boolean m971M = AbstractC0451r.m971M(str, "fetch+", false);
        if (m971M) {
            str2 = AbstractC0444k.m943g0(str, "fetch+");
        } else {
            str2 = str;
        }
        if (!AbstractC0451r.m971M(str2, "http://", false) && !AbstractC0451r.m971M(str2, "https://", false)) {
            return str;
        }
        try {
            m2985m = m1522b(c1248rl, str2);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = str2;
        }
        String str3 = (String) m2985m;
        if (!str3.equals(str2)) {
            Log.d("RedirectUrlResolver", "Resolved redirect: " + str2 + " -> " + str3);
        }
        if (m971M) {
            return "fetch+".concat(str3);
        }
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        r6.close();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0072. Please report as an issue. */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1524d(C1248rl c1248rl, String str, boolean z7) {
        Object m2985m;
        C2598d0 m4681e;
        Network network;
        int i7 = 0;
        C2623x c2623x = f3782a;
        if (c1248rl != null && (network = c1248rl.f7392c) != null) {
            C2622w m4186a = c2623x.m4186a();
            SocketFactory socketFactory = network.getSocketFactory();
            AbstractC3367j.m5099d(socketFactory, "getSocketFactory(...)");
            m4186a.m4184e(socketFactory);
            m4186a.f14173h = false;
            m4186a.f14174i = false;
            c2623x = new C2623x(m4186a);
        }
        while (true) {
            if (i7 < 15) {
                C2625z c2625z = new C2625z();
                c2625z.m4194f(str);
                if (z7) {
                    c2625z.m4192d("HEAD", null);
                } else {
                    c2625z.m4190b();
                    c2625z.m4191c("Range", "bytes=0-0");
                    c2625z.m4191c("Accept", "*/*");
                    c2625z.m4191c("Accept-Encoding", "identity");
                }
                try {
                    m4681e = c2623x.m4187b(c2625z.m4189a()).m4681e();
                    try {
                    } finally {
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (!m4681e.m4142c()) {
                    int i8 = m4681e.f14059h;
                    if (i8 != 206) {
                        if (i8 != 307 && i8 != 308) {
                            switch (i8) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    m4681e.close();
                                    break;
                            }
                        }
                        String m4141b = C2598d0.m4141b("Location", m4681e);
                        if (m4141b == null) {
                            m4681e.close();
                        } else {
                            m2985m = new URL(new URL(str), m4141b).toString();
                            m4681e.close();
                            if (m2985m instanceof C1689h) {
                                m2985m = null;
                            }
                            str = (String) m2985m;
                            if (str != null) {
                                i7++;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
