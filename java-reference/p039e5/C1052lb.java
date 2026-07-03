package p039e5;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.json.JSONObject;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0451r;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2602f0;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.C2623x;
import p099m6.C2625z;
import p135r5.AbstractC3063j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lb */
/* loaded from: classes.dex */
public final class C1052lb extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public String f5464i;

    /* renamed from: j */
    public File f5465j;

    /* renamed from: k */
    public long f5466k;

    /* renamed from: l */
    public int f5467l;

    /* renamed from: m */
    public final /* synthetic */ Context f5468m;

    /* renamed from: n */
    public final /* synthetic */ C1227r0 f5469n;

    /* renamed from: o */
    public final /* synthetic */ boolean f5470o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3279c f5471p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052lb(Context context, C1227r0 c1227r0, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5468m = context;
        this.f5469n = c1227r0;
        this.f5470o = z7;
        this.f5471p = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1052lb) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1052lb(this.f5468m, this.f5469n, this.f5470o, this.f5471p, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
    
        if (r8.equalsIgnoreCase("bytes") == true) goto L50;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01da  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        String m2175q;
        long j6;
        Long m974P;
        C1227r0 c1227r0;
        File file;
        long j7;
        int i7;
        long j8;
        File file2;
        long j9;
        long j10;
        boolean z7;
        long j11;
        String str;
        Long l7;
        Long l8;
        int i8 = this.f5467l;
        C1227r0 c1227r02 = this.f5469n;
        Context context = this.f5468m;
        if (i8 != 0) {
            if (i8 == 1) {
                j11 = this.f5466k;
                file2 = this.f5465j;
                str = this.f5464i;
                AbstractC1793a0.m2972L(obj);
                c1227r0 = c1227r02;
                j6 = 0;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C1238rb c1238rb = C1238rb.f7307a;
            C1238rb.m2176r(context);
            String str2 = c1227r02.f7197e;
            String str3 = c1227r02.f7196d;
            m2175q = C1238rb.m2175q(str2);
            File m2163c = C1238rb.m2163c(context, m2175q);
            boolean z8 = this.f5470o;
            InterfaceC3279c interfaceC3279c = this.f5471p;
            if (z8) {
                C1238rb.m2165e(context);
            } else {
                C1238rb.m2169j(context, c1227r02);
                if (C1238rb.m2166g(context, c1227r02)) {
                    interfaceC3279c.mo23f(new Integer(100));
                    return FileProvider.m408d(context, context.getPackageName() + ".fileprovider", m2163c);
                }
            }
            C2625z c2625z = new C2625z();
            c2625z.m4194f(str3);
            c2625z.m4192d("HEAD", null);
            c2625z.m4191c("User-Agent", "SpeedTest-V5.0.1");
            C2592a0 m4189a = c2625z.m4189a();
            j6 = 0;
            C2623x c2623x = C1238rb.f7309c;
            C2598d0 m4681e = c2623x.m4187b(m4189a).m4681e();
            try {
                long j12 = -1;
                if (!m4681e.m4142c()) {
                    m4681e.close();
                } else {
                    String m4141b = C2598d0.m4141b("Content-Length", m4681e);
                    if (m4141b != null && (m974P = AbstractC0451r.m974P(m4141b)) != null) {
                        if (m974P.longValue() <= 0) {
                            m974P = null;
                        }
                        if (m974P != null) {
                            j12 = m974P.longValue();
                        }
                    }
                    m4681e.close();
                }
                c1227r0 = c1227r02;
                long j13 = j12;
                if (j13 > 0 && j13 >= 524288) {
                    C2625z c2625z2 = new C2625z();
                    c2625z2.m4194f(str3);
                    c2625z2.m4191c("User-Agent", "SpeedTest-V5.0.1");
                    i7 = 100;
                    c2625z2.m4191c("Range", "bytes=0-0");
                    c2625z2.m4190b();
                    m4681e = c2623x.m4187b(c2625z2.m4189a()).m4681e();
                    try {
                        if (m4681e.f14059h != 206) {
                            String m4141b2 = C2598d0.m4141b("Accept-Ranges", m4681e);
                            if (m4141b2 != null) {
                            }
                            z7 = false;
                            m4681e.close();
                            if (!z7) {
                                this.f5464i = m2175q;
                                this.f5465j = m2163c;
                                this.f5466k = j13;
                                this.f5467l = 1;
                                Object m2161a = C1238rb.m2161a(str3, m2163c, j13, this.f5471p, this);
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (m2161a == enumC2465a) {
                                    return enumC2465a;
                                }
                                j11 = j13;
                                file2 = m2163c;
                                str = m2175q;
                            } else {
                                file = m2163c;
                                j7 = j13;
                            }
                        }
                        z7 = true;
                        m4681e.close();
                        if (!z7) {
                        }
                    } finally {
                    }
                } else {
                    file = m2163c;
                    j7 = j13;
                    i7 = 100;
                }
                C2625z c2625z3 = new C2625z();
                c2625z3.m4194f(str3);
                c2625z3.m4191c("User-Agent", "SpeedTest-V5.0.1");
                m4681e = c2623x.m4187b(c2625z3.m4189a()).m4681e();
                try {
                    if (m4681e.m4142c()) {
                        AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
                        if (abstractC2602f0 != null) {
                            long mo4144c = abstractC2602f0.mo4144c();
                            Long valueOf = Long.valueOf(mo4144c);
                            if (mo4144c <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                j8 = valueOf.longValue();
                            } else {
                                j8 = j7;
                            }
                            InputStream m4147b = abstractC2602f0.m4147b();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[65536];
                                    int read = m4147b.read(bArr);
                                    long j14 = 0;
                                    while (read >= 0) {
                                        if (read > 0) {
                                            j10 = j7;
                                            fileOutputStream.write(bArr, 0, read);
                                            j14 += read;
                                            C1238rb c1238rb2 = C1238rb.f7307a;
                                            C1238rb.m2174o(j14, j8, interfaceC3279c);
                                        } else {
                                            j10 = j7;
                                        }
                                        read = m4147b.read(bArr);
                                        j7 = j10;
                                    }
                                    long j15 = j7;
                                    fileOutputStream.close();
                                    m4147b.close();
                                    m4681e.close();
                                    interfaceC3279c.mo23f(Integer.valueOf(i7));
                                    file2 = file;
                                    j9 = j15;
                                    C1238rb c1238rb3 = C1238rb.f7307a;
                                    l7 = new Long(j9);
                                    if (l7.longValue() <= j6) {
                                        l8 = l7;
                                    } else {
                                        l8 = null;
                                    }
                                    if (!C1238rb.m2177s(file2, l8)) {
                                        C1227r0 c1227r03 = c1227r0;
                                        String str4 = c1227r03.f7193a;
                                        String str5 = c1227r03.f7194b;
                                        String str6 = c1227r03.f7195c;
                                        String str7 = c1227r03.f7196d;
                                        String str8 = c1227r03.f7198f;
                                        long length = file2.length();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        AbstractC3367j.m5100e(m2175q, "apkFileName");
                                        File file3 = file2;
                                        File file4 = new File(C1238rb.m2176r(context), "pending_update.json");
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("versionName", str4);
                                        jSONObject.put("releaseName", str5);
                                        jSONObject.put("releaseUrl", str6);
                                        jSONObject.put("apkDownloadUrl", str7);
                                        jSONObject.put("apkFileName", m2175q);
                                        jSONObject.put("releaseNotes", str8);
                                        jSONObject.put("fileSize", length);
                                        jSONObject.put("downloadedAt", currentTimeMillis);
                                        String jSONObject2 = jSONObject.toString();
                                        AbstractC3367j.m5099d(jSONObject2, "toString(...)");
                                        AbstractC3063j.m4738O(file4, jSONObject2, AbstractC0434a.f1477a);
                                        return FileProvider.m408d(context, context.getPackageName() + ".fileprovider", file3);
                                    }
                                    file2.delete();
                                    throw new IllegalStateException("下载完成但安装包校验失败，请重新下载");
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("下载失败：响应为空");
                        }
                    } else {
                        throw new IllegalStateException(("下载失败：HTTP " + m4681e.f14059h).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        j9 = j11;
        m2175q = str;
        C1238rb c1238rb32 = C1238rb.f7307a;
        l7 = new Long(j9);
        if (l7.longValue() <= j6) {
        }
        if (!C1238rb.m2177s(file2, l8)) {
        }
    }
}
