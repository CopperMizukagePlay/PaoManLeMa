package p146t1;

import p150t5.InterfaceC3281e;
import p158u5.AbstractC3365h;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C3183a extends AbstractC3365h implements InterfaceC3281e {

    /* renamed from: m */
    public static final C3183a f15907m = new AbstractC3365h(2, AbstractC3784a.class, "min", "min(II)I", 1);

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
