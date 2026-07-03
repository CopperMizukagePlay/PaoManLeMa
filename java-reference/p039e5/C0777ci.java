package p039e5;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ci */
/* loaded from: classes.dex */
public final class C0777ci extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public long f3066i;

    /* renamed from: j */
    public C1248rl f3067j;

    /* renamed from: k */
    public String f3068k;

    /* renamed from: l */
    public int f3069l;

    /* renamed from: m */
    public final /* synthetic */ Context f3070m;

    /* renamed from: n */
    public final /* synthetic */ C3469p f3071n;

    /* renamed from: o */
    public final /* synthetic */ C1100ms f3072o;

    /* renamed from: p */
    public final /* synthetic */ C3472s f3073p;

    /* renamed from: q */
    public final /* synthetic */ C3472s f3074q;

    /* renamed from: r */
    public final /* synthetic */ C3472s f3075r;

    /* renamed from: s */
    public final /* synthetic */ C3472s f3076s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f3077t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f3078u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f3079v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f3080w;

    /* renamed from: x */
    public final /* synthetic */ InterfaceC2425y0 f3081x;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC2425y0 f3082y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777ci(Context context, C3469p c3469p, C1100ms c1100ms, C3472s c3472s, C3472s c3472s2, C3472s c3472s3, C3472s c3472s4, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3070m = context;
        this.f3071n = c3469p;
        this.f3072o = c1100ms;
        this.f3073p = c3472s;
        this.f3074q = c3472s2;
        this.f3075r = c3472s3;
        this.f3076s = c3472s4;
        this.f3077t = interfaceC2425y0;
        this.f3078u = interfaceC2425y02;
        this.f3079v = interfaceC2425y03;
        this.f3080w = interfaceC2425y04;
        this.f3081x = interfaceC2425y05;
        this.f3082y = interfaceC2425y06;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0777ci) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0777ci(this.f3070m, this.f3071n, this.f3072o, this.f3073p, this.f3074q, this.f3075r, this.f3076s, this.f3077t, this.f3078u, this.f3079v, this.f3080w, this.f3081x, this.f3082y, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        if (r12 != r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0273, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r9, r28) == r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0275, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0273 -> B:6:0x0276). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        long j6;
        long j7;
        Object obj2;
        C1248rl c1248rl;
        String str;
        Object obj3;
        boolean z7;
        boolean z8;
        String str2;
        Iterator it;
        Object obj4;
        int i7 = this.f3069l;
        InterfaceC2425y0 interfaceC2425y0 = this.f3079v;
        Context context = this.f3070m;
        int i8 = 1;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    j7 = this.f3066i;
                    AbstractC1793a0.m2972L(obj);
                    i8 = 1;
                    float f7 = AbstractC1092mk.f5952h;
                    it = ((List) interfaceC2425y0.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj4 = it.next();
                            if (AbstractC1092mk.m1820l3((C1248rl) obj4)) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    c1248rl = (C1248rl) obj4;
                    if (c1248rl == null) {
                        str = c1248rl.f7394e;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    C1247rk.f7375b.m2197k(context);
                    this.f3067j = c1248rl;
                    this.f3068k = str;
                    this.f3066i = j7;
                    this.f3069l = i8;
                    obj2 = AbstractC1092mk.m1744V2(context, this);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                j7 = this.f3066i;
                str = this.f3068k;
                c1248rl = this.f3067j;
                AbstractC1793a0.m2972L(obj);
                obj2 = obj;
                List list = (List) obj2;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (AbstractC1092mk.m1820l3((C1248rl) obj3)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C1248rl c1248rl2 = (C1248rl) obj3;
                float f8 = AbstractC1092mk.f5952h;
                this.f3080w.setValue(list);
                boolean booleanValue = ((Boolean) this.f3081x.getValue()).booleanValue();
                C3469p c3469p = this.f3071n;
                if (booleanValue) {
                    ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((C1248rl) it3.next()).f7390a);
                    }
                    AbstractC1092mk.m1658D3(c3469p, arrayList);
                } else if (c1248rl != null) {
                    String str3 = c1248rl.f7390a;
                    if (c1248rl2 != null && c3469p.contains(str3)) {
                        c3469p.remove(str3);
                        c3469p.add(c1248rl2.f7390a);
                    }
                }
                if (c1248rl != null) {
                    String str4 = c1248rl.f7390a;
                    if (c1248rl2 != null) {
                        String str5 = c1248rl2.f7394e;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (!AbstractC0444k.m937a0(str) && !AbstractC0444k.m937a0(str5) && !str.equals(str5)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean m5096a = AbstractC3367j.m5096a(c1248rl.f7392c, c1248rl2.f7392c);
                        if (z7 || !m5096a) {
                            C1248rl m2204a = C1248rl.m2204a(c1248rl2, c1248rl.f7390a, c1248rl.f7391b, null, null, 60);
                            String m2249a0 = AbstractC1249rm.m2249a0(c1248rl, m2204a);
                            InterfaceC2425y0 interfaceC2425y02 = this.f3082y;
                            if (!((C0976ir) interfaceC2425y02.getValue()).f4968a && !((C0976ir) interfaceC2425y02.getValue()).f4969b) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            boolean z9 = z7;
                            AbstractC1249rm.m2261g0("CELLULAR_REBIND detect " + m2249a0 + " testRunning=" + z8);
                            List<C1248rl> list2 = (List) interfaceC2425y0.getValue();
                            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
                            for (C1248rl c1248rl3 : list2) {
                                if (AbstractC3367j.m5096a(c1248rl3.f7390a, str4)) {
                                    c1248rl3 = m2204a;
                                }
                                arrayList2.add(c1248rl3);
                            }
                            interfaceC2425y0.setValue(arrayList2);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            boolean z10 = ((C0976ir) interfaceC2425y02.getValue()).f4968a;
                            C1100ms c1100ms = this.f3072o;
                            if (!z10 && !((C0976ir) interfaceC2425y02.getValue()).f4969b) {
                                String str6 = "CELLULAR_REBIND action=rebind ok=" + c1100ms.m2006x0(m2204a, str4);
                                AbstractC3367j.m5100e(str6, "message");
                                if (Log.isLoggable("HBCS-NetIface", 4)) {
                                    Log.i("HBCS-NetIface", str6);
                                }
                            } else {
                                boolean m1948I0 = c1100ms.m1948I0(m2204a);
                                String str7 = "CELLULAR_REBIND action=restart ok=" + m1948I0;
                                AbstractC3367j.m5100e(str7, "message");
                                if (Log.isLoggable("HBCS-NetIface", 4)) {
                                    Log.i("HBCS-NetIface", str7);
                                }
                                if (m1948I0) {
                                    AbstractC1092mk.m1860t3(c1248rl.f7390a, elapsedRealtime, this.f3073p, this.f3074q, this.f3075r, this.f3076s);
                                }
                            }
                            if (z9) {
                                if (AbstractC0444k.m937a0(str5)) {
                                    str5 = "移动数据";
                                }
                                str2 = "蜂窝接口已重新绑定：" + ((Object) str5);
                            } else {
                                str2 = "蜂窝网络已刷新绑定";
                            }
                            Toast.makeText(context, str2, 0).show();
                        }
                    }
                }
                this.f3067j = null;
                this.f3068k = null;
                this.f3066i = j7;
                this.f3069l = 2;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            float f9 = AbstractC1092mk.f5952h;
            if (!((Boolean) this.f3077t.getValue()).booleanValue()) {
                return C1694m.f10482a;
            }
            Long m974P = AbstractC0451r.m974P(AbstractC0444k.m956t0((String) this.f3078u.getValue()).toString());
            if (m974P != null) {
                j6 = m974P.longValue();
            } else {
                j6 = 10;
            }
            if (j6 < 3) {
                j6 = 3;
            }
            j7 = j6 * 1000;
            float f72 = AbstractC1092mk.f5952h;
            it = ((List) interfaceC2425y0.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            c1248rl = (C1248rl) obj4;
            if (c1248rl == null) {
            }
            if (str == null) {
            }
            C1247rk.f7375b.m2197k(context);
            this.f3067j = c1248rl;
            this.f3068k = str;
            this.f3066i = j7;
            this.f3069l = i8;
            obj2 = AbstractC1092mk.m1744V2(context, this);
        }
    }
}
