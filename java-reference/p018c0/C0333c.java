package p018c0;

import p035e1.C0647c0;
import p053g5.C1694m;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0333c extends AbstractC3365h implements InterfaceC3279c {

    /* renamed from: m */
    public final /* synthetic */ C0350t f1146m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333c(C0350t c0350t) {
        super(1, AbstractC3366i.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f1146m = c0350t;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float[] fArr = ((C0647c0) obj).f2130a;
        InterfaceC3238v interfaceC3238v = (InterfaceC3238v) this.f1146m.f1174v.getValue();
        if (interfaceC3238v != null) {
            if (!interfaceC3238v.mo4923M()) {
                interfaceC3238v = null;
            }
            if (interfaceC3238v != null) {
                interfaceC3238v.mo4924N(fArr);
            }
        }
        return C1694m.f10482a;
    }
}
