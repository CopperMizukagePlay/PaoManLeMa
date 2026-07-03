package p096m3;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import p001a0.C0031h1;
import p006a7.C0129l;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.e */
/* loaded from: classes.dex */
public final class C2555e extends AbstractC2064e {

    /* renamed from: a */
    public final /* synthetic */ C2556f f13920a;

    public C2555e(C2556f c2556f) {
        this.f13920a = c2556f;
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: A */
    public final void mo3253A(Throwable th) {
        this.f13920a.f13921a.m4086f(th);
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: B */
    public final void mo3254B(C2572v c2572v) {
        Set<int[]> m3289n;
        C2556f c2556f = this.f13920a;
        c2556f.f13923c = c2572v;
        C2572v c2572v2 = c2556f.f13923c;
        C2560j c2560j = c2556f.f13921a;
        C0129l c0129l = c2560j.f13934g;
        C2554d c2554d = c2560j.f13936i;
        if (Build.VERSION.SDK_INT >= 34) {
            m3289n = AbstractC2565o.m4088a();
        } else {
            m3289n = AbstractC2067b.m3289n();
        }
        c2556f.f13922b = new C0031h1(c2572v2, c0129l, c2554d, m3289n);
        C2560j c2560j2 = c2556f.f13921a;
        c2560j2.getClass();
        ArrayList arrayList = new ArrayList();
        c2560j2.f13928a.writeLock().lock();
        try {
            c2560j2.f13930c = 1;
            arrayList.addAll(c2560j2.f13929b);
            c2560j2.f13929b.clear();
            c2560j2.f13928a.writeLock().unlock();
            c2560j2.f13931d.post(new RunnableC2558h(arrayList, c2560j2.f13930c, null));
        } catch (Throwable th) {
            c2560j2.f13928a.writeLock().unlock();
            throw th;
        }
    }
}
