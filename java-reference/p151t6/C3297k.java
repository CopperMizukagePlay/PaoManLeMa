package p151t6;

import java.io.IOException;
import p006a7.C0126i;
import p121p6.AbstractC2882a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.k */
/* loaded from: classes.dex */
public final class C3297k extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ C3301o f16171e;

    /* renamed from: f */
    public final /* synthetic */ int f16172f;

    /* renamed from: g */
    public final /* synthetic */ C0126i f16173g;

    /* renamed from: h */
    public final /* synthetic */ int f16174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3297k(String str, C3301o c3301o, int i7, C0126i c0126i, int i8, boolean z7) {
        super(str, true);
        this.f16171e = c3301o;
        this.f16172f = i7;
        this.f16173g = c0126i;
        this.f16174h = i8;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        try {
            C3312z c3312z = this.f16171e.f16199o;
            C0126i c0126i = this.f16173g;
            int i7 = this.f16174h;
            c3312z.getClass();
            c0126i.skip(i7);
            this.f16171e.f16186B.m5038n(this.f16172f, 9);
            synchronized (this.f16171e) {
                this.f16171e.f16188D.remove(Integer.valueOf(this.f16172f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
