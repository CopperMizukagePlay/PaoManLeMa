package p146t1;

import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.m */
/* loaded from: classes.dex */
public final class C3219m extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f16000f;

    /* renamed from: g */
    public final /* synthetic */ C3222n[] f16001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3219m(C3222n[] c3222nArr, int i7) {
        super(2);
        this.f16000f = i7;
        this.f16001g = c3222nArr;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f16000f) {
            case 0:
                return Float.valueOf(AbstractC3191c1.m4893d((AbstractC3237u0) obj, true, this.f16001g, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC3191c1.m4893d((AbstractC3237u0) obj, false, this.f16001g, ((Number) obj2).floatValue()));
        }
    }
}
