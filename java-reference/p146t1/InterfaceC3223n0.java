package p146t1;

import java.util.Map;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.n0 */
/* loaded from: classes.dex */
public interface InterfaceC3223n0 extends InterfaceC3228q {
    /* renamed from: I */
    InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2);

    /* renamed from: K */
    default InterfaceC3220m0 mo4941K(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c) {
        return mo4887I(i7, i8, map, null, interfaceC3279c);
    }
}
