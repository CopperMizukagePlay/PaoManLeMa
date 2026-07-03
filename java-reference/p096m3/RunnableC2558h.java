package p096m3;

import java.util.ArrayList;
import java.util.List;
import p110o2.AbstractC2814k;
import p110o2.C2811h;
import p110o2.C2815l;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.h */
/* loaded from: classes.dex */
public final class RunnableC2558h implements Runnable {

    /* renamed from: e */
    public final ArrayList f13924e;

    /* renamed from: f */
    public final int f13925f;

    public RunnableC2558h(List list, int i7, Throwable th) {
        AbstractC3393k.m5139j(list, "initCallbacks cannot be null");
        this.f13924e = new ArrayList(list);
        this.f13925f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f13924e;
        int size = arrayList.size();
        int i7 = 0;
        if (this.f13925f != 1) {
            while (i7 < size) {
                ((C2811h) arrayList.get(i7)).f14857b.f14390f = AbstractC2814k.f14860a;
                i7++;
            }
            return;
        }
        while (i7 < size) {
            C2811h c2811h = (C2811h) arrayList.get(i7);
            c2811h.f14856a.setValue(Boolean.TRUE);
            c2811h.f14857b.f14390f = new C2815l(true);
            i7++;
        }
    }
}
