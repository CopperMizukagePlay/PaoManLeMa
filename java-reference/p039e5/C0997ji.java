package p039e5;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ji */
/* loaded from: classes.dex */
public final class C0997ji extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ C0976ir f5073i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f5074j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f5075k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f5076l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f5077m;

    /* renamed from: n */
    public final /* synthetic */ C1340uk f5078n;

    /* renamed from: o */
    public final /* synthetic */ C1100ms f5079o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f5080p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f5081q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997ji(C0976ir c0976ir, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, C1340uk c1340uk, C1100ms c1100ms, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5073i = c0976ir;
        this.f5074j = interfaceC2425y0;
        this.f5075k = interfaceC2425y02;
        this.f5076l = interfaceC2425y03;
        this.f5077m = interfaceC2425y04;
        this.f5078n = c1340uk;
        this.f5079o = c1100ms;
        this.f5080p = interfaceC2425y05;
        this.f5081q = interfaceC2425y06;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0997ji c0997ji = (C0997ji) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0997ji.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0997ji(this.f5073i, this.f5074j, this.f5075k, this.f5076l, this.f5077m, this.f5078n, this.f5079o, this.f5080p, this.f5081q, interfaceC2313c);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C1100ms c1100ms;
        C1340uk c1340uk = this.f5078n;
        LinkedHashMap linkedHashMap = c1340uk.f7962g;
        C0976ir c0976ir = this.f5073i;
        long j6 = c0976ir.f4975h;
        long j7 = c0976ir.f4974g;
        boolean z7 = c0976ir.f4969b;
        boolean z8 = c0976ir.f4968a;
        AbstractC1793a0.m2972L(obj);
        float f7 = AbstractC1092mk.f5952h;
        InterfaceC2425y0 interfaceC2425y0 = this.f5074j;
        boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
        C1694m c1694m = C1694m.f10482a;
        if (booleanValue) {
            C0789cu m1783e1 = AbstractC1092mk.m1783e1(interfaceC2425y0, this.f5075k, this.f5076l, this.f5077m);
            long j8 = m1783e1.f3218c;
            InterfaceC2425y0 interfaceC2425y02 = this.f5081q;
            C1100ms c1100ms2 = this.f5079o;
            if (j8 > 0) {
                if ((z8 || z7) && j7 + j6 >= j8) {
                    AbstractC1092mk.m1778d1(c1340uk, c1100ms2, this.f5080p, interfaceC2425y02);
                    return c1694m;
                }
            } else {
                if (z8) {
                    long j9 = m1783e1.f3216a;
                    if (j9 > 0 && j7 >= j9) {
                        if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                            Iterator it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    Messenger messenger = ((ServiceConnectionC1278sk) it.next()).f7619e;
                                    if (messenger != null) {
                                        messenger.send(Message.obtain((Handler) null, 3));
                                    }
                                } catch (Throwable th) {
                                    AbstractC1793a0.m2985m(th);
                                }
                            }
                        } else {
                            c1100ms2.m1963T0(SystemClock.elapsedRealtime(), c1100ms2.f6068d0, "手动停止下载");
                            c1100ms = c1100ms2;
                            if (z7) {
                                long j10 = m1783e1.f3217b;
                                if (j10 > 0 && j6 >= j10) {
                                    if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                                        Iterator it2 = linkedHashMap.values().iterator();
                                        while (it2.hasNext()) {
                                            try {
                                                Messenger messenger2 = ((ServiceConnectionC1278sk) it2.next()).f7619e;
                                                if (messenger2 != null) {
                                                    messenger2.send(Message.obtain((Handler) null, 4));
                                                }
                                            } catch (Throwable th2) {
                                                AbstractC1793a0.m2985m(th2);
                                            }
                                        }
                                    } else {
                                        c1100ms.m1965V0(SystemClock.elapsedRealtime(), c1100ms.f6071e0, "手动停止上传");
                                    }
                                }
                            }
                        }
                    }
                }
                c1100ms = c1100ms2;
                if (z7) {
                }
            }
        }
        return c1694m;
    }
}
