package p164v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p147t2.C3250c;
import p178x2.AbstractFutureC3820g;
import p178x2.C3821h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v3.i */
/* loaded from: classes.dex */
public abstract class AbstractC3585i {

    /* renamed from: a */
    public static final C3821h f17219a = new Object();

    /* renamed from: b */
    public static final Object f17220b = new Object();

    /* renamed from: c */
    public static C3250c f17221c = null;

    /* renamed from: a */
    public static long m5574a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC3583g.m5571a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C3250c m5575b() {
        C3250c c3250c = new C3250c(6);
        f17221c = c3250c;
        C3821h c3821h = f17219a;
        c3821h.getClass();
        if (AbstractFutureC3820g.f18024j.mo3258j(c3821h, null, c3250c)) {
            AbstractFutureC3820g.m5831b(c3821h);
        }
        return f17221c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5576c(Context context, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        C3584h m5572a;
        C3584h c3584h;
        int i7;
        if (z7 || f17221c == null) {
            synchronized (f17220b) {
                if (!z7) {
                    if (f17221c != null) {
                        return;
                    }
                }
                int i8 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (openFd.getLength() > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z8 = false;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (file.exists() && length > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists() && length2 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    try {
                        long m5574a = m5574a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                m5572a = C3584h.m5572a(file3);
                            } catch (IOException unused2) {
                                m5575b();
                                return;
                            }
                        } else {
                            m5572a = null;
                        }
                        if (m5572a != null && m5572a.f17217c == m5574a && (i7 = m5572a.f17216b) != 2) {
                            i8 = i7;
                            if (z7 && z10 && i8 != 1) {
                                i8 = 2;
                            }
                            if (m5572a != null && m5572a.f17216b == 2 && i8 == 1 && length < m5572a.f17218d) {
                                i8 = 3;
                            }
                            c3584h = new C3584h(1, i8, m5574a, length2);
                            if (m5572a != null || !m5572a.equals(c3584h)) {
                                c3584h.m5573b(file3);
                            }
                            m5575b();
                            return;
                        }
                        if (z9) {
                            i8 = 1;
                        } else if (z10) {
                            i8 = 2;
                        }
                        if (z7) {
                            i8 = 2;
                        }
                        if (m5572a != null) {
                            i8 = 3;
                        }
                        c3584h = new C3584h(1, i8, m5574a, length2);
                        if (m5572a != null) {
                        }
                        c3584h.m5573b(file3);
                        m5575b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m5575b();
                        return;
                    }
                }
                m5575b();
            }
        }
    }
}
