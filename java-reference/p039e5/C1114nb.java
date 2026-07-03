package p039e5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2625z;
import p100n.AbstractC2647h;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nb */
/* loaded from: classes.dex */
public final class C1114nb extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f6225i;

    /* renamed from: j */
    public final /* synthetic */ long f6226j;

    /* renamed from: k */
    public final /* synthetic */ int f6227k;

    /* renamed from: l */
    public final /* synthetic */ long f6228l;

    /* renamed from: m */
    public final /* synthetic */ File f6229m;

    /* renamed from: n */
    public final /* synthetic */ String f6230n;

    /* renamed from: o */
    public final /* synthetic */ AtomicLong f6231o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3279c f6232p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114nb(int i7, long j6, int i8, long j7, File file, String str, AtomicLong atomicLong, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6225i = i7;
        this.f6226j = j6;
        this.f6227k = i8;
        this.f6228l = j7;
        this.f6229m = file;
        this.f6230n = str;
        this.f6231o = atomicLong;
        this.f6232p = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C1114nb c1114nb = (C1114nb) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c1114nb.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1114nb(this.f6225i, this.f6226j, this.f6227k, this.f6228l, this.f6229m, this.f6230n, this.f6231o, this.f6232p, interfaceC2313c);
    }

    /* JADX WARN: Finally extract failed */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        long j6;
        AbstractC1793a0.m2972L(obj);
        int i7 = this.f6225i;
        long j7 = this.f6226j;
        long j8 = i7 * j7;
        int i8 = this.f6227k - 1;
        long j9 = this.f6228l;
        if (i7 == i8) {
            j6 = j9 - 1;
        } else {
            j6 = (j7 + j8) - 1;
        }
        File file = new File(this.f6229m, AbstractC2647h.m4256b("part-", i7));
        C1238rb c1238rb = C1238rb.f7307a;
        AtomicLong atomicLong = this.f6231o;
        InterfaceC3279c interfaceC3279c = this.f6232p;
        C2625z c2625z = new C2625z();
        c2625z.m4194f(this.f6230n);
        c2625z.m4191c("User-Agent", "SpeedTest-V5.0.1");
        c2625z.m4191c("Range", "bytes=" + j8 + "-" + j6);
        C2598d0 m4681e = C1238rb.f7309c.m4187b(c2625z.m4189a()).m4681e();
        int i9 = m4681e.f14059h;
        if (i9 != 206) {
            try {
                if (!m4681e.m4142c()) {
                    throw new IllegalStateException(("分片下载失败：HTTP " + i9).toString());
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2168e.m3526m(m4681e, th);
                    throw th2;
                }
            }
        }
        AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
        if (abstractC2602f0 != null) {
            InputStream m4147b = abstractC2602f0.m4147b();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = m4147b.read(bArr); read >= 0; read = m4147b.read(bArr)) {
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            long addAndGet = atomicLong.addAndGet(read);
                            C1238rb c1238rb2 = C1238rb.f7307a;
                            C1238rb.m2174o(addAndGet, j9, interfaceC3279c);
                        }
                    }
                    fileOutputStream.close();
                    m4147b.close();
                    m4681e.close();
                    return C1694m.f10482a;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC2168e.m3526m(m4147b, th3);
                    throw th4;
                }
            }
        } else {
            throw new IllegalStateException("分片下载失败：响应为空");
        }
    }
}
