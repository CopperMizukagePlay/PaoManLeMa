package p096m3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001a0.C0031h1;
import p006a7.C0129l;
import p077k.C2191g;
import p104n3.C2717b;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.j */
/* loaded from: classes.dex */
public final class C2560j {

    /* renamed from: j */
    public static final Object f13926j = new Object();

    /* renamed from: k */
    public static volatile C2560j f13927k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f13928a;

    /* renamed from: b */
    public final C2191g f13929b;

    /* renamed from: c */
    public volatile int f13930c;

    /* renamed from: d */
    public final Handler f13931d;

    /* renamed from: e */
    public final C2556f f13932e;

    /* renamed from: f */
    public final InterfaceC2559i f13933f;

    /* renamed from: g */
    public final C0129l f13934g;

    /* renamed from: h */
    public final int f13935h;

    /* renamed from: i */
    public final C2554d f13936i;

    public C2560j(C2570t c2570t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13928a = reentrantReadWriteLock;
        this.f13930c = 3;
        InterfaceC2559i interfaceC2559i = c2570t.f13961a;
        this.f13933f = interfaceC2559i;
        int i7 = c2570t.f13962b;
        this.f13935h = i7;
        this.f13936i = c2570t.f13963c;
        this.f13931d = new Handler(Looper.getMainLooper());
        this.f13929b = new C2191g();
        this.f13934g = new C0129l(22);
        C2556f c2556f = new C2556f(this);
        this.f13932e = c2556f;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f13930c = 0;
            } catch (Throwable th) {
                this.f13928a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m4084c() == 0) {
            try {
                interfaceC2559i.mo31b(new C2555e(c2556f));
            } catch (Throwable th2) {
                m4086f(th2);
            }
        }
    }

    /* renamed from: a */
    public static C2560j m4081a() {
        C2560j c2560j;
        boolean z7;
        synchronized (f13926j) {
            try {
                c2560j = f13927k;
                if (c2560j != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2560j;
    }

    /* renamed from: d */
    public static boolean m4082d() {
        if (f13927k != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m4083b(CharSequence charSequence, int i7) {
        boolean z7 = true;
        if (m4084c() != 1) {
            z7 = false;
        }
        if (z7) {
            AbstractC3393k.m5139j(charSequence, "charSequence cannot be null");
            C0031h1 c0031h1 = this.f13932e.f13922b;
            c0031h1.getClass();
            if (i7 >= 0 && i7 < charSequence.length()) {
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    C2574x[] c2574xArr = (C2574x[]) spanned.getSpans(i7, i7 + 1, C2574x.class);
                    if (c2574xArr.length > 0) {
                        return spanned.getSpanStart(c2574xArr[0]);
                    }
                }
                return ((C2567q) c0031h1.m79C(charSequence, Math.max(0, i7 - 16), Math.min(charSequence.length(), i7 + 16), Integer.MAX_VALUE, true, new C2567q(i7))).f13944f;
            }
            return -1;
        }
        throw new IllegalStateException("Not initialized yet");
    }

    /* renamed from: c */
    public final int m4084c() {
        this.f13928a.readLock().lock();
        try {
            return this.f13930c;
        } finally {
            this.f13928a.readLock().unlock();
        }
    }

    /* renamed from: e */
    public final void m4085e() {
        boolean z7;
        if (this.f13935h == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            if (m4084c() == 1) {
                return;
            }
            this.f13928a.writeLock().lock();
            try {
                if (this.f13930c == 0) {
                    return;
                }
                this.f13930c = 0;
                this.f13928a.writeLock().unlock();
                C2556f c2556f = this.f13932e;
                C2560j c2560j = c2556f.f13921a;
                try {
                    c2560j.f13933f.mo31b(new C2555e(c2556f));
                    return;
                } catch (Throwable th) {
                    c2560j.m4086f(th);
                    return;
                }
            } finally {
                this.f13928a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    /* renamed from: f */
    public final void m4086f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f13928a.writeLock().lock();
        try {
            this.f13930c = 2;
            arrayList.addAll(this.f13929b);
            this.f13929b.clear();
            this.f13928a.writeLock().unlock();
            this.f13931d.post(new RunnableC2558h(arrayList, this.f13930c, th));
        } catch (Throwable th2) {
            this.f13928a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: g */
    public final void m4087g(EditorInfo editorInfo) {
        int i7;
        if (m4084c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C2556f c2556f = this.f13932e;
        c2556f.getClass();
        Bundle bundle = editorInfo.extras;
        C2717b c2717b = (C2717b) c2556f.f13923c.f13966e;
        int m3415a = c2717b.m3415a(4);
        if (m3415a != 0) {
            i7 = ((ByteBuffer) c2717b.f12319h).getInt(m3415a + c2717b.f12316e);
        } else {
            i7 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i7);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
