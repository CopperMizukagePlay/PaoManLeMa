package p164v3;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p008b.RunnableC0241k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v3.a */
/* loaded from: classes.dex */
public final class C3577a {

    /* renamed from: a */
    public final Executor f17186a;

    /* renamed from: b */
    public final InterfaceC3580d f17187b;

    /* renamed from: c */
    public final byte[] f17188c;

    /* renamed from: d */
    public final File f17189d;

    /* renamed from: e */
    public final String f17190e;

    /* renamed from: f */
    public boolean f17191f = false;

    /* renamed from: g */
    public C3578b[] f17192g;

    /* renamed from: h */
    public byte[] f17193h;

    public C3577a(AssetManager assetManager, Executor executor, InterfaceC3580d interfaceC3580d, String str, File file) {
        byte[] bArr;
        this.f17186a = executor;
        this.f17187b = interfaceC3580d;
        this.f17190e = str;
        this.f17189d = file;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            bArr = AbstractC3581e.f17206d;
        } else {
            switch (i7) {
                case 24:
                case 25:
                    bArr = AbstractC3581e.f17210h;
                    break;
                case 26:
                    bArr = AbstractC3581e.f17209g;
                    break;
                case 27:
                    bArr = AbstractC3581e.f17208f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC3581e.f17207e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f17188c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m5547a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f17187b.mo4280g();
                return null;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m5548b(int i7, Serializable serializable) {
        this.f17186a.execute(new RunnableC0241k(i7, 1, this, serializable));
    }
}
