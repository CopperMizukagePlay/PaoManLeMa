package p001a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.lifecycle.InterfaceC0213t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p008b.C0222a0;
import p008b.C0238i0;
import p017c.C0325j;
import p025d.C0455b;
import p039e5.C0745bi;
import p039e5.C1179pe;
import p039e5.C1243rg;
import p051g3.AbstractC1643l;
import p051g3.AbstractC1653q;
import p085l0.InterfaceC2360g0;
import p085l0.InterfaceC2425y0;
import p100n.C2628a1;
import p100n.C2631b1;
import p100n.C2637d1;
import p100n.C2642f0;
import p100n.C2643f1;
import p100n.C2648h0;
import p137s.C3081j;
import p137s.C3082k;
import p137s.C3083l;
import p144t.AbstractC3122c;
import p144t.C3161v0;
import p158u5.AbstractC3367j;
import p160v.C3447y0;
import p170w1.ComponentCallbacks2C3689j0;
import p170w1.ComponentCallbacks2C3693k0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.b2 */
/* loaded from: classes.dex */
public final class C0008b2 implements InterfaceC2360g0 {

    /* renamed from: a */
    public final /* synthetic */ int f61a;

    /* renamed from: b */
    public final /* synthetic */ Object f62b;

    /* renamed from: c */
    public final /* synthetic */ Object f63c;

    public /* synthetic */ C0008b2(int i7, Object obj, Object obj2) {
        this.f61a = i7;
        this.f62b = obj;
        this.f63c = obj2;
    }

    @Override // p085l0.InterfaceC2360g0
    /* renamed from: a */
    public final void mo26a() {
        boolean isTerminated;
        int i7 = this.f61a;
        Object obj = this.f63c;
        Object obj2 = this.f62b;
        switch (i7) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                C3083l c3083l = (C3083l) interfaceC2425y0.getValue();
                if (c3083l != null) {
                    C3082k c3082k = new C3082k(c3083l);
                    C3081j c3081j = (C3081j) obj;
                    if (c3081j != null) {
                        c3081j.m4748c(c3082k);
                    }
                    interfaceC2425y0.setValue(null);
                    return;
                }
                return;
            case 1:
                C0455b c0455b = (C0455b) obj2;
                C0325j c0325j = (C0325j) obj;
                if (c0455b.f1570a != null) {
                    c0325j.f1135b.m4970e();
                    return;
                }
                if (c0455b.f1571b != null) {
                    C0238i0 c0238i0 = c0325j.f1134a;
                    ArrayList arrayList = c0238i0.f926a;
                    CopyOnWriteArrayList copyOnWriteArrayList = c0238i0.f928c;
                    Iterator it = copyOnWriteArrayList.iterator();
                    AbstractC3367j.m5099d(it, "iterator(...)");
                    while (true) {
                        int i8 = 0;
                        if (it.hasNext()) {
                            AutoCloseable autoCloseable = (AutoCloseable) it.next();
                            if (autoCloseable instanceof AutoCloseable) {
                                autoCloseable.close();
                            } else if (autoCloseable instanceof ExecutorService) {
                                ExecutorService executorService = (ExecutorService) autoCloseable;
                                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                    executorService.shutdown();
                                    while (!isTerminated) {
                                        try {
                                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                        } catch (InterruptedException unused) {
                                            if (i8 == 0) {
                                                executorService.shutdownNow();
                                                i8 = 1;
                                            }
                                        }
                                    }
                                    if (i8 != 0) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            } else if (autoCloseable instanceof TypedArray) {
                                ((TypedArray) autoCloseable).recycle();
                            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                                ((MediaMetadataRetriever) autoCloseable).release();
                            } else if (autoCloseable instanceof MediaDrm) {
                                ((MediaDrm) autoCloseable).release();
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            copyOnWriteArrayList.clear();
                            int size = arrayList.size();
                            while (i8 < size) {
                                Object obj3 = arrayList.get(i8);
                                i8++;
                                ((C0222a0) obj3).m4970e();
                            }
                            arrayList.clear();
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException("Unreachable");
                }
                break;
            case 2:
                ((Context) obj2).unregisterReceiver((C1243rg) obj);
                return;
            case 3:
                ((InterfaceC0213t) obj2).mo415g().m473f((C1179pe) obj);
                return;
            case 4:
                ((ConnectivityManager) obj2).unregisterNetworkCallback((C0745bi) obj);
                return;
            case AbstractC3122c.f15761f /* 5 */:
                ((C2648h0) obj2).f14319a.m4308j((C2642f0) obj);
                return;
            case AbstractC3122c.f15759d /* 6 */:
                ((C2643f1) obj2).f14314j.remove((C2643f1) obj);
                return;
            case 7:
                C2643f1 c2643f1 = (C2643f1) obj2;
                C2628a1 c2628a1 = (C2628a1) ((C2631b1) obj).f14250b.getValue();
                if (c2628a1 != null) {
                    c2643f1.f14313i.remove(c2628a1.f14243e);
                    return;
                }
                return;
            case 8:
                ((C2643f1) obj2).f14313i.remove((C2637d1) obj);
                return;
            case AbstractC3122c.f15758c /* 9 */:
                C3161v0 c3161v0 = (C3161v0) obj2;
                View view = (View) obj;
                int i9 = c3161v0.f15865s - 1;
                c3161v0.f15865s = i9;
                if (i9 == 0) {
                    int i10 = AbstractC1653q.f10423a;
                    AbstractC1643l.m2651b(view, null);
                    AbstractC1653q.m2699b(view, null);
                    view.removeOnAttachStateChangeListener(c3161v0.f15866t);
                    return;
                }
                return;
            case AbstractC3122c.f15760e /* 10 */:
                ((C3447y0) obj2).f16660g.add(obj);
                return;
            case 11:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C3689j0) obj);
                return;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C3693k0) obj);
                return;
        }
    }
}
