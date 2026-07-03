package p177x0;

import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.k */
/* loaded from: classes.dex */
public final class C3803k extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public static final C3803k f17986f = new AbstractC3368k(2);

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC3808p interfaceC3808p = (InterfaceC3808p) obj2;
        if (str.length() == 0) {
            return interfaceC3808p.toString();
        }
        return str + ", " + interfaceC3808p;
    }
}
