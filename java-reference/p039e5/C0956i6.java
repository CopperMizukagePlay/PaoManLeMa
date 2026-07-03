package p039e5;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0956i6 extends AbstractC3365h implements InterfaceC3279c {

    /* renamed from: m */
    public final /* synthetic */ Context f4773m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f4774n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0956i6(Context context, InterfaceC2425y0 interfaceC2425y0) {
        super(1, AbstractC3366i.class, "persistServers", "NatTypePanel$persistServers(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/util/List;)V", 0);
        this.f4773m = context;
        this.f4774n = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        List list = (List) obj;
        AbstractC3367j.m5100e(list, "p0");
        this.f4774n.setValue(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!AbstractC0444k.m937a0(((C0716al) obj2).f2442a)) {
                arrayList.add(obj2);
            }
        }
        String m3051o0 = AbstractC1805m.m3051o0(arrayList, "\n", null, null, new C0866fc(14), 30);
        Context context = this.f4773m;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(m3051o0, "value");
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_servers", m3051o0).apply();
        return C1694m.f10482a;
    }
}
