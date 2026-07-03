package p039e5;

import java.util.ArrayList;
import java.util.List;
import p053g5.C1694m;
import p060h5.AbstractC1807o;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0790d implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3219e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f3220f;

    /* renamed from: g */
    public final /* synthetic */ String f3221g;

    public /* synthetic */ C0790d(String str, InterfaceC3279c interfaceC3279c) {
        this.f3221g = str;
        this.f3220f = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f3219e) {
            case 0:
                List<C0800d9> list = (List) obj;
                AbstractC3367j.m5100e(list, "list");
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                for (C0800d9 c0800d9 : list) {
                    if (AbstractC3367j.m5096a(c0800d9.f3340a, this.f3221g)) {
                        c0800d9 = (C0800d9) this.f3220f.mo23f(c0800d9);
                    }
                    arrayList.add(c0800d9);
                }
                return arrayList;
            default:
                ((Boolean) obj).booleanValue();
                this.f3220f.mo23f(this.f3221g);
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0790d(InterfaceC3279c interfaceC3279c, String str) {
        this.f3220f = interfaceC3279c;
        this.f3221g = str;
    }
}
