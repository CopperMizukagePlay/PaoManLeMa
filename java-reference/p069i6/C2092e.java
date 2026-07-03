package p069i6;

import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.e */
/* loaded from: classes.dex */
public final class C2092e extends RuntimeException {

    /* renamed from: e */
    public final transient InterfaceC2318h f12351e;

    public C2092e(InterfaceC2318h interfaceC2318h) {
        this.f12351e = interfaceC2318h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f12351e.toString();
    }
}
