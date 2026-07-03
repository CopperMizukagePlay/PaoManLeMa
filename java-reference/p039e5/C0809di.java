package p039e5;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.di */
/* loaded from: classes.dex */
public final class C0809di extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public long f3436i;

    /* renamed from: j */
    public int f3437j;

    /* renamed from: k */
    public final /* synthetic */ Context f3438k;

    /* renamed from: l */
    public final /* synthetic */ C3469p f3439l;

    /* renamed from: m */
    public final /* synthetic */ C3472s f3440m;

    /* renamed from: n */
    public final /* synthetic */ C3472s f3441n;

    /* renamed from: o */
    public final /* synthetic */ C3472s f3442o;

    /* renamed from: p */
    public final /* synthetic */ C3472s f3443p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f3444q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f3445r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f3446s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f3447t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f3448u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f3449v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f3450w;

    /* renamed from: x */
    public final /* synthetic */ C1100ms f3451x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809di(Context context, C3469p c3469p, C3472s c3472s, C3472s c3472s2, C3472s c3472s3, C3472s c3472s4, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, C1100ms c1100ms, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3438k = context;
        this.f3439l = c3469p;
        this.f3440m = c3472s;
        this.f3441n = c3472s2;
        this.f3442o = c3472s3;
        this.f3443p = c3472s4;
        this.f3444q = interfaceC2425y0;
        this.f3445r = interfaceC2425y02;
        this.f3446s = interfaceC2425y03;
        this.f3447t = interfaceC2425y04;
        this.f3448u = interfaceC2425y05;
        this.f3449v = interfaceC2425y06;
        this.f3450w = interfaceC2425y07;
        this.f3451x = c1100ms;
    }

    /* renamed from: q */
    public static final void m1501q(C1100ms c1100ms, boolean z7, long j6, C3472s c3472s, C3472s c3472s2, C3472s c3472s3, C3472s c3472s4, InterfaceC2425y0 interfaceC2425y0, C1248rl c1248rl) {
        Object obj;
        Object obj2;
        C1248rl c1248rl2;
        float f7 = AbstractC1092mk.f5952h;
        List<C1248rl> list = (List) interfaceC2425y0.getValue();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (AbstractC3367j.m5096a(((C1248rl) obj2).f7390a, c1248rl.f7390a)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C1248rl c1248rl3 = (C1248rl) obj2;
        if (c1248rl3 != null) {
            c1248rl2 = C1248rl.m2204a(c1248rl, c1248rl3.f7390a, c1248rl3.f7391b, null, null, 60);
        } else {
            c1248rl2 = c1248rl;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (AbstractC3367j.m5096a(((C1248rl) next).f7390a, c1248rl.f7390a)) {
                obj = next;
                break;
            }
        }
        C1248rl c1248rl4 = (C1248rl) obj;
        if (c1248rl4 != null && Log.isLoggable("HBCS-NetIface", 4)) {
            Log.i("HBCS-NetIface", "REBOUND detect " + AbstractC1249rm.m2249a0(c1248rl4, c1248rl2) + " testRunning=" + z7);
        }
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        for (C1248rl c1248rl5 : list) {
            if (AbstractC3367j.m5096a(c1248rl5.f7390a, c1248rl2.f7390a)) {
                c1248rl5 = c1248rl2;
            }
            arrayList.add(c1248rl5);
        }
        float f8 = AbstractC1092mk.f5952h;
        interfaceC2425y0.setValue(arrayList);
        if (z7) {
            boolean m1948I0 = c1100ms.m1948I0(c1248rl2);
            if (Log.isLoggable("HBCS-NetIface", 4)) {
                Log.i("HBCS-NetIface", "REBOUND action=restart " + AbstractC1249rm.m2251b0(c1248rl2) + " ok=" + m1948I0);
            }
            if (m1948I0) {
                AbstractC1092mk.m1860t3(c1248rl2.f7390a, j6, c3472s, c3472s2, c3472s3, c3472s4);
                return;
            }
            return;
        }
        boolean m2006x0 = c1100ms.m2006x0(c1248rl2, c1248rl2.f7390a);
        if (Log.isLoggable("HBCS-NetIface", 4)) {
            Log.i("HBCS-NetIface", "REBOUND action=rebind " + AbstractC1249rm.m2251b0(c1248rl2) + " ok=" + m2006x0);
        }
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0809di) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0809di(this.f3438k, this.f3439l, this.f3440m, this.f3441n, this.f3442o, this.f3443p, this.f3444q, this.f3445r, this.f3446s, this.f3447t, this.f3448u, this.f3449v, this.f3450w, this.f3451x, interfaceC2313c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0484 A[LOOP:11: B:123:0x047e->B:125:0x0484, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088 A[LOOP:0: B:10:0x0082->B:12:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d4 A[LOOP:12: B:128:0x04ce->B:130:0x04d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[LOOP:1: B:15:0x00a2->B:17:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[LOOP:2: B:23:0x00d6->B:25:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03a9 A[LOOP:19: B:262:0x03a3->B:264:0x03a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03bf A[LOOP:20: B:267:0x03bd->B:268:0x03bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x07da -> B:5:0x07dd). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C0809di.mo29m(java.lang.Object):java.lang.Object");
    }
}
