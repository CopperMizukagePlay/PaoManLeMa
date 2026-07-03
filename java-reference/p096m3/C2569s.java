package p096m3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.RunnableC0219y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a0.AbstractC0094y0;
import p006a7.C0129l;
import p037e3.AbstractC0689c;
import p037e3.C0690d;
import p037e3.C0691e;
import p037e3.C0692f;
import p065i2.AbstractC2064e;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.s */
/* loaded from: classes.dex */
public final class C2569s implements InterfaceC2559i {

    /* renamed from: e */
    public final Context f13952e;

    /* renamed from: f */
    public final C0690d f13953f;

    /* renamed from: g */
    public final C0129l f13954g;

    /* renamed from: h */
    public final Object f13955h = new Object();

    /* renamed from: i */
    public Handler f13956i;

    /* renamed from: j */
    public ThreadPoolExecutor f13957j;

    /* renamed from: k */
    public ThreadPoolExecutor f13958k;

    /* renamed from: l */
    public AbstractC2064e f13959l;

    public C2569s(Context context, C0690d c0690d) {
        AbstractC3393k.m5139j(context, "Context cannot be null");
        this.f13952e = context.getApplicationContext();
        this.f13953f = c0690d;
        this.f13954g = C2570t.f13960d;
    }

    /* renamed from: a */
    public final void m4091a() {
        synchronized (this.f13955h) {
            try {
                this.f13959l = null;
                Handler handler = this.f13956i;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13956i = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13958k;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13957j = null;
                this.f13958k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p096m3.InterfaceC2559i
    /* renamed from: b */
    public final void mo31b(AbstractC2064e abstractC2064e) {
        synchronized (this.f13955h) {
            this.f13959l = abstractC2064e;
        }
        synchronized (this.f13955h) {
            try {
                if (this.f13959l == null) {
                    return;
                }
                if (this.f13957j == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2551a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13958k = threadPoolExecutor;
                    this.f13957j = threadPoolExecutor;
                }
                this.f13957j.execute(new RunnableC0219y(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final C0692f m4092c() {
        try {
            C0129l c0129l = this.f13954g;
            Context context = this.f13952e;
            C0690d c0690d = this.f13953f;
            c0129l.getClass();
            Object[] objArr = {c0690d};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0691e m1473a = AbstractC0689c.m1473a(context, Collections.unmodifiableList(arrayList));
            int i7 = m1473a.f2244a;
            if (i7 == 0) {
                C0692f[] c0692fArr = (C0692f[]) ((List) m1473a.f2245b).get(0);
                if (c0692fArr != null && c0692fArr.length != 0) {
                    return c0692fArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(AbstractC0094y0.m184k(i7, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
