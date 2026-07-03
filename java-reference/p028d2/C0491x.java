package p028d2;

import java.util.Comparator;
import p066i3.AbstractC2067b;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C0491x implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f1772e;

    /* renamed from: f */
    public final /* synthetic */ Object f1773f;

    public /* synthetic */ C0491x(int i7, Object obj) {
        this.f1772e = i7;
        this.f1773f = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1772e) {
            case 0:
                return ((Number) ((InterfaceC3281e) this.f1773f).mo22d(obj, obj2)).intValue();
            default:
                for (InterfaceC3279c interfaceC3279c : (InterfaceC3279c[]) this.f1773f) {
                    int m3284i = AbstractC2067b.m3284i((Comparable) interfaceC3279c.mo23f(obj), (Comparable) interfaceC3279c.mo23f(obj2));
                    if (m3284i != 0) {
                        return m3284i;
                    }
                }
                return 0;
        }
    }
}
