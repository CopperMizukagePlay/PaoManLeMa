package p039e5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p085l0.InterfaceC2425y0;
import p105n5.C2719b;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p168w.C3619d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1015k5 extends AbstractC3365h implements InterfaceC3279c {

    /* renamed from: m */
    public final /* synthetic */ int f5234m;

    /* renamed from: n */
    public final /* synthetic */ Object f5235n;

    /* renamed from: o */
    public final /* synthetic */ Object f5236o;

    /* renamed from: p */
    public final /* synthetic */ Object f5237p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015k5(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        super(1, AbstractC3366i.class, "toggleTransport", "NatTypePanel$toggleTransport(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/paoman/lema/NatTransport;)V", 0);
        this.f5234m = 2;
        this.f5235n = context;
        this.f5236o = interfaceC2425y0;
        this.f5237p = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        ArrayList m3059w0;
        int i7 = this.f5234m;
        int i8 = 0;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f5237p;
        Object obj3 = this.f5236o;
        Object obj4 = this.f5235n;
        switch (i7) {
            case 0:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "p0");
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                ((InterfaceC3279c) obj4).mo23f(str);
                AbstractC0525d0.m1141s((InterfaceC0516a0) obj3, null, new C1108n5((C3619d) obj2, null, 0), 3);
                return c1694m;
            case 1:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "p0");
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                ((InterfaceC3279c) obj4).mo23f(str2);
                AbstractC0525d0.m1141s((InterfaceC0516a0) obj3, null, new C1108n5((C3619d) obj2, null, 1), 3);
                return c1694m;
            default:
                EnumC0748bl enumC0748bl = (EnumC0748bl) obj;
                AbstractC3367j.m5100e(enumC0748bl, "p0");
                Context context = (Context) obj4;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                if (((EnumC1495zk) ((InterfaceC2425y0) obj3).getValue()) != EnumC1495zk.f9910f) {
                    if (((List) interfaceC2425y0.getValue()).contains(enumC0748bl.name())) {
                        m3059w0 = AbstractC1805m.m3057u0((List) interfaceC2425y0.getValue(), enumC0748bl.name());
                    } else {
                        m3059w0 = AbstractC1805m.m3059w0((List) interfaceC2425y0.getValue(), enumC0748bl.name());
                    }
                    C2719b c2719b = EnumC0748bl.f2841i;
                    ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c2719b));
                    Iterator it = c2719b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((EnumC0748bl) it.next()).name());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i8 < size) {
                        Object obj5 = arrayList.get(i8);
                        i8++;
                        if (m3059w0.contains((String) obj5)) {
                            arrayList2.add(obj5);
                        }
                    }
                    interfaceC2425y0.setValue(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = c2719b.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((List) interfaceC2425y0.getValue()).contains(((EnumC0748bl) next).name())) {
                            arrayList3.add(next);
                        }
                    }
                    AbstractC1249rm.m2220G0(context, arrayList3);
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015k5(InterfaceC3279c interfaceC3279c, InterfaceC0516a0 interfaceC0516a0, C3619d c3619d, int i7) {
        super(1, AbstractC3366i.class, "navigateToPing", "DiagnosticsTab$navigateToPing(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;Ljava/lang/String;)V", 0);
        this.f5234m = i7;
        switch (i7) {
            case 1:
                this.f5235n = interfaceC3279c;
                this.f5236o = interfaceC0516a0;
                this.f5237p = c3619d;
                super(1, AbstractC3366i.class, "navigateToTrace", "DiagnosticsTab$navigateToTrace(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;Ljava/lang/String;)V", 0);
                return;
            default:
                this.f5235n = interfaceC3279c;
                this.f5236o = interfaceC0516a0;
                this.f5237p = c3619d;
                return;
        }
    }
}
