package p144t;

import p140s2.EnumC3103m;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.i */
/* loaded from: classes.dex */
public final class C3134i extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: g */
    public static final C3134i f15787g = new C3134i(2, 0);

    /* renamed from: f */
    public final /* synthetic */ int f15788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3134i(int i7, int i8) {
        super(i7);
        this.f15788f = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f15788f) {
            case 0:
                float intValue = ((Number) obj).intValue() / 2.0f;
                float f7 = -1.0f;
                if (((EnumC3103m) obj2) != EnumC3103m.f15703e) {
                    f7 = (-1.0f) * (-1);
                }
                return Integer.valueOf(Math.round((1 + f7) * intValue));
            default:
                float intValue2 = (((Number) obj).intValue() + 0) / 2.0f;
                float f8 = 1.0f;
                if (((EnumC3103m) obj2) != EnumC3103m.f15703e) {
                    f8 = 1.0f * (-1);
                }
                return Integer.valueOf(Math.round((1 + f8) * intValue2));
        }
    }
}
