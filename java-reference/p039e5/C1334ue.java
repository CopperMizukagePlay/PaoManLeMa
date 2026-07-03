package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.List;
import p001a0.C0031h1;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p153u0.C3334a;
import p153u0.InterfaceC3337d;
import p153u0.InterfaceC3338e;
import p153u0.InterfaceC3342i;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ue */
/* loaded from: classes.dex */
public final /* synthetic */ class C1334ue implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7925e = 1;

    /* renamed from: f */
    public final /* synthetic */ Object f7926f;

    /* renamed from: g */
    public final /* synthetic */ Object f7927g;

    /* renamed from: h */
    public final /* synthetic */ Object f7928h;

    /* renamed from: i */
    public final /* synthetic */ Object f7929i;

    /* renamed from: j */
    public final /* synthetic */ Object f7930j;

    /* renamed from: k */
    public final /* synthetic */ Object f7931k;

    public /* synthetic */ C1334ue(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05) {
        this.f7926f = context;
        this.f7927g = interfaceC2425y0;
        this.f7928h = interfaceC2425y02;
        this.f7929i = interfaceC2425y03;
        this.f7930j = interfaceC2425y04;
        this.f7931k = interfaceC2425y05;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f7925e;
        boolean z7 = false;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f7931k;
        Object obj2 = this.f7926f;
        Object obj3 = this.f7929i;
        Object obj4 = this.f7928h;
        Object obj5 = this.f7927g;
        Object obj6 = this.f7930j;
        switch (i7) {
            case 0:
                AbstractC1092mk.m1724R((Context) obj2, (InterfaceC0516a0) obj6, (InterfaceC2425y0) obj5, (InterfaceC2425y0) obj4, (C3469p) obj, (InterfaceC2425y0) obj3);
                return c1694m;
            case 1:
                Context context = (Context) obj2;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj4;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj3;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj6;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj;
                C1362vb m1875w3 = AbstractC1092mk.m1875w3((String) ((InterfaceC2425y0) obj5).getValue());
                if (m1875w3 == null) {
                    Toast.makeText(context, "无法识别配置内容", 0).show();
                } else {
                    interfaceC2425y0.setValue(Boolean.FALSE);
                    interfaceC2425y02.setValue(m1875w3);
                    interfaceC2425y03.setValue("粘贴的 .conf 配置");
                    interfaceC2425y04.setValue(Boolean.TRUE);
                }
                return c1694m;
            case 2:
                AbstractC1092mk.m1714P((InterfaceC0516a0) obj6, (InterfaceC2425y0) obj5, (InterfaceC2425y0) obj4, (Context) obj2, (InterfaceC2425y0) obj3, (InterfaceC2425y0) obj, true, false);
                return c1694m;
            case 3:
                C3469p c3469p = (C3469p) obj;
                List list = (C3469p) obj6;
                C2349d1 c2349d1 = (C2349d1) obj2;
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) obj3;
                float f7 = AbstractC1092mk.f5952h;
                ((InterfaceC2425y0) obj5).setValue(EnumC0770cb.f3018e);
                if (!((Boolean) ((InterfaceC2425y0) obj4).getValue()).booleanValue() || list.isEmpty()) {
                    list = AbstractC3784a.m5817z(Integer.valueOf(c2349d1.m3741g()));
                }
                AbstractC1092mk.m1658D3(c3469p, list);
                interfaceC2425y05.setValue(Boolean.TRUE);
                return c1694m;
            default:
                C3334a c3334a = (C3334a) obj6;
                InterfaceC3342i interfaceC3342i = (InterfaceC3342i) obj5;
                InterfaceC3338e interfaceC3338e = (InterfaceC3338e) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z8 = true;
                if (c3334a.f16386f != interfaceC3338e) {
                    c3334a.f16386f = interfaceC3338e;
                    z7 = true;
                }
                if (!AbstractC3367j.m5096a(c3334a.f16387g, str)) {
                    c3334a.f16387g = str;
                } else {
                    z8 = z7;
                }
                c3334a.f16385e = interfaceC3342i;
                c3334a.f16388h = obj2;
                c3334a.f16389i = objArr;
                InterfaceC3337d interfaceC3337d = c3334a.f16390j;
                if (interfaceC3337d != null && z8) {
                    ((C0031h1) interfaceC3337d).m87K();
                    c3334a.f16390j = null;
                    c3334a.m5071a();
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1334ue(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, Context context, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04) {
        this.f7930j = interfaceC0516a0;
        this.f7927g = interfaceC2425y0;
        this.f7928h = interfaceC2425y02;
        this.f7926f = context;
        this.f7929i = interfaceC2425y03;
        this.f7931k = interfaceC2425y04;
    }

    public /* synthetic */ C1334ue(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, Context context, C3469p c3469p, InterfaceC2425y0 interfaceC2425y03) {
        this.f7930j = interfaceC0516a0;
        this.f7927g = interfaceC2425y0;
        this.f7928h = interfaceC2425y02;
        this.f7926f = context;
        this.f7931k = c3469p;
        this.f7929i = interfaceC2425y03;
    }

    public /* synthetic */ C1334ue(C3334a c3334a, InterfaceC3342i interfaceC3342i, InterfaceC3338e interfaceC3338e, String str, Object obj, Object[] objArr) {
        this.f7930j = c3334a;
        this.f7927g = interfaceC3342i;
        this.f7928h = interfaceC3338e;
        this.f7929i = str;
        this.f7926f = obj;
        this.f7931k = objArr;
    }

    public /* synthetic */ C1334ue(C3469p c3469p, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y03) {
        this.f7931k = c3469p;
        this.f7930j = c3469p2;
        this.f7927g = interfaceC2425y0;
        this.f7928h = interfaceC2425y02;
        this.f7926f = c2349d1;
        this.f7929i = interfaceC2425y03;
    }
}
