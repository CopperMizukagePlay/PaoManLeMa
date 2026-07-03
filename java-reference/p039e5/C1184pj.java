package p039e5;

import android.content.Context;
import android.widget.Toast;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pj */
/* loaded from: classes.dex */
public final class C1184pj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f6891i;

    /* renamed from: j */
    public final /* synthetic */ Context f6892j;

    /* renamed from: k */
    public final /* synthetic */ boolean f6893k;

    /* renamed from: l */
    public final /* synthetic */ boolean f6894l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f6895m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f6896n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f6897o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184pj(Context context, boolean z7, boolean z8, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6892j = context;
        this.f6893k = z7;
        this.f6894l = z8;
        this.f6895m = interfaceC2425y0;
        this.f6896n = interfaceC2425y02;
        this.f6897o = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1184pj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1184pj(this.f6892j, this.f6893k, this.f6894l, this.f6895m, this.f6896n, this.f6897o, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f6891i;
        InterfaceC2313c interfaceC2313c = null;
        int i8 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C1238rb c1238rb = C1238rb.f7307a;
            this.f6891i = 1;
            C2325e c2325e = AbstractC0549l0.f1898a;
            obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0990jb(2, interfaceC2313c, i8), this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (obj == enumC2465a) {
                return enumC2465a;
            }
        }
        InterfaceC1351v0 interfaceC1351v0 = (InterfaceC1351v0) obj;
        boolean z7 = interfaceC1351v0 instanceof C1258s0;
        Context context = this.f6892j;
        if (z7) {
            C1238rb c1238rb2 = C1238rb.f7307a;
            C1227r0 c1227r0 = ((C1258s0) interfaceC1351v0).f7455a;
            C1238rb.m2169j(context, c1227r0);
            float f7 = AbstractC1092mk.f5952h;
            String str = "";
            String string = context.getSharedPreferences("speed_test_profiles", 0).getString("ignored_update_version", "");
            if (string != null) {
                str = string;
            }
            boolean m2166g = C1238rb.m2166g(context, c1227r0);
            boolean z8 = this.f6893k;
            InterfaceC2425y0 interfaceC2425y0 = this.f6896n;
            InterfaceC2425y0 interfaceC2425y02 = this.f6895m;
            if (z8 && str.equals(c1227r0.f7193a) && !m2166g) {
                interfaceC2425y02.setValue(null);
                AbstractC1092mk.m1847r0(interfaceC2425y0, false);
            } else {
                interfaceC2425y02.setValue(c1227r0);
                AbstractC1092mk.m1847r0(interfaceC2425y0, true);
            }
        } else {
            boolean z9 = interfaceC1351v0 instanceof C1320u0;
            boolean z10 = this.f6894l;
            if (z9) {
                if (z10) {
                    Toast.makeText(context, "当前已是最新版本：V5.0.1", 0).show();
                }
            } else if (interfaceC1351v0 instanceof C1289t0) {
                if (z10) {
                    Toast.makeText(context, ((C1289t0) interfaceC1351v0).f7711a, 0).show();
                }
            } else {
                throw new RuntimeException();
            }
        }
        float f8 = AbstractC1092mk.f5952h;
        this.f6897o.setValue(Boolean.FALSE);
        return C1694m.f10482a;
    }
}
