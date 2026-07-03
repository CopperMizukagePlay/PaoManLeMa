package p151t6;

import java.io.IOException;
import p121p6.AbstractC2882a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.n */
/* loaded from: classes.dex */
public final class C3300n extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ C3301o f16181e;

    /* renamed from: f */
    public final /* synthetic */ int f16182f;

    /* renamed from: g */
    public final /* synthetic */ long f16183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3300n(String str, C3301o c3301o, int i7, long j6) {
        super(str, true);
        this.f16181e = c3301o;
        this.f16182f = i7;
        this.f16183g = j6;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        C3301o c3301o = this.f16181e;
        try {
            c3301o.f16186B.m5039o(this.f16182f, this.f16183g);
            return -1L;
        } catch (IOException e7) {
            c3301o.m5006b(2, 2, e7);
            return -1L;
        }
    }
}
