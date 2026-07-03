package p025d;

import p008b.C0236h0;
import p096m3.C2572v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d.b */
/* loaded from: classes.dex */
public final class C0455b {

    /* renamed from: a */
    public final C2572v f1570a;

    /* renamed from: b */
    public final C0236h0 f1571b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0455b(C2572v c2572v, C0236h0 c0236h0) {
        this.f1570a = c2572v;
        this.f1571b = c0236h0;
        if ((c2572v == null ? c0236h0 : c2572v) != null) {
        } else {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
