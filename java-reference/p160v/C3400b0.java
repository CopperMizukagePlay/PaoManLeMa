package p160v;

import java.util.Comparator;
import p066i3.AbstractC2067b;
import p152u.C3326n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.b0 */
/* loaded from: classes.dex */
public final class C3400b0 implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f16522e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3415i0 f16523f;

    public /* synthetic */ C3400b0(InterfaceC3415i0 interfaceC3415i0, int i7) {
        this.f16522e = i7;
        this.f16523f = interfaceC3415i0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16522e) {
            case 0:
                Object obj3 = ((C3326n) obj).f16337i;
                InterfaceC3415i0 interfaceC3415i0 = this.f16523f;
                return AbstractC2067b.m3284i(Integer.valueOf(interfaceC3415i0.mo1098b(obj3)), Integer.valueOf(interfaceC3415i0.mo1098b(((C3326n) obj2).f16337i)));
            default:
                Object obj4 = ((C3326n) obj2).f16337i;
                InterfaceC3415i0 interfaceC3415i02 = this.f16523f;
                return AbstractC2067b.m3284i(Integer.valueOf(interfaceC3415i02.mo1098b(obj4)), Integer.valueOf(interfaceC3415i02.mo1098b(((C3326n) obj).f16337i)));
        }
    }
}
