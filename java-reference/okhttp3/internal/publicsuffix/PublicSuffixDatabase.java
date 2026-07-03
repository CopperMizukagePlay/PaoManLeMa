package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p006a7.AbstractC0135r;
import p006a7.C0122e;
import p006a7.C0133p;
import p006a7.C0138u;
import p024c6.AbstractC0444k;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p159u6.C3395m;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f14869e = {42};

    /* renamed from: f */
    public static final List f14870f = AbstractC3784a.m5817z("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f14871g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f14872a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f14873b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f14874c;

    /* renamed from: d */
    public byte[] f14875d;

    /* renamed from: c */
    public static List m4446c(String str) {
        List m948l0 = AbstractC0444k.m948l0(str, new char[]{'.'});
        if (AbstractC3367j.m5096a(AbstractC1805m.m3052p0(m948l0), "")) {
            return AbstractC1805m.m3044h0(m948l0);
        }
        return m948l0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r6 = (byte[][]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r11 >= r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f14869e;
        r12 = r13.f14874c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = p147t2.C3250c.m4963a(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r6 >= r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r7 = r13.f14875d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r7 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r7 = p147t2.C3250c.m4963a(r7, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r1 = p024c6.AbstractC0444k.m948l0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (r0.size() != r1.size()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0146, code lost:
    
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r14 = p060h5.AbstractC1805m.m3039c0(m4446c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        if (r0 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        if (r0 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        if ((r14 instanceof p015b6.InterfaceC0298e) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0163, code lost:
    
        r14 = ((p015b6.InterfaceC0298e) r14).mo656a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        r14 = new p015b6.C0297d(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        return p015b6.AbstractC0307n.m666E(r14, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        throw new java.lang.IllegalArgumentException(p001a0.AbstractC0094y0.m184k(r0, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0148, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f14870f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f8, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        r5 = p024c6.AbstractC0444k.m948l0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0104, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        r1 = p024c6.AbstractC0444k.m948l0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        if (r5.size() <= r1.size()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0118, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0103, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d7, code lost:
    
        p158u5.AbstractC3367j.m5105j("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dd, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00be, code lost:
    
        p158u5.AbstractC3367j.m5105j("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c2, code lost:
    
        r12 = null;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4447a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        AbstractC3367j.m5099d(unicode, "unicodeDomain");
        List m4446c = m4446c(unicode);
        List list = C1813u.f10860e;
        if (!this.f14872a.get() && this.f14872a.compareAndSet(false, true)) {
            boolean z7 = false;
            while (true) {
                try {
                    try {
                        m4448b();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z7 = true;
                    } catch (IOException e7) {
                        C3395m c3395m = C3395m.f16494a;
                        C3395m.f16494a.getClass();
                        C3395m.m5156i("Failed to read public suffix list", 5, e7);
                        if (z7) {
                        }
                    }
                } finally {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } else {
            try {
                this.f14873b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f14874c != null) {
            int size = m4446c.size();
            byte[][] bArr = new byte[size];
            for (int i7 = 0; i7 < size; i7++) {
                String str3 = (String) m4446c.get(i7);
                Charset charset = StandardCharsets.UTF_8;
                AbstractC3367j.m5099d(charset, "UTF_8");
                byte[] bytes = str3.getBytes(charset);
                AbstractC3367j.m5099d(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i7] = bytes;
            }
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    byte[] bArr2 = this.f14874c;
                    if (bArr2 != null) {
                        str2 = C3250c.m4963a(bArr2, bArr, i8);
                        if (str2 != null) {
                            break;
                        }
                        i8++;
                    } else {
                        AbstractC3367j.m5105j("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
    }

    /* renamed from: b */
    public final void m4448b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = AbstractC0135r.f546a;
                C0138u c0138u = new C0138u(new C0133p(new C0122e(1, resourceAsStream, new Object())));
                try {
                    long readInt = c0138u.readInt();
                    c0138u.mo241D(readInt);
                    byte[] m260m = c0138u.f553f.m260m(readInt);
                    long readInt2 = c0138u.readInt();
                    c0138u.mo241D(readInt2);
                    byte[] m260m2 = c0138u.f553f.m260m(readInt2);
                    c0138u.close();
                    synchronized (this) {
                        this.f14874c = m260m;
                        this.f14875d = m260m2;
                    }
                } finally {
                }
            }
        } finally {
            this.f14873b.countDown();
        }
    }
}
