package p039e5;

import java.util.List;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1322u2 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7877e;

    /* renamed from: f */
    public final /* synthetic */ List f7878f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7879g;

    public /* synthetic */ C1322u2(List list, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f7877e = i7;
        this.f7878f = list;
        this.f7879g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f7877e) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = this.f7879g;
                int m2068o = AbstractC1172p7.m2068o(interfaceC2425y0) + 1;
                int m3066N = AbstractC1806n.m3066N(this.f7878f);
                if (m2068o > m3066N) {
                    m2068o = m3066N;
                }
                interfaceC2425y0.setValue(Integer.valueOf(m2068o));
                return C1694m.f10482a;
            default:
                List list = this.f7878f;
                if (!list.isEmpty()) {
                    this.f7879g.setValue(list);
                }
                return C1694m.f10482a;
        }
    }
}
