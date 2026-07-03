package p128q6;

import java.io.Closeable;
import p006a7.InterfaceC0127j;
import p006a7.InterfaceC0128k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.k */
/* loaded from: classes.dex */
public final class C3008k implements Closeable {

    /* renamed from: e */
    public final InterfaceC0128k f15513e;

    /* renamed from: f */
    public final InterfaceC0127j f15514f;

    /* renamed from: g */
    public final /* synthetic */ C3002e f15515g;

    public C3008k(InterfaceC0128k interfaceC0128k, InterfaceC0127j interfaceC0127j, C3002e c3002e) {
        this.f15515g = c3002e;
        AbstractC3367j.m5100e(interfaceC0128k, "source");
        AbstractC3367j.m5100e(interfaceC0127j, "sink");
        this.f15513e = interfaceC0128k;
        this.f15514f = interfaceC0127j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15515g.m4672a(true, true, null);
    }
}
