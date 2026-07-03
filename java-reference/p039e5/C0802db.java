package p039e5;

import android.os.SystemClock;
import java.util.Iterator;
import p060h5.AbstractC1806n;
import p060h5.C1803k;
import p073j2.AbstractC2168e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.db */
/* loaded from: classes.dex */
public final class C0802db {

    /* renamed from: a */
    public final Object f3381a = new Object();

    /* renamed from: b */
    public final C1803k f3382b = new C1803k();

    /* renamed from: c */
    public int f3383c = 4;

    /* renamed from: d */
    public long f3384d;

    /* renamed from: a */
    public final int m1499a(int i7) {
        int i8;
        synchronized (this.f3381a) {
            i8 = this.f3383c;
        }
        if (i8 >= 4) {
            return i7;
        }
        int ceil = (int) Math.ceil(i7 * (i8 / 4.0d));
        int i9 = 2;
        if (2 > i7) {
            i9 = i7;
        }
        return AbstractC2168e.m3530q(ceil, i9, i7);
    }

    /* renamed from: b */
    public final void m1500b(boolean z7) {
        int i7;
        int i8;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.f3381a) {
            try {
                this.f3382b.addLast(Boolean.valueOf(z7));
                while (this.f3382b.mo2999a() > 8) {
                    this.f3382b.removeFirst();
                }
                if (this.f3382b.mo2999a() < 4) {
                    return;
                }
                C1803k c1803k = this.f3382b;
                int i9 = 0;
                if (c1803k == null || !c1803k.isEmpty()) {
                    Iterator<E> it = c1803k.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue() && (i9 = i9 + 1) < 0) {
                            AbstractC1806n.m3071S();
                            throw null;
                        }
                    }
                }
                if (i9 >= 3 && (i8 = this.f3383c) > 2 && elapsedRealtime - this.f3384d >= 3000) {
                    this.f3383c = i8 - 1;
                    this.f3384d = elapsedRealtime;
                    this.f3382b.clear();
                } else if (i9 == 0 && (i7 = this.f3383c) < 4 && elapsedRealtime - this.f3384d >= 5000) {
                    this.f3383c = i7 + 1;
                    this.f3384d = elapsedRealtime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
