package p015b6;

import java.util.Iterator;
import p024c6.C0435b;
import p024c6.C0436c;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.r */
/* loaded from: classes.dex */
public final class C0311r implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ C0436c f1106e;

    public C0311r(C0436c c0436c) {
        this.f1106e = c0436c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0435b(this.f1106e);
    }
}
