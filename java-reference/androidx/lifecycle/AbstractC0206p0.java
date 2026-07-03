package androidx.lifecycle;

import java.util.Iterator;
import p141s3.C3108a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0206p0 {

    /* renamed from: a */
    public final C3108a f871a = new C3108a();

    /* renamed from: a */
    public final void m466a() {
        C3108a c3108a = this.f871a;
        if (c3108a != null && !c3108a.f15715d) {
            c3108a.f15715d = true;
            synchronized (c3108a.f15712a) {
                try {
                    Iterator it = c3108a.f15713b.values().iterator();
                    while (it.hasNext()) {
                        C3108a.m4807a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c3108a.f15714c.iterator();
                    while (it2.hasNext()) {
                        C3108a.m4807a((AutoCloseable) it2.next());
                    }
                    c3108a.f15714c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
