package p151t6;

import java.io.IOException;
import p092m.AbstractC2487d;
import p121p6.AbstractC2882a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.j */
/* loaded from: classes.dex */
public final class C3296j extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f16167e;

    /* renamed from: f */
    public final /* synthetic */ C3301o f16168f;

    /* renamed from: g */
    public final /* synthetic */ int f16169g;

    /* renamed from: h */
    public final /* synthetic */ int f16170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3296j(String str, C3301o c3301o, int i7, int i8, int i9) {
        super(str, true);
        this.f16167e = i9;
        this.f16168f = c3301o;
        this.f16169g = i7;
        this.f16170h = i8;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        switch (this.f16167e) {
            case 0:
                C3301o c3301o = this.f16168f;
                try {
                    c3301o.f16186B.m5037m(this.f16169g, this.f16170h, true);
                    return -1L;
                } catch (IOException e7) {
                    c3301o.m5006b(2, 2, e7);
                    return -1L;
                }
            case 1:
                C3312z c3312z = this.f16168f.f16199o;
                int i7 = this.f16170h;
                c3312z.getClass();
                AbstractC2487d.m4055s("errorCode", i7);
                synchronized (this.f16168f) {
                    this.f16168f.f16188D.remove(Integer.valueOf(this.f16169g));
                }
                return -1L;
            default:
                C3301o c3301o2 = this.f16168f;
                try {
                    int i8 = this.f16169g;
                    int i9 = this.f16170h;
                    AbstractC2487d.m4055s("statusCode", i9);
                    c3301o2.f16186B.m5038n(i8, i9);
                    return -1L;
                } catch (IOException e8) {
                    c3301o2.m5006b(2, 2, e8);
                    return -1L;
                }
        }
    }
}
